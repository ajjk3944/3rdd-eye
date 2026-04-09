package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    private static final Set<r> ALL_TARGET_SET;
    private static final List<r> ANNOTATION_CLASS_LIST;
    public static final r BACKING_FIELD;
    private static final List<r> CLASS_LIST;
    private static final List<r> COMPANION_OBJECT_LIST;
    public static final r CONSTRUCTOR;
    public static final a Companion;
    private static final Set<r> DEFAULT_TARGET_SET;
    private static final List<r> ENUM_ENTRY_LIST;
    private static final List<r> ENUM_LIST;
    public static final r FIELD;
    private static final List<r> FILE_LIST;
    public static final r FUNCTION;
    private static final List<r> FUNCTION_LIST;
    private static final List<r> INTERFACE_LIST;
    private static final List<r> LOCAL_CLASS_LIST;
    public static final r LOCAL_VARIABLE;
    private static final List<r> OBJECT_LIST;
    public static final r PROPERTY;
    public static final r PROPERTY_GETTER;
    private static final List<r> PROPERTY_GETTER_LIST;
    public static final r PROPERTY_SETTER;
    private static final List<r> PROPERTY_SETTER_LIST;
    private static final Map<e, r> USE_SITE_MAPPING;
    public static final r VALUE_PARAMETER;
    private static final HashMap<String, r> map;
    private final String description;
    private final boolean isDefault;
    public static final r CLASS = new r("CLASS", 0, "class", false, 2, null);
    public static final r ANNOTATION_CLASS = new r("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final r TYPE_PARAMETER = new r("TYPE_PARAMETER", 2, "type parameter", false);
    public static final r TYPE = new r("TYPE", 11, "type usage", false);
    public static final r EXPRESSION = new r("EXPRESSION", 12, "expression", false);
    public static final r FILE = new r("FILE", 13, "file", false);
    public static final r TYPEALIAS = new r("TYPEALIAS", 14, "typealias", false);
    public static final r TYPE_PROJECTION = new r("TYPE_PROJECTION", 15, "type projection", false);
    public static final r STAR_PROJECTION = new r("STAR_PROJECTION", 16, "star projection", false);
    public static final r PROPERTY_PARAMETER = new r("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final r CLASS_ONLY = new r("CLASS_ONLY", 18, "class", false);
    public static final r OBJECT = new r("OBJECT", 19, "object", false);
    public static final r STANDALONE_OBJECT = new r("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final r COMPANION_OBJECT = new r("COMPANION_OBJECT", 21, "companion object", false);
    public static final r INTERFACE = new r("INTERFACE", 22, "interface", false);
    public static final r ENUM_CLASS = new r("ENUM_CLASS", 23, "enum class", false);
    public static final r ENUM_ENTRY = new r("ENUM_ENTRY", 24, "enum entry", false);
    public static final r LOCAL_CLASS = new r("LOCAL_CLASS", 25, "local class", false);
    public static final r LOCAL_FUNCTION = new r("LOCAL_FUNCTION", 26, "local function", false);
    public static final r MEMBER_FUNCTION = new r("MEMBER_FUNCTION", 27, "member function", false);
    public static final r TOP_LEVEL_FUNCTION = new r("TOP_LEVEL_FUNCTION", 28, "top level function", false);
    public static final r MEMBER_PROPERTY = new r("MEMBER_PROPERTY", 29, "member property", false);
    public static final r MEMBER_PROPERTY_WITH_BACKING_FIELD = new r("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
    public static final r MEMBER_PROPERTY_WITH_DELEGATE = new r("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
    public static final r MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new r("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
    public static final r TOP_LEVEL_PROPERTY = new r("TOP_LEVEL_PROPERTY", 33, "top level property", false);
    public static final r TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new r("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
    public static final r TOP_LEVEL_PROPERTY_WITH_DELEGATE = new r("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
    public static final r TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new r("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
    public static final r INITIALIZER = new r("INITIALIZER", 38, "initializer", false);
    public static final r DESTRUCTURING_DECLARATION = new r("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
    public static final r LAMBDA_EXPRESSION = new r("LAMBDA_EXPRESSION", 40, "lambda expression", false);
    public static final r ANONYMOUS_FUNCTION = new r("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
    public static final r OBJECT_LITERAL = new r("OBJECT_LITERAL", 42, "object literal", false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final /* synthetic */ r[] $values() {
        return new r[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS, TYPE_PROJECTION, STAR_PROJECTION, PROPERTY_PARAMETER, CLASS_ONLY, OBJECT, STANDALONE_OBJECT, COMPANION_OBJECT, INTERFACE, ENUM_CLASS, ENUM_ENTRY, LOCAL_CLASS, LOCAL_FUNCTION, MEMBER_FUNCTION, TOP_LEVEL_FUNCTION, MEMBER_PROPERTY, MEMBER_PROPERTY_WITH_BACKING_FIELD, MEMBER_PROPERTY_WITH_DELEGATE, MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, TOP_LEVEL_PROPERTY, TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD, TOP_LEVEL_PROPERTY_WITH_DELEGATE, TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, BACKING_FIELD, INITIALIZER, DESTRUCTURING_DECLARATION, LAMBDA_EXPRESSION, ANONYMOUS_FUNCTION, OBJECT_LITERAL};
    }

    static {
        int i10 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z10 = false;
        PROPERTY = new r("PROPERTY", 3, "property", z10, i10, defaultConstructorMarker);
        int i11 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z11 = false;
        FIELD = new r("FIELD", 4, "field", z11, i11, defaultConstructorMarker2);
        LOCAL_VARIABLE = new r("LOCAL_VARIABLE", 5, "local variable", z10, i10, defaultConstructorMarker);
        VALUE_PARAMETER = new r("VALUE_PARAMETER", 6, "value parameter", z11, i11, defaultConstructorMarker2);
        CONSTRUCTOR = new r("CONSTRUCTOR", 7, "constructor", z10, i10, defaultConstructorMarker);
        FUNCTION = new r("FUNCTION", 8, "function", z11, i11, defaultConstructorMarker2);
        PROPERTY_GETTER = new r("PROPERTY_GETTER", 9, "getter", z10, i10, defaultConstructorMarker);
        PROPERTY_SETTER = new r("PROPERTY_SETTER", 10, "setter", z11, i11, defaultConstructorMarker2);
        BACKING_FIELD = new r("BACKING_FIELD", 37, "backing field", z10, i10, defaultConstructorMarker);
        r[] rVarArr$values = $values();
        $VALUES = rVarArr$values;
        $ENTRIES = AbstractC5827b.a(rVarArr$values);
        Companion = new a(null);
        map = new HashMap<>();
        for (r rVar : getEntries()) {
            map.put(rVar.name(), rVar);
        }
        InterfaceC5826a entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((r) obj).isDefault) {
                arrayList.add(obj);
            }
        }
        DEFAULT_TARGET_SET = AbstractC3689v.n1(arrayList);
        ALL_TARGET_SET = AbstractC3689v.n1(getEntries());
        r rVar2 = ANNOTATION_CLASS;
        r rVar3 = CLASS;
        ANNOTATION_CLASS_LIST = AbstractC3689v.o(rVar2, rVar3);
        LOCAL_CLASS_LIST = AbstractC3689v.o(LOCAL_CLASS, rVar3);
        CLASS_LIST = AbstractC3689v.o(CLASS_ONLY, rVar3);
        r rVar4 = COMPANION_OBJECT;
        r rVar5 = OBJECT;
        COMPANION_OBJECT_LIST = AbstractC3689v.o(rVar4, rVar5, rVar3);
        OBJECT_LIST = AbstractC3689v.o(STANDALONE_OBJECT, rVar5, rVar3);
        INTERFACE_LIST = AbstractC3689v.o(INTERFACE, rVar3);
        ENUM_LIST = AbstractC3689v.o(ENUM_CLASS, rVar3);
        r rVar6 = ENUM_ENTRY;
        r rVar7 = PROPERTY;
        r rVar8 = FIELD;
        ENUM_ENTRY_LIST = AbstractC3689v.o(rVar6, rVar7, rVar8);
        r rVar9 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = AbstractC3689v.e(rVar9);
        r rVar10 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = AbstractC3689v.e(rVar10);
        FUNCTION_LIST = AbstractC3689v.e(FUNCTION);
        r rVar11 = FILE;
        FILE_LIST = AbstractC3689v.e(rVar11);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        r rVar12 = VALUE_PARAMETER;
        USE_SITE_MAPPING = U.k(z.a(eVar, rVar12), z.a(e.FIELD, rVar8), z.a(e.PROPERTY, rVar7), z.a(e.FILE, rVar11), z.a(e.PROPERTY_GETTER, rVar10), z.a(e.PROPERTY_SETTER, rVar9), z.a(e.RECEIVER, rVar12), z.a(e.SETTER_PARAMETER, rVar12), z.a(e.PROPERTY_DELEGATE_FIELD, rVar8));
    }

    private r(String str, int i10, String str2, boolean z10) {
        this.description = str2;
        this.isDefault = z10;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    /* synthetic */ r(String str, int i10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? true : z10);
    }
}
