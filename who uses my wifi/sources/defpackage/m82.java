package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m82 extends gw3 {
    public final Map i;
    public final Activity j;
    public final String k;
    public final long l;
    public final long m;
    public final String n;
    public final String o;

    public m82(ag2 ag2Var, Map map) throws NumberFormatException {
        long j;
        super(ag2Var, "createCalendarEvent", 23, false);
        this.i = map;
        this.j = ag2Var.g();
        this.k = K("description");
        this.n = K("summary");
        String str = (String) map.get("start_ticks");
        long j2 = -1;
        if (str == null) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        this.l = j;
        String str2 = (String) this.i.get("end_ticks");
        if (str2 != null) {
            try {
                j2 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.m = j2;
        this.o = K("location");
    }

    public final String K(String str) {
        Map map = this.i;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
