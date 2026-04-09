package pa;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20352a = new b();

    public final ic.a a(Format format) {
        String str = format.H;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new qa.a();
                case "application/x-icy":
                    return new ta.a();
                case "application/id3":
                    return new ua.b(null);
                case "application/x-emsg":
                    return new ra.a();
                case "application/x-scte35":
                    return new wa.a();
            }
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public final boolean b(Format format) {
        String str = format.H;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
