package l6;

import C6.e;
import H6.C0675l;
import N7.C1175g0;
import N7.C1190h0;
import N7.EnumC1346s2;
import N7.EnumC1360t2;
import N7.H3;
import N7.InterfaceC1416x2;
import android.animation.ObjectAnimator;
import java.util.List;

/* compiled from: DivVariableAnimatorBuilder.kt */
/* renamed from: l6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5294d {
    public static void a(ObjectAnimator objectAnimator, C0675l c0675l, InterfaceC1416x2 interfaceC1416x2, C1190h0 c1190h0, A7.d dVar) {
        EnumC1346s2 enumC1346s2A;
        EnumC1360t2 enumC1360t2A;
        A7.b<EnumC1346s2> bVar = c1190h0.f8310b;
        if (bVar == null || (enumC1346s2A = bVar.a(dVar)) == null) {
            enumC1346s2A = interfaceC1416x2.c().a(dVar);
        }
        A7.b<Long> duration = c1190h0.f8311c;
        if (duration == null) {
            duration = interfaceC1416x2.getDuration();
        }
        objectAnimator.setDuration(duration.a(dVar).longValue());
        A7.b<Long> bVarF = c1190h0.f8315g;
        if (bVarF == null) {
            bVarF = interfaceC1416x2.f();
        }
        objectAnimator.setStartDelay(bVarF.a(dVar).longValue());
        A7.b<EnumC1360t2> bVar2 = c1190h0.f8313e;
        if (bVar2 == null || (enumC1360t2A = bVar2.a(dVar)) == null) {
            enumC1360t2A = interfaceC1416x2.d().a(dVar);
        }
        kotlin.jvm.internal.l.f(enumC1346s2A, "<this>");
        int[] iArr = e.a.f945b;
        int i = iArr[enumC1346s2A.ordinal()];
        int i10 = 0;
        int i11 = 2;
        boolean z10 = i == 1 || i == 2;
        kotlin.jvm.internal.l.f(enumC1360t2A, "<this>");
        objectAnimator.setInterpolator(z10 ? new InterpolatorC5302l(C6.e.b(enumC1360t2A)) : C6.e.b(enumC1360t2A));
        H3 h3B = c1190h0.f8314f;
        if (h3B == null) {
            h3B = interfaceC1416x2.b();
        }
        if (h3B instanceof H3.a) {
            int iLongValue = ((int) ((H3.a) h3B).f5387b.f6004a.a(dVar).longValue()) - 1;
            if (iLongValue >= 0) {
                i10 = iLongValue;
            }
        } else {
            if (!(h3B instanceof H3.b)) {
                throw new b9.j();
            }
            i10 = -1;
        }
        objectAnimator.setRepeatCount(i10);
        int i12 = iArr[enumC1346s2A.ordinal()];
        if (i12 != 2 && i12 != 3) {
            i11 = 1;
        }
        objectAnimator.setRepeatMode(i11);
        List<C1175g0> listA = interfaceC1416x2.a();
        if (listA != null) {
            objectAnimator.addListener(new C5292b(listA, c0675l, dVar));
        }
        List<C1175g0> listE = interfaceC1416x2.e();
        if (listE != null) {
            objectAnimator.addListener(new C5293c(listE, c0675l, dVar));
        }
    }
}
