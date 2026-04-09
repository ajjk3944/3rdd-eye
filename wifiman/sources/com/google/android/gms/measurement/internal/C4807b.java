package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C4452s2;
import com.google.android.gms.internal.measurement.C4468u2;
import java.util.ArrayList;
import java.util.List;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4807b {

    /* renamed from: a, reason: collision with root package name */
    private C4452s2 f36339a;

    /* renamed from: b, reason: collision with root package name */
    private Long f36340b;

    /* renamed from: c, reason: collision with root package name */
    private long f36341c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C7 f36342d;

    final C4452s2 a(String str, C4452s2 c4452s2) {
        Object obj;
        String strT = c4452s2.T();
        List listU = c4452s2.U();
        this.f36342d.k();
        Long l10 = (Long) s7.b0(c4452s2, "_eid");
        boolean z10 = l10 != null;
        if (z10 && strT.equals("_ep")) {
            AbstractC7901p.l(l10);
            this.f36342d.k();
            strT = (String) s7.b0(c4452s2, "_en");
            if (TextUtils.isEmpty(strT)) {
                this.f36342d.zzj().E().b("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.f36339a == null || this.f36340b == null || l10.longValue() != this.f36340b.longValue()) {
                Pair pairF = this.f36342d.m().F(str, l10);
                if (pairF == null || (obj = pairF.first) == null) {
                    this.f36342d.zzj().E().c("Extra parameter without existing main event. eventName, eventId", strT, l10);
                    return null;
                }
                this.f36339a = (C4452s2) obj;
                this.f36341c = ((Long) pairF.second).longValue();
                this.f36342d.k();
                this.f36340b = (Long) s7.b0(this.f36339a, "_eid");
            }
            long j10 = this.f36341c - 1;
            this.f36341c = j10;
            if (j10 <= 0) {
                C4933q c4933qM = this.f36342d.m();
                c4933qM.j();
                c4933qM.zzj().G().b("Clearing complex main event info. appId", str);
                try {
                    c4933qM.x().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e10) {
                    c4933qM.zzj().C().b("Error clearing complex main event", e10);
                }
            } else {
                this.f36342d.m().o0(str, l10, this.f36341c, this.f36339a);
            }
            ArrayList arrayList = new ArrayList();
            for (C4468u2 c4468u2 : this.f36339a.U()) {
                this.f36342d.k();
                if (s7.B(c4452s2, c4468u2.V()) == null) {
                    arrayList.add(c4468u2);
                }
            }
            if (arrayList.isEmpty()) {
                this.f36342d.zzj().E().b("No unique parameters in main event. eventName", strT);
            } else {
                arrayList.addAll(listU);
                listU = arrayList;
            }
        } else if (z10) {
            this.f36340b = l10;
            this.f36339a = c4452s2;
            this.f36342d.k();
            long jLongValue = ((Long) s7.F(c4452s2, "_epc", 0L)).longValue();
            this.f36341c = jLongValue;
            if (jLongValue <= 0) {
                this.f36342d.zzj().E().b("Complex event with zero extra param count. eventName", strT);
            } else {
                this.f36342d.m().o0(str, (Long) AbstractC7901p.l(l10), this.f36341c, c4452s2);
            }
        }
        return (C4452s2) ((com.google.android.gms.internal.measurement.D4) ((C4452s2.a) c4452s2.v()).F(strT).L().E(listU).p());
    }

    private C4807b(C7 c72) {
        this.f36342d = c72;
    }
}
