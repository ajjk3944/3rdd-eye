package uc;

import android.content.Context;
import android.os.RemoteException;
import bf.n;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import h7.h0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends jc.a {

    /* renamed from: e, reason: collision with root package name */
    public final MapView f23528e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f23529f;

    /* renamed from: g, reason: collision with root package name */
    public h0 f23530g;

    /* renamed from: h, reason: collision with root package name */
    public final GoogleMapOptions f23531h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f23532i = new ArrayList();

    public i(MapView mapView, Context context, GoogleMapOptions googleMapOptions) {
        this.f23528e = mapView;
        this.f23529f = context;
        this.f23531h = googleMapOptions;
    }

    @Override // jc.a
    public final void a(h0 h0Var) {
        this.f23530g = h0Var;
        if (h0Var == null || this.f13586a != null) {
            return;
        }
        try {
            Context context = this.f23529f;
            boolean z10 = c.f23519a;
            synchronized (c.class) {
                c.a(context);
            }
            vc.i iVarW = se.b.e0(context).W(new jc.d(context), this.f23531h);
            if (iVarW == null) {
                return;
            }
            this.f23530g.O(new h(this.f23528e, iVarW));
            ArrayList arrayList = this.f23532i;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((h) this.f13586a).k((d) it.next());
            }
            arrayList.clear();
        } catch (RemoteException e4) {
            throw new n(e4);
        } catch (zb.e unused) {
        }
    }
}
