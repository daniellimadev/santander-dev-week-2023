package com.study.daniel.santanderdevweek2023.service;

import com.study.daniel.santanderdevweek2023.domain.model.User;

public interface UserService extends CrudService<Long, User> {
    Object update(Long id, User model);
}
