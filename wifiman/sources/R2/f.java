package r2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f60053a = new f();

    private f() {
    }

    public static final List a(Cursor cursor) {
        AbstractC6492s.i(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        AbstractC6492s.f(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver cr, List uris) {
        AbstractC6492s.i(cursor, "cursor");
        AbstractC6492s.i(cr, "cr");
        AbstractC6492s.i(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
