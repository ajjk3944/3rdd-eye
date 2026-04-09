package Rb;

import Rb.a;
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
import o2.AbstractC7061d;
import p2.AbstractC7207a;
import p2.AbstractC7208b;
import p2.AbstractC7211e;

/* loaded from: classes3.dex */
public final class b implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f19687a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f19688b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f19689c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `favoriteHost` (`id`,`host`,`priority`,`updatedAt`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Rb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.d());
            supportSQLiteStatement.bindString(2, cVar.c());
            supportSQLiteStatement.bindLong(3, cVar.e());
            supportSQLiteStatement.bindLong(4, cVar.f());
        }
    }

    /* renamed from: Rb.b$b, reason: collision with other inner class name */
    class C0702b extends AbstractC6750h {
        C0702b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `favoriteHost` SET `id` = ?,`host` = ?,`priority` = ?,`updatedAt` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Rb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.d());
            supportSQLiteStatement.bindString(2, cVar.c());
            supportSQLiteStatement.bindLong(3, cVar.e());
            supportSQLiteStatement.bindLong(4, cVar.f());
            supportSQLiteStatement.bindLong(5, cVar.d());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f19692a;

        c(t tVar) {
            this.f19692a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f19687a, this.f19692a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "host");
                int iD3 = AbstractC7207a.d(cursorB, "priority");
                int iD4 = AbstractC7207a.d(cursorB, "updatedAt");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Rb.c(cursorB.getLong(iD), cursorB.getString(iD2), cursorB.getInt(iD3), cursorB.getLong(iD4)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f19692a.s();
        }
    }

    public b(q qVar) {
        this.f19687a = qVar;
        this.f19688b = new a(qVar);
        this.f19689c = new C0702b(qVar);
    }

    public static List g() {
        return Collections.emptyList();
    }

    @Override // Rb.a
    public i a() {
        return AbstractC7061d.d(this.f19687a, false, new String[]{"favoriteHost"}, new c(t.j("SELECT * FROM favoriteHost ORDER BY priority", 0)));
    }

    @Override // Rb.a
    public int b(long... jArr) {
        this.f19687a.d();
        StringBuilder sbB = AbstractC7211e.b();
        sbB.append("DELETE FROM favoriteHost WHERE id in (");
        AbstractC7211e.a(sbB, jArr.length);
        sbB.append(")");
        SupportSQLiteStatement supportSQLiteStatementF = this.f19687a.f(sbB.toString());
        int i10 = 1;
        for (long j10 : jArr) {
            supportSQLiteStatementF.bindLong(i10, j10);
            i10++;
        }
        this.f19687a.e();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementF.executeUpdateDelete();
            this.f19687a.A();
            return iExecuteUpdateDelete;
        } finally {
            this.f19687a.i();
        }
    }

    @Override // Rb.a
    public void c(Rb.c... cVarArr) {
        this.f19687a.d();
        this.f19687a.e();
        try {
            this.f19689c.k(cVarArr);
            this.f19687a.A();
        } finally {
            this.f19687a.i();
        }
    }

    @Override // Rb.a
    public void d(long j10, int i10, long j11) {
        this.f19687a.e();
        try {
            a.C0701a.a(this, j10, i10, j11);
            this.f19687a.A();
        } finally {
            this.f19687a.i();
        }
    }

    @Override // Rb.a
    public void e(Rb.c... cVarArr) {
        this.f19687a.d();
        this.f19687a.e();
        try {
            this.f19688b.l(cVarArr);
            this.f19687a.A();
        } finally {
            this.f19687a.i();
        }
    }

    @Override // Rb.a
    public List getAll() {
        t tVarJ = t.j("SELECT * FROM favoriteHost ORDER BY priority", 0);
        this.f19687a.d();
        Cursor cursorB = AbstractC7208b.b(this.f19687a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "host");
            int iD3 = AbstractC7207a.d(cursorB, "priority");
            int iD4 = AbstractC7207a.d(cursorB, "updatedAt");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(new Rb.c(cursorB.getLong(iD), cursorB.getString(iD2), cursorB.getInt(iD3), cursorB.getLong(iD4)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }
}
