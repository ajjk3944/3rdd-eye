package d0;

import android.media.MediaCodec;

/* compiled from: EncoderImpl.java */
/* loaded from: classes.dex */
public final class q implements I.c<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A3.c f37249b;

    public q(A3.c cVar) {
        this.f37249b = cVar;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        boolean z10 = th instanceof MediaCodec.CodecException;
        A3.c cVar = this.f37249b;
        if (!z10) {
            ((s) cVar.f36c).b(0, th.getMessage(), th);
            return;
        }
        s sVar = (s) cVar.f36c;
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
        sVar.getClass();
        sVar.b(1, codecException.getMessage(), codecException);
    }

    @Override // I.c
    public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
    }
}
