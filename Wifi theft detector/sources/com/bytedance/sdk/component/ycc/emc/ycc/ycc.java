package com.bytedance.sdk.component.ycc.emc.ycc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ycc implements bw {
    private Context emc;

    public ycc(Context context) {
        this.emc = context;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.bw
    public List<dg> emc() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorEmc = com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(this.emc, "trackurl", null, null, null, null, null, null);
        if (cursorEmc != null) {
            while (cursorEmc.moveToNext()) {
                try {
                    try {
                        String string = cursorEmc.getString(cursorEmc.getColumnIndex("id"));
                        String string2 = cursorEmc.getString(cursorEmc.getColumnIndex("url"));
                        boolean z10 = cursorEmc.getInt(cursorEmc.getColumnIndex("replaceholder")) > 0;
                        int i10 = cursorEmc.getInt(cursorEmc.getColumnIndex("retry"));
                        int i11 = cursorEmc.getInt(cursorEmc.getColumnIndex("url_type"));
                        String string3 = cursorEmc.getString(cursorEmc.getColumnIndex("ad_id"));
                        String string4 = cursorEmc.getString(cursorEmc.getColumnIndex("error_code"));
                        String string5 = cursorEmc.getString(cursorEmc.getColumnIndex("error_msg"));
                        dg dgVar = new dg(string, string2, z10, i11, string3);
                        dgVar.emc(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            dgVar.emc(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            dgVar.ypw(string5);
                        }
                        linkedList.add(dgVar);
                    } finally {
                        cursorEmc.close();
                    }
                } catch (Throwable unused) {
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.bw
    public void xq(dg dgVar) {
        com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(this.emc, "trackurl", "id=?", new String[]{dgVar.emc()});
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.bw
    public void ypw(dg dgVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dgVar.emc());
        contentValues.put("url", dgVar.ypw());
        contentValues.put("replaceholder", Integer.valueOf(dgVar.xq() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(dgVar.dg()));
        contentValues.put("error_code", dgVar.uym());
        contentValues.put("error_msg", dgVar.zz());
        contentValues.put("url_type", Integer.valueOf(dgVar.bw()));
        contentValues.put("ad_id", dgVar.ycc());
        com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(this.emc, "trackurl", contentValues, "id=?", new String[]{dgVar.emc()});
    }

    public static String ypw() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.bw
    public dg emc(String str) {
        Cursor cursorEmc = com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(this.emc, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorEmc != null && cursorEmc.moveToFirst()) {
            try {
                String string = cursorEmc.getString(cursorEmc.getColumnIndex("id"));
                String string2 = cursorEmc.getString(cursorEmc.getColumnIndex("url"));
                boolean z10 = cursorEmc.getInt(cursorEmc.getColumnIndex("replaceholder")) > 0;
                int i10 = cursorEmc.getInt(cursorEmc.getColumnIndex("retry"));
                int i11 = cursorEmc.getInt(cursorEmc.getColumnIndex("url_type"));
                String string3 = cursorEmc.getString(cursorEmc.getColumnIndex("ad_id"));
                String string4 = cursorEmc.getString(cursorEmc.getColumnIndex("error_code"));
                String string5 = cursorEmc.getString(cursorEmc.getColumnIndex("error_msg"));
                dg dgVar = new dg(string, string2, z10, i11, string3);
                dgVar.emc(i10);
                if (!TextUtils.isEmpty(string4)) {
                    dgVar.emc(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    dgVar.ypw(string5);
                }
                return dgVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorEmc.close();
                    cursorEmc = null;
                } finally {
                    cursorEmc.close();
                }
            }
        }
        if (cursorEmc != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc.bw
    public void emc(dg dgVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dgVar.emc());
        contentValues.put("url", dgVar.ypw());
        contentValues.put("replaceholder", Integer.valueOf(dgVar.xq() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(dgVar.dg()));
        contentValues.put("url_type", Integer.valueOf(dgVar.bw()));
        contentValues.put("ad_id", dgVar.ycc());
        contentValues.put("error_code", dgVar.uym());
        contentValues.put("error_msg", dgVar.zz());
        com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(this.emc, "trackurl", contentValues);
    }
}
