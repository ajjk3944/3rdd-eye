package v;

import C.AbstractC0633u;
import C.C0618e;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.InterfaceC1678a0;
import androidx.camera.core.impl.Q0;
import androidx.lifecycle.D;
import g0.C4355b;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import q.C5486b;
import t4.C5606d;
import w.C5687a;
import w.C5698l;
import w.C5704r;

/* compiled from: Camera2CameraInfoImpl.java */
/* renamed from: v.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5666v implements androidx.camera.core.impl.I {

    /* renamed from: a, reason: collision with root package name */
    public final String f46923a;

    /* renamed from: b, reason: collision with root package name */
    public final C5698l f46924b;

    /* renamed from: c, reason: collision with root package name */
    public final B.h f46925c;

    /* renamed from: e, reason: collision with root package name */
    public C5658m f46927e;

    /* renamed from: f, reason: collision with root package name */
    public final a<AbstractC0633u> f46928f;

    /* renamed from: h, reason: collision with root package name */
    public final C0 f46930h;
    public final G i;

    /* renamed from: d, reason: collision with root package name */
    public final Object f46926d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f46929g = null;

    /* compiled from: Camera2CameraInfoImpl.java */
    /* renamed from: v.v$a */
    public static class a<T> extends androidx.lifecycle.D<T> {

        /* renamed from: m, reason: collision with root package name */
        public androidx.lifecycle.E f46931m;

        /* renamed from: n, reason: collision with root package name */
        public final C0618e f46932n;

        public a(C0618e c0618e) {
            this.f46932n = c0618e;
        }

        @Override // androidx.lifecycle.C
        public final T d() {
            androidx.lifecycle.E e4 = this.f46931m;
            return e4 == null ? (T) this.f46932n : e4.d();
        }

        public final void l(androidx.lifecycle.E e4) {
            D.a<?> aVar;
            D.a<?> aVarC;
            androidx.lifecycle.E e10 = this.f46931m;
            C5486b<androidx.lifecycle.C<?>, D.a<?>> c5486b = this.f16039l;
            if (e10 != null && (aVarC = c5486b.c(e10)) != null) {
                aVarC.f16040a.i(aVarC);
            }
            this.f46931m = e4;
            C5665u c5665u = new C5665u(this);
            if (e4 == null) {
                throw new NullPointerException("source cannot be null");
            }
            D.a aVar2 = new D.a(e4, c5665u);
            C5486b.c<androidx.lifecycle.C<?>, D.a<?>> cVarB = c5486b.b(e4);
            if (cVarB != null) {
                aVar = cVarB.f45308c;
            } else {
                C5486b.c<K, V> cVar = new C5486b.c<>(e4, aVar2);
                c5486b.f45306e++;
                C5486b.c cVar2 = c5486b.f45304c;
                if (cVar2 == null) {
                    c5486b.f45303b = cVar;
                    c5486b.f45304c = cVar;
                } else {
                    cVar2.f45309d = cVar;
                    cVar.f45310e = cVar2;
                    c5486b.f45304c = cVar;
                }
                aVar = null;
            }
            D.a<?> aVar3 = aVar;
            if (aVar3 != null && aVar3.f16041b != c5665u) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (aVar3 == null && this.f16025c > 0) {
                e4.f(aVar2);
            }
        }
    }

    public C5666v(String str, C5704r c5704r) throws ExecutionException, InterruptedException, C5687a {
        str.getClass();
        this.f46923a = str;
        C5698l c5698lB = c5704r.b(str);
        this.f46924b = c5698lB;
        B.h hVar = new B.h();
        hVar.f325a = this;
        this.f46925c = hVar;
        C0 c0U = A9.I.u(c5698lB);
        this.f46930h = c0U;
        this.i = new G(str, c0U);
        this.f46928f = new a<>(new C0618e(AbstractC0633u.b.CLOSED, null));
    }

    @Override // androidx.camera.core.impl.I
    public final Set<C.C> a() {
        return x.b.a(this.f46924b).f47599a.a();
    }

    @Override // C.r
    public final int b() {
        return j(0);
    }

    @Override // androidx.camera.core.impl.I
    public final boolean c() {
        int[] iArr = (int[]) this.f46924b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.I
    public final String d() {
        return this.f46923a;
    }

    @Override // androidx.camera.core.impl.I
    public final void f(H.b bVar, C4355b c4355b) {
        synchronized (this.f46926d) {
            try {
                C5658m c5658m = this.f46927e;
                if (c5658m != null) {
                    c5658m.f46753c.execute(new N.d(c5658m, bVar, c4355b, 13));
                } else {
                    if (this.f46929g == null) {
                        this.f46929g = new ArrayList();
                    }
                    this.f46929g.add(new Pair(c4355b, bVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // C.r
    public final int g() {
        Integer num = (Integer) this.f46924b.a(CameraCharacteristics.LENS_FACING);
        A2.l.k("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(C4356c.i(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // androidx.camera.core.impl.I
    public final Q0 h() {
        Integer num = (Integer) this.f46924b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? Q0.UPTIME : Q0.REALTIME;
    }

    @Override // C.r
    public final String i() {
        Integer num = (Integer) this.f46924b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // C.r
    public final int j(int i) {
        Integer num = (Integer) this.f46924b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return C5606d.w(C5606d.E(i), num.intValue(), 1 == g());
    }

    @Override // androidx.camera.core.impl.I
    public final InterfaceC1678a0 k() {
        return this.i;
    }

    @Override // androidx.camera.core.impl.I
    public final C0 l() {
        return this.f46930h;
    }

    @Override // androidx.camera.core.impl.I
    public final List<Size> m(int i) {
        Size[] sizeArrA = this.f46924b.b().a(i);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.I
    public final void n(AbstractC1707p abstractC1707p) {
        synchronized (this.f46926d) {
            try {
                C5658m c5658m = this.f46927e;
                if (c5658m != null) {
                    c5658m.f46753c.execute(new C.E(21, c5658m, abstractC1707p));
                    return;
                }
                ArrayList arrayList = this.f46929g;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC1707p) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(C5658m c5658m) {
        synchronized (this.f46926d) {
            try {
                this.f46927e = c5658m;
                ArrayList arrayList = this.f46929g;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C5658m c5658m2 = this.f46927e;
                        Executor executor = (Executor) pair.second;
                        AbstractC1707p abstractC1707p = (AbstractC1707p) pair.first;
                        c5658m2.getClass();
                        c5658m2.f46753c.execute(new N.d(c5658m2, executor, abstractC1707p, 13));
                    }
                    this.f46929g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.f46924b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        String strD = androidx.work.s.d("Device Level: ", iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? C4356c.h(iIntValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED");
        String strF = C.S.f("Camera2CameraInfo");
        if (C.S.e(4, strF)) {
            Log.i(strF, strD);
        }
    }

    @Override // androidx.camera.core.impl.I
    public final androidx.camera.core.impl.I e() {
        return this;
    }
}
