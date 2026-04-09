package Z;

import Z.h;
import Z.j;
import a0.C1642a;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import b0.C1811b;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AudioStreamImpl.java */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: m, reason: collision with root package name */
    public static final long f13932m = TimeUnit.MILLISECONDS.toNanos(500);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f13933n = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioRecord f13934a;

    /* renamed from: b, reason: collision with root package name */
    public final Z.a f13935b;

    /* renamed from: f, reason: collision with root package name */
    public final int f13939f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13940g;

    /* renamed from: h, reason: collision with root package name */
    public h.a f13941h;
    public H.g i;

    /* renamed from: j, reason: collision with root package name */
    public long f13942j;

    /* renamed from: k, reason: collision with root package name */
    public a f13943k;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f13936c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13937d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<Boolean> f13938e = new AtomicReference<>(null);

    /* renamed from: l, reason: collision with root package name */
    public boolean f13944l = false;

    /* compiled from: AudioStreamImpl.java */
    public class a extends AudioManager$AudioRecordingCallback {
        public a() {
        }

        public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            Iterator<AudioRecordingConfiguration> it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfigurationD = G0.o.d(it.next());
                if (C1642a.a(audioRecordingConfigurationD) == k.this.f13934a.getAudioSessionId()) {
                    k.this.c(a0.c.b(audioRecordingConfigurationD));
                    return;
                }
            }
        }
    }

    public k(Z.a aVar, Context context) throws j.a, IllegalArgumentException {
        int iE = aVar.e();
        int iD = aVar.d();
        int iA = aVar.a();
        if (iE > 0 && iD > 0) {
            if (AudioRecord.getMinBufferSize(iE, iD == 1 ? 16 : 12, iA) > 0) {
                this.f13935b = aVar;
                this.f13940g = aVar.c();
                int minBufferSize = AudioRecord.getMinBufferSize(aVar.e(), aVar.d() == 1 ? 16 : 12, aVar.a());
                A2.l.q(null, minBufferSize > 0);
                int i = minBufferSize * 2;
                this.f13939f = i;
                AudioRecord audioRecordB = b(i, aVar, context);
                this.f13934a = audioRecordB;
                if (audioRecordB.getState() == 1) {
                    return;
                }
                audioRecordB.release();
                throw new j.a("Unable to initialize AudioRecord");
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(aVar.e()), Integer.valueOf(aVar.d()), Integer.valueOf(aVar.a())));
    }

    public static AudioRecord b(int i, Z.a aVar, Context context) throws IllegalArgumentException {
        int i10 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(aVar.e()).setChannelMask(aVar.d() == 1 ? 16 : 12).setEncoding(aVar.a()).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i10 >= 31 && context != null) {
            a0.d.a(builder, context);
        }
        builder.setAudioSource(aVar.b());
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i);
        return builder.build();
    }

    public final void a() {
        A2.l.q("AudioStream has been released.", !this.f13936c.get());
    }

    public final void c(boolean z10) {
        H.g gVar = this.i;
        h.a aVar = this.f13941h;
        if (gVar == null || aVar == null || Objects.equals(this.f13938e.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        gVar.execute(new d(aVar, z10, 1));
    }

    public final void d() throws j.a {
        a();
        AtomicBoolean atomicBoolean = this.f13937d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (C1811b.f17055a.e(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.f13934a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new j.a("Unable to initialize AudioRecord");
            }
        }
        this.f13934a.startRecording();
        boolean z10 = false;
        if (this.f13934a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new j.a("Unable to start AudioRecord with state: " + this.f13934a.getRecordingState());
        }
        this.f13942j = 0L;
        this.f13944l = false;
        this.f13938e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationA = a0.c.a(this.f13934a);
            z10 = audioRecordingConfigurationA != null && a0.c.b(audioRecordingConfigurationA);
        }
        c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    @Override // Z.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Z.m read(java.nio.ByteBuffer r13) {
        /*
            r12 = this;
            r12.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f13937d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            A2.l.q(r1, r0)
            android.media.AudioRecord r0 = r12.f13934a
            int r1 = r12.f13939f
            int r0 = r0.read(r13, r1)
            r1 = 0
            if (r0 <= 0) goto L96
            r13.limit(r0)
            int r13 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = -1
            if (r13 < r3) goto L81
            boolean r13 = r12.f13944l
            if (r13 != 0) goto L81
            android.media.AudioTimestamp r13 = new android.media.AudioTimestamp
            r13.<init>()
            android.media.AudioRecord r3 = r12.f13934a
            int r3 = a0.C1642a.b(r3, r13)
            if (r3 != 0) goto L7a
            Z.a r3 = r12.f13935b
            int r3 = r3.e()
            long r6 = r12.f13942j
            long r8 = (long) r3
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r9 = 0
            r10 = 1
            if (r8 <= 0) goto L47
            r8 = r10
            goto L48
        L47:
            r8 = r9
        L48:
            java.lang.String r11 = "sampleRate must be greater than 0."
            A2.l.k(r11, r8)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L52
            r9 = r10
        L52:
            java.lang.String r8 = "framePosition must be no less than 0."
            A2.l.k(r8, r9)
            long r8 = r13.framePosition
            long r6 = r6 - r8
            long r6 = t4.C5606d.u(r3, r6)
            long r8 = r13.nanoTime
            long r8 = r8 + r6
            int r13 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r13 >= 0) goto L66
            goto L67
        L66:
            r1 = r8
        L67:
            long r6 = java.lang.System.nanoTime()
            long r6 = r1 - r6
            long r6 = java.lang.Math.abs(r6)
            long r8 = Z.k.f13932m
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L82
            r12.f13944l = r10
            goto L81
        L7a:
            java.lang.String r13 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            C.S.g(r13, r1)
        L81:
            r1 = r4
        L82:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 != 0) goto L8a
            long r1 = java.lang.System.nanoTime()
        L8a:
            long r3 = r12.f13942j
            long r5 = (long) r0
            int r13 = r12.f13940g
            long r5 = t4.C5606d.C(r13, r5)
            long r5 = r5 + r3
            r12.f13942j = r5
        L96:
            Z.m r13 = new Z.m
            r13.<init>(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.k.read(java.nio.ByteBuffer):Z.m");
    }
}
