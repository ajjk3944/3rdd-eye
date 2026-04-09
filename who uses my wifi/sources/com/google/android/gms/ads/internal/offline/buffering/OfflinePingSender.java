package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.aj1;
import defpackage.bu1;
import defpackage.im;
import defpackage.o70;
import defpackage.q70;
import defpackage.r70;
import defpackage.s62;
import defpackage.sv1;
import defpackage.w82;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    public final w82 l;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        bu1 bu1Var = sv1.f.b;
        s62 s62Var = new s62();
        bu1Var.getClass();
        this.l = (w82) new aj1(bu1Var, context, s62Var).d(context, false);
    }

    @Override // androidx.work.Worker
    public final r70 doWork() {
        try {
            this.l.e();
            return new q70(im.c);
        } catch (RemoteException unused) {
            return new o70();
        }
    }
}
