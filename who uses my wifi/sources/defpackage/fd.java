package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fd extends gd {
    public final /* synthetic */ int g;
    public final /* synthetic */ ha1 h;

    public /* synthetic */ fd(ha1 ha1Var, int i) {
        this.g = i;
        this.h = ha1Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.gd
    public final void b() {
        switch (this.g) {
            case 0:
                ha1 ha1Var = this.h;
                WorkDatabase workDatabase = ha1Var.r;
                workDatabase.c();
                try {
                    ArrayList arrayListG = workDatabase.n().g();
                    int size = arrayListG.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListG.get(i);
                        i++;
                        gd.a(ha1Var, (String) obj);
                    }
                    workDatabase.h();
                    workDatabase.f();
                    gt0.a(ha1Var.q, ha1Var.r, ha1Var.t);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            default:
                ha1 ha1Var2 = this.h;
                WorkDatabase workDatabase2 = ha1Var2.r;
                workDatabase2.c();
                try {
                    ArrayList arrayListF = workDatabase2.n().f();
                    int size2 = arrayListF.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListF.get(i2);
                        i2++;
                        gd.a(ha1Var2, (String) obj2);
                    }
                    workDatabase2.h();
                    workDatabase2.f();
                    return;
                } catch (Throwable th2) {
                    workDatabase2.f();
                    throw th2;
                }
        }
    }
}
