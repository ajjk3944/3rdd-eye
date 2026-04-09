package p5;

import android.content.Context;
import nk.k;
import nk.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, int i4) {
        super(1);
        this.f31373a = i4;
        this.f31374b = context;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f31373a) {
            case 0:
                k.e((Context) obj, "it");
                return new c(this.f31374b, 0);
            case 1:
                k.e((Context) obj, "it");
                return new q5.e(this.f31374b, 0);
            default:
                k.e((Context) obj, "it");
                return new q5.e(this.f31374b, 1);
        }
    }
}
