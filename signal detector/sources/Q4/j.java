package Q4;

import androidx.lifecycle.E;
import c5.InterfaceC0404a;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements E, q5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.l f3210b;

    public /* synthetic */ j(p5.l lVar, int i) {
        this.f3209a = i;
        this.f3210b = lVar;
    }

    @Override // q5.f
    public final InterfaceC0404a a() {
        switch (this.f3209a) {
        }
        return this.f3210b;
    }

    @Override // androidx.lifecycle.E
    public final /* synthetic */ void b(Object obj) {
        switch (this.f3209a) {
            case 0:
                this.f3210b.f(obj);
                break;
            case 1:
                this.f3210b.f(obj);
                break;
            case 2:
                this.f3210b.f(obj);
                break;
            case 3:
                this.f3210b.f(obj);
                break;
            default:
                this.f3210b.f(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f3209a) {
            case 0:
                if (!(obj instanceof E) || !(obj instanceof q5.f)) {
                    return false;
                }
                return this.f3210b.equals(((q5.f) obj).a());
            case 1:
                if (!(obj instanceof E) || !(obj instanceof q5.f)) {
                    return false;
                }
                return this.f3210b.equals(((q5.f) obj).a());
            case 2:
                if (!(obj instanceof E) || !(obj instanceof q5.f)) {
                    return false;
                }
                return this.f3210b.equals(((q5.f) obj).a());
            case 3:
                if (!(obj instanceof E) || !(obj instanceof q5.f)) {
                    return false;
                }
                return this.f3210b.equals(((q5.f) obj).a());
            default:
                if (!(obj instanceof E) || !(obj instanceof q5.f)) {
                    return false;
                }
                return this.f3210b.equals(((q5.f) obj).a());
        }
    }

    public final int hashCode() {
        switch (this.f3209a) {
        }
        return this.f3210b.hashCode();
    }
}
