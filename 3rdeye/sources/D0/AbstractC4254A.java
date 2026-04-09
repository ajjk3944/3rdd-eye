package d0;

import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;
import d0.C4260d;

/* compiled from: VideoEncoderConfig.java */
/* renamed from: d0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4254A implements m {

    /* compiled from: VideoEncoderConfig.java */
    /* renamed from: d0.A$a */
    public static abstract class a {
    }

    public static C4260d.a d() {
        C4260d.a aVar = new C4260d.a();
        aVar.f37219b = -1;
        aVar.f37225h = 1;
        aVar.f37222e = 2130708361;
        e eVar = AbstractC4255B.f37192a;
        if (eVar == null) {
            throw new NullPointerException("Null dataSpace");
        }
        aVar.f37223f = eVar;
        return aVar;
    }

    @Override // d0.m
    public final MediaFormat a() {
        Size sizeK = k();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(((C4260d) this).f37210a, sizeK.getWidth(), sizeK.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", f());
        mediaFormatCreateVideoFormat.setInteger("bitrate", e());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", h());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, j());
        }
        AbstractC4255B abstractC4255BG = g();
        if (abstractC4255BG.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", abstractC4255BG.b());
        }
        if (abstractC4255BG.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", abstractC4255BG.c());
        }
        if (abstractC4255BG.a() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", abstractC4255BG.a());
        }
        return mediaFormatCreateVideoFormat;
    }

    public abstract int e();

    public abstract int f();

    public abstract AbstractC4255B g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract Size k();
}
