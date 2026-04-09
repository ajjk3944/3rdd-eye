package y9;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class m extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25932a;

    /* renamed from: d, reason: collision with root package name */
    public final Format f25933d;

    public m(int i10, Format format, boolean z10) {
        super(w.g.e("AudioTrack write failed: ", 36, i10));
        this.f25932a = z10;
        this.f25933d = format;
    }
}
