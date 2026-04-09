package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rt0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15755a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f15756b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f15757c;

    /* renamed from: d, reason: collision with root package name */
    public final nr0 f15758d;

    /* renamed from: e, reason: collision with root package name */
    public final ClientApi f15759e = new ClientApi();

    /* renamed from: f, reason: collision with root package name */
    public final pq0 f15760f;
    public final tb.a g;

    /* renamed from: h, reason: collision with root package name */
    public final et0 f15761h;

    public rt0(Context context, za.a aVar, ScheduledExecutorService scheduledExecutorService, nr0 nr0Var, pq0 pq0Var, tb.a aVar2, et0 et0Var) {
        this.f15755a = context;
        this.f15756b = aVar;
        this.f15757c = scheduledExecutorService;
        this.f15758d = nr0Var;
        this.g = aVar2;
        this.f15760f = pq0Var;
        this.f15761h = et0Var;
    }

    public final it0 a(va.t2 t2Var, va.p0 p0Var) {
        pa.b bVarA = pa.b.a(t2Var.f36171b);
        if (bVarA == null) {
            return null;
        }
        int iOrdinal = bVarA.ordinal();
        Context context = this.f15755a;
        za.a aVar = this.f15756b;
        if (iOrdinal == 1) {
            return new it0(this.f15759e, context, aVar.f38131c, this.f15760f, t2Var, p0Var, this.f15757c, this.f15758d, c(), this.g, 1);
        }
        if (iOrdinal == 2) {
            return new it0(this.f15759e, context, aVar.f38131c, this.f15760f, t2Var, p0Var, this.f15757c, this.f15758d, c(), this.g, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new it0(this.f15759e, context, aVar.f38131c, this.f15760f, t2Var, p0Var, this.f15757c, this.f15758d, c(), this.g, 0);
    }

    public final it0 b(String str, va.t2 t2Var, va.q0 q0Var) {
        pa.b bVarA = pa.b.a(t2Var.f36171b);
        if (bVarA == null) {
            return null;
        }
        int iOrdinal = bVarA.ordinal();
        Context context = this.f15755a;
        za.a aVar = this.f15756b;
        if (iOrdinal == 1) {
            return new it0(str, this.f15759e, context, aVar.f38131c, this.f15760f, t2Var, q0Var, this.f15757c, this.f15758d, c(), this.g, this.f15761h, 1);
        }
        if (iOrdinal == 2) {
            return new it0(str, this.f15759e, context, aVar.f38131c, this.f15760f, t2Var, q0Var, this.f15757c, this.f15758d, c(), this.g, this.f15761h, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new it0(str, this.f15759e, context, aVar.f38131c, this.f15760f, t2Var, q0Var, this.f15757c, this.f15758d, c(), this.g, this.f15761h, 0);
    }

    public final jt0 c() {
        pk pkVar = sk.G;
        va.s sVar = va.s.f36163e;
        return new jt0(((Long) sVar.f36166c.a(pkVar)).longValue(), ((Long) sVar.f36166c.a(sk.H)).longValue(), this.g);
    }
}
