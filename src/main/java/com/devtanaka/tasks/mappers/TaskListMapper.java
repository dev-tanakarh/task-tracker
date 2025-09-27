package com.devtanaka.tasks.mappers;

import com.devtanaka.tasks.domain.dto.TaskListDto;
import com.devtanaka.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
