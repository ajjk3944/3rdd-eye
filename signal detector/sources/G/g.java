package G;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f1478a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f1479b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1480c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1481d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1482e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f1483f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f1484g;

    public g(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = IconCompat.b(2131230888);
        Bundle bundle = new Bundle();
        this.f1481d = true;
        this.f1479b = iconCompatB;
        if (iconCompatB.d() == 2) {
            this.f1482e = iconCompatB.c();
        }
        this.f1483f = l.b(str);
        this.f1484g = pendingIntent;
        this.f1478a = bundle;
        this.f1480c = true;
        this.f1481d = true;
    }
}
