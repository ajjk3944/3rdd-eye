package y9;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class l extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25930a;

    /* renamed from: d, reason: collision with root package name */
    public final Format f25931d;

    public l(int i10, int i11, int i12, int i13, Format format, boolean z10, RuntimeException runtimeException) {
        String str = z10 ? " (recoverable)" : "";
        StringBuilder sb2 = new StringBuilder(str.length() + 80);
        sb2.append("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        super(w.g.j(sb2, ")", str), runtimeException);
        this.f25930a = z10;
        this.f25931d = format;
    }
}
