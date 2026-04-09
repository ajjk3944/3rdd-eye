package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2234zQ extends AbstractC1047dQ {

    /* renamed from: r, reason: collision with root package name */
    public static final C1241h2 f17876r;

    /* renamed from: k, reason: collision with root package name */
    public final XP[] f17877k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f17878l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1353j8[] f17879m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f17880n;

    /* renamed from: o, reason: collision with root package name */
    public int f17881o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f17882p;

    /* renamed from: q, reason: collision with root package name */
    public EK f17883q;

    static {
        JB jb = LB.f9635b;
        C1197gC c1197gC = C1197gC.f14227e;
        List list = Collections.EMPTY_LIST;
        C1993v1 c1993v1 = C1993v1.f17203a;
        f17876r = new C1241h2("MergingMediaSource", new G(), null, new C2154y0(), C1348j3.f14865B);
    }

    public C2234zQ(EO eo, XP... xpArr) {
        this.f17877k = xpArr;
        this.f17880n = new ArrayList(Arrays.asList(xpArr));
        this.f17878l = new ArrayList(xpArr.length);
        int i = 0;
        while (true) {
            int length = xpArr.length;
            if (i >= length) {
                this.f17879m = new AbstractC1353j8[length];
                this.f17882p = new long[0][];
                new HashMap();
                AbstractC0582Jp.m(new AB(0).isEmpty());
                return;
            }
            this.f17878l.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void a(C1241h2 c1241h2) {
        this.f17877k[0].a(c1241h2);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void b(InterfaceC1695pQ interfaceC1695pQ) {
        C2072wQ c2072wQ = (C2072wQ) interfaceC1695pQ;
        int i = 0;
        while (true) {
            XP[] xpArr = this.f17877k;
            if (i >= xpArr.length) {
                return;
            }
            List list = (List) this.f17878l.get(i);
            InterfaceC1695pQ[] interfaceC1695pQArr = c2072wQ.f17438a;
            boolean[] zArr = c2072wQ.f17439b;
            InterfaceC1695pQ interfaceC1695pQ2 = zArr[i] ? ((RQ) interfaceC1695pQArr[i]).f10910a : interfaceC1695pQArr[i];
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                if (((C2180yQ) list.get(i3)).f17722b.equals(interfaceC1695pQ2)) {
                    list.remove(i3);
                    break;
                }
                i3++;
            }
            XP xp = xpArr[i];
            InterfaceC1695pQ[] interfaceC1695pQArr2 = c2072wQ.f17438a;
            xp.b(zArr[i] ? ((RQ) interfaceC1695pQArr2[i]).f10910a : interfaceC1695pQArr2[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final InterfaceC1695pQ c(C1749qQ c1749qQ, InterfaceC1292i interfaceC1292i, long j6) {
        XP[] xpArr = this.f17877k;
        int length = xpArr.length;
        InterfaceC1695pQ[] interfaceC1695pQArr = new InterfaceC1695pQ[length];
        AbstractC1353j8[] abstractC1353j8Arr = this.f17879m;
        int iE = abstractC1353j8Arr[0].e(c1749qQ.f16374a);
        for (int i = 0; i < length; i++) {
            C1749qQ c1749qQA = c1749qQ.a(abstractC1353j8Arr[i].f(iE));
            interfaceC1695pQArr[i] = xpArr[i].c(c1749qQA, interfaceC1292i, j6 - this.f17882p[iE][i]);
            ((List) this.f17878l.get(i)).add(new C2180yQ(c1749qQA, interfaceC1695pQArr[i]));
        }
        return new C2072wQ(this.f17882p[iE], interfaceC1695pQArr);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final C1241h2 f() {
        XP[] xpArr = this.f17877k;
        return xpArr.length > 0 ? xpArr[0].f() : f17876r;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void h(InterfaceC1958uK interfaceC1958uK) {
        this.f13765j = interfaceC1958uK;
        this.i = Vt.n();
        int i = 0;
        while (true) {
            XP[] xpArr = this.f17877k;
            if (i >= xpArr.length) {
                return;
            }
            t(Integer.valueOf(i), xpArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ, com.google.android.gms.internal.ads.XP
    public final void j() {
        super.j();
        Arrays.fill(this.f17879m, (Object) null);
        this.f17881o = -1;
        this.f17883q = null;
        ArrayList arrayList = this.f17880n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f17877k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ, com.google.android.gms.internal.ads.XP
    public final void r() throws EK {
        EK ek = this.f17883q;
        if (ek != null) {
            throw ek;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ
    public final void s(Object obj, XP xp, AbstractC1353j8 abstractC1353j8) {
        int iC;
        Integer num = (Integer) obj;
        if (this.f17883q != null) {
            return;
        }
        if (this.f17881o == -1) {
            iC = abstractC1353j8.c();
            this.f17881o = iC;
        } else {
            int iC2 = abstractC1353j8.c();
            int i = this.f17881o;
            if (iC2 != i) {
                this.f17883q = new EK();
                return;
            }
            iC = i;
        }
        int length = this.f17882p.length;
        AbstractC1353j8[] abstractC1353j8Arr = this.f17879m;
        if (length == 0) {
            this.f17882p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iC, abstractC1353j8Arr.length);
        }
        ArrayList arrayList = this.f17880n;
        arrayList.remove(xp);
        abstractC1353j8Arr[num.intValue()] = abstractC1353j8;
        if (arrayList.isEmpty()) {
            k(abstractC1353j8Arr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ
    public final /* synthetic */ C1749qQ v(Object obj, C1749qQ c1749qQ) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f17878l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C2180yQ) list.get(i)).f17721a.equals(c1749qQ)) {
                return ((C2180yQ) ((List) arrayList.get(0)).get(i)).f17721a;
            }
        }
        return null;
    }
}
