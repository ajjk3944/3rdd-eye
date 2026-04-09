package com.google.android.exoplayer2.ui;

import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.e1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.w1;
import java.util.List;

/* loaded from: classes.dex */
final class PlayerControlView$ComponentListener implements Player$Listener, b0, View.OnClickListener {
    final /* synthetic */ k this$0;

    private PlayerControlView$ComponentListener(k kVar) {
        this.this$0 = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k kVar = this.this$0;
        g1 g1Var = kVar.f4673f0;
        if (g1Var == null) {
            return;
        }
        if (kVar.f4686r == view) {
            ((cg.e) kVar.f4675g0).o(g1Var);
            return;
        }
        if (kVar.f4674g == view) {
            ((cg.e) kVar.f4675g0).p(g1Var);
            return;
        }
        if (kVar.B == view) {
            if (g1Var.getPlaybackState() != 4) {
                ((cg.e) this.this$0.f4675g0).getClass();
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) g1Var;
                long currentPosition = oVar.getCurrentPosition() + oVar.getSeekForwardIncrement();
                long duration = oVar.getDuration();
                if (duration != -9223372036854775807L) {
                    currentPosition = Math.min(currentPosition, duration);
                }
                oVar.seekTo(oVar.getCurrentWindowIndex(), Math.max(currentPosition, 0L));
                return;
            }
            return;
        }
        if (kVar.D == view) {
            ((cg.e) kVar.f4675g0).getClass();
            androidx.lifecycle.o oVar2 = (androidx.lifecycle.o) g1Var;
            long currentPosition2 = oVar2.getCurrentPosition() + (-oVar2.getSeekBackIncrement());
            long duration2 = oVar2.getDuration();
            if (duration2 != -9223372036854775807L) {
                currentPosition2 = Math.min(currentPosition2, duration2);
            }
            oVar2.seekTo(oVar2.getCurrentWindowIndex(), Math.max(currentPosition2, 0L));
            return;
        }
        if (kVar.f4693x == view) {
            kVar.b(g1Var);
            return;
        }
        if (kVar.f4695y == view) {
            ((cg.e) kVar.f4675g0).getClass();
            g1Var.setPlayWhenReady(false);
            return;
        }
        if (kVar.E != view) {
            if (kVar.F == view) {
                com.google.android.exoplayer2.i iVar = kVar.f4675g0;
                boolean z10 = !g1Var.getShuffleModeEnabled();
                ((cg.e) iVar).getClass();
                g1Var.setShuffleModeEnabled(z10);
                return;
            }
            return;
        }
        com.google.android.exoplayer2.i iVar2 = kVar.f4675g0;
        int repeatMode = g1Var.getRepeatMode();
        int i10 = this.this$0.f4682n0;
        for (int i11 = 1; i11 <= 2; i11++) {
            int i12 = (repeatMode + i11) % 3;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2 || (i10 & 2) == 0) {
                    }
                } else if ((i10 & 1) == 0) {
                }
            }
            repeatMode = i12;
        }
        ((cg.e) iVar2).getClass();
        g1Var.setRepeatMode(repeatMode);
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onEvents(g1 g1Var, e1 e1Var) {
        if (e1Var.b(5, 6)) {
            k kVar = this.this$0;
            int i10 = k.A0;
            kVar.i();
        }
        if (e1Var.b(5, 6, 8)) {
            k kVar2 = this.this$0;
            int i11 = k.A0;
            kVar2.j();
        }
        if (e1Var.a(9)) {
            k kVar3 = this.this$0;
            int i12 = k.A0;
            kVar3.k();
        }
        if (e1Var.a(10)) {
            k kVar4 = this.this$0;
            int i13 = k.A0;
            kVar4.l();
        }
        if (e1Var.b(9, 10, 12, 0, 14)) {
            k kVar5 = this.this$0;
            int i14 = k.A0;
            kVar5.h();
        }
        if (e1Var.b(12, 0)) {
            k kVar6 = this.this$0;
            int i15 = k.A0;
            kVar6.m();
        }
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
    }

    @Override // com.google.android.exoplayer2.ui.b0
    public void onScrubMove(c0 c0Var, long j) {
        k kVar = this.this$0;
        TextView textView = kVar.I;
        if (textView != null) {
            textView.setText(qb.v.w(kVar.K, kVar.L, j));
        }
    }

    @Override // com.google.android.exoplayer2.ui.b0
    public void onScrubStart(c0 c0Var, long j) {
        k kVar = this.this$0;
        kVar.f4679k0 = true;
        TextView textView = kVar.I;
        if (textView != null) {
            textView.setText(qb.v.w(kVar.K, kVar.L, j));
        }
    }

    @Override // com.google.android.exoplayer2.ui.b0
    public void onScrubStop(c0 c0Var, long j, boolean z10) {
        g1 g1Var;
        k kVar = this.this$0;
        int currentWindowIndex = 0;
        kVar.f4679k0 = false;
        if (z10 || (g1Var = kVar.f4673f0) == null) {
            return;
        }
        w1 currentTimeline = g1Var.getCurrentTimeline();
        if (kVar.f4678j0 && !currentTimeline.p()) {
            int iO = currentTimeline.o();
            while (true) {
                long jD = com.google.android.exoplayer2.h.d(currentTimeline.m(currentWindowIndex, kVar.N, 0L).f4751n);
                if (j < jD) {
                    break;
                }
                if (currentWindowIndex == iO - 1) {
                    j = jD;
                    break;
                } else {
                    j -= jD;
                    currentWindowIndex++;
                }
            }
        } else {
            currentWindowIndex = g1Var.getCurrentWindowIndex();
        }
        ((cg.e) kVar.f4675g0).getClass();
        g1Var.seekTo(currentWindowIndex, j);
        kVar.j();
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    @Deprecated
    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
    }

    @Override // com.google.android.exoplayer2.Player$Listener, rb.r
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
