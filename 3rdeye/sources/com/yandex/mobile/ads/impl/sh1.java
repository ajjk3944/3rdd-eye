package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class sh1 extends Exception implements em {

    /* renamed from: b, reason: collision with root package name */
    public final int f33070b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33071c;

    public sh1(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, sh1.class.getClassLoader());
            Throwable th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th == null ? new RemoteException(string2) : th;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    public sh1(String str, Throwable th, int i, long j4) {
        super(str, th);
        this.f33070b = i;
        this.f33071c = j4;
    }

    public static String a(int i) {
        return Integer.toString(i, 36);
    }
}
