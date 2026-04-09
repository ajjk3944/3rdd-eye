package com.mbridge.msdk.config.component.load.downloader;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private a f13480a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13481b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13482c;

    public a a() {
        return this.f13480a;
    }

    public boolean b() {
        return this.f13481b;
    }

    public boolean c() {
        return this.f13482c;
    }

    public void a(a aVar) {
        this.f13480a = aVar;
        b(false);
    }

    public void b(boolean z10) {
        this.f13482c = z10;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f13481b = z10;
    }
}
