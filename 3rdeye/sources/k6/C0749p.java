package K6;

import Q9.C1537j0;
import b9.C1992A;
import c9.C2099t;
import d2.C4268c;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* compiled from: DivActionBinder.kt */
/* renamed from: K6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749p extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3572h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0749p(Object obj, int i) {
        super(1);
        this.f3571g = i;
        this.f3572h = obj;
    }

    @Override // p9.l
    public final Object invoke(Object it) {
        C2099t c2099t = C2099t.f18581b;
        int i = 1;
        Object obj = this.f3572h;
        switch (this.f3571g) {
            case 0:
                kotlin.jvm.internal.l.f(it, "it");
                ((C0751q) obj).invoke();
                return C1992A.f18074a;
            case 1:
                Exception it2 = (Exception) it;
                kotlin.jvm.internal.l.f(it2, "it");
                ((D0) obj).invoke(it2, F0.f3218g);
                return C1992A.f18074a;
            case 2:
                ((O6.w) obj).setTextColor(((Number) it).intValue());
                return C1992A.f18074a;
            case 3:
                int iIntValue = ((Number) it).intValue();
                M6.t tVar = (M6.t) obj;
                Q1.f viewPager = tVar.f4300a.getViewPager();
                if (iIntValue != 0 && iIntValue != tVar.f4302c.f4227v.c() - 1) {
                    i = -1;
                }
                viewPager.setOffscreenPageLimit(i);
                return C1992A.f18074a;
            case 4:
                O9.a buildSerialDescriptor = (O9.a) it;
                kotlin.jvm.internal.l.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((M9.a) obj).getClass();
                buildSerialDescriptor.f10482b = c2099t;
                return C1992A.f18074a;
            case 5:
                O9.a buildSerialDescriptor2 = (O9.a) it;
                kotlin.jvm.internal.l.f(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                ((C1537j0) obj).getClass();
                buildSerialDescriptor2.f10482b = c2099t;
                return C1992A.f18074a;
            case 6:
                kotlin.jvm.internal.l.f((IOException) it, "it");
                byte[] bArr = V9.b.f13053a;
                ((W9.d) obj).f13380k = true;
                return C1992A.f18074a;
            case 7:
                Throwable th = (Throwable) it;
                androidx.work.k kVar = (androidx.work.k) obj;
                if (th == null) {
                    if (!kVar.f16945b.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    kVar.f16945b.cancel(true);
                } else {
                    C4268c<R> c4268c = kVar.f16945b;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    c4268c.j(th);
                }
                return C1992A.f18074a;
            default:
                return String.format(((k3.e) obj).getLocale(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((Number) it).floatValue())}, 1));
        }
    }
}
