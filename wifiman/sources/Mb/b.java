package Mb;

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
public final class b extends Mb.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f13074a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f13075b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f13076c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `appReviewState` (`id`,`appLaunchedInDays`,`lastAppLaunchedTimestamp`,`appReviewFlowDisplayed`) VALUES (?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Mb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.e());
            supportSQLiteStatement.bindLong(2, cVar.c());
            if (cVar.f() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, cVar.f().longValue());
            }
            supportSQLiteStatement.bindLong(4, cVar.d() ? 1L : 0L);
        }
    }

    /* renamed from: Mb.b$b, reason: collision with other inner class name */
    class C0513b extends AbstractC6750h {
        C0513b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `appReviewState` SET `id` = ?,`appLaunchedInDays` = ?,`lastAppLaunchedTimestamp` = ?,`appReviewFlowDisplayed` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Mb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.e());
            supportSQLiteStatement.bindLong(2, cVar.c());
            if (cVar.f() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, cVar.f().longValue());
            }
            supportSQLiteStatement.bindLong(4, cVar.d() ? 1L : 0L);
            supportSQLiteStatement.bindLong(5, cVar.e());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f13079a;

        c(t tVar) {
            this.f13079a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f13074a, this.f13079a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "appLaunchedInDays");
                int iD3 = AbstractC7207a.d(cursorB, "lastAppLaunchedTimestamp");
                int iD4 = AbstractC7207a.d(cursorB, "appReviewFlowDisplayed");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Mb.c(cursorB.getInt(iD), cursorB.getInt(iD2), cursorB.isNull(iD3) ? null : Long.valueOf(cursorB.getLong(iD3)), cursorB.getInt(iD4) != 0));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f13079a.s();
        }
    }

    public b(q qVar) {
        this.f13074a = qVar;
        this.f13075b = new a(qVar);
        this.f13076c = new C0513b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f13074a.e();
        try {
            super.c(interfaceC6824a);
            this.f13074a.A();
        } finally {
            this.f13074a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f13074a, false, new String[]{"appReviewState"}, new c(t.j("SELECT * FROM appReviewState", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f13074a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f13074a.A();
            return iG;
        } finally {
            this.f13074a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Mb.c a() {
        t tVarJ = t.j("SELECT * FROM appReviewState LIMIT 1", 0);
        this.f13074a.d();
        Mb.c cVar = null;
        Long lValueOf = null;
        Cursor cursorB = AbstractC7208b.b(this.f13074a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "appLaunchedInDays");
            int iD3 = AbstractC7207a.d(cursorB, "lastAppLaunchedTimestamp");
            int iD4 = AbstractC7207a.d(cursorB, "appReviewFlowDisplayed");
            if (cursorB.moveToFirst()) {
                int i10 = cursorB.getInt(iD);
                int i11 = cursorB.getInt(iD2);
                if (!cursorB.isNull(iD3)) {
                    lValueOf = Long.valueOf(cursorB.getLong(iD3));
                }
                cVar = new Mb.c(i10, i11, lValueOf, cursorB.getInt(iD4) != 0);
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
    public long d(Mb.c cVar) {
        this.f13074a.d();
        this.f13074a.e();
        try {
            long jM = this.f13075b.m(cVar);
            this.f13074a.A();
            return jM;
        } finally {
            this.f13074a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(Mb.c cVar) {
        this.f13074a.d();
        this.f13074a.e();
        try {
            int iJ = this.f13076c.j(cVar);
            this.f13074a.A();
            return iJ;
        } finally {
            this.f13074a.i();
        }
    }
}
