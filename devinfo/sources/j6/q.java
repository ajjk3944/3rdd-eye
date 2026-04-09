package j6;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x.e f27447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f27448b;

    public q(r rVar, x.e eVar) {
        this.f27448b = rVar;
        this.f27447a = eVar;
    }

    @Override // j6.p, j6.m
    public final void d(o oVar) {
        ((ArrayList) this.f27447a.get(this.f27448b.f27450b)).remove(oVar);
        oVar.z(this);
    }
}
