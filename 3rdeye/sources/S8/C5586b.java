package s8;

import androidx.recyclerview.widget.RecyclerView;
import h9.e;

/* compiled from: NetworkStateMonitor.kt */
@e(c = "com.zipoapps.premiumhelper.network.NetworkStateMonitor", f = "NetworkStateMonitor.kt", l = {121}, m = "getAvailableDomainsRatio")
/* renamed from: s8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5586b extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public C5585a f46177l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46178m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C5585a f46179n;

    /* renamed from: o, reason: collision with root package name */
    public int f46180o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5586b(C5585a c5585a, h9.c cVar) {
        super(cVar);
        this.f46179n = c5585a;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f46178m = obj;
        this.f46180o |= RecyclerView.UNDEFINED_DURATION;
        return this.f46179n.a(this);
    }
}
