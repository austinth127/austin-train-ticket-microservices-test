package com.cloudhubs.trainticket.user.service;

import com.cloudhubs.trainticket.user.dto.AuthDto;
import com.cloudhubs.trainticket.user.entity.AuthUser;
import com.cloudhubs.trainticket.user.util.Response;
import org.springframework.http.HttpHeaders;

import java.util.List;

/**
 * @author fdse
 */
public interface AuthUserService {

    /**
     * save user
     *
     * @param user user
     * @return user
     */
    AuthUser saveUser(AuthUser user);

    /**
     * get all users
     *
     * @param headers headers
     * @return List<User>
     */
    List<AuthUser> getAllUser(HttpHeaders headers);

    /**
     * create default auth user
     *
     * @param dto dto
     * @return user
     */
    AuthUser createDefaultAuthUser(AuthDto dto);

    /**
     * delete by user id
     *
     * @param userId user id
     * @param headers headers
     * @return Response
     */
    Response deleteByUserId(String userId, HttpHeaders headers);

}
