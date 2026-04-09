package r2;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f60052a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle extras) {
        AbstractC6492s.i(cursor, "cursor");
        AbstractC6492s.i(extras, "extras");
        cursor.setExtras(extras);
    }
}
