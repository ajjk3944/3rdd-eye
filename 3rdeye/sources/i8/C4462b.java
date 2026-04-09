package i8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Analytics.kt */
@h9.e(c = "com.zipoapps.premiumhelper.Analytics", f = "Analytics.kt", l = {105, 710}, m = "init$premium_helper_5_0_3_regularRelease")
/* renamed from: i8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4462b extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public C4461a f38515l;

    /* renamed from: m, reason: collision with root package name */
    public K9.d f38516m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f38517n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C4461a f38518o;

    /* renamed from: p, reason: collision with root package name */
    public int f38519p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4462b(C4461a c4461a, h9.c cVar) {
        super(cVar);
        this.f38518o = c4461a;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f38517n = obj;
        this.f38519p |= RecyclerView.UNDEFINED_DURATION;
        return this.f38518o.f(this);
    }
}
