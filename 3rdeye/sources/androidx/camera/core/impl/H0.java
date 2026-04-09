package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C1697k;
import androidx.camera.core.impl.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SessionConfig.java */
/* loaded from: classes.dex */
public final class H0 {
    public static final List<Integer> i = Arrays.asList(1, 5, 3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14878a;

    /* renamed from: b, reason: collision with root package name */
    public final C1697k f14879b;

    /* renamed from: c, reason: collision with root package name */
    public final List<CameraDevice.StateCallback> f14880c;

    /* renamed from: d, reason: collision with root package name */
    public final List<CameraCaptureSession.StateCallback> f14881d;

    /* renamed from: e, reason: collision with root package name */
    public final List<AbstractC1707p> f14882e;

    /* renamed from: f, reason: collision with root package name */
    public final d f14883f;

    /* renamed from: g, reason: collision with root package name */
    public final S f14884g;

    /* renamed from: h, reason: collision with root package name */
    public final InputConfiguration f14885h;

    /* compiled from: SessionConfig.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f14886a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        public final S.a f14887b = new S.a();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f14888c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f14889d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f14890e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public c f14891f;

        /* renamed from: g, reason: collision with root package name */
        public InputConfiguration f14892g;

        /* renamed from: h, reason: collision with root package name */
        public C1697k f14893h;
    }

    /* compiled from: SessionConfig.java */
    public static class b extends a {
        public static b e(T0<?> t02, Size size) {
            e eVarP = t02.p();
            if (eVarP != null) {
                b bVar = new b();
                eVarP.a(size, t02, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + t02.u(t02.toString()));
        }

        public final void a(AbstractC1707p abstractC1707p) {
            this.f14887b.b(abstractC1707p);
            ArrayList arrayList = this.f14890e;
            if (arrayList.contains(abstractC1707p)) {
                return;
            }
            arrayList.add(abstractC1707p);
        }

        public final void b(U u8) {
            this.f14887b.c(u8);
        }

        public final void c(X x10, C.C c10, int i) {
            C1697k.a aVarA = f.a(x10);
            if (c10 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            aVarA.f15073e = c10;
            aVarA.f15071c = Integer.valueOf(i);
            this.f14886a.add(aVarA.a());
            this.f14887b.f14948a.add(x10);
        }

        public final H0 d() {
            return new H0(new ArrayList(this.f14886a), new ArrayList(this.f14888c), new ArrayList(this.f14889d), new ArrayList(this.f14890e), this.f14887b.d(), this.f14891f, this.f14892g, this.f14893h);
        }
    }

    /* compiled from: SessionConfig.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f14894a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        public final d f14895b;

        public c(d dVar) {
            this.f14895b = dVar;
        }

        @Override // androidx.camera.core.impl.H0.d
        public final void a(H0 h02, g gVar) {
            if (this.f14894a.get()) {
                return;
            }
            this.f14895b.a(h02, gVar);
        }

        public final void b() {
            this.f14894a.set(true);
        }
    }

    /* compiled from: SessionConfig.java */
    public interface d {
        void a(H0 h02, g gVar);
    }

    /* compiled from: SessionConfig.java */
    public interface e {
        void a(Size size, T0<?> t02, b bVar);
    }

    /* compiled from: SessionConfig.java */
    public static abstract class f {

        /* compiled from: SessionConfig.java */
        public static abstract class a {
        }

        public static C1697k.a a(X x10) {
            C1697k.a aVar = new C1697k.a();
            if (x10 == null) {
                throw new NullPointerException("Null surface");
            }
            aVar.f15069a = x10;
            List<X> list = Collections.EMPTY_LIST;
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            aVar.f15070b = list;
            aVar.f15071c = -1;
            aVar.f15072d = -1;
            aVar.f15073e = C.C.f616d;
            return aVar;
        }

        public abstract C.C b();

        public abstract int c();

        public abstract String d();

        public abstract List<X> e();

        public abstract X f();

        public abstract int g();
    }

    /* compiled from: SessionConfig.java */
    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* compiled from: SessionConfig.java */
    public static final class h extends a {
        public final L.c i = new L.c();

        /* renamed from: j, reason: collision with root package name */
        public boolean f14896j = true;

        /* renamed from: k, reason: collision with root package name */
        public boolean f14897k = false;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList f14898l = new ArrayList();

        public final void a(H0 h02) {
            Object objB;
            S s10 = h02.f14884g;
            int i = s10.f14942c;
            S.a aVar = this.f14887b;
            if (i != -1) {
                this.f14897k = true;
                int i10 = aVar.f14950c;
                Integer numValueOf = Integer.valueOf(i);
                List<Integer> list = H0.i;
                if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i10))) {
                    i = i10;
                }
                aVar.f14950c = i;
            }
            C1683d c1683d = S.f14939k;
            Object objB2 = L0.f14918a;
            C1717u0 c1717u0 = s10.f14941b;
            try {
                objB2 = c1717u0.b(c1683d);
            } catch (IllegalArgumentException unused) {
            }
            Range range = (Range) objB2;
            Objects.requireNonNull(range);
            Range<Integer> range2 = L0.f14918a;
            if (!range.equals(range2)) {
                C1710q0 c1710q0 = aVar.f14949b;
                C1683d c1683d2 = S.f14939k;
                c1710q0.getClass();
                try {
                    objB = c1710q0.b(c1683d2);
                } catch (IllegalArgumentException unused2) {
                    objB = range2;
                }
                if (((Range) objB).equals(range2)) {
                    aVar.f14949b.N(S.f14939k, range);
                } else {
                    C1710q0 c1710q02 = aVar.f14949b;
                    C1683d c1683d3 = S.f14939k;
                    Object objB3 = L0.f14918a;
                    c1710q02.getClass();
                    try {
                        objB3 = c1710q02.b(c1683d3);
                    } catch (IllegalArgumentException unused3) {
                    }
                    if (!((Range) objB3).equals(range)) {
                        this.f14896j = false;
                        C.S.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                    }
                }
            }
            int iB = s10.b();
            if (iB != 0) {
                aVar.getClass();
                if (iB != 0) {
                    aVar.f14949b.N(T0.f14969E, Integer.valueOf(iB));
                }
            }
            int iC = s10.c();
            if (iC != 0) {
                aVar.getClass();
                if (iC != 0) {
                    aVar.f14949b.N(T0.f14970F, Integer.valueOf(iC));
                }
            }
            S s11 = h02.f14884g;
            aVar.f14954g.f14935a.putAll((Map) s11.f14946g.f14935a);
            this.f14888c.addAll(h02.f14880c);
            this.f14889d.addAll(h02.f14881d);
            aVar.a(s11.f14944e);
            this.f14890e.addAll(h02.f14882e);
            d dVar = h02.f14883f;
            if (dVar != null) {
                this.f14898l.add(dVar);
            }
            InputConfiguration inputConfiguration = h02.f14885h;
            if (inputConfiguration != null) {
                this.f14892g = inputConfiguration;
            }
            LinkedHashSet<f> linkedHashSet = this.f14886a;
            linkedHashSet.addAll(h02.f14878a);
            HashSet hashSet = aVar.f14948a;
            hashSet.addAll(Collections.unmodifiableList(s10.f14940a));
            ArrayList arrayList = new ArrayList();
            for (f fVar : linkedHashSet) {
                arrayList.add(fVar.f());
                Iterator<X> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            if (!arrayList.containsAll(hashSet)) {
                C.S.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f14896j = false;
            }
            C1697k c1697k = h02.f14879b;
            if (c1697k != null) {
                C1697k c1697k2 = this.f14893h;
                if (c1697k2 == c1697k || c1697k2 == null) {
                    this.f14893h = c1697k;
                } else {
                    C.S.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f14896j = false;
                }
            }
            aVar.c(c1717u0);
        }

