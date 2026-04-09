package r0;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import r0.C5508e;
import s0.C5543b;
import s0.C5544c;
import s0.p;

/* compiled from: ConstraintWidgetContainer.java */
/* renamed from: r0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5509f extends l {

    /* renamed from: A0, reason: collision with root package name */
    public int f45585A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f45586B0;

    /* renamed from: C0, reason: collision with root package name */
    public C5506c[] f45587C0;

    /* renamed from: D0, reason: collision with root package name */
    public C5506c[] f45588D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f45589E0;
    public boolean F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f45590G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference<C5507d> f45591H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference<C5507d> f45592I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference<C5507d> f45593J0;

    /* renamed from: K0, reason: collision with root package name */
    public WeakReference<C5507d> f45594K0;

    /* renamed from: L0, reason: collision with root package name */
    public final HashSet<C5508e> f45595L0;

    /* renamed from: M0, reason: collision with root package name */
    public final C5543b.a f45596M0;

    /* renamed from: s0, reason: collision with root package name */
    public final C5543b f45597s0 = new C5543b(this);

    /* renamed from: t0, reason: collision with root package name */
    public final s0.e f45598t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f45599u0;

    /* renamed from: v0, reason: collision with root package name */
    public C5543b.InterfaceC0526b f45600v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f45601w0;

    /* renamed from: x0, reason: collision with root package name */
    public final p0.c f45602x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f45603y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f45604z0;

    public C5509f() {
        s0.e eVar = new s0.e();
        eVar.f45913b = true;
        eVar.f45914c = true;
        eVar.f45916e = new ArrayList<>();
        new ArrayList();
        eVar.f45917f = null;
        eVar.f45918g = new C5543b.a();
        eVar.f45919h = new ArrayList<>();
        eVar.f45912a = this;
        eVar.f45915d = this;
        this.f45598t0 = eVar;
        this.f45600v0 = null;
        this.f45601w0 = false;
        this.f45602x0 = new p0.c();
        this.f45585A0 = 0;
        this.f45586B0 = 0;
        this.f45587C0 = new C5506c[4];
        this.f45588D0 = new C5506c[4];
        this.f45589E0 = 257;
        this.F0 = false;
        this.f45590G0 = false;
        this.f45591H0 = null;
        this.f45592I0 = null;
        this.f45593J0 = null;
        this.f45594K0 = null;
        this.f45595L0 = new HashSet<>();
        this.f45596M0 = new C5543b.a();
    }

    public static void V(C5508e c5508e, C5543b.InterfaceC0526b interfaceC0526b, C5543b.a aVar) {
        int i;
        int i10;
        if (interfaceC0526b == null) {
            return;
        }
        if (c5508e.f45557i0 == 8 || (c5508e instanceof C5511h) || (c5508e instanceof C5504a)) {
            aVar.f45905e = 0;
            aVar.f45906f = 0;
            return;
        }
        C5508e.b[] bVarArr = c5508e.f45535U;
        aVar.f45901a = bVarArr[0];
        aVar.f45902b = bVarArr[1];
        aVar.f45903c = c5508e.q();
        aVar.f45904d = c5508e.k();
        aVar.i = false;
        aVar.f45909j = 0;
        C5508e.b bVar = aVar.f45901a;
        C5508e.b bVar2 = C5508e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f45902b == bVar2;
        boolean z12 = z10 && c5508e.f45539Y > 0.0f;
        boolean z13 = z11 && c5508e.f45539Y > 0.0f;
        if (z10 && c5508e.t(0) && c5508e.f45574r == 0 && !z12) {
            aVar.f45901a = C5508e.b.WRAP_CONTENT;
            if (z11 && c5508e.f45575s == 0) {
                aVar.f45901a = C5508e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && c5508e.t(1) && c5508e.f45575s == 0 && !z13) {
            aVar.f45902b = C5508e.b.WRAP_CONTENT;
            if (z10 && c5508e.f45574r == 0) {
                aVar.f45902b = C5508e.b.FIXED;
            }
            z11 = false;
        }
        if (c5508e.A()) {
            aVar.f45901a = C5508e.b.FIXED;
            z10 = false;
        }
        if (c5508e.B()) {
            aVar.f45902b = C5508e.b.FIXED;
            z11 = false;
        }
        int[] iArr = c5508e.f45576t;
        if (z12) {
            if (iArr[0] == 4) {
                aVar.f45901a = C5508e.b.FIXED;
            } else if (!z11) {
                C5508e.b bVar3 = aVar.f45902b;
                C5508e.b bVar4 = C5508e.b.FIXED;
                if (bVar3 == bVar4) {
                    i10 = aVar.f45904d;
                } else {
                    aVar.f45901a = C5508e.b.WRAP_CONTENT;
                    ((ConstraintLayout.c) interfaceC0526b).b(c5508e, aVar);
                    i10 = aVar.f45906f;
                }
                aVar.f45901a = bVar4;
                aVar.f45903c = (int) (c5508e.f45539Y * i10);
            }
        }
        if (z13) {
            if (iArr[1] == 4) {
                aVar.f45902b = C5508e.b.FIXED;
            } else if (!z10) {
                C5508e.b bVar5 = aVar.f45901a;
                C5508e.b bVar6 = C5508e.b.FIXED;
                if (bVar5 == bVar6) {
                    i = aVar.f45903c;
                } else {
                    aVar.f45902b = C5508e.b.WRAP_CONTENT;
                    ((ConstraintLayout.c) interfaceC0526b).b(c5508e, aVar);
                    i = aVar.f45905e;
                }
                aVar.f45902b = bVar6;
                if (c5508e.f45540Z == -1) {
                    aVar.f45904d = (int) (i / c5508e.f45539Y);
                } else {
                    aVar.f45904d = (int) (c5508e.f45539Y * i);
                }
            }
        }
        ((ConstraintLayout.c) interfaceC0526b).b(c5508e, aVar);
        c5508e.O(aVar.f45905e);
        c5508e.L(aVar.f45906f);
        c5508e.f45519E = aVar.f45908h;
        c5508e.I(aVar.f45907g);
        aVar.f45909j = 0;
    }

    @Override // r0.l, r0.C5508e
    public final void C() {
        this.f45602x0.t();
        this.f45603y0 = 0;
        this.f45604z0 = 0;
        super.C();
    }

    @Override // r0.C5508e
    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.f45667r0.size();
        for (int i = 0; i < size; i++) {
            this.f45667r0.get(i).P(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:361:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x084b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08b6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0928 A[PHI: r13 r14
  0x0928: PHI (r13v6 boolean) = (r13v5 boolean), (r13v8 boolean), (r13v8 boolean), (r13v8 boolean) binds: [B:513:0x08f1, B:521:0x0910, B:522:0x0912, B:524:0x0918] A[DONT_GENERATE, DONT_INLINE]
  0x0928: PHI (r14v10 boolean) = (r14v9 boolean), (r14v14 boolean), (r14v14 boolean), (r14v14 boolean) binds: [B:513:0x08f1, B:521:0x0910, B:522:0x0912, B:524:0x0918] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x092d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // r0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 2378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C5509f.R():void");
    }

    public final void S(C5508e c5508e, int i) {
        if (i == 0) {
            int i10 = this.f45585A0 + 1;
            C5506c[] c5506cArr = this.f45588D0;
            if (i10 >= c5506cArr.length) {
                this.f45588D0 = (C5506c[]) Arrays.copyOf(c5506cArr, c5506cArr.length * 2);
            }
            C5506c[] c5506cArr2 = this.f45588D0;
            int i11 = this.f45585A0;
            c5506cArr2[i11] = new C5506c(c5508e, 0, this.f45601w0);
            this.f45585A0 = i11 + 1;
            return;
        }
        if (i == 1) {
            int i12 = this.f45586B0 + 1;
            C5506c[] c5506cArr3 = this.f45587C0;
            if (i12 >= c5506cArr3.length) {
                this.f45587C0 = (C5506c[]) Arrays.copyOf(c5506cArr3, c5506cArr3.length * 2);
            }
            C5506c[] c5506cArr4 = this.f45587C0;
            int i13 = this.f45586B0;
            c5506cArr4[i13] = new C5506c(c5508e, 1, this.f45601w0);
            this.f45586B0 = i13 + 1;
        }
    }

    public final void T(p0.c cVar) {
        C5509f c5509f;
        p0.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f45667r0.size();
        boolean z10 = false;
        for (int i = 0; i < size; i++) {
            C5508e c5508e = this.f45667r0.get(i);
            boolean[] zArr = c5508e.f45534T;
            zArr[0] = false;
            zArr[1] = false;
            if (c5508e instanceof C5504a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i10 = 0; i10 < size; i10++) {
                C5508e c5508e2 = this.f45667r0.get(i10);
                if (c5508e2 instanceof C5504a) {
                    C5504a c5504a = (C5504a) c5508e2;
                    for (int i11 = 0; i11 < c5504a.f45654s0; i11++) {
                        C5508e c5508e3 = c5504a.f45653r0[i11];
                        if (c5504a.f45487u0 || c5508e3.c()) {
                            int i12 = c5504a.f45486t0;
                            if (i12 == 0 || i12 == 1) {
                                c5508e3.f45534T[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                c5508e3.f45534T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<C5508e> hashSet = this.f45595L0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            C5508e c5508e4 = this.f45667r0.get(i13);
            c5508e4.getClass();
            boolean z11 = c5508e4 instanceof C5514k;
            if (z11 || (c5508e4 instanceof C5511h)) {
                if (z11) {
                    hashSet.add(c5508e4);
                } else {
                    c5508e4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<C5508e> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5514k c5514k = (C5514k) it.next();
                for (int i14 = 0; i14 < c5514k.f45654s0; i14++) {
                    if (hashSet.contains(c5514k.f45653r0[i14])) {
                        c5514k.b(cVar, zW);
                        hashSet.remove(c5514k);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<C5508e> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (p0.c.f44980p) {
            HashSet<C5508e> hashSet2 = new HashSet<>();
            for (int i15 = 0; i15 < size; i15++) {
                C5508e c5508e5 = this.f45667r0.get(i15);
                c5508e5.getClass();
                if (!(c5508e5 instanceof C5514k) && !(c5508e5 instanceof C5511h)) {
                    hashSet2.add(c5508e5);
                }
            }
            c5509f = this;
            cVar2 = cVar;
            c5509f.a(this, cVar2, hashSet2, this.f45535U[0] == C5508e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<C5508e> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C5508e next = it3.next();
                C5513j.a(this, cVar2, next);
                next.b(cVar2, zW);
            }
        } else {
            c5509f = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                C5508e c5508e6 = c5509f.f45667r0.get(i16);
                if (c5508e6 instanceof C5509f) {
                    C5508e.b[] bVarArr = c5508e6.f45535U;
                    C5508e.b bVar = bVarArr[0];
                    C5508e.b bVar2 = bVarArr[1];
                    C5508e.b bVar3 = C5508e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c5508e6.M(C5508e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c5508e6.N(C5508e.b.FIXED);
                    }
                    c5508e6.b(cVar2, zW);
                    if (bVar == bVar3) {
                        c5508e6.M(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c5508e6.N(bVar2);
                    }
                } else {
                    C5513j.a(this, cVar2, c5508e6);
                    if (!(c5508e6 instanceof C5514k) && !(c5508e6 instanceof C5511h)) {
                        c5508e6.b(cVar2, zW);
                    }
                }
            }
        }
        if (c5509f.f45585A0 > 0) {
            C5505b.a(this, cVar2, null, 0);
        }
        if (c5509f.f45586B0 > 0) {
            C5505b.a(this, cVar2, null, 1);
        }
    }

    public final boolean U(int i, boolean z10) {
        boolean z11;
        C5508e.b bVar;
        s0.e eVar = this.f45598t0;
        C5509f c5509f = eVar.f45912a;
        boolean z12 = false;
        C5508e.b bVarJ = c5509f.j(0);
        C5508e.b bVarJ2 = c5509f.j(1);
        int iR = c5509f.r();
        int iS = c5509f.s();
        ArrayList<p> arrayList = eVar.f45916e;
        if (z10 && (bVarJ == (bVar = C5508e.b.WRAP_CONTENT) || bVarJ2 == bVar)) {
            Iterator<p> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f45951f == i && !next.k()) {
                    z10 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z10 && bVarJ == C5508e.b.WRAP_CONTENT) {
                    c5509f.M(C5508e.b.FIXED);
                    c5509f.O(eVar.d(c5509f, 0));
                    c5509f.f45547d.f45950e.d(c5509f.q());
                }
            } else if (z10 && bVarJ2 == C5508e.b.WRAP_CONTENT) {
                c5509f.N(C5508e.b.FIXED);
                c5509f.L(eVar.d(c5509f, 1));
                c5509f.f45549e.f45950e.d(c5509f.k());
            }
        }
        C5508e.b[] bVarArr = c5509f.f45535U;
        if (i == 0) {
            C5508e.b bVar2 = bVarArr[0];
            if (bVar2 == C5508e.b.FIXED || bVar2 == C5508e.b.MATCH_PARENT) {
                int iQ = c5509f.q() + iR;
                c5509f.f45547d.i.d(iQ);
                c5509f.f45547d.f45950e.d(iQ - iR);
                z11 = true;
            }
            z11 = false;
        } else {
            C5508e.b bVar3 = bVarArr[1];
            if (bVar3 == C5508e.b.FIXED || bVar3 == C5508e.b.MATCH_PARENT) {
                int iK = c5509f.k() + iS;
                c5509f.f45549e.i.d(iK);
                c5509f.f45549e.f45950e.d(iK - iS);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f45951f == i && (next2.f45947b != c5509f || next2.f45952g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it3.next();
            if (next3.f45951f == i && (z11 || next3.f45947b != c5509f)) {
                if (!next3.f45953h.f45928j || !next3.i.f45928j || (!(next3 instanceof C5544c) && !next3.f45950e.f45928j)) {
                    break;
                }
            }
        }
        c5509f.M(bVarJ);
        c5509f.N(bVarJ2);
        return z12;
    }

    public final boolean W(int i) {
        return (this.f45589E0 & i) == i;
    }

    @Override // r0.C5508e
    public final void n(StringBuilder sb) {
        sb.append(this.f45558j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f45537W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f45538X);
        sb.append("\n");
        Iterator<C5508e> it = this.f45667r0.iterator();
        while (it.hasNext()) {
            it.next().n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
