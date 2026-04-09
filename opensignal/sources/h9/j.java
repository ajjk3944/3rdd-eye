package h9;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10376a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.h
    public final boolean a(o1 o1Var) {
        switch (this.f10376a) {
            case 0:
                if (!(o1Var instanceof m1) || ((m1) o1Var).f().size() == 0) {
                }
                break;
            case 1:
                if (o1Var.f10462b == null) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.f10376a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
