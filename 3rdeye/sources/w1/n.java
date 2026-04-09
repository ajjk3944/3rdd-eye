package w1;

import A9.I;
import F1.c;
import N7.G8;
import android.database.Cursor;
import android.database.SQLException;
import androidx.work.impl.WorkDatabase_Impl;
import d9.C4284b;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import w1.k;
import z1.C5852a;

/* compiled from: RoomOpenHelper.android.kt */
/* loaded from: classes.dex */
public final class n extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public C5716b f47265b;

    /* renamed from: c, reason: collision with root package name */
    public final List<k.b> f47266c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase_Impl.a f47267d;

    /* compiled from: RoomOpenHelper.android.kt */
    public static abstract class a {
    }

    /* compiled from: RoomOpenHelper.android.kt */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f47268a;

        /* renamed from: b, reason: collision with root package name */
        public final String f47269b;

        public b(boolean z10, String str) {
            this.f47268a = z10;
            this.f47269b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C5716b configuration, WorkDatabase_Impl.a aVar) {
        super(20);
        kotlin.jvm.internal.l.f(configuration, "configuration");
        this.f47266c = configuration.f47202e;
        this.f47265b = configuration;
        this.f47267d = aVar;
    }

    @Override // F1.c.a
    public final void c(G1.d dVar) throws IOException, SQLException {
        Cursor cursorE = dVar.E(new F1.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            Cursor cursor = cursorE;
            boolean z10 = false;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) == 0) {
                    z10 = true;
                }
            }
            cursorE.close();
            WorkDatabase_Impl.a aVar = this.f47267d;
            aVar.a(dVar);
            if (!z10) {
                b bVarB = aVar.b(dVar);
                if (!bVarB.f47268a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarB.f47269b);
                }
            }
            dVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            dVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
            WorkDatabase_Impl.this.getClass();
            List<k.b> list = this.f47266c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((k.b) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                I.o(cursorE, th);
                throw th2;
            }
        }
    }

    @Override // F1.c.a
    public final void d(G1.d dVar, int i, int i10) throws Exception {
        f(dVar, i, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // F1.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(G1.d r6) throws java.lang.Exception {
        /*
            r5 = this;
            F1.a r0 = new F1.a
            java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r0.<init>(r1)
            android.database.Cursor r0 = r6.E(r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            if (r2 == 0) goto L22
            int r1 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L22
            r1 = 1
            goto L23
        L1f:
            r6 = move-exception
            goto Ld2
        L22:
            r1 = r3
        L23:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L6d
            F1.a r1 = new F1.a
            java.lang.String r2 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r2)
            android.database.Cursor r1 = r6.E(r1)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch: java.lang.Throwable -> L44
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L46
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r6 = move-exception
            goto L67
        L46:
            r2 = r0
        L47:
            r1.close()
            java.lang.String r1 = "7d73d21f1bd82c9e5268b6dcf9fde2cb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L81
            java.lang.String r1 = "3071c8717539de5d5353f4c8cd59a032"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5b
            goto L81
        L5b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: "
            java.lang.String r0 = androidx.work.s.d(r0, r2)
            r6.<init>(r0)
            throw r6
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            A9.I.o(r1, r6)
            throw r0
        L6d:
            androidx.work.impl.WorkDatabase_Impl$a r1 = r5.f47267d
            w1.n$b r1 = r1.b(r6)
            boolean r2 = r1.f47268a
            if (r2 == 0) goto Lbc
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r6.C(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')"
            r6.C(r1)
        L81:
            androidx.work.impl.WorkDatabase_Impl$a r1 = r5.f47267d
            androidx.work.impl.WorkDatabase_Impl r2 = androidx.work.impl.WorkDatabase_Impl.this
            r2.getClass()
            java.lang.String r2 = "PRAGMA foreign_keys = ON"
            r6.C(r2)
            androidx.work.impl.WorkDatabase_Impl r2 = androidx.work.impl.WorkDatabase_Impl.this
            r2.getClass()
            z1.a r3 = new z1.a
            r3.<init>(r6)
            r2.o(r3)
            androidx.work.impl.WorkDatabase_Impl r1 = androidx.work.impl.WorkDatabase_Impl.this
            r1.getClass()
            java.util.List<w1.k$b> r1 = r5.f47266c
            if (r1 == 0) goto Lb9
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        La9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r1.next()
            w1.k$b r2 = (w1.k.b) r2
            r2.a(r6)
            goto La9
        Lb9:
            r5.f47265b = r0
            return
        Lbc:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f47269b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Ld2:
            throw r6     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r1 = move-exception
            A9.I.o(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.n.e(G1.d):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F1.c.a
    public final void f(G1.d dVar, int i, int i10) throws Exception {
        C5716b c5716b = this.f47265b;
        WorkDatabase_Impl.a aVar = this.f47267d;
        if (c5716b != null) {
            k.d dVar2 = c5716b.f47201d;
            dVar2.getClass();
            List<A1.a> listA = C1.e.a(dVar2, i, i10);
            if (listA != null) {
                B7.d.j(new C5852a(dVar));
                for (A1.a aVar2 : listA) {
                    aVar2.getClass();
                    aVar2.a(dVar);
                }
                b bVarB = aVar.b(dVar);
                if (!bVarB.f47268a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + bVarB.f47269b);
                }
                dVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                return;
            }
        }
        C5716b c5716b2 = this.f47265b;
        if (c5716b2 == null || C1.e.b(c5716b2, i, i10)) {
            throw new IllegalStateException(G8.r("A migration from ", i, " to ", i10, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (c5716b2.f47215s) {
            Cursor cursorE = dVar.E(new F1.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                Cursor cursor = cursorE;
                C4284b c4284bU = E.u.u();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    kotlin.jvm.internal.l.c(string);
                    if (!y9.n.a0(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        c4284bU.add(new b9.l(string, Boolean.valueOf(kotlin.jvm.internal.l.b(cursor.getString(1), "view"))));
                    }
                }
                C4284b c4284bM = E.u.m(c4284bU);
                cursorE.close();
                ListIterator listIterator = c4284bM.listIterator(0);
                while (true) {
                    C4284b.C0442b c0442b = (C4284b.C0442b) listIterator;
                    if (!c0442b.hasNext()) {
                        break;
                    }
                    b9.l lVar = (b9.l) c0442b.next();
                    String str = (String) lVar.f18083b;
                    if (((Boolean) lVar.f18084c).booleanValue()) {
                        dVar.C("DROP VIEW IF EXISTS " + str);
                    } else {
                        dVar.C("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            dVar.C("DROP TABLE IF EXISTS `Dependency`");
            dVar.C("DROP TABLE IF EXISTS `WorkSpec`");
            dVar.C("DROP TABLE IF EXISTS `WorkTag`");
            dVar.C("DROP TABLE IF EXISTS `SystemIdInfo`");
            dVar.C("DROP TABLE IF EXISTS `WorkName`");
            dVar.C("DROP TABLE IF EXISTS `WorkProgress`");
            dVar.C("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl.this.getClass();
        }
        List<k.b> list = this.f47266c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((k.b) it.next()).getClass();
            }
        }
        aVar.a(dVar);
    }

    @Override // F1.c.a
    public final void b(G1.d dVar) {
    }
}
