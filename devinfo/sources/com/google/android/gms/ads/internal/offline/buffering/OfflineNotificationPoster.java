package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zs;
import t6.q;
import t6.s;
import t6.t;
import va.f;
import va.o;
import va.r;
import vb.b;
import wa.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: e, reason: collision with root package name */
    public final zs f9015e;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        o oVar = r.g.f36158b;
        yq yqVar = new yq();
        oVar.getClass();
        this.f9015e = (zs) new f(oVar, context, yqVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final t doWork() {
        try {
            this.f9015e.d4(new b(getApplicationContext()), new a(getInputData().a("uri"), getInputData().a("gws_query_id"), getInputData().a("image_url")));
            return new s();
        } catch (RemoteException unused) {
            return new q();
        }
    }
}
