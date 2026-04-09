package zc;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26914a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f26915d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i1 f26916g;

    public /* synthetic */ e1(i1 i1Var, zzr zzrVar, int i10) {
        this.f26914a = i10;
        this.f26915d = zzrVar;
        this.f26916g = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f26914a) {
            case 0:
                i1 i1Var = this.f26916g;
                i1Var.f26968d.w();
                i1Var.f26968d.U(this.f26915d);
                break;
            case 1:
                i1 i1Var2 = this.f26916g;
                i1Var2.f26968d.w();
                p3 p3Var = i1Var2.f26968d;
                p3Var.J().s1();
                p3Var.i0();
                zzr zzrVar = this.f26915d;
                cc.s.h(zzrVar);
                String str = zzrVar.f5426a;
                cc.s.e(str);
                int i10 = 0;
                if (p3Var.b0().C1(null, u.f27221z0)) {
                    p3Var.C0().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iA1 = p3Var.b0().A1(null, u.f27186i0);
                    p3Var.b0();
                    long jLongValue = jCurrentTimeMillis - ((Long) u.f27173e.a(null)).longValue();
                    while (i10 < iA1 && p3Var.E(jLongValue, null)) {
                        i10++;
                    }
                } else {
                    p3Var.b0();
                    long jIntValue = ((Integer) u.f27192l.a(null)).intValue();
                    while (i10 < jIntValue && p3Var.E(0L, str)) {
                        i10++;
                    }
                }
                if (p3Var.b0().C1(null, u.A0)) {
                    p3Var.J().s1();
                    p3Var.D();
                }
                m3 m3Var = p3Var.F;
                com.google.android.gms.internal.measurement.o3 o3VarZzb = com.google.android.gms.internal.measurement.o3.zzb(zzrVar.f5427a0);
                m3Var.s1();
                if (o3VarZzb == com.google.android.gms.internal.measurement.o3.CLIENT_UPLOAD_ELIGIBLE && !m3.v1(str)) {
                    w0 w0Var = m3Var.f26981g.f27091a;
                    p3.Q(w0Var);
                    com.google.android.gms.internal.measurement.d2 d2VarE1 = w0Var.E1(str);
                    if (d2VarE1 != null && d2VarE1.D() && !d2VarE1.E().q().isEmpty()) {
                        p3Var.x().K.c(str, "[sgtm] Going background, trigger client side upload. appId");
                        p3Var.C0().getClass();
                        p3Var.m(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                i1 i1Var3 = this.f26916g;
                i1Var3.f26968d.w();
                p3 p3Var2 = i1Var3.f26968d;
                p3Var2.J().s1();
                p3Var2.i0();
                zzr zzrVar2 = this.f26915d;
                cc.s.e(zzrVar2.f5426a);
                p3Var2.Y(zzrVar2);
                break;
            case 3:
                i1 i1Var4 = this.f26916g;
                i1Var4.f26968d.w();
                p3 p3Var3 = i1Var4.f26968d;
                if (p3Var3.U != null) {
                    ArrayList arrayList = new ArrayList();
                    p3Var3.V = arrayList;
                    arrayList.addAll(p3Var3.U);
                }
                l lVar = p3Var3.f27099g;
                p3.Q(lVar);
                c1 c1Var = (c1) lVar.f1504d;
                zzr zzrVar3 = this.f26915d;
                String str2 = zzrVar3.f5426a;
                cc.s.h(str2);
                cc.s.e(str2);
                lVar.s1();
                lVar.t1();
                try {
                    SQLiteDatabase sQLiteDatabaseH2 = lVar.h2();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseH2.delete("apps", "app_id=?", strArr) + sQLiteDatabaseH2.delete("events", "app_id=?", strArr) + sQLiteDatabaseH2.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseH2.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseH2.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseH2.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseH2.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseH2.delete("queue", "app_id=?", strArr) + sQLiteDatabaseH2.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseH2.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseH2.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseH2.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseH2.delete("upload_queue", "app_id=?", strArr);
                    if (c1Var.f26887r.C1(null, u.f27184h1)) {
                        iDelete += sQLiteDatabaseH2.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        j0 j0Var = c1Var.f26889y;
                        c1.g(j0Var);
                        j0Var.K.d(str2, Integer.valueOf(iDelete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e4) {
                    j0 j0Var2 = c1Var.f26889y;
                    c1.g(j0Var2);
                    j0Var2.B.d(j0.A1(str2), e4, "Error resetting analytics data. appId, error");
                }
                if (zzrVar3.D) {
                    p3Var3.U(zzrVar3);
                    break;
                }
                break;
            case 4:
                i1 i1Var5 = this.f26916g;
                i1Var5.f26968d.w();
                p3 p3Var4 = i1Var5.f26968d;
                p3Var4.J().s1();
                p3Var4.i0();
                zzr zzrVar4 = this.f26915d;
                cc.s.e(zzrVar4.f5426a);
                p3Var4.j0(zzrVar4);
                p3Var4.k0(zzrVar4);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                p3 p3Var5 = this.f26916g.f26968d;
                p3Var5.w();
                p3Var5.k0(this.f26915d);
                break;
            default:
                p3 p3Var6 = this.f26916g.f26968d;
                p3Var6.w();
                p3Var6.j0(this.f26915d);
                break;
        }
    }
}
