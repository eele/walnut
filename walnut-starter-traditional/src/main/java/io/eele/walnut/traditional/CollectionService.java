package io.eele.walnut.traditional;

import io.eele.walnut.traditional.dto.CollectInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("walnut")
public class CollectionService {

    private final CollectionRepository collectionRepository;

    @RequestMapping("co/{content}")
    public String collect(@PathVariable String content) {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setContent(content);
        collectInfo.setCreateTime(LocalDateTime.now());
        collectionRepository.save(collectInfo);
        return "";
    }

    @RequestMapping("fetchAll")
    public String fetchAll() {
        return collectionRepository.findAll().stream()
                .map(o -> o.getCreateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "  " + o.getContent())
                .collect(Collectors.joining("\n")) + "\n";
    }

}
