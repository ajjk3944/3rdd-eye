package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.yandex.mobile.ads.impl.m60;

/* loaded from: classes3.dex */
final class mh {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f30377a;

    /* renamed from: b, reason: collision with root package name */
    private final a f30378b;

    /* renamed from: c, reason: collision with root package name */
    private b f30379c;

    /* renamed from: d, reason: collision with root package name */
    private ih f30380d;

    /* renamed from: f, reason: collision with root package name */
    private int f30382f;

    /* renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f30384h;

    /* renamed from: g, reason: collision with root package name */
    private float f30383g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f30381e = 0;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f30385a;

        public a(Handler handler) {
            this.f30385a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            this.f30385a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.H2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24130b.a(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            ih ihVar;
            mh mhVar = mh.this;
            if (i == -3 || i == -2) {
                if (i != -2 && ((ihVar = mhVar.f30380d) == null || ihVar.f28661b != 1)) {
                    mhVar.a(3);
                    return;
                }
                b bVar = mhVar.f30379c;
                if (bVar != null) {
                    ((m60.b) bVar).a(0);
                }
                mhVar.a(2);
                return;
            }
            if (i == -1) {
                b bVar2 = mhVar.f30379c;
                if (bVar2 != null) {
                    ((m60.b) bVar2).a(-1);
                }
                mhVar.a();
                return;
            }
            if (i != 1) {
                mhVar.getClass();
                rs0.d("AudioFocusManager", "Unknown focus change type: " + i);
                return;
            }
            mhVar.a(1);
            b bVar3 = mhVar.f30379c;
            if (bVar3 != null) {
                ((m60.b) bVar3).a(1);
            }
        }
    }

    public interface b {
    }

    public mh(Context context, Handler handler, b bVar) {
        this.f30377a = (AudioManager) zf.a((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f30379c = bVar;
        this.f30378b = new a(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f30381e == 0) {
            return;
        }
        if (s82.f32899a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f30384h;
            if (audioFocusRequest != null) {
                this.f30377a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f30377a.abandonAudioFocus(this.f30378b);
        }
        a(0);
    }

    public final float b() {
        return this.f30383g;
    }

    public final void c() {
        this.f30379c = null;
        a();
    }

    public final void d() {
        if (s82.a(this.f30380d, (Object) null)) {
            return;
        }
        this.f30380d = null;
        this.f30382f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.f30381e == i) {
            return;
        }
        this.f30381e = i;
        float f10 = i == 3 ? 0.2f : 1.0f;
        if (this.f30383g == f10) {
            return;
        }
        this.f30383g = f10;
        b bVar = this.f30379c;
        if (bVar != null) {
            ((m60.b) bVar).e();
        }
    }

    public final int a(boolean z10, int i) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderA;
        if (i == 1 || this.f30382f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f30381e != 1) {
                if (s82.f32899a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f30384h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            D2.a();
                            builderA = F2.a(this.f30382f);
                        } else {
                            D2.a();
                            builderA = G2.a(this.f30384h);
                        }
                        ih ihVar = this.f30380d;
                        boolean z11 = ihVar != null && ihVar.f28661b == 1;
                        ihVar.getClass();
                        this.f30384h = builderA.setAudioAttributes(ihVar.a().f28667a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f30378b).build();
                    }
                    iRequestAudioFocus = this.f30377a.requestAudioFocus(this.f30384h);
                } else {
                    AudioManager audioManager = this.f30377a;
                    a aVar = this.f30378b;
                    ih ihVar2 = this.f30380d;
                    ihVar2.getClass();
                    iRequestAudioFocus = audioManager.requestAudioFocus(aVar, s82.c(ihVar2.f28663d), this.f30382f);
                }
                if (iRequestAudioFocus == 1) {
                    a(1);
                    return 1;
                }
                a(0);
                return -1;
            }
        }
    }
}
