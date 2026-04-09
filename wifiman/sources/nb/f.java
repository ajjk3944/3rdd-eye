package Nb;

import Nb.e;
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
    private final q f16361a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f16362b;

    /* renamed from: c, reason: collision with root package name */
    private final w f16363c;

    /* renamed from: d, reason: collision with root package name */
    private final w f16364d;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `cloudConsoles` (`id`,`ssoAccountId`,`fw`,`name`,`mac`,`locLon`,`locLat`,`locText`,`available`,`model`,`product`,`owner`,`network_version`,`network_teleportAvailability`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Nb.d dVar) {
            supportSQLiteStatement.bindString(1, dVar.c());
            supportSQLiteStatement.bindString(2, dVar.m());
            if (dVar.b() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, dVar.b());
            }
            if (dVar.i() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, dVar.i());
            }
            if (dVar.g() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, dVar.g());
            }
            if (dVar.e() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindDouble(6, dVar.e().floatValue());
            }
            if (dVar.d() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindDouble(7, dVar.d().floatValue());
            }
            if (dVar.f() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, dVar.f());
            }
            if ((dVar.a() == null ? null : Integer.valueOf(dVar.a().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, r0.intValue());
            }
            if (dVar.h() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, dVar.h());
            }
            if (dVar.l() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, dVar.l());
            }
            if ((dVar.n() != null ? Integer.valueOf(dVar.n().booleanValue() ? 1 : 0) : null) == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindLong(12, r1.intValue());
            }
            if (dVar.k() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, dVar.k());
            }
            if (dVar.j() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, dVar.j());
            }
        }
    }

    class b extends w {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM cloudConsoles";
        }
    }

    class c extends w {
        c(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM cloudConsoles WHERE ssoAccountId != ?";
        }
    }

    class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f16368a;

        d(t tVar) {
            this.f16368a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string;
            int i10;
            String string2;
            int i11;
            Cursor cursorB = AbstractC7208b.b(f.this.f16361a, this.f16368a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "ssoAccountId");
                int iD3 = AbstractC7207a.d(cursorB, "fw");
                int iD4 = AbstractC7207a.d(cursorB, "name");
                int iD5 = AbstractC7207a.d(cursorB, "mac");
                int iD6 = AbstractC7207a.d(cursorB, "locLon");
                int iD7 = AbstractC7207a.d(cursorB, "locLat");
                int iD8 = AbstractC7207a.d(cursorB, "locText");
                int iD9 = AbstractC7207a.d(cursorB, "available");
                int iD10 = AbstractC7207a.d(cursorB, "model");
                int iD11 = AbstractC7207a.d(cursorB, "product");
                int iD12 = AbstractC7207a.d(cursorB, "owner");
                int iD13 = AbstractC7207a.d(cursorB, "network_version");
                int iD14 = AbstractC7207a.d(cursorB, "network_teleportAvailability");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string3 = cursorB.getString(iD);
                    String string4 = cursorB.getString(iD2);
                    String string5 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string6 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    String string7 = cursorB.isNull(iD5) ? null : cursorB.getString(iD5);
                    Float fValueOf = cursorB.isNull(iD6) ? null : Float.valueOf(cursorB.getFloat(iD6));
                    Float fValueOf2 = cursorB.isNull(iD7) ? null : Float.valueOf(cursorB.getFloat(iD7));
                    String string8 = cursorB.isNull(iD8) ? null : cursorB.getString(iD8);
                    Integer numValueOf = cursorB.isNull(iD9) ? null : Integer.valueOf(cursorB.getInt(iD9));
                    boolean z10 = true;
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    String string9 = cursorB.isNull(iD10) ? null : cursorB.getString(iD10);
                    String string10 = cursorB.isNull(iD11) ? null : cursorB.getString(iD11);
                    Integer numValueOf2 = cursorB.isNull(iD12) ? null : Integer.valueOf(cursorB.getInt(iD12));
                    if (numValueOf2 == null) {
                        boolValueOf2 = null;
                    } else {
                        if (numValueOf2.intValue() == 0) {
                            z10 = false;
                        }
                        boolValueOf2 = Boolean.valueOf(z10);
                    }
                    if (cursorB.isNull(iD13)) {
                        i10 = iD14;
                        string = null;
                    } else {
                        string = cursorB.getString(iD13);
                        i10 = iD14;
                    }
                    if (cursorB.isNull(i10)) {
                        i11 = iD;
                        string2 = null;
                    } else {
                        string2 = cursorB.getString(i10);
                        i11 = iD;
                    }
                    arrayList.add(new Nb.d(string3, string4, string5, string6, string7, fValueOf, fValueOf2, string8, boolValueOf, string9, string10, boolValueOf2, string, string2));
                    iD = i11;
                    iD14 = i10;
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f16368a.s();
        }
    }

    public f(q qVar) {
        this.f16361a = qVar;
        this.f16362b = new a(qVar);
        this.f16363c = new b(qVar);
        this.f16364d = new c(qVar);
    }

    public static List f() {
        return Collections.emptyList();
    }

    @Override // Nb.e
    public i a() {
        return AbstractC7061d.d(this.f16361a, false, new String[]{"cloudConsoles"}, new d(t.j("SELECT * FROM cloudConsoles", 0)));
    }

    @Override // Nb.e
    public void b(List list) {
        this.f16361a.d();
        this.f16361a.e();
        try {
            this.f16362b.j(list);
            this.f16361a.A();
        } finally {
            this.f16361a.i();
        }
    }

    @Override // Nb.e
    public void c(List list) {
        this.f16361a.e();
        try {
            e.a.a(this, list);
            this.f16361a.A();
        } finally {
            this.f16361a.i();
        }
    }

    @Override // Nb.e
    public void clear() {
        this.f16361a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f16363c.b();
        try {
            this.f16361a.e();
            try {
                supportSQLiteStatementB.executeUpdateDelete();
                this.f16361a.A();
            } finally {
                this.f16361a.i();
            }
        } finally {
            this.f16363c.h(supportSQLiteStatementB);
        }
    }

    @Override // Nb.e
    public void d(String str) {
        this.f16361a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f16364d.b();
        supportSQLiteStatementB.bindString(1, str);
        try {
            this.f16361a.e();
            try {
                supportSQLiteStatementB.executeUpdateDelete();
                this.f16361a.A();
            } finally {
                this.f16361a.i();
            }
        } finally {
            this.f16364d.h(supportSQLiteStatementB);
        }
    }
}
