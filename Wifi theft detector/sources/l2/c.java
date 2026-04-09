package l2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23061a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.a f23062b;

    public class a extends q1.a {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // q1.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u1.f fVar, l2.a aVar) {
            String str = aVar.f23059a;
            if (str == null) {
                fVar.R(1);
            } else {
                fVar.i(1, str);
            }
            String str2 = aVar.f23060b;
            if (str2 == null) {
                fVar.R(2);
            } else {
                fVar.i(2, str2);
            }
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f23061a = roomDatabase;
        this.f23062b = new a(roomDatabase);
    }

    @Override // l2.b
    public List a(String str) {
        q1.d dVarA = q1.d.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23061a.b();
        Cursor cursorB = s1.c.b(this.f23061a, dVarA, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.b
    public boolean b(String str) {
        q1.d dVarA = q1.d.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23061a.b();
        boolean z10 = false;
        Cursor cursorB = s1.c.b(this.f23061a, dVarA, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.b
    public void c(l2.a aVar) {
        this.f23061a.b();
        this.f23061a.c();
        try {
            this.f23062b.h(aVar);
            this.f23061a.r();
        } finally {
            this.f23061a.g();
        }
    }

    @Override // l2.b
    public boolean d(String str) {
        q1.d dVarA = q1.d.a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23061a.b();
        boolean z10 = false;
        Cursor cursorB = s1.c.b(this.f23061a, dVarA, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }
}
