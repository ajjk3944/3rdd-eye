package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4507bb extends Wa, InterfaceC4483ad {
    void a(Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    /* synthetic */ void a(Location location);

    void a(AnrListener anrListener);

    void a(ExternalAttribution externalAttribution);

    void a(Ao ao);

    void a(EnumC4779m enumC4779m);

    @Override // io.appmetrica.analytics.impl.Wa
    /* synthetic */ void a(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    /* synthetic */ void a(String str, String str2);

    void a(String str, boolean z10);

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    /* synthetic */ void a(boolean z10);

    void b(Activity activity);

    void b(String str);

    @Override // io.appmetrica.analytics.impl.Wa
    /* synthetic */ void b(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    /* synthetic */ void b(boolean z10);

    @Override // io.appmetrica.analytics.impl.Wa
    /* synthetic */ boolean b();

    void c();

    List<String> f();
}
