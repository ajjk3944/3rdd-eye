package com.google.android.gms.ads.internal.offline.buffering;

import V0.f;
import V0.i;
import V0.k;
import V0.l;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.InterfaceC0570Jd;
import q2.C2816f;
import q2.C2834o;
import q2.r;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0570Jd f6851g;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C2834o c2834o = r.f23260g.f23262b;
        BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
        c2834o.getClass();
        this.f6851g = (InterfaceC0570Jd) new C2816f(c2834o, context, binderC0569Jc).d(context, false);
    }

    @Override // androidx.work.Worker
    public final l doWork() {
        try {
            this.f6851g.e();
            return new k(f.f3820c);
        } catch (RemoteException unused) {
            return new i();
        }
    }
}
