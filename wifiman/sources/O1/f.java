package O1;

import Ii.N;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16782a = new f();

    private f() {
    }

    public final e a(j serializer, P1.b bVar, List migrations, N scope, InterfaceC6824a produceFile) {
        AbstractC6492s.i(serializer, "serializer");
        AbstractC6492s.i(migrations, "migrations");
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(produceFile, "produceFile");
        a aVar = bVar;
        if (bVar == null) {
            aVar = new P1.a();
        }
        return new l(produceFile, serializer, AbstractC3689v.e(d.f16765a.b(migrations)), aVar, scope);
    }
}
