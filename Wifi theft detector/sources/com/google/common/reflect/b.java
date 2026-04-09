package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        com.google.common.base.g.m(invocationHandler);
        com.google.common.base.g.i(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
