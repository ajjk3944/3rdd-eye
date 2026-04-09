package oi;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzh.deviceinfo.utilities.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30574a;

    public /* synthetic */ i(int i4) {
        this.f30574a = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30574a) {
            case 0:
                Context context = view.getContext();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    String packageName = context.getPackageName();
                    if (!powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                        intent.setData(Uri.parse("package:" + packageName));
                        try {
                            context.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException | SecurityException unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                Context context2 = view.getContext();
                try {
                    String str = Build.BRAND;
                    if ("huawei".equalsIgnoreCase(str) || "honor".equalsIgnoreCase(str)) {
                        try {
                            y.m(context2, "com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity");
                        } catch (Exception unused2) {
                            y.m(context2, "com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity");
                        }
                    } else if ("xiaomi".equalsIgnoreCase(str) || "redmi".equalsIgnoreCase(str)) {
                        y.m(context2, "com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
                    } else {
                        String str2 = Build.MANUFACTURER;
                        if ("oppo".equalsIgnoreCase(str2)) {
                            try {
                                try {
                                    try {
                                        y.l(context2, "com.coloros.phonemanager");
                                    } catch (Exception unused3) {
                                        y.l(context2, "com.coloros.safecenter");
                                    }
                                } catch (Exception unused4) {
                                    y.l(context2, "com.oppo.safe");
                                }
                            } catch (Exception unused5) {
                                y.l(context2, "com.coloros.oppoguardelf");
                            }
                        } else if ("vivo".equalsIgnoreCase(str2)) {
                            y.l(context2, "com.iqoo.secure");
                        } else if ("meizu".equalsIgnoreCase(str2)) {
                            y.l(context2, "com.meizu.safe");
                        } else if ("samsung".equalsIgnoreCase(str2)) {
                            try {
                                y.l(context2, "com.samsung.android.sm_cn");
                            } catch (Exception unused6) {
                                y.l(context2, "com.samsung.android.sm");
                            }
                        } else if ("letv".equalsIgnoreCase(str2)) {
                            y.m(context2, "com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity");
                        } else if ("smartisan".equalsIgnoreCase(str2)) {
                            y.l(context2, "com.smartisanos.security");
                        }
                    }
                    break;
                } catch (Exception unused7) {
                    return;
                }
            case 2:
                ProActivity.D(view.getContext());
                break;
            case 3:
                ProActivity.D(view.getContext());
                break;
            default:
                view.getContext().startActivity(new Intent(view.getContext(), (Class<?>) DiskPartitionActivity.class));
                break;
        }
    }
}
