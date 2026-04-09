package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import m4.AbstractC6769h;

/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4506z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f35543a = new C4498y0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC4442r0 abstractC4442r0) {
        SharedPreferencesC4466u0 sharedPreferencesC4466u0 = AbstractC4379j0.a().d(str, abstractC4442r0, EnumC4427p0.SHARED_PREFS_TYPE).equals("") ? new SharedPreferencesC4466u0() : null;
        if (sharedPreferencesC4466u0 != null) {
            return sharedPreferencesC4466u0;
        }
        ThreadLocal threadLocal = f35543a;
        AbstractC6769h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th2) {
            f35543a.set(Boolean.TRUE);
            throw th2;
        }
    }
}
