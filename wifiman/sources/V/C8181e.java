package v;

import Y0.n;
import Y0.o;
import Y0.p;
import Y0.r;
import Y0.t;
import androidx.compose.ui.window.q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8181e implements q {

    /* renamed from: a, reason: collision with root package name */
    private final long f63288a;

    public /* synthetic */ C8181e(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // androidx.compose.ui.window.q
    public long a(p pVar, long j10, t tVar, long j11) {
        return o.a(AbstractC8182f.b(pVar.f() + n.h(this.f63288a), r.g(j11), r.g(j10), tVar == t.Ltr), AbstractC8182f.c(pVar.h() + n.i(this.f63288a), r.f(j11), r.f(j10), false, 8, null));
    }

    private C8181e(long j10) {
        this.f63288a = j10;
    }
}
