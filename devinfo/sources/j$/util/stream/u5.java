package j$.util.stream;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class u5 extends w {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f26769s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f26770t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(y yVar, int i4, long j, long j8) {
        super(yVar, i4);
        this.f26769s = j;
        this.f26770t = j8;
    }

    @Override // j$.util.stream.a
    public final Spliterator F0(a aVar, Spliterator spliterator) {
        long jI0 = aVar.i0(spliterator);
        if (jI0 > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            j$.util.u0 u0Var = (j$.util.u0) aVar.y0(spliterator);
            long j = this.f26769s;
            return new q7(u0Var, j, x5.c(j, this.f26770t));
        }
        if (a7.ORDERED.l(aVar.f26462m)) {
            return ((e2) new w5(this, aVar, spliterator, new f2(11), this.f26769s, this.f26770t).invoke()).spliterator();
        }
        j$.util.u0 u0Var2 = (j$.util.u0) aVar.y0(spliterator);
        long j8 = this.f26769s;
        long j9 = this.f26770t;
        if (j8 <= jI0) {
            long jMin = jI0 - j8;
            if (j9 >= 0) {
                jMin = Math.min(j9, jMin);
            }
            j9 = jMin;
            j8 = 0;
        }
        return new w7(u0Var2, j8, j9);
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
            return v3.Z(v3Var, x5.b(aVar.D0(), spliterator, this.f26769s, this.f26770t), true);
        }
        if (!a7.ORDERED.l(((a) v3Var).f26462m)) {
            j$.util.u0 u0Var = (j$.util.u0) v3Var.y0(spliterator);
            long j8 = this.f26769s;
            long j9 = this.f26770t;
            if (j8 <= jI0) {
                long j10 = jI0 - j8;
                jMin = j9 >= 0 ? Math.min(j9, j10) : j10;
                j = 0;
            } else {
                jMin = j9;
                j = j8;
            }
            return v3.Z(this, new w7(u0Var, j, jMin), true);
        }
        return (e2) new w5(this, v3Var, spliterator, intFunction, this.f26769s, this.f26770t).invoke();
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        return new t5(this, m5Var);
    }
}
