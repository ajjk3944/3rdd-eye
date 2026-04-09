package C0;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import o.a1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f1100a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1101b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1102c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f1103d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f1104e;

    /* JADX WARN: Type inference failed for: r2v4, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [int[], java.io.Serializable] */
    public s(a1 a1Var) {
        ArrayList arrayList = (ArrayList) a1Var.f22480c;
        int size = arrayList.size();
        this.f1101b = (String[]) ((ArrayList) a1Var.f22479b).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f1102c = dArr;
        ArrayList arrayList2 = (ArrayList) a1Var.f22481d;
        int size3 = arrayList2.size();
        ?? r22 = new double[size3];
        for (int i3 = 0; i3 < size3; i3++) {
            r22[i3] = ((Double) arrayList2.get(i3)).doubleValue();
        }
        this.f1103d = r22;
        this.f1104e = new int[size];
        this.f1100a = 0;
    }

    public static void a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z6 = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z6 ? i : length);
            boolean z7 = cCharAt < ' ' || cCharAt == ' ';
            if (z6) {
                if (!z7) {
                    break;
                } else {
                    length--;
                }
            } else if (z7) {
                i++;
            } else {
                z6 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e6) {
            Log.w("SupportSQLite", "delete failed: ", e6);
        }
    }

    public void c(H0.c cVar) throws IOException, SQLException {
        q qVar = (q) this.f1102c;
        Cursor cursorP = cVar.p("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z6 = false;
            if (cursorP.moveToFirst()) {
                if (cursorP.getInt(0) == 0) {
                    z6 = true;
                }
            }
            cursorP.close();
            qVar.a(cVar);
            if (!z6) {
                r rVarK = qVar.k(cVar);
                if (!rVarK.f1099b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + rVarK.f1098a);
                }
            }
            f(cVar);
            qVar.h(cVar);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(H0.c r7) throws java.io.IOException, android.database.SQLException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1102c
            C0.q r0 = (C0.q) r0
            java.io.Serializable r1 = r6.f1103d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r2 = r7.p(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1d
            r4 = 0
            if (r3 == 0) goto L20
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L1d:
            r7 = move-exception
            goto L9d
        L20:
            r3 = r4
        L21:
            r2.close()
            r2 = 0
            if (r3 == 0) goto L76
            A2.e r3 = new A2.e
            java.lang.String r5 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r3.<init>(r5)
            android.database.Cursor r3 = r7.o(r3)
            boolean r5 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L3f
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r7 = move-exception
            goto L70
        L3f:
            r4 = r2
        L40:
            r3.close()
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L81
            java.io.Serializable r3 = r6.f1104e
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L54
            goto L81
        L54:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = ", found: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L70:
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            a.AbstractC0241a.a(r3, r7)
            throw r0
        L76:
            C0.r r1 = r0.k(r7)
            boolean r3 = r1.f1099b
            if (r3 == 0) goto L87
            r6.f(r7)
        L81:
            r0.i(r7)
            r6.f1101b = r2
            return
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f1098a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L9d:
            throw r7     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            a.AbstractC0241a.a(r2, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.s.d(H0.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0085 A[EDGE_INSN: B:62:0x0085->B:37:0x0085 BREAK  A[LOOP:1: B:12:0x0022->B:65:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(H0.c r13, int r14, int r15) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.s.e(H0.c, int, int):void");
    }

    public void f(H0.c cVar) throws SQLException {
        cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f1103d) + "')");
    }

    public s(C0146b c0146b, q qVar, String str, String str2) {
        this.f1100a = qVar.f1097b;
        this.f1101b = c0146b;
        this.f1102c = qVar;
        this.f1103d = str;
        this.f1104e = str2;
    }

    public void b(H0.c cVar) {
    }
}
