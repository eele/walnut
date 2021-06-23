package io.eele.walnut.traditional.dto;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="t_info")
public class CollectInfo {

    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long id;
    @Column(name = "t_content")
    private String content;
    @Column(name = "t_create_time")
    private LocalDateTime createTime;

}
