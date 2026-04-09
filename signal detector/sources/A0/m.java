package A0;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f87a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89c;

    /* renamed from: d, reason: collision with root package name */
    public final long f90d;

    public m(int i, int i3, long j6, long j7) {
        this.f87a = i;
        this.f88b = i3;
        this.f89c = j6;
        this.f90d = j7;
    }

    public static m a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            m mVar = new m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return mVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f87a);
            dataOutputStream.writeInt(this.f88b);
            dataOutputStream.writeLong(this.f89c);
            dataOutputStream.writeLong(this.f90d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (this.f88b == mVar.f88b && this.f89c == mVar.f89c && this.f87a == mVar.f87a && this.f90d == mVar.f90d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f88b), Long.valueOf(this.f89c), Integer.valueOf(this.f87a), Long.valueOf(this.f90d));
    }
}
