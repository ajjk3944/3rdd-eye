package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BillingConnection.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.BillingConnection", f = "BillingConnection.kt", l = {34}, m = "connect$premium_helper_5_0_3_regularRelease")
/* renamed from: k8.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5250B extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public E f43446l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43447m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E f43448n;

    /* renamed from: o, reason: collision with root package name */
    public int f43449o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5250B(E e4, h9.c cVar) {
        super(cVar);
        this.f43448n = e4;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43447m = obj;
        this.f43449o |= RecyclerView.UNDEFINED_DURATION;
        return this.f43448n.a(this);
    }
}
