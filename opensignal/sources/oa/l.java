package oa;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final l f19214a = new l();

    public static MediaCodec f(js.e eVar) {
        ((c) eVar.f13798g).getClass();
        String str = ((c) eVar.f13798g).f19169a;
        String strValueOf = String.valueOf(str);
        qb.b.d(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        qb.b.r();
        return mediaCodecCreateByCodecName;
    }

    @Override // oa.i
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // oa.i
    public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // oa.i
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // oa.i
    public int d() {
        return MediaCodecList.getCodecCount();
    }

    @Override // oa.i
    public boolean e() {
        return false;
    }
}
