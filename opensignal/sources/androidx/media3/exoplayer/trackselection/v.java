package androidx.media3.exoplayer.trackselection;

import java.util.List;

/* loaded from: classes.dex */
public interface v extends TrackSelection {
    int a();

    void b();

    int c(long j, List list);

    void d();

    int e();

    void f(float f10);

    Object g();

    void h(long j, long j7, long j10, List list, p5.m[] mVarArr);

    default boolean i(long j, p5.e eVar, List list) {
        return false;
    }

    boolean j(int i10, long j);

    boolean k(int i10, long j);

    default void l(boolean z10) {
    }

    int m();

    androidx.media3.common.r n();

    default void o() {
    }

    default void p() {
    }
}
