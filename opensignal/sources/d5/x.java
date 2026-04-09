package d5;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class x implements s5.d, t5.a, r0 {

    /* renamed from: a, reason: collision with root package name */
    public s5.d f7098a;

    /* renamed from: d, reason: collision with root package name */
    public t5.a f7099d;

    public final void a(long j, float[] fArr) {
        t5.a aVar = this.f7099d;
        if (aVar != null) {
            ((x) aVar).a(j, fArr);
        }
    }

    public final void d() {
        t5.a aVar = this.f7099d;
        if (aVar != null) {
            ((x) aVar).d();
        }
    }

    @Override // d5.r0
    public final void e(int i10, Object obj) {
        if (i10 == 7) {
            this.f7098a = (s5.d) obj;
        } else if (i10 == 8) {
            this.f7099d = (t5.a) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void f(long j, long j7, androidx.media3.common.r rVar, MediaFormat mediaFormat) {
        s5.d dVar = this.f7098a;
        if (dVar != null) {
            ((x) dVar).f(j, j7, rVar, mediaFormat);
        }
    }
}
