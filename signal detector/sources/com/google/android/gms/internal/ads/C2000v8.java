package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000v8 extends C0657Of {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17228b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17229c;

    public C2000v8(A1.s sVar) {
        this.f17229c = sVar;
    }

    @Override // com.google.android.gms.internal.ads.C0657Of, java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        switch (this.f17228b) {
            case 0:
                ((A1.s) this.f17229c).i();
                return this.f10212a.cancel(z6);
            default:
                return super.cancel(z6);
        }
    }

    public void d() {
        b(this.f17229c);
    }

    public C2000v8(Object obj) {
        this.f17229c = obj;
    }
}
