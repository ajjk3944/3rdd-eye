package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.impl.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: CaptureConfig.java */
/* loaded from: classes.dex */
public final class S {
    public static final C1683d i = U.a.a(Integer.TYPE, "camerax.core.captureConfig.rotation");

    /* renamed from: j, reason: collision with root package name */
    public static final C1683d f14938j = U.a.a(Integer.class, "camerax.core.captureConfig.jpegQuality");

    /* renamed from: k, reason: collision with root package name */
    public static final C1683d f14939k = U.a.a(Range.class, "camerax.core.captureConfig.resolvedFrameRate");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14940a;

    /* renamed from: b, reason: collision with root package name */
    public final C1717u0 f14941b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14942c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14943d;

    /* renamed from: e, reason: collision with root package name */
    public final List<AbstractC1707p> f14944e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14945f;

    /* renamed from: g, reason: collision with root package name */
    public final P0 f14946g;

    /* renamed from: h, reason: collision with root package name */
    public final A f14947h;

    /* compiled from: CaptureConfig.java */
    public interface b {
        void a(C1692h0 c1692h0, a aVar);
    }

    public S(ArrayList arrayList, C1717u0 c1717u0, int i10, boolean z10, ArrayList arrayList2, boolean z11, P0 p02, A a10) {
        this.f14940a = arrayList;
        this.f14941b = c1717u0;
        this.f14942c = i10;
        this.f14944e = Collections.unmodifiableList(arrayList2);
        this.f14945f = z11;
        this.f14946g = p02;
        this.f14947h = a10;
        this.f14943d = z10;
    }

    public final int a() {
        Object obj = this.f14946g.f14935a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Object objB = 0;
        try {
            objB = this.f14941b.b(T0.f14969E);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objB;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Object objB = 0;
        try {
            objB = this.f14941b.b(T0.f14970F);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objB;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* compiled from: CaptureConfig.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f14948a;

        /* renamed from: b, reason: collision with root package name */
        public C1710q0 f14949b;

        /* renamed from: c, reason: collision with root package name */
        public int f14950c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14951d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f14952e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f14953f;

        /* renamed from: g, reason: collision with root package name */
        public final C1713s0 f14954g;

        /* renamed from: h, reason: collision with root package name */
        public A f14955h;

        public a() {
            this.f14948a = new HashSet();
            this.f14949b = C1710q0.K();
            this.f14950c = -1;
            this.f14951d = false;
            this.f14952e = new ArrayList();
            this.f14953f = false;
            this.f14954g = C1713s0.a();
        }

        public final void a(Collection<AbstractC1707p> collection) {
            Iterator<AbstractC1707p> it = collection.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }

        public final void b(AbstractC1707p abstractC1707p) {
            ArrayList arrayList = this.f14952e;
            if (arrayList.contains(abstractC1707p)) {
                return;
            }
            arrayList.add(abstractC1707p);
        }

        public final void c(U u8) {
            Object objB;
            for (U.a<?> aVar : u8.l()) {
                C1710q0 c1710q0 = this.f14949b;
                c1710q0.getClass();
                try {
                    objB = c1710q0.b(aVar);
                } catch (IllegalArgumentException unused) {
                    objB = null;
                }
                Object objB2 = u8.b(aVar);
                if (objB instanceof AbstractC1706o0) {
                    AbstractC1706o0 abstractC1706o0 = (AbstractC1706o0) objB2;
                    abstractC1706o0.getClass();
                    ((AbstractC1706o0) objB).f15112a.addAll(Collections.unmodifiableList(new ArrayList(abstractC1706o0.f15112a)));
                } else {
                    if (objB2 instanceof AbstractC1706o0) {
                        objB2 = ((AbstractC1706o0) objB2).clone();
                    }
                    this.f14949b.M(aVar, u8.w(aVar), objB2);
                }
            }
        }

        public final S d() {
            ArrayList arrayList = new ArrayList(this.f14948a);
            C1717u0 c1717u0J = C1717u0.J(this.f14949b);
            int i = this.f14950c;
            boolean z10 = this.f14951d;
            ArrayList arrayList2 = new ArrayList(this.f14952e);
            boolean z11 = this.f14953f;
            P0 p02 = P0.f14934b;
            ArrayMap arrayMap = new ArrayMap();
            C1713s0 c1713s0 = this.f14954g;
            for (String str : c1713s0.f14935a.keySet()) {
                arrayMap.put(str, c1713s0.f14935a.get(str));
            }
            return new S(arrayList, c1717u0J, i, z10, arrayList2, z11, new P0(arrayMap), this.f14955h);
        }

        public a(S s10) {
            HashSet hashSet = new HashSet();
            this.f14948a = hashSet;
            this.f14949b = C1710q0.K();
            this.f14950c = -1;
            this.f14951d = false;
            ArrayList arrayList = new ArrayList();
            this.f14952e = arrayList;
            this.f14953f = false;
            this.f14954g = C1713s0.a();
            hashSet.addAll(s10.f14940a);
            this.f14949b = C1710q0.L(s10.f14941b);
            this.f14950c = s10.f14942c;
            arrayList.addAll(s10.f14944e);
            this.f14953f = s10.f14945f;
            ArrayMap arrayMap = new ArrayMap();
            P0 p02 = s10.f14946g;
            for (String str : p02.f14935a.keySet()) {
                arrayMap.put(str, p02.f14935a.get(str));
            }
            this.f14954g = new C1713s0(arrayMap);
            this.f14951d = s10.f14943d;
        }
    }
}
