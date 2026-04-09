package zg;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.google.android.gms.internal.measurement.j4;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import eg.d;
import nk.k;
import rg.e;
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {
    public static final void a(Context context, Runnable runnable) {
        m mVar = new m(context);
        mVar.y(R.string.missing_permission);
        String string = DeviceInfoApp.f21145f.getString(R.string.allapps_permission_require);
        Spanned spannedF = Build.VERSION.SDK_INT >= 24 ? j4.f(string) : Html.fromHtml(string);
        k.d(spannedF, "fromHtml(...)");
        ((i.b) mVar.f34474c).f25235f = spannedF;
        mVar.x(R.string.grant, new e(1, runnable));
        mVar.w(android.R.string.cancel, null);
        mVar.A().setCanceledOnTouchOutside(false);
    }

    public static final void b(Context context) {
        m mVar = new m(context);
        mVar.y(R.string.missing_permission);
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        String string = deviceInfoApp.getString(R.string.allapps_permission_sys_settings_or_restart, deviceInfoApp.getString(R.string.app_name));
        k.d(string, "getString(...)");
        ((i.b) mVar.f34474c).f25235f = string;
        mVar.x(R.string.grant, new d(12, context));
        mVar.w(android.R.string.cancel, null);
        mVar.A().setCanceledOnTouchOutside(false);
    }
}
