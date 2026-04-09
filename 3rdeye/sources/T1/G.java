package T1;

import b9.C1992A;
import c2.RunnableC2058h;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: WorkerUpdater.kt */
/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.work.w f12133g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f12134h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1598j f12135j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(androidx.work.w wVar, z zVar, String str, C1598j c1598j) {
        super(0);
        this.f12133g = wVar;
        this.f12134h = zVar;
        this.i = str;
        this.f12135j = c1598j;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        List listG = E.u.G(this.f12133g);
        new RunnableC2058h(new s(this.f12134h, this.i, androidx.work.g.KEEP, listG, null), this.f12135j).run();
        return C1992A.f18074a;
    }
}
