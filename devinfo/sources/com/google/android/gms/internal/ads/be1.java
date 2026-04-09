package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class be1 implements fe1 {

    /* renamed from: a, reason: collision with root package name */
    public int f9657a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9658b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9659c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9660d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9661e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9662f;

    public be1(q21 q21Var) {
        this.f9658b = q21Var;
        this.f9659c = new ArrayDeque();
        this.f9660d = new ArrayDeque();
        this.f9661e = new PriorityQueue();
        this.f9657a = -1;
    }

    public static be1 I(String str, bn1 bn1Var, int i4, ii1 ii1Var, Integer num) throws GeneralSecurityException {
        if (ii1Var == ii1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        vl1 vl1VarB = je1.b(str);
        be1 be1Var = new be1();
        be1Var.f9658b = str;
        be1Var.f9659c = vl1VarB;
        be1Var.f9660d = bn1Var;
        be1Var.f9657a = i4;
        be1Var.f9661e = ii1Var;
        be1Var.f9662f = num;
        return be1Var;
    }

    public void A(int i4) {
        ColorStateList colorStateListI;
        this.f9657a = i4;
        p.s sVar = (p.s) this.f9659c;
        if (sVar != null) {
            Context context = ((View) this.f9658b).getContext();
            synchronized (sVar) {
                colorStateListI = sVar.f30852a.i(i4, context);
            }
        } else {
            colorStateListI = null;
        }
        E(colorStateListI);
        a();
    }

    public void B(androidx.recyclerview.widget.a aVar) {
        androidx.recyclerview.widget.r0 r0Var = (androidx.recyclerview.widget.r0) this.f9661e;
        ((ArrayList) this.f9660d).add(aVar);
        int i4 = aVar.f1289a;
        if (i4 == 1) {
            r0Var.d(aVar.f1290b, aVar.f1292d);
            return;
        }
        if (i4 == 2) {
            int i10 = aVar.f1290b;
            int i11 = aVar.f1292d;
            RecyclerView recyclerView = r0Var.f1497a;
            recyclerView.W(i10, i11, false);
            recyclerView.f1238k0 = true;
            return;
        }
        if (i4 == 4) {
            r0Var.c(aVar.f1290b, aVar.f1292d, aVar.f1291c);
        } else if (i4 == 8) {
            r0Var.e(aVar.f1290b, aVar.f1292d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.be1.C():void");
    }

    public void D(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i4);
            aVar.f1291c = null;
            ((d4.d) this.f9658b).i(aVar);
        }
        arrayList.clear();
    }

    public void E(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((ah.f) this.f9660d) == null) {
                this.f9660d = new ah.f();
            }
            ah.f fVar = (ah.f) this.f9660d;
            fVar.f382c = colorStateList;
            fVar.f381b = true;
        } else {
            this.f9660d = null;
        }
        a();
    }

    public void F(ColorStateList colorStateList) {
        if (((ah.f) this.f9661e) == null) {
            this.f9661e = new ah.f();
        }
        ah.f fVar = (ah.f) this.f9661e;
        fVar.f382c = colorStateList;
        fVar.f381b = true;
        a();
    }

    public void G(PorterDuff.Mode mode) {
        if (((ah.f) this.f9661e) == null) {
            this.f9661e = new ah.f();
        }
        ah.f fVar = (ah.f) this.f9661e;
        fVar.f383d = mode;
        fVar.f380a = true;
        a();
    }

    public int H(int i4, int i10) {
        int i11;
        int i12;
        d4.d dVar = (d4.d) this.f9658b;
        ArrayList arrayList = (ArrayList) this.f9660d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(size);
            int i13 = aVar.f1289a;
            if (i13 == 8) {
                int i14 = aVar.f1290b;
                int i15 = aVar.f1292d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i4 < i12 || i4 > i11) {
                    if (i4 < i14) {
                        if (i10 == 1) {
                            aVar.f1290b = i14 + 1;
                            aVar.f1292d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.f1290b = i14 - 1;
                            aVar.f1292d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        aVar.f1292d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f1292d = i15 - 1;
                    }
                    i4++;
                } else {
                    if (i10 == 1) {
                        aVar.f1290b = i14 + 1;
                    } else if (i10 == 2) {
                        aVar.f1290b = i14 - 1;
                    }
                    i4--;
                }
            } else {
                int i16 = aVar.f1290b;
                if (i16 <= i4) {
                    if (i13 == 1) {
                        i4 -= aVar.f1292d;
                    } else if (i13 == 2) {
                        i4 += aVar.f1292d;
                    }
                } else if (i10 == 1) {
                    aVar.f1290b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f1290b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) arrayList.get(size2);
            if (aVar2.f1289a == 8) {
                int i17 = aVar2.f1292d;
                if (i17 == aVar2.f1290b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f1291c = null;
                    dVar.i(aVar2);
                }
            } else if (aVar2.f1292d <= 0) {
                arrayList.remove(size2);
                aVar2.f1291c = null;
                dVar.i(aVar2);
            }
        }
        return i4;
    }

    public void J(int i4) {
        mq0.c0(i4 >= 0);
        this.f9657a = i4;
        L(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8 < r1.f10308b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(long r8, com.google.android.gms.internal.ads.sk0 r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f9661e
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L9b
            int r1 = r7.f9657a
            if (r1 == 0) goto L9c
            r2 = -1
            if (r1 == r2) goto L2c
            int r1 = r0.size()
            int r3 = r7.f9657a
            if (r1 < r3) goto L2c
            java.lang.Object r1 = r0.peek()
            com.google.android.gms.internal.ads.d21 r1 = (com.google.android.gms.internal.ads.d21) r1
            java.lang.String r3 = com.google.android.gms.internal.ads.bq0.f9768a
            long r3 = r1.f10308b
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L9c
        L2c:
            java.lang.Object r1 = r7.f9659c
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c
            com.google.android.gms.internal.ads.sk0 r1 = new com.google.android.gms.internal.ads.sk0
            r1.<init>()
            goto L42
        L3c:
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.sk0 r1 = (com.google.android.gms.internal.ads.sk0) r1
        L42:
            int r3 = r10.B()
            r1.y(r3)
            byte[] r3 = r10.f16446a
            int r10 = r10.f16447b
            byte[] r4 = r1.f16446a
            r5 = 0
            int r6 = r1.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            java.lang.Object r10 = r7.f9662f
            com.google.android.gms.internal.ads.d21 r10 = (com.google.android.gms.internal.ads.d21) r10
            if (r10 == 0) goto L6a
            long r3 = r10.f10308b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L64
            goto L6a
        L64:
            java.util.ArrayList r8 = r10.f10307a
            r8.add(r1)
            return
        L6a:
            java.lang.Object r10 = r7.f9660d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.d21 r10 = new com.google.android.gms.internal.ads.d21
            r10.<init>()
            goto L80
        L7a:
            java.lang.Object r10 = r10.pop()
            com.google.android.gms.internal.ads.d21 r10 = (com.google.android.gms.internal.ads.d21) r10
        L80:
            java.util.ArrayList r3 = r10.f10307a
            boolean r4 = r3.isEmpty()
            com.google.android.gms.internal.ads.mq0.c0(r4)
            r10.f10308b = r8
            r3.add(r1)
            r0.add(r10)
            r7.f9662f = r10
            int r8 = r7.f9657a
            if (r8 == r2) goto L9a
            r7.L(r8)
        L9a:
            return
        L9b:
            r8 = r1
        L9c:
            java.lang.Object r0 = r7.f9658b
            com.google.android.gms.internal.ads.q21 r0 = (com.google.android.gms.internal.ads.q21) r0
            r0.l(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.be1.K(long, com.google.android.gms.internal.ads.sk0):void");
    }

    public void L(int i4) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f9661e;
            if (priorityQueue.size() <= i4) {
                return;
            }
            d21 d21Var = (d21) priorityQueue.poll();
            String str = bq0.f9768a;
            int i10 = 0;
            while (true) {
                arrayList = d21Var.f10307a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((q21) this.f9658b).l(d21Var.f10308b, (sk0) arrayList.get(i10));
                ((ArrayDeque) this.f9659c).push((sk0) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            d21 d21Var2 = (d21) this.f9662f;
            if (d21Var2 != null && d21Var2.f10308b == d21Var.f10308b) {
                this.f9662f = null;
            }
            ((ArrayDeque) this.f9660d).push(d21Var);
        }
    }

    public void M(Object obj) {
        Object obj2 = this.f9661e;
        this.f9661e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        kh0 kh0Var = (kh0) this.f9660d;
        kh0Var.getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        it1 it1Var = (it1) kh0Var.f13160b;
        it1Var.o0();
        it1Var.X1(1, 10, num);
        it1Var.X1(2, 10, num);
        cl1 cl1Var = new cl1(iIntValue);
        yf0 yf0Var = it1Var.f12460n;
        yf0Var.c(21, cl1Var);
        yf0Var.d();
    }

    public void a() {
        View view = (View) this.f9658b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((ah.f) this.f9660d) != null) {
                if (((ah.f) this.f9662f) == null) {
                    this.f9662f = new ah.f();
                }
                ah.f fVar = (ah.f) this.f9662f;
                fVar.f382c = null;
                fVar.f381b = false;
                fVar.f383d = null;
                fVar.f380a = false;
                WeakHashMap weakHashMap = e4.v0.f22405a;
                ColorStateList colorStateListC = e4.m0.c(view);
                if (colorStateListC != null) {
                    fVar.f381b = true;
                    fVar.f382c = colorStateListC;
                }
                PorterDuff.Mode modeD = e4.m0.d(view);
                if (modeD != null) {
                    fVar.f380a = true;
                    fVar.f383d = modeD;
                }
                if (fVar.f381b || fVar.f380a) {
                    p.s.e(background, fVar, view.getDrawableState());
                    return;
                }
            }
            ah.f fVar2 = (ah.f) this.f9661e;
            if (fVar2 != null) {
                p.s.e(background, fVar2, view.getDrawableState());
                return;
            }
            ah.f fVar3 = (ah.f) this.f9660d;
            if (fVar3 != null) {
                p.s.e(background, fVar3, view.getDrawableState());
            }
        }
    }

    public be1 b(kl.d dVar) {
        byte b10;
        nk.k.e(dVar, "descriptor");
        nl.b bVar = (nl.b) this.f9658b;
        ol.k kVarF = ol.g.f(dVar, bVar);
        ol.i iVar = (ol.i) this.f9660d;
        com.google.android.gms.common.api.internal.a0 a0Var = (com.google.android.gms.common.api.internal.a0) iVar.f30592c;
        int i4 = a0Var.f9069b + 1;
        a0Var.f9069b = i4;
        Object[] objArr = (Object[]) a0Var.f9070c;
        if (i4 == objArr.length) {
            int i10 = i4 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            a0Var.f9070c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) a0Var.f9071d, i10);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            a0Var.f9071d = iArrCopyOf;
        }
        ((Object[]) a0Var.f9070c)[i4] = dVar;
        iVar.e(kVarF.f30603a);
        String str = (String) iVar.f30594e;
        int i11 = iVar.f30591b;
        while (true) {
            int iN = iVar.n(i11);
            b10 = 10;
            if (iN == -1) {
                iVar.f30591b = iN;
                break;
            }
            char cCharAt = str.charAt(iN);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                iVar.f30591b = iN;
                b10 = ol.g.b(cCharAt);
                break;
            }
            i11 = iN + 1;
        }
        if (b10 != 4) {
            int iOrdinal = kVarF.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new be1(bVar, kVarF, iVar, dVar) : (((ol.k) this.f9659c) == kVarF && bVar.f29991a.f17302b) ? this : new be1(bVar, kVarF, iVar, dVar);
        }
        ol.i.k(iVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public boolean c(int i4) {
        ArrayList arrayList = (ArrayList) this.f9660d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i10);
            int i11 = aVar.f1289a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = aVar.f1290b;
                    int i13 = aVar.f1292d + i12;
                    while (i12 < i13) {
                        if (t(i12, i10 + 1) == i4) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (t(aVar.f1292d, i10 + 1) == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f9660d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((androidx.recyclerview.widget.r0) this.f9661e).a((androidx.recyclerview.widget.a) arrayList.get(i4));
        }
        D(arrayList);
        this.f9657a = 0;
    }

    public void e() {
        androidx.recyclerview.widget.r0 r0Var = (androidx.recyclerview.widget.r0) this.f9661e;
        d();
        ArrayList arrayList = (ArrayList) this.f9659c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i4);
            int i10 = aVar.f1289a;
            if (i10 == 1) {
                r0Var.a(aVar);
                r0Var.d(aVar.f1290b, aVar.f1292d);
            } else if (i10 == 2) {
                r0Var.a(aVar);
                int i11 = aVar.f1290b;
                int i12 = aVar.f1292d;
                RecyclerView recyclerView = r0Var.f1497a;
                recyclerView.W(i11, i12, true);
                recyclerView.f1238k0 = true;
                recyclerView.f1233h0.f1505c += i12;
            } else if (i10 == 4) {
                r0Var.a(aVar);
                r0Var.c(aVar.f1290b, aVar.f1292d, aVar.f1291c);
            } else if (i10 == 8) {
                r0Var.a(aVar);
                r0Var.e(aVar.f1290b, aVar.f1292d);
            }
        }
        D(arrayList);
        this.f9657a = 0;
    }

    public int f(kl.d dVar) {
        nl.b bVar = (nl.b) this.f9658b;
        ur0 ur0Var = bVar.f29991a;
        ol.i iVar = (ol.i) this.f9660d;
        nk.k.e(dVar, "descriptor");
        ol.k kVar = (ol.k) this.f9659c;
        int iOrdinal = kVar.ordinal();
        int i4 = 0;
        zQ = false;
        boolean zQ = false;
        int iIntValue = -1;
        if (iOrdinal == 0) {
            ol.f fVar = (ol.f) this.f9662f;
            ur0 ur0Var2 = (ur0) this.f9661e;
            boolean zQ2 = iVar.q();
            if (iVar.b()) {
                ur0Var2.getClass();
                String strD = iVar.d();
                iVar.e(':');
                nk.k.e(dVar, "<this>");
                nk.k.e(bVar, "json");
                nk.k.e(strD, "name");
                ur0 ur0Var3 = bVar.f29991a;
                ur0Var3.getClass();
                ol.g.e(dVar, bVar);
                int iD = dVar.d(strD);
                iIntValue = -3;
                if (iD == -3 && ur0Var3.f17303c) {
                    ol.d dVar2 = bVar.f29993c;
                    c0.p pVar = new c0.p(7, dVar, bVar);
                    dVar2.getClass();
                    dVar2.getClass();
                    nk.k.e(dVar, "descriptor");
                    Map map = (Map) dVar2.f30585a.get(dVar);
                    ol.h hVar = ol.g.f30588a;
                    Object obj = map != null ? map.get(hVar) : null;
                    Object objInvoke = obj != null ? obj : null;
                    if (objInvoke == null) {
                        objInvoke = pVar.invoke();
                        ConcurrentHashMap concurrentHashMap = dVar2.f30585a;
                        Object obj2 = concurrentHashMap.get(dVar);
                        Object obj3 = obj2;
                        if (obj2 == null) {
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(dVar, concurrentHashMap2);
                            obj3 = concurrentHashMap2;
                        }
                        ((Map) obj3).put(hVar, objInvoke);
                    }
                    Integer num = (Integer) ((Map) objInvoke).get(strD);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                } else {
                    iIntValue = iD;
                }
                if (iIntValue == -3) {
                    iVar.j(vk.i.J0(6, ((String) iVar.f30594e).subSequence(0, iVar.f30591b).toString(), strD), d.h.p('\'', "Encountered an unknown key '", strD), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
                if (fVar != null) {
                    ml.d dVar3 = fVar.f30586a;
                    if (iIntValue < 64) {
                        dVar3.f29407c |= 1 << iIntValue;
                    } else {
                        int i10 = (iIntValue >>> 6) - 1;
                        long[] jArr = dVar3.f29408d;
                        jArr[i10] = jArr[i10] | (1 << (iIntValue & 63));
                    }
                }
            } else {
                if (zQ2) {
                    ur0Var.getClass();
                    ol.g.c(iVar, "object");
                    throw null;
                }
                if (fVar != null) {
                    ml.d dVar4 = fVar.f30586a;
                    c0.i0 i0Var = dVar4.f29406b;
                    kl.d dVar5 = dVar4.f29405a;
                    int iF = dVar5.f();
                    while (true) {
                        long j = dVar4.f29407c;
                        long j8 = -1;
                        if (j != -1) {
                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                            dVar4.f29407c |= 1 << iNumberOfTrailingZeros;
                            if (((Boolean) i0Var.invoke(dVar5, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                iIntValue = iNumberOfTrailingZeros;
                                break;
                            }
                        } else if (iF > 64) {
                            long[] jArr2 = dVar4.f29408d;
                            int length = jArr2.length;
                            loop1: while (i4 < length) {
                                int i11 = i4 + 1;
                                int i12 = i11 * 64;
                                long j9 = jArr2[i4];
                                while (j9 != j8) {
                                    int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j9);
                                    j9 |= 1 << iNumberOfTrailingZeros2;
                                    iIntValue = iNumberOfTrailingZeros2 + i12;
                                    if (((Boolean) i0Var.invoke(dVar5, Integer.valueOf(iIntValue))).booleanValue()) {
                                        jArr2[i4] = j9;
                                        break loop1;
                                    }
                                    j8 = -1;
                                }
                                jArr2[i4] = j9;
                                i4 = i11;
                                j8 = -1;
                            }
                        }
                    }
                } else {
                    iIntValue = -1;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zQ3 = iVar.q();
            if (iVar.b()) {
                int i13 = this.f9657a;
                if (i13 != -1 && !zQ3) {
                    ol.i.k(iVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                iIntValue = i13 + 1;
                this.f9657a = iIntValue;
            } else if (zQ3) {
                ur0Var.getClass();
                ol.g.c(iVar, "array");
                throw null;
            }
        } else {
            int i14 = this.f9657a;
            boolean z3 = i14 % 2 != 0;
            if (!z3) {
                iVar.e(':');
            } else if (i14 != -1) {
                zQ = iVar.q();
            }
            if (iVar.b()) {
                if (z3) {
                    if (this.f9657a == -1) {
                        int i15 = iVar.f30591b;
                        if (zQ) {
                            ol.i.k(iVar, "Unexpected leading comma", i15, 4);
                            throw null;
                        }
                    } else {
                        int i16 = iVar.f30591b;
                        if (!zQ) {
                            ol.i.k(iVar, "Expected comma after the key-value pair", i16, 4);
                            throw null;
                        }
                    }
                }
                iIntValue = this.f9657a + 1;
                this.f9657a = iIntValue;
            } else if (zQ) {
                ur0Var.getClass();
                ol.g.c(iVar, "object");
                throw null;
            }
        }
        if (kVar != ol.k.f30600e) {
            com.google.android.gms.common.api.internal.a0 a0Var = (com.google.android.gms.common.api.internal.a0) iVar.f30592c;
            ((int[]) a0Var.f9071d)[a0Var.f9069b] = iIntValue;
        }
        return iIntValue;
    }

    public int g() {
        ol.i iVar = (ol.i) this.f9660d;
        long jF = iVar.f();
        int i4 = (int) jF;
        if (jF == i4) {
            return i4;
        }
        ol.i.k(iVar, "Failed to parse int for input '" + jF + '\'', 0, 6);
        throw null;
    }

    public int h(kl.d dVar, int i4) {
        nk.k.e(dVar, "descriptor");
        return g();
    }

    public long i() {
        return ((ol.i) this.f9660d).f();
    }

    public long j(kl.d dVar, int i4) {
        nk.k.e(dVar, "descriptor");
        return i();
    }

    public boolean k() {
        ol.f fVar = (ol.f) this.f9662f;
        if (!(fVar != null ? fVar.f30587b : false)) {
            ol.i iVar = (ol.i) this.f9660d;
            int iN = iVar.n(iVar.p());
            String str = (String) iVar.f30594e;
            int length = str.length() - iN;
            boolean z3 = false;
            if (length >= 4 && iN != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 < 4) {
                        if ("null".charAt(i4) != str.charAt(iN + i4)) {
                            break;
                        }
                        i4++;
                    } else if (length <= 4 || ol.g.b(str.charAt(iN + 4)) != 0) {
                        z3 = true;
                        iVar.f30591b = iN + 4;
                    }
                }
            }
            if (!z3) {
                return true;
            }
        }
        return false;
    }

    public Object l(kl.d dVar, int i4, il.a aVar, Object obj) {
        nk.k.e(dVar, "descriptor");
        nk.k.e(aVar, "deserializer");
        if (aVar.d().c() || k()) {
            return n(aVar);
        }
        return null;
    }

    public Object m(kl.d dVar, int i4, il.a aVar, Object obj) {
        com.google.android.gms.common.api.internal.a0 a0Var = (com.google.android.gms.common.api.internal.a0) ((ol.i) this.f9660d).f30592c;
        nk.k.e(dVar, "descriptor");
        nk.k.e(aVar, "deserializer");
        boolean z3 = ((ol.k) this.f9659c) == ol.k.f30600e && (i4 & 1) == 0;
        if (z3) {
            int[] iArr = (int[]) a0Var.f9071d;
            int i10 = a0Var.f9069b;
            if (iArr[i10] == -2) {
                ((Object[]) a0Var.f9070c)[i10] = ol.h.f30589a;
            }
        }
        nk.k.e(dVar, "descriptor");
        nk.k.e(aVar, "deserializer");
        Object objN = n(aVar);
        if (z3) {
            int[] iArr2 = (int[]) a0Var.f9071d;
            int i11 = a0Var.f9069b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                a0Var.f9069b = i12;
                Object[] objArr = (Object[]) a0Var.f9070c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
                    nk.k.d(objArrCopyOf, "copyOf(...)");
                    a0Var.f9070c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) a0Var.f9071d, i13);
                    nk.k.d(iArrCopyOf, "copyOf(...)");
                    a0Var.f9071d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) a0Var.f9070c;
            int i14 = a0Var.f9069b;
            objArr2[i14] = objN;
            ((int[]) a0Var.f9071d)[i14] = -2;
        }
        return objN;
    }

    public Object n(il.a aVar) {
        nk.k.e(aVar, "deserializer");
        try {
            return aVar.a(this);
        } catch (il.b e2) {
            String message = e2.getMessage();
            nk.k.b(message);
            if (vk.i.y0(message, "at path", false)) {
                throw e2;
            }
            throw new il.b(e2.f26015a, e2.getMessage() + " at path: " + ((com.google.android.gms.common.api.internal.a0) ((ol.i) this.f9660d).f30592c).f(), e2);
        }
    }

    public String o() {
        ol.i iVar = (ol.i) this.f9660d;
        ((ur0) this.f9661e).getClass();
        return iVar.g();
    }

    public String p(kl.d dVar, int i4) {
        nk.k.e(dVar, "descriptor");
        return o();
    }

    public void q(androidx.recyclerview.widget.a aVar) {
        int i4;
        d4.d dVar = (d4.d) this.f9658b;
        int i10 = aVar.f1289a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iH = H(aVar.f1290b, i10);
        int i11 = aVar.f1290b;
        int i12 = aVar.f1289a;
        if (i12 == 2) {
            i4 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i4 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < aVar.f1292d; i14++) {
            int iH2 = H((i4 * i14) + aVar.f1290b, aVar.f1289a);
            int i15 = aVar.f1289a;
            if (i15 == 2 ? iH2 != iH : !(i15 == 4 && iH2 == iH + 1)) {
                androidx.recyclerview.widget.a aVarY = y(aVar.f1291c, i15, iH, i13);
                r(aVarY, i11);
                aVarY.f1291c = null;
                dVar.i(aVarY);
                if (aVar.f1289a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                iH = iH2;
            } else {
                i13++;
            }
        }
        Object obj = aVar.f1291c;
        aVar.f1291c = null;
        dVar.i(aVar);
        if (i13 > 0) {
            androidx.recyclerview.widget.a aVarY2 = y(obj, aVar.f1289a, iH, i13);
            r(aVarY2, i11);
            aVarY2.f1291c = null;
            dVar.i(aVarY2);
        }
    }

    public void r(androidx.recyclerview.widget.a aVar, int i4) {
        androidx.recyclerview.widget.r0 r0Var = (androidx.recyclerview.widget.r0) this.f9661e;
        r0Var.a(aVar);
        int i10 = aVar.f1289a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            r0Var.c(i4, aVar.f1292d, aVar.f1291c);
        } else {
            int i11 = aVar.f1292d;
            RecyclerView recyclerView = r0Var.f1497a;
            recyclerView.W(i4, i11, true);
            recyclerView.f1238k0 = true;
            recyclerView.f1233h0.f1505c += i11;
        }
    }

    public void s(kl.d dVar) {
        ol.i iVar = (ol.i) this.f9660d;
        nk.k.e(dVar, "descriptor");
        ur0 ur0Var = ((nl.b) this.f9658b).f29991a;
        ur0Var.getClass();
        if (iVar.q()) {
            ur0Var.getClass();
            ol.g.c(iVar, "");
            throw null;
        }
        iVar.e(((ol.k) this.f9659c).f30604b);
        com.google.android.gms.common.api.internal.a0 a0Var = (com.google.android.gms.common.api.internal.a0) iVar.f30592c;
        int i4 = a0Var.f9069b;
        int[] iArr = (int[]) a0Var.f9071d;
        if (iArr[i4] == -2) {
            iArr[i4] = -1;
            a0Var.f9069b = i4 - 1;
        }
        int i10 = a0Var.f9069b;
        if (i10 != -1) {
            a0Var.f9069b = i10 - 1;
        }
    }

    public int t(int i4, int i10) {
        ArrayList arrayList = (ArrayList) this.f9660d;
        int size = arrayList.size();
        while (i10 < size) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i10);
            int i11 = aVar.f1289a;
            if (i11 == 8) {
                int i12 = aVar.f1290b;
                if (i12 == i4) {
                    i4 = aVar.f1292d;
                } else {
                    if (i12 < i4) {
                        i4--;
                    }
                    if (aVar.f1292d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i13 = aVar.f1290b;
                if (i13 > i4) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.f1292d;
                    if (i4 < i13 + i14) {
                        return -1;
                    }
                    i4 -= i14;
                } else if (i11 == 1) {
                    i4 += aVar.f1292d;
                }
            }
            i10++;
        }
        return i4;
    }

    public ColorStateList u() {
        ah.f fVar = (ah.f) this.f9661e;
        if (fVar != null) {
            return (ColorStateList) fVar.f382c;
        }
        return null;
    }

    public PorterDuff.Mode v() {
        ah.f fVar = (ah.f) this.f9661e;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.f383d;
        }
        return null;
    }

    public boolean w() {
        return ((ArrayList) this.f9659c).size() > 0;
    }

    public void x(AttributeSet attributeSet, int i4) {
        ColorStateList colorStateListI;
        View view = (View) this.f9658b;
        Context context = view.getContext();
        int[] iArr = h.a.A;
        i0.f fVarJ = i0.f.J(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        View view2 = (View) this.f9658b;
        e4.v0.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) fVarJ.f25417c, i4);
        try {
            if (typedArray.hasValue(0)) {
                this.f9657a = typedArray.getResourceId(0, -1);
                p.s sVar = (p.s) this.f9659c;
                Context context2 = view.getContext();
                int i10 = this.f9657a;
                synchronized (sVar) {
                    colorStateListI = sVar.f30852a.i(i10, context2);
                }
                if (colorStateListI != null) {
                    E(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                e4.m0.g(view, fVarJ.y(1));
            }
            if (typedArray.hasValue(2)) {
                e4.m0.h(view, p.i1.c(typedArray.getInt(2, -1), null));
            }
            fVarJ.M();
        } catch (Throwable th2) {
            fVarJ.M();
            throw th2;
        }
    }

    public androidx.recyclerview.widget.a y(Object obj, int i4, int i10, int i11) {
        androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) ((d4.d) this.f9658b).k();
        if (aVar != null) {
            aVar.f1289a = i4;
            aVar.f1290b = i10;
            aVar.f1292d = i11;
            aVar.f1291c = obj;
            return aVar;
        }
        androidx.recyclerview.widget.a aVar2 = new androidx.recyclerview.widget.a();
        aVar2.f1289a = i4;
        aVar2.f1290b = i10;
        aVar2.f1292d = i11;
        aVar2.f1291c = obj;
        return aVar2;
    }

    public void z() {
        this.f9657a = -1;
        E(null);
        a();
    }

    public be1(nl.b bVar, ol.k kVar, ol.i iVar, kl.d dVar) {
        nk.k.e(dVar, "descriptor");
        this.f9658b = bVar;
        this.f9659c = kVar;
        this.f9660d = iVar;
        this.f9657a = -1;
        ur0 ur0Var = bVar.f29991a;
        this.f9661e = ur0Var;
        this.f9662f = ur0Var.f17302b ? null : new ol.f(dVar);
    }

    public be1(View view) {
        this.f9657a = -1;
        this.f9658b = view;
        this.f9659c = p.s.a();
    }

    public be1() {
        this.f9658b = new g2.n[32];
        this.f9659c = new float[32];
        this.f9660d = new byte[32];
        x.f0 f0Var = x.m0.f36916a;
        this.f9661e = new x.f0();
        this.f9662f = new x.f0();
    }
}
