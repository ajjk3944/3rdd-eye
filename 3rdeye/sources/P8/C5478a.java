package p8;

import androidx.recyclerview.widget.RecyclerView;
import h9.e;

/* compiled from: TotoConfigRepository.kt */
@e(c = "com.zipoapps.premiumhelper.configuration.toto.TotoConfigRepository", f = "TotoConfigRepository.kt", l = {65}, m = "allPreferencesToString")
/* renamed from: p8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5478a extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f45296l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f45297m;

    /* renamed from: n, reason: collision with root package name */
    public int f45298n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5478a(c cVar, h9.c cVar2) {
        super(cVar2);
        this.f45297m = cVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f45296l = obj;
        this.f45298n |= RecyclerView.UNDEFINED_DURATION;
        return this.f45297m.f(this);
    }
}
