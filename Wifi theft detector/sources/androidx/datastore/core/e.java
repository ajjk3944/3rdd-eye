package androidx.datastore.core;

import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.w0;
import z8.q;
import z8.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2924a = new e();

    public static /* synthetic */ d b(e eVar, i iVar, b1.b bVar, List list, j0 j0Var, l9.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = r.j();
        }
        if ((i10 & 8) != 0) {
            j0Var = k0.a(w0.b().plus(n2.b(null, 1, null)));
        }
        return eVar.a(iVar, bVar, list, j0Var, aVar);
    }

    public final d a(i serializer, b1.b bVar, List migrations, j0 scope, l9.a produceFile) {
        p.e(serializer, "serializer");
        p.e(migrations, "migrations");
        p.e(scope, "scope");
        p.e(produceFile, "produceFile");
        return new SingleProcessDataStore(produceFile, serializer, q.e(DataMigrationInitializer.f2891a.b(migrations)), new b1.a(), scope);
    }
}
