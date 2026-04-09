package io.sentry;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11452a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.f0 f11453b;

    /* renamed from: c, reason: collision with root package name */
    public final n4 f11454c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11455d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11456e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11457f;

    public a(byte[] bArr) {
        this.f11452a = bArr;
        this.f11453b = null;
        this.f11454c = null;
        this.f11455d = "thread-dump.txt";
        this.f11456e = "text/plain";
        this.f11457f = "event.attachment";
    }

    public a(io.sentry.protocol.f0 f0Var) {
        this.f11452a = null;
        this.f11453b = f0Var;
        this.f11454c = null;
        this.f11455d = "view-hierarchy.json";
        this.f11456e = "application/json";
        this.f11457f = "event.view_hierarchy";
    }

    public a(n4 n4Var) {
        this.f11452a = null;
        this.f11453b = null;
        this.f11454c = n4Var;
        this.f11455d = "screenshot.png";
        this.f11456e = "image/png";
        this.f11457f = "event.attachment";
    }
}
