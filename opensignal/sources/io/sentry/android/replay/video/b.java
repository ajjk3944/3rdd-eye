package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f12009a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaMuxer f12010b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12011c;

    /* renamed from: d, reason: collision with root package name */
    public int f12012d;

    /* renamed from: e, reason: collision with root package name */
    public int f12013e;

    /* renamed from: f, reason: collision with root package name */
    public long f12014f;

    public b(String str, float f10) {
        this.f12009a = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.f12010b = new MediaMuxer(str, 0);
    }
}
