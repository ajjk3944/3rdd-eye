package c5;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3294a;

    /* renamed from: d, reason: collision with root package name */
    public int f3295d;

    public static String c(int i10) {
        StringBuilder sb2 = new StringBuilder(4);
        sb2.append((char) ((i10 >> 24) & 255));
        sb2.append((char) ((i10 >> 16) & 255));
        sb2.append((char) ((i10 >> 8) & 255));
        sb2.append((char) (i10 & 255));
        return sb2.toString();
    }

    public static String d(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int n(int i10) {
        return (i10 >> 24) & 255;
    }

    public static int o(int i10) {
        return (i10 >> 24) & 255;
    }

    public void b(int i10) {
        this.f3295d = i10 | this.f3295d;
    }

    public boolean g(int i10) {
        switch (this.f3294a) {
            case 0:
                if ((this.f3295d & i10) == i10) {
                }
                break;
            default:
                if ((this.f3295d & i10) == i10) {
                }
                break;
        }
        return false;
    }

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public String toString() {
        switch (this.f3294a) {
            case 1:
                return c(this.f3295d);
            case 2:
                return d(this.f3295d);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i10, int i11) {
        this.f3294a = i11;
        this.f3295d = i10;
    }
}
