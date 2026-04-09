package com.google.android.gms.internal.ads;

import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.android.gms.internal.ads.zK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2228zK extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17857a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f17858b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f17859c;

    public C2228zK(int i, StringBuilder sb) {
        this.f17857a = i;
        switch (i) {
            case 1:
                this.f17859c = new i4.q();
                this.f17858b = sb;
                break;
            default:
                this.f17859c = new C2174yK();
                this.f17858b = sb;
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f17857a) {
            case 0:
                this.f17858b.append(charSequence);
                return this;
            case 1:
                this.f17858b.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f17857a) {
            case 0:
            case 1:
                break;
            default:
                h();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f17857a) {
            case 0:
            case 1:
                break;
            default:
                h();
                break;
        }
    }

    public void h() {
        StringBuilder sb = this.f17858b;
        if (sb.length() > 0) {
            Log.d((String) this.f17859c, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i3) {
        switch (this.f17857a) {
            case 0:
                C2174yK c2174yK = (C2174yK) this.f17859c;
                c2174yK.f17710a = cArr;
                c2174yK.f17711b = null;
                this.f17858b.append((CharSequence) c2174yK, i, i3 + i);
                break;
            case 1:
                i4.q qVar = (i4.q) this.f17859c;
                qVar.f20627a = cArr;
                qVar.f20628b = null;
                this.f17858b.append((CharSequence) qVar, i, i3 + i);
                break;
            default:
                for (int i6 = 0; i6 < i3; i6++) {
                    char c6 = cArr[i + i6];
                    if (c6 == '\n') {
                        h();
                    } else {
                        this.f17858b.append(c6);
                    }
                }
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.f17857a) {
            case 0:
                append(charSequence);
                return this;
            case 1:
                this.f17858b.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i3) {
        switch (this.f17857a) {
            case 0:
                this.f17858b.append(charSequence, i, i3);
                return this;
            case 1:
                this.f17858b.append(charSequence, i, i3);
                return this;
            default:
                return super.append(charSequence, i, i3);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i3) {
        switch (this.f17857a) {
            case 0:
                append(charSequence, i, i3);
                return this;
            case 1:
                this.f17858b.append(charSequence, i, i3);
                return this;
            default:
                return super.append(charSequence, i, i3);
        }
    }

    public C2228zK() {
        this.f17857a = 2;
        this.f17858b = new StringBuilder(128);
        this.f17859c = "FragmentManager";
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.f17857a) {
            case 0:
                this.f17858b.append((char) i);
                break;
            case 1:
                this.f17858b.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i3) throws IOException {
        switch (this.f17857a) {
            case 0:
                Objects.requireNonNull(str);
                this.f17858b.append((CharSequence) str, i, i3 + i);
                break;
            case 1:
                Objects.requireNonNull(str);
                this.f17858b.append((CharSequence) str, i, i3 + i);
                break;
            default:
                super.write(str, i, i3);
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
