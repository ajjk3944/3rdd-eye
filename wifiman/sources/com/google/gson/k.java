package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k DEFAULT;
    public static final k STRING;

    enum a extends k {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.k
        public g serialize(Long l10) {
            return l10 == null ? h.f38981a : new j(l10);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        k kVar = new k("STRING", 1) { // from class: com.google.gson.k.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.k
            public g serialize(Long l10) {
                return l10 == null ? h.f38981a : new j(l10.toString());
            }
        };
        STRING = kVar;
        $VALUES = new k[]{aVar, kVar};
    }

    private k(String str, int i10) {
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public abstract g serialize(Long l10);

    /* synthetic */ k(String str, int i10, a aVar) {
        this(str, i10);
    }
}
