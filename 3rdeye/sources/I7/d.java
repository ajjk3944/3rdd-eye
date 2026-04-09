package i7;

import H6.C0672i;
import N7.Z;
import b9.q;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivTreeVisitor.kt */
/* loaded from: classes.dex */
public final class d extends m implements InterfaceC5480a<List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i<Object> f38465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z.e f38466h;
    public final /* synthetic */ C0672i i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C5865d f38467j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i<Object> iVar, Z.e eVar, C0672i c0672i, C5865d c5865d) {
        super(0);
        this.f38465g = iVar;
        this.f38466h = eVar;
        this.i = c0672i;
        this.f38467j = c5865d;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>> invoke() {
        return i.a(this.f38465g, C4460a.i(this.f38466h.f7817c), this.i, this.f38467j);
    }
}
