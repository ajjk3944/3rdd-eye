package m7;

import android.graphics.Path;
import f7.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f28884a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f28885b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.a f28886c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.a f28887d;

    /* renamed from: e, reason: collision with root package name */
    public final l7.a f28888e;

    /* renamed from: f, reason: collision with root package name */
    public final l7.a f28889f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28890h;

    public d(String str, int i4, Path.FillType fillType, l7.a aVar, l7.a aVar2, l7.a aVar3, l7.a aVar4, boolean z3) {
        this.f28884a = i4;
        this.f28885b = fillType;
        this.f28886c = aVar;
        this.f28887d = aVar2;
        this.f28888e = aVar3;
        this.f28889f = aVar4;
        this.g = str;
        this.f28890h = z3;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        return new h7.i(xVar, jVar, aVar, this);
    }
}
