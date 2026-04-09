package i0;

import g2.i0;
import j0.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final x.u f25442a;

    /* renamed from: b, reason: collision with root package name */
    public final j f25443b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f25444c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f25446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25447f;
    public final /* synthetic */ int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i1.c f25448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25449i;
    public final /* synthetic */ int j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f25450k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f25451l;

    public m(long j, j jVar, f0 f0Var, int i4, int i10, i1.c cVar, int i11, int i12, long j8, u uVar) {
        this.f25446e = f0Var;
        this.f25447f = i4;
        this.g = i10;
        this.f25448h = cVar;
        this.f25449i = i11;
        this.j = i12;
        this.f25450k = j8;
        this.f25451l = uVar;
        x.u uVar2 = x.k.f36911a;
        this.f25442a = new x.u();
        this.f25443b = jVar;
        this.f25444c = f0Var;
        this.f25445d = d3.b.b(d3.a.h(j), Integer.MAX_VALUE, 5);
    }

    public final q a(int i4, long j) {
        long j8;
        j jVar = this.f25443b;
        Object objD = jVar.d(i4);
        jVar.b(i4);
        x.u uVar = this.f25442a;
        List list = (List) uVar.b(i4);
        if (list != null) {
            j8 = j;
        } else {
            f0 f0Var = this.f25444c;
            j jVar2 = f0Var.f26894c;
            x.u uVar2 = f0Var.f26895d;
            List listX = (List) uVar2.b(i4);
            if (listX == null) {
                Object objD2 = jVar2.d(i4);
                jVar2.b(i4);
                listX = f0Var.f26893b.X(objD2, f0Var.f26892a.a(i4, objD2, null));
                uVar2.h(i4, listX);
            }
            int size = listX.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((i0) listX.get(i10)).v(j));
            }
            j8 = j;
            uVar.h(i4, arrayList);
            list = arrayList;
        }
        return new q(i4, list, this.f25448h, this.f25446e.f26893b.getLayoutDirection(), this.f25449i, this.j, i4 != this.f25447f + (-1) ? this.g : 0, this.f25450k, objD, null, this.f25451l.f25519n, j8);
    }
}
