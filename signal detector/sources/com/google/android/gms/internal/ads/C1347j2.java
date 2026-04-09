package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347j2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14862a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14863b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14864c = false;

    public boolean a() {
        return (this.f14864c || this.f14863b) && this.f14862a;
    }

    public RO b() {
        if (this.f14862a || !(this.f14863b || this.f14864c)) {
            return new RO(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
