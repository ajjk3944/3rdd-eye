package l5;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class x implements w, oa.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14770a;

    /* renamed from: d, reason: collision with root package name */
    public final int f14771d;

    /* renamed from: g, reason: collision with root package name */
    public MediaCodecInfo[] f14772g;

    public x(int i10, boolean z10, boolean z11) {
        this.f14770a = i10;
        switch (i10) {
            case 1:
                this.f14771d = (z10 || z11) ? 1 : 0;
                break;
            default:
                this.f14771d = (z10 || z11) ? 1 : 0;
                break;
        }
    }

    @Override // l5.w, oa.i
    public final MediaCodecInfo a(int i10) {
        switch (this.f14770a) {
            case 0:
                if (this.f14772g == null) {
                    this.f14772g = new MediaCodecList(this.f14771d).getCodecInfos();
                }
                break;
            default:
                if (this.f14772g == null) {
                    this.f14772g = new MediaCodecList(this.f14771d).getCodecInfos();
                }
                break;
        }
        return this.f14772g[i10];
    }

    @Override // l5.w, oa.i
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f14770a) {
        }
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // l5.w, oa.i
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        switch (this.f14770a) {
        }
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // l5.w, oa.i
    public final int d() {
        switch (this.f14770a) {
            case 0:
                if (this.f14772g == null) {
                    this.f14772g = new MediaCodecList(this.f14771d).getCodecInfos();
                }
                break;
            default:
                if (this.f14772g == null) {
                    this.f14772g = new MediaCodecList(this.f14771d).getCodecInfos();
                }
                break;
        }
        return this.f14772g.length;
    }

    @Override // l5.w, oa.i
    public final boolean e() {
        switch (this.f14770a) {
        }
        return true;
    }
}
