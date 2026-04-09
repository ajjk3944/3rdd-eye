package c2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053c extends AbstractRunnableC2056f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T1.z f18410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18411d;

    public C2053c(T1.z zVar, String str) {
        this.f18410c = zVar;
        this.f18411d = str;
    }

    @Override // c2.AbstractRunnableC2056f
    public final void b() {
        T1.z zVar = this.f18410c;
        WorkDatabase workDatabase = zVar.f12232c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.y().x(this.f18411d).iterator();
            while (it.hasNext()) {
                AbstractRunnableC2056f.a(zVar, (String) it.next());
            }
            workDatabase.r();
            workDatabase.n();
            T1.q.b(zVar.f12231b, zVar.f12232c, zVar.f12234e);
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
