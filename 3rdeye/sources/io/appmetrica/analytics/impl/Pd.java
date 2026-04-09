package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Pd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final C4565dh f39971a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f39972b;

    /* renamed from: c, reason: collision with root package name */
    public final Yd f39973c;

    public Pd(C4565dh c4565dh, C0 c02, Yd yd) {
        this.f39971a = c4565dh;
        this.f39972b = c02;
        this.f39973c = yd;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) throws UnsupportedEncodingException {
        C4565dh c4565dh = this.f39971a;
        C0 c02 = this.f39972b;
        String str2 = c02.f39215a;
        String str3 = c02.f39216b;
        Integer numValueOf = Integer.valueOf(c02.f39218d);
        C0 c03 = this.f39972b;
        C4758l4 c4758l4 = new C4758l4(str2, str3, numValueOf, c03.f39219e, c03.f39217c);
        Yd yd = this.f39973c;
        EnumC4997ub enumC4997ub = yd.f40419b;
        B0 b02 = yd.f40418a;
        String str4 = b02.f39136c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(b02.f39139f.f39215a);
        Set set = O9.f39923a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        C4681i4 c4681i4 = new C4681i4("", "", enumC4997ub.f41758a, orCreatePublicLogger);
        if (str != null) {
            c4681i4.f(str);
        }
        c4681i4.f41055m = bundle;
        c4681i4.f41046c = yd.f40418a.f39139f.f39220f;
        c4565dh.a(c4758l4, c4681i4, new K4(new Wl(), new J4(), null));
    }
}
