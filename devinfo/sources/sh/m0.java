package sh;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f33734i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f33735k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b5.z f33736l;

    public m0(n0 n0Var, List list) {
        this.f33734i = 0;
        this.f33736l = n0Var;
        this.f33735k = DeviceInfoApp.f21145f.getString(R.string.unknown);
        this.j = list;
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        ArrayList arrayList;
        switch (this.f33734i) {
            case 0:
                return ((List) this.j).size();
            default:
                ui.d dVar = ((ui.b) this.f33736l).Z;
                if (dVar == null || (arrayList = dVar.f35355a) == null) {
                    return 0;
                }
                return arrayList.size();
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, int i4) {
        String str;
        int i10 = this.f33734i;
        Object obj = this.f33735k;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) x1Var;
                vg.d dVar = (vg.d) ((List) this.j).get(i4);
                String str2 = dVar.f36229c;
                String str3 = dVar.f36227a;
                if (((String) obj).equals(str2)) {
                    l0Var.f33727c.setText(str3);
                } else {
                    l0Var.f33727c.setText(dVar.f36229c);
                }
                l0Var.f33728d.setText(dVar.f36228b);
                l0Var.f33729e.setText(DeviceInfoApp.f21145f.getString(R.string.name) + " : " + str3);
                l0Var.f33730f.setText(dVar.f36230d);
                l0Var.g.setText(dVar.f36231e);
                l0Var.f33731h.setImageResource(dVar.g);
                break;
            default:
                ui.a aVar = (ui.a) x1Var;
                ui.c cVar = (ui.c) ((ui.b) this.f33736l).Z.f35355a.get(i4);
                ActivityInfo activityInfo = cVar.f35350a;
                aVar.f35329c.setText(activityInfo.name);
                aVar.f35330d.setText(activityInfo.loadLabel((PackageManager) obj));
                String str4 = "N/A";
                aVar.f35332f.setText(TextUtils.isEmpty(activityInfo.permission) ? "N/A" : activityInfo.permission);
                aVar.f35338n.setText(activityInfo.taskAffinity);
                TextView textView = aVar.f35333h;
                int i11 = activityInfo.softInputMode;
                List list = ti.e.f34667a;
                StringBuilder sb2 = new StringBuilder();
                if (ti.e.e(i11, 48)) {
                    sb2.append("Adjust nothing, ");
                }
                if (ti.e.e(i11, 32)) {
                    sb2.append("Adjust pan, ");
                }
                if (ti.e.e(i11, 16)) {
                    sb2.append("Adjust resize, ");
                }
                if (ti.e.e(i11, 0)) {
                    sb2.append("Adjust unspecified, ");
                }
                if (ti.e.e(i11, 3)) {
                    sb2.append("Always hidden, ");
                }
                if (ti.e.e(i11, 5)) {
                    sb2.append("Always visible, ");
                }
                if (ti.e.e(i11, 2)) {
                    sb2.append("Hidden, ");
                }
                if (ti.e.e(i11, 4)) {
                    sb2.append("Visible, ");
                }
                if (ti.e.e(i11, 1)) {
                    sb2.append("Unchanged, ");
                }
                if (ti.e.e(i11, 0)) {
                    sb2.append("Unspecified, ");
                }
                if (sb2.length() > 2) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                String string = sb2.toString();
                if (string.equals("")) {
                    string = "N/A";
                }
                textView.setText(string);
                TextView textView2 = aVar.j;
                switch (activityInfo.screenOrientation) {
                    case -1:
                        str = "Unspecified";
                        break;
                    case 0:
                        str = "Landscape";
                        break;
                    case 1:
                        str = "Portrait";
                        break;
                    case 2:
                        str = "User";
                        break;
                    case 3:
                        str = "Behind";
                        break;
                    case 4:
                        str = "Sensor";
                        break;
                    case 5:
                        str = "No sensor";
                        break;
                    case 6:
                        str = "Sensor landscape";
                        break;
                    case 7:
                        str = "Sensor portrait";
                        break;
                    case 8:
                        str = "Reverse landscape";
                        break;
                    case 9:
                        str = "Reverse portrait";
                        break;
                    case 10:
                        str = "Full sensor";
                        break;
                    case 11:
                        str = "User landscape";
                        break;
                    case 12:
                        str = "User portrait";
                        break;
                    case 13:
                        str = "Full user";
                        break;
                    case 14:
                        str = "Locked";
                        break;
                    default:
                        str = "N/A";
                        break;
                }
                textView2.setText(str);
                TextView textView3 = aVar.f35336l;
                int i12 = activityInfo.launchMode;
                if (i12 == 0) {
                    str4 = "Multiple";
                } else if (i12 == 1) {
                    str4 = "Single top";
                } else if (i12 == 2) {
                    str4 = "Single task";
                } else if (i12 == 3) {
                    str4 = "Single instance";
                }
                textView3.setText(str4);
                aVar.f35340p.setEnabled(activityInfo.isEnabled() && activityInfo.exported);
                aVar.f35341q.setVisibility(cVar.f35351b ? 0 : 8);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public final x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        switch (this.f33734i) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sensor, viewGroup, false);
                if (com.liuzh.deviceinfo.utilities.d.k()) {
                    com.liuzh.deviceinfo.utilities.y.j(1.02f, viewInflate);
                }
                return new l0(this, viewInflate);
            default:
                return new ui.a(this, ((LayoutInflater) this.j).inflate(R.layout.appi_item_appinfo_activity, viewGroup, false));
        }
    }

    public m0(ui.b bVar) {
        this.f33734i = 1;
        this.f33736l = bVar;
        this.j = LayoutInflater.from(bVar.f35348b0);
        this.f33735k = bVar.f35348b0.getPackageManager();
    }
}
