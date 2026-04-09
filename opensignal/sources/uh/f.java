package uh;

/* loaded from: classes.dex */
public enum f {
    SD360_AUDIOVIDEO_MP4(18),
    HD720_AUDIOVIDEO_MP4(22),
    HD8K_VIDEO_WEBM(272),
    HD4K_VIDEO_WEBM(313),
    HD1440_VIDEO_MP4(264),
    HD1080_VIDEO_MP4(137),
    HD720_VIDEO_MP4(136),
    SD480_VIDEO_MP4(135),
    SD360_VIDEO_MP4(134),
    SD240_VIDEO_MP4(133),
    SD144_VIDEO_MP4(160),
    AUDIO_MP4(140),
    ADAPTIVE(-999),
    LIVE(-998);

    private int itag;

    f(int i10) {
        this.itag = i10;
    }

    public int getItag() {
        return this.itag;
    }
}
