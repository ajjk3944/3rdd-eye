package f5;

/* loaded from: classes.dex */
public final class j extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f8532a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8533d;

    public j(int i10, int i11, int i12, int i13, androidx.media3.common.r rVar, boolean z10, RuntimeException runtimeException) {
        StringBuilder sb2 = new StringBuilder("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(") ");
        sb2.append(rVar);
        sb2.append(z10 ? " (recoverable)" : "");
        super(sb2.toString(), runtimeException);
        this.f8532a = i10;
        this.f8533d = z10;
    }
}
