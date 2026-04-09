package t8;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import r8.z;
import z8.w;

/* loaded from: classes.dex */
public final class f implements n, u8.a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f22558b;

    /* renamed from: c, reason: collision with root package name */
    public final r8.v f22559c;

    /* renamed from: d, reason: collision with root package name */
    public final u8.i f22560d;

    /* renamed from: e, reason: collision with root package name */
    public final u8.d f22561e;

    /* renamed from: f, reason: collision with root package name */
    public final z8.a f22562f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22564h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f22557a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final fh.f f22563g = new fh.f(3);

    public f(r8.v vVar, a9.b bVar, z8.a aVar) {
        this.f22558b = aVar.f26709a;
        this.f22559c = vVar;
        u8.d dVarE0 = aVar.f26711c.E0();
        this.f22560d = (u8.i) dVarE0;
        u8.d dVarE02 = aVar.f26710b.E0();
        this.f22561e = dVarE02;
        this.f22562f = aVar;
        bVar.e(dVarE0);
        bVar.e(dVarE02);
        dVarE0.a(this);
        dVarE02.a(this);
    }

    @Override // u8.a
    public final void a() {
        this.f22564h = false;
        this.f22559c.invalidateSelf();
    }

    @Override // t8.c
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f22661c == w.SIMULTANEOUSLY) {
                    this.f22563g.f8871a.add(vVar);
                    vVar.c(this);
                }
            }
            i10++;
        }
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
    }

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        if (obj == z.f21406f) {
            this.f22560d.k(eVar);
        } else if (obj == z.f21409i) {
            this.f22561e.k(eVar);
        }
    }

    @Override // t8.n
    public final Path g() {
        boolean z10 = this.f22564h;
        Path path = this.f22557a;
        if (z10) {
            return path;
        }
        path.reset();
        z8.a aVar = this.f22562f;
        if (aVar.f26713e) {
            this.f22564h = true;
            return path;
        }
        PointF pointF = (PointF) this.f22560d.f();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (aVar.f26712d) {
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
        PointF pointF2 = (PointF) this.f22561e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f22563g.e(path);
        this.f22564h = true;
        return path;
    }

    @Override // t8.c
    public final String getName() {
        return this.f22558b;
    }
}
