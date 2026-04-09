package o8;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: TestyConfiguration.kt */
@h9.e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyConfiguration", f = "TestyConfiguration.kt", l = {45, 47}, m = "init")
/* renamed from: o8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5432a extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public C5433b f44879l;

    /* renamed from: m, reason: collision with root package name */
    public Context f44880m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f44881n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C5433b f44882o;

    /* renamed from: p, reason: collision with root package name */
    public int f44883p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5432a(C5433b c5433b, h9.c cVar) {
        super(cVar);
        this.f44882o = c5433b;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f44881n = obj;
        this.f44883p |= RecyclerView.UNDEFINED_DURATION;
        return this.f44882o.f(null, this);
    }
}
