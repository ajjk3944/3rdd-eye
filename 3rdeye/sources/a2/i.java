package A2;

import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import t4.AbstractC5605c;
import t4.C5603a;
import t4.InterfaceC5604b;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f18b = i;
        this.f19c = obj;
        this.f20d = obj2;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f18b) {
            case 0:
                E1.a connection = (E1.a) obj;
                l lVar = ((o) this.f19c).f29b;
                kotlin.jvm.internal.l.f(connection, "connection");
                Model model = (Model) this.f20d;
                if (model != null) {
                    E1.c cVarK0 = connection.K0("INSERT OR REPLACE INTO `Model` (`id`,`name`,`pack`) VALUES (nullif(?, 0),?,?)");
                    try {
                        lVar.j(cVarK0, model);
                        cVarK0.x();
                        cVarK0.close();
                    } finally {
                    }
                }
                return null;
            default:
                C5603a c5603a = (C5603a) obj;
                if (c5603a.f46399b == 3) {
                    a.b bVar = va.a.f47104a;
                    bVar.o("PremiumHelper");
                    bVar.a("UpdateManager: resuming update flow " + c5603a, new Object[0]);
                    ((InterfaceC5604b) this.f19c).b(c5603a, (PHSplashActivity) this.f20d, AbstractC5605c.c());
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    e.a.a().f();
                }
                return C1992A.f18074a;
        }
    }
}
