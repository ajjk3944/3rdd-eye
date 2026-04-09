package com.google.common.base;

/* loaded from: classes2.dex */
public abstract class a implements h {

    /* renamed from: com.google.common.base.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0214a extends a {
        @Override // com.google.common.base.h
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    public static final class b extends AbstractC0214a {

        /* renamed from: a, reason: collision with root package name */
        public final char f11578a;

        /* renamed from: b, reason: collision with root package name */
        public final char f11579b;

        public b(char c10, char c11) {
            g.d(c11 >= c10);
            this.f11578a = c10;
            this.f11579b = c11;
        }

        @Override // com.google.common.base.a
        public boolean e(char c10) {
            return this.f11578a <= c10 && c10 <= this.f11579b;
        }

        public String toString() {
            String strF = a.f(this.f11578a);
            String strF2 = a.f(this.f11579b);
            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 27 + String.valueOf(strF2).length());
            sb.append("CharMatcher.inRange('");
            sb.append(strF);
            sb.append("', '");
            sb.append(strF2);
            sb.append("')");
            return sb.toString();
        }
    }

    public static final class c extends AbstractC0214a {

        /* renamed from: a, reason: collision with root package name */
        public final char f11580a;

        public c(char c10) {
            this.f11580a = c10;
        }

        @Override // com.google.common.base.a
        public boolean e(char c10) {
            return c10 == this.f11580a;
        }

        public String toString() {
            String strF = a.f(this.f11580a);
            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strF);
            sb.append("')");
            return sb.toString();
        }
    }

    public static a c(char c10, char c11) {
        return new b(c10, c11);
    }

    public static a d(char c10) {
        return new c(c10);
    }

    public static String f(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public abstract boolean e(char c10);
}
