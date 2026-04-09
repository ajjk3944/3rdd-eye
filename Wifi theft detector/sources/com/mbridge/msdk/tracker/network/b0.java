package com.mbridge.msdk.tracker.network;

/* loaded from: classes3.dex */
public abstract class b0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final q f18286a;

    /* renamed from: b, reason: collision with root package name */
    private long f18287b;

    /* renamed from: c, reason: collision with root package name */
    private int f18288c;

    /* renamed from: d, reason: collision with root package name */
    private String f18289d;

    public b0() {
        this.f18288c = 0;
        this.f18289d = "";
        this.f18286a = null;
    }

    public void a(long j10) {
        this.f18287b = j10;
    }

    public abstract int d();

    public int g() {
        return this.f18288c;
    }

    public void a(int i10) {
        this.f18288c = i10;
    }

    public b0(q qVar) {
        this.f18288c = 0;
        this.f18289d = "";
        this.f18286a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f18288c = 0;
        this.f18289d = "";
        this.f18286a = null;
    }

    public b0(Throwable th) {
        super(th);
        this.f18288c = 0;
        this.f18289d = "";
        this.f18286a = null;
    }
}
