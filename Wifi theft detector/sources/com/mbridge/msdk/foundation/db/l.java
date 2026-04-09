package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class l extends a<com.mbridge.msdk.foundation.entity.h> {

    /* renamed from: a, reason: collision with root package name */
    private static l f14803a;

    private l(f fVar) {
        super(fVar);
    }

    public static l a(f fVar) {
        if (f14803a == null) {
            synchronized (l.class) {
                try {
                    if (f14803a == null) {
                        f14803a = new l(fVar);
                    }
                } finally {
                }
            }
        }
        return f14803a;
    }

    public synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    public synchronized void a(String str, String str2, int i10) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
        contentValues.put("unitId", str2);
        contentValues.put("ad_type", Integer.valueOf(i10));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    public synchronized List<com.mbridge.msdk.foundation.entity.i> a(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursorRawQuery;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = ?", new String[]{String.valueOf(i10)});
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (cursorRawQuery.getCount() > 0) {
                                arrayList = new ArrayList(cursorRawQuery.getCount());
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(new com.mbridge.msdk.foundation.entity.i(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("unitId")), i10));
                                    } catch (Exception e10) {
                                        e = e10;
                                        cursor = cursorRawQuery;
                                        e.printStackTrace();
                                        if (cursor == null) {
                                            arrayList2 = arrayList;
                                            return arrayList2;
                                        }
                                        cursorRawQuery = cursor;
                                        arrayList2 = arrayList;
                                        try {
                                            cursorRawQuery.close();
                                        } catch (Exception unused) {
                                        }
                                        return arrayList2;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
            arrayList = null;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return arrayList2;
    }
}
