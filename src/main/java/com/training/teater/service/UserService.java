package com.training.teater.service;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.training.teater.domain.User;



/**
 * @author Yuriy_Tkach
 */
public interface UserService extends AbstractDomainObjectService<User> {

    /**
     * Finding user by email
     * 
     * @param email
     *            Email of the user
     * @return found user or <code>null</code>
     */
    public @Nullable User getUserByEmail(@Nonnull String email);

}
