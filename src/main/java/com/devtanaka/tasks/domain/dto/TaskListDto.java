package com.devtanaka.tasks.domain.dto;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Integer count, //# of tasks in our task list
        Double progress, //How many tasks in tasklist have been completed
        List<TaskDto> tasks
) {
}
