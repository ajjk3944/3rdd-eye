package db;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
import oe.f0;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class i extends j {
    public final String H;
    public final h0 I;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(String str, long j, long j7, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j7, false, u0.f19383x);
        f0 f0Var = h0.f19336d;
    }

    public i(String str, i iVar, String str2, long j, int i10, long j7, DrmInitData drmInitData, String str3, String str4, long j10, long j11, boolean z10, List list) {
        super(str, iVar, j, i10, j7, drmInitData, str3, str4, j10, j11, z10);
        this.H = str2;
        this.I = h0.l(list);
    }
}
