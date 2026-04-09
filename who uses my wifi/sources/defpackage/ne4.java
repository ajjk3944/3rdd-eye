package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ne4 extends Exception {
    public final int f;
    public final boolean g;

    public ne4(int i, int i2, int i3, int i4, int i5, ph4 ph4Var, boolean z, RuntimeException runtimeException) {
        String strValueOf = String.valueOf(ph4Var);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = String.valueOf(i4).length();
        int length5 = String.valueOf(i5).length();
        int length6 = strValueOf.length();
        int i6 = length + 31 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2;
        String str = true != z ? "" : " (recoverable)";
        StringBuilder sb = new StringBuilder(str.length() + i6 + length6);
        ex0.o(sb, "AudioTrack init failed ", i, " Config(", i2);
        ex0.o(sb, ", ", i3, ", ", i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(str);
        super(sb.toString(), runtimeException);
        this.f = i;
        this.g = z;
    }
}
