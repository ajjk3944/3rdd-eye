package G3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public float f1665a;

    /* renamed from: b, reason: collision with root package name */
    public float f1666b;

    /* renamed from: c, reason: collision with root package name */
    public float f1667c;

    /* renamed from: d, reason: collision with root package name */
    public float f1668d;

    /* renamed from: e, reason: collision with root package name */
    public float f1669e;

    /* renamed from: f, reason: collision with root package name */
    public float f1670f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1671g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1672h = new ArrayList();

    public y() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f5 = this.f1669e;
        if (f5 == f2) {
            return;
        }
        float f6 = ((f2 - f5) + 360.0f) % 360.0f;
        if (f6 > 180.0f) {
            return;
        }
        float f7 = this.f1667c;
        float f8 = this.f1668d;
        u uVar = new u(f7, f8, f7, f8);
        uVar.f1658f = this.f1669e;
        uVar.f1659g = f6;
        this.f1672h.add(new s(uVar));
        this.f1669e = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1671g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f2, float f5) {
        v vVar = new v();
        vVar.f1660b = f2;
        vVar.f1661c = f5;
        this.f1671g.add(vVar);
        t tVar = new t(vVar, this.f1667c, this.f1668d);
        float fB = tVar.b() + 270.0f;
        float fB2 = tVar.b() + 270.0f;
        a(fB);
        this.f1672h.add(tVar);
        this.f1669e = fB2;
        this.f1667c = f2;
        this.f1668d = f5;
    }

    public final void d(float f2, float f5, float f6, float f7) {
        this.f1665a = f2;
        this.f1666b = f5;
        this.f1667c = f2;
        this.f1668d = f5;
        this.f1669e = f6;
        this.f1670f = (f6 + f7) % 360.0f;
        this.f1671g.clear();
        this.f1672h.clear();
    }
}
