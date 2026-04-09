package s2;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: s2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7883f implements SupportSQLiteOpenHelper.b {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.b
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC6492s.i(configuration, "configuration");
        return new C7881d(configuration.f32346a, configuration.f32347b, configuration.f32348c, configuration.f32349d, configuration.f32350e);
    }
}
