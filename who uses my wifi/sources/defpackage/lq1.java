package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class lq1 extends IOException {
    public final boolean f;
    public final int g;

    public lq1(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f = z;
        this.g = i;
    }

    public static lq1 a(RuntimeException runtimeException, String str) {
        return new lq1(str, runtimeException, true, 1);
    }

    public static lq1 b(String str) {
        return new lq1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z = this.f;
        int length2 = String.valueOf(z).length() + length + 20;
        int i = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        return ex0.i(sb, i, "}");
    }
}
