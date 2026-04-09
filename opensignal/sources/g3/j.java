package g3;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f9294a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f9295b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9296c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9298e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f9299f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f9300g;

    public j(int i10, PendingIntent pendingIntent, String str) {
        IconCompat iconCompatB = i10 != 0 ? IconCompat.b(null, "", i10) : null;
        Bundle bundle = new Bundle();
        this.f9297d = true;
        this.f9295b = iconCompatB;
        if (iconCompatB != null && iconCompatB.d() == 2) {
            this.f9298e = iconCompatB.c();
        }
        this.f9299f = p.b(str);
        this.f9300g = pendingIntent;
        this.f9294a = bundle;
        this.f9296c = true;
        this.f9297d = true;
    }
}
