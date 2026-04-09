package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r24 {
    public final ll3 a;
    public final Handler b;
    public jb4 c;
    public in2 d;
    public int f;
    public jb2 h;
    public float g = 1.0f;
    public int e = 0;

    public r24(Context context, Looper looper, jb4 jb4Var) {
        this.a = i41.I(new ci3(2, context));
        this.c = jb4Var;
        this.b = new Handler(looper);
    }

    public final void a(in2 in2Var) {
        if (Objects.equals(this.d, in2Var)) {
            return;
        }
        this.d = in2Var;
        this.f = in2Var == null ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [k14] */
    public final int b(int i, boolean z) {
        if (i == 1 || this.f != 1) {
            d();
            e(0);
            return 1;
        }
        if (!z) {
            int i2 = this.e;
            if (i2 == 1) {
                return -1;
            }
            if (i2 == 3) {
                return 0;
            }
        } else if (this.e != 2) {
            if (this.h == null) {
                in2 in2Var = in2.b;
                in2 in2Var2 = this.d;
                in2Var2.getClass();
                ?? r2 = new AudioManager.OnAudioFocusChangeListener() { // from class: k14
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final /* synthetic */ void onAudioFocusChange(int i3) {
                        r24 r24Var = this.a;
                        r24Var.getClass();
                        if (i3 == -3 || i3 == -2) {
                            if (i3 != -2) {
                                r24Var.e(4);
                                return;
                            } else {
                                r24Var.f(0);
                                r24Var.e(3);
                                return;
                            }
                        }
                        if (i3 == -1) {
                            r24Var.f(-1);
                            r24Var.d();
                            r24Var.e(1);
                        } else if (i3 != 1) {
                            ga1.q(new StringBuilder(String.valueOf(i3).length() + 27), i3, "Unknown focus change type: ");
                        } else {
                            r24Var.e(2);
                            r24Var.f(1);
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new jb2(r2, handler, in2Var2);
            }
            AudioManager audioManager = (AudioManager) this.a.a();
            AudioFocusRequest audioFocusRequest = this.h.d;
            audioFocusRequest.getClass();
            if (audioManager.requestAudioFocus(audioFocusRequest) == 1) {
                e(2);
                return 1;
            }
            e(1);
            return -1;
        }
        return 1;
    }

    public final void c() {
        this.c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.a();
        AudioFocusRequest audioFocusRequest = this.h.d;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void e(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g != f) {
            this.g = f;
            jb4 jb4Var = this.c;
            if (jb4Var != null) {
                jb4Var.m.b(34);
            }
        }
    }

    public final void f(int i) {
        jb4 jb4Var = this.c;
        if (jb4Var != null) {
            Handler handler = jb4Var.m.a;
            v03 v03VarF = d13.f();
            v03VarF.a = handler.obtainMessage(33, i, 0);
            v03VarF.a();
        }
    }
}
