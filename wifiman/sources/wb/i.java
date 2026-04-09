package Wb;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteStatement;
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
public final class i extends h {

    /* renamed from: a, reason: collision with root package name */
    private final q f23833a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f23834b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f23835c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `signalMapperUiState` (`id`,`tutorialShown`,`section`,`signalType`,`tab`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, e eVar) {
            supportSQLiteStatement.bindLong(1, eVar.a());
            supportSQLiteStatement.bindLong(2, eVar.h() ? 1L : 0L);
            supportSQLiteStatement.bindString(3, eVar.c());
            supportSQLiteStatement.bindString(4, eVar.e());
            supportSQLiteStatement.bindString(5, eVar.g());
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `signalMapperUiState` SET `id` = ?,`tutorialShown` = ?,`section` = ?,`signalType` = ?,`tab` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, e eVar) {
            supportSQLiteStatement.bindLong(1, eVar.a());
            supportSQLiteStatement.bindLong(2, eVar.h() ? 1L : 0L);
            supportSQLiteStatement.bindString(3, eVar.c());
            supportSQLiteStatement.bindString(4, eVar.e());
            supportSQLiteStatement.bindString(5, eVar.g());
            supportSQLiteStatement.bindLong(6, eVar.a());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23838a;

        c(t tVar) {
            this.f23838a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(i.this.f23833a, this.f23838a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "tutorialShown");
                int iD3 = AbstractC7207a.d(cursorB, "section");
                int iD4 = AbstractC7207a.d(cursorB, "signalType");
                int iD5 = AbstractC7207a.d(cursorB, "tab");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new e(cursorB.getInt(iD), cursorB.getInt(iD2) != 0, cursorB.getString(iD3), cursorB.getString(iD4), cursorB.getString(iD5)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23838a.s();
        }
    }

    public i(q qVar) {
        this.f23833a = qVar;
        this.f23834b = new a(qVar);
        this.f23835c = new b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f23833a.e();
        try {
            super.c(interfaceC6824a);
            this.f23833a.A();
        } finally {
            this.f23833a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public gg.i e() {
        return AbstractC7061d.d(this.f23833a, false, new String[]{"signalMapperUiState"}, new c(t.j("SELECT * FROM signalMapperUiState", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f23833a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f23833a.A();
            return iG;
        } finally {
            this.f23833a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e a() {
        t tVarJ = t.j("SELECT * FROM signalMapperUiState LIMIT 1", 0);
        this.f23833a.d();
        e eVar = null;
        Cursor cursorB = AbstractC7208b.b(this.f23833a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "tutorialShown");
            int iD3 = AbstractC7207a.d(cursorB, "section");
            int iD4 = AbstractC7207a.d(cursorB, "signalType");
            int iD5 = AbstractC7207a.d(cursorB, "tab");
            if (cursorB.moveToFirst()) {
                eVar = new e(cursorB.getInt(iD), cursorB.getInt(iD2) != 0, cursorB.getString(iD3), cursorB.getString(iD4), cursorB.getString(iD5));
            }
            return eVar;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(e eVar) {
        this.f23833a.d();
        this.f23833a.e();
        try {
            long jM = this.f23834b.m(eVar);
            this.f23833a.A();
            return jM;
        } finally {
            this.f23833a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(e eVar) {
        this.f23833a.d();
        this.f23833a.e();
        try {
            int iJ = this.f23835c.j(eVar);
            this.f23833a.A();
            return iJ;
        } finally {
            this.f23833a.i();
        }
    }
}
