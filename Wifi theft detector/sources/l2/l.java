package l2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23078a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.a f23079b;

    public class a extends q1.a {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // q1.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u1.f fVar, j jVar) {
            String str = jVar.f23076a;
            if (str == null) {
                fVar.R(1);
            } else {
                fVar.i(1, str);
            }
            String str2 = jVar.f23077b;
            if (str2 == null) {
                fVar.R(2);
            } else {
                fVar.i(2, str2);
            }
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.f23078a = roomDatabase;
        this.f23079b = new a(roomDatabase);
    }

    @Override // l2.k
    public void a(j jVar) {
        this.f23078a.b();
        this.f23078a.c();
        try {
            this.f23079b.h(jVar);
            this.f23078a.r();
        } finally {
            this.f23078a.g();
        }
    }

    @Override // l2.k
    public List b(String str) {
        q1.d dVarA = q1.d.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23078a.b();
        Cursor cursorB = s1.c.b(this.f23078a, dVarA, false, null);
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
}
