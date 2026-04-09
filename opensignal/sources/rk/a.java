package rk;

import android.content.Context;
import android.database.SQLException;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.utils.q;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21615a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21616d;

    public /* synthetic */ a(MainActivity mainActivity, int i10) {
        this.f21615a = i10;
        this.f21616d = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, SQLException {
        int i10 = this.f21615a;
        int i11 = 1;
        MainActivity mainActivity = this.f21616d;
        switch (i10) {
            case 0:
                boolean z10 = MainActivity.f5997x0;
                a aVar = new a(mainActivity, i11);
                try {
                    Thread.sleep(1000L);
                    aVar.run();
                    return;
                } catch (InterruptedException e4) {
                    throw new RuntimeException(e4);
                }
            default:
                boolean z11 = MainActivity.f5997x0;
                Context applicationContext = mainActivity.getApplicationContext();
                mainActivity.U = null;
                try {
                    if (mainActivity.V == null) {
                        mainActivity.V = new qm.a(applicationContext);
                    }
                    mainActivity.V.e();
                    qm.a aVar2 = mainActivity.V;
                    if (((int) aVar2.f20914b.compileStatement("SELECT COUNT(*) FROM CellsAPI;").simpleQueryForLong()) > 2000) {
                        aVar2.f20914b.execSQL("DELETE FROM CellsAPI WHERE _id< (SELECT _id FROM CellsAPI LIMIT 200,1)");
                    }
                    mainActivity.V.a();
                } catch (Exception e10) {
                    e10.toString();
                }
                if (q.c(applicationContext).getBoolean("just_first_use", true) && MainActivity.f5999z0.booleanValue()) {
                    q.a(applicationContext).putBoolean("just_first_use", false).apply();
                    return;
                }
                return;
        }
    }
}
