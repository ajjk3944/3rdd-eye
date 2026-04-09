package J8;

import J8.E;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PHResult.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.PHResult$Companion", f = "PHResult.kt", l = {14}, m = "suspendOf")
/* loaded from: classes3.dex */
public final class D<T> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2810l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E.a f2811m;

    /* renamed from: n, reason: collision with root package name */
    public int f2812n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E.a aVar, h9.c cVar) {
        super(cVar);
        this.f2811m = aVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f2810l = obj;
        this.f2812n |= RecyclerView.UNDEFINED_DURATION;
        return this.f2811m.a(null, this);
    }
}
