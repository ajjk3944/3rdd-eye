package b4;

import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1696c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1697d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1698e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1699f;

    public k(Uri uri, int i4, int i10, boolean z3, int i11) {
        uri.getClass();
        this.f1694a = uri;
        this.f1695b = i4;
        this.f1696c = i10;
        this.f1697d = z3;
        this.f1698e = null;
        this.f1699f = i11;
    }

    public k(String str, String str2) {
        this.f1694a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f1695b = 0;
        this.f1696c = 400;
        this.f1697d = false;
        this.f1698e = str2;
        this.f1699f = 0;
    }
}
