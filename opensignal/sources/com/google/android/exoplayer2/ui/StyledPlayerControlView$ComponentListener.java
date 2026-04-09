package com.google.android.exoplayer2.ui;

import android.view.View;
import android.widget.PopupWindow;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.e1;
import com.google.android.exoplayer2.g1;
import java.util.List;

/* loaded from: classes.dex */
final class StyledPlayerControlView$ComponentListener implements Player$Listener, b0, View.OnClickListener, PopupWindow.OnDismissListener {
    final /* synthetic */ y this$0;

    private StyledPlayerControlView$ComponentListener(y yVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10 = y.f4707a;
        throw null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        int i10 = y.f4707a;
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
    public void onEvents(g1 g1Var, e1 e1Var) {
        if (e1Var.b(5, 6)) {
            int i10 = y.f4707a;
            throw null;
        }
        if (e1Var.b(5, 6, 8)) {
            int i11 = y.f4707a;
            throw null;
        }
        if (e1Var.a(9)) {
            int i12 = y.f4707a;
            throw null;
        }
        if (e1Var.a(10)) {
            int i13 = y.f4707a;
            throw null;
        }
        if (e1Var.b(9, 10, 12, 0, 17, 18, 14)) {
            int i14 = y.f4707a;
            throw null;
        }
        if (e1Var.b(12, 0)) {
            int i15 = y.f4707a;
            throw null;
        }
        if (e1Var.a(13)) {
            int i16 = y.f4707a;
            throw null;
        }
        if (e1Var.a(2)) {
            int i17 = y.f4707a;
            throw null;
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
        int i10 = y.f4707a;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ui.b0
    public void onScrubStart(c0 c0Var, long j) {
        int i10 = y.f4707a;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ui.b0
    public void onScrubStop(c0 c0Var, long j, boolean z10) {
        int i10 = y.f4707a;
        throw null;
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
