package C9;

import androidx.recyclerview.widget.RecyclerView;
import p9.InterfaceC5480a;

/* compiled from: Produce.kt */
@h9.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {150}, m = "awaitClose")
/* loaded from: classes3.dex */
public final class p extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public u f1010l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC5480a f1011m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f1012n;

    /* renamed from: o, reason: collision with root package name */
    public int f1013o;

    public p() {
        throw null;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f1012n = obj;
        this.f1013o |= RecyclerView.UNDEFINED_DURATION;
        return s.a(null, null, this);
    }
}
