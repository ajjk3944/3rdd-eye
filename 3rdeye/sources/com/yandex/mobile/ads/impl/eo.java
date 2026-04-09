package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class eo implements qj1<Character> {

    public static abstract class a extends eo {
        @Override // com.yandex.mobile.ads.impl.qj1
        @Deprecated
        public final boolean apply(Character ch) {
            return a(ch.charValue());
        }
    }

    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private final char f26954b;

        public b(char c10) {
            this.f26954b = c10;
        }

        @Override // com.yandex.mobile.ads.impl.eo
        public final boolean a(char c10) {
            return c10 == this.f26954b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            char c10 = this.f26954b;
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            sb.append(String.copyValueOf(cArr));
            sb.append("')");
            return sb.toString();
        }
    }

    public static abstract class c extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f26955b = (String) pj1.a("CharMatcher.none()");

        public final String toString() {
            return this.f26955b;
        }
    }

    public static final class d extends c {

        /* renamed from: c, reason: collision with root package name */
        static final d f26956c = new d();

        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.eo
        public final boolean a(char c10) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.eo
        public final int a(CharSequence charSequence, int i) {
            pj1.b(i, charSequence.length());
            return -1;
        }
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        pj1.b(i, length);
        while (i < length) {
            if (a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean a(char c10);
}
