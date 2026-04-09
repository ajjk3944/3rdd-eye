package m5;

import androidx.media3.common.r;
import com.google.android.gms.internal.measurement.b4;
import f6.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16304a = new a();

    public final b4 a(r rVar) {
        String str = rVar.H;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new b6.a();
                case "application/x-icy":
                    return new e6.a();
                case "application/id3":
                    return new c(null);
                case "application/x-emsg":
                    return new c6.a();
                case "application/x-scte35":
                    return new h6.a();
            }
        }
        throw new IllegalArgumentException(c7.a.p("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(r rVar) {
        String str = rVar.H;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
