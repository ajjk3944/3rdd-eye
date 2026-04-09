package J;

import C.J;
import C.S;
import b9.C1992A;

/* compiled from: ScreenFlashWrapper.kt */
/* loaded from: classes.dex */
public final class i implements J.g {

    /* renamed from: a, reason: collision with root package name */
    public final J.g f2677a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2678b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2679c;

    /* renamed from: d, reason: collision with root package name */
    public J.h f2680d;

    public i(J.g gVar) {
        this.f2677a = gVar;
    }

    @Override // C.J.g
    public final void a(long j4, J.h screenFlashListener) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(screenFlashListener, "screenFlashListener");
        synchronized (this.f2678b) {
            this.f2679c = true;
            this.f2680d = screenFlashListener;
            C1992A c1992a2 = C1992A.f18074a;
        }
        J.g gVar = this.f2677a;
        if (gVar != null) {
            gVar.a(j4, new J.h() { // from class: J.h
                @Override // C.J.h
                public final void a() {
                    i this$0 = this.f2676a;
                    kotlin.jvm.internal.l.f(this$0, "this$0");
                    synchronized (this$0.f2678b) {
                        try {
                            if (this$0.f2680d == null) {
                                S.g("ScreenFlashWrapper", "apply: pendingListener is null!");
                            }
                            this$0.c();
                            C1992A c1992a3 = C1992A.f18074a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            S.b("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        C1992A c1992a;
        synchronized (this.f2678b) {
            try {
                if (this.f2679c) {
                    J.g gVar = this.f2677a;
                    if (gVar != null) {
                        gVar.clear();
                        c1992a = C1992A.f18074a;
                    } else {
                        c1992a = null;
                    }
                    if (c1992a == null) {
                        S.b("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    S.g("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f2679c = false;
                C1992A c1992a2 = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f2678b) {
            try {
                J.h hVar = this.f2680d;
                if (hVar != null) {
                    hVar.a();
                }
                this.f2680d = null;
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // C.J.g
    public final void clear() {
        b();
    }
}
