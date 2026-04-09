package M0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import u.C2936e;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f2655a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2656b;

    /* renamed from: c, reason: collision with root package name */
    public float f2657c;

    /* renamed from: d, reason: collision with root package name */
    public float f2658d;

    /* renamed from: e, reason: collision with root package name */
    public float f2659e;

    /* renamed from: f, reason: collision with root package name */
    public float f2660f;

    /* renamed from: g, reason: collision with root package name */
    public float f2661g;

    /* renamed from: h, reason: collision with root package name */
    public float f2662h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f2663j;

    /* renamed from: k, reason: collision with root package name */
    public String f2664k;

    public l() {
        this.f2655a = new Matrix();
        this.f2656b = new ArrayList();
        this.f2657c = 0.0f;
        this.f2658d = 0.0f;
        this.f2659e = 0.0f;
        this.f2660f = 1.0f;
        this.f2661g = 1.0f;
        this.f2662h = 0.0f;
        this.i = 0.0f;
        this.f2663j = new Matrix();
        this.f2664k = null;
    }

    @Override // M0.m
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2656b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((m) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // M0.m
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f2656b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((m) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f2663j;
        matrix.reset();
        matrix.postTranslate(-this.f2658d, -this.f2659e);
        matrix.postScale(this.f2660f, this.f2661g);
        matrix.postRotate(this.f2657c, 0.0f, 0.0f);
        matrix.postTranslate(this.f2662h + this.f2658d, this.i + this.f2659e);
    }

    public String getGroupName() {
        return this.f2664k;
    }

    public Matrix getLocalMatrix() {
        return this.f2663j;
    }

    public float getPivotX() {
        return this.f2658d;
    }

    public float getPivotY() {
        return this.f2659e;
    }

    public float getRotation() {
        return this.f2657c;
    }

    public float getScaleX() {
        return this.f2660f;
    }

    public float getScaleY() {
        return this.f2661g;
    }

    public float getTranslateX() {
        return this.f2662h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f2658d) {
            this.f2658d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f2659e) {
            this.f2659e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f2657c) {
            this.f2657c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f2660f) {
            this.f2660f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f2661g) {
            this.f2661g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f2662h) {
            this.f2662h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(l lVar, C2936e c2936e) {
        j jVar;
        this.f2655a = new Matrix();
        this.f2656b = new ArrayList();
        this.f2657c = 0.0f;
        this.f2658d = 0.0f;
        this.f2659e = 0.0f;
        this.f2660f = 1.0f;
        this.f2661g = 1.0f;
        this.f2662h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f2663j = matrix;
        this.f2664k = null;
        this.f2657c = lVar.f2657c;
        this.f2658d = lVar.f2658d;
        this.f2659e = lVar.f2659e;
        this.f2660f = lVar.f2660f;
        this.f2661g = lVar.f2661g;
        this.f2662h = lVar.f2662h;
        this.i = lVar.i;
        String str = lVar.f2664k;
        this.f2664k = str;
        if (str != null) {
            c2936e.put(str, this);
        }
        matrix.set(lVar.f2663j);
        ArrayList arrayList = lVar.f2656b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof l) {
                this.f2656b.add(new l((l) obj, c2936e));
            } else {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    k kVar2 = new k(kVar);
                    kVar2.f2646e = 0.0f;
                    kVar2.f2648g = 1.0f;
                    kVar2.f2649h = 1.0f;
                    kVar2.i = 0.0f;
                    kVar2.f2650j = 1.0f;
                    kVar2.f2651k = 0.0f;
                    kVar2.f2652l = Paint.Cap.BUTT;
                    kVar2.f2653m = Paint.Join.MITER;
                    kVar2.f2654n = 4.0f;
                    kVar2.f2645d = kVar.f2645d;
                    kVar2.f2646e = kVar.f2646e;
                    kVar2.f2648g = kVar.f2648g;
                    kVar2.f2647f = kVar.f2647f;
                    kVar2.f2667c = kVar.f2667c;
                    kVar2.f2649h = kVar.f2649h;
                    kVar2.i = kVar.i;
                    kVar2.f2650j = kVar.f2650j;
                    kVar2.f2651k = kVar.f2651k;
                    kVar2.f2652l = kVar.f2652l;
                    kVar2.f2653m = kVar.f2653m;
                    kVar2.f2654n = kVar.f2654n;
                    jVar = kVar2;
                } else if (obj instanceof j) {
                    jVar = new j((j) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2656b.add(jVar);
                Object obj2 = jVar.f2666b;
                if (obj2 != null) {
                    c2936e.put(obj2, jVar);
                }
            }
        }
    }
}
