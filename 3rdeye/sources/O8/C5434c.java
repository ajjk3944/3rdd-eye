package o8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: TestyUtils.kt */
@h9.e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyUtils", f = "TestyUtils.kt", l = {29}, m = "checkIfTestyCouldBeUsed")
/* renamed from: o8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5434c extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public boolean f44885l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f44886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f44887n;

    /* renamed from: o, reason: collision with root package name */
    public int f44888o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5434c(f fVar, h9.c cVar) {
        super(cVar);
        this.f44887n = fVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f44886m = obj;
        this.f44888o |= RecyclerView.UNDEFINED_DURATION;
        return this.f44887n.a(null, this);
    }
}
