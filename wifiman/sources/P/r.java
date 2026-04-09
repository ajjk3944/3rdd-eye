package P;

import T.InterfaceC3540l;
import m0.AbstractC6737x0;
import m0.C6733v0;

/* loaded from: classes.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17968a = a.f17969a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f17969a = new a();

        private a() {
        }

        public final g a(long j10, boolean z10) {
            return z10 ? ((double) AbstractC6737x0.i(j10)) > 0.5d ? s.f17971b : s.f17972c : s.f17973d;
        }

        public final long b(long j10, boolean z10) {
            return (z10 || ((double) AbstractC6737x0.i(j10)) >= 0.5d) ? j10 : C6733v0.f52951b.f();
        }
    }

    g a(InterfaceC3540l interfaceC3540l, int i10);

    long b(InterfaceC3540l interfaceC3540l, int i10);
}
