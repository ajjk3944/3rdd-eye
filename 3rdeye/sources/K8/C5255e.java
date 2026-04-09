package k8;

import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.ads.AdRequest;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {507, 509, AdRequest.MAX_CONTENT_URL_LENGTH}, m = "consumeAll")
/* renamed from: k8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5255e extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43477l;

    /* renamed from: m, reason: collision with root package name */
    public BillingClient f43478m;

    /* renamed from: n, reason: collision with root package name */
    public int f43479n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f43480o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f43481p;

    /* renamed from: q, reason: collision with root package name */
    public int f43482q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5255e(t tVar, h9.c cVar) {
        super(cVar);
        this.f43481p = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43480o = obj;
        this.f43482q |= RecyclerView.UNDEFINED_DURATION;
        return this.f43481p.j(this);
    }
}
