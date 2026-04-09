package com.google.android.material.carousel;

import S3.g;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: KeylineStateList.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f22679a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f22680b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f22681c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f22682d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f22683e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22684f;

    /* renamed from: g, reason: collision with root package name */
    public final float f22685g;

    public c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f22679a = bVar;
        this.f22680b = Collections.unmodifiableList(arrayList);
        this.f22681c = Collections.unmodifiableList(arrayList2);
        float f10 = ((b) arrayList.get(arrayList.size() - 1)).b().f22671a - bVar.b().f22671a;
        this.f22684f = f10;
        float f11 = bVar.d().f22671a - ((b) arrayList2.get(arrayList2.size() - 1)).d().f22671a;
        this.f22685g = f11;
        this.f22682d = d(f10, arrayList, true);
        this.f22683e = d(f11, arrayList2, false);
    }

    public static float[] d(float f10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i10 = i - 1;
            b bVar = (b) arrayList.get(i10);
            b bVar2 = (b) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i10] + ((z10 ? bVar2.b().f22671a - bVar.b().f22671a : bVar.d().f22671a - bVar2.d().f22671a) / f10);
            i++;
        }
        return fArr;
    }

    public static b e(b bVar, int i, int i10, float f10, int i11, int i12, float f11) {
        ArrayList arrayList = new ArrayList(bVar.f22660b);
        arrayList.add(i10, (b.C0340b) arrayList.remove(i));
        b.a aVar = new b.a(bVar.f22659a, f11);
        float f12 = f10;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            b.C0340b c0340b = (b.C0340b) arrayList.get(i13);
            float f13 = c0340b.f22674d;
            aVar.b((f13 / 2.0f) + f12, c0340b.f22673c, f13, i13 >= i11 && i13 <= i12, c0340b.f22675e, c0340b.f22676f, 0.0f, 0.0f);
            f12 += c0340b.f22674d;
            i13++;
        }
        return aVar.d();
    }

    public static b f(b bVar, float f10, float f11, boolean z10, float f12) {
        int i;
        List<b.C0340b> list = bVar.f22660b;
        ArrayList arrayList = new ArrayList(list);
        float f13 = bVar.f22659a;
        b.a aVar = new b.a(f13, f11);
        Iterator<b.C0340b> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f22675e) {
                i10++;
            }
        }
        float size = f10 / (list.size() - i10);
        float f14 = z10 ? f10 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            b.C0340b c0340b = (b.C0340b) arrayList.get(i11);
            if (c0340b.f22675e) {
                i = i11;
                aVar.b(c0340b.f22672b, c0340b.f22673c, c0340b.f22674d, false, true, c0340b.f22676f, 0.0f, 0.0f);
            } else {
                i = i11;
                boolean z11 = i >= bVar.f22661c && i <= bVar.f22662d;
                float f15 = c0340b.f22674d - size;
                float fA = g.a(f15, f13, f12);
                float f16 = (f15 / 2.0f) + f14;
                float f17 = f16 - c0340b.f22672b;
                float f18 = f17;
                if (!z10) {
                    f17 = 0.0f;
                }
                if (z10) {
                    f18 = 0.0f;
                }
                aVar.b(f16, fA, f15, z11, false, c0340b.f22676f, f17, f18);
                f14 += f15;
            }
            i11 = i + 1;
        }
        return aVar.d();
    }

    public final b a() {
        return this.f22681c.get(r0.size() - 1);
    }

    public final b b(float f10, float f11, float f12) {
        float fB;
        List<b> list;
        float[] fArr;
        float[] fArr2;
        float f13 = this.f22684f;
        float f14 = f11 + f13;
        float f15 = this.f22685g;
        float f16 = f12 - f15;
        float f17 = c().a().f22677g;
        float f18 = a().c().f22678h;
        if (f13 == f17) {
            f14 += f17;
        }
        if (f15 == f18) {
            f16 -= f18;
        }
        if (f10 < f14) {
            fB = L3.a.b(1.0f, 0.0f, f11, f14, f10);
            list = this.f22680b;
            fArr = this.f22682d;
        } else {
            if (f10 <= f16) {
                return this.f22679a;
            }
            fB = L3.a.b(0.0f, 1.0f, f16, f12, f10);
            list = this.f22681c;
            fArr = this.f22683e;
        }
        int size = list.size();
        float f19 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f20 = fArr[i];
            if (fB <= f20) {
                fArr2 = new float[]{L3.a.b(0.0f, 1.0f, f19, f20, fB), i - 1, i};
                break;
            }
            i++;
            f19 = f20;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f21 = fArr2[0];
        if (bVar.f22659a != bVar2.f22659a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<b.C0340b> list2 = bVar.f22660b;
        int size2 = list2.size();
        List<b.C0340b> list3 = bVar2.f22660b;
        if (size2 != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            b.C0340b c0340b = list2.get(i10);
            b.C0340b c0340b2 = list3.get(i10);
            arrayList.add(new b.C0340b(L3.a.a(c0340b.f22671a, c0340b2.f22671a, f21), L3.a.a(c0340b.f22672b, c0340b2.f22672b, f21), L3.a.a(c0340b.f22673c, c0340b2.f22673c, f21), L3.a.a(c0340b.f22674d, c0340b2.f22674d, f21), false, 0.0f, 0.0f, 0.0f));
        }
        return new b(bVar.f22659a, arrayList, L3.a.c(f21, bVar.f22661c, bVar2.f22661c), L3.a.c(f21, bVar.f22662d, bVar2.f22662d));
    }

    public final b c() {
        return this.f22680b.get(r0.size() - 1);
    }
}
