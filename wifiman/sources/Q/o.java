package Q;

import T.AbstractC3561w;
import T.H0;
import Y0.h;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import mh.InterfaceC6824a;
import s.InterfaceC7836I;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f18844a = AbstractC3561w.f(b.f18849a);

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f18845b = AbstractC3561w.d(null, a.f18848a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    private static final p f18846c;

    /* renamed from: d, reason: collision with root package name */
    private static final p f18847d;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18848a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return new m(0L, null, 3, null);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18849a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        h.a aVar = Y0.h.f24523b;
        float fC = aVar.c();
        C6733v0.a aVar2 = C6733v0.f52951b;
        f18846c = new p(true, fC, aVar2.e(), (DefaultConstructorMarker) null);
        f18847d = new p(false, aVar.c(), aVar2.e(), (DefaultConstructorMarker) null);
    }

    public static final H0 a() {
        return f18845b;
    }

    public static final InterfaceC7836I b(boolean z10, float f10, long j10) {
        return (Y0.h.n(f10, Y0.h.f24523b.c()) && C6733v0.m(j10, C6733v0.f52951b.e())) ? z10 ? f18846c : f18847d : new p(z10, f10, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InterfaceC7836I c(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = Y0.h.f24523b.c();
        }
        if ((i10 & 4) != 0) {
            j10 = C6733v0.f52951b.e();
        }
        return b(z10, f10, j10);
    }
}
