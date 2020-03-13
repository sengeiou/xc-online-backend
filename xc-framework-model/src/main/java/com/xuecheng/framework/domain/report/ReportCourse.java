package com.xuecheng.framework.domain.report;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by BinXU on 2020/01/22.
 */
@Data
@ToString
@Document(collection = "report_course")
public class ReportCourse {

    @Id
    private String id;
    private Float evaluation_score;//评价分数
    private Long collect_num;//收藏次数
    private Long play_num;//播放次数
    private Long student_num;//学生人数
    private Long timelength;//课程时长

}
