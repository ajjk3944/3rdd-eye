package t5;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import w5.C8270c;

/* loaded from: classes3.dex */
public abstract class n {
    public static void a(com.google.gson.g gVar, C8270c c8270c) {
        com.google.gson.internal.bind.l.f39067V.d(c8270c, gVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f61792a;

        /* renamed from: b, reason: collision with root package name */
        private final a f61793b = new a();

        private static class a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            private char[] f61794a;

            /* renamed from: b, reason: collision with root package name */
            private String f61795b;

            private a() {
            }

            void a(char[] cArr) {
                this.f61794a = cArr;
                this.f61795b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f61794a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f61794a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f61794a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f61795b == null) {
                    this.f61795b = new String(this.f61794a);
                }
                return this.f61795b;
            }
        }

        b(Appendable appendable) {
            this.f61792a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f61793b.a(cArr);
            this.f61792a.append(this.f61793b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f61792a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f61792a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f61792a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f61792a.append(str, i10, i11 + i10);
        }
    }
}
