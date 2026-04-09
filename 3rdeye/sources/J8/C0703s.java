package J8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FacebookInstallData.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData", f = "FacebookInstallData.kt", l = {63}, m = "fetchFromServer")
/* renamed from: J8.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0703s extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0705u f2897m;

    /* renamed from: n, reason: collision with root package name */
    public int f2898n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0703s(C0705u c0705u, h9.c cVar) {
        super(cVar);
        this.f2897m = c0705u;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f2896l = obj;
        this.f2898n |= RecyclerView.UNDEFINED_DURATION;
        return this.f2897m.a(this);
    }
}
