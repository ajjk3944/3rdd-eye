package io.sentry.compose.gestures;

import android.view.View;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.internal.gestures.a;
import io.sentry.internal.gestures.b;
import io.sentry.internal.gestures.c;
import io.sentry.q;
import io.sentry.u0;
import io.sentry.z4;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import v1.m;
import v1.s;
import vc.e;
import x1.f0;
import x1.r;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/compose/gestures/ComposeGestureTargetLocator;", "Lio/sentry/internal/gestures/a;", "Lio/sentry/u0;", "logger", "<init>", "(Lio/sentry/u0;)V", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeGestureTargetLocator implements a {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f12166a;

    /* renamed from: b, reason: collision with root package name */
    public volatile io.sentry.compose.a f12167b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f12168c;

    public ComposeGestureTargetLocator(u0 u0Var) {
        l.e(u0Var, "logger");
        this.f12166a = u0Var;
        this.f12168c = new io.sentry.util.a();
        z4.d().b("maven:io.sentry:sentry-compose", "8.25.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.internal.gestures.a
    public final c a(View view, float f10, float f11, b bVar) throws InterruptedException {
        c cVar;
        String str;
        f0 f0Var;
        String str2;
        String str3;
        f1.c cVar2;
        long j;
        l.e(bVar, "targetType");
        c cVar3 = null;
        if (!(view instanceof Owner)) {
            return null;
        }
        if (this.f12167b == null) {
            q qVarA = this.f12168c.a();
            try {
                if (this.f12167b == null) {
                    this.f12167b = new io.sentry.compose.a(this.f12166a);
                }
                e.e(qVarA, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    e.e(qVarA, th2);
                    throw th3;
                }
            }
        }
        f0 root = ((Owner) view).getRoot();
        LinkedList linkedList = new LinkedList();
        linkedList.add(root);
        String str4 = null;
        String str5 = null;
        while (true) {
            if (linkedList.isEmpty()) {
                cVar = cVar3;
                str = str4;
                break;
            }
            f0 f0Var2 = (f0) linkedList.poll();
            if (f0Var2 != null) {
                if (f0Var2.T()) {
                    r rVar = (r) f0Var2.D.f822d;
                    m mVarS = (r) root.D.f822d;
                    l.e(rVar, "<this>");
                    if (mVarS == null) {
                        mVarS = e5.s(rVar);
                    }
                    float fH = (int) (mVarS.h() >> 32);
                    float fH2 = (int) (mVarS.h() & 4294967295L);
                    f1.c cVarB = mVarS.B(rVar, true);
                    float f12 = cVarB.f8404a;
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 > fH) {
                        f12 = fH;
                    }
                    cVar = cVar3;
                    float f13 = cVarB.f8405b;
                    if (f13 < 0.0f) {
                        f13 = 0.0f;
                    }
                    if (f13 > fH2) {
                        f13 = fH2;
                    }
                    float f14 = cVarB.f8406c;
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    if (f14 <= fH) {
                        fH = f14;
                    }
                    float f15 = cVarB.f8407d;
                    float f16 = f15 >= 0.0f ? f15 : 0.0f;
                    if (f16 <= fH2) {
                        fH2 = f16;
                    }
                    if (f12 == fH || f13 == fH2) {
                        cVar2 = f1.c.f8403e;
                        str2 = str4;
                        str3 = str5;
                        j = 4294967295L;
                        f0Var = root;
                    } else {
                        str2 = str4;
                        str3 = str5;
                        long jA = mVarS.a(io.sentry.config.a.E(f12, f13));
                        long jA2 = mVarS.a(io.sentry.config.a.E(fH, f13));
                        long jA3 = mVarS.a(io.sentry.config.a.E(fH, fH2));
                        long jA4 = mVarS.a(io.sentry.config.a.E(f12, fH2));
                        float fB = f1.b.b(jA);
                        float fB2 = f1.b.b(jA2);
                        j = 4294967295L;
                        float fB3 = f1.b.b(jA4);
                        f0Var = root;
                        float fB4 = f1.b.b(jA3);
                        float fMin = Math.min(fB, Math.min(fB2, Math.min(fB3, fB4)));
                        float fMax = Math.max(fB, Math.max(fB2, Math.max(fB3, fB4)));
                        float fC = f1.b.c(jA);
                        float fC2 = f1.b.c(jA2);
                        float fC3 = f1.b.c(jA4);
                        float fC4 = f1.b.c(jA3);
                        cVar2 = new f1.c(fMin, Math.min(fC, Math.min(fC2, Math.min(fC3, fC4))), fMax, Math.max(fC, Math.max(fC2, Math.max(fC3, fC4))));
                    }
                    long jE = io.sentry.config.a.E(f10, f11);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & j));
                    if ((fIntBitsToFloat < cVar2.f8406c) & (fIntBitsToFloat >= cVar2.f8404a) & (fIntBitsToFloat2 >= cVar2.f8405b) & (fIntBitsToFloat2 < cVar2.f8407d)) {
                        List listB = f0Var2.B();
                        int size = listB.size();
                        boolean z10 = false;
                        boolean z11 = false;
                        str5 = str3;
                        for (int i10 = 0; i10 < size; i10++) {
                            s sVar = (s) listB.get(i10);
                            io.sentry.compose.a aVar = this.f12167b;
                            l.b(aVar);
                            String strA = aVar.a(sVar.f23805a);
                            if (strA != null) {
                                str5 = strA;
                            }
                            z0.m mVar = sVar.f23805a;
                            if (mVar instanceof AppendedSemanticsElement) {
                                new SemanticsConfiguration().f1193g = false;
                                throw null;
                            }
                            String name = mVar.getClass().getName();
                            if ("androidx.compose.foundation.ClickableElement".equals(name) || "androidx.compose.foundation.CombinedClickableElement".equals(name)) {
                                z10 = true;
                            } else if ("androidx.compose.foundation.ScrollingLayoutElement".equals(name)) {
                                z11 = true;
                            }
                        }
                        str4 = (z10 && bVar == b.CLICKABLE) ? str5 : str2;
                        if (z11 && bVar == b.SCROLLABLE) {
                            str = str5;
                            break;
                        }
                    }
                    linkedList.addAll(f0Var2.H().f());
                    root = f0Var;
                    cVar3 = cVar;
                } else {
                    f0Var = root;
                    cVar = cVar3;
                    str2 = str4;
                    str3 = str5;
                }
                str4 = str2;
                str5 = str3;
                linkedList.addAll(f0Var2.H().f());
                root = f0Var;
                cVar3 = cVar;
            }
        }
        return str == null ? cVar : new c(null, null, null, str, "jetpack_compose");
    }
}
