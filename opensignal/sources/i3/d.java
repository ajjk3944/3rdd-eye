package i3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f11185a;

    /* renamed from: b, reason: collision with root package name */
    public String f11186b;

    /* renamed from: c, reason: collision with root package name */
    public Intent[] f11187c;

    /* renamed from: d, reason: collision with root package name */
    public String f11188d;

    /* renamed from: e, reason: collision with root package name */
    public String f11189e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f11190f;

    /* renamed from: g, reason: collision with root package name */
    public PersistableBundle f11191g;

    public final ShortcutInfo a() {
        b.i();
        ShortcutInfo.Builder intents = b.b(this.f11185a, this.f11186b).setShortLabel(this.f11188d).setIntents(this.f11187c);
        IconCompat iconCompat = this.f11190f;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.g(this.f11185a));
        }
        if (!TextUtils.isEmpty(this.f11189e)) {
            intents.setLongLabel(this.f11189e);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.f11191g;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            intents.setLongLived(false);
        } else {
            if (this.f11191g == null) {
                this.f11191g = new PersistableBundle();
            }
            this.f11191g.putBoolean("extraLongLived", false);
            intents.setExtras(this.f11191g);
        }
        if (i10 >= 33) {
            c.d(intents);
        }
        return intents.build();
    }
}
