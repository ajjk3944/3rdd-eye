package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Ii implements InterfaceC4696ik {

    /* renamed from: e, reason: collision with root package name */
    public static final Hi f39642e = new Hi();

    /* renamed from: f, reason: collision with root package name */
    public static final long f39643f = TimeUnit.SECONDS.toMillis(4);

    /* renamed from: a, reason: collision with root package name */
    public final C4780m0 f39644a;

    /* renamed from: b, reason: collision with root package name */
    public final C4619fk f39645b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f39646c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f39647d;

    public Ii(C4780m0 c4780m0, C4619fk c4619fk, TimeProvider timeProvider) {
        this.f39644a = c4780m0;
        this.f39645b = c4619fk;
        this.f39646c = timeProvider;
        this.f39647d = C5065x4.l().g().b();
    }

    public final void a(Gh gh) {
        Ih c4487ah;
        ICommonExecutor iCommonExecutor = this.f39647d;
        if (gh.f39534b) {
            C4619fk c4619fk = this.f39645b;
            c4487ah = new C5017v6(c4619fk.f40867a, c4619fk.f40868b, c4619fk.f40869c, gh);
        } else {
            C4619fk c4619fk2 = this.f39645b;
            c4487ah = new C4487ah(c4619fk2.f40868b, c4619fk2.f40869c, gh);
        }
        iCommonExecutor.submit(c4487ah);
    }

    public final void b(Gh gh) {
        long jUptimeMillis = this.f39646c.uptimeMillis();
        C4619fk c4619fk = this.f39645b;
        C5017v6 c5017v6 = new C5017v6(c4619fk.f40867a, c4619fk.f40868b, c4619fk.f40869c, gh);
        if (this.f39644a.a()) {
            try {
                this.f39647d.submit(c5017v6).get(f39643f, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!c5017v6.f39641c) {
            try {
                c5017v6.a();
            } catch (Throwable unused2) {
            }
        }
        try {
            Thread.sleep(Math.max(0L, f39643f - (this.f39646c.uptimeMillis() - jUptimeMillis)));
        } catch (Throwable unused3) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4696ik
    public final void reportData(int i, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f39647d;
        C4619fk c4619fk = this.f39645b;
        iCommonExecutor.submit(new Hn(c4619fk.f40868b, c4619fk.f40869c, i, bundle));
    }

    public Ii(C4780m0 c4780m0, C4619fk c4619fk) {
        this(c4780m0, c4619fk, new SystemTimeProvider());
    }

    public final void a(Nf nf) {
        ICommonExecutor iCommonExecutor = this.f39647d;
        C4619fk c4619fk = this.f39645b;
        iCommonExecutor.submit(new De(c4619fk.f40868b, c4619fk.f40869c, nf));
    }

    public final void b(Nf nf) {
        ICommonExecutor iCommonExecutor = this.f39647d;
        C4619fk c4619fk = this.f39645b;
        iCommonExecutor.submit(new Oi(c4619fk.f40868b, c4619fk.f40869c, nf));
    }
}
