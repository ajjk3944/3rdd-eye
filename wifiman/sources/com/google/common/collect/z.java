package com.google.common.collect;

import java.util.Map;
import m4.InterfaceC6764c;

/* loaded from: classes3.dex */
public abstract class z {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements InterfaceC6764c {
        public static final a KEY = new C1213a("KEY", 0);
        public static final a VALUE = new b("VALUE", 1);
        private static final /* synthetic */ a[] $VALUES = $values();

        /* renamed from: com.google.common.collect.z$a$a, reason: collision with other inner class name */
        enum C1213a extends a {
            C1213a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.z.a, m4.InterfaceC6764c
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        enum b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.z.a, m4.InterfaceC6764c
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ a[] $values() {
            return new a[]{KEY, VALUE};
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // m4.InterfaceC6764c
        public abstract /* synthetic */ Object apply(Object obj);

        /* synthetic */ a(String str, int i10, y yVar) {
            this(str, i10);
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static InterfaceC6764c b() {
        return a.KEY;
    }

    static String c(Map map) {
        StringBuilder sbA = AbstractC5062h.a(map.size());
        sbA.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z10 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    static InterfaceC6764c d() {
        return a.VALUE;
    }
}
