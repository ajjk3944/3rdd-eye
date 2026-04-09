package com.google.common.collect;

/* loaded from: classes3.dex */
public abstract class B {
    static boolean a(A a10, Object obj) {
        if (obj == a10) {
            return true;
        }
        if (obj instanceof A) {
            return a10.a().equals(((A) obj).a());
        }
        return false;
    }
}
