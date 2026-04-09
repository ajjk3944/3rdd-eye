package uc;

import android.app.Activity;
import android.os.RemoteException;
import bf.n;
import com.google.android.gms.maps.SupportMapFragment;
import h7.h0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends jc.a {

    /* renamed from: e, reason: collision with root package name */
    public final SupportMapFragment f23535e;

    /* renamed from: f, reason: collision with root package name */
    public h0 f23536f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f23537g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23538h = new ArrayList();

    public k(SupportMapFragment supportMapFragment) {
        this.f23535e = supportMapFragment;
    }

    @Override // jc.a
    public final void a(h0 h0Var) {
        this.f23536f = h0Var;
        e();
    }

    public final void e() {
        Activity activity = this.f23537g;
        if (activity == null || this.f23536f == null || this.f13586a != null) {
            return;
        }
        try {
            boolean z10 = c.f23519a;
            synchronized (c.class) {
                c.a(activity);
            }
            vc.h hVarV = se.b.e0(this.f23537g).V(new jc.d(this.f23537g));
            if (hVarV == null) {
                return;
            }
            this.f23536f.O(new j(this.f23535e, hVarV));
            ArrayList arrayList = this.f23538h;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((j) this.f13586a).k((d) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e4) {
            throw new n(e4);
        } catch (zb.e unused) {
        }
    }
}
