package w5;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SessionFirelogPublisher.kt */
@h9.e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {94}, m = "shouldLogSession")
/* renamed from: w5.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5721A extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public z f47344l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47345m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f47346n;

    /* renamed from: o, reason: collision with root package name */
    public int f47347o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5721A(z zVar, h9.c cVar) {
        super(cVar);
        this.f47346n = zVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47345m = obj;
        this.f47347o |= RecyclerView.UNDEFINED_DURATION;
        return z.b(this.f47346n, this);
    }
}
