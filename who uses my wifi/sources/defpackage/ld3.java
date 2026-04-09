package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ld3 implements t9, u9 {
    public final vd3 f;
    public final String g;
    public final String h;
    public final av1 i;
    public final LinkedBlockingQueue j;
    public final HandlerThread k;
    public final gd3 l;
    public final long m;

    public ld3(Context context, av1 av1Var, String str, String str2, gd3 gd3Var) throws PackageManager.NameNotFoundException {
        this.g = str;
        this.i = av1Var;
        this.h = str2;
        this.l = gd3Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.k = handlerThread;
        handlerThread.start();
        this.m = System.currentTimeMillis();
        vd3 vd3Var = new vd3(context, handlerThread.getLooper(), this, this, 19621000);
        this.f = vd3Var;
        this.j = new LinkedBlockingQueue();
        vd3Var.n();
    }

    @Override // defpackage.t9
    public final void T(int i) throws InterruptedException {
        try {
            b(4011, this.m, null);
            this.j.put(new ce3());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.u9
    public final void U(rh rhVar) throws InterruptedException {
        try {
            b(4012, this.m, null);
            this.j.put(new ce3());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.t9
    public final void Y() {
        yd3 yd3Var;
        long j = this.m;
        HandlerThread handlerThread = this.k;
        try {
            yd3Var = (yd3) this.f.t();
        } catch (DeadObjectException | IllegalStateException unused) {
            yd3Var = null;
        }
        if (yd3Var != null) {
            try {
                be3 be3Var = new be3(1, 1, this.i.f, this.g, this.h);
                Parcel parcelU = yd3Var.U();
                iv1.c(parcelU, be3Var);
                Parcel parcelY = yd3Var.Y(parcelU, 3);
                ce3 ce3Var = (ce3) iv1.b(parcelY, ce3.CREATOR);
                parcelY.recycle();
                b(5011, j, null);
                this.j.put(ce3Var);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void a() {
        vd3 vd3Var = this.f;
        if (vd3Var != null) {
            if (vd3Var.a() || vd3Var.f()) {
                vd3Var.k();
            }
        }
    }

    public final void b(int i, long j, Exception exc) {
        gd3 gd3Var = this.l;
        if (gd3Var != null) {
            gd3Var.c(i, System.currentTimeMillis() - j, exc);
        }
    }
}
