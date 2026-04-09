package ac;

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
public final class d extends ac.c {

    /* renamed from: a, reason: collision with root package name */
    private final q f25929a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f25930b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f25931c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `teleportWizardState` (`id`,`dataCollectionApproved`,`consoleSelectedId`,`tunnelPrimaryId`) VALUES (?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, C3784a c3784a) {
            supportSQLiteStatement.bindLong(1, c3784a.e());
            supportSQLiteStatement.bindLong(2, c3784a.d() ? 1L : 0L);
            if (c3784a.c() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c3784a.c());
            }
            if (c3784a.f() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, c3784a.f());
            }
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `teleportWizardState` SET `id` = ?,`dataCollectionApproved` = ?,`consoleSelectedId` = ?,`tunnelPrimaryId` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, C3784a c3784a) {
            supportSQLiteStatement.bindLong(1, c3784a.e());
            supportSQLiteStatement.bindLong(2, c3784a.d() ? 1L : 0L);
            if (c3784a.c() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, c3784a.c());
            }
            if (c3784a.f() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, c3784a.f());
            }
            supportSQLiteStatement.bindLong(5, c3784a.e());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f25934a;

        c(t tVar) {
            this.f25934a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(d.this.f25929a, this.f25934a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "dataCollectionApproved");
                int iD3 = AbstractC7207a.d(cursorB, "consoleSelectedId");
                int iD4 = AbstractC7207a.d(cursorB, "tunnelPrimaryId");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new C3784a(cursorB.getInt(iD), cursorB.getInt(iD2) != 0, cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f25934a.s();
        }
    }

    public d(q qVar) {
        this.f25929a = qVar;
        this.f25930b = new a(qVar);
        this.f25931c = new b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f25929a.e();
        try {
            super.c(interfaceC6824a);
            this.f25929a.A();
        } finally {
            this.f25929a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f25929a, false, new String[]{"teleportWizardState"}, new c(t.j("SELECT * FROM teleportWizardState", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f25929a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f25929a.A();
            return iG;
        } finally {
            this.f25929a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C3784a a() {
        t tVarJ = t.j("SELECT * FROM teleportWizardState LIMIT 1", 0);
        this.f25929a.d();
        C3784a c3784a = null;
        String string = null;
        Cursor cursorB = AbstractC7208b.b(this.f25929a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "dataCollectionApproved");
            int iD3 = AbstractC7207a.d(cursorB, "consoleSelectedId");
            int iD4 = AbstractC7207a.d(cursorB, "tunnelPrimaryId");
            if (cursorB.moveToFirst()) {
                int i10 = cursorB.getInt(iD);
                boolean z10 = cursorB.getInt(iD2) != 0;
                String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                if (!cursorB.isNull(iD4)) {
                    string = cursorB.getString(iD4);
                }
                c3784a = new C3784a(i10, z10, string2, string);
            }
            return c3784a;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(C3784a c3784a) {
        this.f25929a.d();
        this.f25929a.e();
        try {
            long jM = this.f25930b.m(c3784a);
            this.f25929a.A();
            return jM;
        } finally {
            this.f25929a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(C3784a c3784a) {
        this.f25929a.d();
        this.f25929a.e();
        try {
            int iJ = this.f25931c.j(c3784a);
            this.f25929a.A();
            return iJ;
        } finally {
            this.f25929a.i();
        }
    }
}
