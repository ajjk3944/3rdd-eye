package j6;

import H6.C0675l;
import N7.R3;
import android.view.View;
import j6.q;
import z6.C5865d;

/* compiled from: DivCustomContainerViewAdapter.kt */
/* loaded from: classes.dex */
public interface m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f43035b = new a();

    /* compiled from: DivCustomContainerViewAdapter.kt */
    public static final class a implements m {
        @Override // j6.m
        public final void bindView(View view, R3 div, C0675l divView, A7.d expressionResolver, C5865d c5865d) {
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(div, "div");
            kotlin.jvm.internal.l.f(divView, "divView");
            kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        }

        @Override // j6.m
        public final View createView(R3 div, C0675l divView, A7.d expressionResolver, C5865d path) {
            kotlin.jvm.internal.l.f(div, "div");
            kotlin.jvm.internal.l.f(divView, "divView");
            kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
            kotlin.jvm.internal.l.f(path, "path");
            throw new UnsupportedOperationException();
        }

        @Override // j6.m
        public final boolean isCustomTypeSupported(String type) {
            kotlin.jvm.internal.l.f(type, "type");
            return false;
        }

        @Override // j6.m
        public final q.c preload(R3 div, q.a aVar) {
            kotlin.jvm.internal.l.f(div, "div");
            return q.c.a.f43053a;
        }

        @Override // j6.m
        public final void release(View view, R3 div) {
            kotlin.jvm.internal.l.f(div, "div");
        }
    }

    void bindView(View view, R3 r32, C0675l c0675l, A7.d dVar, C5865d c5865d);

    View createView(R3 r32, C0675l c0675l, A7.d dVar, C5865d c5865d);

    boolean isCustomTypeSupported(String str);

    q.c preload(R3 r32, q.a aVar);

    void release(View view, R3 r32);
}
