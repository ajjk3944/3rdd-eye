package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4616fh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40860a;

    /* renamed from: b, reason: collision with root package name */
    public final Xk f40861b;

    /* renamed from: c, reason: collision with root package name */
    public final Gb f40862c = new Gb();

    /* renamed from: d, reason: collision with root package name */
    public final K4 f40863d = new K4(new Wl(), new J4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f40864e;

    public C4616fh(Context context, final InterfaceC5042w6 interfaceC5042w6, final EnumC4997ub enumC4997ub, Xk xk) {
        this.f40860a = context;
        this.f40861b = xk;
        this.f40864e = new Consumer() { // from class: io.appmetrica.analytics.impl.Ro
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C4616fh.a(enumC4997ub, interfaceC5042w6, this, (Cb) obj);
            }
        };
    }

    public static final void a(EnumC4997ub enumC4997ub, InterfaceC5042w6 interfaceC5042w6, C4616fh c4616fh, Cb cb) {
        String str = cb.f39252h;
        C4758l4 c4758l4 = new C4758l4(str, cb.f39249e, cb.f39250f, cb.f39251g, cb.i);
        String str2 = cb.f39246b;
        byte[] bArr = cb.f39245a;
        int i = cb.f39247c;
        HashMap map = cb.f39248d;
        String str3 = cb.f39253j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = O9.f39923a;
        C4681i4 c4681i4 = new C4681i4(bArr, str2, enumC4997ub.f41758a, orCreatePublicLogger);
        c4681i4.f41035q = map;
        c4681i4.f41050g = i;
        c4681i4.f41046c = str3;
        ((C4565dh) interfaceC5042w6).a(c4758l4, c4681i4, c4616fh.f40863d);
    }
}
