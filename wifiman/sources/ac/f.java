package ac;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import gg.i;
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
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final q f25936a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f25937b;

    /* renamed from: c, reason: collision with root package name */
    private final w f25938c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR REPLACE INTO `console` (`id`,`consoleId`,`ssoAccountId`,`publicSecret`,`name`,`network_name`,`wanIp`,`sku`,`imageId`,`imageIdStr`,`imageEngine`,`latitude`,`longitude`,`location_text`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, C3785b c3785b) {
            supportSQLiteStatement.bindString(1, c3785b.b());
            supportSQLiteStatement.bindString(2, c3785b.a());
            if (c3785b.m() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c3785b.m());
            }
            if (c3785b.l() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, c3785b.l());
            }
            supportSQLiteStatement.bindString(5, c3785b.i());
            if (c3785b.j() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, c3785b.j());
            }
            if (c3785b.n() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, c3785b.n());
            }
            if (c3785b.k() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, c3785b.k());
            }
            if (c3785b.d() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, c3785b.d().intValue());
            }
            if (c3785b.e() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, c3785b.e());
            }
            if (c3785b.c() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindLong(11, c3785b.c().intValue());
            }
            if (c3785b.f() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindDouble(12, c3785b.f().doubleValue());
            }
            if (c3785b.h() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindDouble(13, c3785b.h().doubleValue());
            }
            if (c3785b.g() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, c3785b.g());
            }
        }
    }

    class b extends w {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM console WHERE id = ?";
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f25941a;

        c(t tVar) {
            this.f25941a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Double dValueOf;
            int i10;
            String string;
            int i11;
            Cursor cursorB = AbstractC7208b.b(f.this.f25936a, this.f25941a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "consoleId");
                int iD3 = AbstractC7207a.d(cursorB, "ssoAccountId");
                int iD4 = AbstractC7207a.d(cursorB, "publicSecret");
                int iD5 = AbstractC7207a.d(cursorB, "name");
                int iD6 = AbstractC7207a.d(cursorB, "network_name");
                int iD7 = AbstractC7207a.d(cursorB, "wanIp");
                int iD8 = AbstractC7207a.d(cursorB, "sku");
                int iD9 = AbstractC7207a.d(cursorB, "imageId");
                int iD10 = AbstractC7207a.d(cursorB, "imageIdStr");
                int iD11 = AbstractC7207a.d(cursorB, "imageEngine");
                int iD12 = AbstractC7207a.d(cursorB, "latitude");
                int iD13 = AbstractC7207a.d(cursorB, "longitude");
                int iD14 = AbstractC7207a.d(cursorB, "location_text");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string2 = cursorB.getString(iD);
                    String string3 = cursorB.getString(iD2);
                    String string4 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string5 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    String string6 = cursorB.getString(iD5);
                    String string7 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                    String string8 = cursorB.isNull(iD7) ? null : cursorB.getString(iD7);
                    String string9 = cursorB.isNull(iD8) ? null : cursorB.getString(iD8);
                    Integer numValueOf = cursorB.isNull(iD9) ? null : Integer.valueOf(cursorB.getInt(iD9));
                    String string10 = cursorB.isNull(iD10) ? null : cursorB.getString(iD10);
                    Integer numValueOf2 = cursorB.isNull(iD11) ? null : Integer.valueOf(cursorB.getInt(iD11));
                    Double dValueOf2 = cursorB.isNull(iD12) ? null : Double.valueOf(cursorB.getDouble(iD12));
                    if (cursorB.isNull(iD13)) {
                        i10 = iD14;
                        dValueOf = null;
                    } else {
                        dValueOf = Double.valueOf(cursorB.getDouble(iD13));
                        i10 = iD14;
                    }
                    if (cursorB.isNull(i10)) {
                        i11 = iD;
                        string = null;
                    } else {
                        string = cursorB.getString(i10);
                        i11 = iD;
                    }
                    arrayList.add(new C3785b(string2, string3, string4, string5, string6, string7, string8, string9, numValueOf, string10, numValueOf2, dValueOf2, dValueOf, string));
                    iD = i11;
                    iD14 = i10;
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f25941a.s();
        }
    }

    public f(q qVar) {
        this.f25936a = qVar;
        this.f25937b = new a(qVar);
        this.f25938c = new b(qVar);
    }

    public static List f() {
        return Collections.emptyList();
    }

    @Override // ac.e
    public i a() {
        return AbstractC7061d.d(this.f25936a, false, new String[]{"console"}, new c(t.j("SELECT * FROM console", 0)));
    }

    @Override // ac.e
    public void b(String str) {
        this.f25936a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f25938c.b();
        supportSQLiteStatementB.bindString(1, str);
        try {
            this.f25936a.e();
            try {
                supportSQLiteStatementB.executeUpdateDelete();
                this.f25936a.A();
            } finally {
                this.f25936a.i();
            }
        } finally {
            this.f25938c.h(supportSQLiteStatementB);
        }
    }

    @Override // ac.e
    public long c(C3785b c3785b) {
        this.f25936a.d();
        this.f25936a.e();
        try {
            long jM = this.f25937b.m(c3785b);
            this.f25936a.A();
            return jM;
        } finally {
            this.f25936a.i();
        }
    }

    @Override // ac.e
    public C3785b d(String str) {
        C3785b c3785b;
        t tVarJ = t.j("SELECT * FROM console WHERE consoleId = ?", 1);
        tVarJ.bindString(1, str);
        this.f25936a.d();
        Cursor cursorB = AbstractC7208b.b(this.f25936a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "consoleId");
            int iD3 = AbstractC7207a.d(cursorB, "ssoAccountId");
            int iD4 = AbstractC7207a.d(cursorB, "publicSecret");
            int iD5 = AbstractC7207a.d(cursorB, "name");
            int iD6 = AbstractC7207a.d(cursorB, "network_name");
            int iD7 = AbstractC7207a.d(cursorB, "wanIp");
            int iD8 = AbstractC7207a.d(cursorB, "sku");
            int iD9 = AbstractC7207a.d(cursorB, "imageId");
            int iD10 = AbstractC7207a.d(cursorB, "imageIdStr");
            int iD11 = AbstractC7207a.d(cursorB, "imageEngine");
            int iD12 = AbstractC7207a.d(cursorB, "latitude");
            int iD13 = AbstractC7207a.d(cursorB, "longitude");
            int iD14 = AbstractC7207a.d(cursorB, "location_text");
            if (cursorB.moveToFirst()) {
                c3785b = new C3785b(cursorB.getString(iD), cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.getString(iD5), cursorB.isNull(iD6) ? null : cursorB.getString(iD6), cursorB.isNull(iD7) ? null : cursorB.getString(iD7), cursorB.isNull(iD8) ? null : cursorB.getString(iD8), cursorB.isNull(iD9) ? null : Integer.valueOf(cursorB.getInt(iD9)), cursorB.isNull(iD10) ? null : cursorB.getString(iD10), cursorB.isNull(iD11) ? null : Integer.valueOf(cursorB.getInt(iD11)), cursorB.isNull(iD12) ? null : Double.valueOf(cursorB.getDouble(iD12)), cursorB.isNull(iD13) ? null : Double.valueOf(cursorB.getDouble(iD13)), cursorB.isNull(iD14) ? null : cursorB.getString(iD14));
            } else {
                c3785b = null;
            }
            return c3785b;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    @Override // ac.e
    public C3785b get(String str) {
        C3785b c3785b;
        t tVarJ = t.j("SELECT * FROM console WHERE id = ?", 1);
        tVarJ.bindString(1, str);
        this.f25936a.d();
        Cursor cursorB = AbstractC7208b.b(this.f25936a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "consoleId");
            int iD3 = AbstractC7207a.d(cursorB, "ssoAccountId");
            int iD4 = AbstractC7207a.d(cursorB, "publicSecret");
            int iD5 = AbstractC7207a.d(cursorB, "name");
            int iD6 = AbstractC7207a.d(cursorB, "network_name");
            int iD7 = AbstractC7207a.d(cursorB, "wanIp");
            int iD8 = AbstractC7207a.d(cursorB, "sku");
            int iD9 = AbstractC7207a.d(cursorB, "imageId");
            int iD10 = AbstractC7207a.d(cursorB, "imageIdStr");
            int iD11 = AbstractC7207a.d(cursorB, "imageEngine");
            int iD12 = AbstractC7207a.d(cursorB, "latitude");
            int iD13 = AbstractC7207a.d(cursorB, "longitude");
            int iD14 = AbstractC7207a.d(cursorB, "location_text");
            if (cursorB.moveToFirst()) {
                c3785b = new C3785b(cursorB.getString(iD), cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.getString(iD5), cursorB.isNull(iD6) ? null : cursorB.getString(iD6), cursorB.isNull(iD7) ? null : cursorB.getString(iD7), cursorB.isNull(iD8) ? null : cursorB.getString(iD8), cursorB.isNull(iD9) ? null : Integer.valueOf(cursorB.getInt(iD9)), cursorB.isNull(iD10) ? null : cursorB.getString(iD10), cursorB.isNull(iD11) ? null : Integer.valueOf(cursorB.getInt(iD11)), cursorB.isNull(iD12) ? null : Double.valueOf(cursorB.getDouble(iD12)), cursorB.isNull(iD13) ? null : Double.valueOf(cursorB.getDouble(iD13)), cursorB.isNull(iD14) ? null : cursorB.getString(iD14));
            } else {
                c3785b = null;
            }
            return c3785b;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }
}
