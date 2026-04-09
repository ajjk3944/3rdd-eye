package com.bytedance.sdk.component.emc;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public interface ru {
    <T> T emc(String str, Type type);

    <T> String emc(T t6);
}
