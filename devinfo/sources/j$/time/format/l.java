package j$.time.format;

/* loaded from: classes2.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f26146a;

    public l(String str) {
        this.f26146a = str;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb2) {
        sb2.append(this.f26146a);
        return true;
    }

    public final String toString() {
        return "'" + this.f26146a.replace("'", "''") + "'";
    }
}
