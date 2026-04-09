package l5;

import a5.d0;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler.Callback f14677b;

    public /* synthetic */ a(Object obj, Handler.Callback callback, int i10) {
        this.f14676a = i10;
        this.f14677b = callback;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j7) {
        switch (this.f14676a) {
            case 0:
                rb.f fVar = (rb.f) this.f14677b;
                Handler handler = fVar.f21458d;
                if (d0.f105a >= 30) {
                    fVar.a(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            case 1:
                rb.f fVar2 = (rb.f) this.f14677b;
                Handler handler2 = fVar2.f21458d;
                if (d0.f105a >= 30) {
                    fVar2.a(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                rb.f fVar3 = (rb.f) this.f14677b;
                Handler handler3 = fVar3.f21458d;
                if (qb.v.f20828a < 30) {
                    handler3.sendMessageAtFrontOfQueue(Message.obtain(handler3, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    rb.g gVar = (rb.g) fVar3.f21459g;
                    if (fVar3 == gVar.G1) {
                        if (j == Long.MAX_VALUE) {
                            gVar.S0 = true;
                            break;
                        } else {
                            try {
                                gVar.k0(j);
                                gVar.s0();
                                gVar.U0.f26783b++;
                                gVar.r0();
                                gVar.U(j);
                                break;
                            } catch (com.google.android.exoplayer2.n e4) {
                                gVar.T0 = e4;
                            }
                        }
                    }
                }
                break;
        }
    }
}
