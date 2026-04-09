package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s41 extends t41 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public s41() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // defpackage.t41
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((t41) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.t41
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((t41) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s41(s41 s41Var, s8 s8Var) {
        q41 q41Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = s41Var.c;
        this.d = s41Var.d;
        this.e = s41Var.e;
        this.f = s41Var.f;
        this.g = s41Var.g;
        this.h = s41Var.h;
        this.i = s41Var.i;
        String str = s41Var.k;
        this.k = str;
        if (str != null) {
            s8Var.put(str, this);
        }
        matrix.set(s41Var.j);
        ArrayList arrayList = s41Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof s41) {
                this.b.add(new s41((s41) obj, s8Var));
            } else {
                if (obj instanceof r41) {
                    r41 r41Var = (r41) obj;
                    r41 r41Var2 = new r41(r41Var);
                    r41Var2.e = 0.0f;
                    r41Var2.g = 1.0f;
                    r41Var2.h = 1.0f;
                    r41Var2.i = 0.0f;
                    r41Var2.j = 1.0f;
                    r41Var2.k = 0.0f;
                    r41Var2.l = Paint.Cap.BUTT;
                    r41Var2.m = Paint.Join.MITER;
                    r41Var2.n = 4.0f;
                    r41Var2.d = r41Var.d;
                    r41Var2.e = r41Var.e;
                    r41Var2.g = r41Var.g;
                    r41Var2.f = r41Var.f;
                    r41Var2.c = r41Var.c;
                    r41Var2.h = r41Var.h;
                    r41Var2.i = r41Var.i;
                    r41Var2.j = r41Var.j;
                    r41Var2.k = r41Var.k;
                    r41Var2.l = r41Var.l;
                    r41Var2.m = r41Var.m;
                    r41Var2.n = r41Var.n;
                    q41Var = r41Var2;
                } else if (obj instanceof q41) {
                    q41Var = new q41((q41) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(q41Var);
                Object obj2 = q41Var.b;
                if (obj2 != null) {
                    s8Var.put(obj2, q41Var);
                }
            }
        }
    }
}
