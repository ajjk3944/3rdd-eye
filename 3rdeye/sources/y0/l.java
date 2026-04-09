package y0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f47873a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f47874b;

    /* renamed from: c, reason: collision with root package name */
    public final x[] f47875c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47877e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final int f47878f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f47879g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f47880h;

    public l(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, x[] xVarArr2) {
        this.f47877e = true;
        this.f47874b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.f15492a;
            if ((i == -1 ? IconCompat.a.c(iconCompat.f15493b) : i) == 2) {
                this.f47878f = iconCompat.c();
            }
        }
        this.f47879g = o.b(charSequence);
        this.f47880h = pendingIntent;
        this.f47873a = bundle;
        this.f47875c = xVarArr;
        this.f47876d = true;
        this.f47877e = true;
    }
}
