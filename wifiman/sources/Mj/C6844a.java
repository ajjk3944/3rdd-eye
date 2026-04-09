package mj;

import java.util.prefs.AbstractPreferences;

/* renamed from: mj.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6844a {

    /* renamed from: a, reason: collision with root package name */
    private static final C6844a f54042a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1961a f54043b;

    /* renamed from: mj.a$a, reason: collision with other inner class name */
    public class C1961a extends AbstractPreferences {

        /* renamed from: a, reason: collision with root package name */
        private String f54044a;

        public C1961a() {
            super(null, "");
            this.f54044a = null;
        }

        public String a() {
            return this.f54044a;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected AbstractPreferences childSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String[] childrenNamesSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void flushSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String getSpi(String str) {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected String[] keysSpi() {
            return null;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void putSpi(String str, String str2) {
            this.f54044a = str2;
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void removeNodeSpi() {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void removeSpi(String str) {
        }

        @Override // java.util.prefs.AbstractPreferences
        protected void syncSpi() {
        }
    }

    static {
        C6844a c6844a = new C6844a();
        f54042a = c6844a;
        f54043b = c6844a.new C1961a();
    }

    public static String a(String str) {
        C1961a c1961a = f54043b;
        c1961a.putByteArray("akey", str.getBytes());
        return c1961a.a();
    }

    public static String b(byte[] bArr) {
        C1961a c1961a = f54043b;
        c1961a.putByteArray("aKey", bArr);
        return c1961a.a();
    }
}
