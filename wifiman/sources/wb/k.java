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
import m2.w;
import o2.AbstractC7061d;
import p2.AbstractC7207a;
import p2.AbstractC7208b;

/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final q f23840a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f23841b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6751i f23842c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6750h f23843d;

    /* renamed from: e, reason: collision with root package name */
    private final w f23844e;

    /* renamed from: f, reason: collision with root package name */
    private final w f23845f;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `signalMapperPlaces` (`id`,`name`,`ssid`,`bssid`,`apName`,`apModel`,`signal`,`throughput`,`latency`,`latencyDns`,`packetLoss`,`wifiBand`,`ieeeMode`,`created`,`signalCellSimPrimaryIndex`,`signalCellSim0`,`signalCellSim0Type`,`signalCellSim1`,`signalCellSim1Type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Wb.f fVar) {
            supportSQLiteStatement.bindLong(1, fVar.f());
            supportSQLiteStatement.bindString(2, fVar.j());
            if (fVar.r() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, fVar.r());
            }
            if (fVar.c() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, fVar.c());
            }
            if (fVar.b() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, fVar.b());
            }
            if (fVar.a() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, fVar.a());
            }
            if (fVar.p() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, fVar.p().intValue());
            }
            if (fVar.s() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, fVar.s().longValue());
            }
            if (fVar.i() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, fVar.i().intValue());
            }
            if (fVar.e() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindLong(10, fVar.e().intValue());
            }
            if (fVar.k() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindLong(11, fVar.k().intValue());
            }
            if (fVar.u() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, fVar.u());
            }
            if (fVar.h() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, fVar.h());
            }
            supportSQLiteStatement.bindLong(14, fVar.d());
            if (fVar.q() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindLong(15, fVar.q().intValue());
            }
            if (fVar.l() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindLong(16, fVar.l().intValue());
            }
            if (fVar.m() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, fVar.m());
            }
            if (fVar.n() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindLong(18, fVar.n().intValue());
            }
            if (fVar.o() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, fVar.o());
            }
        }
    }

    class b extends AbstractC6751i {
        b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `signalMapperPlaceName` (`name`,`created`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Wb.g gVar) {
            supportSQLiteStatement.bindString(1, gVar.b());
            supportSQLiteStatement.bindLong(2, gVar.a());
        }
    }

    class c extends AbstractC6750h {
        c(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `signalMapperPlaceName` SET `name` = ?,`created` = ? WHERE `name` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Wb.g gVar) {
            supportSQLiteStatement.bindString(1, gVar.b());
            supportSQLiteStatement.bindLong(2, gVar.a());
            supportSQLiteStatement.bindString(3, gVar.b());
        }
    }

    class d extends w {
        d(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM signalMapperPlaces WHERE id in (?)";
        }
    }

    class e extends w {
        e(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        public String e() {
            return "DELETE FROM signalMapperPlaceName WHERE name not in (SELECT name FROM signalMapperPlaceName ORDER BY created DESC LIMIT 10)";
        }
    }

    class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23851a;

        f(t tVar) {
            this.f23851a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i10;
            Integer numValueOf;
            int i11;
            Integer numValueOf2;
            int i12;
            String string2;
            int i13;
            Integer numValueOf3;
            int i14;
            String string3;
            Cursor cursorB = AbstractC7208b.b(k.this.f23840a, this.f23851a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "name");
                int iD3 = AbstractC7207a.d(cursorB, "ssid");
                int iD4 = AbstractC7207a.d(cursorB, "bssid");
                int iD5 = AbstractC7207a.d(cursorB, "apName");
                int iD6 = AbstractC7207a.d(cursorB, "apModel");
                int iD7 = AbstractC7207a.d(cursorB, "signal");
                int iD8 = AbstractC7207a.d(cursorB, "throughput");
                int iD9 = AbstractC7207a.d(cursorB, "latency");
                int iD10 = AbstractC7207a.d(cursorB, "latencyDns");
                int iD11 = AbstractC7207a.d(cursorB, "packetLoss");
                int iD12 = AbstractC7207a.d(cursorB, "wifiBand");
                int iD13 = AbstractC7207a.d(cursorB, "ieeeMode");
                int iD14 = AbstractC7207a.d(cursorB, "created");
                int iD15 = AbstractC7207a.d(cursorB, "signalCellSimPrimaryIndex");
                int iD16 = AbstractC7207a.d(cursorB, "signalCellSim0");
                int iD17 = AbstractC7207a.d(cursorB, "signalCellSim0Type");
                int iD18 = AbstractC7207a.d(cursorB, "signalCellSim1");
                int iD19 = AbstractC7207a.d(cursorB, "signalCellSim1Type");
                int i15 = iD14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    long j10 = cursorB.getLong(iD);
                    String string4 = cursorB.getString(iD2);
                    String string5 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string6 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    String string7 = cursorB.isNull(iD5) ? null : cursorB.getString(iD5);
                    String string8 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                    Integer numValueOf4 = cursorB.isNull(iD7) ? null : Integer.valueOf(cursorB.getInt(iD7));
                    Long lValueOf = cursorB.isNull(iD8) ? null : Long.valueOf(cursorB.getLong(iD8));
                    Integer numValueOf5 = cursorB.isNull(iD9) ? null : Integer.valueOf(cursorB.getInt(iD9));
                    Integer numValueOf6 = cursorB.isNull(iD10) ? null : Integer.valueOf(cursorB.getInt(iD10));
                    Integer numValueOf7 = cursorB.isNull(iD11) ? null : Integer.valueOf(cursorB.getInt(iD11));
                    String string9 = cursorB.isNull(iD12) ? null : cursorB.getString(iD12);
                    if (cursorB.isNull(iD13)) {
                        i10 = i15;
                        string = null;
                    } else {
                        string = cursorB.getString(iD13);
                        i10 = i15;
                    }
                    long j11 = cursorB.getLong(i10);
                    int i16 = iD;
                    int i17 = iD15;
                    if (cursorB.isNull(i17)) {
                        iD15 = i17;
                        i11 = iD16;
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(cursorB.getInt(i17));
                        iD15 = i17;
                        i11 = iD16;
                    }
                    if (cursorB.isNull(i11)) {
                        iD16 = i11;
                        i12 = iD17;
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(cursorB.getInt(i11));
                        iD16 = i11;
                        i12 = iD17;
                    }
                    if (cursorB.isNull(i12)) {
                        iD17 = i12;
                        i13 = iD18;
                        string2 = null;
                    } else {
                        string2 = cursorB.getString(i12);
                        iD17 = i12;
                        i13 = iD18;
                    }
                    if (cursorB.isNull(i13)) {
                        iD18 = i13;
                        i14 = iD19;
                        numValueOf3 = null;
                    } else {
                        numValueOf3 = Integer.valueOf(cursorB.getInt(i13));
                        iD18 = i13;
                        i14 = iD19;
                    }
                    if (cursorB.isNull(i14)) {
                        iD19 = i14;
                        string3 = null;
                    } else {
                        string3 = cursorB.getString(i14);
                        iD19 = i14;
                    }
                    arrayList.add(new Wb.f(j10, string4, string5, string6, string7, string8, numValueOf4, lValueOf, numValueOf5, numValueOf6, numValueOf7, string9, string, j11, numValueOf, numValueOf2, string2, numValueOf3, string3));
                    iD = i16;
                    i15 = i10;
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23851a.s();
        }
    }

    class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23853a;

        g(t tVar) {
            this.f23853a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i10;
            Integer numValueOf;
            int i11;
            Integer numValueOf2;
            int i12;
            String string2;
            int i13;
            Integer numValueOf3;
            int i14;
            String string3;
            Cursor cursorB = AbstractC7208b.b(k.this.f23840a, this.f23853a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "name");
                int iD3 = AbstractC7207a.d(cursorB, "ssid");
                int iD4 = AbstractC7207a.d(cursorB, "bssid");
                int iD5 = AbstractC7207a.d(cursorB, "apName");
                int iD6 = AbstractC7207a.d(cursorB, "apModel");
                int iD7 = AbstractC7207a.d(cursorB, "signal");
                int iD8 = AbstractC7207a.d(cursorB, "throughput");
                int iD9 = AbstractC7207a.d(cursorB, "latency");
                int iD10 = AbstractC7207a.d(cursorB, "latencyDns");
                int iD11 = AbstractC7207a.d(cursorB, "packetLoss");
                int iD12 = AbstractC7207a.d(cursorB, "wifiBand");
                int iD13 = AbstractC7207a.d(cursorB, "ieeeMode");
                int iD14 = AbstractC7207a.d(cursorB, "created");
                int iD15 = AbstractC7207a.d(cursorB, "signalCellSimPrimaryIndex");
                int iD16 = AbstractC7207a.d(cursorB, "signalCellSim0");
                int iD17 = AbstractC7207a.d(cursorB, "signalCellSim0Type");
                int iD18 = AbstractC7207a.d(cursorB, "signalCellSim1");
                int iD19 = AbstractC7207a.d(cursorB, "signalCellSim1Type");
                int i15 = iD14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    long j10 = cursorB.getLong(iD);
                    String string4 = cursorB.getString(iD2);
                    String string5 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string6 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    String string7 = cursorB.isNull(iD5) ? null : cursorB.getString(iD5);
                    String string8 = cursorB.isNull(iD6) ? null : cursorB.getString(iD6);
                    Integer numValueOf4 = cursorB.isNull(iD7) ? null : Integer.valueOf(cursorB.getInt(iD7));
                    Long lValueOf = cursorB.isNull(iD8) ? null : Long.valueOf(cursorB.getLong(iD8));
                    Integer numValueOf5 = cursorB.isNull(iD9) ? null : Integer.valueOf(cursorB.getInt(iD9));
                    Integer numValueOf6 = cursorB.isNull(iD10) ? null : Integer.valueOf(cursorB.getInt(iD10));
                    Integer numValueOf7 = cursorB.isNull(iD11) ? null : Integer.valueOf(cursorB.getInt(iD11));
                    String string9 = cursorB.isNull(iD12) ? null : cursorB.getString(iD12);
                    if (cursorB.isNull(iD13)) {
                        i10 = i15;
                        string = null;
                    } else {
                        string = cursorB.getString(iD13);
                        i10 = i15;
                    }
                    long j11 = cursorB.getLong(i10);
                    int i16 = iD;
                    int i17 = iD15;
                    if (cursorB.isNull(i17)) {
                        iD15 = i17;
                        i11 = iD16;
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(cursorB.getInt(i17));
                        iD15 = i17;
                        i11 = iD16;
                    }
                    if (cursorB.isNull(i11)) {
                        iD16 = i11;
                        i12 = iD17;
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(cursorB.getInt(i11));
                        iD16 = i11;
                        i12 = iD17;
                    }
                    if (cursorB.isNull(i12)) {
                        iD17 = i12;
                        i13 = iD18;
                        string2 = null;
                    } else {
                        string2 = cursorB.getString(i12);
                        iD17 = i12;
                        i13 = iD18;
                    }
                    if (cursorB.isNull(i13)) {
                        iD18 = i13;
                        i14 = iD19;
                        numValueOf3 = null;
                    } else {
                        numValueOf3 = Integer.valueOf(cursorB.getInt(i13));
                        iD18 = i13;
                        i14 = iD19;
                    }
                    if (cursorB.isNull(i14)) {
                        iD19 = i14;
                        string3 = null;
                    } else {
                        string3 = cursorB.getString(i14);
                        iD19 = i14;
                    }
                    arrayList.add(new Wb.f(j10, string4, string5, string6, string7, string8, numValueOf4, lValueOf, numValueOf5, numValueOf6, numValueOf7, string9, string, j11, numValueOf, numValueOf2, string2, numValueOf3, string3));
                    iD = i16;
                    i15 = i10;
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23853a.s();
        }
    }

    class h implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23855a;

        h(t tVar) {
            this.f23855a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(k.this.f23840a, this.f23855a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "name");
                int iD2 = AbstractC7207a.d(cursorB, "created");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Wb.g(cursorB.getString(iD), cursorB.getLong(iD2)));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23855a.s();
        }
    }

    public k(q qVar) {
        this.f23840a = qVar;
        this.f23841b = new a(qVar);
        this.f23842c = new b(qVar);
        this.f23843d = new c(qVar);
        this.f23844e = new d(qVar);
        this.f23845f = new e(qVar);
    }

    public static List k() {
        return Collections.emptyList();
    }

    @Override // Wb.j
    public int a(String str) {
        this.f23840a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f23844e.b();
        supportSQLiteStatementB.bindString(1, str);
        try {
            this.f23840a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f23840a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f23840a.i();
            }
        } finally {
            this.f23844e.h(supportSQLiteStatementB);
        }
    }

    @Override // Wb.j
    public int b(Wb.g gVar) {
        this.f23840a.d();
        this.f23840a.e();
        try {
            int iJ = this.f23843d.j(gVar);
            this.f23840a.A();
            return iJ;
        } finally {
            this.f23840a.i();
        }
    }

    @Override // Wb.j
    public long c(Wb.f fVar) {
        this.f23840a.d();
        this.f23840a.e();
        try {
            long jM = this.f23841b.m(fVar);
            this.f23840a.A();
            return jM;
        } finally {
            this.f23840a.i();
        }
    }

    @Override // Wb.j
    public gg.i d(long j10) {
        t tVarJ = t.j("SELECT * FROM signalMapperPlaces WHERE id = ?", 1);
        tVarJ.bindLong(1, j10);
        return AbstractC7061d.d(this.f23840a, false, new String[]{"signalMapperPlaces"}, new f(tVarJ));
    }

    @Override // Wb.j
    public long e(Wb.g gVar) {
        this.f23840a.d();
        this.f23840a.e();
        try {
            long jM = this.f23842c.m(gVar);
            this.f23840a.A();
            return jM;
        } finally {
            this.f23840a.i();
        }
    }

    @Override // Wb.j
    public gg.i f() {
        return AbstractC7061d.d(this.f23840a, false, new String[]{"signalMapperPlaceName"}, new h(t.j("SELECT * FROM signalMapperPlaceName ORDER BY created DESC", 0)));
    }

    @Override // Wb.j
    public gg.i g() {
        return AbstractC7061d.d(this.f23840a, false, new String[]{"signalMapperPlaces"}, new g(t.j("SELECT * FROM signalMapperPlaces ORDER BY created DESC", 0)));
    }

    @Override // Wb.j
    public int h() {
        t tVarJ = t.j("SELECT COUNT(name) FROM signalMapperPlaceName", 0);
        this.f23840a.d();
        Cursor cursorB = AbstractC7208b.b(this.f23840a, tVarJ, false, null);
        try {
            return cursorB.moveToFirst() ? cursorB.getInt(0) : 0;
        } finally {
            cursorB.close();
            tVarJ.s();
        }
    }

    @Override // Wb.j
    public int i() {
        this.f23840a.d();
        SupportSQLiteStatement supportSQLiteStatementB = this.f23845f.b();
        try {
            this.f23840a.e();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementB.executeUpdateDelete();
                this.f23840a.A();
                return iExecuteUpdateDelete;
            } finally {
                this.f23840a.i();
            }
        } finally {
            this.f23845f.h(supportSQLiteStatementB);
        }
    }
}
