package f1;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2324b extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0.k f20034c;

    public /* synthetic */ C2324b(W0.k kVar, int i) {
        this.f20033b = i;
        this.f20034c = kVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // f1.c
    public final void b() {
        switch (this.f20033b) {
            case 0:
                W0.k kVar = this.f20034c;
                WorkDatabase workDatabase = kVar.f3992k;
                workDatabase.c();
                try {
                    ArrayList arrayListG = workDatabase.t().g();
                    int size = arrayListG.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListG.get(i);
                        i++;
                        c.a(kVar, (String) obj);
                    }
                    workDatabase.m();
                    workDatabase.j();
                    W0.d.a(kVar.f3991j, kVar.f3992k, kVar.f3994m);
                    return;
                } catch (Throwable th) {
                    workDatabase.j();
                    throw th;
                }
            default:
                W0.k kVar2 = this.f20034c;
                WorkDatabase workDatabase2 = kVar2.f3992k;
                workDatabase2.c();
                try {
                    ArrayList arrayListF = workDatabase2.t().f();
                    int size2 = arrayListF.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayListF.get(i3);
                        i3++;
                        c.a(kVar2, (String) obj2);
                    }
                    workDatabase2.m();
                    workDatabase2.j();
                    return;
                } catch (Throwable th2) {
                    workDatabase2.j();
                    throw th2;
                }
        }
    }
}
