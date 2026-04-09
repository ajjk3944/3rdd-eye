package te;

import android.os.Bundle;
import cc.s;
import com.google.android.gms.internal.measurement.i1;
import java.util.ArrayList;
import java.util.Iterator;
import oe.k0;
import zc.p1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final eg.b f22712a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f22713b = null;

    public c(eg.b bVar) {
        this.f22712a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f22706a;
        String str2 = bVar.f22707b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f22706a.equals(str) && bVar2.f22707b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        we.c cVar = (we.c) ((we.b) this.f22712a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((i1) cVar.f24485a.f25996d).f("frc", "")) {
            k0 k0Var = xe.a.f25299a;
            s.h(bundle);
            we.a aVar = new we.a();
            String str = (String) p1.e(bundle, "origin", String.class, null);
            s.h(str);
            aVar.f24471a = str;
            String str2 = (String) p1.e(bundle, "name", String.class, null);
            s.h(str2);
            aVar.f24472b = str2;
            aVar.f24473c = p1.e(bundle, "value", Object.class, null);
            aVar.f24474d = (String) p1.e(bundle, "trigger_event_name", String.class, null);
            aVar.f24475e = ((Long) p1.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f24476f = (String) p1.e(bundle, "timed_out_event_name", String.class, null);
            aVar.f24477g = (Bundle) p1.e(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f24478h = (String) p1.e(bundle, "triggered_event_name", String.class, null);
            aVar.f24479i = (Bundle) p1.e(bundle, "triggered_event_params", Bundle.class, null);
            aVar.j = ((Long) p1.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.k = (String) p1.e(bundle, "expired_event_name", String.class, null);
            aVar.f24480l = (Bundle) p1.e(bundle, "expired_event_params", Bundle.class, null);
            aVar.f24482n = ((Boolean) p1.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f24481m = ((Long) p1.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f24483o = ((Long) p1.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.ArrayList r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: te.c.c(java.util.ArrayList):void");
    }
}
