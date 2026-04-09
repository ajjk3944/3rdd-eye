package Vb;

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
public final class b extends Vb.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f23310a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6751i f23311b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6750h f23312c;

    class a extends AbstractC6751i {
        a(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "INSERT OR ABORT INTO `settings` (`id`,`themeId`,`dayNightId`,`distanceUnitId`,`channelsShowFrequencies`,`channelsShowFrequencies_5ghz`,`discoveryKeepScreenOn`,`speedtestKeepScreenOn`,`screen_orientation`,`teleport_tile_service_added`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6751i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Vb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.h());
            supportSQLiteStatement.bindString(2, cVar.l());
            supportSQLiteStatement.bindString(3, cVar.c());
            supportSQLiteStatement.bindString(4, cVar.g());
            supportSQLiteStatement.bindLong(5, cVar.a() ? 1L : 0L);
            supportSQLiteStatement.bindLong(6, cVar.b() ? 1L : 0L);
            supportSQLiteStatement.bindLong(7, cVar.e() ? 1L : 0L);
            supportSQLiteStatement.bindLong(8, cVar.j() ? 1L : 0L);
            supportSQLiteStatement.bindString(9, cVar.i());
            supportSQLiteStatement.bindLong(10, cVar.k() ? 1L : 0L);
        }
    }

    /* renamed from: Vb.b$b, reason: collision with other inner class name */
    class C0866b extends AbstractC6750h {
        C0866b(q qVar) {
            super(qVar);
        }

        @Override // m2.w
        protected String e() {
            return "UPDATE OR ABORT `settings` SET `id` = ?,`themeId` = ?,`dayNightId` = ?,`distanceUnitId` = ?,`channelsShowFrequencies` = ?,`channelsShowFrequencies_5ghz` = ?,`discoveryKeepScreenOn` = ?,`speedtestKeepScreenOn` = ?,`screen_orientation` = ?,`teleport_tile_service_added` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.AbstractC6750h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(SupportSQLiteStatement supportSQLiteStatement, Vb.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.h());
            supportSQLiteStatement.bindString(2, cVar.l());
            supportSQLiteStatement.bindString(3, cVar.c());
            supportSQLiteStatement.bindString(4, cVar.g());
            supportSQLiteStatement.bindLong(5, cVar.a() ? 1L : 0L);
            supportSQLiteStatement.bindLong(6, cVar.b() ? 1L : 0L);
            supportSQLiteStatement.bindLong(7, cVar.e() ? 1L : 0L);
            supportSQLiteStatement.bindLong(8, cVar.j() ? 1L : 0L);
            supportSQLiteStatement.bindString(9, cVar.i());
            supportSQLiteStatement.bindLong(10, cVar.k() ? 1L : 0L);
            supportSQLiteStatement.bindLong(11, cVar.h());
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f23315a;

        c(t tVar) {
            this.f23315a = tVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorB = AbstractC7208b.b(b.this.f23310a, this.f23315a, false, null);
            try {
                int iD = AbstractC7207a.d(cursorB, "id");
                int iD2 = AbstractC7207a.d(cursorB, "themeId");
                int iD3 = AbstractC7207a.d(cursorB, "dayNightId");
                int iD4 = AbstractC7207a.d(cursorB, "distanceUnitId");
                int iD5 = AbstractC7207a.d(cursorB, "channelsShowFrequencies");
                int iD6 = AbstractC7207a.d(cursorB, "channelsShowFrequencies_5ghz");
                int iD7 = AbstractC7207a.d(cursorB, "discoveryKeepScreenOn");
                int iD8 = AbstractC7207a.d(cursorB, "speedtestKeepScreenOn");
                int iD9 = AbstractC7207a.d(cursorB, "screen_orientation");
                int iD10 = AbstractC7207a.d(cursorB, "teleport_tile_service_added");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new Vb.c(cursorB.getInt(iD), cursorB.getString(iD2), cursorB.getString(iD3), cursorB.getString(iD4), cursorB.getInt(iD5) != 0, cursorB.getInt(iD6) != 0, cursorB.getInt(iD7) != 0, cursorB.getInt(iD8) != 0, cursorB.getString(iD9), cursorB.getInt(iD10) != 0));
                }
                return arrayList;
            } finally {
                cursorB.close();
            }
        }

        protected void finalize() {
            this.f23315a.s();
        }
    }

    public b(q qVar) {
        this.f23310a = qVar;
        this.f23311b = new a(qVar);
        this.f23312c = new C0866b(qVar);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public void c(InterfaceC6824a interfaceC6824a) {
        this.f23310a.e();
        try {
            super.c(interfaceC6824a);
            this.f23310a.A();
        } finally {
            this.f23310a.i();
        }
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public i e() {
        return AbstractC7061d.d(this.f23310a, false, new String[]{"settings"}, new c(t.j("SELECT * FROM settings", 0)));
    }

    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    public int g(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f23310a.e();
        try {
            int iG = super.g(interfaceC6835l, interfaceC6824a);
            this.f23310a.A();
            return iG;
        } finally {
            this.f23310a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Vb.c a() {
        t tVarJ = t.j("SELECT * FROM settings LIMIT 1", 0);
        this.f23310a.d();
        Vb.c cVar = null;
        Cursor cursorB = AbstractC7208b.b(this.f23310a, tVarJ, false, null);
        try {
            int iD = AbstractC7207a.d(cursorB, "id");
            int iD2 = AbstractC7207a.d(cursorB, "themeId");
            int iD3 = AbstractC7207a.d(cursorB, "dayNightId");
            int iD4 = AbstractC7207a.d(cursorB, "distanceUnitId");
            int iD5 = AbstractC7207a.d(cursorB, "channelsShowFrequencies");
            int iD6 = AbstractC7207a.d(cursorB, "channelsShowFrequencies_5ghz");
            int iD7 = AbstractC7207a.d(cursorB, "discoveryKeepScreenOn");
            int iD8 = AbstractC7207a.d(cursorB, "speedtestKeepScreenOn");
            int iD9 = AbstractC7207a.d(cursorB, "screen_orientation");
            int iD10 = AbstractC7207a.d(cursorB, "teleport_tile_service_added");
            if (cursorB.moveToFirst()) {
                cVar = new Vb.c(cursorB.getInt(iD), cursorB.getString(iD2), cursorB.getString(iD3), cursorB.getString(iD4), cursorB.getInt(iD5) != 0, cursorB.getInt(iD6) != 0, cursorB.getInt(iD7) != 0, cursorB.getInt(iD8) != 0, cursorB.getString(iD9), cursorB.getInt(iD10) != 0);
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
    public long d(Vb.c cVar) {
        this.f23310a.d();
        this.f23310a.e();
        try {
            long jM = this.f23311b.m(cVar);
            this.f23310a.A();
            return jM;
        } finally {
            this.f23310a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int f(Vb.c cVar) {
        this.f23310a.d();
        this.f23310a.e();
        try {
            int iJ = this.f23312c.j(cVar);
            this.f23310a.A();
            return iJ;
        } finally {
            this.f23310a.i();
        }
    }
}
