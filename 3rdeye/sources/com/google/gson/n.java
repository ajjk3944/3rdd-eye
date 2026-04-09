package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes2.dex */
public abstract class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n DEFAULT;
    public static final n STRING;

    /* compiled from: LongSerializationPolicy.java */
    public enum a extends n {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.n
        public g serialize(Long l5) {
            return new k(l5);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        n nVar = new n("STRING", 1) { // from class: com.google.gson.n.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.n
            public g serialize(Long l5) {
                return new k(String.valueOf(l5));
            }
        };
        STRING = nVar;
        $VALUES = new n[]{aVar, nVar};
    }

    private n(String str, int i) {
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public abstract g serialize(Long l5);

    public /* synthetic */ n(String str, int i, a aVar) {
        this(str, i);
    }
}
