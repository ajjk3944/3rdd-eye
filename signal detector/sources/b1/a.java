package b1;

import a1.C0262a;
import android.os.Build;
import c1.AbstractC0400d;
import e1.h;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(AbstractC0400d abstractC0400d, int i) {
        super(abstractC0400d);
        this.f5709e = i;
    }

    @Override // b1.c
    public final boolean a(h hVar) {
        switch (this.f5709e) {
            case 0:
                return hVar.f19916j.f3809b;
            case 1:
                return hVar.f19916j.f3811d;
            case 2:
                return hVar.f19916j.f3808a == 2;
            case 3:
                int i = hVar.f19916j.f3808a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return hVar.f19916j.f3812e;
        }
    }

    @Override // b1.c
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.f5709e) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                C0262a c0262a = (C0262a) obj;
                return Build.VERSION.SDK_INT >= 26 ? (c0262a.f4645a && c0262a.f4646b) ? false : true : true ^ c0262a.f4645a;
            case 3:
                C0262a c0262a2 = (C0262a) obj;
                return !c0262a2.f4645a || c0262a2.f4647c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
