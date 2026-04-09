package Pb;

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
public final class b extends Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f18534a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f18535b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f18536c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `bluetoothListUiState` (`id`,`connectedOnTop`,`ubiquitiGrouped`,`sort_type`) VALUES (?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, g gVar) {
            supportSQLiteStatement.bindLong(1, gVar.b());
            supportSQLiteStatement.bindLong(2, gVar.a() ? 1L : 0L);
            supportSQLiteStatement.bindLong(3, gVar.e() ? 1L : 0L);
            supportSQLiteStatement.bindString(4, gVar.d());
        }
    }

    /* renamed from: Pb.b$b, reason: collision with other inner class name */
    class C0653b extends AbstractC6750h {
        C0653b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `bluetoothListUiState` SET `id` = ?,`connectedOnTop` = ?,`ubiquitiGrouped` = ?,`sort_type` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, g gVar) {
            supportSQLiteStatement.bindLong(1, gVar.b());
            supportSQLiteStatement.bindLong(2, gVar.a() ? 1L : 0L);
            supportSQLiteStatement.bindLong(3, gVar.e() ? 1L : 0L);
            supportSQLiteStatement.bindString(4, gVar.d());
            supportSQLiteStatement.bindLong(5, gVar.b());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f18539a;

        c(t tVar) {
            this.f18539a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f18534a, this.f18539a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "connectedOnTop");
                int iD3 = AbstractC7207a.d(cursorB, "ubiquitiGrouped");
                int iD4 = AbstractC7207a.d(cursorB, "sort_type");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    int i10 = cursorB.getInt(iD);
                    boolean z10 = true;
                    boolean z11 = cursorB.getInt(iD2) != 0;
                    if (cursorB.getInt(iD3) == 0) {
                        z10 = false;
                    }
                    arrayList.add(new g(i10, z11, z10, cursorB.getString(iD4)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f18539a.s();
        }
    }

    public b(q qVar) {
        this.f18534a = qVar;
        this.f18535b = new a(qVar);
        this.f18536c = new C0653b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f18534a.e();
        try {
            super.c(interfaceC6824a);
            this.f18534a.A();
        } finally {
            this.f18534a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public gg.i e() {
        return AbstractC7061d.d(this.f18534a, false, new String[]{"bluetoothListUiState"}, new c(t.j("SELECT * FROM bluetoothListUiState", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f18534a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f18534a.A();
            return iG;
        } finally {
            this.f18534a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g a() {
        t tVarJ = t.j("SELECT * FROM bluetoothListUiState LIMIT 1", 0);
        this.f18534a.d();
        g gVar = null;
        Cursor cursorB = AbstractC7208b.b(this.f18534a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "connectedOnTop");
            int iD3 = AbstractC7207a.d(cursorB, "ubiquitiGrouped");
            int iD4 = AbstractC7207a.d(cursorB, "sort_type");
            if (cursorB.moveToFirst()) {
                gVar = new g(cursorB.getInt(iD), cursorB.getInt(iD2) != 0, cursorB.getInt(iD3) != 0, cursorB.getString(iD4));
            }
            return gVar;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(g gVar) {
        this.f18534a.d();
        this.f18534a.e();
        try {
            long jM = this.f18535b.m(gVar);
            this.f18534a.A();
            return jM;
        } finally {
            this.f18534a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(g gVar) {
        this.f18534a.d();
        this.f18534a.e();
        try {
            int iJ = this.f18536c.j(gVar);
            this.f18534a.A();
            return iJ;
        } finally {
            this.f18534a.i();
        }
    }
}
