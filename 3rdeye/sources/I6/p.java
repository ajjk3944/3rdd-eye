package I6;

import A7.b;
import N7.C1332r2;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C1332r2 f2579a = new C1332r2(b.a.a(100L), b.a.a(Double.valueOf(0.6d)), b.a.a(C1332r2.a.FADE), b.a.a(Double.valueOf(1.0d)));

    /* compiled from: Utils.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2580a;

        static {
            int[] iArr = new int[C1332r2.a.values().length];
            try {
                iArr[C1332r2.a.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1332r2.a.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1332r2.a.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1332r2.a.NO_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2580a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    public static final void a(K1.p pVar, p9.l<? super int[], C1992A> lVar) {
        ?? r02 = new int[2];
        pVar.f3032b.getLocationOnScreen(r02);
        lVar.invoke(r02);
    }

    public static final View b(i iVar, View view, ViewGroup sceneRoot, K1.p values, String str) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        kotlin.jvm.internal.l.f(values, "values");
        if (kotlin.jvm.internal.l.b(values.f3032b, view) || !C6.r.c(view)) {
            return view;
        }
        Object obj = values.f3031a.get(str);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return v.a(view, sceneRoot, iVar, (int[]) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v25, types: [android.view.animation.AlphaAnimation] */
    /* JADX WARN: Type inference failed for: r9v5, types: [v9.e, v9.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.animation.Animation c(N7.C1332r2 r22, A7.d r23, boolean r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.p.c(N7.r2, A7.d, boolean, android.view.View):android.view.animation.Animation");
    }
}
