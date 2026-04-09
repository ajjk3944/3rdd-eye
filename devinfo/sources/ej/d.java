package ej;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.internal.ads.xz;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorActivity;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import java.util.ArrayList;
import p.h2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements nj.a, ma.b, h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23497c;

    public /* synthetic */ d(int i4, Object obj, Object obj2) {
        this.f23496b = obj;
        this.f23495a = i4;
        this.f23497c = obj2;
    }

    public void a() {
        int i4;
        i iVar = (i) this.f23496b;
        nj.b bVar = (nj.b) this.f23497c;
        ArrayList arrayList = iVar.c0().f28363c;
        nk.k.d(arrayList, "getAnalyzeResultItemList(...)");
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i4 = this.f23495a;
            if (i11 >= size) {
                i10 = -1;
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            if (((kj.h) obj).f28371d == i4) {
                break;
            } else {
                i10++;
            }
        }
        if (i4 >= 0) {
            e eVar = iVar.f23507c0;
            if (eVar == null) {
                nk.k.k("mAdapter");
                throw null;
            }
            eVar.notifyItemChanged(i10);
        }
        bVar.animate().scaleY(1.1f).scaleX(1.1f).alpha(0.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(300L).setListener(new g(iVar, 1)).start();
        iVar.f23506b0 = null;
    }

    @Override // ma.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f23496b;
        ((i0.f) dVar.f19298d).N((ea.i) this.f23497c, this.f23495a + 1, false);
        return null;
    }

    @Override // p.h2
    public void onMenuItemClick(MenuItem menuItem) {
        CustomMonitorActivity customMonitorActivity = (CustomMonitorActivity) this.f23496b;
        ArrayList arrayList = customMonitorActivity.C;
        e eVar = (e) this.f23497c;
        int itemId = menuItem.getItemId();
        int i4 = this.f23495a;
        if (itemId == 1) {
            int i10 = CustomMonitorActivity.F;
            if (customMonitorActivity.D()) {
                xg.g gVar = new xg.g();
                Bundle bundle = new Bundle();
                bundle.putParcelable("custom_monitor", (Parcelable) arrayList.get(i4));
                gVar.Z(bundle);
                gVar.h0(customMonitorActivity.s(), "EditMonitorDialog");
                return;
            }
            return;
        }
        if (menuItem.getItemId() == 2) {
            MonitorManager.f21223f.f(((CustomMonitorConfig) arrayList.remove(i4)).getId());
            eVar.notifyItemRemoved(i4);
            com.liuzh.deviceinfo.utilities.f.f21256b.o(arrayList);
            xz xzVar = customMonitorActivity.B;
            if (xzVar != null) {
                ((TextView) xzVar.f18588e).setVisibility(arrayList.isEmpty() ? 0 : 8);
                return;
            } else {
                nk.k.k("viewBinding");
                throw null;
            }
        }
        if (menuItem.getItemId() == 3) {
            t7.m mVar = new t7.m(customMonitorActivity);
            i.b bVar = (i.b) mVar.f34474c;
            bVar.f25233d = "Config";
            bVar.f25235f = new com.google.gson.j().g(arrayList.get(i4));
            mVar.x(R.string.confirm, null);
            mVar.A().setCanceledOnTouchOutside(false);
        }
    }

    public /* synthetic */ d(com.google.android.gms.internal.consent_sdk.d dVar, ea.i iVar, int i4) {
        this.f23496b = dVar;
        this.f23497c = iVar;
        this.f23495a = i4;
    }
}
