package ca;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public interface x {
    void a(int i10, fb.f fVar);

    default int b(pb.k kVar, int i10, boolean z10) {
        return c(kVar, i10, z10);
    }

    int c(pb.k kVar, int i10, boolean z10);

    void d(long j, int i10, int i11, int i12, w wVar);

    void e(Format format);
}
