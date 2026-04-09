package l2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23071a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.a f23072b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.g f23073c;

    public class a extends q1.a {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // q1.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u1.f fVar, g gVar) {
            String str = gVar.f23069a;
            if (str == null) {
                fVar.R(1);
            } else {
                fVar.i(1, str);
            }
            fVar.s(2, gVar.f23070b);
        }
    }

    public class b extends q1.g {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(RoomDatabase roomDatabase) {
        this.f23071a = roomDatabase;
        this.f23072b = new a(roomDatabase);
        this.f23073c = new b(roomDatabase);
    }

    @Override // l2.h
    public g a(String str) {
        q1.d dVarA = q1.d.a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23071a.b();
        Cursor cursorB = s1.c.b(this.f23071a, dVarA, false, null);
        try {
            return cursorB.moveToFirst() ? new g(cursorB.getString(s1.b.b(cursorB, "work_spec_id")), cursorB.getInt(s1.b.b(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.h
    public List b() {
        q1.d dVarA = q1.d.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f23071a.b();
        Cursor cursorB = s1.c.b(this.f23071a, dVarA, false, null);
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

    @Override // l2.h
    public void c(g gVar) {
        this.f23071a.b();
        this.f23071a.c();
        try {
            this.f23072b.h(gVar);
            this.f23071a.r();
        } finally {
            this.f23071a.g();
        }
    }

    @Override // l2.h
    public void d(String str) {
        this.f23071a.b();
        u1.f fVarA = this.f23073c.a();
        if (str == null) {
            fVarA.R(1);
        } else {
            fVarA.i(1, str);
        }
        this.f23071a.c();
        try {
            fVarA.z();
            this.f23071a.r();
        } finally {
            this.f23071a.g();
            this.f23073c.f(fVarA);
        }
    }
}
