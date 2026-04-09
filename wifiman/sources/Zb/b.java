package Zb;

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
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o2.AbstractC7061d;
import p2.AbstractC7207a;
import p2.AbstractC7208b;

/* loaded from: classes3.dex */
public final class b extends Zb.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f25257a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f25258b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f25259c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `speedtestSettings` (`id`,`uispReportEnabled`,`advancedTestEnabled`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Zb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.b());
            supportSQLiteStatement.bindLong(2, cVar.c() ? 1L : 0L);
            supportSQLiteStatement.bindLong(3, cVar.a() ? 1L : 0L);
        }
    }

    /* renamed from: Zb.b$b, reason: collision with other inner class name */
    class C0971b extends AbstractC6750h {
        C0971b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `speedtestSettings` SET `id` = ?,`uispReportEnabled` = ?,`advancedTestEnabled` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Zb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.b());
            supportSQLiteStatement.bindLong(2, cVar.c() ? 1L : 0L);
            supportSQLiteStatement.bindLong(3, cVar.a() ? 1L : 0L);
            supportSQLiteStatement.bindLong(4, cVar.b());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f25262a;

        c(t tVar) {
            this.f25262a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f25257a, this.f25262a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "uispReportEnabled");
                int iD3 = AbstractC7207a.d(cursorB, "advancedTestEnabled");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    int i10 = cursorB.getInt(iD);
                    boolean z10 = true;
                    boolean z11 = cursorB.getInt(iD2) != 0;
                    if (cursorB.getInt(iD3) == 0) {
                        z10 = false;
                    }
                    arrayList.add(new Zb.c(i10, z11, z10));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f25262a.s();
        }
    }

    public b(q qVar) {
        this.f25257a = qVar;
        this.f25258b = new a(qVar);
        this.f25259c = new C0971b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f25257a.e();
        try {
            super.c(interfaceC6824a);
            this.f25257a.A();
        } finally {
            this.f25257a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f25257a, false, new String[]{"speedtestSettings"}, new c(t.j("SELECT * FROM speedtestSettings", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f25257a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f25257a.A();
            return iG;
        } finally {
            this.f25257a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Zb.c a() {
        t tVarJ = t.j("SELECT * FROM speedtestSettings LIMIT 1", 0);
        this.f25257a.d();
        Zb.c cVar = null;
        Cursor cursorB = AbstractC7208b.b(this.f25257a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "uispReportEnabled");
            int iD3 = AbstractC7207a.d(cursorB, "advancedTestEnabled");
            if (cursorB.moveToFirst()) {
                cVar = new Zb.c(cursorB.getInt(iD), cursorB.getInt(iD2) != 0, cursorB.getInt(iD3) != 0);
            }
            return cVar;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(Zb.c cVar) {
        this.f25257a.d();
        this.f25257a.e();
        try {
            long jM = this.f25258b.m(cVar);
            this.f25257a.A();
            return jM;
        } finally {
            this.f25257a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(Zb.c cVar) {
        this.f25257a.d();
        this.f25257a.e();
        try {
            int iJ = this.f25259c.j(cVar);
            this.f25257a.A();
            return iJ;
        } finally {
            this.f25257a.i();
        }
    }
}
