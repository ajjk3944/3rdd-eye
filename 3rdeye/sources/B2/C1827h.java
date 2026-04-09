package b2;

import N7.G8;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.t;
import b2.C1842w;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RawWorkInfoDao_Impl.java */
/* renamed from: b2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1827h implements InterfaceC1826g {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f17118a;

    public C1827h(WorkDatabase_Impl workDatabase_Impl) {
        this.f17118a = workDatabase_Impl;
    }

    @Override // b2.InterfaceC1826g
    public final ArrayList a(F1.a aVar) throws IOException {
        androidx.work.e eVarG;
        boolean z10;
        boolean z11;
        boolean z12;
        LinkedHashSet linkedHashSetB;
        int i;
        WorkDatabase_Impl workDatabase_Impl = this.f17118a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, aVar, true);
        try {
            int iA = C1.a.a(cursorY, FacebookMediationAdapter.KEY_ID);
            int iA2 = C1.a.a(cursorY, "state");
            int iA3 = C1.a.a(cursorY, "output");
            int iA4 = C1.a.a(cursorY, "initial_delay");
            int iA5 = C1.a.a(cursorY, "interval_duration");
            int iA6 = C1.a.a(cursorY, "flex_duration");
            int iA7 = C1.a.a(cursorY, "run_attempt_count");
            int iA8 = C1.a.a(cursorY, "backoff_policy");
            int iA9 = C1.a.a(cursorY, "backoff_delay_duration");
            int iA10 = C1.a.a(cursorY, "last_enqueue_time");
            int iA11 = C1.a.a(cursorY, "period_count");
            int iA12 = C1.a.a(cursorY, "generation");
            int iA13 = C1.a.a(cursorY, "next_schedule_time_override");
            int iA14 = C1.a.a(cursorY, "stop_reason");
            int iA15 = C1.a.a(cursorY, "required_network_type");
            int iA16 = C1.a.a(cursorY, "requires_charging");
            int iA17 = C1.a.a(cursorY, "requires_device_idle");
            int iA18 = C1.a.a(cursorY, "requires_battery_not_low");
            int iA19 = C1.a.a(cursorY, "requires_storage_not_low");
            int iA20 = C1.a.a(cursorY, "trigger_content_update_delay");
            int iA21 = C1.a.a(cursorY, "trigger_max_content_delay");
            int iA22 = C1.a.a(cursorY, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i10 = iA13;
            HashMap<String, ArrayList<androidx.work.e>> map2 = new HashMap<>();
            while (cursorY.moveToNext()) {
                int i11 = iA12;
                String string = cursorY.getString(iA);
                if (map.get(string) == null) {
                    i = iA11;
                    map.put(string, new ArrayList<>());
                } else {
                    i = iA11;
                }
                String string2 = cursorY.getString(iA);
                if (map2.get(string2) == null) {
                    map2.put(string2, new ArrayList<>());
                }
                iA12 = i11;
                iA11 = i;
            }
            int i12 = iA11;
            int i13 = iA12;
            cursorY.moveToPosition(-1);
            c(map);
            b(map2);
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                String string3 = (iA == -1 || cursorY.isNull(iA)) ? null : cursorY.getString(iA);
                t.b bVarF = iA2 == -1 ? null : C1819F.f(cursorY.getInt(iA2));
                if (iA3 == -1) {
                    eVarG = null;
                } else {
                    eVarG = androidx.work.e.g(cursorY.isNull(iA3) ? null : cursorY.getBlob(iA3));
                }
                long j4 = iA4 == -1 ? 0L : cursorY.getLong(iA4);
                long j10 = iA5 == -1 ? 0L : cursorY.getLong(iA5);
                long j11 = iA6 == -1 ? 0L : cursorY.getLong(iA6);
                boolean z13 = false;
                int i14 = iA7 == -1 ? 0 : cursorY.getInt(iA7);
                androidx.work.a aVarC = iA8 == -1 ? null : C1819F.c(cursorY.getInt(iA8));
                long j12 = iA9 == -1 ? 0L : cursorY.getLong(iA9);
                long j13 = iA10 == -1 ? 0L : cursorY.getLong(iA10);
                int i15 = i12;
                int i16 = i15 == -1 ? 0 : cursorY.getInt(i15);
                i12 = i15;
                int i17 = i13;
                int i18 = i17 == -1 ? 0 : cursorY.getInt(i17);
                i13 = i17;
                int i19 = i10;
                long j14 = i19 == -1 ? 0L : cursorY.getLong(i19);
                i10 = i19;
                int i20 = iA14;
                int i21 = i20 == -1 ? 0 : cursorY.getInt(i20);
                iA14 = i20;
                int i22 = iA15;
                androidx.work.n nVarD = i22 == -1 ? null : C1819F.d(cursorY.getInt(i22));
                iA15 = i22;
                int i23 = iA16;
                if (i23 == -1) {
                    z10 = false;
                } else {
                    z10 = cursorY.getInt(i23) != 0;
                }
                iA16 = i23;
                int i24 = iA17;
                if (i24 == -1) {
                    z11 = false;
                } else {
                    z11 = cursorY.getInt(i24) != 0;
                }
                iA17 = i24;
                int i25 = iA18;
                if (i25 == -1) {
                    z12 = false;
                } else {
                    z12 = cursorY.getInt(i25) != 0;
                }
                iA18 = i25;
                int i26 = iA19;
                if (i26 != -1 && cursorY.getInt(i26) != 0) {
                    z13 = true;
                }
                iA19 = i26;
                int i27 = iA20;
                boolean z14 = z13;
                long j15 = i27 == -1 ? 0L : cursorY.getLong(i27);
                iA20 = i27;
                int i28 = iA21;
                long j16 = i28 != -1 ? cursorY.getLong(i28) : 0L;
                iA21 = i28;
                int i29 = iA22;
                long j17 = j16;
                if (i29 == -1) {
                    linkedHashSetB = null;
                } else {
                    linkedHashSetB = C1819F.b(cursorY.isNull(i29) ? null : cursorY.getBlob(i29));
                }
                androidx.work.d dVar = new androidx.work.d(nVarD, z10, z11, z12, z14, j15, j17, linkedHashSetB);
                ArrayList<String> arrayList2 = map.get(cursorY.getString(iA));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                iA22 = i29;
                ArrayList<androidx.work.e> arrayList3 = map2.get(cursorY.getString(iA));
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                arrayList.add(new C1842w.c(string3, bVarF, eVarG, j4, j10, j11, dVar, i14, aVarC, j12, j13, i16, i18, j14, i21, arrayList2, arrayList3));
            }
            cursorY.close();
            return arrayList;
        } catch (Throwable th) {
            cursorY.close();
            throw th;
        }
    }

    public final void b(HashMap<String, ArrayList<androidx.work.e>> map) throws IOException {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap<String, ArrayList<androidx.work.e>> map2 = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map2.put(str, map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                b(map2);
                map2 = new HashMap<>(999);
            }
            if (i > 0) {
                b(map2);
                return;
            }
            return;
        }
        StringBuilder sbU = G8.u("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        A2.l.i(sbU, size);
        sbU.append(")");
        w1.o oVarD = w1.o.d(size, sbU.toString());
        int i10 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                oVarD.f(i10);
            } else {
                oVarD.h(i10, str2);
            }
            i10++;
        }
        Cursor cursorY = B7.d.y(this.f17118a, oVarD, false);
        try {
            int iA = C1.a.a(cursorY, "work_spec_id");
            if (iA == -1) {
                return;
            }
            while (cursorY.moveToNext()) {
                ArrayList<androidx.work.e> arrayList = map.get(cursorY.getString(iA));
                if (arrayList != null) {
                    arrayList.add(androidx.work.e.g(cursorY.isNull(0) ? null : cursorY.getBlob(0)));
                }
            }
        } finally {
            cursorY.close();
        }
    }

    public final void c(HashMap<String, ArrayList<String>> map) throws IOException {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap<String, ArrayList<String>> map2 = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map2.put(str, map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                c(map2);
                map2 = new HashMap<>(999);
            }
            if (i > 0) {
                c(map2);
                return;
            }
            return;
        }
        StringBuilder sbU = G8.u("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        A2.l.i(sbU, size);
        sbU.append(")");
        w1.o oVarD = w1.o.d(size, sbU.toString());
        int i10 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                oVarD.f(i10);
            } else {
                oVarD.h(i10, str2);
            }
            i10++;
        }
        Cursor cursorY = B7.d.y(this.f17118a, oVarD, false);
        try {
            int iA = C1.a.a(cursorY, "work_spec_id");
            if (iA == -1) {
                return;
            }
            while (cursorY.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorY.getString(iA));
                if (arrayList != null) {
                    arrayList.add(cursorY.isNull(0) ? null : cursorY.getString(0));
                }
            }
        } finally {
            cursorY.close();
        }
    }
}
