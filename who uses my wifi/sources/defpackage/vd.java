package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vd implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ vd(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.j = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        oa1 oa1VarH;
        boolean zContains;
        uw1 uw1Var;
        boolean z;
        long j;
        final int i = 1;
        final int i2 = 0;
        switch (this.f) {
            case 0:
                xd xdVar = (xd) ((ug0) this.j).g;
                sd0 sd0Var = (sd0) this.h;
                wd wdVar = (wd) this.g;
                if (wdVar != null) {
                    xdVar.E = true;
                    wdVar.b.c(false);
                    xdVar.E = false;
                }
                if (sd0Var.isEnabled() && sd0Var.hasSubMenu()) {
                    ((od0) this.i).q(sd0Var, null, 4);
                    return;
                }
                return;
            case 1:
                ou0 ou0Var = (ou0) this.i;
                UUID uuid = (UUID) this.g;
                String string = uuid.toString();
                h80 h80VarD = h80.d();
                String str = la1.c;
                im imVar = (im) this.h;
                uuid.toString();
                Objects.toString(imVar);
                h80VarD.a(new Throwable[0]);
                la1 la1Var = (la1) this.j;
                WorkDatabase workDatabase = la1Var.a;
                WorkDatabase workDatabase2 = la1Var.a;
                workDatabase.c();
                try {
                    oa1VarH = workDatabase2.n().h(string);
                } catch (Throwable th) {
                    try {
                        h80.d().b(la1.c, "Error updating Worker progress", th);
                        ou0Var.j(th);
                    } finally {
                        workDatabase2.f();
                    }
                }
                if (oa1VarH == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (oa1VarH.b == 2) {
                    ka1 ka1Var = new ka1(string, imVar);
                    mc2 mc2VarM = workDatabase2.m();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mc2VarM.g;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((io) mc2VarM.h).e(ka1Var);
                        workDatabase_Impl.h();
                        workDatabase_Impl.f();
                    } catch (Throwable th2) {
                        workDatabase_Impl.f();
                        throw th2;
                    }
                } else {
                    h80.d().g(new Throwable[0]);
                }
                ou0Var.i(null);
                workDatabase2.h();
                return;
            case 2:
                h30 h30Var = (h30) this.j;
                b3 b3Var = (b3) this.i;
                Context context = (Context) this.g;
                try {
                    new k52(context, (String) this.h).d(b3Var.a, h30Var);
                    return;
                } catch (IllegalStateException e) {
                    r92.a(context).e("InterstitialAd.load", e);
                    return;
                }
            case 3:
                lu1 lu1Var = (lu1) this.g;
                String str2 = (String) this.h;
                cr1 cr1Var = (cr1) this.i;
                ad2 ad2Var = (ad2) this.j;
                nn2 nn2Var = lu1Var.b;
                nn2Var.e();
                synchronized (nn2Var.d) {
                    zContains = nn2Var.a.contains(str2);
                }
                if (zContains || lu1Var.a()) {
                    return;
                }
                cr1Var.e2(new oi0(lu1Var.a), ad2Var, null);
                return;
            case 4:
                bx2 bx2Var = (bx2) this.j;
                b3 b3Var2 = (b3) this.i;
                Context context2 = (Context) this.g;
                try {
                    new uk1(context2, (String) this.h, b3Var2.a, bx2Var).i();
                    return;
                } catch (IllegalStateException e2) {
                    r92.a(context2).e("AppOpenAd.load", e2);
                    return;
                }
            case 5:
                bx2 bx2Var2 = (bx2) this.j;
                b3 b3Var3 = (b3) this.i;
                Context context3 = (Context) this.g;
                try {
                    new pb2(context3, (String) this.h).b(b3Var3.a, bx2Var2);
                    return;
                } catch (IllegalStateException e3) {
                    r92.a(context3).e("RewardedInterstitialAd.load", e3);
                    return;
                }
            case 6:
                yw1 yw1Var = (yw1) this.j;
                vw1 vw1Var = (vw1) this.h;
                xb4 xb4Var = (xb4) this.g;
                try {
                    xw1 xw1Var = (xw1) vw1Var.t();
                    boolean z2 = vw1Var.z();
                    ww1 ww1Var = (ww1) this.i;
                    if (z2) {
                        Parcel parcelU = xw1Var.U();
                        iv1.c(parcelU, ww1Var);
                        Parcel parcelY = xw1Var.Y(parcelU, 2);
                        uw1Var = (uw1) iv1.b(parcelY, uw1.CREATOR);
                        parcelY.recycle();
                    } else {
                        Parcel parcelU2 = xw1Var.U();
                        iv1.c(parcelU2, ww1Var);
                        Parcel parcelY2 = xw1Var.Y(parcelU2, 1);
                        uw1Var = (uw1) iv1.b(parcelY2, uw1.CREATOR);
                        parcelY2.recycle();
                    }
                    if (!uw1Var.a()) {
                        yw1Var.b(new RuntimeException("No entry contents."));
                        ((wy0) xb4Var.i).d();
                        return;
                    }
                    zw1 zw1Var = new zw1(xb4Var, uw1Var.b());
                    int i3 = zw1Var.read();
                    if (i3 == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    zw1Var.unread(i3);
                    synchronized (uw1Var) {
                        z = uw1Var.g;
                    }
                    boolean zD = uw1Var.d();
                    synchronized (uw1Var) {
                        j = uw1Var.i;
                    }
                    yw1Var.a(new ax1(zw1Var, z, zD, j, uw1Var.c()));
                    return;
                } catch (RemoteException e4) {
                    e = e4;
                    gi2.c0("Unable to obtain a cache service instance.", e);
                    yw1Var.b(e);
                    ((wy0) xb4Var.i).d();
                    return;
                } catch (IOException e5) {
                    e = e5;
                    gi2.c0("Unable to obtain a cache service instance.", e);
                    yw1Var.b(e);
                    ((wy0) xb4Var.i).d();
                    return;
                }
            case 7:
                bx2 bx2Var3 = (bx2) this.j;
                b3 b3Var4 = (b3) this.i;
                Context context4 = (Context) this.g;
                try {
                    new hb2(context4, (String) this.h).b(b3Var4.a, bx2Var3);
                    return;
                } catch (IllegalStateException e6) {
                    r92.a(context4).e("RewardedAd.load", e6);
                    return;
                }
            case 8:
                AudioTrack audioTrack = (AudioTrack) this.g;
                final bi3 bi3Var = (bi3) this.h;
                Handler handler = (Handler) this.i;
                final le4 le4Var = (le4) this.j;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (bi3Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: te4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        wt2 wt2Var = ((ef4) bi3Var.g).A0;
                                        Handler handler2 = (Handler) wt2Var.g;
                                        if (handler2 != null) {
                                            handler2.post(new ee4(wt2Var, le4Var, 1));
                                            break;
                                        }
                                        break;
                                    default:
                                        wt2 wt2Var2 = ((ef4) bi3Var.g).A0;
                                        Handler handler3 = (Handler) wt2Var2.g;
                                        if (handler3 != null) {
                                            handler3.post(new ee4(wt2Var2, le4Var, 1));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (df4.f0) {
                        try {
                            int i4 = df4.h0 - 1;
                            df4.h0 = i4;
                            if (i4 == 0) {
                                df4.g0.shutdown();
                                df4.g0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (bi3Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: te4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        wt2 wt2Var = ((ef4) bi3Var.g).A0;
                                        Handler handler2 = (Handler) wt2Var.g;
                                        if (handler2 != null) {
                                            handler2.post(new ee4(wt2Var, le4Var, 1));
                                            break;
                                        }
                                        break;
                                    default:
                                        wt2 wt2Var2 = ((ef4) bi3Var.g).A0;
                                        Handler handler3 = (Handler) wt2Var2.g;
                                        if (handler3 != null) {
                                            handler3.post(new ee4(wt2Var2, le4Var, 1));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (df4.f0) {
                        try {
                            int i5 = df4.h0 - 1;
                            df4.h0 = i5;
                            if (i5 == 0) {
                                df4.g0.shutdown();
                                df4.g0 = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            default:
                oh4 oh4Var = (oh4) this.g;
                jv2 jv2Var = (jv2) this.h;
                ArrayDeque arrayDeque = (ArrayDeque) this.i;
                ArrayDeque arrayDeque2 = (ArrayDeque) this.j;
                oh4Var.e(jv2Var, arrayDeque, "to");
                oh4Var.e(jv2Var, arrayDeque2, "of");
                return;
        }
    }

    public /* synthetic */ vd(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
