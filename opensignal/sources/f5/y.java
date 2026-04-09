package f5;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class y extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8600b;

    public /* synthetic */ y(int i10, Object obj) {
        this.f8599a = i10;
        this.f8600b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        z zVar;
        b9.e eVar;
        d5.a0 a0Var;
        com.google.android.exoplayer2.a0 a0Var2;
        switch (this.f8599a) {
            case 0:
                if (audioTrack.equals(((z) ((bm.d) this.f8600b).f2828r).f8625u) && (eVar = (zVar = (z) ((bm.d) this.f8600b).f2828r).f8622r) != null && zVar.U && (a0Var = ((d0) eVar.f2481d).f8465i1) != null) {
                    a0Var.f6924a.D.e(2);
                    break;
                }
                break;
            default:
                qb.b.j(audioTrack == ((y9.s) ((qm.c) this.f8600b).f20920r).f25985r);
                y9.s sVar = (y9.s) ((qm.c) this.f8600b).f20920r;
                y9.u uVar = sVar.f25982o;
                if (uVar != null && sVar.R && (a0Var2 = ((y9.v) uVar.f25996d).f26006j1) != null) {
                    a0Var2.f4046a.B.c(2);
                    break;
                }
                break;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        z zVar;
        b9.e eVar;
        d5.a0 a0Var;
        com.google.android.exoplayer2.a0 a0Var2;
        switch (this.f8599a) {
            case 0:
                if (audioTrack.equals(((z) ((bm.d) this.f8600b).f2828r).f8625u) && (eVar = (zVar = (z) ((bm.d) this.f8600b).f2828r).f8622r) != null && zVar.U && (a0Var = ((d0) eVar.f2481d).f8465i1) != null) {
                    a0Var.f6924a.D.e(2);
                    break;
                }
                break;
            default:
                qb.b.j(audioTrack == ((y9.s) ((qm.c) this.f8600b).f20920r).f25985r);
                y9.s sVar = (y9.s) ((qm.c) this.f8600b).f20920r;
                y9.u uVar = sVar.f25982o;
                if (uVar != null && sVar.R && (a0Var2 = ((y9.v) uVar.f25996d).f26006j1) != null) {
                    a0Var2.f4046a.B.c(2);
                    break;
                }
                break;
        }
    }
}
