package f5;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f8537a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioTimestamp f8538b;

    /* renamed from: c, reason: collision with root package name */
    public long f8539c;

    /* renamed from: d, reason: collision with root package name */
    public long f8540d;

    /* renamed from: e, reason: collision with root package name */
    public long f8541e;

    public m(AudioTrack audioTrack, int i10) {
        switch (i10) {
            case 1:
                this.f8537a = audioTrack;
                this.f8538b = new AudioTimestamp();
                break;
            default:
                this.f8537a = audioTrack;
                this.f8538b = new AudioTimestamp();
                break;
        }
    }
}
