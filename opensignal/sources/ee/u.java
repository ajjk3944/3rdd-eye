package ee;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f8153a;

    /* renamed from: b, reason: collision with root package name */
    public float f8154b;

    /* renamed from: c, reason: collision with root package name */
    public float f8155c;

    /* renamed from: d, reason: collision with root package name */
    public float f8156d;

    /* renamed from: e, reason: collision with root package name */
    public float f8157e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8158f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Object f8159g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f10) {
        float f11 = this.f8156d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f8154b;
        float f14 = this.f8155c;
        q qVar = new q(f13, f14, f13, f14);
        qVar.f8146f = this.f8156d;
        qVar.f8147g = f12;
        ((ArrayList) this.f8159g).add(new o(qVar));
        this.f8156d = f10;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f8158f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) arrayList.get(i10)).a(matrix, path);
        }
    }

    public void c(float f10, float f11) {
        r rVar = new r();
        rVar.f8148b = f10;
        rVar.f8149c = f11;
        ((ArrayList) this.f8158f).add(rVar);
        p pVar = new p(rVar, this.f8154b, this.f8155c);
        float fB = pVar.b() + 270.0f;
        float fB2 = pVar.b() + 270.0f;
        a(fB);
        ((ArrayList) this.f8159g).add(pVar);
        this.f8156d = fB2;
        this.f8154b = f10;
        this.f8155c = f11;
    }

    public void d(float f10, float f11, float f12) {
        this.f8153a = f10;
        this.f8154b = 0.0f;
        this.f8155c = f10;
        this.f8156d = f11;
        this.f8157e = (f11 + f12) % 360.0f;
        ((ArrayList) this.f8158f).clear();
        ((ArrayList) this.f8159g).clear();
    }
}
