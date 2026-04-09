package cc;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import cc.InterfaceC4238b;
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

/* renamed from: cc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4239c implements InterfaceC4238b {

    /* renamed from: a, reason: collision with root package name */
    private final q f33924a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f33925b;

    /* renamed from: c, reason: collision with root package name */
    private final w f33926c;

    /* renamed from: cc.c$a */
    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `wifimanWizardAdoption` (`id`,`mac`,`name`,`fw_recommended`) VALUES (?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, C4237a c4237a) {
            supportSQLiteStatement.bindLong(1, c4237a.d());
            supportSQLiteStatement.bindString(2, c4237a.e());
            supportSQLiteStatement.bindString(3, c4237a.f());
            if (c4237a.c() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, c4237a.c());
            }
        }
    }

    /* renamed from: cc.c$b */
    class b extends w {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM wifimanWizardAdoption";
        }
    }

    /* renamed from: cc.c$c, reason: collision with other inner class name */
    class CallableC1180c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f33929a;

        CallableC1180c(t tVar) {
            this.f33929a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(C4239c.this.f33924a, this.f33929a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "mac");
                int iD3 = AbstractC7207a.d(cursorB, "name");
                int iD4 = AbstractC7207a.d(cursorB, "fw_recommended");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new C4237a(cursorB.getInt(iD), cursorB.getString(iD2), cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f33929a.s();
        }
    }

    public C4239c(q qVar) {
        this.f33924a = qVar;
        this.f33925b = new a(qVar);
        this.f33926c = new b(qVar);
    }

    public static List f() {
        return Collections.emptyList();
    }

    @Override // cc.InterfaceC4238b
    public i a() {
        return AbstractC7061d.d(this.f33924a, false, new String[]{"wifimanWizardAdoption"}, new CallableC1180c(t.j("SELECT * FROM wifimanWizardAdoption", 0)));
    }

    @Override // cc.InterfaceC4238b
    public void b(C4237a c4237a) {
        this.f33924a.e();
        try {
            InterfaceC4238b.a.a(this, c4237a);
            this.f33924a.A();
        } finally {
            this.f33924a.i();
        }
    }

    @Override // cc.InterfaceC4238b
    public long c(C4237a c4237a) {
        this.f33924a.d();
        this.f33924a.e();
        try {
            long jM = this.f33925b.m(c4237a);
            this.f33924a.A();
            return jM;
        } finally {
            this.f33924a.i();
        }
    }

    @Override // cc.InterfaceC4238b
    public void d() {
        this.f33924a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f33926c.b();
        try {
            this.f33924a.e();
            try {
                supportSQLiteStatementB.executeUpdateDelete();
                this.f33924a.A();
            } finally {
                this.f33924a.i();
            }
        } finally {
            this.f33926c.h(supportSQLiteStatementB);
        }
    }
}
