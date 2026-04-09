package Nb;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ui.wifiman.db.A;
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
public final class b extends Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f16334a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f16335b;

    /* renamed from: c, reason: collision with root package name */
    private final A f16336c = new A();

    /* renamed from: d, reason: collision with root package name */
    private final w f16337d;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR REPLACE INTO `directConsoleConnectionPopup` (`consoleId`,`recommended`,`cert`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Nb.c cVar) {
            supportSQLiteStatement.bindString(1, cVar.b());
            supportSQLiteStatement.bindLong(2, cVar.c() ? 1L : 0L);
            String strD = b.this.f16336c.d(cVar.a());
            if (strD == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, strD);
            }
        }
    }

    /* renamed from: Nb.b$b, reason: collision with other inner class name */
    class C0590b extends w {
        C0590b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "UPDATE directConsoleConnectionPopup SET recommended = ? WHERE consoleId = ?";
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f16340a;

        c(t tVar) {
            this.f16340a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f16334a, this.f16340a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "consoleId");
                int iD2 = AbstractC7207a.d(cursorB, "recommended");
                int iD3 = AbstractC7207a.d(cursorB, "cert");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Nb.c(cursorB.getString(iD), cursorB.getInt(iD2) != 0, b.this.f16336c.c(cursorB.isNull(iD3) ? null : cursorB.getString(iD3))));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f16340a.s();
        }
    }

    public b(q qVar) {
        this.f16334a = qVar;
        this.f16335b = new a(qVar);
        this.f16337d = new C0590b(qVar);
    }

    public static List i() {
        return Collections.emptyList();
    }

    @Override // Nb.a
    public void a(Nb.c cVar) {
        this.f16334a.d();
        this.f16334a.e();
        try {
            this.f16335b.k(cVar);
            this.f16334a.A();
        } finally {
            this.f16334a.i();
        }
    }

    @Override // Nb.a
    public i b(String str) {
        t tVarJ = t.j("SELECT * FROM directConsoleConnectionPopup WHERE consoleId = ?", 1);
        tVarJ.bindString(1, str);
        return AbstractC7061d.d(this.f16334a, false, new String[]{"directConsoleConnectionPopup"}, new c(tVarJ));
    }

    @Override // Nb.a
    public void d(String str, boolean z10) {
        this.f16334a.e();
        try {
            super.d(str, z10);
            this.f16334a.A();
        } finally {
            this.f16334a.i();
        }
    }

    @Override // Nb.a
    public int e(String str, boolean z10) {
        this.f16334a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f16337d.b();
        supportSQLiteStatementB.bindLong(1, z10 ? 1L : 0L);
        supportSQLiteStatementB.bindString(2, str);
        try {
            this.f16334a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f16334a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f16334a.i();
            }
        } finally {
            this.f16337d.h(supportSQLiteStatementB);
        }
    }
}
