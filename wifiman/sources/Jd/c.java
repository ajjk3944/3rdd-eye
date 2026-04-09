package Jd;

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

/* loaded from: classes4.dex */
public final class c implements Jd.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f9996a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f9997b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f9998c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR REPLACE INTO `config` (`id`,`cloudToken`,`cloudSecret`,`key`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Jd.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.c());
            supportSQLiteStatement.bindString(2, aVar.b());
            supportSQLiteStatement.bindString(3, aVar.a());
            supportSQLiteStatement.bindString(4, aVar.d());
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `config` SET `id` = ?,`cloudToken` = ?,`cloudSecret` = ?,`key` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Jd.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.c());
            supportSQLiteStatement.bindString(2, aVar.b());
            supportSQLiteStatement.bindString(3, aVar.a());
            supportSQLiteStatement.bindString(4, aVar.d());
            supportSQLiteStatement.bindLong(5, aVar.c());
        }
    }

    /* renamed from: Jd.c$c, reason: collision with other inner class name */
    class CallableC0405c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f10001a;

        CallableC0405c(t tVar) {
            this.f10001a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(c.this.f9996a, this.f10001a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "cloudToken");
                int iD3 = AbstractC7207a.d(cursorB, "cloudSecret");
                int iD4 = AbstractC7207a.d(cursorB, "key");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Jd.a(cursorB.getLong(iD), cursorB.getString(iD2), cursorB.getString(iD3), cursorB.getString(iD4)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f10001a.s();
        }
    }

    public c(q qVar) {
        this.f9996a = qVar;
        this.f9997b = new a(qVar);
        this.f9998c = new b(qVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // Jd.b
    public i a() {
        return AbstractC7061d.d(this.f9996a, false, new String[]{"config"}, new CallableC0405c(t.j("SELECT * FROM config", 0)));
    }

    @Override // Jd.b
    public long b(Jd.a aVar) {
        this.f9996a.d();
        this.f9996a.e();
        try {
            long jM = this.f9997b.m(aVar);
            this.f9996a.A();
            return jM;
        } finally {
            this.f9996a.i();
        }
    }

    @Override // Jd.b
    public int c(String... strArr) {
        this.f9996a.d();
        StringBuilder sbB = AbstractC7211e.b();
        sbB.append("DELETE FROM config WHERE key in (");
        AbstractC7211e.a(sbB, strArr.length);
        sbB.append(")");
        SupportSQLiteStatement supportSQLiteStatementF = this.f9996a.f(sbB.toString());
        int i10 = 1;
        for (String str : strArr) {
            supportSQLiteStatementF.bindString(i10, str);
            i10++;
        }
        this.f9996a.e();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementF.executeUpdateDelete();
            this.f9996a.A();
            return iExecuteUpdateDelete;
        } finally {
            this.f9996a.i();
        }
    }
}
