package m2;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private final q f53111a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f53112b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f53113c;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SupportSQLiteStatement invoke() {
            return w.this.d();
        }
    }

    public w(q database) {
        AbstractC6492s.i(database, "database");
        this.f53111a = database;
        this.f53112b = new AtomicBoolean(false);
        this.f53113c = Yg.n.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSQLiteStatement d() {
        return this.f53111a.f(e());
    }

    private final SupportSQLiteStatement f() {
        return (SupportSQLiteStatement) this.f53113c.getValue();
    }

    private final SupportSQLiteStatement g(boolean z10) {
        return z10 ? f() : d();
    }

    public SupportSQLiteStatement b() {
        c();
        return g(this.f53112b.compareAndSet(false, true));
    }

    protected void c() {
        this.f53111a.c();
    }

    protected abstract String e();

    public void h(SupportSQLiteStatement statement) {
        AbstractC6492s.i(statement, "statement");
        if (statement == f()) {
            this.f53112b.set(false);
        }
    }
}
