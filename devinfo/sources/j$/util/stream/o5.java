package j$.util.stream;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class o5 extends c5 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f26696s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f26697t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(e5 e5Var, int i4, long j, long j8) {
        super(e5Var, i4);
        this.f26696s = j;
        this.f26697t = j8;
    }

    @Override // j$.util.stream.a
    public final Spliterator F0(a aVar, Spliterator spliterator) {
        long jI0 = aVar.i0(spliterator);
        if (jI0 > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            Spliterator spliteratorY0 = aVar.y0(spliterator);
            long j = this.f26696s;
            return new u7(spliteratorY0, j, x5.c(j, this.f26697t));
        }
        if (a7.ORDERED.l(aVar.f26462m)) {
            return ((e2) new w5(this, aVar, spliterator, new f2(0), this.f26696s, this.f26697t).invoke()).spliterator();
        }
        Spliterator spliteratorY02 = aVar.y0(spliterator);
        long j8 = this.f26696s;
        long j9 = this.f26697t;
        if (j8 <= jI0) {
            long jMin = jI0 - j8;
            if (j9 >= 0) {
                jMin = Math.min(j9, jMin);
            }
            j9 = jMin;
            j8 = 0;
        }
        return new a8(spliteratorY02, j8, j9);
    }

    @Override // j$.util.stream.a
    public final e2 E0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jI0 = v3Var.i0(spliterator);
        if (jI0 > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            a aVar = (a) v3Var;
            while (aVar.f26461l > 0) {
                aVar = aVar.f26459i;
            }
            return v3.Y(v3Var, x5.b(aVar.D0(), spliterator, this.f26696s, this.f26697t), true, intFunction);
        }
        if (!a7.ORDERED.l(((a) v3Var).f26462m)) {
            Spliterator spliteratorY0 = v3Var.y0(spliterator);
            long j8 = this.f26696s;
            long j9 = this.f26697t;
            if (j8 <= jI0) {
                long j10 = jI0 - j8;
                jMin = j9 >= 0 ? Math.min(j9, j10) : j10;
                j = 0;
            } else {
                jMin = j9;
                j = j8;
            }
            return v3.Y(this, new a8(spliteratorY0, j, jMin), true, intFunction);
        }
        return (e2) new w5(this, v3Var, spliterator, intFunction, this.f26696s, this.f26697t).invoke();
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        return new n5(this, m5Var);
    }
}
