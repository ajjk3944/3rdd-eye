package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.k;
import java.util.ArrayList;
import java.util.List;
import l2.p;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f4414e = k.f("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4416b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4417c;

    /* renamed from: d, reason: collision with root package name */
    public final h2.d f4418d;

    public b(Context context, int i10, d dVar) {
        this.f4415a = context;
        this.f4416b = i10;
        this.f4417c = dVar;
        this.f4418d = new h2.d(context, dVar.f(), null);
    }

    public void a() {
        List<p> listD = this.f4417c.g().o().B().d();
        ConstraintProxy.a(this.f4415a, listD);
        this.f4418d.d(listD);
        ArrayList arrayList = new ArrayList(listD.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (p pVar : listD) {
            String str = pVar.f23092a;
            if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || this.f4418d.c(str))) {
                arrayList.add(pVar);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = ((p) obj).f23092a;
            Intent intentB = a.b(this.f4415a, str2);
            k.c().a(f4414e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            d dVar = this.f4417c;
            dVar.k(new d.b(dVar, intentB, this.f4416b));
        }
        this.f4418d.e();
    }
}
