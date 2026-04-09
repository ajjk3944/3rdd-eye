package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4624g {

    /* renamed from: a, reason: collision with root package name */
    public final C4940s5 f40903a;

    /* renamed from: b, reason: collision with root package name */
    public final Ok f40904b;

    /* renamed from: c, reason: collision with root package name */
    public final Sk f40905c;

    /* renamed from: d, reason: collision with root package name */
    public final Nk f40906d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4739kb f40907e;

    /* renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f40908f;

    public AbstractC4624g(C4940s5 c4940s5, Ok ok, Sk sk, Nk nk, InterfaceC4739kb interfaceC4739kb, SystemTimeProvider systemTimeProvider) {
        this.f40903a = c4940s5;
        this.f40904b = ok;
        this.f40905c = sk;
        this.f40906d = nk;
        this.f40907e = interfaceC4739kb;
        this.f40908f = systemTimeProvider;
    }

    public final /* bridge */ Bk a(Object obj) {
        return a((Ck) obj);
    }

    public final Bk b() {
        if (this.f40905c.h()) {
            return new Bk(this.f40903a, this.f40905c, a(), this.f40908f);
        }
        return null;
    }

    public final Bk a(Ck ck) {
        if (this.f40905c.h()) {
            this.f40907e.reportEvent("create session with non-empty storage");
        }
        C4940s5 c4940s5 = this.f40903a;
        Sk sk = this.f40905c;
        long jA = this.f40904b.a();
        Sk sk2 = this.f40905c;
        sk2.a(Sk.f40128f, Long.valueOf(jA));
        sk2.a(Sk.f40126d, Long.valueOf(ck.f39267a));
        sk2.a(Sk.f40130h, Long.valueOf(ck.f39267a));
        sk2.a(Sk.f40129g, 0L);
        sk2.a(Sk.i, Boolean.TRUE);
        sk2.b();
        this.f40903a.f41603e.a(jA, this.f40906d.f39911a, TimeUnit.MILLISECONDS.toSeconds(ck.f39268b));
        return new Bk(c4940s5, sk, a(), new SystemTimeProvider());
    }

    public final Ek a() {
        Dk dk = new Dk(this.f40906d);
        dk.f39313g = this.f40905c.i();
        dk.f39312f = this.f40905c.f40133c.a(Sk.f40129g);
        dk.f39310d = this.f40905c.f40133c.a(Sk.f40130h);
        dk.f39309c = this.f40905c.f40133c.a(Sk.f40128f);
        dk.f39314h = this.f40905c.f40133c.a(Sk.f40126d);
        dk.f39307a = this.f40905c.f40133c.a(Sk.f40127e);
        return new Ek(dk);
    }
}
