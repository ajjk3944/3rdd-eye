package c2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2052b extends AbstractRunnableC2056f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T1.z f18408c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f18409d;

    public C2052b(T1.z zVar, UUID uuid) {
        this.f18408c = zVar;
        this.f18409d = uuid;
    }

    @Override // c2.AbstractRunnableC2056f
    public final void b() {
        T1.z zVar = this.f18408c;
        WorkDatabase workDatabase = zVar.f12232c;
        workDatabase.c();
        try {
            AbstractRunnableC2056f.a(zVar, this.f18409d.toString());
            workDatabase.r();
            workDatabase.n();
            T1.q.b(zVar.f12231b, zVar.f12232c, zVar.f12234e);
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
