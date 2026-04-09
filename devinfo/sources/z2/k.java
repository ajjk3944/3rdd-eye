package z2;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.CheckBox;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import z7.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements u8.a {
    public static Drawable a() {
        Drawable drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_soc_default);
        if (drawable instanceof LayerDrawable) {
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            com.liuzh.deviceinfo.utilities.d.r((LayerDrawable) drawable, com.liuzh.deviceinfo.utilities.f.e());
        }
        return drawable;
    }

    public int b(Context context) {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        return com.liuzh.deviceinfo.utilities.f.d();
    }

    public void c(CheckBox checkBox) {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        checkBox.setButtonTintList(dj.b.b(com.liuzh.deviceinfo.utilities.f.a(), deviceInfoApp));
    }

    public void d(Dialog dialog) {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.a();
        dj.b.t(dialog, com.liuzh.deviceinfo.utilities.f.d());
    }

    @Override // u8.a
    public Object h() {
        return new x();
    }
}
