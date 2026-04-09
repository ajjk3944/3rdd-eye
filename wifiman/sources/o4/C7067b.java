package o4;

import A4.C;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7067b implements p {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f55267a;

    private C7067b(InputStream inputStream) {
        this.f55267a = inputStream;
    }

    public static p c(byte[] bArr) {
        return new C7067b(new ByteArrayInputStream(bArr));
    }

    @Override // o4.p
    public A4.t a() throws IOException {
        try {
            return A4.t.Y(this.f55267a, C5088o.b());
        } finally {
            this.f55267a.close();
        }
    }

    @Override // o4.p
    public C b() throws IOException {
        try {
            return C.d0(this.f55267a, C5088o.b());
        } finally {
            this.f55267a.close();
        }
    }
}
