package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rn1 implements qn1 {
    public long f;
    public long g;
    public Object h;

    public rn1() {
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.qn1
    public long a() {
        return this.g;
    }

    public void b(Exception exc) throws Exception {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.h) == null) {
            this.h = exc;
        }
        if (this.f == -9223372036854775807L) {
            synchronized (df4.f0) {
                z = df4.h0 > 0;
            }
            if (!z) {
                this.f = 200 + jElapsedRealtime;
            }
        }
        long j = this.f;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.g = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.h;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.h;
        this.h = null;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        throw exc3;
    }

    @Override // defpackage.qn1
    public void g(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.h).map(FileChannel.MapMode.READ_ONLY, this.f + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public rn1(FileChannel fileChannel, long j, long j2) {
        this.h = fileChannel;
        this.f = j;
        this.g = j2;
    }
}
