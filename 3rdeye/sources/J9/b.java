package J9;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Select.kt */
@h9.e(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {438, 441}, m = "doSelectSuspend")
/* loaded from: classes3.dex */
public final class b extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public a f2925l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2926m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a<Object> f2927n;

    /* renamed from: o, reason: collision with root package name */
    public int f2928o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, h9.c cVar) {
        super(cVar);
        this.f2927n = aVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f2926m = obj;
        this.f2928o |= RecyclerView.UNDEFINED_DURATION;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f2911g;
        return this.f2927n.g(this);
    }
}
