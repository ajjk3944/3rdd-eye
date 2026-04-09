package k6;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f27994a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27995b;

    /* renamed from: c, reason: collision with root package name */
    public float f27996c;

    /* renamed from: d, reason: collision with root package name */
    public float f27997d;

    /* renamed from: e, reason: collision with root package name */
    public float f27998e;

    /* renamed from: f, reason: collision with root package name */
    public float f27999f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f28000h;

    /* renamed from: i, reason: collision with root package name */
    public float f28001i;
    public final Matrix j;

    /* renamed from: k, reason: collision with root package name */
    public String f28002k;

    public k() {
        this.f27994a = new Matrix();
        this.f27995b = new ArrayList();
        this.f27996c = 0.0f;
        this.f27997d = 0.0f;
        this.f27998e = 0.0f;
        this.f27999f = 1.0f;
        this.g = 1.0f;
        this.f28000h = 0.0f;
        this.f28001i = 0.0f;
        this.j = new Matrix();
        this.f28002k = null;
    }

    @Override // k6.l
    public final boolean a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f27995b;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i4)).a()) {
                return true;
            }
            i4++;
        }
    }

    @Override // k6.l
    public final boolean b(int[] iArr) {
        int i4 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f27995b;
            if (i4 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i4)).b(iArr);
            i4++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f27997d, -this.f27998e);
        matrix.postScale(this.f27999f, this.g);
        matrix.postRotate(this.f27996c, 0.0f, 0.0f);
        matrix.postTranslate(this.f28000h + this.f27997d, this.f28001i + this.f27998e);
    }

    public String getGroupName() {
        return this.f28002k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f27997d;
    }

    public float getPivotY() {
        return this.f27998e;
    }

    public float getRotation() {
        return this.f27996c;
    }

    public float getScaleX() {
        return this.f27999f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.f28000h;
    }

    public float getTranslateY() {
        return this.f28001i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f27997d) {
            this.f27997d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f27998e) {
            this.f27998e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f27996c) {
            this.f27996c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f27999f) {
            this.f27999f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.g) {
            this.g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f28000h) {
            this.f28000h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f28001i) {
            this.f28001i = f10;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(k kVar, x.e eVar) {
        i iVar;
        this.f27994a = new Matrix();
        this.f27995b = new ArrayList();
        this.f27996c = 0.0f;
        this.f27997d = 0.0f;
        this.f27998e = 0.0f;
        this.f27999f = 1.0f;
        this.g = 1.0f;
        this.f28000h = 0.0f;
        this.f28001i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f28002k = null;
        this.f27996c = kVar.f27996c;
        this.f27997d = kVar.f27997d;
        this.f27998e = kVar.f27998e;
        this.f27999f = kVar.f27999f;
        this.g = kVar.g;
        this.f28000h = kVar.f28000h;
        this.f28001i = kVar.f28001i;
        String str = kVar.f28002k;
        this.f28002k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(kVar.j);
        ArrayList arrayList = kVar.f27995b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i4);
            if (obj instanceof k) {
                this.f27995b.add(new k((k) obj, eVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f27986e = 0.0f;
                    jVar2.g = 1.0f;
                    jVar2.f27988h = 1.0f;
                    jVar2.f27989i = 0.0f;
                    jVar2.j = 1.0f;
                    jVar2.f27990k = 0.0f;
                    jVar2.f27991l = Paint.Cap.BUTT;
                    jVar2.f27992m = Paint.Join.MITER;
                    jVar2.f27993n = 4.0f;
                    jVar2.f27985d = jVar.f27985d;
                    jVar2.f27986e = jVar.f27986e;
                    jVar2.g = jVar.g;
                    jVar2.f27987f = jVar.f27987f;
                    jVar2.f28005c = jVar.f28005c;
                    jVar2.f27988h = jVar.f27988h;
                    jVar2.f27989i = jVar.f27989i;
                    jVar2.j = jVar.j;
                    jVar2.f27990k = jVar.f27990k;
                    jVar2.f27991l = jVar.f27991l;
                    jVar2.f27992m = jVar.f27992m;
                    jVar2.f27993n = jVar.f27993n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f27995b.add(iVar);
                Object obj2 = iVar.f28004b;
                if (obj2 != null) {
                    eVar.put(obj2, iVar);
                }
            }
        }
    }
}
