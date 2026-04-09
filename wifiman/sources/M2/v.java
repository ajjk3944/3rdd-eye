package m2;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class v implements SupportSQLiteOpenHelper.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f53107a;

    /* renamed from: b, reason: collision with root package name */
    private final File f53108b;

    /* renamed from: c, reason: collision with root package name */
    private final Callable f53109c;

    /* renamed from: d, reason: collision with root package name */
    private final SupportSQLiteOpenHelper.b f53110d;

    public v(String str, File file, Callable callable, SupportSQLiteOpenHelper.b mDelegate) {
        AbstractC6492s.i(mDelegate, "mDelegate");
        this.f53107a = str;
        this.f53108b = file;
        this.f53109c = callable;
        this.f53110d = mDelegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.b
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC6492s.i(configuration, "configuration");
        return new u(configuration.f32346a, this.f53107a, this.f53108b, this.f53109c, configuration.f32348c.f32357a, this.f53110d.create(configuration));
    }
}
