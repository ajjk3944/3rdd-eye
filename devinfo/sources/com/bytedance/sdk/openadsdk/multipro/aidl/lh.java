package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements Cursor {

    /* renamed from: lh, reason: collision with root package name */
    int f8589lh = 0;
    Map<String, List<String>> ouw;
    String[] vt;

    public lh(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.ouw = new HashMap();
            return;
        }
        this.ouw = map;
        try {
            this.vt = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i4) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        String[] strArr = this.vt;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        String[] strArr = this.vt;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.vt;
            if (i4 >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i4])) {
                return i4;
            }
            i4++;
        }
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i4) {
        if (i4 < 0) {
            return "";
        }
        String[] strArr = this.vt;
        return i4 < strArr.length ? strArr[i4] : "";
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.vt;
    }

    @Override // android.database.Cursor
    public final int getCount() {
        try {
            String[] strArr = this.vt;
            if (strArr != null && strArr.length != 0) {
                return this.ouw.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public final double getDouble(int i4) {
        try {
            return Double.parseDouble(getString(i4));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public final float getFloat(int i4) {
        try {
            return Float.parseFloat(getString(i4));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public final int getInt(int i4) {
        try {
            return Integer.parseInt(getString(i4));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public final long getLong(int i4) {
        try {
            return Long.parseLong(getString(i4));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f8589lh;
    }

    @Override // android.database.Cursor
    public final short getShort(int i4) {
        try {
            return Short.parseShort(getString(i4));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public final String getString(int i4) {
        return (i4 < 0 || i4 >= getColumnCount()) ? "" : this.ouw.get(this.vt[i4]).get(getPosition());
    }

    @Override // android.database.Cursor
    public final int getType(int i4) {
        return 0;
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f8589lh == 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.f8589lh == getCount() - 1;
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i4) {
        return getString(i4) == null;
    }

    @Override // android.database.Cursor
    public final boolean move(int i4) {
        if (this.f8589lh + i4 >= getCount()) {
            return false;
        }
        this.f8589lh += i4;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.f8589lh = 0;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.f8589lh = this.ouw.get(this.vt[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        if (this.f8589lh + 1 >= getCount()) {
            return false;
        }
        this.f8589lh++;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i4) {
        if (i4 >= getCount()) {
            return false;
        }
        this.f8589lh = i4;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        int i4 = this.f8589lh;
        if (i4 - 1 < 0) {
            return false;
        }
        this.f8589lh = i4 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.database.Cursor
    public final void deactivate() {
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }
}
