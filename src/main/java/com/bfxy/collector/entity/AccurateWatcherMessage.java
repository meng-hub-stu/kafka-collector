package com.bfxy.collector.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author Mengdexin
 * @date 2022 -05 -22 -21:55
 */
@Data
@AllArgsConstructor
public class AccurateWatcherMessage {
    private String title;
    private String executionTime;
    private String applicationName;
    private String level;
    private String body;
}
