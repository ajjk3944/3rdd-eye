package t7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.i1;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.m1;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.y2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f34493a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.p f34495c;

    public s(com.google.android.gms.common.api.internal.p pVar, boolean z3) {
        this.f34495c = pVar;
        this.f34494b = z3;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f34493a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f34494b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f34493a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        s sVar;
        try {
            try {
                if (this.f34493a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    sVar = this;
                    context.registerReceiver(sVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f34494b ? 4 : 2);
                } else {
                    sVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                sVar.f34493a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, c cVar, int i4, e3 e3Var, long j, boolean z3) {
        i1 i1VarI;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((km.n) ((q) this.f34495c.f9117d)).E(p.b(23, i4, cVar, null, e3Var), j, z3);
                return;
            }
            q qVar = (q) this.f34495c.f9117d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i10 = i1.f20148a;
            synchronized (i1.class) {
                int i11 = i1.f20148a;
                i2 i2Var = i2.f20149c;
                i1VarI = m1.I();
                int i12 = i1.f20148a;
            }
            ((km.n) qVar).E(y2.n(byteArray, i1VarI), j, z3);
        } catch (Throwable unused) {
            u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r19, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.s.onReceive(android.content.Context, android.content.Intent):void");
    }
}
