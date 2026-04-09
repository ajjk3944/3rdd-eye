package vi;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import br.l;
import g4.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23920a;

    public a(Context context) {
        this.f23920a = context.getPackageName() + ".com.opensignal.sdk.storage.provider";
    }

    public final String a(Uri uri) {
        l.e(uri, "uri");
        UriMatcher uriMatcher = new UriMatcher(-1);
        String str = this.f23920a;
        uriMatcher.addURI(str, "job_results", 1);
        uriMatcher.addURI(str, "currently_running_tasks", 2);
        uriMatcher.addURI(str, "scheduled_tasks", 3);
        uriMatcher.addURI(str, "key_value_data", 5);
        uriMatcher.addURI(str, "task_stats", 6);
        uriMatcher.addURI(str, "qos_results", 7);
        uriMatcher.addURI(str, "ip_cache", 8);
        switch (uriMatcher.match(uri)) {
            case 1:
                return "job_results";
            case 2:
                return "currently_running_tasks";
            case 3:
                return "scheduled_tasks";
            case 4:
            default:
                return null;
            case j.STRING_FIELD_NUMBER /* 5 */:
                return "key_value_data";
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "task_stats";
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "qos_results";
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return "ip_cache";
        }
    }

    public final Uri b(hi.a aVar) {
        l.e(aVar, "databaseTable");
        Uri uri = Uri.parse("content://" + this.f23920a + '/' + aVar.g());
        l.d(uri, "parse(...)");
        return uri;
    }
}
