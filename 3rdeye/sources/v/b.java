package V;

import C.InterfaceC0625l;
import C.m0;
import C.r;
import J.e;
import android.annotation.SuppressLint;
import android.os.Build;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1789w;
import androidx.lifecycle.InterfaceC1790x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: LifecycleCamera.java */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
/* loaded from: classes.dex */
public final class b implements InterfaceC1789w, InterfaceC0625l {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1790x f12809c;

    /* renamed from: d, reason: collision with root package name */
    public final J.e f12810d;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12808b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f12811e = false;

    public b(InterfaceC1790x interfaceC1790x, J.e eVar) {
        this.f12809c = interfaceC1790x;
        this.f12810d = eVar;
        if (interfaceC1790x.getLifecycle().getCurrentState().isAtLeast(AbstractC1781n.b.STARTED)) {
            eVar.h();
        } else {
            eVar.v();
        }
        interfaceC1790x.getLifecycle().addObserver(this);
    }

    @Override // C.InterfaceC0625l
    public final r a() {
        return this.f12810d.f2669q;
    }

    public final void h(Collection<m0> collection) throws e.a {
        synchronized (this.f12808b) {
            this.f12810d.c(collection);
        }
    }

    public final InterfaceC1790x o() {
        InterfaceC1790x interfaceC1790x;
        synchronized (this.f12808b) {
            interfaceC1790x = this.f12809c;
        }
        return interfaceC1790x;
    }

    @G(AbstractC1781n.a.ON_DESTROY)
    public void onDestroy(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12808b) {
            J.e eVar = this.f12810d;
            eVar.G((ArrayList) eVar.A());
        }
    }

    @G(AbstractC1781n.a.ON_PAUSE)
    public void onPause(InterfaceC1790x interfaceC1790x) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f12810d.f2655b.i(false);
        }
    }

    @G(AbstractC1781n.a.ON_RESUME)
    public void onResume(InterfaceC1790x interfaceC1790x) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f12810d.f2655b.i(true);
        }
    }

    @G(AbstractC1781n.a.ON_START)
    public void onStart(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12808b) {
            try {
                if (!this.f12811e) {
                    this.f12810d.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @G(AbstractC1781n.a.ON_STOP)
    public void onStop(InterfaceC1790x interfaceC1790x) {
        synchronized (this.f12808b) {
            try {
                if (!this.f12811e) {
                    this.f12810d.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<m0> p() {
        List<m0> listUnmodifiableList;
        synchronized (this.f12808b) {
            listUnmodifiableList = Collections.unmodifiableList(this.f12810d.A());
        }
        return listUnmodifiableList;
    }

    public final boolean q(m0 m0Var) {
        boolean zContains;
        synchronized (this.f12808b) {
            zContains = ((ArrayList) this.f12810d.A()).contains(m0Var);
        }
        return zContains;
    }

    public final void r() {
        synchronized (this.f12808b) {
            try {
                if (this.f12811e) {
                    return;
                }
                onStop(this.f12809c);
                this.f12811e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.f12808b) {
            J.e eVar = this.f12810d;
            eVar.G((ArrayList) eVar.A());
        }
    }

    public final void t() {
        synchronized (this.f12808b) {
            try {
                if (this.f12811e) {
                    this.f12811e = false;
                    if (this.f12809c.getLifecycle().getCurrentState().isAtLeast(AbstractC1781n.b.STARTED)) {
                        onStart(this.f12809c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
