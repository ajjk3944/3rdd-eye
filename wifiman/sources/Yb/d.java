package Yb;

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

/* loaded from: classes3.dex */
public final class d implements Yb.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f24850a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f24851b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f24852c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR REPLACE INTO `speedTestServer` (`id`,`city`,`country`,`countryCode`,`latitude`,`longitude`,`provider`,`providerUrl`,`speedMbps`,`url`,`timestamp`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Yb.a aVar) {
            supportSQLiteStatement.bindString(1, aVar.d());
            if (aVar.a() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, aVar.a());
            }
            if (aVar.b() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, aVar.b());
            }
            if (aVar.c() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, aVar.c());
            }
            if (aVar.e() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindDouble(5, aVar.e().doubleValue());
            }
            if (aVar.f() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindDouble(6, aVar.f().doubleValue());
            }
            if (aVar.g() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, aVar.g());
            }
            if (aVar.h() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, aVar.h());
            }
            if (aVar.i() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, aVar.i().intValue());
            }
            if (aVar.l() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, aVar.l());
            }
            supportSQLiteStatement.bindLong(11, aVar.j());
            supportSQLiteStatement.bindString(12, aVar.m());
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "DELETE FROM `speedTestServer` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Yb.a aVar) {
            supportSQLiteStatement.bindString(1, aVar.d());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f24855a;

        c(t tVar) {
            this.f24855a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(d.this.f24850a, this.f24855a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "city");
                int iD3 = AbstractC7207a.d(cursorB, "country");
                int iD4 = AbstractC7207a.d(cursorB, "countryCode");
                int iD5 = AbstractC7207a.d(cursorB, "latitude");
                int iD6 = AbstractC7207a.d(cursorB, "longitude");
                int iD7 = AbstractC7207a.d(cursorB, "provider");
                int iD8 = AbstractC7207a.d(cursorB, "providerUrl");
                int iD9 = AbstractC7207a.d(cursorB, "speedMbps");
                int iD10 = AbstractC7207a.d(cursorB, "url");
                int iD11 = AbstractC7207a.d(cursorB, "timestamp");
                int iD12 = AbstractC7207a.d(cursorB, "type");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Yb.a(cursorB.getString(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.isNull(iD5) ? null : Double.valueOf(cursorB.getDouble(iD5)), cursorB.isNull(iD6) ? null : Double.valueOf(cursorB.getDouble(iD6)), cursorB.isNull(iD7) ? null : cursorB.getString(iD7), cursorB.isNull(iD8) ? null : cursorB.getString(iD8), cursorB.isNull(iD9) ? null : Integer.valueOf(cursorB.getInt(iD9)), cursorB.isNull(iD10) ? null : cursorB.getString(iD10), cursorB.getLong(iD11), cursorB.getString(iD12)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f24855a.s();
        }
    }

    public d(q qVar) {
        this.f24850a = qVar;
        this.f24851b = new a(qVar);
        this.f24852c = new b(qVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // Yb.b
    public void a(Yb.a aVar) {
        this.f24850a.d();
        this.f24850a.e();
        try {
            this.f24851b.k(aVar);
            this.f24850a.A();
        } finally {
            this.f24850a.i();
        }
    }

    @Override // Yb.b
    public void b(Yb.a... aVarArr) {
        this.f24850a.d();
        this.f24850a.e();
        try {
            this.f24852c.k(aVarArr);
            this.f24850a.A();
        } finally {
            this.f24850a.i();
        }
    }

    @Override // Yb.b
    public i c() {
        return AbstractC7061d.d(this.f24850a, false, new String[]{"speedTestServer"}, new c(t.j("SELECT * FROM speedTestServer ORDER BY timestamp DESC", 0)));
    }
}
