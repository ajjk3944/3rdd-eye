package t3;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.liuzh.deviceinfo.DeviceInfoApp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public DeviceInfoApp f34156a;

    /* renamed from: b, reason: collision with root package name */
    public String f34157b;

    /* renamed from: c, reason: collision with root package name */
    public Intent[] f34158c;

    /* renamed from: d, reason: collision with root package name */
    public String f34159d;

    /* renamed from: e, reason: collision with root package name */
    public String f34160e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f34161f;
    public PersistableBundle g;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f34156a, this.f34157b).setShortLabel(this.f34159d).setIntents(this.f34158c);
        IconCompat iconCompat = this.f34161f;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.g(this.f34156a));
        }
        if (!TextUtils.isEmpty(this.f34160e)) {
            intents.setLongLabel(this.f34160e);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.g;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            intents.setLongLived(false);
        } else {
            if (this.g == null) {
                this.g = new PersistableBundle();
            }
            this.g.putBoolean("extraLongLived", false);
            intents.setExtras(this.g);
        }
        if (i4 >= 33) {
            a4.c.d(intents);
        }
        return intents.build();
    }
}
