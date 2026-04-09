package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class me2 implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final ae2 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f = 1.0f;

    public me2(Context context, ae2 ae2Var) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = ae2Var;
    }

    public final void a() {
        boolean z = this.d;
        ae2 ae2Var = this.b;
        AudioManager audioManager = this.a;
        if (!z || this.e || this.f <= 0.0f) {
            if (this.c) {
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                ae2Var.m();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        if (audioManager != null) {
            this.c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        ae2Var.m();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.m();
    }
}
