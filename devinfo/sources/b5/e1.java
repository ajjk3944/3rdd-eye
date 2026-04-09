package b5;

import android.util.Log;
import com.google.android.gms.internal.ads.lm1;
import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1785a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f1786b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f1787c;

    public e1(int i4, StringBuilder sb2) {
        this.f1785a = i4;
        switch (i4) {
            case 2:
                this.f1787c = new com.google.gson.internal.o();
                this.f1786b = sb2;
                break;
            default:
                this.f1787c = new lm1();
                this.f1786b = sb2;
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f1785a) {
            case 1:
                this.f1786b.append(charSequence);
                return this;
            case 2:
                this.f1786b.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1785a) {
            case 0:
                p();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f1785a) {
            case 0:
                p();
                break;
        }
    }

    public void p() {
        StringBuilder sb2 = this.f1786b;
        if (sb2.length() > 0) {
            Log.d((String) this.f1787c, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i4, int i10) {
        switch (this.f1785a) {
            case 0:
                for (int i11 = 0; i11 < i10; i11++) {
                    char c9 = cArr[i4 + i11];
                    if (c9 == '\n') {
                        p();
                    } else {
                        this.f1786b.append(c9);
                    }
                }
                break;
            case 1:
                lm1 lm1Var = (lm1) this.f1787c;
                lm1Var.f13551a = cArr;
                lm1Var.f13552b = null;
                this.f1786b.append((CharSequence) lm1Var, i4, i10 + i4);
                break;
            default:
                com.google.gson.internal.o oVar = (com.google.gson.internal.o) this.f1787c;
                oVar.f20864a = cArr;
                oVar.f20865b = null;
                this.f1786b.append((CharSequence) oVar, i4, i10 + i4);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.f1785a) {
            case 1:
                append(charSequence);
                return this;
            case 2:
                this.f1786b.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i4, int i10) {
        switch (this.f1785a) {
            case 1:
                this.f1786b.append(charSequence, i4, i10);
                return this;
            case 2:
                this.f1786b.append(charSequence, i4, i10);
                return this;
            default:
                return super.append(charSequence, i4, i10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i4, int i10) {
        switch (this.f1785a) {
            case 1:
                append(charSequence, i4, i10);
                return this;
            case 2:
                this.f1786b.append(charSequence, i4, i10);
                return this;
            default:
                return super.append(charSequence, i4, i10);
        }
    }

    public e1() {
        this.f1785a = 0;
        this.f1786b = new StringBuilder(128);
        this.f1787c = "FragmentManager";
    }

    @Override // java.io.Writer
    public void write(int i4) throws IOException {
        switch (this.f1785a) {
            case 1:
                this.f1786b.append((char) i4);
                break;
            case 2:
                this.f1786b.append((char) i4);
                break;
            default:
                super.write(i4);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i4, int i10) throws IOException {
        switch (this.f1785a) {
            case 1:
                Objects.requireNonNull(str);
                this.f1786b.append((CharSequence) str, i4, i10 + i4);
                break;
            case 2:
                Objects.requireNonNull(str);
                this.f1786b.append((CharSequence) str, i4, i10 + i4);
                break;
            default:
                super.write(str, i4, i10);
                break;
        }
    }

    private final void c() {
    }

    private final void e() {
    }

    private final void g() {
    }

    private final void m() {
    }
}
