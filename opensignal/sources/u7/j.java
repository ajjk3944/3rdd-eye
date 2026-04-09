package u7;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f23401a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23402b;

    /* renamed from: c, reason: collision with root package name */
    public float f23403c;

    /* renamed from: d, reason: collision with root package name */
    public float f23404d;

    /* renamed from: e, reason: collision with root package name */
    public float f23405e;

    /* renamed from: f, reason: collision with root package name */
    public float f23406f;

    /* renamed from: g, reason: collision with root package name */
    public float f23407g;

    /* renamed from: h, reason: collision with root package name */
    public float f23408h;

    /* renamed from: i, reason: collision with root package name */
    public float f23409i;
    public final Matrix j;
    public String k;

    public j() {
        this.f23401a = new Matrix();
        this.f23402b = new ArrayList();
        this.f23403c = 0.0f;
        this.f23404d = 0.0f;
        this.f23405e = 0.0f;
        this.f23406f = 1.0f;
        this.f23407g = 1.0f;
        this.f23408h = 0.0f;
        this.f23409i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // u7.k
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23402b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // u7.k
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f23402b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f23404d, -this.f23405e);
        matrix.postScale(this.f23406f, this.f23407g);
        matrix.postRotate(this.f23403c, 0.0f, 0.0f);
        matrix.postTranslate(this.f23408h + this.f23404d, this.f23409i + this.f23405e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f23404d;
    }

    public float getPivotY() {
        return this.f23405e;
    }

    public float getRotation() {
        return this.f23403c;
    }

    public float getScaleX() {
        return this.f23406f;
    }

    public float getScaleY() {
        return this.f23407g;
    }

    public float getTranslateX() {
        return this.f23408h;
    }

    public float getTranslateY() {
        return this.f23409i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f23404d) {
            this.f23404d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f23405e) {
            this.f23405e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f23403c) {
            this.f23403c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f23406f) {
            this.f23406f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f23407g) {
            this.f23407g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f23408h) {
            this.f23408h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f23409i) {
            this.f23409i = f10;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, u.e eVar) {
        h hVar;
        this.f23401a = new Matrix();
        this.f23402b = new ArrayList();
        this.f23403c = 0.0f;
        this.f23404d = 0.0f;
        this.f23405e = 0.0f;
        this.f23406f = 1.0f;
        this.f23407g = 1.0f;
        this.f23408h = 0.0f;
        this.f23409i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.f23403c = jVar.f23403c;
        this.f23404d = jVar.f23404d;
        this.f23405e = jVar.f23405e;
        this.f23406f = jVar.f23406f;
        this.f23407g = jVar.f23407g;
        this.f23408h = jVar.f23408h;
        this.f23409i = jVar.f23409i;
        String str = jVar.k;
        this.k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(jVar.j);
        ArrayList arrayList = jVar.f23402b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f23402b.add(new j((j) obj, eVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f23393e = 0.0f;
                    iVar2.f23395g = 1.0f;
                    iVar2.f23396h = 1.0f;
                    iVar2.f23397i = 0.0f;
                    iVar2.j = 1.0f;
                    iVar2.k = 0.0f;
                    iVar2.f23398l = Paint.Cap.BUTT;
                    iVar2.f23399m = Paint.Join.MITER;
                    iVar2.f23400n = 4.0f;
                    iVar2.f23392d = iVar.f23392d;
                    iVar2.f23393e = iVar.f23393e;
                    iVar2.f23395g = iVar.f23395g;
                    iVar2.f23394f = iVar.f23394f;
                    iVar2.f23412c = iVar.f23412c;
                    iVar2.f23396h = iVar.f23396h;
                    iVar2.f23397i = iVar.f23397i;
                    iVar2.j = iVar.j;
                    iVar2.k = iVar.k;
                    iVar2.f23398l = iVar.f23398l;
                    iVar2.f23399m = iVar.f23399m;
                    iVar2.f23400n = iVar.f23400n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f23402b.add(hVar);
                Object obj2 = hVar.f23411b;
                if (obj2 != null) {
                    eVar.put(obj2, hVar);
                }
            }
        }
    }
}
