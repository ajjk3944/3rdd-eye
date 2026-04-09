package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16685a = new a();

    /* compiled from: DiffUtil.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f16686a - cVar2.f16686a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean a(int i, int i10);

        public abstract boolean b(int i, int i10);

        public Object c(int i, int i10) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* compiled from: DiffUtil.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f16686a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16687b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16688c;

        public c(int i, int i10, int i11) {
            this.f16686a = i;
            this.f16687b = i10;
            this.f16688c = i11;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f16689a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f16690b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f16691c;

        /* renamed from: d, reason: collision with root package name */
        public final b f16692d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16693e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16694f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f16695g;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int[] iArr3;
            int[] iArr4;
            b bVar2;
            int i;
            c cVar;
            int i10;
            this.f16689a = arrayList;
            this.f16690b = iArr;
            this.f16691c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f16692d = bVar;
            int iE = bVar.e();
            this.f16693e = iE;
            int iD = bVar.d();
            this.f16694f = iD;
            this.f16695g = true;
            c cVar2 = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar2 == null || cVar2.f16686a != 0 || cVar2.f16687b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(iE, iD, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iArr3 = this.f16691c;
                iArr4 = this.f16690b;
                bVar2 = this.f16692d;
                if (!zHasNext) {
                    break;
                }
                c cVar3 = (c) it.next();
                for (int i11 = 0; i11 < cVar3.f16688c; i11++) {
                    int i12 = cVar3.f16686a + i11;
                    int i13 = cVar3.f16687b + i11;
                    int i14 = bVar2.a(i12, i13) ? 1 : 2;
                    iArr4[i12] = (i13 << 4) | i14;
                    iArr3[i13] = (i12 << 4) | i14;
                }
            }
            if (this.f16695g) {
                Iterator it2 = arrayList.iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    while (true) {
                        i = cVar4.f16686a;
                        if (i15 < i) {
                            if (iArr4[i15] == 0) {
                                int size = arrayList.size();
                                int i16 = 0;
                                int i17 = 0;
                                while (true) {
                                    if (i16 < size) {
                                        cVar = (c) arrayList.get(i16);
                                        while (true) {
                                            i10 = cVar.f16687b;
                                            if (i17 < i10) {
                                                if (iArr3[i17] == 0 && bVar2.b(i15, i17)) {
                                                    int i18 = bVar2.a(i15, i17) ? 8 : 4;
                                                    iArr4[i15] = (i17 << 4) | i18;
                                                    iArr3[i17] = i18 | (i15 << 4);
                                                } else {
                                                    i17++;
                                                }
                                            }
                                        }
                                    }
                                    i17 = cVar.f16688c + i10;
                                    i16++;
                                }
                            }
                            i15++;
                        }
                    }
                    i15 = cVar4.f16688c + i;
                }
            }
        }

        public static f b(ArrayDeque arrayDeque, int i, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f16696a == i && fVar.f16698c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z10) {
                    fVar2.f16697b--;
                } else {
                    fVar2.f16697b++;
                }
            }
            return fVar;
        }

        public final void a(w wVar) {
            int[] iArr;
            b bVar;
            int i;
            int i10;
            ArrayList arrayList;
            d dVar = this;
            C1803e c1803e = wVar instanceof C1803e ? (C1803e) wVar : new C1803e(wVar);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = dVar.f16689a;
            boolean z10 = true;
            int size = arrayList2.size() - 1;
            int i11 = dVar.f16693e;
            int i12 = dVar.f16694f;
            int i13 = i11;
            while (size >= 0) {
                c cVar = (c) arrayList2.get(size);
                int i14 = cVar.f16686a;
                int i15 = cVar.f16688c;
                int i16 = i14 + i15;
                int i17 = cVar.f16687b;
                int i18 = i17 + i15;
                while (true) {
                    iArr = dVar.f16690b;
                    bVar = dVar.f16692d;
                    boolean z11 = z10;
                    i = 0;
                    if (i13 <= i16) {
                        break;
                    }
                    i13--;
                    int i19 = iArr[i13];
                    if ((i19 & 12) != 0) {
                        arrayList = arrayList2;
                        int i20 = i19 >> 4;
                        f fVarB = b(arrayDeque, i20, false);
                        if (fVarB != null) {
                            int i21 = (i11 - fVarB.f16697b) - 1;
                            c1803e.a(i13, i21);
                            if ((i19 & 4) != 0) {
                                c1803e.d(i21, z11 ? 1 : 0, bVar.c(i13, i20));
                            }
                        } else {
                            arrayDeque.add(new f(i13, (i11 - i13) - (z11 ? 1 : 0), z11));
                        }
                    } else {
                        arrayList = arrayList2;
                        c1803e.c(i13, z11 ? 1 : 0);
                        i11--;
                    }
                    arrayList2 = arrayList;
                    z10 = true;
                }
                ArrayList arrayList3 = arrayList2;
                while (i12 > i18) {
                    i12--;
                    int i22 = dVar.f16691c[i12];
                    if ((i22 & 12) != 0) {
                        int i23 = i22 >> 4;
                        f fVarB2 = b(arrayDeque, i23, true);
                        if (fVarB2 == null) {
                            arrayDeque.add(new f(i12, i11 - i13, false));
                            i10 = 0;
                        } else {
                            i10 = 0;
                            c1803e.a((i11 - fVarB2.f16697b) - 1, i13);
                            if ((i22 & 4) != 0) {
                                c1803e.d(i13, 1, bVar.c(i23, i12));
                            }
                        }
                    } else {
                        i10 = i;
                        c1803e.b(i13, 1);
                        i11++;
                    }
                    dVar = this;
                    i = i10;
                }
                i13 = cVar.f16686a;
                int i24 = i13;
                int i25 = i17;
                while (i < i15) {
                    if ((iArr[i24] & 15) == 2) {
                        c1803e.d(i24, 1, bVar.c(i24, i25));
                    }
                    i24++;
                    i25++;
                    i++;
                }
                size--;
                dVar = this;
                z10 = true;
                i12 = i17;
                arrayList2 = arrayList3;
            }
            c1803e.e();
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class e<T> {
        public abstract boolean areContentsTheSame(T t10, T t11);

        public abstract boolean areItemsTheSame(T t10, T t11);

        public Object getChangePayload(T t10, T t11) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f16696a;

        /* renamed from: b, reason: collision with root package name */
        public int f16697b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16698c;

        public f(int i, int i10, boolean z10) {
            this.f16696a = i;
            this.f16697b = i10;
            this.f16698c = z10;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public int f16699a;

        /* renamed from: b, reason: collision with root package name */
        public int f16700b;

        /* renamed from: c, reason: collision with root package name */
        public int f16701c;

        /* renamed from: d, reason: collision with root package name */
        public int f16702d;

        public final int a() {
            return this.f16702d - this.f16701c;
        }

        public final int b() {
            return this.f16700b - this.f16699a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f16703a;

        /* renamed from: b, reason: collision with root package name */
        public int f16704b;

        /* renamed from: c, reason: collision with root package name */
        public int f16705c;

        /* renamed from: d, reason: collision with root package name */
        public int f16706d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16707e;

        public final int a() {
            return Math.min(this.f16705c - this.f16703a, this.f16706d - this.f16704b);
        }
    }

    public static d a(b bVar) {
        int i;
        h hVar;
        int i10;
        g gVar;
        int i11;
        int i12;
        h hVar2;
        h hVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        g gVar2 = new g();
        int i22 = 0;
        gVar2.f16699a = 0;
        gVar2.f16700b = iE;
        gVar2.f16701c = 0;
        gVar2.f16702d = iD;
        arrayList2.add(gVar2);
        int i23 = iE + iD;
        int i24 = 1;
        int i25 = (((i23 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i25];
        int i26 = i25 / 2;
        int[] iArr2 = new int[i25];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar3 = (g) arrayList2.remove(arrayList2.size() - i24);
            if (gVar3.b() < i24 || gVar3.a() < i24) {
                i = i26;
                hVar = null;
            } else {
                int iA = ((gVar3.a() + gVar3.b()) + i24) / 2;
                int i27 = i24 + i26;
                iArr[i27] = gVar3.f16699a;
                iArr2[i27] = gVar3.f16700b;
                int i28 = i22;
                while (i28 < iA) {
                    int i29 = Math.abs(gVar3.b() - gVar3.a()) % 2 == i24 ? i24 : i22;
                    int iB = gVar3.b() - gVar3.a();
                    int i30 = -i28;
                    int i31 = i30;
                    while (true) {
                        if (i31 > i28) {
                            i11 = i22;
                            i = i26;
                            i12 = iA;
                            hVar2 = null;
                            break;
                        }
                        if (i31 == i30 || (i31 != i28 && iArr[i31 + 1 + i26] > iArr[(i31 - 1) + i26])) {
                            i17 = iArr[i31 + 1 + i26];
                            i18 = i17;
                        } else {
                            i17 = iArr[(i31 - 1) + i26];
                            i18 = i17 + 1;
                        }
                        i = i26;
                        int i32 = ((i18 - gVar3.f16699a) + gVar3.f16701c) - i31;
                        if (i28 == 0 || i18 != i17) {
                            i19 = i18;
                            i20 = i32;
                        } else {
                            i19 = i18;
                            i20 = i32 - 1;
                        }
                        int i33 = i31;
                        int i34 = i32;
                        int i35 = i19;
                        i12 = iA;
                        while (i35 < gVar3.f16700b && i34 < gVar3.f16702d && bVar.b(i35, i34)) {
                            i35++;
                            i34++;
                        }
                        iArr[i33 + i] = i35;
                        if (i29 != 0) {
                            int i36 = iB - i33;
                            i21 = i29;
                            if (i36 >= i30 + 1 && i36 <= i28 - 1 && iArr2[i36 + i] <= i35) {
                                hVar2 = new h();
                                hVar2.f16703a = i17;
                                hVar2.f16704b = i20;
                                hVar2.f16705c = i35;
                                hVar2.f16706d = i34;
                                i11 = 0;
                                hVar2.f16707e = false;
                                break;
                            }
                        } else {
                            i21 = i29;
                        }
                        i31 = i33 + 2;
                        i22 = 0;
                        i26 = i;
                        iA = i12;
                        i29 = i21;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        break;
                    }
                    int i37 = (gVar3.b() - gVar3.a()) % 2 == 0 ? 1 : i11;
                    int iB2 = gVar3.b() - gVar3.a();
                    int i38 = i30;
                    while (true) {
                        if (i38 > i28) {
                            hVar3 = null;
                            break;
                        }
                        if (i38 == i30 || (i38 != i28 && iArr2[i38 + 1 + i] < iArr2[(i38 - 1) + i])) {
                            i13 = iArr2[i38 + 1 + i];
                            i14 = i13;
                        } else {
                            i13 = iArr2[(i38 - 1) + i];
                            i14 = i13 - 1;
                        }
                        int i39 = gVar3.f16702d - ((gVar3.f16700b - i14) - i38);
                        int i40 = (i28 == 0 || i14 != i13) ? i39 : i39 + 1;
                        int i41 = i37;
                        while (i14 > gVar3.f16699a && i39 > gVar3.f16701c) {
                            i15 = iB2;
                            if (!bVar.b(i14 - 1, i39 - 1)) {
                                break;
                            }
                            i14--;
                            i39--;
                            iB2 = i15;
                        }
                        i15 = iB2;
                        iArr2[i38 + i] = i14;
                        if (i41 != 0 && (i16 = i15 - i38) >= i30 && i16 <= i28 && iArr[i16 + i] >= i14) {
                            hVar3 = new h();
                            hVar3.f16703a = i14;
                            hVar3.f16704b = i39;
                            hVar3.f16705c = i13;
                            hVar3.f16706d = i40;
                            hVar3.f16707e = true;
                            break;
                        }
                        i38 += 2;
                        i37 = i41;
                        iB2 = i15;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i28++;
                    i26 = i;
                    iA = i12;
                    i24 = 1;
                    i22 = 0;
                }
                i = i26;
                hVar = null;
            }
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i42 = hVar.f16706d;
                    int i43 = hVar.f16704b;
                    int i44 = i42 - i43;
                    int i45 = hVar.f16705c;
                    int i46 = hVar.f16703a;
                    int i47 = i45 - i46;
                    arrayList.add(i44 != i47 ? hVar.f16707e ? new c(i46, i43, hVar.a()) : i44 > i47 ? new c(i46, i43 + 1, hVar.a()) : new c(i46 + 1, i43, hVar.a()) : new c(i46, i43, i47));
                }
                if (arrayList3.isEmpty()) {
                    gVar = new g();
                    i10 = 1;
                } else {
                    i10 = 1;
                    gVar = (g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.f16699a = gVar3.f16699a;
                gVar.f16701c = gVar3.f16701c;
                gVar.f16700b = hVar.f16703a;
                gVar.f16702d = hVar.f16704b;
                arrayList2.add(gVar);
                gVar3.f16700b = gVar3.f16700b;
                gVar3.f16702d = gVar3.f16702d;
                gVar3.f16699a = hVar.f16705c;
                gVar3.f16701c = hVar.f16706d;
                arrayList2.add(gVar3);
            } else {
                i10 = 1;
                arrayList3.add(gVar3);
            }
            i26 = i;
            i24 = i10;
            i22 = 0;
        }
        Collections.sort(arrayList, f16685a);
        return new d(bVar, arrayList, iArr, iArr2);
    }
}
