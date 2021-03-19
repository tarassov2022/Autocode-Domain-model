/*
 * Copyright © 2020 EPAM Systems, Inc. All Rights Reserved. All information contained herein is, and remains the
 * property of EPAM Systems, Inc. and/or its suppliers and is protected by international intellectual
 * property law. Dissemination of this information or reproduction of this material is strictly forbidden,
 * unless prior written permission is obtained from EPAM Systems, Inc
 */

package util;

import candies.Candy;

import java.util.List;

/**
 * Please, see readme.md file! All detailed instructions are laid there.
 * <p>
 * Created by sergei_tsarik on 12/21/20.
 */
public interface Sorting {

    /**
     * No actions are required within the interface
     */
    List<Candy> sortCandiesByNameAsc();
    List<Candy> sortCandiesByWeightAsc();
}
