package yg;

import android.content.SharedPreferences;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.notification.NotificationService;
import com.liuzh.deviceinfo.utilities.f;
import java.util.ArrayList;
import pg.g;
import pg.h;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37615a;

    public /* synthetic */ d(int i4) {
        this.f37615a = i4;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f37615a) {
            case 0:
                String str2 = NotificationService.f21231b;
                if ("show_overview_notification".equalsIgnoreCase(str)) {
                    f fVar = f.f21256b;
                    if (!f.f21257c.getBoolean("show_overview_notification", true)) {
                        NotificationService.e(DeviceInfoApp.f21145f);
                        break;
                    } else {
                        NotificationService.d(DeviceInfoApp.f21145f);
                        break;
                    }
                }
                break;
            default:
                if ("themes_primary_color".equals(str) || "themes_accent_color".equals(str)) {
                    ArrayList arrayList = i.f38298a;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        g gVar = (g) obj;
                        gVar.getClass();
                        boolean z3 = gVar.f31958a;
                        gVar.f31960c.setValue(h.b(gVar.f31959b, z3));
                    }
                    break;
                }
                break;
        }
    }
}
