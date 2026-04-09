package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC3852nF extends InterfaceC22272s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC3852nF A00 = new InterfaceC3852nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void ACv(C3898o0 c3898o0) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AD6(int i, C3796mL c3796mL, CG cg) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADw(int i, C3796mL c3796mL, CE ce, CG cg) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADy(int i, C3796mL c3796mL, CE ce, CG cg, Object obj, Object obj2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AE1(int i, C3796mL c3796mL, CE ce, CG cg, IOException iOException, boolean z10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void AEb(C3933ob c3933ob) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void AEd(C3935od c3935od) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void AEf(boolean z10, int i) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void AFQ(Timeline timeline, int i) {
            AbstractC22262r.A00(this, timeline, i);
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC22272s
        public final /* synthetic */ void AFU(C3904o6 c3904o6) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC3852nF
        public final void AC5() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC3852nF
        public final void AIv(InterfaceC22342z interfaceC22342z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC22342z interfaceC22342z, Looper looper);
}
