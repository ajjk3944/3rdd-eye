package xd;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.k1;
import ec.b2;
import java.util.ArrayList;
import pb.y;
import ud.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.b f37085a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f37086b = null;

    public c(cf.b bVar) {
        this.f37085a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f37079a;
        String str2 = bVar.f37080b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            b bVar2 = (b) obj;
            if (bVar2.f37079a.equals(str) && bVar2.f37080b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        ae.c cVar = (ae.c) ((ae.b) this.f37085a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((k1) cVar.f354a.f30421b).f("frc", "")) {
            f fVar = be.a.f2140a;
            y.h(bundle);
            ae.a aVar = new ae.a();
            String str = (String) b2.e(bundle, "origin", String.class, null);
            y.h(str);
            aVar.f340a = str;
            String str2 = (String) b2.e(bundle, "name", String.class, null);
            y.h(str2);
            aVar.f341b = str2;
            aVar.f342c = b2.e(bundle, "value", Object.class, null);
            aVar.f343d = (String) b2.e(bundle, "trigger_event_name", String.class, null);
            aVar.f344e = ((Long) b2.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f345f = (String) b2.e(bundle, "timed_out_event_name", String.class, null);
            aVar.g = (Bundle) b2.e(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f346h = (String) b2.e(bundle, "triggered_event_name", String.class, null);
            aVar.f347i = (Bundle) b2.e(bundle, "triggered_event_params", Bundle.class, null);
            aVar.j = ((Long) b2.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.f348k = (String) b2.e(bundle, "expired_event_name", String.class, null);
            aVar.f349l = (Bundle) b2.e(bundle, "expired_event_params", Bundle.class, null);
            aVar.f351n = ((Boolean) b2.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f350m = ((Long) b2.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f352o = ((Long) b2.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027b A[EDGE_INSN: B:209:0x027b->B:94:0x027b BREAK  A[LOOP:9: B:113:0x02c0->B:210:?]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.ArrayList r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.c.c(java.util.ArrayList):void");
    }
}
