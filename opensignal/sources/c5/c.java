package c5;

import a5.d0;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3296a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3297b;

    /* renamed from: c, reason: collision with root package name */
    public int f3298c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3299d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3300e;

    /* renamed from: f, reason: collision with root package name */
    public int f3301f;

    /* renamed from: g, reason: collision with root package name */
    public int f3302g;

    /* renamed from: h, reason: collision with root package name */
    public int f3303h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f3304i;
    public final io.sentry.internal.debugmeta.c j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3304i = cryptoInfo;
        this.j = d0.f105a >= 24 ? new io.sentry.internal.debugmeta.c(cryptoInfo) : null;
    }
}
