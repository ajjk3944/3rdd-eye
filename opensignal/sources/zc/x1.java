package zc;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27263a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27264d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d2 f27265g;

    public /* synthetic */ x1(d2 d2Var, AtomicReference atomicReference, int i10, boolean z10) {
        this.f27263a = i10;
        this.f27265g = d2Var;
        this.f27264d = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f27264d;
        synchronized (atomicReference) {
            try {
                try {
                    c1 c1Var = (c1) this.f27265g.f1504d;
                    atomicReference.set(Double.valueOf(c1Var.f26887r.B1(c1Var.l().y1(), u.f27174e0)));
                } finally {
                    this.f27264d.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f27263a) {
            case 0:
                AtomicReference atomicReference = this.f27264d;
                synchronized (atomicReference) {
                    try {
                        try {
                            c1 c1Var = (c1) this.f27265g.f1504d;
                            atomicReference.set(Boolean.valueOf(c1Var.f26887r.C1(c1Var.l().y1(), u.f27162a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f27264d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c1 c1Var2 = (c1) this.f27265g.f1504d;
                            atomicReference2.set(c1Var2.f26887r.y1(c1Var2.l().y1(), u.f27165b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f27264d;
                synchronized (atomicReference3) {
                    try {
                        try {
                            c1 c1Var3 = (c1) this.f27265g.f1504d;
                            atomicReference3.set(Long.valueOf(c1Var3.f26887r.z1(c1Var3.l().y1(), u.f27168c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.f27264d;
                synchronized (atomicReference4) {
                    try {
                        try {
                            c1 c1Var4 = (c1) this.f27265g.f1504d;
                            atomicReference4.set(Integer.valueOf(c1Var4.f26887r.A1(c1Var4.l().y1(), u.f27171d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                d2 d2Var = this.f27265g;
                r0 r0Var = ((c1) d2Var.f1504d).f26888x;
                c1.e(r0Var);
                Bundle bundleS0 = r0Var.K.s0();
                x2 x2VarJ = ((c1) d2Var.f1504d).j();
                AtomicReference atomicReference5 = this.f27264d;
                x2VarJ.s1();
                x2VarJ.t1();
                x2VarJ.G1(new o.e(x2VarJ, atomicReference5, x2VarJ.I1(false), bundleS0, 8, false));
                return;
            default:
                x2 x2VarJ2 = ((c1) this.f27265g.f1504d).j();
                zzoo zzooVarD = zzoo.d(k2.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.f27264d;
                x2VarJ2.s1();
                x2VarJ2.t1();
                x2VarJ2.G1(new o.e(x2VarJ2, atomicReference6, x2VarJ2.I1(false), zzooVarD, 9, false));
                return;
        }
    }

    public x1(d2 d2Var, AtomicReference atomicReference, int i10) {
        this.f27263a = i10;
        switch (i10) {
            case 1:
                this.f27264d = atomicReference;
                Objects.requireNonNull(d2Var);
                this.f27265g = d2Var;
                break;
            case 2:
                this.f27264d = atomicReference;
                Objects.requireNonNull(d2Var);
                this.f27265g = d2Var;
                break;
            case 3:
                this.f27264d = atomicReference;
                Objects.requireNonNull(d2Var);
                this.f27265g = d2Var;
                break;
            case 4:
                this.f27264d = atomicReference;
                Objects.requireNonNull(d2Var);
                this.f27265g = d2Var;
                break;
            default:
                this.f27264d = atomicReference;
                Objects.requireNonNull(d2Var);
                this.f27265g = d2Var;
                break;
        }
    }
}
