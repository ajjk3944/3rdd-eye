package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gs3 implements o93 {
    public static final gs3 h;
    public static final gs3 i;
    public static final gs3 j;
    public static final gs3 k;
    public static final gs3 l;
    public static final gs3 m;
    public static final gs3 n;
    public static gs3 o;
    public final /* synthetic */ int f;
    public String g;

    static {
        int i2 = 0;
        h = new gs3("TINK", i2);
        i = new gs3("CRUNCHY", i2);
        j = new gs3("NO_PREFIX", i2);
        int i3 = 1;
        k = new gs3("TINK", i3);
        l = new gs3("CRUNCHY", i3);
        m = new gs3("LEGACY", i3);
        n = new gs3("NO_PREFIX", i3);
    }

    public /* synthetic */ gs3(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    public String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.g).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    @Override // defpackage.o93
    public Object c(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.g, Integer.toString(0)});
        return null;
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return this.g;
            case 1:
                return this.g;
            case 2:
            default:
                return super.toString();
            case 3:
                return "<" + this.g + '>';
        }
    }

    public gs3(int i2) {
        this.f = i2;
        switch (i2) {
            case 4:
                break;
            default:
                this.g = (String) uk2.j.w();
                break;
        }
    }
}
