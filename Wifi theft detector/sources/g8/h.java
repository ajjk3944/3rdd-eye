package g8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.data.HistoryInfo;
import com.wifihacker.detector.mvp.view.activity.DeviceDetailActivity;
import com.wifihacker.detector.mvp.view.activity.GuideActivity;
import com.wifihacker.detector.mvp.view.activity.HistoryDetailActivity;
import com.wifihacker.detector.mvp.view.activity.MainActivity;
import com.wifihacker.detector.mvp.view.activity.RouterSettingsActivity;
import com.wifihacker.detector.mvp.view.activity.SplashActivity;
import com.wifihacker.detector.mvp.view.activity.WiFiInfoActivity;
import com.wifihacker.detector.mvp.view.activity.scan.ScanAnimationActivity;
import com.wifihacker.detector.mvp.view.activity.scan.ScanResultActivity;
import com.wifihacker.detector.mvp.view.activity.setting.AboutActivity;
import com.wifihacker.detector.mvp.view.activity.setting.HelpActivity;
import com.wifihacker.detector.mvp.view.activity.setting.ProActivity;
import com.wifihacker.detector.mvp.view.activity.setting.SettingActivity;
import com.wifihacker.detector.mvp.view.activity.tools.PingActivity;
import com.wifihacker.detector.mvp.view.activity.tools.WOLActivity;
import com.wifihacker.detector.mvp.view.activity.tools.WhoisActivity;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class h {
    public static void a(Context context) {
        context.startActivity(new Intent(context, (Class<?>) AboutActivity.class));
    }

    public static void b(Context context, HostInfo hostInfo, boolean z10, boolean z11) {
        Intent intent = new Intent(context, (Class<?>) DeviceDetailActivity.class);
        intent.putExtra("device_detail_info", hostInfo);
        intent.putExtra("is_only_read", z10);
        intent.putExtra("main", z11);
        context.startActivity(intent);
    }

    public static void c(Fragment fragment, HostInfo hostInfo, boolean z10) {
        try {
            Intent intent = new Intent(fragment.getContext(), (Class<?>) DeviceDetailActivity.class);
            intent.putExtra("device_detail_info", hostInfo);
            intent.putExtra("main", z10);
            fragment.startActivityForResult(intent, 2);
        } catch (Exception e10) {
            k.c("startDeviceDetailActivityForResult exception", e10);
        }
    }

    public static void d(Context context) {
        context.startActivity(new Intent(context, (Class<?>) GuideActivity.class));
    }

    public static void e(Context context) {
        context.startActivity(new Intent(context, (Class<?>) HelpActivity.class));
    }

    public static void f(Context context, HistoryInfo historyInfo) {
        Intent intent = new Intent(context, (Class<?>) HistoryDetailActivity.class);
        intent.putExtra("history_detail_info", historyInfo);
        context.startActivity(intent);
    }

    public static void g(Context context, int i10) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("adType", i10);
        context.startActivity(intent);
    }

    public static void h(Context context) {
        context.startActivity(new Intent(context, (Class<?>) PingActivity.class));
    }

    public static void i(Context context) {
        context.startActivity(new Intent(context, (Class<?>) ProActivity.class));
    }

    public static void j(Context context, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) RouterSettingsActivity.class);
        intent.putExtra("showInter", z10);
        context.startActivity(intent);
    }

    public static void k(Context context, boolean z10, boolean z11) {
        HackerApplication.l().z(true);
        Intent intent = new Intent(context, (Class<?>) ScanAnimationActivity.class);
        intent.putExtra("main", z10);
        intent.putExtra("first_scan", z11);
        context.startActivity(intent);
    }

    public static void l(Context context, ArrayList arrayList, boolean z10, boolean z11) {
        if (s.n(context)) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) ScanResultActivity.class);
        intent.putExtra("online_devices", arrayList);
        intent.putExtra("main", z10);
        intent.putExtra("back_main", z11);
        context.startActivity(intent);
    }

    public static void m(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) SettingActivity.class));
    }

    public static void n(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SplashActivity.class));
    }

    public static void o(Context context) {
        context.startActivity(new Intent(context, (Class<?>) WOLActivity.class));
    }

    public static void p(Context context) {
        context.startActivity(new Intent(context, (Class<?>) WhoisActivity.class));
    }

    public static void q(Context context) {
        context.startActivity(new Intent(context, (Class<?>) WiFiInfoActivity.class));
    }
}
