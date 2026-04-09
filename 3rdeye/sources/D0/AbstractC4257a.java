package d0;

import N7.G8;
import android.media.MediaFormat;
import com.google.android.gms.common.Scopes;
import d0.C4259c;
import java.util.Objects;

/* compiled from: AudioEncoderConfig.java */
/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4257a implements m {

    /* compiled from: AudioEncoderConfig.java */
    /* renamed from: d0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0435a {
        public final C4259c a() {
            C4259c.a aVar = (C4259c.a) this;
            String strS = aVar.f37204a == null ? " mimeType" : "";
            if (aVar.f37206c == null) {
                strS = G8.s(strS, " inputTimebase");
            }
            if (aVar.f37207d == null) {
                strS = G8.s(strS, " bitrate");
            }
            if (aVar.f37208e == null) {
                strS = G8.s(strS, " sampleRate");
            }
            if (aVar.f37209f == null) {
                strS = G8.s(strS, " channelCount");
            }
            if (!strS.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strS));
            }
            C4259c c4259c = new C4259c(aVar.f37204a, aVar.f37205b.intValue(), aVar.f37206c, aVar.f37207d.intValue(), aVar.f37208e.intValue(), aVar.f37209f.intValue());
            if (Objects.equals(c4259c.f37198a, "audio/mp4a-latm") && c4259c.f37199b == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return c4259c;
        }
    }

    @Override // d0.m
    public final MediaFormat a() {
        int iG = g();
        int iE = e();
        String str = ((C4259c) this).f37198a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, iG, iE);
        mediaFormatCreateAudioFormat.setInteger("bitrate", d());
        if (f() != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", f());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, f());
        }
        return mediaFormatCreateAudioFormat;
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();
}
