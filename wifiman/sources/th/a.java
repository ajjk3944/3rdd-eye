package Th;

import Yh.e;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.U;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0806a f21989a;

    /* renamed from: b, reason: collision with root package name */
    private final e f21990b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f21991c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f21992d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f21993e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21994f;

    /* renamed from: g, reason: collision with root package name */
    private final int f21995g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21996h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f21997i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Th.a$a, reason: collision with other inner class name */
    public static final class EnumC0806a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC0806a[] $VALUES;
        public static final C0807a Companion;
        private static final Map<Integer, EnumC0806a> entryById;

        /* renamed from: id, reason: collision with root package name */
        private final int f21998id;
        public static final EnumC0806a UNKNOWN = new EnumC0806a("UNKNOWN", 0, 0);
        public static final EnumC0806a CLASS = new EnumC0806a("CLASS", 1, 1);
        public static final EnumC0806a FILE_FACADE = new EnumC0806a("FILE_FACADE", 2, 2);
        public static final EnumC0806a SYNTHETIC_CLASS = new EnumC0806a("SYNTHETIC_CLASS", 3, 3);
        public static final EnumC0806a MULTIFILE_CLASS = new EnumC0806a("MULTIFILE_CLASS", 4, 4);
        public static final EnumC0806a MULTIFILE_CLASS_PART = new EnumC0806a("MULTIFILE_CLASS_PART", 5, 5);

        /* renamed from: Th.a$a$a, reason: collision with other inner class name */
        public static final class C0807a {
            public /* synthetic */ C0807a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0806a a(int i10) {
                EnumC0806a enumC0806a = (EnumC0806a) EnumC0806a.entryById.get(Integer.valueOf(i10));
                return enumC0806a == null ? EnumC0806a.UNKNOWN : enumC0806a;
            }

            private C0807a() {
            }
        }

        private static final /* synthetic */ EnumC0806a[] $values() {
            return new EnumC0806a[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
        }

        static {
            EnumC0806a[] enumC0806aArr$values = $values();
            $VALUES = enumC0806aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC0806aArr$values);
            Companion = new C0807a(null);
            EnumC0806a[] enumC0806aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(enumC0806aArrValues.length), 16));
            for (EnumC0806a enumC0806a : enumC0806aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0806a.f21998id), enumC0806a);
            }
            entryById = linkedHashMap;
        }

        private EnumC0806a(String str, int i10, int i11) {
            this.f21998id = i11;
        }

        public static final EnumC0806a getById(int i10) {
            return Companion.a(i10);
        }

        public static EnumC0806a valueOf(String str) {
            return (EnumC0806a) Enum.valueOf(EnumC0806a.class, str);
        }

        public static EnumC0806a[] values() {
            return (EnumC0806a[]) $VALUES.clone();
        }
    }

    public a(EnumC0806a kind, e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(metadataVersion, "metadataVersion");
        this.f21989a = kind;
        this.f21990b = metadataVersion;
        this.f21991c = strArr;
        this.f21992d = strArr2;
        this.f21993e = strArr3;
        this.f21994f = str;
        this.f21995g = i10;
        this.f21996h = str2;
        this.f21997i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f21991c;
    }

    public final String[] b() {
        return this.f21992d;
    }

    public final EnumC0806a c() {
        return this.f21989a;
    }

    public final e d() {
        return this.f21990b;
    }

    public final String e() {
        String str = this.f21994f;
        if (this.f21989a == EnumC0806a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f21991c;
        if (this.f21989a != EnumC0806a.MULTIFILE_CLASS) {
            strArr = null;
        }
        List listE = strArr != null ? AbstractC3682n.e(strArr) : null;
        return listE == null ? AbstractC3689v.l() : listE;
    }

    public final String[] g() {
        return this.f21993e;
    }

    public final boolean i() {
        return h(this.f21995g, 2);
    }

    public final boolean j() {
        return h(this.f21995g, 16) && !h(this.f21995g, 32);
    }

    public String toString() {
        return this.f21989a + " version=" + this.f21990b;
    }
}
