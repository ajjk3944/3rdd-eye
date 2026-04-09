package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k90 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public Object f = new ArrayList();
    public Object g = new ArrayList();

    public k90() {
        e(0.0f, 270.0f, 0.0f);
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6) {
        hv0 hv0Var = new hv0(f, f2, f3, f4);
        hv0Var.f = f5;
        hv0Var.g = f6;
        ((ArrayList) this.f).add(hv0Var);
        fv0 fv0Var = new fv0(hv0Var);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        b(f5);
        ((ArrayList) this.g).add(fv0Var);
        this.d = f8;
        double d = f7;
        this.b = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.c = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public void b(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        hv0 hv0Var = new hv0(f4, f5, f4, f5);
        hv0Var.f = this.d;
        hv0Var.g = f3;
        ((ArrayList) this.g).add(new fv0(hv0Var));
        this.d = f;
    }

    public void c(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((jv0) arrayList.get(i)).a(matrix, path);
        }
    }

    public void d(float f, float f2) {
        iv0 iv0Var = new iv0();
        iv0Var.b = f;
        iv0Var.c = f2;
        ((ArrayList) this.f).add(iv0Var);
        gv0 gv0Var = new gv0(iv0Var, this.b, this.c);
        float fB = gv0Var.b() + 270.0f;
        float fB2 = gv0Var.b() + 270.0f;
        b(fB);
        ((ArrayList) this.g).add(gv0Var);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public void e(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        ((ArrayList) this.f).clear();
        ((ArrayList) this.g).clear();
    }
}
