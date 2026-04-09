package y2;

import android.os.Build;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25103a = Build.VERSION.SDK_INT;

    public static int a(long j10, long j11) {
        return Math.min(Math.max(0, j11 > 0 ? (int) (((j10 * 1.0d) / j11) * 100.0d) : 0), 100);
    }

    public static String b(long j10) {
        StringBuilder sb = new StringBuilder();
        long j11 = j10 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j12 = ((j10 % 3600000) % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
        if (j11 >= 10) {
            sb.append(j11);
        } else if (j11 > 0) {
            sb.append(0);
            sb.append(j11);
        } else {
            sb.append(0);
            sb.append(0);
        }
        sb.append(":");
        if (j12 >= 10) {
            sb.append(j12);
        } else if (j12 > 0) {
            sb.append(0);
            sb.append(j12);
        } else {
            sb.append(0);
            sb.append(0);
        }
        return sb.toString();
    }

    public static void c(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i10 = f25103a;
        if (i10 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i10 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
