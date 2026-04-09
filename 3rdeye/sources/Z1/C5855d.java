package z1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SupportSQLiteConnectionPool.android.kt */
@h9.e(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", l = {83}, m = "transaction")
/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5855d<R> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public C5854c f48415l;

    /* renamed from: m, reason: collision with root package name */
    public F1.b f48416m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f48417n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C5854c f48418o;

    /* renamed from: p, reason: collision with root package name */
    public int f48419p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5855d(C5854c c5854c, h9.c cVar) {
        super(cVar);
        this.f48418o = c5854c;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f48417n = obj;
        this.f48419p |= RecyclerView.UNDEFINED_DURATION;
        return this.f48418o.e(null, null, this);
    }
}
