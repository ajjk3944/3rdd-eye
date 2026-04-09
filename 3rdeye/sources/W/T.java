package W;

import C.e0;
import C.k0;
import C.m0;
import N.s;
import N7.B8;
import N7.G8;
import W.O;
import W.Z;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1696j0;
import androidx.camera.core.impl.C1697k;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.InterfaceC1708p0;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import b0.C1811b;
import c0.C2037i;
import c0.C2039k;
import c0.C2040l;
import c0.C2041m;
import com.applovin.impl.G0;
import d0.AbstractC4254A;
import d0.InterfaceC4256C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import o0.b;
import r.InterfaceC5503a;

/* compiled from: VideoCapture.java */
/* loaded from: classes.dex */
public final class T<T extends Z> extends m0 {

    /* renamed from: D, reason: collision with root package name */
    public static final c f13186D = new c();

    /* renamed from: A, reason: collision with root package name */
    public d f13187A;

    /* renamed from: B, reason: collision with root package name */
    public H0.c f13188B;

    /* renamed from: C, reason: collision with root package name */
    public final a f13189C;

    /* renamed from: p, reason: collision with root package name */
    public androidx.camera.core.impl.X f13190p;

    /* renamed from: q, reason: collision with root package name */
    public N.s f13191q;

    /* renamed from: r, reason: collision with root package name */
    public O f13192r;

    /* renamed from: s, reason: collision with root package name */
    public H0.b f13193s;

    /* renamed from: t, reason: collision with root package name */
    public b.d f13194t;

    /* renamed from: u, reason: collision with root package name */
    public k0 f13195u;

    /* renamed from: v, reason: collision with root package name */
    public Z.a f13196v;

    /* renamed from: w, reason: collision with root package name */
    public N.v f13197w;

    /* renamed from: x, reason: collision with root package name */
    public Rect f13198x;

    /* renamed from: y, reason: collision with root package name */
    public int f13199y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13200z;

    /* compiled from: VideoCapture.java */
    public class a implements InterfaceC1715t0.a<O> {
        public a() {
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void a(O o10) {
            O o11 = o10;
            if (o11 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            T t10 = T.this;
            if (t10.f13196v == Z.a.INACTIVE) {
                return;
            }
            C.S.a("VideoCapture", "Stream info update: old: " + t10.f13192r + " new: " + o11);
            O o12 = t10.f13192r;
            t10.f13192r = o11;
            L0 l02 = t10.f754g;
            l02.getClass();
            int iA = o12.a();
            int iA2 = o11.a();
            Set<Integer> set = O.f13175b;
            if ((!set.contains(Integer.valueOf(iA)) && !set.contains(Integer.valueOf(iA2)) && iA != iA2) || (t10.f13200z && o12.b() != null && o11.b() == null)) {
                t10.K();
                return;
            }
            if ((o12.a() != -1 && o11.a() == -1) || (o12.a() == -1 && o11.a() != -1)) {
                t10.E(t10.f13193s, o11, l02);
                Object[] objArr = {t10.f13193s.d()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                t10.B(Collections.unmodifiableList(arrayList));
                t10.o();
                return;
            }
            if (o12.c() != o11.c()) {
                t10.E(t10.f13193s, o11, l02);
                Object[] objArr2 = {t10.f13193s.d()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                t10.B(Collections.unmodifiableList(arrayList2));
                Iterator it = t10.f748a.iterator();
                while (it.hasNext()) {
                    ((m0.b) it.next()).p(t10);
                }
            }
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void onError(Throwable th) {
            C.S.h("VideoCapture", "Receive onError from StreamState observer", th);
        }
    }

    /* compiled from: VideoCapture.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final X.a<?> f13203a;

        /* renamed from: b, reason: collision with root package name */
        public static final Range<Integer> f13204b;

        /* renamed from: c, reason: collision with root package name */
        public static final C.C f13205c;

        static {
            W w10 = new W();
            G0 g02 = d0.D.f37196c;
            f13204b = new Range<>(30, 30);
            C.C c10 = C.C.f616d;
            f13205c = c10;
            b bVar = new b(w10);
            C1683d c1683d = T0.f14975z;
            C1710q0 c1710q0 = bVar.f13202a;
            c1710q0.N(c1683d, 5);
            c1710q0.N(X.a.f13414I, g02);
            c1710q0.N(InterfaceC1694i0.f15058k, c10);
            f13203a = new X.a<>(C1717u0.J(c1710q0));
        }
    }

    /* compiled from: VideoCapture.java */
    public static class d implements InterfaceC1715t0.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public androidx.camera.core.impl.F f13206a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f13207b;

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void a(Boolean bool) {
            A2.l.q("SourceStreamRequirementObserver can be updated from main thread only", G.n.b());
            boolean zEquals = Boolean.TRUE.equals(bool);
            if (this.f13207b == zEquals) {
                return;
            }
            this.f13207b = zEquals;
            androidx.camera.core.impl.F f10 = this.f13206a;
            if (f10 == null) {
                C.S.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (zEquals) {
                f10.k();
            } else {
                f10.a();
            }
        }

        public final void b() {
            A2.l.q("SourceStreamRequirementObserver can be closed from main thread only", G.n.b());
            C.S.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f13207b);
            androidx.camera.core.impl.F f10 = this.f13206a;
            if (f10 == null) {
                C.S.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
                return;
            }
            if (this.f13207b) {
                this.f13207b = false;
                if (f10 != null) {
                    f10.a();
                } else {
                    C.S.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
                }
            }
            this.f13206a = null;
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void onError(Throwable th) {
            C.S.h("VideoCapture", "SourceStreamRequirementObserver#onError", th);
        }
    }

    public T(X.a<T> aVar) {
        super(aVar);
        this.f13192r = O.f13174a;
        this.f13193s = new H0.b();
        this.f13194t = null;
        this.f13196v = Z.a.INACTIVE;
        this.f13200z = false;
        this.f13189C = new a();
    }

    public static void C(HashSet hashSet, int i, int i10, Size size, InterfaceC4256C interfaceC4256C) {
        if (i > size.getWidth() || i10 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) interfaceC4256C.f(i).clamp(Integer.valueOf(i10))).intValue()));
        } catch (IllegalArgumentException e4) {
            C.S.h("VideoCapture", "No supportedHeights for width: " + i, e4);
        }
        try {
            hashSet.add(new Size(((Integer) interfaceC4256C.e(i10).clamp(Integer.valueOf(i))).intValue(), i10));
        } catch (IllegalArgumentException e10) {
            C.S.h("VideoCapture", "No supportedWidths for height: " + i10, e10);
        }
    }

