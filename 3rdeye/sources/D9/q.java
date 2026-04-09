package D9;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Reduce.kt */
@h9.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
/* loaded from: classes3.dex */
public final class q<T> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.w f1238l;

    /* renamed from: m, reason: collision with root package name */
    public o f1239m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f1240n;

    /* renamed from: o, reason: collision with root package name */
    public int f1241o;

    public q() {
        throw null;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f1240n = obj;
        this.f1241o |= RecyclerView.UNDEFINED_DURATION;
        return H.d(null, this);
    }
}
