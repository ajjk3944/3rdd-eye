package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k1 extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(String str, int i4) {
        super(str);
        this.f20172a = i4;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f20172a) {
            case 0:
                a();
                break;
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            default:
                d();
                break;
        }
        return this;
    }
}
