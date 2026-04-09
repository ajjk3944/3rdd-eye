package I6;

import K1.z;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: OutlineAwareVisibility.kt */
/* loaded from: classes.dex */
public class i extends z {

    /* compiled from: Transitions.kt */
    public static final class a extends K1.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r7.r f2544b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ K1.p f2545c;

        public a(r7.r rVar, K1.p pVar) {
            this.f2544b = rVar;
            this.f2545c = pVar;
        }

        @Override // K1.i.d
        public final void a(K1.i iVar) {
            r7.r rVar = this.f2544b;
            if (rVar != null) {
                View view = this.f2545c.f3032b;
                kotlin.jvm.internal.l.e(view, "endValues.view");
                rVar.j(view);
            }
            i.this.z(this);
        }
    }

    /* compiled from: Transitions.kt */
    public static final class b extends K1.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r7.r f2547b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ K1.p f2548c;

        public b(r7.r rVar, K1.p pVar) {
            this.f2547b = rVar;
            this.f2548c = pVar;
        }

        @Override // K1.i.d
        public final void a(K1.i iVar) {
            r7.r rVar = this.f2547b;
            if (rVar != null) {
                View view = this.f2548c.f3032b;
                kotlin.jvm.internal.l.e(view, "startValues.view");
                rVar.j(view);
            }
            i.this.z(this);
        }
    }

    @Override // K1.z
    public final Animator O(ViewGroup sceneRoot, K1.p pVar, int i, K1.p pVar2, int i10) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        Object obj = pVar2 != null ? pVar2.f3032b : null;
        r7.r rVar = obj instanceof r7.r ? (r7.r) obj : null;
        if (rVar != null) {
            View view = pVar2.f3032b;
            kotlin.jvm.internal.l.e(view, "endValues.view");
            rVar.e(view);
        }
        a(new a(rVar, pVar2));
        return super.O(sceneRoot, pVar, i, pVar2, i10);
    }

    @Override // K1.z
    public final Animator Q(ViewGroup sceneRoot, K1.p pVar, int i, K1.p pVar2, int i10) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        Object obj = pVar != null ? pVar.f3032b : null;
        r7.r rVar = obj instanceof r7.r ? (r7.r) obj : null;
        if (rVar != null) {
            View view = pVar.f3032b;
            kotlin.jvm.internal.l.e(view, "startValues.view");
            rVar.e(view);
        }
        a(new b(rVar, pVar));
        return super.Q(sceneRoot, pVar, i, pVar2, i10);
    }
}
