package jj;

import java.util.LinkedList;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements wi.a {

    /* renamed from: a, reason: collision with root package name */
    public int f27685a;

    /* renamed from: b, reason: collision with root package name */
    public long f27686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f27687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xk.h f27689e;

    public b(c cVar, int i4, xk.h hVar) {
        this.f27687c = cVar;
        this.f27688d = i4;
        this.f27689e = hVar;
    }

    @Override // wi.a
    public final void a(LinkedList linkedList, LinkedList linkedList2) {
        this.f27687c.f27690a.h(null);
        xk.h hVar = this.f27689e;
        if (hVar.w()) {
            hVar.resumeWith(new yj.i(linkedList, linkedList2));
        }
    }

    @Override // wi.a
    public final void d(String str) {
        k.e(str, "file");
        this.f27685a++;
        if (System.currentTimeMillis() - this.f27686b < 100) {
            return;
        }
        this.f27686b = System.currentTimeMillis();
        this.f27687c.f27690a.h(new yj.i(Integer.valueOf(this.f27685a), Integer.valueOf(this.f27688d)));
    }
}
