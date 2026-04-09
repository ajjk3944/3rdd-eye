package qb;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final oh.f f20812h = new oh.f(3);

    /* renamed from: i, reason: collision with root package name */
    public static final oh.f f20813i = new oh.f(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f20814a;

    /* renamed from: e, reason: collision with root package name */
    public int f20818e;

    /* renamed from: f, reason: collision with root package name */
    public int f20819f;

    /* renamed from: g, reason: collision with root package name */
    public int f20820g;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f20816c = new q[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20815b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f20817d = -1;

    public r(int i10) {
        this.f20814a = i10;
    }

    public final void a(int i10, float f10) {
        q qVar;
        int i11 = this.f20817d;
        ArrayList arrayList = this.f20815b;
        if (i11 != 1) {
            Collections.sort(arrayList, f20812h);
            this.f20817d = 1;
        }
        int i12 = this.f20820g;
        q[] qVarArr = this.f20816c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f20820g = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new q();
        }
        int i14 = this.f20818e;
        this.f20818e = i14 + 1;
        qVar.f20809a = i14;
        qVar.f20810b = i10;
        qVar.f20811c = f10;
        arrayList.add(qVar);
        this.f20819f += i10;
        while (true) {
            int i15 = this.f20819f;
            int i16 = this.f20814a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            q qVar2 = (q) arrayList.get(0);
            int i18 = qVar2.f20810b;
            if (i18 <= i17) {
                this.f20819f -= i18;
                arrayList.remove(0);
                int i19 = this.f20820g;
                if (i19 < 5) {
                    this.f20820g = i19 + 1;
                    qVarArr[i19] = qVar2;
                }
            } else {
                qVar2.f20810b = i18 - i17;
                this.f20819f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.f20817d;
        ArrayList arrayList = this.f20815b;
        if (i10 != 0) {
            Collections.sort(arrayList, f20813i);
            this.f20817d = 0;
        }
        float f10 = 0.5f * this.f20819f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f20810b;
            if (i11 >= f10) {
                return qVar.f20811c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) h0.b.f(1, arrayList)).f20811c;
    }
}
