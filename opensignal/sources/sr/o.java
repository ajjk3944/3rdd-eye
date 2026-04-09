package sr;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mq.b0;

/* loaded from: classes.dex */
public enum o {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);

    private static final Set<o> ALL_TARGET_SET;
    private static final List<o> ANNOTATION_CLASS_LIST;
    private static final List<o> CLASS_LIST;
    private static final List<o> COMPANION_OBJECT_LIST;
    private static final Set<o> DEFAULT_TARGET_SET;
    private static final List<o> ENUM_ENTRY_LIST;
    private static final List<o> ENUM_LIST;
    private static final List<o> FILE_LIST;
    private static final List<o> FUNCTION_LIST;
    private static final List<o> INTERFACE_LIST;
    private static final List<o> LOCAL_CLASS_LIST;
    private static final List<o> OBJECT_LIST;
    private static final List<o> PROPERTY_GETTER_LIST;
    private static final List<o> PROPERTY_SETTER_LIST;
    private static final Map<d, o> USE_SITE_MAPPING;
    private final String description;
    private final boolean isDefault;
    public static final n Companion = new n();
    private static final HashMap<String, o> map = new HashMap<>();

    static {
        for (o oVar : values()) {
            map.put(oVar.name(), oVar);
        }
        o[] oVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (o oVar2 : oVarArrValues) {
            if (oVar2.isDefault) {
                arrayList.add(oVar2);
            }
        }
        DEFAULT_TARGET_SET = mq.o.U0(arrayList);
        ALL_TARGET_SET = mq.l.B0(values());
        o oVar3 = ANNOTATION_CLASS;
        o oVar4 = CLASS;
        ANNOTATION_CLASS_LIST = e5.I(oVar3, oVar4);
        LOCAL_CLASS_LIST = e5.I(LOCAL_CLASS, oVar4);
        CLASS_LIST = e5.I(CLASS_ONLY, oVar4);
        o oVar5 = COMPANION_OBJECT;
        o oVar6 = OBJECT;
        COMPANION_OBJECT_LIST = e5.I(oVar5, oVar6, oVar4);
        OBJECT_LIST = e5.I(STANDALONE_OBJECT, oVar6, oVar4);
        INTERFACE_LIST = e5.I(INTERFACE, oVar4);
        ENUM_LIST = e5.I(ENUM_CLASS, oVar4);
        o oVar7 = ENUM_ENTRY;
        o oVar8 = PROPERTY;
        o oVar9 = FIELD;
        ENUM_ENTRY_LIST = e5.I(oVar7, oVar8, oVar9);
        o oVar10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = e5.H(oVar10);
        o oVar11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = e5.H(oVar11);
        FUNCTION_LIST = e5.H(FUNCTION);
        o oVar12 = FILE;
        FILE_LIST = e5.H(oVar12);
        d dVar = d.CONSTRUCTOR_PARAMETER;
        o oVar13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = b0.R(new lq.l(dVar, oVar13), new lq.l(d.FIELD, oVar9), new lq.l(d.PROPERTY, oVar8), new lq.l(d.FILE, oVar12), new lq.l(d.PROPERTY_GETTER, oVar11), new lq.l(d.PROPERTY_SETTER, oVar10), new lq.l(d.RECEIVER, oVar13), new lq.l(d.SETTER_PARAMETER, oVar13), new lq.l(d.PROPERTY_DELEGATE_FIELD, oVar9));
    }

    o(String str, boolean z10) {
        this.description = str;
        this.isDefault = z10;
    }

    /* synthetic */ o(String str, boolean z10, int i10, br.g gVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
