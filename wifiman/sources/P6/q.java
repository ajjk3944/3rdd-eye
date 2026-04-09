package P6;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final o f18094a;

    /* renamed from: b, reason: collision with root package name */
    private final String[][] f18095b;

    q(o oVar, String[][] strArr) {
        this.f18094a = oVar;
        this.f18095b = strArr;
    }

    public boolean a() {
        boolean zA = true;
        for (String[] strArr : this.f18095b) {
            zA &= this.f18094a.a(strArr);
        }
        return zA;
    }
}
