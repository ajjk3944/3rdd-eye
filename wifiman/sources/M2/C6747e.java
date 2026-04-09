package m2;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6747e implements SupportSQLiteOpenHelper.b {

    /* renamed from: a, reason: collision with root package name */
    private final SupportSQLiteOpenHelper.b f53011a;

    /* renamed from: b, reason: collision with root package name */
    private final C6745c f53012b;

    public C6747e(SupportSQLiteOpenHelper.b delegate, C6745c autoCloser) {
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(autoCloser, "autoCloser");
        this.f53011a = delegate;
        this.f53012b = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6746d create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC6492s.i(configuration, "configuration");
        return new C6746d(this.f53011a.create(configuration), this.f53012b);
    }
}
