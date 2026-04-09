package Sb;

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
public final class c extends Sb.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f20413a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f20414b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f20415c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `wifiNetworkDetail` (`id`,`sort_type_networks_ap`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Sb.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.a());
            supportSQLiteStatement.bindString(2, aVar.c());
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `wifiNetworkDetail` SET `id` = ?,`sort_type_networks_ap` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Sb.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.a());
            supportSQLiteStatement.bindString(2, aVar.c());
            supportSQLiteStatement.bindLong(3, aVar.a());
        }
    }

    /* renamed from: Sb.c$c, reason: collision with other inner class name */
    class CallableC0736c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f20418a;

        CallableC0736c(t tVar) {
            this.f20418a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(c.this.f20413a, this.f20418a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "sort_type_networks_ap");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Sb.a(cursorB.getInt(iD), cursorB.getString(iD2)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f20418a.s();
        }
    }

    public c(q qVar) {
        this.f20413a = qVar;
        this.f20414b = new a(qVar);
        this.f20415c = new b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f20413a.e();
        try {
            super.c(interfaceC6824a);
            this.f20413a.A();
        } finally {
            this.f20413a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f20413a, false, new String[]{"wifiNetworkDetail"}, new CallableC0736c(t.j("SELECT * FROM wifiNetworkDetail", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f20413a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f20413a.A();
            return iG;
        } finally {
            this.f20413a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Sb.a a() {
        t tVarJ = t.j("SELECT * FROM wifiNetworkDetail LIMIT 1", 0);
        this.f20413a.d();
        Cursor cursorB = AbstractC7208b.b(this.f20413a, tVarJ, false, null);
        try {
            return cursorB.moveToFirst() ? new Sb.a(cursorB.getInt(AbstractC7207a.d(cursorB, "id")), cursorB.getString(AbstractC7207a.d(cursorB, "sort_type_networks_ap"))) : null;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(Sb.a aVar) {
        this.f20413a.d();
        this.f20413a.e();
        try {
            long jM = this.f20414b.m(aVar);
            this.f20413a.A();
            return jM;
        } finally {
            this.f20413a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(Sb.a aVar) {
        this.f20413a.d();
        this.f20413a.e();
        try {
            int iJ = this.f20415c.j(aVar);
            this.f20413a.A();
            return iJ;
        } finally {
            this.f20413a.i();
        }
    }
}
