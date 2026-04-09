package A2;

import C1.g;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.AppDatabase_Impl;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.HashSet;
import w1.l;

/* compiled from: AppDatabase_Impl.java */
/* loaded from: classes.dex */
public final class a extends w1.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f7d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppDatabase_Impl appDatabase_Impl) {
        super(3, "78c39016d1012e5b4c1a5f9d13760946", "0e6e26b833b800fb0b53e51761326fc1");
        this.f7d = appDatabase_Impl;
    }

    @Override // w1.l
    public final void a(E1.a aVar) {
        l.v(aVar, "CREATE TABLE IF NOT EXISTS `Model` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `pack` TEXT)");
        l.v(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        l.v(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '78c39016d1012e5b4c1a5f9d13760946')");
    }

    @Override // w1.l
    public final void b(E1.a aVar) {
        l.v(aVar, "DROP TABLE IF EXISTS `Model`");
    }

    @Override // w1.l
    public final void d(E1.a aVar) throws Exception {
        this.f7d.o(aVar);
    }

    @Override // w1.l
    public final void f(E1.a aVar) throws Exception {
        B7.d.j(aVar);
    }

    @Override // w1.l
    public final l.a g(E1.a aVar) throws Exception {
        HashMap map = new HashMap(3);
        map.put(FacebookMediationAdapter.KEY_ID, new g.a(1, FacebookMediationAdapter.KEY_ID, "INTEGER", null, true, 1));
        map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new g.a(0, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, false, 1));
        map.put("pack", new g.a(0, "pack", "TEXT", null, false, 1));
        C1.g gVar = new C1.g("Model", map, new HashSet(0), new HashSet(0));
        C1.g gVarA = g.b.a(aVar, "Model");
        if (gVar.equals(gVarA)) {
            return new l.a(true, null);
        }
        return new l.a(false, "Model(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
    }

    @Override // w1.l
    public final void c(E1.a aVar) {
    }

    @Override // w1.l
    public final void e(E1.a aVar) {
    }
}
