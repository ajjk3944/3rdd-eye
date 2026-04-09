package P6;

/* renamed from: P6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3422j {

    /* renamed from: a, reason: collision with root package name */
    private final o f18083a;

    /* renamed from: b, reason: collision with root package name */
    private final String[][] f18084b;

    C3422j(o oVar, String[][] strArr) {
        this.f18083a = oVar;
        this.f18084b = strArr;
    }

    public boolean a() {
        boolean zA = true;
        for (String[] strArr : this.f18084b) {
            zA &= this.f18083a.a(strArr);
        }
        return zA;
    }
}
