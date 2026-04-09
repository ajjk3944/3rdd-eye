package m2;

import android.content.Context;
import android.content.Intent;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6492s;
import m2.q;

/* renamed from: m2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6748f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f53013a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53014b;

    /* renamed from: c, reason: collision with root package name */
    public final SupportSQLiteOpenHelper.b f53015c;

    /* renamed from: d, reason: collision with root package name */
    public final q.d f53016d;

    /* renamed from: e, reason: collision with root package name */
    public final List f53017e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53018f;

    /* renamed from: g, reason: collision with root package name */
    public final q.c f53019g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f53020h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f53021i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f53022j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f53023k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f53024l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f53025m;

    /* renamed from: n, reason: collision with root package name */
    public final String f53026n;

    /* renamed from: o, reason: collision with root package name */
    public final File f53027o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f53028p;

    /* renamed from: q, reason: collision with root package name */
    public final List f53029q;

    /* renamed from: r, reason: collision with root package name */
    public final List f53030r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f53031s;

    public C6748f(Context context, String str, SupportSQLiteOpenHelper.b sqliteOpenHelperFactory, q.d migrationContainer, List list, boolean z10, q.c journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, q.e eVar, List typeConverters, List autoMigrationSpecs) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC6492s.i(migrationContainer, "migrationContainer");
        AbstractC6492s.i(journalMode, "journalMode");
        AbstractC6492s.i(queryExecutor, "queryExecutor");
        AbstractC6492s.i(transactionExecutor, "transactionExecutor");
        AbstractC6492s.i(typeConverters, "typeConverters");
        AbstractC6492s.i(autoMigrationSpecs, "autoMigrationSpecs");
        this.f53013a = context;
        this.f53014b = str;
        this.f53015c = sqliteOpenHelperFactory;
        this.f53016d = migrationContainer;
        this.f53017e = list;
        this.f53018f = z10;
        this.f53019g = journalMode;
        this.f53020h = queryExecutor;
        this.f53021i = transactionExecutor;
        this.f53022j = intent;
        this.f53023k = z11;
        this.f53024l = z12;
        this.f53025m = set;
        this.f53026n = str2;
        this.f53027o = file;
        this.f53028p = callable;
        this.f53029q = typeConverters;
        this.f53030r = autoMigrationSpecs;
        this.f53031s = intent != null;
    }

    public boolean a(int i10, int i11) {
        if ((i10 > i11 && this.f53024l) || !this.f53023k) {
            return false;
        }
        Set set = this.f53025m;
        return set == null || !set.contains(Integer.valueOf(i10));
    }
}
