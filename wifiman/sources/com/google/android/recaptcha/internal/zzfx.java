package com.google.android.recaptcha.internal;

import Yg.J;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class zzfx implements InvocationHandler {
    private final Object zza;

    public zzfx(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (AbstractC6492s.d(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (AbstractC6492s.d(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (AbstractC6492s.d(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
        if (!zza(obj, method, objArr)) {
            return J.f24997a;
        }
        if ((this.zza == null && AbstractC6492s.d(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && AbstractC6492s.d(zzkm.zza(obj2.getClass()), zzkm.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? J.f24997a : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
