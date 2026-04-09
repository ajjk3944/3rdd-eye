package bc;

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

/* renamed from: bc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4083b extends AbstractC4082a {

    /* renamed from: a, reason: collision with root package name */
    private final q f33101a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f33102b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f33103c;

    /* renamed from: bc.b$a */
    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `wizardState` (`id`,`locationHandled`,`localSpeedtestHandled`,`bluetoothScanHandled`,`notifPermHandled`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, C4084c c4084c) {
            supportSQLiteStatement.bindLong(1, c4084c.b());
            if ((c4084c.c() == null ? null : Integer.valueOf(c4084c.c().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, r0.intValue());
            }
            if ((c4084c.e() == null ? null : Integer.valueOf(c4084c.e().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, r0.intValue());
            }
            if ((c4084c.a() == null ? null : Integer.valueOf(c4084c.a().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, r0.intValue());
            }
            if ((c4084c.d() != null ? Integer.valueOf(c4084c.d().booleanValue() ? 1 : 0) : null) == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, r1.intValue());
            }
        }
    }

    /* renamed from: bc.b$b, reason: collision with other inner class name */
    class C1152b extends AbstractC6750h {
        C1152b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `wizardState` SET `id` = ?,`locationHandled` = ?,`localSpeedtestHandled` = ?,`bluetoothScanHandled` = ?,`notifPermHandled` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, C4084c c4084c) {
            supportSQLiteStatement.bindLong(1, c4084c.b());
            if ((c4084c.c() == null ? null : Integer.valueOf(c4084c.c().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, r0.intValue());
            }
            if ((c4084c.e() == null ? null : Integer.valueOf(c4084c.e().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, r0.intValue());
            }
            if ((c4084c.a() == null ? null : Integer.valueOf(c4084c.a().booleanValue() ? 1 : 0)) == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, r0.intValue());
            }
            if ((c4084c.d() != null ? Integer.valueOf(c4084c.d().booleanValue() ? 1 : 0) : null) == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, r1.intValue());
            }
            supportSQLiteStatement.bindLong(6, c4084c.b());
        }
    }

    /* renamed from: bc.b$c */
    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f33106a;

        c(t tVar) {
            this.f33106a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Cursor cursorB = AbstractC7208b.b(C4083b.this.f33101a, this.f33106a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "locationHandled");
                int iD3 = AbstractC7207a.d(cursorB, "localSpeedtestHandled");
                int iD4 = AbstractC7207a.d(cursorB, "bluetoothScanHandled");
                int iD5 = AbstractC7207a.d(cursorB, "notifPermHandled");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    int i10 = cursorB.getInt(iD);
                    Integer numValueOf = cursorB.isNull(iD2) ? null : Integer.valueOf(cursorB.getInt(iD2));
                    boolean z10 = true;
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    Integer numValueOf2 = cursorB.isNull(iD3) ? null : Integer.valueOf(cursorB.getInt(iD3));
                    if (numValueOf2 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    Integer numValueOf3 = cursorB.isNull(iD4) ? null : Integer.valueOf(cursorB.getInt(iD4));
                    if (numValueOf3 == null) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                    }
                    Integer numValueOf4 = cursorB.isNull(iD5) ? null : Integer.valueOf(cursorB.getInt(iD5));
                    if (numValueOf4 == null) {
                        boolValueOf4 = null;
                    } else {
                        if (numValueOf4.intValue() == 0) {
                            z10 = false;
                        }
                        boolValueOf4 = Boolean.valueOf(z10);
                    }
                    arrayList.add(new C4084c(i10, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f33106a.s();
        }
    }

    public C4083b(q qVar) {
        this.f33101a = qVar;
        this.f33102b = new a(qVar);
        this.f33103c = new C1152b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f33101a.e();
        try {
            super.c(interfaceC6824a);
            this.f33101a.A();
        } finally {
            this.f33101a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f33101a, false, new String[]{"wizardState"}, new c(t.j("SELECT * FROM wizardState", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f33101a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f33101a.A();
            return iG;
        } finally {
            this.f33101a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C4084c a() {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        t tVarJ = t.j("SELECT * FROM wizardState LIMIT 1", 0);
        this.f33101a.d();
        C4084c c4084c = null;
        Boolean boolValueOf4 = null;
        Cursor cursorB = AbstractC7208b.b(this.f33101a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "locationHandled");
            int iD3 = AbstractC7207a.d(cursorB, "localSpeedtestHandled");
            int iD4 = AbstractC7207a.d(cursorB, "bluetoothScanHandled");
            int iD5 = AbstractC7207a.d(cursorB, "notifPermHandled");
            if (cursorB.moveToFirst()) {
                int i10 = cursorB.getInt(iD);
                Integer numValueOf = cursorB.isNull(iD2) ? null : Integer.valueOf(cursorB.getInt(iD2));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Integer numValueOf2 = cursorB.isNull(iD3) ? null : Integer.valueOf(cursorB.getInt(iD3));
                if (numValueOf2 == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                Integer numValueOf3 = cursorB.isNull(iD4) ? null : Integer.valueOf(cursorB.getInt(iD4));
                if (numValueOf3 == null) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                }
                Integer numValueOf4 = cursorB.isNull(iD5) ? null : Integer.valueOf(cursorB.getInt(iD5));
                if (numValueOf4 != null) {
                    boolValueOf4 = Boolean.valueOf(numValueOf4.intValue() != 0);
                }
                c4084c = new C4084c(i10, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4);
            }
            return c4084c;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public long d(C4084c c4084c) {
        this.f33101a.d();
        this.f33101a.e();
        try {
            long jM = this.f33102b.m(c4084c);
            this.f33101a.A();
            return jM;
        } finally {
            this.f33101a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(C4084c c4084c) {
        this.f33101a.d();
        this.f33101a.e();
        try {
            int iJ = this.f33103c.j(c4084c);
            this.f33101a.A();
            return iJ;
        } finally {
            this.f33101a.i();
        }
    }
}
