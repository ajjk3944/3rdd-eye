package j0;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 implements u0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26988c;

    public /* synthetic */ u0(int i4, Object obj, Object obj2) {
        this.f26986a = i4;
        this.f26987b = obj;
        this.f26988c = obj2;
    }

    @Override // u0.f0
    public final void a() {
        switch (this.f26986a) {
            case 0:
                ((v0) this.f26987b).f26992c.j(this.f26988c);
                break;
            case 1:
                ((Context) this.f26987b).getApplicationContext().unregisterComponentCallbacks((j2.f0) this.f26988c);
                break;
            default:
                ((Context) this.f26987b).getApplicationContext().unregisterComponentCallbacks((j2.g0) this.f26988c);
                break;
        }
    }
}
