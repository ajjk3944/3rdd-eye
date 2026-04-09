package kotlin.reflect.jvm.internal.impl.types.error;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE;
    public static final k CANNOT_COMPUTE_ERASED_BOUND;
    public static final k CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER;
    public static final k CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME;
    public static final k CYCLIC_SUPERTYPES;
    public static final k CYCLIC_UPPER_BOUNDS;
    public static final k DONT_CARE;
    public static final k EMPTY_CALLABLE_REFERENCE;
    public static final k ERROR_CLASS;
    public static final k ERROR_CONSTANT_VALUE;
    public static final k ERROR_DATA_FLOW_TYPE;
    public static final k ERROR_ENUM_TYPE;
    public static final k ERROR_EXPECTED_TYPE;
    public static final k ERROR_EXPRESSION_TYPE;
    public static final k ERROR_FLEXIBLE_TYPE;
    public static final k ERROR_PROPERTY_TYPE;
    public static final k ERROR_RAW_TYPE;
    public static final k ERROR_RECEIVER_TYPE;
    public static final k ERROR_SUPER_TYPE;
    public static final k ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT;
    public static final k ERROR_TYPE_PARAMETER;
    public static final k ERROR_TYPE_PROJECTION;
    public static final k ERROR_WHILE_RECONSTRUCTING_BARE_TYPE;
    public static final k FUNCTION_PLACEHOLDER_TYPE;
    public static final k ILLEGAL_TYPE_RANGE_FOR_DYNAMIC;
    public static final k IMPLICIT_RETURN_TYPE_FOR_FUNCTION;
    public static final k IMPLICIT_RETURN_TYPE_FOR_PROPERTY;
    public static final k IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR;
    public static final k INCONSISTENT_SUSPEND_FUNCTION;
    public static final k INTERSECTION_OF_ERROR_TYPES;
    public static final k KAPT_ERROR_TYPE;
    public static final k MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
    public static final k MISSED_TYPE_FOR_PARAMETER;
    public static final k NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT;
    public static final k NOT_FOUND_DESCRIPTOR_FOR_CLASS;
    public static final k NOT_FOUND_DESCRIPTOR_FOR_FUNCTION;
    public static final k NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER;
    public static final k NOT_FOUND_FQNAME;
    public static final k NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION;
    public static final k NOT_FOUND_UNSIGNED_TYPE;
    public static final k NO_RECORDED_TYPE;
    public static final k NO_TYPE_FOR_LOOP_PARAMETER;
    public static final k NO_TYPE_FOR_LOOP_RANGE;
    public static final k NO_TYPE_SPECIFIED;
    public static final k PARSE_ERROR_ARGUMENT;
    public static final k PROHIBITED_DYNAMIC_TYPE;
    public static final k RECURSIVE_ANNOTATION_TYPE;
    public static final k RECURSIVE_TYPE;
    public static final k RECURSIVE_TYPE_ALIAS;
    public static final k RESOLUTION_ERROR_TYPE;
    public static final k RETURN_NOT_ALLOWED;
    public static final k RETURN_TYPE;
    public static final k RETURN_TYPE_FOR_CONSTRUCTOR;
    public static final k RETURN_TYPE_FOR_FUNCTION;
    public static final k RETURN_TYPE_FOR_PROPERTY;
    public static final k STAR_PROJECTION_IN_CALL;
    public static final k STUB_TYPE;
    public static final k SUPER_TYPE_FOR_ERROR_TYPE;
    public static final k SYNTHETIC_ELEMENT_ERROR_TYPE;
    public static final k TYPE_FOR_COMPILER_EXCEPTION;
    public static final k TYPE_FOR_DELEGATION;
    public static final k TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
    public static final k TYPE_FOR_GENERATED_ERROR_EXPRESSION;
    public static final k TYPE_FOR_RESULT;
    public static final k TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS;
    public static final k UNABLE_TO_SUBSTITUTE_TYPE;
    public static final k UNAVAILABLE_TYPE_FOR_DECLARATION;
    public static final k UNEXPECTED_FLEXIBLE_TYPE_ID;
    public static final k UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE;
    public static final k UNINFERRED_LAMBDA_PARAMETER_TYPE;
    public static final k UNINFERRED_TYPE_VARIABLE;
    public static final k UNIT_RETURN_TYPE_FOR_INC_DEC;
    public static final k UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT;
    public static final k UNKNOWN_TYPE;
    public static final k UNMAPPED_ANNOTATION_TARGET_TYPE;
    public static final k UNRESOLVED_TYPE_ALIAS;
    public static final k UNSUPPORTED_CALLABLE_REFERENCE_TYPE;
    private final String debugMessage;
    private final boolean isUnresolved;
    public static final k UNRESOLVED_TYPE = new k("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
    public static final k UNRESOLVED_TYPE_PARAMETER_TYPE = new k("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
    public static final k UNRESOLVED_CLASS_TYPE = new k("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
    public static final k UNRESOLVED_JAVA_CLASS = new k("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
    public static final k UNRESOLVED_DECLARATION = new k("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
    public static final k UNRESOLVED_KCLASS_CONSTANT_VALUE = new k("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
    public static final k UNRESOLVED_PARCEL_TYPE = new k("UNRESOLVED_PARCEL_TYPE", 53, "Unresolved 'Parcel' type", true);

    private static final /* synthetic */ k[] $values() {
        return new k[]{UNRESOLVED_TYPE, UNRESOLVED_TYPE_PARAMETER_TYPE, UNRESOLVED_CLASS_TYPE, UNRESOLVED_JAVA_CLASS, UNRESOLVED_DECLARATION, UNRESOLVED_KCLASS_CONSTANT_VALUE, UNRESOLVED_TYPE_ALIAS, RETURN_TYPE, RETURN_TYPE_FOR_FUNCTION, RETURN_TYPE_FOR_PROPERTY, RETURN_TYPE_FOR_CONSTRUCTOR, IMPLICIT_RETURN_TYPE_FOR_FUNCTION, IMPLICIT_RETURN_TYPE_FOR_PROPERTY, IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR, ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT, RECURSIVE_TYPE, RECURSIVE_TYPE_ALIAS, RECURSIVE_ANNOTATION_TYPE, CYCLIC_UPPER_BOUNDS, CYCLIC_SUPERTYPES, UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE, UNINFERRED_LAMBDA_PARAMETER_TYPE, UNINFERRED_TYPE_VARIABLE, RESOLUTION_ERROR_TYPE, ERROR_EXPECTED_TYPE, ERROR_DATA_FLOW_TYPE, ERROR_WHILE_RECONSTRUCTING_BARE_TYPE, UNABLE_TO_SUBSTITUTE_TYPE, DONT_CARE, STUB_TYPE, FUNCTION_PLACEHOLDER_TYPE, TYPE_FOR_RESULT, TYPE_FOR_COMPILER_EXCEPTION, ERROR_FLEXIBLE_TYPE, ERROR_RAW_TYPE, TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS, ILLEGAL_TYPE_RANGE_FOR_DYNAMIC, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, INCONSISTENT_SUSPEND_FUNCTION, UNEXPECTED_FLEXIBLE_TYPE_ID, UNKNOWN_TYPE, NO_TYPE_SPECIFIED, NO_TYPE_FOR_LOOP_RANGE, NO_TYPE_FOR_LOOP_PARAMETER, MISSED_TYPE_FOR_PARAMETER, MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, PARSE_ERROR_ARGUMENT, STAR_PROJECTION_IN_CALL, PROHIBITED_DYNAMIC_TYPE, NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT, UNIT_RETURN_TYPE_FOR_INC_DEC, RETURN_NOT_ALLOWED, UNRESOLVED_PARCEL_TYPE, KAPT_ERROR_TYPE, SYNTHETIC_ELEMENT_ERROR_TYPE, AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE, ERROR_EXPRESSION_TYPE, ERROR_RECEIVER_TYPE, ERROR_CONSTANT_VALUE, EMPTY_CALLABLE_REFERENCE, UNSUPPORTED_CALLABLE_REFERENCE_TYPE, TYPE_FOR_DELEGATION, UNAVAILABLE_TYPE_FOR_DECLARATION, ERROR_TYPE_PARAMETER, ERROR_TYPE_PROJECTION, ERROR_SUPER_TYPE, SUPER_TYPE_FOR_ERROR_TYPE, ERROR_PROPERTY_TYPE, ERROR_CLASS, TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, INTERSECTION_OF_ERROR_TYPES, CANNOT_COMPUTE_ERASED_BOUND, NOT_FOUND_UNSIGNED_TYPE, ERROR_ENUM_TYPE, NO_RECORDED_TYPE, NOT_FOUND_DESCRIPTOR_FOR_FUNCTION, NOT_FOUND_DESCRIPTOR_FOR_CLASS, NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER, UNMAPPED_ANNOTATION_TARGET_TYPE, UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, NOT_FOUND_FQNAME, TYPE_FOR_GENERATED_ERROR_EXPRESSION};
    }

    static {
        int i10 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z10 = false;
        UNRESOLVED_TYPE_ALIAS = new k("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", z10, i10, defaultConstructorMarker);
        int i11 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z11 = false;
        RETURN_TYPE = new k("RETURN_TYPE", 7, "Return type for %s cannot be resolved", z11, i11, defaultConstructorMarker2);
        RETURN_TYPE_FOR_FUNCTION = new k("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", z10, i10, defaultConstructorMarker);
        RETURN_TYPE_FOR_PROPERTY = new k("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", z11, i11, defaultConstructorMarker2);
        RETURN_TYPE_FOR_CONSTRUCTOR = new k("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", z10, i10, defaultConstructorMarker);
        IMPLICIT_RETURN_TYPE_FOR_FUNCTION = new k("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", z11, i11, defaultConstructorMarker2);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", z10, i10, defaultConstructorMarker);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", z11, i11, defaultConstructorMarker2);
        ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT = new k("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", z10, i10, defaultConstructorMarker);
        RECURSIVE_TYPE = new k("RECURSIVE_TYPE", 15, "Recursive type", z11, i11, defaultConstructorMarker2);
        RECURSIVE_TYPE_ALIAS = new k("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", z10, i10, defaultConstructorMarker);
        RECURSIVE_ANNOTATION_TYPE = new k("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", z11, i11, defaultConstructorMarker2);
        CYCLIC_UPPER_BOUNDS = new k("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", z10, i10, defaultConstructorMarker);
        CYCLIC_SUPERTYPES = new k("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", z11, i11, defaultConstructorMarker2);
        UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE = new k("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", z10, i10, defaultConstructorMarker);
        UNINFERRED_LAMBDA_PARAMETER_TYPE = new k("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", z11, i11, defaultConstructorMarker2);
        UNINFERRED_TYPE_VARIABLE = new k("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", z10, i10, defaultConstructorMarker);
        RESOLUTION_ERROR_TYPE = new k("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", z11, i11, defaultConstructorMarker2);
        ERROR_EXPECTED_TYPE = new k("ERROR_EXPECTED_TYPE", 24, "Error expected type", z10, i10, defaultConstructorMarker);
        ERROR_DATA_FLOW_TYPE = new k("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", z11, i11, defaultConstructorMarker2);
        ERROR_WHILE_RECONSTRUCTING_BARE_TYPE = new k("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", z10, i10, defaultConstructorMarker);
        UNABLE_TO_SUBSTITUTE_TYPE = new k("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", z11, i11, defaultConstructorMarker2);
        DONT_CARE = new k("DONT_CARE", 28, "Special DONT_CARE type", z10, i10, defaultConstructorMarker);
        STUB_TYPE = new k("STUB_TYPE", 29, "Stub type %s", z11, i11, defaultConstructorMarker2);
        FUNCTION_PLACEHOLDER_TYPE = new k("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", z10, i10, defaultConstructorMarker);
        TYPE_FOR_RESULT = new k("TYPE_FOR_RESULT", 31, "Stubbed 'Result' type", z11, i11, defaultConstructorMarker2);
        TYPE_FOR_COMPILER_EXCEPTION = new k("TYPE_FOR_COMPILER_EXCEPTION", 32, "Error type for a compiler exception while analyzing %s", z10, i10, defaultConstructorMarker);
        ERROR_FLEXIBLE_TYPE = new k("ERROR_FLEXIBLE_TYPE", 33, "Error java flexible type with id %s. (%s..%s)", z11, i11, defaultConstructorMarker2);
        ERROR_RAW_TYPE = new k("ERROR_RAW_TYPE", 34, "Error raw type %s", z10, i10, defaultConstructorMarker);
        TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS = new k("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", z11, i11, defaultConstructorMarker2);
        ILLEGAL_TYPE_RANGE_FOR_DYNAMIC = new k("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 36, "Illegal type range for dynamic type %s..%s", z10, i10, defaultConstructorMarker);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 37, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", z11, i11, defaultConstructorMarker2);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 38, "Couldn't deserialize type parameter %s in %s", z10, i10, defaultConstructorMarker);
        INCONSISTENT_SUSPEND_FUNCTION = new k("INCONSISTENT_SUSPEND_FUNCTION", 39, "Inconsistent suspend function type in metadata with constructor %s", z11, i11, defaultConstructorMarker2);
        UNEXPECTED_FLEXIBLE_TYPE_ID = new k("UNEXPECTED_FLEXIBLE_TYPE_ID", 40, "Unexpected id of a flexible type %s. (%s..%s)", z10, i10, defaultConstructorMarker);
        UNKNOWN_TYPE = new k("UNKNOWN_TYPE", 41, "Unknown type", z11, i11, defaultConstructorMarker2);
        NO_TYPE_SPECIFIED = new k("NO_TYPE_SPECIFIED", 42, "No type specified for %s", z10, i10, defaultConstructorMarker);
        NO_TYPE_FOR_LOOP_RANGE = new k("NO_TYPE_FOR_LOOP_RANGE", 43, "Loop range has no type", z11, i11, defaultConstructorMarker2);
        NO_TYPE_FOR_LOOP_PARAMETER = new k("NO_TYPE_FOR_LOOP_PARAMETER", 44, "Loop parameter has no type", z10, i10, defaultConstructorMarker);
        MISSED_TYPE_FOR_PARAMETER = new k("MISSED_TYPE_FOR_PARAMETER", 45, "Missed a type for a value parameter %s", z11, i11, defaultConstructorMarker2);
        MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER = new k("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 46, "Missed a type argument for a type parameter %s", z10, i10, defaultConstructorMarker);
        PARSE_ERROR_ARGUMENT = new k("PARSE_ERROR_ARGUMENT", 47, "Error type for parse error argument %s", z11, i11, defaultConstructorMarker2);
        STAR_PROJECTION_IN_CALL = new k("STAR_PROJECTION_IN_CALL", 48, "Error type for star projection directly passing as a call type argument", z10, i10, defaultConstructorMarker);
        PROHIBITED_DYNAMIC_TYPE = new k("PROHIBITED_DYNAMIC_TYPE", 49, "Dynamic type in a not allowed context", z11, i11, defaultConstructorMarker2);
        NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT = new k("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 50, "Not an annotation type %s in the annotation context", z10, i10, defaultConstructorMarker);
        UNIT_RETURN_TYPE_FOR_INC_DEC = new k("UNIT_RETURN_TYPE_FOR_INC_DEC", 51, "Unit type returned by inc or dec", z11, i11, defaultConstructorMarker2);
        RETURN_NOT_ALLOWED = new k("RETURN_NOT_ALLOWED", 52, "Return not allowed", z10, i10, defaultConstructorMarker);
        KAPT_ERROR_TYPE = new k("KAPT_ERROR_TYPE", 54, "Kapt error type", z10, i10, defaultConstructorMarker);
        SYNTHETIC_ELEMENT_ERROR_TYPE = new k("SYNTHETIC_ELEMENT_ERROR_TYPE", 55, "Error type for synthetic element", z11, i11, defaultConstructorMarker2);
        int i12 = 2;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z12 = false;
        AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE = new k("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 56, "Error type in ad hoc resolve for lighter classes", z12, i12, defaultConstructorMarker3);
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        boolean z13 = false;
        ERROR_EXPRESSION_TYPE = new k("ERROR_EXPRESSION_TYPE", 57, "Error expression type", z13, i13, defaultConstructorMarker4);
        ERROR_RECEIVER_TYPE = new k("ERROR_RECEIVER_TYPE", 58, "Error receiver type for %s", z12, i12, defaultConstructorMarker3);
        ERROR_CONSTANT_VALUE = new k("ERROR_CONSTANT_VALUE", 59, "Error constant value %s", z13, i13, defaultConstructorMarker4);
        EMPTY_CALLABLE_REFERENCE = new k("EMPTY_CALLABLE_REFERENCE", 60, "Empty callable reference", z12, i12, defaultConstructorMarker3);
        UNSUPPORTED_CALLABLE_REFERENCE_TYPE = new k("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 61, "Unsupported callable reference type %s", z13, i13, defaultConstructorMarker4);
        TYPE_FOR_DELEGATION = new k("TYPE_FOR_DELEGATION", 62, "Error delegation type for %s", z12, i12, defaultConstructorMarker3);
        UNAVAILABLE_TYPE_FOR_DECLARATION = new k("UNAVAILABLE_TYPE_FOR_DECLARATION", 63, "Type is unavailable for declaration %s", z13, i13, defaultConstructorMarker4);
        ERROR_TYPE_PARAMETER = new k("ERROR_TYPE_PARAMETER", 64, "Error type parameter", z12, i12, defaultConstructorMarker3);
        ERROR_TYPE_PROJECTION = new k("ERROR_TYPE_PROJECTION", 65, "Error type projection", z13, i13, defaultConstructorMarker4);
        ERROR_SUPER_TYPE = new k("ERROR_SUPER_TYPE", 66, "Error super type", z12, i12, defaultConstructorMarker3);
        SUPER_TYPE_FOR_ERROR_TYPE = new k("SUPER_TYPE_FOR_ERROR_TYPE", 67, "Supertype of error type %s", z13, i13, defaultConstructorMarker4);
        ERROR_PROPERTY_TYPE = new k("ERROR_PROPERTY_TYPE", 68, "Error property type", z12, i12, defaultConstructorMarker3);
        ERROR_CLASS = new k("ERROR_CLASS", 69, "Error class", z13, i13, defaultConstructorMarker4);
        TYPE_FOR_ERROR_TYPE_CONSTRUCTOR = new k("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 70, "Type for error type constructor (%s)", z12, i12, defaultConstructorMarker3);
        INTERSECTION_OF_ERROR_TYPES = new k("INTERSECTION_OF_ERROR_TYPES", 71, "Intersection of error types %s", z13, i13, defaultConstructorMarker4);
        CANNOT_COMPUTE_ERASED_BOUND = new k("CANNOT_COMPUTE_ERASED_BOUND", 72, "Cannot compute erased upper bound of a type parameter %s", z12, i12, defaultConstructorMarker3);
        NOT_FOUND_UNSIGNED_TYPE = new k("NOT_FOUND_UNSIGNED_TYPE", 73, "Unsigned type %s not found", z13, i13, defaultConstructorMarker4);
        ERROR_ENUM_TYPE = new k("ERROR_ENUM_TYPE", 74, "Not found the corresponding enum class for given enum entry %s.%s", z12, i12, defaultConstructorMarker3);
        NO_RECORDED_TYPE = new k("NO_RECORDED_TYPE", 75, "Not found recorded type for %s", z13, i13, defaultConstructorMarker4);
        NOT_FOUND_DESCRIPTOR_FOR_FUNCTION = new k("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 76, "Descriptor not found for function %s", z12, i12, defaultConstructorMarker3);
        NOT_FOUND_DESCRIPTOR_FOR_CLASS = new k("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 77, "Cannot build class type, descriptor not found for builder %s", z13, i13, defaultConstructorMarker4);
        NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER = new k("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 78, "Cannot build type parameter type, descriptor not found for builder %s", z12, i12, defaultConstructorMarker3);
        UNMAPPED_ANNOTATION_TARGET_TYPE = new k("UNMAPPED_ANNOTATION_TARGET_TYPE", 79, "Type for unmapped Java annotation target to Kotlin one", z13, i13, defaultConstructorMarker4);
        UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT = new k("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 80, "Unknown type for an array element of a java annotation argument", z12, i12, defaultConstructorMarker3);
        NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION = new k("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 81, "No fqName for annotation %s", z13, i13, defaultConstructorMarker4);
        NOT_FOUND_FQNAME = new k("NOT_FOUND_FQNAME", 82, "No fqName for %s", z12, i12, defaultConstructorMarker3);
        TYPE_FOR_GENERATED_ERROR_EXPRESSION = new k("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 83, "Type for generated error expression", z13, i13, defaultConstructorMarker4);
        k[] kVarArr$values = $values();
        $VALUES = kVarArr$values;
        $ENTRIES = AbstractC5827b.a(kVarArr$values);
    }

    private k(String str, int i10, String str2, boolean z10) {
        this.debugMessage = str2;
        this.isUnresolved = z10;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final boolean isUnresolved() {
        return this.isUnresolved;
    }

    /* synthetic */ k(String str, int i10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10);
    }
}
