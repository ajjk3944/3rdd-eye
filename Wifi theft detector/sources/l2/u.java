package l2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23133a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.a f23134b;

    public class a extends q1.a {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // q1.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u1.f fVar, s sVar) {
            String str = sVar.f23131a;
            if (str == null) {
                fVar.R(1);
            } else {
                fVar.i(1, str);
            }
            String str2 = sVar.f23132b;
            if (str2 == null) {
                fVar.R(2);
            } else {
                fVar.i(2, str2);
            }
        }
    }

    public u(RoomDatabase roomDatabase) {
        this.f23133a = roomDatabase;
        this.f23134b = new a(roomDatabase);
    }

    @Override // l2.t
    public void a(s sVar) {
        this.f23133a.b();
        this.f23133a.c();
        try {
            this.f23134b.h(sVar);
            this.f23133a.r();
        } finally {
            this.f23133a.g();
        }
    }

    @Override // l2.t
    public List b(String str) {
        q1.d dVarA = q1.d.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23133a.b();
        Cursor cursorB = s1.c.b(this.f23133a, dVarA, false, null);
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