        public final H0 b() {
            if (!this.f14896j) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f14886a);
            L.c cVar = this.i;
            if (cVar.f3782a) {
                Collections.sort(arrayList, new L.b(cVar, 0));
            }
            return new H0(arrayList, new ArrayList(this.f14888c), new ArrayList(this.f14889d), new ArrayList(this.f14890e), this.f14887b.d(), !this.f14898l.isEmpty() ? new W.S(this, 1) : null, this.f14892g, this.f14893h);
        }
    }

    public H0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, S s10, d dVar, InputConfiguration inputConfiguration, C1697k c1697k) {
        this.f14878a = arrayList;
        this.f14880c = Collections.unmodifiableList(arrayList2);
        this.f14881d = Collections.unmodifiableList(arrayList3);
        this.f14882e = Collections.unmodifiableList(arrayList4);
        this.f14883f = dVar;
        this.f14884g = s10;
        this.f14885h = inputConfiguration;
        this.f14879b = c1697k;
    }

    public static H0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C1710q0 c1710q0K = C1710q0.K();
        ArrayList arrayList5 = new ArrayList();
        C1713s0 c1713s0A = C1713s0.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C1717u0 c1717u0J = C1717u0.J(c1710q0K);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        P0 p02 = P0.f14934b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c1713s0A.f14935a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new H0(arrayList, arrayList2, arrayList3, arrayList4, new S(arrayList6, c1717u0J, -1, false, arrayList7, false, new P0(arrayMap), null), null, null, null);
    }

    public final List<X> b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14878a.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            arrayList.add(fVar.f());
            Iterator<X> it2 = fVar.e().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
