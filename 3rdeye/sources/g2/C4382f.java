package g2;

import T1.s;
import h2.C4407a;
import h2.j;

/* compiled from: RemoteWorkManagerClient.java */
/* renamed from: g2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4382f implements InterfaceC4379c<androidx.work.multiprocess.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f37949a;

    public C4382f(s sVar) {
        this.f37949a = sVar;
    }

    @Override // g2.InterfaceC4379c
    public final void a(Object obj, androidx.work.multiprocess.g gVar) throws Throwable {
        s sVar = this.f37949a;
        h2.j jVar = new h2.j();
        jVar.f38173b = new j.b(sVar);
        ((androidx.work.multiprocess.b) obj).u(C4407a.a(jVar), gVar);
    }
}
