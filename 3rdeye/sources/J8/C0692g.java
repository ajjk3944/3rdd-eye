package J8;

import android.animation.Animator;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import c9.AbstractC2080a;
import e.C4295f;
import java.util.regex.Matcher;
import y9.C5822d;
import y9.C5824f;
import y9.C5825g;

/* compiled from: R8$$SyntheticClass */
/* renamed from: J8.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0692g implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2863c;

    public /* synthetic */ C0692g(Object obj, int i) {
        this.f2862b = i;
        this.f2863c = obj;
    }

    @Override // p9.l
    public final Object invoke(Object it) {
        switch (this.f2862b) {
            case 0:
                kotlin.jvm.internal.l.f((InterfaceC1790x) it, "it");
                C0694i.c((Animator) this.f2863c);
                return C1992A.f18074a;
            case 1:
                return it == ((AbstractC2080a) this.f2863c) ? "(this Collection)" : String.valueOf(it);
            case 2:
                F1.b db = (F1.b) it;
                kotlin.jvm.internal.l.f(db, "db");
                ((w1.i) this.f2863c).f47229g = db;
                return C1992A.f18074a;
            case 3:
                kotlin.jvm.internal.l.f(it, "it");
                return ((C4295f) this.f2863c).invoke();
            default:
                int iIntValue = ((Integer) it).intValue();
                C5825g c5825g = ((C5824f) this.f2863c).f48377b;
                Matcher matcher = c5825g.f48378a;
                v9.g gVarO = v9.h.O(matcher.start(iIntValue), matcher.end(iIntValue));
                if (gVarO.f47096b < 0) {
                    return null;
                }
                String strGroup = c5825g.f48378a.group(iIntValue);
                kotlin.jvm.internal.l.e(strGroup, "group(...)");
                return new C5822d(strGroup, gVarO);
        }
    }
}
