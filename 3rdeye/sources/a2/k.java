package A2;

import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.f;
import java.util.List;
import k8.F;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26d;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.f24b = i;
        this.f25c = obj;
        this.f26d = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        Object obj2 = this.f26d;
        Object obj3 = this.f25c;
        switch (this.f24b) {
            case 0:
                E1.a connection = (E1.a) obj;
                l lVar = ((o) obj3).f29b;
                kotlin.jvm.internal.l.f(connection, "connection");
                List list = (List) obj2;
                if (list != null) {
                    E1.c cVarK0 = connection.K0("INSERT OR REPLACE INTO `Model` (`id`,`name`,`pack`) VALUES (nullif(?, 0),?,?)");
                    try {
                        for (Object obj4 : list) {
                            if (obj4 != null) {
                                lVar.j(cVarK0, obj4);
                                cVarK0.x();
                                cVarK0.reset();
                            }
                        }
                        C1992A c1992a = C1992A.f18074a;
                        F.d(cVarK0, null);
                    } finally {
                    }
                }
                return null;
            default:
                f.c result = (f.c) obj;
                kotlin.jvm.internal.l.f(result, "result");
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().f37026p.f47584d.c();
                A8.k kVar = (A8.k) obj3;
                kVar.f142h = result != f.c.NONE;
                A8.k.f(kVar, (ActivityC1762o) obj2, 2);
                return C1992A.f18074a;
        }
    }
}
