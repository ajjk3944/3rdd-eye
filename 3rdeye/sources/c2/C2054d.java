package c2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2054d extends AbstractRunnableC2056f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T1.z f18412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18414e;

    public C2054d(T1.z zVar, String str, boolean z10) {
        this.f18412c = zVar;
        this.f18413d = str;
        this.f18414e = z10;
    }

    @Override // c2.AbstractRunnableC2056f
    public final void b() {
        T1.z zVar = this.f18412c;
        WorkDatabase workDatabase = zVar.f12232c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.y().q(this.f18413d).iterator();
            while (it.hasNext()) {
                AbstractRunnableC2056f.a(zVar, (String) it.next());
            }
            workDatabase.r();
            workDatabase.n();
            if (this.f18414e) {
                T1.q.b(zVar.f12231b, zVar.f12232c, zVar.f12234e);
            }
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
