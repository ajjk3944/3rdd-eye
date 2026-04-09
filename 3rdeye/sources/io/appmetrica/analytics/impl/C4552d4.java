package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4552d4 {

    /* renamed from: a, reason: collision with root package name */
    public final Nf f40683a;

    /* renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f40684b;

    public C4552d4(Nf nf, CounterConfiguration counterConfiguration) {
        this.f40683a = nf;
        this.f40684b = counterConfiguration;
    }

    public static C4552d4 a(Context context, Bundle bundle) {
        Nf nf;
        String str = Nf.f39901c;
        if (bundle != null) {
            try {
                nf = (Nf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        } else {
            nf = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || nf == null || !context.getPackageName().equals(nf.f39902a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || nf.f39902a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new C4552d4(nf, counterConfigurationFromBundle);
    }

    public final CounterConfiguration b() {
        return this.f40684b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f40683a + ", mCounterConfiguration=" + this.f40684b + '}';
    }

    public final Nf a() {
        return this.f40683a;
    }
}
