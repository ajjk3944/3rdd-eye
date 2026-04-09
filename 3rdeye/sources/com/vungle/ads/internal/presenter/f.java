package com.vungle.ads.internal.presenter;

import A2.l;
import C.S;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import b0.C1811b;
import d0.k;
import d0.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23818d;

    public /* synthetic */ f(Object obj, long j4, int i) {
        this.f23816b = i;
        this.f23818d = obj;
        this.f23817c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23816b) {
            case 0:
                g.m91processCommand$lambda12((g) this.f23818d, this.f23817c);
                return;
            default:
                s sVar = (s) this.f23818d;
                long j4 = this.f23817c;
                switch (sVar.f37276t) {
                    case CONFIGURED:
                        sVar.f37280x = null;
                        S.a(sVar.f37258a, "Start on ".concat(Y.d.a(j4)));
                        try {
                            if (sVar.f37254A) {
                                sVar.i();
                            }
                            sVar.f37277u = Range.create(Long.valueOf(j4), Long.MAX_VALUE);
                            sVar.f37262e.start();
                            k.b bVar = sVar.f37263f;
                            if (bVar instanceof s.a) {
                                ((s.a) bVar).f(true);
                            }
                            sVar.k(s.b.STARTED);
                            return;
                        } catch (MediaCodec.CodecException e4) {
                            sVar.b(1, e4.getMessage(), e4);
                            return;
                        }
                    case STARTED:
                    case PENDING_START:
                    case ERROR:
                        return;
                    case PAUSED:
                        sVar.f37280x = null;
                        Range range = (Range) sVar.f37271o.removeLast();
                        l.q("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l5 = (Long) range.getLower();
                        long jLongValue = l5.longValue();
                        sVar.f37271o.addLast(Range.create(l5, Long.valueOf(j4)));
                        S.a(sVar.f37258a, "Resume on " + Y.d.a(j4) + "\nPaused duration = " + Y.d.a(j4 - jLongValue));
                        if ((sVar.f37260c || C1811b.f17055a.e(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!sVar.f37260c || C1811b.f17055a.e(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            sVar.f37262e.setParameters(bundle);
                            k.b bVar2 = sVar.f37263f;
                            if (bVar2 instanceof s.a) {
                                ((s.a) bVar2).f(true);
                            }
                        }
                        if (sVar.f37260c) {
                            sVar.h();
                        }
                        sVar.k(s.b.STARTED);
                        return;
                    case STOPPING:
                    case PENDING_START_PAUSED:
                        sVar.k(s.b.PENDING_START);
                        return;
                    case PENDING_RELEASE:
                    case RELEASED:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + sVar.f37276t);
                }
        }
    }
}