    public static int D(boolean z10, int i, int i10, Range<Integer> range) {
        int i11 = i % i10;
        if (i11 != 0) {
            i = z10 ? i - i11 : i + (i10 - i11);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static InterfaceC4256C L(InterfaceC5503a<AbstractC4254A, InterfaceC4256C> interfaceC5503a, Y.f fVar, AbstractC1630s abstractC1630s, Size size, C.C c10, Range<Integer> range) {
        C2037i c2037iB = C2039k.b(abstractC1630s, c10, fVar);
        Q0 q02 = Q0.UPTIME;
        b0 b0VarD = abstractC1630s.d();
        InterfaceC1680b0.c cVar = c2037iB.f18355c;
        InterfaceC4256C interfaceC4256CApply = interfaceC5503a.apply((AbstractC4254A) (cVar != null ? new C2041m(c2037iB.f18353a, q02, b0VarD, size, cVar, c10, range) : new C2040l(c2037iB.f18353a, q02, b0VarD, size, c10, range)).get());
        if (interfaceC4256CApply != null) {
            return f0.c.k(interfaceC4256CApply, fVar != null ? new Size(fVar.f().j(), fVar.f().g()) : null);
        }
        C.S.g("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    public final void E(H0.b bVar, O o10, L0 l02) {
        androidx.camera.core.impl.X x10;
        boolean z10 = o10.a() == -1;
        boolean z11 = o10.c() == O.a.ACTIVE;
        if (z10 && z11) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.f14886a.clear();
        bVar.f14887b.f14948a.clear();
        C.C cA = l02.a();
        if (!z10 && (x10 = this.f13190p) != null) {
            if (z11) {
                bVar.c(x10, cA, -1);
            } else {
                C1697k.a aVarA = H0.f.a(x10);
                if (cA == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                aVarA.f15073e = cA;
                bVar.f14886a.add(aVarA.a());
            }
        }
        b.d dVar = this.f13194t;
        if (dVar != null && dVar.cancel(false)) {
            C.S.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        b.d dVarA = o0.b.a(new e0(5, this, bVar));
        this.f13194t = dVarA;
        I.j.a(dVarA, new V(this, dVarA, z11), E.u.H());
    }

    public final void F() {
        G.n.a();
        H0.c cVar = this.f13188B;
        if (cVar != null) {
            cVar.b();
            this.f13188B = null;
        }
        androidx.camera.core.impl.X x10 = this.f13190p;
        if (x10 != null) {
            x10.a();
            this.f13190p = null;
        }
        N.v vVar = this.f13197w;
        if (vVar != null) {
            vVar.b();
            this.f13197w = null;
        }
        N.s sVar = this.f13191q;
        if (sVar != null) {
            sVar.c();
            this.f13191q = null;
        }
        this.f13198x = null;
        this.f13195u = null;
        this.f13192r = O.f13174a;
        this.f13199y = 0;
        this.f13200z = false;
    }

    @SuppressLint({"WrongConstant"})
    public final H0.b G(X.a<T> aVar, L0 l02) throws ExecutionException, InterruptedException {
        AbstractC1630s abstractC1630s;
        C2.h hVar;
        InterfaceC4256C interfaceC4256C;
        Rect rect;
        Size size;
        N.v vVar;
        G.n.a();
        androidx.camera.core.impl.J jB = b();
        jB.getClass();
        Size sizeD = l02.d();
        C2.h hVar2 = new C2.h(this, 10);
        Range<Integer> rangeB = l02.b();
        if (Objects.equals(rangeB, L0.f14918a)) {
            rangeB = c.f13204b;
        }
        Range<Integer> range = rangeB;
        A4.a<AbstractC1630s> aVarD = I().c().d();
        if (aVarD.isDone()) {
            try {
                abstractC1630s = aVarD.get();
            } catch (InterruptedException | ExecutionException e4) {
                throw new IllegalStateException(e4);
            }
        } else {
            abstractC1630s = null;
        }
        AbstractC1630s abstractC1630s2 = abstractC1630s;
        Objects.requireNonNull(abstractC1630s2);
        P pF = I().f(jB.a());
        C.C cA = l02.a();
        Y.f fVarB = pF.b(sizeD, cA);
        InterfaceC5503a interfaceC5503a = (InterfaceC5503a) ((C1717u0) aVar.getConfig()).b(X.a.f13414I);
        Objects.requireNonNull(interfaceC5503a);
        InterfaceC4256C interfaceC4256CL = L(interfaceC5503a, fVarB, abstractC1630s2, sizeD, cA, range);
        this.f13199y = H(jB);
        Rect rect2 = this.i;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
        }
        if (interfaceC4256CL == null || interfaceC4256CL.a(rect2.width(), rect2.height())) {
            hVar = hVar2;
            interfaceC4256C = interfaceC4256CL;
        } else {
            C.S.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", G.o.f(rect2), Integer.valueOf(interfaceC4256CL.b()), Integer.valueOf(interfaceC4256CL.g()), interfaceC4256CL.h(), interfaceC4256CL.j()));
            InterfaceC4256C zVar = (!(interfaceC4256CL.h().contains((Range<Integer>) Integer.valueOf(rect2.width())) && interfaceC4256CL.j().contains((Range<Integer>) Integer.valueOf(rect2.height()))) && interfaceC4256CL.d() && interfaceC4256CL.j().contains((Range<Integer>) Integer.valueOf(rect2.width())) && interfaceC4256CL.h().contains((Range<Integer>) Integer.valueOf(rect2.height()))) ? new d0.z(interfaceC4256CL) : interfaceC4256CL;
            int iB = zVar.b();
            int iG = zVar.g();
            Range<Integer> rangeH = zVar.h();
            Range<Integer> rangeJ = zVar.j();
            interfaceC4256C = interfaceC4256CL;
            int iD = D(true, rect2.width(), iB, rangeH);
            hVar = hVar2;
            int iD2 = D(false, rect2.width(), iB, rangeH);
            int iD3 = D(true, rect2.height(), iG, rangeJ);
            int iD4 = D(false, rect2.height(), iG, rangeJ);
            HashSet hashSet = new HashSet();
            C(hashSet, iD, iD3, sizeD, zVar);
            C(hashSet, iD, iD4, sizeD, zVar);
            C(hashSet, iD2, iD3, sizeD, zVar);
            C(hashSet, iD2, iD4, sizeD, zVar);
            if (hashSet.isEmpty()) {
                C.S.g("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                C.S.a("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new L.b(rect2, 1));
                C.S.a("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    C.S.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    A2.l.q(null, width % 2 == 0 && height % 2 == 0 && width <= sizeD.getWidth() && height <= sizeD.getHeight());
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        int iMax = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.left = iMax;
                        int i = iMax + width;
                        rect3.right = i;
                        if (i > sizeD.getWidth()) {
                            int width2 = sizeD.getWidth();
                            rect3.right = width2;
                            rect3.left = width2 - width;
                        }
                    }
                    if (height != rect2.height()) {
                        int iMax2 = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.top = iMax2;
                        int i10 = iMax2 + height;
                        rect3.bottom = i10;
                        if (i10 > sizeD.getHeight()) {
                            int height2 = sizeD.getHeight();
                            rect3.bottom = height2;
                            rect3.top = height2 - height;
                        }
                    }
                    C.S.a("VideoCapture", "Adjust cropRect from " + G.o.f(rect2) + " to " + G.o.f(rect3));
                    rect2 = rect3;
                }
            }
        }
        int i11 = this.f13199y;
        if (this.f13192r.b() != null) {
            k0.d dVarB = this.f13192r.b();
            dVarB.getClass();
            Size sizeG = G.o.g(G.o.e(dVarB.a()), i11);
            rect = new Rect(0, 0, sizeG.getWidth(), sizeG.getHeight());
        } else {
            rect = rect2;
        }
        this.f13198x = rect;
        if (this.f13192r.b() == null || rect.equals(rect2)) {
            size = sizeD;
        } else {
            float fHeight = rect.height() / rect2.height();
            size = new Size((int) Math.ceil(sizeD.getWidth() * fHeight), (int) Math.ceil(sizeD.getHeight() * fHeight));
        }
        if (this.f13192r.b() != null) {
            this.f13200z = true;
        }
        Rect rect4 = this.f13198x;
        int i12 = this.f13199y;
        boolean zJ = J(jB, aVar, rect4, sizeD);
        if (((SizeCannotEncodeVideoQuirk) C1811b.f17055a.e(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!zJ) {
                i12 = 0;
            }
            Size sizeG2 = G.o.g(G.o.e(rect4), i12);
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeG2)) {
                int iG2 = interfaceC4256C != null ? interfaceC4256C.g() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == sizeG2.getHeight()) {
                    rect5.left += iG2;
                    rect5.right -= iG2;
                } else {
                    rect5.top += iG2;
                    rect5.bottom -= iG2;
                }
                rect4 = rect5;
            }
        }
        this.f13198x = rect4;
        if (J(jB, aVar, rect4, sizeD)) {
            C.S.a("VideoCapture", "Surface processing is enabled.");
            androidx.camera.core.impl.J jB2 = b();
            Objects.requireNonNull(jB2);
            if (this.f759m != null) {
                throw null;
            }
            vVar = new N.v(jB2, new N.j(cA));
        } else {
            vVar = null;
        }
        this.f13197w = vVar;
        Q0 q0H = (vVar == null && jB.l()) ? Q0.UPTIME : jB.n().h();
        C.S.a("VideoCapture", "camera timebase = " + jB.n().h() + ", processing timebase = " + q0H);
        C1701m.a aVarF = l02.f();
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        aVarF.f15090a = size;
        if (range == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        aVarF.f15092c = range;
        C1701m c1701mA = aVarF.a();
        A2.l.q(null, this.f13191q == null);
        N.s sVar = new N.s(2, 34, c1701mA, this.f756j, jB.l(), this.f13198x, this.f13199y, ((InterfaceC1698k0) this.f753f).I(), jB.l() && l(jB));
        this.f13191q = sVar;
        sVar.a(hVar);
        if (this.f13197w != null) {
            N.s sVar2 = this.f13191q;
            int i13 = sVar2.f4437f;
            int i14 = sVar2.i;
            Rect rect6 = sVar2.f4435d;
            P.b bVar = new P.b(UUID.randomUUID(), i13, sVar2.f4432a, rect6, G.o.g(G.o.e(rect6), i14), sVar2.i, sVar2.f4436e);
            N.s sVar3 = this.f13197w.c(new N.c(this.f13191q, Collections.singletonList(bVar))).get(bVar);
            Objects.requireNonNull(sVar3);
            sVar3.a(new Q(this, sVar3, jB, aVar, q0H, 0));
            this.f13195u = sVar3.d(jB, true);
            N.s sVar4 = this.f13191q;
            sVar4.getClass();
            G.n.a();
            sVar4.b();
            A2.l.q("Consumer can only be linked once.", !sVar4.f4440j);
            sVar4.f4440j = true;
            s.a aVar2 = sVar4.f4442l;
            this.f13190p = aVar2;
            I.j.f(aVar2.f14991e).addListener(new B.a(10, this, aVar2), E.u.H());
        } else {
            k0 k0VarD = this.f13191q.d(jB, true);
            this.f13195u = k0VarD;
            this.f13190p = k0VarD.f741l;
        }
        Z z10 = (Z) ((C1717u0) aVar.getConfig()).b(X.a.f13413H);
        Objects.requireNonNull(z10);
        z10.b(this.f13195u, q0H);
        M();
        this.f13190p.f14995j = MediaCodec.class;
        H0.b bVarE = H0.b.e(aVar, l02.d());
        Range<Integer> rangeB2 = l02.b();
        S.a aVar3 = bVarE.f14887b;
        aVar3.getClass();
        aVar3.f14949b.N(androidx.camera.core.impl.S.f14939k, rangeB2);
        int iM = G8.m(aVar);
        if (iM != 0) {
            S.a aVar4 = bVarE.f14887b;
            aVar4.getClass();
            if (iM != 0) {
                aVar4.f14949b.N(T0.f14970F, Integer.valueOf(iM));
            }
        }
        H0.c cVar = this.f13188B;
        if (cVar != null) {
            cVar.b();
        }
        H0.c cVar2 = new H0.c(new S(this, 0));
        this.f13188B = cVar2;
        bVarE.f14891f = cVar2;
        if (l02.c() != null) {
            bVarE.b(l02.c());
        }
        return bVarE;
    }

    public final int H(androidx.camera.core.impl.J j4) {
        boolean zL = l(j4);
        int iG = g(j4, zL);
        if (this.f13192r.b() == null) {
            return iG;
        }
        k0.d dVarB = this.f13192r.b();
        Objects.requireNonNull(dVarB);
        int iB = dVarB.b();
        if (zL != dVarB.f()) {
            iB = -iB;
        }
        return G.o.h(iG - iB);
    }

    public final T I() {
        T t10 = (T) ((C1717u0) ((X.a) this.f753f).getConfig()).b(X.a.f13413H);
        Objects.requireNonNull(t10);
        return t10;
    }

    public final boolean J(androidx.camera.core.impl.J j4, X.a<?> aVar, Rect rect, Size size) {
        if (this.f759m != null) {
            return true;
        }
        if (j4.l()) {
            aVar.getClass();
            Boolean bool = (Boolean) ((C1717u0) aVar.getConfig()).o(X.a.f13415J, Boolean.FALSE);
            Objects.requireNonNull(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        if (!(j4.l() && (B4.f.h(C1811b.f17055a) || B4.f.h(j4.n().l()))) && size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return (j4.l() && l(j4)) || this.f13192r.b() != null;
        }
        return true;
    }

    public final void K() {
        if (b() == null) {
            return;
        }
        F();
        X.a<T> aVar = (X.a) this.f753f;
        L0 l02 = this.f754g;
        l02.getClass();
        H0.b bVarG = G(aVar, l02);
        this.f13193s = bVarG;
        E(bVarG, this.f13192r, this.f754g);
        Object[] objArr = {this.f13193s.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        o();
    }

    public final void M() {
        androidx.camera.core.impl.J jB = b();
        N.s sVar = this.f13191q;
        if (jB == null || sVar == null) {
            return;
        }
        int iH = H(jB);
        this.f13199y = iH;
        G.n.c(new N.q(sVar, iH, ((InterfaceC1698k0) this.f753f).I()));
    }

    @Override // C.m0
    public final T0<?> e(boolean z10, U0 u02) {
        f13186D.getClass();
        X.a<?> aVar = c.f13203a;
        aVar.getClass();
        androidx.camera.core.impl.U uA = u02.a(G8.d(aVar), 1);
        if (z10) {
            uA = B8.m(uA, aVar);
        }
        if (uA == null) {
            return null;
        }
        return new X.a(C1717u0.J(((b) j(uA)).f13202a));
    }

    @Override // C.m0
    public final Set<Integer> i() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // C.m0
    public final T0.a<?, ?, ?> j(androidx.camera.core.impl.U u8) {
        return new b(C1710q0.L(u8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    @Override // C.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.T0<?> s(androidx.camera.core.impl.I r22, androidx.camera.core.impl.T0.a<?, ?, ?> r23) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.T.s(androidx.camera.core.impl.I, androidx.camera.core.impl.T0$a):androidx.camera.core.impl.T0");
    }

    @Override // C.m0
    public final void t() throws ExecutionException, InterruptedException {
        C.S.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + d());
        L0 l02 = this.f754g;
        if (l02 == null || this.f13195u != null) {
            return;
        }
        InterfaceC1715t0<O> interfaceC1715t0D = I().d();
        O o10 = O.f13174a;
        A4.a<O> aVarD = interfaceC1715t0D.d();
        if (aVarD.isDone()) {
            try {
                o10 = aVarD.get();
            } catch (InterruptedException | ExecutionException e4) {
                throw new IllegalStateException(e4);
            }
        }
        this.f13192r = o10;
        H0.b bVarG = G((X.a) this.f753f, l02);
        this.f13193s = bVarG;
        E(bVarG, this.f13192r, l02);
        Object[] objArr = {this.f13193s.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        n();
        I().d().e(E.u.H(), this.f13189C);
        d dVar = this.f13187A;
        if (dVar != null) {
            dVar.b();
        }
        androidx.camera.core.impl.F fC = c();
        d dVar2 = new d();
        dVar2.f13207b = false;
        dVar2.f13206a = fC;
        this.f13187A = dVar2;
        I().e().e(E.u.H(), this.f13187A);
        Z.a aVar = Z.a.ACTIVE_NON_STREAMING;
        if (aVar != this.f13196v) {
            this.f13196v = aVar;
            I().a(aVar);
        }
    }

    public final String toString() {
        return "VideoCapture:".concat(f());
    }

    @Override // C.m0
    public final void u() {
        C.S.a("VideoCapture", "VideoCapture#onStateDetached");
        A2.l.q("VideoCapture can only be detached on the main thread.", G.n.b());
        if (this.f13187A != null) {
            I().e().a(this.f13187A);
            this.f13187A.b();
            this.f13187A = null;
        }
        Z.a aVar = Z.a.INACTIVE;
        if (aVar != this.f13196v) {
            this.f13196v = aVar;
            I().a(aVar);
        }
        I().d().a(this.f13189C);
        b.d dVar = this.f13194t;
        if (dVar != null && dVar.cancel(false)) {
            C.S.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        F();
    }

    @Override // C.m0
    public final C1701m v(androidx.camera.core.impl.U u8) {
        this.f13193s.f14887b.c(u8);
        Object[] objArr = {this.f13193s.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        L0 l02 = this.f754g;
        Objects.requireNonNull(l02);
        C1701m.a aVarF = l02.f();
        aVarF.f15093d = u8;
        return aVarF.a();
    }

    @Override // C.m0
    public final L0 w(L0 l02, L0 l03) {
        C.S.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + l02);
        X.a aVar = (X.a) this.f753f;
        aVar.getClass();
        ArrayList arrayListB = C1696j0.b(aVar);
        if (arrayListB != null && !arrayListB.contains(l02.d())) {
            C.S.g("VideoCapture", "suggested resolution " + l02.d() + " is not in custom ordered resolutions " + arrayListB);
        }
        return l02;
    }

    @Override // C.m0
    public final void z(Rect rect) {
        this.i = rect;
        M();
    }

    /* compiled from: VideoCapture.java */
    public static final class b<T extends Z> implements T0.a<T<T>, X.a<T>, b<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final C1710q0 f13202a;

        public b(C1710q0 c1710q0) {
            Object objB;
            this.f13202a = c1710q0;
            if (!c1710q0.f15118G.containsKey(X.a.f13413H)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Object objB2 = null;
            try {
                objB = c1710q0.b(J.l.f2691c);
            } catch (IllegalArgumentException unused) {
                objB = null;
            }
            Class cls = (Class) objB;
            if (cls != null && !cls.equals(T.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f13202a.N(T0.f14968D, U0.b.VIDEO_CAPTURE);
            C1683d c1683d = J.l.f2691c;
            C1710q0 c1710q02 = this.f13202a;
            c1710q02.N(c1683d, T.class);
            try {
                objB2 = c1710q02.b(J.l.f2690b);
            } catch (IllegalArgumentException unused2) {
            }
            if (objB2 == null) {
                c1710q02.N(J.l.f2690b, T.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // C.D
        public final InterfaceC1708p0 a() {
            return this.f13202a;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0 b() {
            return new X.a(C1717u0.J(this.f13202a));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(T t10) {
            C1710q0 c1710q0K = C1710q0.K();
            c1710q0K.N(X.a.f13413H, t10);
            this(c1710q0K);
        }
    }
}
