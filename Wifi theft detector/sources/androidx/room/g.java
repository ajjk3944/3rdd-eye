package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import u1.c;

/* loaded from: classes.dex */
public class g extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public androidx.room.a f4119b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4120c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4121d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4122e;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4123a;

        public a(int i10) {
            this.f4123a = i10;
        }

        public abstract void a(u1.b bVar);

        public abstract void b(u1.b bVar);

        public abstract void c(u1.b bVar);

        public abstract void d(u1.b bVar);

        public abstract void e(u1.b bVar);

        public abstract void f(u1.b bVar);

        public abstract b g(u1.b bVar);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4124a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4125b;

        public b(boolean z10, String str) {
            this.f4124a = z10;
            this.f4125b = str;
        }
    }

    public g(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f4123a);
        this.f4119b = aVar;
        this.f4120c = aVar2;
        this.f4121d = str;
        this.f4122e = str2;
    }

    public static boolean j(u1.b bVar) {
        Cursor cursorO = bVar.O("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cursorO.moveToFirst()) {
                if (cursorO.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorO.close();
        }
    }

    public static boolean k(u1.b bVar) {
        Cursor cursorO = bVar.O("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (cursorO.moveToFirst()) {
                if (cursorO.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorO.close();
        }
    }

    @Override // u1.c.a
    public void b(u1.b bVar) {
        super.b(bVar);
    }

    @Override // u1.c.a
    public void d(u1.b bVar) {
        boolean zJ = j(bVar);
        this.f4120c.a(bVar);
        if (!zJ) {
            b bVarG = this.f4120c.g(bVar);
            if (!bVarG.f4124a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f4125b);
            }
        }
        l(bVar);
        this.f4120c.c(bVar);
    }

    @Override // u1.c.a
    public void e(u1.b bVar, int i10, int i11) {
        g(bVar, i10, i11);
    }

    @Override // u1.c.a
    public void f(u1.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f4120c.d(bVar);
        this.f4119b = null;
    }

    @Override // u1.c.a
    public void g(u1.b bVar, int i10, int i11) {
        List listC;
        androidx.room.a aVar = this.f4119b;
        if (aVar == null || (listC = aVar.f4060d.c(i10, i11)) == null) {
            androidx.room.a aVar2 = this.f4119b;
            if (aVar2 != null && !aVar2.a(i10, i11)) {
                this.f4120c.b(bVar);
                this.f4120c.a(bVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f4120c.f(bVar);
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((r1.a) it.next()).a(bVar);
        }
        b bVarG = this.f4120c.g(bVar);
        if (bVarG.f4124a) {
            this.f4120c.e(bVar);
            l(bVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + bVarG.f4125b);
        }
    }

    public final void h(u1.b bVar) {
        if (!k(bVar)) {
            b bVarG = this.f4120c.g(bVar);
            if (bVarG.f4124a) {
                this.f4120c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f4125b);
            }
        }
        Cursor cursorM = bVar.M(new u1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorM.moveToFirst() ? cursorM.getString(0) : null;
            cursorM.close();
            if (!this.f4121d.equals(string) && !this.f4122e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorM.close();
            throw th;
        }
    }

    public final void i(u1.b bVar) {
        bVar.y("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void l(u1.b bVar) {
        i(bVar);
        bVar.y(q1.c.a(this.f4121d));
    }
}
