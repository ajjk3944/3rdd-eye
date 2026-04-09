package l2;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23066a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.a f23067b;

    public class a extends q1.a {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // q1.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u1.f fVar, d dVar) {
            String str = dVar.f23064a;
            if (str == null) {
                fVar.R(1);
            } else {
                fVar.i(1, str);
            }
            Long l10 = dVar.f23065b;
            if (l10 == null) {
                fVar.R(2);
            } else {
                fVar.s(2, l10.longValue());
            }
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f23066a = roomDatabase;
        this.f23067b = new a(roomDatabase);
    }

    @Override // l2.e
    public void a(d dVar) {
        this.f23066a.b();
        this.f23066a.c();
        try {
            this.f23067b.h(dVar);
            this.f23066a.r();
        } finally {
            this.f23066a.g();
        }
    }

    @Override // l2.e
    public Long b(String str) {
        q1.d dVarA = q1.d.a("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23066a.b();
        Long lValueOf = null;
        Cursor cursorB = s1.c.b(this.f23066a, dVarA, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }
}
