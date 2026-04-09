package H6;

import K6.C0719e;
import N7.B9;
import N7.C1370tc;
import android.view.View;
import b9.C1992A;
import h7.C4421b;
import h7.C4422c;
import j6.g;
import java.util.UUID;
import m0.C5308a;
import p9.InterfaceC5480a;

/* compiled from: DivVisibilityActionDispatcher.kt */
/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B9[] f2054g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K f2055h;
    public final /* synthetic */ C0675l i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f2056j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2057k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(B9[] b9Arr, K k10, C0675l c0675l, A7.d dVar, View view) {
        super(0);
        this.f2054g = b9Arr;
        this.f2055h = k10;
        this.i = c0675l;
        this.f2056j = dVar;
        this.f2057k = view;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        B9[] b9Arr = this.f2054g;
        int length = b9Arr.length;
        int i = 0;
        int i10 = 0;
        while (i10 < length) {
            B9 action = b9Arr[i10];
            K k10 = this.f2055h;
            C0675l scope = this.i;
            kotlin.jvm.internal.l.f(scope, "scope");
            A7.d resolver = this.f2056j;
            kotlin.jvm.internal.l.f(resolver, "resolver");
            View view = this.f2057k;
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(action, "action");
            C0673j c0673jP = A9.I.p(scope, action.g().a(resolver));
            boolean z10 = action instanceof C1370tc;
            C5308a c5308a = k10.f2063f;
            C5308a c5308a2 = k10.f2062e;
            C5308a c5308a3 = z10 ? c5308a2 : c5308a;
            Object objValueOf = c5308a3.get(c0673jP);
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(i);
                c5308a3.put(c0673jP, objValueOf);
            }
            int iIntValue = ((Number) objValueOf).intValue();
            int i11 = C4421b.f38269a;
            C4421b.a(C7.a.INFO);
            long jLongValue = action.f().a(resolver).longValue();
            int i12 = i10;
            if (jLongValue == 0 || iIntValue < jLongValue) {
                j6.h hVar = k10.f2060c;
                boolean useActionUid = hVar.getUseActionUid();
                C0719e c0719e = k10.f2061d;
                g.a aVar = k10.f2058a;
                if (useActionUid) {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.l.e(string, "randomUUID().toString()");
                    j6.h actionHandler = scope.getActionHandler();
                    if (!(actionHandler != null ? actionHandler.handleAction(action, scope, resolver, string) : false) && !hVar.handleAction(action, scope, resolver, string)) {
                        if (z10) {
                            aVar.getClass();
                        } else {
                            aVar.getClass();
                        }
                        c0719e.c(action, resolver);
                    }
                } else {
                    j6.h actionHandler2 = scope.getActionHandler();
                    if (!(actionHandler2 != null ? actionHandler2.handleAction(action, scope, resolver) : false) && !hVar.handleAction(action, scope, resolver)) {
                        if (z10) {
                            aVar.getClass();
                        } else {
                            aVar.getClass();
                        }
                        c0719e.c(action, resolver);
                    }
                }
                if (z10) {
                    c5308a = c5308a2;
                }
                c5308a.put(c0673jP, Integer.valueOf(iIntValue + 1));
                int i13 = C4422c.f38270a;
            }
            i10 = i12 + 1;
            i = 0;
        }
        return C1992A.f18074a;
    }
}
