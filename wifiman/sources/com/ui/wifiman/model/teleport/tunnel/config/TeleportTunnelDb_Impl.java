package com.ui.wifiman.model.teleport.tunnel.config;

import Jd.b;
import Jd.c;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.C6748f;
import m2.q;
import m2.s;
import p2.AbstractC7208b;
import p2.C7212f;

/* loaded from: classes4.dex */
public final class TeleportTunnelDb_Impl extends TeleportTunnelDb {

    /* renamed from: q, reason: collision with root package name */
    private volatile b f43507q;

    class a extends s.b {
        a(int i10) {
            super(i10);
        }

        @Override // m2.s.b
        public void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cloudToken` TEXT NOT NULL, `cloudSecret` TEXT NOT NULL, `key` TEXT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_config_key` ON `config` (`key`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bf22e5909a49844be9494808d3d1a0f8')");
        }

        @Override // m2.s.b
        public void b(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `config`");
            List list = ((q) TeleportTunnelDb_Impl.this).f53048h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            }
        }

        @Override // m2.s.b
        public void c(SupportSQLiteDatabase supportSQLiteDatabase) {
            List list = ((q) TeleportTunnelDb_Impl.this).f53048h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            }
        }

        @Override // m2.s.b
        public void d(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((q) TeleportTunnelDb_Impl.this).f53041a = supportSQLiteDatabase;
            TeleportTunnelDb_Impl.this.v(supportSQLiteDatabase);
            List list = ((q) TeleportTunnelDb_Impl.this).f53048h;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            }
        }

        @Override // m2.s.b
        public void e(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // m2.s.b
        public void f(SupportSQLiteDatabase supportSQLiteDatabase) {
            AbstractC7208b.a(supportSQLiteDatabase);
        }

        @Override // m2.s.b
        public s.c g(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(4);
            map.put("id", new C7212f.a("id", "INTEGER", true, 1, null, 1));
            map.put("cloudToken", new C7212f.a("cloudToken", "TEXT", true, 0, null, 1));
            map.put("cloudSecret", new C7212f.a("cloudSecret", "TEXT", true, 0, null, 1));
            map.put("key", new C7212f.a("key", "TEXT", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C7212f.e("index_config_key", true, Arrays.asList("key"), Arrays.asList("ASC")));
            C7212f c7212f = new C7212f("config", map, hashSet, hashSet2);
            C7212f c7212fA = C7212f.a(supportSQLiteDatabase, "config");
            if (c7212f.equals(c7212fA)) {
                return new s.c(true, null);
            }
            return new s.c(false, "config(com.ui.wifiman.model.teleport.tunnel.config.RoomTeleportConfig).\n Expected:\n" + c7212f + "\n Found:\n" + c7212fA);
        }
    }

    @Override // com.ui.wifiman.model.teleport.tunnel.config.TeleportTunnelDb
    public b C() {
        b bVar;
        if (this.f43507q != null) {
            return this.f43507q;
        }
        synchronized (this) {
            try {
                if (this.f43507q == null) {
                    this.f43507q = new c(this);
                }
                bVar = this.f43507q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // m2.q
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "config");
    }

    @Override // m2.q
    protected SupportSQLiteOpenHelper h(C6748f c6748f) {
        return c6748f.f53015c.create(SupportSQLiteOpenHelper.Configuration.a(c6748f.f53013a).c(c6748f.f53014b).b(new s(c6748f, new a(8), "bf22e5909a49844be9494808d3d1a0f8", "5c858480781e1a786617377d3b2274ee")).a());
    }

    @Override // m2.q
    public List j(Map map) {
        return new ArrayList();
    }

    @Override // m2.q
    public Set o() {
        return new HashSet();
    }

    @Override // m2.q
    protected Map p() {
        HashMap map = new HashMap();
        map.put(b.class, c.e());
        return map;
    }
}
