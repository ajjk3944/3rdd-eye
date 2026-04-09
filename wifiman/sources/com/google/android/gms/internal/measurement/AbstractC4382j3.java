package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4382j3 {
    public static Object a(InterfaceC4406m3 interfaceC4406m3) {
        try {
            return interfaceC4406m3.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC4406m3.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
