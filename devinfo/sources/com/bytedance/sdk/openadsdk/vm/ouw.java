package com.bytedance.sdk.openadsdk.vm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static Context fkw;

    /* renamed from: le, reason: collision with root package name */
    private static final long f8747le = System.currentTimeMillis();
    public static final long ouw = com.bytedance.sdk.openadsdk.vm.yu.ouw.ouw();

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.vm.lh.ouw f8748lh;
    private vt vt;
    private Boolean yu;
    private int ra = 0;
    private final ArrayList<yu> pno = new ArrayList<>();
    private final Runnable bly = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.2
        @Override // java.lang.Runnable
        public final void run() {
            ouw ouwVar = ouw.this;
            ouwVar.yu = Boolean.valueOf(ouwVar.vt.isMonitorOpen());
            if (!ouw.this.yu.booleanValue() || ouw.this.pno.isEmpty()) {
                return;
            }
            ouw.ouw(ouw.this.pno);
            ouw.this.pno.clear();
        }
    };
    private Runnable tlj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.4
        @Override // java.lang.Runnable
        public final void run() {
            String str;
            String str2;
            String str3;
            String str4 = "extra";
            String str5 = "is_init";
            try {
                SQLiteDatabase sQLiteDatabaseVt = com.bytedance.sdk.openadsdk.vm.ouw.ouw.vt();
                if (sQLiteDatabaseVt != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
                    String[] strArr2 = {String.valueOf(ouw.this.vt.getOnceLogInterval() < 86400000 ? ouw.f8747le : ouw.ouw)};
                    int iMax = Math.max(10, ouw.this.vt.getOnceLogCount());
                    int i4 = iMax > 100 ? 10 : iMax;
                    int i10 = i4;
                    Cursor cursorQuery = sQLiteDatabaseVt.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(i4));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                if (cursorQuery.getColumnIndex("_id") >= 0) {
                                    str = str4;
                                    str2 = str5;
                                    long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                    ouwVar.ouw = j;
                                    arrayList2.add(String.valueOf(j));
                                } else {
                                    str = str4;
                                    str2 = str5;
                                }
                                if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                    ouwVar.vt = cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version"));
                                }
                                if (cursorQuery.getColumnIndex("scene") >= 0) {
                                    ouwVar.f8751lh = cursorQuery.getString(cursorQuery.getColumnIndex("scene"));
                                }
                                if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                    ouwVar.yu = cursorQuery.getInt(cursorQuery.getColumnIndex("start_count"));
                                }
                                if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                    ouwVar.fkw = cursorQuery.getInt(cursorQuery.getColumnIndex("success_count"));
                                }
                                if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                    ouwVar.f8750le = cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count"));
                                }
                                if (cursorQuery.getColumnIndex("rit") >= 0) {
                                    ouwVar.ra = cursorQuery.getString(cursorQuery.getColumnIndex("rit"));
                                }
                                if (cursorQuery.getColumnIndex("tag") >= 0) {
                                    ouwVar.pno = cursorQuery.getString(cursorQuery.getColumnIndex("tag"));
                                }
                                if (cursorQuery.getColumnIndex("label") >= 0) {
                                    ouwVar.bly = cursorQuery.getString(cursorQuery.getColumnIndex("label"));
                                }
                                if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                    ouwVar.tlj = cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp"));
                                }
                                if (cursorQuery.getColumnIndex("mediation") >= 0) {
                                    ouwVar.f8749cf = cursorQuery.getString(cursorQuery.getColumnIndex("mediation"));
                                }
                                String str6 = str2;
                                if (cursorQuery.getColumnIndex(str6) >= 0) {
                                    ouwVar.ryl = cursorQuery.getInt(cursorQuery.getColumnIndex(str6));
                                }
                                String str7 = str;
                                if (cursorQuery.getColumnIndex(str7) >= 0) {
                                    str3 = str6;
                                    ouwVar.mwh = cursorQuery.getString(cursorQuery.getColumnIndex(str7));
                                } else {
                                    str3 = str6;
                                }
                                arrayList3.add(ouwVar);
                                arrayList = arrayList3;
                                str4 = str7;
                                str5 = str3;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                try {
                                    ouw.this.vt.onMonitorUpload(arrayList4);
                                    SQLiteDatabase sQLiteDatabaseOuw = com.bytedance.sdk.openadsdk.vm.ouw.ouw.ouw();
                                    if (sQLiteDatabaseOuw != null && sQLiteDatabaseOuw.isOpen()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("_id IN (");
                                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                            sb2.append("?");
                                            if (i11 < arrayList2.size() - 1) {
                                                sb2.append(",");
                                            }
                                        }
                                        sb2.append(")");
                                        sQLiteDatabaseOuw.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                        if (ouw.this.f8748lh != null) {
                                            ouw.this.f8748lh.ouw(ouw.f8747le);
                                        }
                                    }
                                    if (arrayList4.size() < i10 || ouw.this.ra > 1000) {
                                        return;
                                    }
                                    ouw.this.ouw(false);
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    };

    private ouw(vt vtVar) {
        try {
            this.vt = new BusMonitorDependWrapper(vtVar);
            this.f8748lh = new com.bytedance.sdk.openadsdk.vm.lh.ouw(vtVar.getContext());
            fkw = vtVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ int fkw(ouw ouwVar) {
        int i4 = ouwVar.ra;
        ouwVar.ra = i4 + 1;
        return i4;
    }

    public static ouw ouw(vt vtVar) {
        return new ouw(vtVar);
    }

    public static Context ouw() {
        Context context = fkw;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public final void ouw(final boolean z3) {
        vt vtVar = this.vt;
        if (vtVar == null || vtVar.getHandler() == null || this.vt.getContext() == null || this.f8748lh == null || !this.vt.isMonitorOpen()) {
            return;
        }
        this.vt.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ouw.fkw(ouw.this);
                    if (z3) {
                        long j = ouw.this.f8748lh.ouw.getLong("last_upload_time", 0L);
                        if (j == 0) {
                            ouw.this.f8748lh.ouw(System.currentTimeMillis());
                            return;
                        } else if (j - (j % 86400000) == com.bytedance.sdk.openadsdk.vm.yu.ouw.ouw() && System.currentTimeMillis() - j < ouw.this.vt.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (ouw.this.vt.getHandler() != null) {
                        ouw.this.vt.getHandler().post(ouw.this.tlj);
                    }
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.vt.getOnceLogInterval(), 10000));
    }

    public final void ouw(final yu yuVar) {
        if (this.yu == null) {
            vt vtVar = this.vt;
            if (vtVar == null || vtVar.getContext() == null || this.vt.getHandler() == null) {
                return;
            }
        } else {
            vt vtVar2 = this.vt;
            if (vtVar2 == null || vtVar2.getContext() == null || !this.vt.isMonitorOpen() || this.vt.getHandler() == null) {
                return;
            }
        }
        this.vt.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                ouw ouwVar = ouw.this;
                ouwVar.yu = Boolean.valueOf(ouwVar.vt.isMonitorOpen());
                if (ouw.this.yu.booleanValue()) {
                    ouw.this.pno.add(yuVar);
                    if (ouw.this.pno.size() >= 10) {
                        ouw.this.vt.getHandler().removeCallbacks(ouw.this.bly);
                        ouw.ouw(ouw.this.pno);
                        ouw.this.pno.clear();
                    }
                }
            }
        });
        this.vt.getHandler().removeCallbacks(this.bly);
        this.vt.getHandler().postDelayed(this.bly, 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015b A[Catch: all -> 0x015e, TRY_LEAVE, TryCatch #1 {all -> 0x015e, blocks: (B:45:0x015b, B:43:0x0155), top: B:52:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void ouw(java.util.List r25) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.vm.ouw.ouw(java.util.List):void");
    }
}
