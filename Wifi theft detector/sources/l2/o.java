package l2;

import androidx.room.RoomDatabase;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23083a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.a f23084b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.g f23085c;

    /* renamed from: d, reason: collision with root package name */
    public final q1.g f23086d;

    public class a extends q1.a {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // q1.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u1.f fVar, m mVar) throws Throwable {
            String str = mVar.f23081a;
            if (str == null) {
                fVar.R(1);
            } else {
                fVar.i(1, str);
            }
            byte[] bArrK = androidx.work.d.k(mVar.f23082b);
            if (bArrK == null) {
                fVar.R(2);
            } else {
                fVar.N(2, bArrK);
            }
        }
    }

    public class b extends q1.g {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends q1.g {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(RoomDatabase roomDatabase) {
        this.f23083a = roomDatabase;
        this.f23084b = new a(roomDatabase);
        this.f23085c = new b(roomDatabase);
        this.f23086d = new c(roomDatabase);
    }

    @Override // l2.n
    public void a(String str) {
        this.f23083a.b();
        u1.f fVarA = this.f23085c.a();
        if (str == null) {
            fVarA.R(1);
        } else {
            fVarA.i(1, str);
        }
        this.f23083a.c();
        try {
            fVarA.z();
            this.f23083a.r();
        } finally {
            this.f23083a.g();
            this.f23085c.f(fVarA);
        }
    }

    @Override // l2.n
    public void b() {
        this.f23083a.b();
        u1.f fVarA = this.f23086d.a();
        this.f23083a.c();
        try {
            fVarA.z();
            this.f23083a.r();
        } finally {
            this.f23083a.g();
            this.f23086d.f(fVarA);
        }
    }

    @Override // l2.n
    public void c(m mVar) {
        this.f23083a.b();
        this.f23083a.c();
        try {
            this.f23084b.h(mVar);
            this.f23083a.r();
        } finally {
            this.f23083a.g();
        }
    }
}
