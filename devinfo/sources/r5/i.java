package r5;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f32827a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32828b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32829c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32830d;

    public i(int i4, int i10, long j, long j8) {
        this.f32827a = i4;
        this.f32828b = i10;
        this.f32829c = j;
        this.f32830d = j8;
    }

    public static i a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f32827a);
            dataOutputStream.writeInt(this.f32828b);
            dataOutputStream.writeLong(this.f32829c);
            dataOutputStream.writeLong(this.f32830d);
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
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f32828b == iVar.f32828b && this.f32829c == iVar.f32829c && this.f32827a == iVar.f32827a && this.f32830d == iVar.f32830d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f32828b), Long.valueOf(this.f32829c), Integer.valueOf(this.f32827a), Long.valueOf(this.f32830d));
    }
}
