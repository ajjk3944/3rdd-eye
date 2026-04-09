package i7;

import H6.C0672i;
import N7.C1322q5;
import N7.Z;
import b9.q;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivTreeVisitor.kt */
/* loaded from: classes.dex */
public final class e extends m implements InterfaceC5480a<List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i<Object> f38468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z.c f38469h;
    public final /* synthetic */ C0672i i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C5865d f38470j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i<Object> iVar, Z.c cVar, C0672i c0672i, C5865d c5865d) {
        super(0);
        this.f38468g = iVar;
        this.f38469h = cVar;
        this.i = c0672i;
        this.f38470j = c5865d;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>> invoke() {
        C1322q5 c1322q5 = this.f38469h.f7815c;
        C0672i c0672i = this.i;
        return i.c(this.f38468g, C4460a.c(c1322q5, c0672i.f2147b), c0672i, this.f38470j);
    }
}
