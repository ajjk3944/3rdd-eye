package m2;

import Yg.J;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6745c {

    /* renamed from: m, reason: collision with root package name */
    public static final a f52971m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public SupportSQLiteOpenHelper f52972a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f52973b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f52974c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f52975d;

    /* renamed from: e, reason: collision with root package name */
    private long f52976e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f52977f;

    /* renamed from: g, reason: collision with root package name */
    private int f52978g;

    /* renamed from: h, reason: collision with root package name */
    private long f52979h;

    /* renamed from: i, reason: collision with root package name */
    private SupportSQLiteDatabase f52980i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f52981j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f52982k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f52983l;

    /* renamed from: m2.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6745c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        AbstractC6492s.i(autoCloseTimeUnit, "autoCloseTimeUnit");
        AbstractC6492s.i(autoCloseExecutor, "autoCloseExecutor");
        this.f52973b = new Handler(Looper.getMainLooper());
        this.f52975d = new Object();
        this.f52976e = autoCloseTimeUnit.toMillis(j10);
        this.f52977f = autoCloseExecutor;
        this.f52979h = SystemClock.uptimeMillis();
        this.f52982k = new Runnable() { // from class: m2.a
            @Override // java.lang.Runnable
            public final void run() {
                C6745c.f(this.f52969a);
            }
        };
        this.f52983l = new Runnable() { // from class: m2.b
            @Override // java.lang.Runnable
            public final void run() {
                C6745c.c(this.f52970a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6745c this$0) {
        J j10;
        AbstractC6492s.i(this$0, "this$0");
        synchronized (this$0.f52975d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f52979h < this$0.f52976e) {
                    return;
                }
                if (this$0.f52978g != 0) {
                    return;
                }
                Runnable runnable = this$0.f52974c;
                if (runnable != null) {
                    runnable.run();
                    j10 = J.f24997a;
                } else {
                    j10 = null;
                }
                if (j10 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                SupportSQLiteDatabase supportSQLiteDatabase = this$0.f52980i;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    supportSQLiteDatabase.close();
                }
                this$0.f52980i = null;
                J j11 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C6745c this$0) {
        AbstractC6492s.i(this$0, "this$0");
        this$0.f52977f.execute(this$0.f52983l);
    }

    public final void d() {
        synchronized (this.f52975d) {
            try {
                this.f52981j = true;
                SupportSQLiteDatabase supportSQLiteDatabase = this.f52980i;
                if (supportSQLiteDatabase != null) {
                    supportSQLiteDatabase.close();
                }
                this.f52980i = null;
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f52975d) {
            try {
                int i10 = this.f52978g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f52978g = i11;
                if (i11 == 0) {
                    if (this.f52980i == null) {
                        return;
                    } else {
                        this.f52973b.postDelayed(this.f52982k, this.f52976e);
                    }
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object g(InterfaceC6835l block) {
        AbstractC6492s.i(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final SupportSQLiteDatabase h() {
        return this.f52980i;
    }

    public final SupportSQLiteOpenHelper i() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f52972a;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        AbstractC6492s.v("delegateOpenHelper");
        return null;
    }

    public final SupportSQLiteDatabase j() {
        synchronized (this.f52975d) {
            this.f52973b.removeCallbacks(this.f52982k);
            this.f52978g++;
            if (this.f52981j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            SupportSQLiteDatabase supportSQLiteDatabase = this.f52980i;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return supportSQLiteDatabase;
            }
            SupportSQLiteDatabase writableDatabase = i().getWritableDatabase();
            this.f52980i = writableDatabase;
            return writableDatabase;
        }
    }

    public final void k(SupportSQLiteOpenHelper delegateOpenHelper) {
        AbstractC6492s.i(delegateOpenHelper, "delegateOpenHelper");
        m(delegateOpenHelper);
    }

    public final void l(Runnable onAutoClose) {
        AbstractC6492s.i(onAutoClose, "onAutoClose");
        this.f52974c = onAutoClose;
    }

    public final void m(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        AbstractC6492s.i(supportSQLiteOpenHelper, "<set-?>");
        this.f52972a = supportSQLiteOpenHelper;
    }
}
