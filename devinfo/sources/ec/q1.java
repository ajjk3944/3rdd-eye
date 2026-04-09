package ec;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.ads.d7;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f23007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f23008c;

    public /* synthetic */ q1(u1 u1Var, n4 n4Var, int i4) {
        this.f23006a = i4;
        this.f23007b = n4Var;
        this.f23008c = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f23006a) {
            case 0:
                u1 u1Var = this.f23008c;
                u1Var.f23089a.B();
                u1Var.f23089a.Y(this.f23007b);
                break;
            case 1:
                u1 u1Var2 = this.f23008c;
                u1Var2.f23089a.B();
                g4 g4Var = u1Var2.f23089a;
                g4Var.b().B();
                g4Var.l0();
                n4 n4Var = this.f23007b;
                pb.y.h(n4Var);
                String str = n4Var.f22915a;
                pb.y.e(str);
                int i4 = 0;
                if (g4Var.e0().L(null, d0.A0)) {
                    g4Var.f().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iJ = g4Var.e0().J(null, d0.f22642j0);
                    g4Var.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) d0.f22628e.a(null)).longValue();
                    while (i4 < iJ && g4Var.I(jLongValue, null)) {
                        i4++;
                    }
                } else {
                    g4Var.e0();
                    long jIntValue = ((Integer) d0.f22647l.a(null)).intValue();
                    while (i4 < jIntValue && g4Var.I(0L, str)) {
                        i4++;
                    }
                }
                if (g4Var.e0().L(null, d0.B0)) {
                    g4Var.b().B();
                    g4Var.H();
                }
                d4 d4Var = g4Var.j;
                int iC = d7.c(n4Var.E);
                d4Var.B();
                if (iC == 2 && !d4.E(str)) {
                    h1 h1Var = d4Var.f23175c.f22731a;
                    g4.U(h1Var);
                    com.google.android.gms.internal.measurement.f2 f2VarN = h1Var.N(str);
                    if (f2VarN != null && f2VarN.D() && !f2VarN.E().q().isEmpty()) {
                        g4Var.a().f23060o.e(str, "[sgtm] Going background, trigger client side upload. appId");
                        g4Var.f().getClass();
                        g4Var.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                u1 u1Var3 = this.f23008c;
                u1Var3.f23089a.B();
                g4 g4Var2 = u1Var3.f23089a;
                g4Var2.b().B();
                g4Var2.l0();
                n4 n4Var2 = this.f23007b;
                pb.y.e(n4Var2.f22915a);
                g4Var2.c0(n4Var2);
                break;
            case 3:
                u1 u1Var4 = this.f23008c;
                u1Var4.f23089a.B();
                g4 g4Var3 = u1Var4.f23089a;
                if (g4Var3.f22753y != null) {
                    ArrayList arrayList = new ArrayList();
                    g4Var3.f22754z = arrayList;
                    arrayList.addAll(g4Var3.f22753y);
                }
                m mVar = g4Var3.f22733c;
                g4.U(mVar);
                o1 o1Var = (o1) mVar.f218b;
                n4 n4Var3 = this.f23007b;
                String str2 = n4Var3.f22915a;
                pb.y.h(str2);
                pb.y.e(str2);
                mVar.B();
                mVar.C();
                try {
                    SQLiteDatabase sQLiteDatabaseQ0 = mVar.q0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseQ0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("events", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("upload_queue", "app_id=?", strArr);
                    if (o1Var.f22952d.L(null, d0.f22641i1)) {
                        iDelete += sQLiteDatabaseQ0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        s0 s0Var = o1Var.f22954f;
                        o1.m(s0Var);
                        s0Var.f23060o.f(str2, Integer.valueOf(iDelete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e2) {
                    s0 s0Var2 = o1Var.f22954f;
                    o1.m(s0Var2);
                    s0Var2.g.f(s0.J(str2), e2, "Error resetting analytics data. appId, error");
                }
                if (n4Var3.f22921h) {
                    g4Var3.Y(n4Var3);
                    break;
                }
                break;
            case 4:
                u1 u1Var5 = this.f23008c;
                u1Var5.f23089a.B();
                g4 g4Var4 = u1Var5.f23089a;
                g4Var4.b().B();
                g4Var4.l0();
                n4 n4Var4 = this.f23007b;
                pb.y.e(n4Var4.f22915a);
                g4Var4.m0(n4Var4);
                g4Var4.n0(n4Var4);
                break;
            case 5:
                g4 g4Var5 = this.f23008c.f23089a;
                g4Var5.B();
                g4Var5.n0(this.f23007b);
                break;
            default:
                g4 g4Var6 = this.f23008c.f23089a;
                g4Var6.B();
                g4Var6.m0(this.f23007b);
                break;
        }
    }
}
