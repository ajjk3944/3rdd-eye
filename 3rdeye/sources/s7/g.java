package s7;

import kotlin.jvm.internal.m;
import p9.l;
import s7.f;

/* compiled from: IndicatorsStripDrawer.kt */
/* loaded from: classes.dex */
public final class g extends m implements l<f.a, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.d f46161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v9.d dVar) {
        super(1);
        this.f46161g = dVar;
    }

    @Override // p9.l
    public final Boolean invoke(f.a aVar) {
        f.a it = aVar;
        kotlin.jvm.internal.l.f(it, "it");
        return Boolean.valueOf(!this.f46161g.a(Float.valueOf(it.f46155c)));
    }
}
