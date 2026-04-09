package b4;

import com.google.android.gms.internal.ads.InterfaceC1673p4;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: b4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352q implements InterfaceC0343h, InterfaceC1673p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5763a;

    /* renamed from: b, reason: collision with root package name */
    public final FileChannel f5764b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5765c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5766d;

    public /* synthetic */ C0352q(FileChannel fileChannel, long j6, long j7, int i) {
        this.f5763a = i;
        this.f5764b = fileChannel;
        this.f5765c = j6;
        this.f5766d = j7;
    }

    @Override // b4.InterfaceC0343h
    public final long a() {
        switch (this.f5763a) {
        }
        return this.f5766d;
    }

    @Override // b4.InterfaceC0343h
    public final void g(MessageDigest[] messageDigestArr, long j6, int i) throws IOException {
        switch (this.f5763a) {
            case 0:
                MappedByteBuffer map = this.f5764b.map(FileChannel.MapMode.READ_ONLY, this.f5765c + j6, i);
                map.load();
                for (MessageDigest messageDigest : messageDigestArr) {
                    map.position(0);
                    messageDigest.update(map);
                }
                break;
            default:
                MappedByteBuffer map2 = this.f5764b.map(FileChannel.MapMode.READ_ONLY, this.f5765c + j6, i);
                map2.load();
                for (MessageDigest messageDigest2 : messageDigestArr) {
                    map2.position(0);
                    messageDigest2.update(map2);
                }
                break;
        }
    }
}
