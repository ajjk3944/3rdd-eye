package ec;

import android.os.Bundle;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f22816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f22817c;

    public /* synthetic */ j2(q2 q2Var, AtomicReference atomicReference, int i4, boolean z3) {
        this.f22815a = i4;
        this.f22817c = q2Var;
        this.f22816b = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f22816b;
        synchronized (atomicReference) {
            try {
                try {
                    o1 o1Var = (o1) this.f22817c.f218b;
                    atomicReference.set(o1Var.f22952d.H(o1Var.r().H(), d0.f22623c0));
                } finally {
                    this.f22816b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.f22816b;
        synchronized (atomicReference) {
            try {
                try {
                    o1 o1Var = (o1) this.f22817c.f218b;
                    atomicReference.set(Long.valueOf(o1Var.f22952d.I(o1Var.r().H(), d0.f22626d0)));
                } finally {
                    this.f22816b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        AtomicReference atomicReference = this.f22816b;
        synchronized (atomicReference) {
            try {
                try {
                    o1 o1Var = (o1) this.f22817c.f218b;
                    atomicReference.set(Integer.valueOf(o1Var.f22952d.J(o1Var.r().H(), d0.f22629e0)));
                } finally {
                    this.f22816b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = this.f22816b;
        synchronized (atomicReference) {
            try {
                try {
                    o1 o1Var = (o1) this.f22817c.f218b;
                    atomicReference.set(Double.valueOf(o1Var.f22952d.K(o1Var.r().H(), d0.f22632f0)));
                } finally {
                    this.f22816b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f22815a) {
            case 0:
                AtomicReference atomicReference = this.f22816b;
                synchronized (atomicReference) {
                    try {
                        try {
                            o1 o1Var = (o1) this.f22817c.f218b;
                            atomicReference.set(Boolean.valueOf(o1Var.f22952d.L(o1Var.r().H(), d0.f22620b0)));
                        } finally {
                            this.f22816b.notify();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            case 5:
                q2 q2Var = this.f22817c;
                b1 b1Var = ((o1) q2Var.f218b).f22953e;
                o1.k(b1Var);
                Bundle bundleN = b1Var.f22566o.N();
                j3 j3VarP = ((o1) q2Var.f218b).p();
                AtomicReference atomicReference2 = this.f22816b;
                j3VarP.B();
                j3VarP.C();
                j3VarP.P(new ab.c(j3VarP, atomicReference2, j3VarP.R(false), bundleN, 8));
                return;
            default:
                j3 j3VarP2 = ((o1) this.f22817c.f218b).p();
                z3 z3VarA = z3.a(x2.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f22816b;
                j3VarP2.B();
                j3VarP2.C();
                j3VarP2.P(new ab.c(j3VarP2, atomicReference3, j3VarP2.R(false), z3VarA, 9));
                return;
        }
    }

    public j2(q2 q2Var, AtomicReference atomicReference, int i4) {
        this.f22815a = i4;
        switch (i4) {
            case 1:
                this.f22816b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f22817c = q2Var;
                break;
            case 2:
                this.f22816b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f22817c = q2Var;
                break;
            case 3:
                this.f22816b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f22817c = q2Var;
                break;
            case 4:
                this.f22816b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f22817c = q2Var;
                break;
            default:
                this.f22816b = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f22817c = q2Var;
                break;
        }
    }
}
