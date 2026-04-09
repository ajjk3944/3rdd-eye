package Y9;

import U9.C1604a;
import U9.C1610g;
import U9.r;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: RealConnection.kt */
/* loaded from: classes3.dex */
public final class h extends m implements InterfaceC5480a<List<? extends Certificate>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1610g f13873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f13874h;
    public final /* synthetic */ C1604a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C1610g c1610g, r rVar, C1604a c1604a) {
        super(0);
        this.f13873g = c1610g;
        this.f13874h = rVar;
        this.i = c1604a;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends Certificate> invoke() {
        ga.c cVar = this.f13873g.f12646b;
        kotlin.jvm.internal.l.c(cVar);
        return cVar.a(this.i.f12604h.f12715d, this.f13874h.a());
    }
}
