package Ob;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import gg.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m2.AbstractC6750h;
import m2.AbstractC6751i;
import m2.q;
import m2.t;
import m2.w;
import o2.AbstractC7061d;
import p2.AbstractC7207a;
import p2.AbstractC7208b;

/* loaded from: classes3.dex */
public final class b implements Ob.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f17764a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f17765b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f17766c;

    /* renamed from: d, reason: collision with root package name */
    private final w f17767d;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR REPLACE INTO `deviceInformation` (`hwAddrId`,`mac`,`favorite`,`customName`,`updated`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Ob.c cVar) {
            supportSQLiteStatement.bindString(1, cVar.c());
            supportSQLiteStatement.bindString(2, cVar.d());
            supportSQLiteStatement.bindLong(3, cVar.b() ? 1L : 0L);
            if (cVar.a() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, cVar.a());
            }
            supportSQLiteStatement.bindLong(5, cVar.e());
        }
    }

    /* renamed from: Ob.b$b, reason: collision with other inner class name */
    class C0615b extends AbstractC6750h {
        C0615b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `deviceInformation` SET `hwAddrId` = ?,`mac` = ?,`favorite` = ?,`customName` = ?,`updated` = ? WHERE `hwAddrId` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Ob.c cVar) {
            supportSQLiteStatement.bindString(1, cVar.c());
            supportSQLiteStatement.bindString(2, cVar.d());
            supportSQLiteStatement.bindLong(3, cVar.b() ? 1L : 0L);
            if (cVar.a() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, cVar.a());
            }
            supportSQLiteStatement.bindLong(5, cVar.e());
            supportSQLiteStatement.bindString(6, cVar.c());
        }
    }

    class c extends w {
        c(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM deviceInformation";
        }
    }

    class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f17771a;

        d(t tVar) {
            this.f17771a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f17764a, this.f17771a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "hwAddrId");
                int iD2 = AbstractC7207a.d(cursorB, "mac");
                int iD3 = AbstractC7207a.d(cursorB, "favorite");
                int iD4 = AbstractC7207a.d(cursorB, "customName");
                int iD5 = AbstractC7207a.d(cursorB, "updated");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Ob.c(cursorB.getString(iD), cursorB.getString(iD2), cursorB.getInt(iD3) != 0, cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.getLong(iD5)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f17771a.s();
        }
    }

    public b(q qVar) {
        this.f17764a = qVar;
        this.f17765b = new a(qVar);
        this.f17766c = new C0615b(qVar);
        this.f17767d = new c(qVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // Ob.a
    public long a(Ob.c cVar) {
        this.f17764a.d();
        this.f17764a.e();
        try {
            long jM = this.f17765b.m(cVar);
            this.f17764a.A();
            return jM;
        } finally {
            this.f17764a.i();
        }
    }

    @Override // Ob.a
    public int b(Ob.c cVar) {
        this.f17764a.d();
        this.f17764a.e();
        try {
            int iJ = this.f17766c.j(cVar);
            this.f17764a.A();
            return iJ;
        } finally {
            this.f17764a.i();
        }
    }

    @Override // Ob.a
    public i c() {
        return AbstractC7061d.d(this.f17764a, false, new String[]{"deviceInformation"}, new d(t.j("SELECT * FROM deviceInformation", 0)));
    }
}
