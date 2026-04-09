package A9;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Timeout.kt */
@h9.e(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {101}, m = "withTimeoutOrNull")
/* loaded from: classes3.dex */
public final class Q0<T> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public p9.p f202l;

    /* renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.w f203m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f204n;

    /* renamed from: o, reason: collision with root package name */
    public int f205o;

    public Q0() {
        throw null;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f204n = obj;
        this.f205o |= RecyclerView.UNDEFINED_DURATION;
        return C0585k.c(0L, null, this);
    }
}
