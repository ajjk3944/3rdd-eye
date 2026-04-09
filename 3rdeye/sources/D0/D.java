package d0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import com.applovin.impl.G0;
import e0.C4300a;
import java.io.IOException;
import java.util.Objects;

/* compiled from: VideoEncoderInfoImpl.java */
/* loaded from: classes.dex */
public final class D extends v implements InterfaceC4256C {

    /* renamed from: c, reason: collision with root package name */
    public static final G0 f37196c = new G0(3);

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f37197b;

    public D(MediaCodecInfo mediaCodecInfo, String str) throws y {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f37311a.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f37197b = videoCapabilities;
    }

    public static D k(AbstractC4254A abstractC4254A) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache<String, MediaCodecInfo> lruCache = C4300a.f37630a;
        C4260d c4260d = (C4260d) abstractC4254A;
        String str = c4260d.f37210a;
        LruCache<String, MediaCodecInfo> lruCache2 = C4300a.f37630a;
        synchronized (lruCache2) {
            mediaCodecInfo = lruCache2.get(str);
        }
        try {
            if (mediaCodecInfo == null) {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache2) {
                            lruCache2.put(str, codecInfo);
                        }
                        mediaCodecCreateEncoderByType.release();
                        mediaCodecInfo = codecInfo;
                    } catch (Throwable th) {
                        th = th;
                        if (mediaCodecCreateEncoderByType != null) {
                            mediaCodecCreateEncoderByType.release();
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException e4) {
                    throw new y(e4);
                }
            }
            return new D(mediaCodecInfo, c4260d.f37210a);
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
    }

    @Override // d0.InterfaceC4256C
    public final /* synthetic */ boolean a(int i, int i10) {
        return com.google.android.gms.measurement.internal.a.c(this, i, i10);
    }

    @Override // d0.InterfaceC4256C
    public final int b() {
        return this.f37197b.getWidthAlignment();
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> c() {
        return this.f37197b.getBitrateRange();
    }

    @Override // d0.InterfaceC4256C
    public final boolean d() {
        return true;
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> e(int i) {
        try {
            return this.f37197b.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> f(int i) {
        try {
            return this.f37197b.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // d0.InterfaceC4256C
    public final int g() {
        return this.f37197b.getHeightAlignment();
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> h() {
        return this.f37197b.getSupportedWidths();
    }

    @Override // d0.InterfaceC4256C
    public final boolean i(int i, int i10) {
        return this.f37197b.isSizeSupported(i, i10);
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> j() {
        return this.f37197b.getSupportedHeights();
    }
}
