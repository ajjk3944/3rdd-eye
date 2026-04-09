package f7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import xu.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8665b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8666c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8667d;

    public h(int i10, int i11, long j, long j7) {
        this.f8664a = i10;
        this.f8665b = i11;
        this.f8666c = j;
        this.f8667d = j7;
    }

    public static h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(xu.d.j(file, new FileInputStream(file)));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(l.k(new FileOutputStream(file), file));
        try {
            dataOutputStream.writeInt(this.f8664a);
            dataOutputStream.writeInt(this.f8665b);
            dataOutputStream.writeLong(this.f8666c);
            dataOutputStream.writeLong(this.f8667d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f8665b == hVar.f8665b && this.f8666c == hVar.f8666c && this.f8664a == hVar.f8664a && this.f8667d == hVar.f8667d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f8665b), Long.valueOf(this.f8666c), Integer.valueOf(this.f8664a), Long.valueOf(this.f8667d));
    }
}
