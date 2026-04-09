package n1;

import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.play_billing.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f29556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f29557c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g3.f f29559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(s sVar, s sVar2, Object obj, int i4, g3.f fVar, int i10) {
        super(1);
        this.f29555a = i10;
        this.f29556b = sVar;
        this.f29557c = sVar2;
        this.f29560f = obj;
        this.f29558d = i4;
        this.f29559e = fVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f29555a) {
            case 0:
                g2.e eVar = (g2.e) obj;
                s sVar = this.f29557c;
                if (this.f29556b != ((xz) ((j2.r) i2.k.t(sVar)).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zT = d5.t(sVar, (s) this.f29560f, this.f29558d, this.f29559e);
                Boolean boolValueOf = Boolean.valueOf(zT);
                if (zT || !eVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                g2.e eVar2 = (g2.e) obj;
                s sVar2 = this.f29557c;
                if (this.f29556b != ((xz) ((j2.r) i2.k.t(sVar2)).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zB = m1.B(this.f29558d, this.f29559e, sVar2, (o1.c) this.f29560f);
                Boolean boolValueOf2 = Boolean.valueOf(zB);
                if (zB || !eVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
