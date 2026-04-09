package Wb;

import Wb.a;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m2.AbstractC6751i;
import m2.q;
import m2.t;
import m2.w;
import o2.AbstractC7061d;
import p2.AbstractC7207a;
import p2.AbstractC7208b;

/* loaded from: classes3.dex */
public final class b implements Wb.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f23776a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f23777b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6751i f23778c;

    /* renamed from: d, reason: collision with root package name */
    private final w f23779d;

    /* renamed from: e, reason: collision with root package name */
    private final w f23780e;

    /* renamed from: f, reason: collision with root package name */
    private final w f23781f;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `floorplanRecord` (`id`,`name`,`ssid`,`timestamp`) VALUES (nullif(?, 0),?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Wb.d dVar) {
            supportSQLiteStatement.bindLong(1, dVar.c());
            if (dVar.d() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dVar.d());
            }
            if (dVar.e() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, dVar.e());
            }
            supportSQLiteStatement.bindLong(4, dVar.f());
        }
    }

    /* renamed from: Wb.b$b, reason: collision with other inner class name */
    class C0893b extends AbstractC6751i {
        C0893b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `floorplanGpx` (`id`,`gpx`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Wb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.b());
            supportSQLiteStatement.bindString(2, cVar.a());
        }
    }

    class c extends w {
        c(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "UPDATE floorplanRecord SET name = ? WHERE id = ?";
        }
    }

    class d extends w {
        d(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM floorplanRecord WHERE id in (?)";
        }
    }

    class e extends w {
        e(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM floorplanGpx WHERE id in (?)";
        }
    }

    class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23787a;

        f(t tVar) {
            this.f23787a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f23776a, this.f23787a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "name");
                int iD3 = AbstractC7207a.d(cursorB, "ssid");
                int iD4 = AbstractC7207a.d(cursorB, "timestamp");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Wb.d(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.getLong(iD4)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23787a.s();
        }
    }

    class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23789a;

        g(t tVar) {
            this.f23789a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f23776a, this.f23789a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "name");
                int iD3 = AbstractC7207a.d(cursorB, "ssid");
                int iD4 = AbstractC7207a.d(cursorB, "timestamp");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Wb.d(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.getLong(iD4)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23789a.s();
        }
    }

    class h implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23791a;

        h(t tVar) {
            this.f23791a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f23776a, this.f23791a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "gpx");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Wb.c(cursorB.getLong(iD), cursorB.getString(iD2)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23791a.s();
        }
    }

    public b(q qVar) {
        this.f23776a = qVar;
        this.f23777b = new a(qVar);
        this.f23778c = new C0893b(qVar);
        this.f23779d = new c(qVar);
        this.f23780e = new d(qVar);
        this.f23781f = new e(qVar);
    }

    public static List m() {
        return Collections.emptyList();
    }

    @Override // Wb.a
    public void a(long j10) {
        this.f23776a.e();
        try {
            a.C0892a.a(this, j10);
            this.f23776a.A();
        } finally {
            this.f23776a.i();
        }
    }

    @Override // Wb.a
    public int b(long j10, String str) {
        this.f23776a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f23779d.b();
        if (str == null) {
            supportSQLiteStatementB.bindNull(1);
        } else {
            supportSQLiteStatementB.bindString(1, str);
        }
        supportSQLiteStatementB.bindLong(2, j10);
        try {
            this.f23776a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f23776a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f23776a.i();
            }
        } finally {
            this.f23779d.h(supportSQLiteStatementB);
        }
    }

    @Override // Wb.a
    public long c(Wb.d dVar) {
        this.f23776a.d();
        this.f23776a.e();
        try {
            long jM = this.f23777b.m(dVar);
            this.f23776a.A();
            return jM;
        } finally {
            this.f23776a.i();
        }
    }

    @Override // Wb.a
    public gg.i d(long j10) {
        t tVarJ = t.j("SELECT * FROM floorplanRecord WHERE id = ?", 1);
        tVarJ.bindLong(1, j10);
        return AbstractC7061d.d(this.f23776a, false, new String[]{"floorplanRecord"}, new f(tVarJ));
    }

    @Override // Wb.a
    public List e() {
        t tVarJ = t.j("SELECT id FROM floorplanRecord WHERE name IS NULL", 0);
        this.f23776a.d();
        Cursor cursorB = AbstractC7208b.b(this.f23776a, tVarJ, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(Long.valueOf(cursorB.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    @Override // Wb.a
    public long f(Wb.d dVar, String str) {
        this.f23776a.e();
        try {
            long jB = a.C0892a.b(this, dVar, str);
            this.f23776a.A();
            return jB;
        } finally {
            this.f23776a.i();
        }
    }

    @Override // Wb.a
    public long g(Wb.c cVar) {
        this.f23776a.d();
        this.f23776a.e();
        try {
            long jM = this.f23778c.m(cVar);
            this.f23776a.A();
            return jM;
        } finally {
            this.f23776a.i();
        }
    }

    @Override // Wb.a
    public int h(long j10) {
        this.f23776a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f23781f.b();
        supportSQLiteStatementB.bindLong(1, j10);
        try {
            this.f23776a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f23776a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f23776a.i();
            }
        } finally {
            this.f23781f.h(supportSQLiteStatementB);
        }
    }

    @Override // Wb.a
    public gg.i i(long j10) {
        t tVarJ = t.j("SELECT * FROM floorplanGpx WHERE id = ?", 1);
        tVarJ.bindLong(1, j10);
        return AbstractC7061d.d(this.f23776a, false, new String[]{"floorplanGpx"}, new h(tVarJ));
    }

    @Override // Wb.a
    public int j(long j10) {
        this.f23776a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f23780e.b();
        supportSQLiteStatementB.bindLong(1, j10);
        try {
            this.f23776a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f23776a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f23776a.i();
            }
        } finally {
            this.f23780e.h(supportSQLiteStatementB);
        }
    }

    @Override // Wb.a
    public gg.i k() {
        return AbstractC7061d.d(this.f23776a, false, new String[]{"floorplanRecord"}, new g(t.j("SELECT * FROM floorplanRecord WHERE name IS NOT NULL ORDER BY timestamp DESC", 0)));
    }
}
