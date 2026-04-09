package com.bytedance.sdk.component.le.ouw.le;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le implements fkw {
    private Context ouw;

    public le(Context context) {
        this.ouw = context;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final void lh(yu yuVar) {
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", "id=?", new String[]{yuVar.ouw});
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final List<yu> ouw() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", null, null, null, null);
        if (cursorOuw != null) {
            while (cursorOuw.moveToNext()) {
                try {
                    try {
                        String string = cursorOuw.getString(cursorOuw.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                        boolean z3 = cursorOuw.getInt(cursorOuw.getColumnIndex("replaceholder")) > 0;
                        int i4 = cursorOuw.getInt(cursorOuw.getColumnIndex("retry"));
                        int i10 = cursorOuw.getInt(cursorOuw.getColumnIndex("url_type"));
                        String string3 = cursorOuw.getString(cursorOuw.getColumnIndex("ad_id"));
                        String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("error_code"));
                        String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("error_msg"));
                        yu yuVar = new yu(string, string2, z3, i10, string3);
                        yuVar.yu = i4;
                        if (!TextUtils.isEmpty(string4)) {
                            yuVar.ra = string4;
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            yuVar.pno = string5;
                        }
                        linkedList.add(yuVar);
                    } catch (Throwable unused) {
                    }
                } finally {
                    cursorOuw.close();
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final void vt(yu yuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, yuVar.ouw);
        contentValues.put("url", yuVar.vt);
        contentValues.put("replaceholder", Integer.valueOf(yuVar.f7530lh ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(yuVar.yu));
        contentValues.put("error_code", yuVar.ra);
        contentValues.put("error_msg", yuVar.pno);
        contentValues.put("url_type", Integer.valueOf(yuVar.fkw));
        contentValues.put("ad_id", yuVar.f7529le);
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", contentValues, "id=?", new String[]{yuVar.ouw});
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final yu ouw(String str) {
        Cursor cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(this.ouw, "trackurl", null, "id=?", new String[]{str}, null);
        if (cursorOuw != null && cursorOuw.moveToFirst()) {
            try {
                String string = cursorOuw.getString(cursorOuw.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                boolean z3 = cursorOuw.getInt(cursorOuw.getColumnIndex("replaceholder")) > 0;
                int i4 = cursorOuw.getInt(cursorOuw.getColumnIndex("retry"));
                int i10 = cursorOuw.getInt(cursorOuw.getColumnIndex("url_type"));
                String string3 = cursorOuw.getString(cursorOuw.getColumnIndex("ad_id"));
                String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("error_code"));
                String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("error_msg"));
                yu yuVar = new yu(string, string2, z3, i10, string3);
                yuVar.yu = i4;
                if (!TextUtils.isEmpty(string4)) {
                    yuVar.ra = string4;
                }
                if (!TextUtils.isEmpty(string5)) {
                    yuVar.pno = string5;
                }
                return yuVar;
            } catch (Throwable th2) {
                try {
                    th2.getMessage();
                    com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                    cursorOuw.close();
                    cursorOuw = null;
                } finally {
                    cursorOuw.close();
                }
            }
        }
        if (cursorOuw != null) {
        }
        return null;
    }

    public static String vt() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.fkw
    public final void ouw(yu yuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, yuVar.ouw);
        contentValues.put("url", yuVar.vt);
        contentValues.put("replaceholder", Integer.valueOf(yuVar.f7530lh ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(yuVar.yu));
        contentValues.put("url_type", Integer.valueOf(yuVar.fkw));
        contentValues.put("ad_id", yuVar.f7529le);
        contentValues.put("error_code", yuVar.ra);
        contentValues.put("error_msg", yuVar.pno);
        Context context = this.ouw;
        if (TextUtils.isEmpty("trackurl")) {
            return;
        }
        try {
            com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw(context).ouw().ouw("trackurl", (String) null, contentValues);
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        }
    }
}
