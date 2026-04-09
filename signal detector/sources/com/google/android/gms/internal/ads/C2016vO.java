package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2016vO extends AbstractC1353j8 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f17263k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f17264b;

    /* renamed from: c, reason: collision with root package name */
    public final OQ f17265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17266d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17267e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f17268f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f17269g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1353j8[] f17270h;
    public final Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f17271j;

    public C2016vO(AbstractC1353j8[] abstractC1353j8Arr, Object[] objArr, OQ oq) {
        this.f17265c = oq;
        this.f17264b = oq.f10200b.length;
        this.f17270h = abstractC1353j8Arr;
        int length = abstractC1353j8Arr.length;
        this.f17268f = new int[length];
        this.f17269g = new int[length];
        this.i = objArr;
        this.f17271j = new HashMap();
        int i = 0;
        int iA = 0;
        int iC = 0;
        int i3 = 0;
        while (i < abstractC1353j8Arr.length) {
            AbstractC1353j8 abstractC1353j8 = abstractC1353j8Arr[i];
            this.f17270h[i3] = abstractC1353j8;
            this.f17269g[i3] = iA;
            this.f17268f[i3] = iC;
            iA += abstractC1353j8.a();
            iC += this.f17270h[i3].c();
            this.f17271j.put(objArr[i3], Integer.valueOf(i3));
            i++;
            i3++;
        }
        this.f17266d = iA;
        this.f17267e = iC;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int a() {
        return this.f17266d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final U7 b(int i, U7 u7, long j6) {
        int[] iArr = this.f17269g;
        int iP = Vt.p(iArr, i + 1, false, false);
        int i3 = iArr[iP];
        int i6 = this.f17268f[iP];
        this.f17270h[iP].b(i - i3, u7, j6);
        Object objCreate = this.i[iP];
        if (!U7.f11601m.equals(u7.f11603a)) {
            objCreate = Pair.create(objCreate, u7.f11603a);
        }
        u7.f11603a = objCreate;
        u7.f11612k += i6;
        u7.f11613l += i6;
        return u7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int c() {
        return this.f17267e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final I7 d(int i, I7 i7, boolean z6) {
        int[] iArr = this.f17268f;
        int iP = Vt.p(iArr, i + 1, false, false);
        int i3 = this.f17269g[iP];
        this.f17270h[iP].d(i - iArr[iP], i7, z6);
        i7.f9072c += i3;
        if (z6) {
            Object obj = this.i[iP];
            Object obj2 = i7.f9071b;
            obj2.getClass();
            i7.f9071b = Pair.create(obj, obj2);
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f17271j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iE = this.f17270h[iIntValue].e(obj3)) != -1) {
                return this.f17268f[iIntValue] + iE;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final Object f(int i) {
        int[] iArr = this.f17268f;
        int iP = Vt.p(iArr, i + 1, false, false);
        return Pair.create(this.i[iP], this.f17270h[iP].f(i - iArr[iP]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int h(int i, int i3, boolean z6) {
        int[] iArr = this.f17269g;
        int iP = Vt.p(iArr, i + 1, false, false);
        int i6 = iArr[iP];
        AbstractC1353j8[] abstractC1353j8Arr = this.f17270h;
        int iH = abstractC1353j8Arr[iP].h(i - i6, i3 != 2 ? i3 : 0, z6);
        if (iH != -1) {
            return i6 + iH;
        }
        int iP2 = p(iP, z6);
        while (iP2 != -1 && abstractC1353j8Arr[iP2].g()) {
            iP2 = p(iP2, z6);
        }
        if (iP2 != -1) {
            return abstractC1353j8Arr[iP2].k(z6) + iArr[iP2];
        }
        if (i3 == 2) {
            return k(z6);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int i(int i) {
        int[] iArr = this.f17269g;
        int iP = Vt.p(iArr, i + 1, false, false);
        int i3 = iArr[iP];
        AbstractC1353j8[] abstractC1353j8Arr = this.f17270h;
        int i6 = abstractC1353j8Arr[iP].i(i - i3);
        if (i6 != -1) {
            return i3 + i6;
        }
        int iQ = q(iP, false);
        while (iQ != -1 && abstractC1353j8Arr[iQ].g()) {
            iQ = q(iQ, false);
        }
        if (iQ == -1) {
            return -1;
        }
        return abstractC1353j8Arr[iQ].j(false) + iArr[iQ];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int j(boolean z6) {
        int iQ;
        int i = this.f17264b;
        if (i != 0) {
            if (z6) {
                int[] iArr = this.f17265c.f10200b;
                int length = iArr.length;
                iQ = length > 0 ? iArr[length - 1] : -1;
            } else {
                iQ = i - 1;
            }
            do {
                AbstractC1353j8[] abstractC1353j8Arr = this.f17270h;
                if (!abstractC1353j8Arr[iQ].g()) {
                    return abstractC1353j8Arr[iQ].j(z6) + this.f17269g[iQ];
                }
                iQ = q(iQ, z6);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int k(boolean z6) {
        if (this.f17264b != 0) {
            int iP = 0;
            if (z6) {
                int[] iArr = this.f17265c.f10200b;
                iP = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC1353j8[] abstractC1353j8Arr = this.f17270h;
                if (!abstractC1353j8Arr[iP].g()) {
                    return abstractC1353j8Arr[iP].k(z6) + this.f17269g[iP];
                }
                iP = p(iP, z6);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final I7 o(Object obj, I7 i7) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f17271j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f17269g[iIntValue];
        this.f17270h[iIntValue].o(obj3, i7);
        i7.f9072c += i;
        i7.f9071b = obj;
        return i7;
    }

    public final int p(int i, boolean z6) {
        if (!z6) {
            if (i >= this.f17264b - 1) {
                return -1;
            }
            return i + 1;
        }
        OQ oq = this.f17265c;
        int i3 = oq.f10201c[i] + 1;
        int[] iArr = oq.f10200b;
        if (i3 < iArr.length) {
            return iArr[i3];
        }
        return -1;
    }

    public final int q(int i, boolean z6) {
        if (!z6) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        OQ oq = this.f17265c;
        int i3 = oq.f10201c[i] - 1;
        if (i3 >= 0) {
            return oq.f10200b[i3];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2016vO(List list, OQ oq) {
        AbstractC1353j8[] abstractC1353j8Arr = new AbstractC1353j8[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i3 = 0;
        while (it.hasNext()) {
            abstractC1353j8Arr[i3] = ((InterfaceC1317iO) it.next()).c();
            i3++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC1317iO) it2.next()).a();
            i++;
        }
        this(abstractC1353j8Arr, objArr, oq);
    }
}
