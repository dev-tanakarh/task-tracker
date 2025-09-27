package com.devtanaka.tasks.mappers;

import com.devtanaka.tasks.domain.dto.TaskDto;
import com.devtanaka.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);

}
