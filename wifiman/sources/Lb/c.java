package Lb;

import Lb.b;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import gg.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import m2.AbstractC6750h;
import m2.AbstractC6751i;
import m2.q;
import m2.t;
import m2.w;
import mh.InterfaceC6835l;
import o2.AbstractC7061d;
import p2.AbstractC7207a;
import p2.AbstractC7208b;

/* loaded from: classes3.dex */
public final class c implements Lb.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f11530a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f11531b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f11532c;

    /* renamed from: d, reason: collision with root package name */
    private final w f11533d;

    /* renamed from: e, reason: collision with root package name */
    private final w f11534e;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR REPLACE INTO `ssoAccount` (`uuid`,`username`,`first_name`,`last_name`,`email`,`avatarUrl`,`verified`,`privacy_revision`,`terms_revision`,`isPrimary`,`updated`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Lb.a aVar) {
            supportSQLiteStatement.bindString(1, aVar.k());
            supportSQLiteStatement.bindString(2, aVar.j());
            if (aVar.e() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, aVar.e());
            }
            if (aVar.f() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, aVar.f());
            }
            supportSQLiteStatement.bindString(5, aVar.d());
            if (aVar.c() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, aVar.c());
            }
            if ((aVar.l() == null ? null : Integer.valueOf(aVar.l().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, r0.intValue());
            }
            if (aVar.g() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, aVar.g());
            }
            if (aVar.h() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, aVar.h());
            }
            supportSQLiteStatement.bindLong(10, aVar.m() ? 1L : 0L);
            supportSQLiteStatement.bindLong(11, aVar.i());
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `ssoAccount` SET `uuid` = ?,`username` = ?,`first_name` = ?,`last_name` = ?,`email` = ?,`avatarUrl` = ?,`verified` = ?,`privacy_revision` = ?,`terms_revision` = ?,`isPrimary` = ?,`updated` = ? WHERE `uuid` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Lb.a aVar) {
            supportSQLiteStatement.bindString(1, aVar.k());
            supportSQLiteStatement.bindString(2, aVar.j());
            if (aVar.e() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, aVar.e());
            }
            if (aVar.f() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, aVar.f());
            }
            supportSQLiteStatement.bindString(5, aVar.d());
            if (aVar.c() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, aVar.c());
            }
            if ((aVar.l() == null ? null : Integer.valueOf(aVar.l().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, r0.intValue());
            }
            if (aVar.g() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, aVar.g());
            }
            if (aVar.h() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, aVar.h());
            }
            supportSQLiteStatement.bindLong(10, aVar.m() ? 1L : 0L);
            supportSQLiteStatement.bindLong(11, aVar.i());
            supportSQLiteStatement.bindString(12, aVar.k());
        }
    }

    /* renamed from: Lb.c$c, reason: collision with other inner class name */
    class C0454c extends w {
        C0454c(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM ssoAccount WHERE uuid = ?";
        }
    }

    class d extends w {
        d(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "UPDATE ssoAccount SET isPrimary = CASE uuid WHEN ? THEN 1 ELSE 0 END";
        }
    }

    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f11539a;

        e(t tVar) {
            this.f11539a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Boolean boolValueOf;
            Cursor cursorB = AbstractC7208b.b(c.this.f11530a, this.f11539a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "uuid");
                int iD2 = AbstractC7207a.d(cursorB, "username");
                int iD3 = AbstractC7207a.d(cursorB, "first_name");
                int iD4 = AbstractC7207a.d(cursorB, "last_name");
                int iD5 = AbstractC7207a.d(cursorB, "email");
                int iD6 = AbstractC7207a.d(cursorB, "avatarUrl");
                int iD7 = AbstractC7207a.d(cursorB, "verified");
                int iD8 = AbstractC7207a.d(cursorB, "privacy_revision");
                int iD9 = AbstractC7207a.d(cursorB, "terms_revision");
                int iD10 = AbstractC7207a.d(cursorB, "isPrimary");
                int iD11 = AbstractC7207a.d(cursorB, "updated");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iD);
                    String string2 = cursorB.getString(iD2);
                    String string3 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string4 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    String string5 = cursorB.getString(iD5);
                    String string6 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                    Integer numValueOf = cursorB.isNull(iD7) ? null : Integer.valueOf(cursorB.getInt(iD7));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    arrayList.add(new Lb.a(string, string2, string3, string4, string5, string6, boolValueOf, cursorB.isNull(iD8) ? null : cursorB.getString(iD8), cursorB.isNull(iD9) ? null : cursorB.getString(iD9), cursorB.getInt(iD10) != 0, cursorB.getLong(iD11)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f11539a.s();
        }
    }

    public c(q qVar) {
        this.f11530a = qVar;
        this.f11531b = new a(qVar);
        this.f11532c = new b(qVar);
        this.f11533d = new C0454c(qVar);
        this.f11534e = new d(qVar);
    }

    public static List i() {
        return Collections.emptyList();
    }

    @Override // Lb.b
    public int b(String str) {
        this.f11530a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f11533d.b();
        supportSQLiteStatementB.bindString(1, str);
        try {
            this.f11530a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f11530a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f11530a.i();
            }
        } finally {
            this.f11533d.h(supportSQLiteStatementB);
        }
    }

    @Override // Lb.b
    public i c() {
        return AbstractC7061d.d(this.f11530a, false, new String[]{"ssoAccount"}, new e(t.j("SELECT * FROM ssoAccount", 0)));
    }

    @Override // Lb.b
    public int d(UUID uuid, InterfaceC6835l interfaceC6835l) {
        this.f11530a.e();
        try {
            int iB = b.a.b(this, uuid, interfaceC6835l);
            this.f11530a.A();
            return iB;
        } finally {
            this.f11530a.i();
        }
    }

    @Override // Lb.b
    public boolean e(List list, List list2) {
        this.f11530a.e();
        try {
            boolean zA = b.a.a(this, list, list2);
            this.f11530a.A();
            return zA;
        } finally {
            this.f11530a.i();
        }
    }

    @Override // Lb.b
    public int f(Lb.a aVar) {
        this.f11530a.d();
        this.f11530a.e();
        try {
            int iJ = this.f11532c.j(aVar);
            this.f11530a.A();
            return iJ;
        } finally {
            this.f11530a.i();
        }
    }

    @Override // Lb.b
    public void g(Lb.a aVar) {
        this.f11530a.d();
        this.f11530a.e();
        try {
            this.f11531b.k(aVar);
            this.f11530a.A();
        } finally {
            this.f11530a.i();
        }
    }

    @Override // Lb.b
    public Lb.a get(String str) {
        Boolean boolValueOf;
        t tVarJ = t.j("SELECT * FROM ssoAccount WHERE uuid = ?", 1);
        tVarJ.bindString(1, str);
        this.f11530a.d();
        Lb.a aVar = null;
        Cursor cursorB = AbstractC7208b.b(this.f11530a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "uuid");
            int iD2 = AbstractC7207a.d(cursorB, "username");
            int iD3 = AbstractC7207a.d(cursorB, "first_name");
            int iD4 = AbstractC7207a.d(cursorB, "last_name");
            int iD5 = AbstractC7207a.d(cursorB, "email");
            int iD6 = AbstractC7207a.d(cursorB, "avatarUrl");
            int iD7 = AbstractC7207a.d(cursorB, "verified");
            int iD8 = AbstractC7207a.d(cursorB, "privacy_revision");
            int iD9 = AbstractC7207a.d(cursorB, "terms_revision");
            int iD10 = AbstractC7207a.d(cursorB, "isPrimary");
            int iD11 = AbstractC7207a.d(cursorB, "updated");
            if (cursorB.moveToFirst()) {
                String string = cursorB.getString(iD);
                String string2 = cursorB.getString(iD2);
                String string3 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                String string4 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                String string5 = cursorB.getString(iD5);
                String string6 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                Integer numValueOf = cursorB.isNull(iD7) ? null : Integer.valueOf(cursorB.getInt(iD7));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                aVar = new Lb.a(string, string2, string3, string4, string5, string6, boolValueOf, cursorB.isNull(iD8) ? null : cursorB.getString(iD8), cursorB.isNull(iD9) ? null : cursorB.getString(iD9), cursorB.getInt(iD10) != 0, cursorB.getLong(iD11));
            }
            return aVar;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    @Override // Lb.b
    public int h(String str) {
        this.f11530a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f11534e.b();
        supportSQLiteStatementB.bindString(1, str);
        try {
            this.f11530a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f11530a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f11530a.i();
            }
        } finally {
            this.f11534e.h(supportSQLiteStatementB);
        }
    }
}
