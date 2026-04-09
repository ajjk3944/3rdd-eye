package M4;

import M4.h;
import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
class i implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f12527d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final File f12528a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12529b;

    /* renamed from: c, reason: collision with root package name */
    private h f12530c;

    class a implements h.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f12531a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f12532b;

        a(byte[] bArr, int[] iArr) {
            this.f12531a = bArr;
            this.f12532b = iArr;
        }

        @Override // M4.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f12531a, this.f12532b[0], i10);
                int[] iArr = this.f12532b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f12534a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12535b;

        b(byte[] bArr, int i10) {
            this.f12534a = bArr;
            this.f12535b = i10;
        }
    }

    i(File file, int i10) {
        this.f12528a = file;
        this.f12529b = i10;
    }

    private void f(long j10, String str) {
        if (this.f12530c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f12529b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f12530c.p(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f12527d));
            while (!this.f12530c.J() && this.f12530c.p0() > this.f12529b) {
                this.f12530c.f0();
            }
        } catch (IOException e10) {
            I4.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f12528a.exists()) {
            return null;
        }
        h();
        h hVar = this.f12530c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.p0()];
        try {
            this.f12530c.y(new a(bArr, iArr));
        } catch (IOException e10) {
            I4.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f12530c == null) {
            try {
                this.f12530c = new h(this.f12528a);
            } catch (IOException e10) {
                I4.g.f().e("Could not open log file: " + this.f12528a, e10);
            }
        }
    }

    @Override // M4.d
    public void a() throws IOException {
        AbstractC5107i.f(this.f12530c, "There was a problem closing the Crashlytics log file.");
        this.f12530c = null;
    }

    @Override // M4.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f12527d);
        }
        return null;
    }

    @Override // M4.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f12535b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f12534a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // M4.d
    public void d() throws IOException {
        a();
        this.f12528a.delete();
    }

    @Override // M4.d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
