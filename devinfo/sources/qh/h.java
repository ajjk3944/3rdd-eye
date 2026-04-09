package qh;

import ah.o;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import je.u;
import nk.k;
import nk.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32406c;

    public /* synthetic */ h(int i4, Object obj, Object obj2) {
        this.f32404a = i4;
        this.f32405b = obj;
        this.f32406c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) throws PackageManager.NameNotFoundException {
        List list;
        int i10;
        int i11 = this.f32404a;
        Object obj = this.f32406c;
        Object obj2 = this.f32405b;
        switch (i11) {
            case 0:
                SettingsActivity settingsActivity = (SettingsActivity) obj2;
                int i12 = SettingsActivity.J;
                u.z(com.liuzh.deviceinfo.utilities.f.f21257c, "dark_mode", settingsActivity.getResources().getIntArray(R.array.dark_mode_vals)[i4]);
                settingsActivity.F.setText(((String[]) obj)[i4]);
                dialogInterface.dismiss();
                break;
            case 1:
                jj.f fVar = ((rj.f) obj2).f32999e;
                final int i13 = ((s) obj).f29984a;
                if (fVar.f27707s != i13 && (list = fVar.f27699k) != null && !list.isEmpty()) {
                    fVar.f27707s = i13;
                    System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    List<rj.c> list2 = fVar.f27699k;
                    nk.k.b(list2);
                    for (rj.c cVar : list2) {
                        if (cVar instanceof rj.b) {
                            arrayList.add(cVar);
                            ((rj.b) cVar).f32991c = false;
                        }
                    }
                    Collections.sort(arrayList, new Comparator() { // from class: jj.e
                        @Override // java.util.Comparator
                        public final int compare(Object obj3, Object obj4) {
                            int i14;
                            rj.b bVar = (rj.b) obj3;
                            rj.b bVar2 = (rj.b) obj4;
                            int i15 = i13;
                            if (i15 == 0) {
                                int i16 = -k.f(bVar.f32990b.size(), bVar2.f32990b.size());
                                if (i16 != 0) {
                                    return i16;
                                }
                            } else if (i15 == 2 && (i14 = -k.f(bVar.f32993e, bVar2.f32993e)) != 0) {
                                return i14;
                            }
                            return -k.g(bVar.a(), bVar2.a());
                        }
                    });
                    List list3 = fVar.f27699k;
                    nk.k.b(list3);
                    list3.clear();
                    List list4 = fVar.f27699k;
                    nk.k.b(list4);
                    list4.addAll(arrayList);
                    fVar.f27703o.h(yj.u.f37649a);
                    break;
                }
                break;
            case 2:
                ((th.h) obj2).f34617i.invoke(Integer.valueOf(i4), (gg.a) obj);
                break;
            case 3:
                xg.g gVar = (xg.g) obj;
                wg.s sVar = (wg.s) ((ArrayList) obj2).get(i4);
                gVar.j0(sVar);
                xg.h hVarK0 = gVar.k0();
                hVarK0.getClass();
                DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                nk.k.d(deviceInfoApp, "instance");
                hVarK0.g(deviceInfoApp);
                Object objD = hVarK0.f37106b.d();
                nk.k.b(objD);
                CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
                ArrayList arrayListS0 = zj.n.s0(customMonitorConfig.getContent());
                arrayListS0.add(sVar);
                hVarK0.h(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, arrayListS0, 131071, null));
                break;
            default:
                i.g gVar2 = (i.g) obj;
                zh.g gVar3 = (zh.g) ((RecyclerView) obj2).getAdapter();
                zh.b bVar = (gVar3 == null || (i10 = gVar3.f38294i) < 0) ? null : (zh.b) zh.a.f38283b.get(i10);
                o oVar = o.f400d;
                oVar.getClass();
                boolean z3 = mg.d.f29372a;
                if (oVar.c()) {
                    if (bVar != null) {
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        com.liuzh.deviceinfo.utilities.f.f21257c.edit().putInt("themes_primary_color", bVar.f38285b).putInt("themes_accent_color", bVar.f38286c).apply();
                        com.liuzh.deviceinfo.utilities.f.k("observer_recreate_notifier", !r2.getBoolean("observer_recreate_notifier", false));
                        break;
                    }
                } else if (bVar != null) {
                    d dVar = new d();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("theme", bVar);
                    dVar.Z(bundle);
                    dVar.h0(gVar2.s(), "RewardThemeColorDialog");
                    break;
                } else {
                    ProActivity.D(gVar2);
                    break;
                }
                break;
        }
    }
}
