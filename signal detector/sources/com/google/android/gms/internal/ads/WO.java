package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class WO {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12221a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12222b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12223c;

    /* renamed from: d, reason: collision with root package name */
    public int f12224d = 0;

    public final XO a() {
        if (this.f12221a || !(this.f12222b || this.f12223c)) {
            return new XO(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
