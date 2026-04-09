package m7;

import f7.x;
import h7.t;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f28940a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.b f28941b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28942c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.a f28943d;

    /* renamed from: e, reason: collision with root package name */
    public final l7.a f28944e;

    /* renamed from: f, reason: collision with root package name */
    public final l7.b f28945f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28946h;

    /* renamed from: i, reason: collision with root package name */
    public final float f28947i;
    public final boolean j;

    public o(String str, l7.b bVar, ArrayList arrayList, l7.a aVar, l7.a aVar2, l7.b bVar2, int i4, int i10, float f10, boolean z3) {
        this.f28940a = str;
        this.f28941b = bVar;
        this.f28942c = arrayList;
        this.f28943d = aVar;
        this.f28944e = aVar2;
        this.f28945f = bVar2;
        this.g = i4;
        this.f28946h = i10;
        this.f28947i = f10;
        this.j = z3;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        return new t(xVar, aVar, this);
    }
}
