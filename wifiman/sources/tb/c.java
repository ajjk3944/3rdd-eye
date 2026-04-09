package Tb;

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
public final class c extends Tb.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f21544a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f21545b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f21546c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `wifiScan` (`id`,`chart_spectrum`,`sort_type`,`sort_type_quality`,`scan_feature`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Tb.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.a());
            supportSQLiteStatement.bindString(2, aVar.i());
            supportSQLiteStatement.bindString(3, aVar.g());
            supportSQLiteStatement.bindString(4, aVar.e());
            supportSQLiteStatement.bindString(5, aVar.c());
        }
    }

    class b extends AbstractC6750h {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `wifiScan` SET `id` = ?,`chart_spectrum` = ?,`sort_type` = ?,`sort_type_quality` = ?,`scan_feature` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Tb.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.a());
            supportSQLiteStatement.bindString(2, aVar.i());
            supportSQLiteStatement.bindString(3, aVar.g());
            supportSQLiteStatement.bindString(4, aVar.e());
            supportSQLiteStatement.bindString(5, aVar.c());
            supportSQLiteStatement.bindLong(6, aVar.a());
        }
    }

    /* renamed from: Tb.c$c, reason: collision with other inner class name */
    class CallableC0793c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f21549a;

        CallableC0793c(t tVar) {
            this.f21549a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(c.this.f21544a, this.f21549a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "chart_spectrum");
                int iD3 = AbstractC7207a.d(cursorB, "sort_type");
                int iD4 = AbstractC7207a.d(cursorB, "sort_type_quality");
                int iD5 = AbstractC7207a.d(cursorB, "scan_feature");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Tb.a(cursorB.getInt(iD), cursorB.getString(iD2), cursorB.getString(iD3), cursorB.getString(iD4), cursorB.getString(iD5)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f21549a.s();
        }
    }

    public c(q qVar) {
        this.f21544a = qVar;
        this.f21545b = new a(qVar);
        this.f21546c = new b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f21544a.e();
        try {
            super.c(interfaceC6824a);
            this.f21544a.A();
        } finally {
            this.f21544a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f21544a, false, new String[]{"wifiScan"}, new CallableC0793c(t.j("SELECT * FROM wifiScan", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f21544a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f21544a.A();
            return iG;
        } finally {
            this.f21544a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Tb.a a() {
        t tVarJ = t.j("SELECT * FROM wifiScan LIMIT 1", 0);
        this.f21544a.d();
        Cursor cursorB = AbstractC7208b.b(this.f21544a, tVarJ, false, null);
        try {
            return cursorB.moveToFirst() ? new Tb.a(cursorB.getInt(AbstractC7207a.d(cursorB, "id")), cursorB.getString(AbstractC7207a.d(cursorB, "chart_spectrum")), cursorB.getString(AbstractC7207a.d(cursorB, "sort_type")), cursorB.getString(AbstractC7207a.d(cursorB, "sort_type_quality")), cursorB.getString(AbstractC7207a.d(cursorB, "scan_feature"))) : null;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(Tb.a aVar) {
        this.f21544a.d();
        this.f21544a.e();
        try {
            long jM = this.f21545b.m(aVar);
            this.f21544a.A();
            return jM;
        } finally {
            this.f21544a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(Tb.a aVar) {
        this.f21544a.d();
        this.f21544a.e();
        try {
            int iJ = this.f21546c.j(aVar);
            this.f21544a.A();
            return iJ;
        } finally {
            this.f21544a.i();
        }
    }
}
