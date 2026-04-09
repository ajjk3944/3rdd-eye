package N4;

import androidx.lifecycle.E;
import c5.InterfaceC0404a;
import s0.C2887h;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements E, q5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.l f2987b;

    public /* synthetic */ b(p5.l lVar, int i) {
        this.f2986a = i;
        this.f2987b = lVar;
    }

    @Override // q5.f
    public final InterfaceC0404a a() {
        switch (this.f2986a) {
            case 0:
                return (H4.c) this.f2987b;
            case 1:
                return (H4.c) this.f2987b;
            case 2:
                return (Q4.e) this.f2987b;
            case 3:
                return (Q4.e) this.f2987b;
            case 4:
                return (H4.c) this.f2987b;
            case 5:
                return (S4.c) this.f2987b;
            case 6:
                return (S4.c) this.f2987b;
            case 7:
                return (Q4.e) this.f2987b;
            default:
                return (C2887h) this.f2987b;
        }
    }

    @Override // androidx.lifecycle.E
    public final /* synthetic */ void b(Object obj) {
        switch (this.f2986a) {
            case 0:
                ((H4.c) this.f2987b).f(obj);
                break;
            case 1:
                ((H4.c) this.f2987b).f(obj);
                break;
            case 2:
                ((Q4.e) this.f2987b).f(obj);
                break;
            case 3:
                ((Q4.e) this.f2987b).f(obj);
                break;
            case 4:
                ((H4.c) this.f2987b).f(obj);
                break;
            case 5:
                ((S4.c) this.f2987b).f(obj);
                break;
            case 6:
                ((S4.c) this.f2987b).f(obj);
                break;
            case 7:
                ((Q4.e) this.f2987b).f(obj);
                break;
            default:
                ((C2887h) this.f2987b).f(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2986a) {
            case 0:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((H4.c) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((H4.c) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            case 2:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((Q4.e) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            case 3:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((Q4.e) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            case 4:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((H4.c) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            case 5:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((S4.c) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            case 6:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((S4.c) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            case 7:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((Q4.e) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
            default:
                if ((obj instanceof E) && (obj instanceof q5.f)) {
                    return ((C2887h) this.f2987b).equals(((q5.f) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f2986a) {
            case 0:
                return ((H4.c) this.f2987b).hashCode();
            case 1:
                return ((H4.c) this.f2987b).hashCode();
            case 2:
                return ((Q4.e) this.f2987b).hashCode();
            case 3:
                return ((Q4.e) this.f2987b).hashCode();
            case 4:
                return ((H4.c) this.f2987b).hashCode();
            case 5:
                return ((S4.c) this.f2987b).hashCode();
            case 6:
                return ((S4.c) this.f2987b).hashCode();
            case 7:
                return ((Q4.e) this.f2987b).hashCode();
            default:
                return ((C2887h) this.f2987b).hashCode();
        }
    }
}
