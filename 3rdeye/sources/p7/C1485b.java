package P7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import p9.InterfaceC5480a;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {155, 157, 160}, m = "askForConsentIfRequired$premium_helper_5_0_3_regularRelease")
/* renamed from: P7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1485b extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f10726l;

    /* renamed from: m, reason: collision with root package name */
    public AppCompatActivity f10727m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC5480a f10728n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10729o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1484a f10730p;

    /* renamed from: q, reason: collision with root package name */
    public int f10731q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1485b(C1484a c1484a, h9.c cVar) {
        super(cVar);
        this.f10730p = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f10729o = obj;
        this.f10731q |= RecyclerView.UNDEFINED_DURATION;
        return this.f10730p.b(null, null, this);
    }
}
