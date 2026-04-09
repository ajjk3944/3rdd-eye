package K6;

import H6.C0672i;
import N7.C1175g0;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* compiled from: DivActionBinder.kt */
/* renamed from: K6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758u extends kotlin.jvm.internal.m implements p9.p<View, MotionEvent, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0745n f3637g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0672i f3638h;
    public final /* synthetic */ View i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3639j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3640k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0758u(C0745n c0745n, C0672i c0672i, View view, List<C1175g0> list, List<C1175g0> list2) {
        super(2);
        this.f3637g = c0745n;
        this.f3638h = c0672i;
        this.i = view;
        this.f3639j = list;
        this.f3640k = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    @Override // p9.p
    public final Boolean invoke(View view, MotionEvent motionEvent) {
        MotionEvent event = motionEvent;
        kotlin.jvm.internal.l.f(view, "<anonymous parameter 0>");
        kotlin.jvm.internal.l.f(event, "event");
        int action = event.getAction();
        C0745n c0745n = this.f3637g;
        View view2 = this.i;
        C0672i c0672i = this.f3638h;
        boolean z10 = true;
        if (action == 0) {
            c0745n.e(c0672i, view2, this.f3639j, "press");
        } else if (action == 1 || action == 3) {
            c0745n.e(c0672i, view2, this.f3640k, "release");
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
