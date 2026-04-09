package y9;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends sa.c {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f37374a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f37375b;

    public c(Uri uri) {
        this.f37375b = uri;
    }

    @Override // sa.c
    public final Drawable a() {
        return this.f37374a;
    }

    @Override // sa.c
    public final double b() {
        return 1.0d;
    }

    @Override // sa.c
    public final Uri c() {
        return this.f37375b;
    }
}
