package com.google.ads.mediation;

import android.os.RemoteException;
import android.widget.TextView;
import com.google.android.gms.internal.ads.C1338iu;
import com.google.android.gms.internal.ads.InterfaceC0688Qc;
import com.lefan.signal.MyApplication;
import com.lefan.signal.activity.SplashActivity;
import j2.C2545a;
import j2.u;
import t4.C2931b;
import u2.k;
import u4.RunnableC2956a;
import w2.p;

/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6839d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6840e;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f6839d = i;
        this.f6840e = obj2;
    }

    @Override // j2.u
    public void a() {
        switch (this.f6839d) {
            case 1:
                MyApplication.f18812d = true;
                break;
        }
    }

    @Override // j2.u
    public final void b() {
        switch (this.f6839d) {
            case 0:
                C1338iu c1338iu = (C1338iu) ((p) this.f6840e);
                c1338iu.getClass();
                M2.u.c("#008 Must be called on the main UI thread.");
                k.c("Adapter called onAdClosed.");
                try {
                    ((InterfaceC0688Qc) c1338iu.f14822b).d();
                    break;
                } catch (RemoteException e6) {
                    k.k("#007 Could not call remote method.", e6);
                    return;
                }
            case 1:
                MyApplication.f18816h = false;
                SplashActivity splashActivity = MyApplication.f18813e;
                if (splashActivity != null) {
                    TextView textView = splashActivity.f18823P;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    splashActivity.f18822O.postDelayed(new RunnableC2956a(splashActivity, 1), 500L);
                }
                Z3.c cVar = (Z3.c) this.f6840e;
                cVar.f4531b = null;
                cVar.a(MyApplication.i);
                break;
            default:
                C2931b c2931b = (C2931b) this.f6840e;
                c2931b.f23674c = null;
                c2931b.a();
                break;
        }
    }

    @Override // j2.u
    public void d(C2545a c2545a) {
        switch (this.f6839d) {
            case 1:
                Z3.c cVar = (Z3.c) this.f6840e;
                cVar.f4531b = null;
                MyApplication.f18816h = false;
                SplashActivity splashActivity = MyApplication.f18813e;
                if (splashActivity != null) {
                    TextView textView = splashActivity.f18823P;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    splashActivity.f18822O.postDelayed(new RunnableC2956a(splashActivity, 1), 500L);
                }
                cVar.a(MyApplication.i);
                break;
            case 2:
                C2931b c2931b = (C2931b) this.f6840e;
                c2931b.f23674c = null;
                c2931b.a();
                break;
        }
    }

    @Override // j2.u
    public void g() {
        switch (this.f6839d) {
            case 0:
                C1338iu c1338iu = (C1338iu) ((p) this.f6840e);
                c1338iu.getClass();
                M2.u.c("#008 Must be called on the main UI thread.");
                k.c("Adapter called onAdOpened.");
                try {
                    ((InterfaceC0688Qc) c1338iu.f14822b).j();
                    break;
                } catch (RemoteException e6) {
                    k.k("#007 Could not call remote method.", e6);
                    return;
                }
        }
    }

    public d(C2931b c2931b) {
        this.f6839d = 2;
        this.f6840e = c2931b;
    }
}
