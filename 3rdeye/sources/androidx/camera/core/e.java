package androidx.camera.core;

import B.i;
import C.a0;
import C.c0;
import android.view.Surface;
import androidx.camera.core.b;
import androidx.camera.core.impl.InterfaceC1700l0;
import java.util.concurrent.Executor;

/* compiled from: SafeCloseImageReaderProxy.java */
/* loaded from: classes.dex */
public final class e implements InterfaceC1700l0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1700l0 f14859d;

    /* renamed from: e, reason: collision with root package name */
    public final Surface f14860e;

    /* renamed from: f, reason: collision with root package name */
    public b.a f14861f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14856a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public int f14857b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14858c = false;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f14862g = new b.a() { // from class: C.a0
        @Override // androidx.camera.core.b.a
        public final void c(androidx.camera.core.b bVar) {
            b.a aVar;
            androidx.camera.core.e eVar = this.f681a;
            synchronized (eVar.f14856a) {
                try {
                    int i = eVar.f14857b - 1;
                    eVar.f14857b = i;
                    if (eVar.f14858c && i == 0) {
                        eVar.close();
                    }
                    aVar = eVar.f14861f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (aVar != null) {
                aVar.c(bVar);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [C.a0] */
    public e(InterfaceC1700l0 interfaceC1700l0) {
        this.f14859d = interfaceC1700l0;
        this.f14860e = interfaceC1700l0.a();
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final Surface a() {
        Surface surfaceA;
        synchronized (this.f14856a) {
            surfaceA = this.f14859d.a();
        }
        return surfaceA;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final c b() {
        c0 c0Var;
        synchronized (this.f14856a) {
            c cVarB = this.f14859d.b();
            if (cVarB != null) {
                this.f14857b++;
                c0Var = new c0(cVarB);
                c0Var.a(this.f14862g);
            } else {
                c0Var = null;
            }
        }
        return c0Var;
    }

    public final void c() {
        synchronized (this.f14856a) {
            try {
                this.f14858c = true;
                this.f14859d.e();
                if (this.f14857b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void close() {
        synchronized (this.f14856a) {
            try {
                Surface surface = this.f14860e;
                if (surface != null) {
                    surface.release();
                }
                this.f14859d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int d() {
        int iD;
        synchronized (this.f14856a) {
            iD = this.f14859d.d();
        }
        return iD;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void e() {
        synchronized (this.f14856a) {
            this.f14859d.e();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int f() {
        int iF;
        synchronized (this.f14856a) {
            iF = this.f14859d.f();
        }
        return iF;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final c g() {
        c0 c0Var;
        synchronized (this.f14856a) {
            c cVarG = this.f14859d.g();
            if (cVarG != null) {
                this.f14857b++;
                c0Var = new c0(cVarG);
                c0Var.a(this.f14862g);
            } else {
                c0Var = null;
            }
        }
        return c0Var;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getHeight() {
        int height;
        synchronized (this.f14856a) {
            height = this.f14859d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final int getWidth() {
        int width;
        synchronized (this.f14856a) {
            width = this.f14859d.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0
    public final void h(InterfaceC1700l0.a aVar, Executor executor) {
        synchronized (this.f14856a) {
            this.f14859d.h(new i(1, this, aVar), executor);
        }
    }
}
