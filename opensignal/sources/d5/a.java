package d5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f6916a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.d f6917b;

    /* renamed from: c, reason: collision with root package name */
    public w f6918c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.media3.common.f f6919d;

    /* renamed from: e, reason: collision with root package name */
    public int f6920e;

    /* renamed from: f, reason: collision with root package name */
    public int f6921f;

    /* renamed from: g, reason: collision with root package name */
    public float f6922g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f6923h;

    public a(Context context, Handler handler, w wVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f6916a = audioManager;
        this.f6918c = wVar;
        this.f6917b = new com.google.android.exoplayer2.d(this, handler, 1);
        this.f6920e = 0;
    }

    public final void a() {
        if (this.f6920e == 0) {
            return;
        }
        int i10 = a5.d0.f105a;
        AudioManager audioManager = this.f6916a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f6923h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f6917b);
        }
        c(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.media3.common.f r7) {
        /*
            r6 = this;
            androidx.media3.common.f r0 = r6.f6919d
            boolean r0 = a5.d0.a(r0, r7)
            if (r0 != 0) goto L42
            r6.f6919d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L10
        Le:
            r3 = r0
            goto L36
        L10:
            int r2 = r7.f1621g
            r3 = 3
            java.lang.String r4 = "AudioFocusManager"
            r5 = 2
            switch(r2) {
                case 0: goto L30;
                case 1: goto L2e;
                case 2: goto L27;
                case 3: goto Le;
                case 4: goto L27;
                case 5: goto L36;
                case 6: goto L36;
                case 7: goto L36;
                case 8: goto L36;
                case 9: goto L36;
                case 10: goto L36;
                case 11: goto L29;
                case 12: goto L36;
                case 13: goto L36;
                case 14: goto L2e;
                case 15: goto L19;
                case 16: goto L1f;
                default: goto L19;
            }
        L19:
            java.lang.String r7 = "Unidentified audio usage: "
            c7.a.z(r7, r2, r4)
            goto Le
        L1f:
            int r7 = a5.d0.f105a
            r2 = 19
            if (r7 < r2) goto L27
            r3 = 4
            goto L36
        L27:
            r3 = r5
            goto L36
        L29:
            int r7 = r7.f1619a
            if (r7 != r1) goto L36
            goto L27
        L2e:
            r3 = r1
            goto L36
        L30:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            a5.a.B(r4, r7)
            goto L2e
        L36:
            r6.f6921f = r3
            if (r3 == r1) goto L3c
            if (r3 != 0) goto L3d
        L3c:
            r0 = r1
        L3d:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            a5.a.d(r7, r0)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.a.b(androidx.media3.common.f):void");
    }

    public final void c(int i10) {
        if (this.f6920e == i10) {
            return;
        }
        this.f6920e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f6922g == f10) {
            return;
        }
        this.f6922g = f10;
        w wVar = this.f6918c;
        if (wVar != null) {
            z zVar = wVar.f7095a;
            zVar.J1(1, 2, Float.valueOf(zVar.E0 * zVar.X.f6922g));
        }
    }

    public final int d(int i10, boolean z10) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderJ;
        if (i10 == 1 || this.f6921f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f6920e != 1) {
                int i11 = a5.d0.f105a;
                AudioManager audioManager = this.f6916a;
                com.google.android.exoplayer2.d dVar = this.f6917b;
                if (i11 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f6923h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            c8.b.t();
                            builderJ = c8.b.f(this.f6921f);
                        } else {
                            c8.b.t();
                            builderJ = c8.b.j(this.f6923h);
                        }
                        androidx.media3.common.f fVar = this.f6919d;
                        boolean z11 = fVar != null && fVar.f1619a == 1;
                        fVar.getClass();
                        this.f6923h = builderJ.setAudioAttributes((AudioAttributes) fVar.a().f2481d).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(dVar).build();
                    }
                    iRequestAudioFocus = audioManager.requestAudioFocus(this.f6923h);
                } else {
                    androidx.media3.common.f fVar2 = this.f6919d;
                    fVar2.getClass();
                    iRequestAudioFocus = audioManager.requestAudioFocus(dVar, a5.d0.y(fVar2.f1621g), this.f6921f);
                }
                if (iRequestAudioFocus == 1) {
                    c(1);
                    return 1;
                }
                c(0);
                return -1;
            }
        }
    }
}
