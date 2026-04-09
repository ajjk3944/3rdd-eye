package Z3;

import java.io.File;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final File f4528a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4529b;

    public b(File file, String str) {
        this.f4528a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f4529b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4528a.equals(bVar.f4528a) && this.f4529b.equals(bVar.f4529b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4528a.hashCode() ^ 1000003) * 1000003) ^ this.f4529b.hashCode();
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f4528a.toString() + ", splitId=" + this.f4529b + "}";
    }
}
