package xi;

import android.media.AudioManager;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import java.util.concurrent.Executor;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public final class c extends androidx.lifecycle.o {
    public final List B;

    /* renamed from: g, reason: collision with root package name */
    public final AudioManager f25316g;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f25317r;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f25318x;

    /* renamed from: y, reason: collision with root package name */
    public int f25319y;

    /* JADX WARN: Type inference failed for: r9v4, types: [xi.b] */
    public c(AudioManager audioManager, ch.f fVar, Executor executor) {
        super(10, false);
        this.f25316g = audioManager;
        this.f25317r = executor;
        this.f25318x = m0.AUDIO_STATE_TRIGGER;
        this.f25319y = -2;
        this.B = e5.I(o0.AUDIO_ON_CALL, o0.AUDIO_NOT_ON_CALL, o0.AUDIO_ON_TELEPHONY_CALL, o0.AUDIO_NOT_ON_TELEPHONY_CALL, o0.AUDIO_ON_VOIP_CALL, o0.AUDIO_NOT_ON_VOIP_CALL);
        ch.n.b("AudioStateTriggerDataSource", "AudioManager registered");
        if (!fVar.g()) {
            ch.n.b("AudioStateTriggerDataSource", "AudioManager OnAudioFocusChanged registered");
        } else {
            ch.n.b("AudioStateTriggerDataSource", "AudioManager addOnModeChangedListener registered");
            audioManager.addOnModeChangedListener(executor, new AudioManager.OnModeChangedListener() { // from class: xi.b
                @Override // android.media.AudioManager.OnModeChangedListener
                public final void onModeChanged(int i10) {
                    c cVar = this.f25315a;
                    ch.n.b("AudioStateTriggerDataSource", h0.b.h(i10, "OnModeChanged called with: mode = "));
                    ch.n.b("AudioStateTriggerDataSource", "checkStateUpdated() called with: newState = " + i10);
                    if (cVar.f25319y != i10) {
                        cVar.f25319y = i10;
                        cVar.a1();
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f25318x;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.B;
    }
}
