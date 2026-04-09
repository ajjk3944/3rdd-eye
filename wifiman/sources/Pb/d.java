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
public final class d extends Pb.c {

    /* renamed from: a, reason: collision with root package name */
    private final q f18541a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f18542b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f18543c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `discoveryHome` (`id`,`tab`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, h hVar) {
            supportSQLiteStatement.bindLong(1, hVar.a());
            supportSQLiteStatement.bindString(2, hVar.c());
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `discoveryHome` SET `id` = ?,`tab` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, h hVar) {
            supportSQLiteStatement.bindLong(1, hVar.a());
            supportSQLiteStatement.bindString(2, hVar.c());
            supportSQLiteStatement.bindLong(3, hVar.a());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f18546a;

        c(t tVar) {
            this.f18546a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(d.this.f18541a, this.f18546a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "tab");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new h(cursorB.getInt(iD), cursorB.getString(iD2)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f18546a.s();
        }
    }

    public d(q qVar) {
        this.f18541a = qVar;
        this.f18542b = new a(qVar);
        this.f18543c = new b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f18541a.e();
        try {
            super.c(interfaceC6824a);
            this.f18541a.A();
        } finally {
            this.f18541a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public gg.i e() {
        return AbstractC7061d.d(this.f18541a, false, new String[]{"discoveryHome"}, new c(t.j("SELECT * FROM discoveryHome", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f18541a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f18541a.A();
            return iG;
        } finally {
            this.f18541a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public h a() {
        t tVarJ = t.j("SELECT * FROM discoveryHome LIMIT 1", 0);
        this.f18541a.d();
        Cursor cursorB = AbstractC7208b.b(this.f18541a, tVarJ, false, null);
        try {
            return cursorB.moveToFirst() ? new h(cursorB.getInt(AbstractC7207a.d(cursorB, "id")), cursorB.getString(AbstractC7207a.d(cursorB, "tab"))) : null;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(h hVar) {
        this.f18541a.d();
        this.f18541a.e();
        try {
            long jM = this.f18542b.m(hVar);
            this.f18541a.A();
            return jM;
        } finally {
            this.f18541a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(h hVar) {
        this.f18541a.d();
        this.f18541a.e();
        try {
            int iJ = this.f18543c.j(hVar);
            this.f18541a.A();
            return iJ;
        } finally {
            this.f18541a.i();
        }
    }
}
