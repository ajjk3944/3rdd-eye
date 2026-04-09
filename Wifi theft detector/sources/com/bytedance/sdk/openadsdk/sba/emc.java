package com.bytedance.sdk.openadsdk.sba;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class emc {
    private static Context bw;
    private Boolean dg;
    private com.bytedance.sdk.openadsdk.sba.xq.emc xq;
    private ypw ypw;
    private static final long ycc = System.currentTimeMillis();
    public static final long emc = com.bytedance.sdk.openadsdk.sba.dg.emc.emc();
    private int uym = 0;
    private final ArrayList<dg> msw = new ArrayList<>();
    private final Runnable zz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.sba.emc.2
        @Override // java.lang.Runnable
        public void run() {
            emc emcVar = emc.this;
            emcVar.dg = Boolean.valueOf(emcVar.ypw.isMonitorOpen());
            if (!emc.this.dg.booleanValue() || emc.this.msw.isEmpty()) {
                return;
            }
            emc emcVar2 = emc.this;
            emcVar2.emc(emcVar2.msw);
            emc.this.msw.clear();
        }
    };
    private Runnable ru = new Runnable() { // from class: com.bytedance.sdk.openadsdk.sba.emc.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            String str4 = "extra";
            String str5 = "is_init";
            try {
                SQLiteDatabase sQLiteDatabaseYpw = com.bytedance.sdk.openadsdk.sba.emc.emc.ypw();
                if (sQLiteDatabaseYpw != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", CampaignEx.JSON_KEY_TIMESTAMP, "mediation", "is_init", "extra"};
                    String[] strArr2 = {String.valueOf(emc.this.ypw.getOnceLogInterval() < 86400000 ? emc.ycc : emc.emc)};
                    int iMax = Math.max(10, emc.this.ypw.getOnceLogCount());
                    int i10 = iMax > 100 ? 10 : iMax;
                    int i11 = i10;
                    Cursor cursorQuery = sQLiteDatabaseYpw.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(i10));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                                if (cursorQuery.getColumnIndex("_id") >= 0) {
                                    str = str4;
                                    str2 = str5;
                                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                    emcVar.emc(j10);
                                    arrayList2.add(String.valueOf(j10));
                                } else {
                                    str = str4;
                                    str2 = str5;
                                }
                                if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                    emcVar.emc(cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version")));
                                }
                                if (cursorQuery.getColumnIndex("scene") >= 0) {
                                    emcVar.ypw(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                }
                                if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                    emcVar.emc(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                }
                                if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                    emcVar.ypw(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                }
                                if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                    emcVar.xq(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                                }
                                if (cursorQuery.getColumnIndex("rit") >= 0) {
                                    emcVar.xq(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                }
                                if (cursorQuery.getColumnIndex("tag") >= 0) {
                                    emcVar.dg(cursorQuery.getString(cursorQuery.getColumnIndex("tag")));
                                }
                                if (cursorQuery.getColumnIndex("label") >= 0) {
                                    emcVar.bw(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                }
                                if (cursorQuery.getColumnIndex(CampaignEx.JSON_KEY_TIMESTAMP) >= 0) {
                                    emcVar.ypw(cursorQuery.getLong(cursorQuery.getColumnIndex(CampaignEx.JSON_KEY_TIMESTAMP)));
                                }
                                if (cursorQuery.getColumnIndex("mediation") >= 0) {
                                    emcVar.ycc(cursorQuery.getString(cursorQuery.getColumnIndex("mediation")));
                                }
                                String str6 = str2;
                                if (cursorQuery.getColumnIndex(str6) >= 0) {
                                    emcVar.dg(cursorQuery.getInt(cursorQuery.getColumnIndex(str6)));
                                }
                                String str7 = str;
                                if (cursorQuery.getColumnIndex(str7) >= 0) {
                                    str3 = str6;
                                    emcVar.uym(cursorQuery.getString(cursorQuery.getColumnIndex(str7)));
                                } else {
                                    str3 = str6;
                                }
                                arrayList3.add(emcVar);
                                arrayList = arrayList3;
                                str4 = str7;
                                str5 = str3;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                try {
                                    emc.this.ypw.onMonitorUpload(arrayList4);
                                    SQLiteDatabase sQLiteDatabaseEmc = com.bytedance.sdk.openadsdk.sba.emc.emc.emc();
                                    if (sQLiteDatabaseEmc != null && sQLiteDatabaseEmc.isOpen()) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("_id IN (");
                                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                            sb.append("?");
                                            if (i12 < arrayList2.size() - 1) {
                                                sb.append(",");
                                            }
                                        }
                                        sb.append(")");
                                        sQLiteDatabaseEmc.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                        if (emc.this.xq != null) {
                                            emc.this.xq.emc(emc.ycc);
                                        }
                                    }
                                    if (arrayList4.size() < i11 || emc.this.uym > 1000) {
                                        return;
                                    }
                                    emc.this.emc(false);
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

    private emc(ypw ypwVar) {
        try {
            this.ypw = new BusMonitorDependWrapper(ypwVar);
            this.xq = new com.bytedance.sdk.openadsdk.sba.xq.emc(ypwVar.getContext());
            bw = ypwVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ int bw(emc emcVar) {
        int i10 = emcVar.uym;
        emcVar.uym = i10 + 1;
        return i10;
    }

    private boolean xq() {
        if (this.dg == null) {
            ypw ypwVar = this.ypw;
            return (ypwVar == null || ypwVar.getContext() == null || this.ypw.getHandler() == null) ? false : true;
        }
        ypw ypwVar2 = this.ypw;
        return (ypwVar2 == null || ypwVar2.getContext() == null || !this.ypw.isMonitorOpen() || this.ypw.getHandler() == null) ? false : true;
    }

    public static emc emc(ypw ypwVar) {
        return new emc(ypwVar);
    }

    public static Context emc() {
        Context context = bw;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void emc(final dg dgVar) {
        if (dgVar == null || !xq()) {
            return;
        }
        this.ypw.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sba.emc.1
            @Override // java.lang.Runnable
            public void run() {
                emc emcVar = emc.this;
                emcVar.dg = Boolean.valueOf(emcVar.ypw.isMonitorOpen());
                if (emc.this.dg.booleanValue()) {
                    emc.this.msw.add(dgVar);
                    if (emc.this.msw.size() >= 10) {
                        emc.this.ypw.getHandler().removeCallbacks(emc.this.zz);
                        emc emcVar2 = emc.this;
                        emcVar2.emc(emcVar2.msw);
                        emc.this.msw.clear();
                    }
                }
            }
        });
        this.ypw.getHandler().removeCallbacks(this.zz);
        this.ypw.getHandler().postDelayed(this.zz, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(List<dg> list) {
        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarEmc;
        SQLiteDatabase sQLiteDatabase = null;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    SQLiteDatabase sQLiteDatabaseEmc = com.bytedance.sdk.openadsdk.sba.emc.emc.emc();
                    if (sQLiteDatabaseEmc != null) {
                        try {
                            sQLiteDatabaseEmc.beginTransaction();
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                dg dgVar = list.get(i10);
                                if (dgVar != null && (emcVarEmc = dgVar.emc()) != null) {
                                    Cursor cursorQuery = sQLiteDatabaseEmc.query("monitor_table", new String[]{"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", CampaignEx.JSON_KEY_TIMESTAMP, "mediation", "is_init", "extra"}, new StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?").toString(), new String[]{emcVarEmc.ypw(), emcVarEmc.xq(), emcVarEmc.uym(), emcVarEmc.msw(), emcVarEmc.zz(), emcVarEmc.gbl(), String.valueOf(emcVarEmc.sup()), String.valueOf(emcVarEmc.ru()), emcVarEmc.sz()}, null, null, null);
                                    if (cursorQuery != null) {
                                        if (cursorQuery.moveToNext()) {
                                            int columnIndex = cursorQuery.getColumnIndex("_id");
                                            if (columnIndex >= 0) {
                                                emcVarEmc.emc(cursorQuery.getLong(columnIndex));
                                            }
                                            int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                            if (columnIndex2 >= 0) {
                                                emcVarEmc.emc(cursorQuery.getInt(columnIndex2) + emcVarEmc.dg());
                                            }
                                            int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                            if (columnIndex3 >= 0) {
                                                emcVarEmc.ypw(cursorQuery.getInt(columnIndex3) + emcVarEmc.bw());
                                            }
                                            int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                            if (columnIndex4 >= 0) {
                                                emcVarEmc.xq(cursorQuery.getInt(columnIndex4) + emcVarEmc.ycc());
                                            }
                                        }
                                        cursorQuery.close();
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    if (emcVarEmc.emc() > 0) {
                                        contentValues.put("_id", Long.valueOf(emcVarEmc.emc()));
                                    }
                                    contentValues.put("sdk_version", emcVarEmc.ypw());
                                    contentValues.put("scene", emcVarEmc.xq());
                                    contentValues.put("start_count", Integer.valueOf(emcVarEmc.dg()));
                                    contentValues.put("success_count", Integer.valueOf(emcVarEmc.bw()));
                                    contentValues.put("fail_count", Integer.valueOf(emcVarEmc.ycc()));
                                    contentValues.put("rit", emcVarEmc.uym());
                                    contentValues.put("tag", emcVarEmc.msw());
                                    contentValues.put("label", emcVarEmc.zz());
                                    contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(emcVarEmc.ru()));
                                    contentValues.put("mediation", emcVarEmc.gbl());
                                    contentValues.put("is_init", Integer.valueOf(emcVarEmc.sup()));
                                    contentValues.put("extra", emcVarEmc.sz());
                                    sQLiteDatabaseEmc.insertWithOnConflict("monitor_table", null, contentValues, 5);
                                }
                            }
                            sQLiteDatabaseEmc.setTransactionSuccessful();
                        } catch (Throwable unused) {
                            sQLiteDatabase = sQLiteDatabaseEmc;
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    sQLiteDatabase = sQLiteDatabaseEmc;
                }
            } catch (Throwable unused3) {
            }
        }
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused4) {
            }
        }
    }

    public void emc(final boolean z10) {
        ypw ypwVar = this.ypw;
        if (ypwVar == null || ypwVar.getHandler() == null || this.ypw.getContext() == null || this.xq == null || !this.ypw.isMonitorOpen()) {
            return;
        }
        this.ypw.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sba.emc.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    emc.bw(emc.this);
                    if (z10) {
                        long jEmc = emc.this.xq.emc();
                        if (jEmc == 0) {
                            emc.this.xq.emc(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.sba.dg.emc.emc(jEmc) && System.currentTimeMillis() - jEmc < emc.this.ypw.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (emc.this.ypw.getHandler() != null) {
                        emc.this.ypw.getHandler().post(emc.this.ru);
                    }
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.ypw.getOnceLogInterval(), 10000));
    }
}
