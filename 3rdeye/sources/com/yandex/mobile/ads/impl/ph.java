package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import com.yandex.mobile.ads.impl.nh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface ph {

    public static final class b extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f31748b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f31749c;

        /* renamed from: d, reason: collision with root package name */
        public final dc0 f31750d;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int i, int i10, int i11, int i12, dc0 dc0Var, boolean z10, RuntimeException runtimeException) {
            StringBuilder sbI = androidx.work.s.i("AudioTrack init failed ", i, " Config(", i10, ", ");
            C1094a9.k(sbI, i11, ", ", i12, ")");
            sbI.append(z10 ? " (recoverable)" : "");
            super(sbI.toString(), runtimeException);
            this.f31748b = i;
            this.f31749c = z10;
            this.f31750d = dc0Var;
        }
    }

    public interface c {
    }

    public static final class d extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public d(long j4, long j10) {
            StringBuilder sbJ = androidx.work.s.j("Unexpected audio track timestamp discontinuity: expected ", ", got ", j10);
            sbJ.append(j4);
            super(sbJ.toString());
        }
    }

    public static final class e extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f31751b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f31752c;

        /* renamed from: d, reason: collision with root package name */
        public final dc0 f31753d;

        public e(int i, dc0 dc0Var, boolean z10) {
            super(fe.a("AudioTrack write failed: ", i));
            this.f31752c = z10;
            this.f31751b = i;
            this.f31753d = dc0Var;
        }
    }

    long a(boolean z10);

    void a(int i);

    void a(ci ciVar);

    void a(dc0 dc0Var, int[] iArr) throws a;

    void a(gi1 gi1Var);

    void a(ih ihVar);

    void a(vh1 vh1Var);

    boolean a();

    boolean a(dc0 dc0Var);

    boolean a(ByteBuffer byteBuffer, long j4, int i) throws b, e;

    int b(dc0 dc0Var);

    void b();

    void b(boolean z10);

    void c();

    void d() throws e;

    boolean e();

    void f();

    void flush();

    void g();

    vh1 getPlaybackParameters();

    void pause();

    void play();

    void setVolume(float f10);

    public static final class a extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final dc0 f31747b;

        public a(nh.b bVar, dc0 dc0Var) {
            super(bVar);
            this.f31747b = dc0Var;
        }

        public a(String str, dc0 dc0Var) {
            super(str);
            this.f31747b = dc0Var;
        }
    }
}
