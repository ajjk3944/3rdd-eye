package h7;

import android.graphics.Path;
import android.graphics.PointF;
import f7.b0;
import f7.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements n, i7.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f24914b;

    /* renamed from: c, reason: collision with root package name */
    public final x f24915c;

    /* renamed from: d, reason: collision with root package name */
    public final i7.j f24916d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.e f24917e;

    /* renamed from: f, reason: collision with root package name */
    public final m7.a f24918f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24919h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24913a = new Path();
    public final c g = new c(0);

    public g(x xVar, n7.a aVar, m7.a aVar2) {
        this.f24914b = aVar2.f28877a;
        this.f24915c = xVar;
        i7.e eVarG = aVar2.f28879c.g();
        this.f24916d = (i7.j) eVarG;
        i7.e eVarG2 = aVar2.f28878b.g();
        this.f24917e = eVarG2;
        this.f24918f = aVar2;
        aVar.e(eVarG);
        aVar.e(eVarG2);
        eVarG.a(this);
        eVarG2.a(this);
    }

    @Override // i7.a
    public final void a() {
        this.f24919h = false;
        this.f24915c.invalidateSelf();
    }

    @Override // h7.n
    public final Path b() {
        boolean z3 = this.f24919h;
        Path path = this.f24913a;
        if (z3) {
            return path;
        }
        path.reset();
        m7.a aVar = this.f24918f;
        if (aVar.f28881e) {
            this.f24919h = true;
            return path;
        }
        PointF pointF = (PointF) this.f24916d.e();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f28880d) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f24917e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.f24919h = true;
        return path;
    }

    @Override // h7.d
    public final void c(List list, List list2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i4 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.f25012c == 1) {
                    this.g.f24902a.add(uVar);
                    uVar.e(this);
                }
            }
            i4++;
        }
    }

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        if (obj == b0.f23697f) {
            this.f24916d.j(oVar);
        } else if (obj == b0.f23699i) {
            this.f24917e.j(oVar);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
    }

    @Override // h7.d
    public final String getName() {
        return this.f24914b;
    }
}
