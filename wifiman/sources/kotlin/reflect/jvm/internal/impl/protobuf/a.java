package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* loaded from: classes4.dex */
public abstract class a implements n {

    /* renamed from: a, reason: collision with root package name */
    protected int f51937a = 0;

    UninitializedMessageException g() {
        return new UninitializedMessageException(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        int iD = d();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(outputStream, CodedOutputStream.t(CodedOutputStream.u(iD) + iD));
        codedOutputStreamI.n0(iD);
        n(codedOutputStreamI);
        codedOutputStreamI.H();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1921a implements n.a {
        protected static UninitializedMessageException b(n nVar) {
            return new UninitializedMessageException(nVar);
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        static final class C1922a extends FilterInputStream {

            /* renamed from: a, reason: collision with root package name */
            private int f51938a;

            C1922a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f51938a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f51938a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f51938a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f51938a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f51938a));
                if (jSkip >= 0) {
                    this.f51938a = (int) (this.f51938a - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f51938a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f51938a -= i13;
                }
                return i13;
            }
        }
    }
}
