package f1;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2323a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0.k f20031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f20032c;

    public C2323a(W0.k kVar, UUID uuid) {
        this.f20031b = kVar;
        this.f20032c = uuid;
    }

    @Override // f1.c
    public final void b() {
        W0.k kVar = this.f20031b;
        WorkDatabase workDatabase = kVar.f3992k;
        workDatabase.c();
        try {
            c.a(kVar, this.f20032c.toString());
            workDatabase.m();
            workDatabase.j();
            W0.d.a(kVar.f3991j, kVar.f3992k, kVar.f3994m);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
