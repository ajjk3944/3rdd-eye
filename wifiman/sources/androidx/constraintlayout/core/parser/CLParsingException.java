package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final String f30028a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30029b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30030c;

    public CLParsingException(String str, b bVar) {
        super(str);
        this.f30028a = str;
        if (bVar != null) {
            this.f30030c = bVar.m();
            this.f30029b = bVar.k();
        } else {
            this.f30030c = "unknown";
            this.f30029b = 0;
        }
    }

    public String a() {
        return this.f30028a + " (" + this.f30030c + " at line " + this.f30029b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
