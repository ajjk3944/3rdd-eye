package w5;

import androidx.recyclerview.widget.RecyclerView;
import w5.o;

/* compiled from: InstallationId.kt */
@h9.e(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
/* loaded from: classes2.dex */
public final class n extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f47430l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o.a f47432n;

    /* renamed from: o, reason: collision with root package name */
    public int f47433o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o.a aVar, h9.c cVar) {
        super(cVar);
        this.f47432n = aVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47431m = obj;
        this.f47433o |= RecyclerView.UNDEFINED_DURATION;
        return this.f47432n.a(null, this);
    }
}
