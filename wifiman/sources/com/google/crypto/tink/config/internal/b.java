package com.google.crypto.tink.config.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f38423a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f38424b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.google.crypto.tink.config.internal.b$b, reason: collision with other inner class name */
    public static abstract class EnumC1214b {
        private static final /* synthetic */ EnumC1214b[] $VALUES;
        public static final EnumC1214b ALGORITHM_NOT_FIPS;
        public static final EnumC1214b ALGORITHM_REQUIRES_BORINGCRYPTO;

        /* renamed from: com.google.crypto.tink.config.internal.b$b$a */
        enum a extends EnumC1214b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // com.google.crypto.tink.config.internal.b.EnumC1214b
            public boolean isCompatible() {
                return !b.c();
            }
        }

        /* renamed from: com.google.crypto.tink.config.internal.b$b$b, reason: collision with other inner class name */
        enum C1215b extends EnumC1214b {
            C1215b(String str, int i10) {
                super(str, i10);
            }

            @Override // com.google.crypto.tink.config.internal.b.EnumC1214b
            public boolean isCompatible() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            ALGORITHM_NOT_FIPS = aVar;
            C1215b c1215b = new C1215b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            ALGORITHM_REQUIRES_BORINGCRYPTO = c1215b;
            $VALUES = new EnumC1214b[]{aVar, c1215b};
        }

        private EnumC1214b(String str, int i10) {
        }

        public static EnumC1214b valueOf(String str) {
            return (EnumC1214b) Enum.valueOf(EnumC1214b.class, str);
        }

        public static EnumC1214b[] values() {
            return (EnumC1214b[]) $VALUES.clone();
        }

        public abstract boolean isCompatible();
    }

    static Boolean a() {
        try {
            int i10 = Conscrypt.f56892a;
            return (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f38423a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return com.google.crypto.tink.config.internal.a.a() || f38424b.get();
    }
}
