package B6;

import N7.C1332r2;
import N7.C1439yb;
import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import java.util.Iterator;
import java.util.List;
import l6.C5295e;

/* compiled from: DivTooltipAnimation.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: DivTooltipAnimation.kt */
    /* renamed from: B6.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0003a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f511a;

        static {
            int[] iArr = new int[C1332r2.a.values().length];
            try {
                iArr[C1332r2.a.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1332r2.a.TRANSLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1332r2.a.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1332r2.a.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1332r2.a.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1332r2.a.NO_ANIMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f511a = iArr;
        }
    }

    public static final TransitionSet a(C1439yb c1439yb, A7.d dVar) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new r(c1439yb.f9983j.a(dVar), null)).setInterpolator((TimeInterpolator) new C5295e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [B6.r] */
    /* JADX WARN: Type inference failed for: r0v7, types: [B6.p] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    public static final Transition b(C1332r2 c1332r2, C1439yb.a aVar, boolean z10, A7.d dVar) {
        ?? fade;
        Transition duration;
        int i = C0003a.f511a[c1332r2.f9025e.a(dVar).ordinal()];
        A7.b<Double> bVar = c1332r2.f9022b;
        A7.b<Double> bVar2 = c1332r2.f9028h;
        switch (i) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                if (z10) {
                    bVar = bVar2;
                }
                fade = new r(aVar, bVar != null ? Float.valueOf((float) bVar.a(dVar).doubleValue()) : null);
                break;
            case 3:
                if (z10) {
                    bVar = bVar2;
                }
                fade = new p(bVar != null ? (float) bVar.a(dVar).doubleValue() : 1.0f);
                break;
            case 4:
                fade = new TransitionSet();
                List<C1332r2> list = c1332r2.f9024d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(b((C1332r2) it.next(), aVar, z10, dVar));
                    }
                    break;
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                throw new b9.j();
        }
        if (fade == 0 || (duration = fade.setDuration(c1332r2.f9021a.a(dVar).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(C6.e.b(c1332r2.f9023c.a(dVar)));
    }
}
