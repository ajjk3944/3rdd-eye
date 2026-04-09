package r3;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f32746a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f32747b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32748c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32749d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32750e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f32751f;
    public final PendingIntent g;

    public i(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = IconCompat.b(null, "", 2131231037);
        Bundle bundle = new Bundle();
        this.f32749d = true;
        this.f32747b = iconCompatB;
        if (iconCompatB.d() == 2) {
            this.f32750e = iconCompatB.c();
        }
        this.f32751f = o.b(str);
        this.g = pendingIntent;
        this.f32746a = bundle;
        this.f32748c = true;
        this.f32749d = true;
    }
}
