package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.hD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1252hD implements PrivilegedExceptionAction {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C1252hD f14464a = new C1252hD();

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Unsafe unsafe = C1088eD.f13876b;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
