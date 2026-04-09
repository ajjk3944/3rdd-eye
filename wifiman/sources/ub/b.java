package Ub;

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
public final class b extends Ub.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f22320a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f22321b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f22322c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `session` (`id`,`sessionID`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Ub.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.a());
            supportSQLiteStatement.bindString(2, cVar.b());
        }
    }

    /* renamed from: Ub.b$b, reason: collision with other inner class name */
    class C0827b extends AbstractC6750h {
        C0827b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `session` SET `id` = ?,`sessionID` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Ub.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.a());
            supportSQLiteStatement.bindString(2, cVar.b());
            supportSQLiteStatement.bindLong(3, cVar.a());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f22325a;

        c(t tVar) {
            this.f22325a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f22320a, this.f22325a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "sessionID");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Ub.c(cursorB.getInt(iD), cursorB.getString(iD2)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f22325a.s();
        }
    }

    public b(q qVar) {
        this.f22320a = qVar;
        this.f22321b = new a(qVar);
        this.f22322c = new C0827b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f22320a.e();
        try {
            super.c(interfaceC6824a);
            this.f22320a.A();
        } finally {
            this.f22320a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f22320a, false, new String[]{"session"}, new c(t.j("SELECT * FROM session", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f22320a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f22320a.A();
            return iG;
        } finally {
            this.f22320a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Ub.c a() {
        t tVarJ = t.j("SELECT * FROM session LIMIT 1", 0);
        this.f22320a.d();
        Cursor cursorB = AbstractC7208b.b(this.f22320a, tVarJ, false, null);
        try {
            return cursorB.moveToFirst() ? new Ub.c(cursorB.getInt(AbstractC7207a.d(cursorB, "id")), cursorB.getString(AbstractC7207a.d(cursorB, "sessionID"))) : null;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(Ub.c cVar) {
        this.f22320a.d();
        this.f22320a.e();
        try {
            long jM = this.f22321b.m(cVar);
            this.f22320a.A();
            return jM;
        } finally {
            this.f22320a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(Ub.c cVar) {
        this.f22320a.d();
        this.f22320a.e();
        try {
            int iJ = this.f22322c.j(cVar);
            this.f22320a.A();
            return iJ;
        } finally {
            this.f22320a.i();
        }
    }
}
