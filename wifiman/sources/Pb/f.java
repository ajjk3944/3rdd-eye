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
public final class f extends e {

    /* renamed from: a, reason: collision with root package name */
    private final q f18548a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f18549b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f18550c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `discoveryListUiState` (`id`,`sortType`,`favoritesOnTop`,`ubiquitiOnTop`) VALUES (?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, i iVar) {
            supportSQLiteStatement.bindLong(1, iVar.b());
            supportSQLiteStatement.bindString(2, iVar.d());
            supportSQLiteStatement.bindLong(3, iVar.a() ? 1L : 0L);
            supportSQLiteStatement.bindLong(4, iVar.e() ? 1L : 0L);
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `discoveryListUiState` SET `id` = ?,`sortType` = ?,`favoritesOnTop` = ?,`ubiquitiOnTop` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, i iVar) {
            supportSQLiteStatement.bindLong(1, iVar.b());
            supportSQLiteStatement.bindString(2, iVar.d());
            supportSQLiteStatement.bindLong(3, iVar.a() ? 1L : 0L);
            supportSQLiteStatement.bindLong(4, iVar.e() ? 1L : 0L);
            supportSQLiteStatement.bindLong(5, iVar.b());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f18553a;

        c(t tVar) {
            this.f18553a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(f.this.f18548a, this.f18553a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "sortType");
                int iD3 = AbstractC7207a.d(cursorB, "favoritesOnTop");
                int iD4 = AbstractC7207a.d(cursorB, "ubiquitiOnTop");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    int i10 = cursorB.getInt(iD);
                    String string = cursorB.getString(iD2);
                    boolean z10 = true;
                    boolean z11 = cursorB.getInt(iD3) != 0;
                    if (cursorB.getInt(iD4) == 0) {
                        z10 = false;
                    }
                    arrayList.add(new i(i10, string, z11, z10));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f18553a.s();
        }
    }

    public f(q qVar) {
        this.f18548a = qVar;
        this.f18549b = new a(qVar);
        this.f18550c = new b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f18548a.e();
        try {
            super.c(interfaceC6824a);
            this.f18548a.A();
        } finally {
            this.f18548a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public gg.i e() {
        return AbstractC7061d.d(this.f18548a, false, new String[]{"discoveryListUiState"}, new c(t.j("SELECT * FROM discoveryListUiState", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f18548a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f18548a.A();
            return iG;
        } finally {
            this.f18548a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public i a() {
        t tVarJ = t.j("SELECT * FROM discoveryListUiState LIMIT 1", 0);
        this.f18548a.d();
        i iVar = null;
        Cursor cursorB = AbstractC7208b.b(this.f18548a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "sortType");
            int iD3 = AbstractC7207a.d(cursorB, "favoritesOnTop");
            int iD4 = AbstractC7207a.d(cursorB, "ubiquitiOnTop");
            if (cursorB.moveToFirst()) {
                iVar = new i(cursorB.getInt(iD), cursorB.getString(iD2), cursorB.getInt(iD3) != 0, cursorB.getInt(iD4) != 0);
            }
            return iVar;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(i iVar) {
        this.f18548a.d();
        this.f18548a.e();
        try {
            long jM = this.f18549b.m(iVar);
            this.f18548a.A();
            return jM;
        } finally {
            this.f18548a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(i iVar) {
        this.f18548a.d();
        this.f18548a.e();
        try {
            int iJ = this.f18550c.j(iVar);
            this.f18548a.A();
            return iJ;
        } finally {
            this.f18548a.i();
        }
    }
}
