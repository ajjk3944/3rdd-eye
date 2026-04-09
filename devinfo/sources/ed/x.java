package ed;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public float f23381a;

    /* renamed from: b, reason: collision with root package name */
    public float f23382b;

    /* renamed from: c, reason: collision with root package name */
    public float f23383c;

    /* renamed from: d, reason: collision with root package name */
    public float f23384d;

    /* renamed from: e, reason: collision with root package name */
    public float f23385e;

    /* renamed from: f, reason: collision with root package name */
    public float f23386f;
    public final ArrayList g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23387h = new ArrayList();

    public x() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f23385e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f23383c;
        float f14 = this.f23384d;
        t tVar = new t(f13, f14, f13, f14);
        tVar.f23375f = this.f23385e;
        tVar.g = f12;
        this.f23387h.add(new r(tVar));
        this.f23385e = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((v) arrayList.get(i4)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        u uVar = new u();
        uVar.f23376b = f10;
        uVar.f23377c = f11;
        this.g.add(uVar);
        s sVar = new s(uVar, this.f23383c, this.f23384d);
        float fB = sVar.b() + 270.0f;
        float fB2 = sVar.b() + 270.0f;
        a(fB);
        this.f23387h.add(sVar);
        this.f23385e = fB2;
        this.f23383c = f10;
        this.f23384d = f11;
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f23381a = f10;
        this.f23382b = f11;
        this.f23383c = f10;
        this.f23384d = f11;
        this.f23385e = f12;
        this.f23386f = (f12 + f13) % 360.0f;
        this.g.clear();
        this.f23387h.clear();
    }
}
