/*
 * Copyright (C) 2015 wak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.wakhub.monodict.test.util;

import android.app.Activity;
import android.app.Instrumentation;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;

/**
 * Created by wak on 1/16/15.
 */
public class Solo extends com.robotium.solo.Solo {

    public Solo(Instrumentation instrumentation, Activity activity) {
        super(instrumentation, activity);
    }

    public void clickOnView(@IdRes int resId) {
        clickOnView(getCurrentActivity().findViewById(resId));
    }

    public void clickOnRecyclerChildView(@IdRes int recyclerViewId, int index) {
        RecyclerView recyclerView = (RecyclerView) getView(recyclerViewId);
        clickOnView(recyclerView.getChildAt(index));
    }
}
