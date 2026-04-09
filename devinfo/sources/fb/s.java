package fb;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.es1;
import com.google.android.gms.internal.ads.fs1;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final a10 f23969a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f23970b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f23971c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f23972d;

    /* renamed from: e, reason: collision with root package name */
    public final es1 f23973e;

    public s(a10 a10Var, es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4) {
        this.f23969a = a10Var;
        this.f23970b = es1Var;
        this.f23971c = es1Var2;
        this.f23972d = es1Var3;
        this.f23973e = es1Var4;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        return new k(this.f23969a.b(), ((Long) this.f23970b.a()).longValue(), (PackageInfo) this.f23971c.a(), (t) this.f23972d.a(), (ScheduledExecutorService) this.f23973e.a());
    }
}
