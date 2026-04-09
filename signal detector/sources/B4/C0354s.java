package b4;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* renamed from: b4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5767a;

    /* renamed from: b, reason: collision with root package name */
    public long f5768b;

    /* renamed from: c, reason: collision with root package name */
    public long f5769c;

    /* renamed from: d, reason: collision with root package name */
    public long f5770d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5771e;

    public /* synthetic */ C0354s(ByteBuffer byteBuffer, long j6, long j7, long j8, ByteBuffer byteBuffer2) {
        this.f5767a = byteBuffer;
        this.f5768b = j6;
        this.f5769c = j7;
        this.f5770d = j8;
        this.f5771e = byteBuffer2;
    }

    public C0354s(AudioTrack audioTrack) {
        this.f5767a = audioTrack;
        this.f5771e = new AudioTimestamp();
    }
}
