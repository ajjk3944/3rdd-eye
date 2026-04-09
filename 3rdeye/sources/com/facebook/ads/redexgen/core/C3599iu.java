package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3599iu implements M5 {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<M4> A02 = new SparseArray<>();
    public final InterfaceC22734m A03;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, 43, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, 46, 63, 40, 44, 57, 40, 77, 57, 44, 47, 33, 40, 77, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 41, 20, 3, 60, 0, 13, 21, 9, 30, 47, 13, 15, 4, 9, 37, 2, 8, 9, 20, 88, 85, 18, 31, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.M5
    public final void AAj(HashMap<String, M4> map, SparseArray<String> sparseArray) throws IOException {
        C3M.A08(this.A02.size() == 0);
        try {
            if (AbstractC22754o.A00(this.A03.getReadableDatabase(), 1, (String) C3M.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            Cursor cursorA00 = A00();
            while (cursorA00.moveToNext()) {
                try {
                    M4 m42 = new M4(cursorA00.getInt(0), (String) C3M.A01(cursorA00.getString(1)), M6.A02(new DataInputStream(new ByteArrayInputStream(cursorA00.getBlob(2)))));
                    map.put(m42.A02, m42);
                    sparseArray.put(m42.A01, m42.A02);
                } finally {
                }
            }
            if (cursorA00 != null) {
                cursorA00.close();
            }
        } catch (SQLiteException e4) {
            map.clear();
            sparseArray.clear();
            throw new C22724l(e4);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.M5
    public final void AJY(HashMap<String, M4> map) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.A02.size(); i++) {
                try {
                    M4 m4ValueAt = this.A02.valueAt(i);
                    if (m4ValueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i));
                    } else {
                        A06(writableDatabase, m4ValueAt);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
        } catch (SQLException e4) {
            throw new C22724l(e4);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(136, 3, 37), A01(139, 8, 1)};
    }

    public C3599iu(InterfaceC22734m interfaceC22734m) {
        this.A03 = interfaceC22734m;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) C3M.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C22724l, SQLException {
        AbstractC22754o.A04(sQLiteDatabase, 1, (String) C3M.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) C3M.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete((String) C3M.A01(this.A01), A01(130, 6, 122), new String[]{Integer.toString(i)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, M4 m42) throws IOException, SQLException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        M6.A08(m42.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(m42.A01));
        contentValues.put(A01(136, 3, 37), m42.A02);
        contentValues.put(A01(139, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) C3M.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(InterfaceC22734m interfaceC22734m, String str) throws C22724l {
        try {
            String strA02 = A02(str);
            SQLiteDatabase writableDatabase = interfaceC22734m.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                AbstractC22754o.A03(writableDatabase, 1, str);
                A07(writableDatabase, strA02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e4) {
            throw new C22724l(e4);
        }
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void A5h() throws C22724l {
        A08(this.A03, (String) C3M.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final boolean A6K() throws C22724l {
        try {
            return AbstractC22754o.A00(this.A03.getReadableDatabase(), 1, (String) C3M.A01(this.A00)) != -1;
        } catch (SQLException e4) {
            throw new C22724l(e4);
        }
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AA7(long j4) {
        this.A00 = Long.toHexString(j4);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AEv(M4 m42, boolean z10) {
        if (z10) {
            this.A02.delete(m42.A01);
        } else {
            this.A02.put(m42.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AFa(M4 m42) {
        this.A02.put(m42.A01, m42);
    }

    @Override // com.facebook.ads.redexgen.core.M5
    public final void AJX(HashMap<String, M4> map) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<M4> it = map.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e4) {
            throw new C22724l(e4);
        }
    }
}
