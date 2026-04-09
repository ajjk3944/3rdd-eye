.class public final enum Lgi/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lgi/e;

.field public static final enum BOOLEAN:Lgi/e;

.field public static final enum BYTE:Lgi/e;

.field public static final enum CHAR:Lgi/e;

.field public static final enum DOUBLE:Lgi/e;

.field public static final enum FLOAT:Lgi/e;

.field public static final enum INT:Lgi/e;

.field public static final enum LONG:Lgi/e;

.field private static final OWNER_TO_BOXING_METHOD_DESCRIPTOR:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SHORT:Lgi/e;

.field private static final TYPE_BY_DESC:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lgi/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final TYPE_BY_NAME:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lgi/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final TYPE_BY_PRIMITIVE_TYPE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lkotlin/reflect/jvm/internal/impl/builtins/l;",
            "Lgi/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final WRAPPER_CLASS_INTERNAL_NAMES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final desc:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final primitiveType:Lkotlin/reflect/jvm/internal/impl/builtins/l;

.field private final wrapperFqName:LZh/c;


# direct methods
.method private static synthetic $$$reportNull$$$0(I)V
    .locals 8

    const/4 v0, 0x6

    const/4 v1, 0x4

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_1

    const/4 v4, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"

    const/4 v6, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v7, "internalName"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_2
    const-string v7, "wrapperClassName"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_3
    const-string v7, "primitiveType"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_4
    const-string v7, "desc"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_5
    const-string v7, "type"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_6
    aput-object v5, v4, v6

    goto :goto_2

    :pswitch_7
    const-string v7, "name"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_8
    const-string v7, "methodDescriptor"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_9
    const-string v7, "owner"

    aput-object v7, v4, v6

    :goto_2
    const-string v6, "get"

    const/4 v7, 0x1

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_3

    aput-object v5, v4, v7

    goto :goto_3

    :pswitch_a
    const-string v5, "getWrapperFqName"

    aput-object v5, v4, v7

    goto :goto_3

    :pswitch_b
    const-string v5, "getDesc"

    aput-object v5, v4, v7

    goto :goto_3

    :pswitch_c
    const-string v5, "getJavaKeywordName"

    aput-object v5, v4, v7

    goto :goto_3

    :pswitch_d
    const-string v5, "getPrimitiveType"

    aput-object v5, v4, v7

    goto :goto_3

    :cond_2
    aput-object v6, v4, v7

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v5, "isWrapperClassInternalName"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_e
    const-string v5, "<init>"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_f
    const-string v5, "getByDesc"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_10
    aput-object v6, v4, v3

    goto :goto_4

    :pswitch_11
    const-string v5, "isBoxingMethodDescriptor"

    aput-object v5, v4, v3

    :goto_4
    :pswitch_12
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_3

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    :pswitch_13
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xc
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_4
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xc
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_12
        :pswitch_10
        :pswitch_12
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xc
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch
.end method

.method static constructor <clinit>()V
    .locals 22

    new-instance v7, Lgi/e;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v5, "Z"

    const-string v6, "java.lang.Boolean"

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    const-string v4, "boolean"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v7, Lgi/e;->BOOLEAN:Lgi/e;

    new-instance v1, Lgi/e;

    sget-object v11, Lkotlin/reflect/jvm/internal/impl/builtins/l;->CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v13, "C"

    const-string v14, "java.lang.Character"

    const-string v9, "CHAR"

    const/4 v10, 0x1

    const-string v12, "char"

    move-object v8, v1

    invoke-direct/range {v8 .. v14}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lgi/e;->CHAR:Lgi/e;

    new-instance v2, Lgi/e;

    sget-object v18, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v20, "B"

    const-string v21, "java.lang.Byte"

    const-string v16, "BYTE"

    const/16 v17, 0x2

    const-string v19, "byte"

    move-object v15, v2

    invoke-direct/range {v15 .. v21}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lgi/e;->BYTE:Lgi/e;

    new-instance v3, Lgi/e;

    sget-object v11, Lkotlin/reflect/jvm/internal/impl/builtins/l;->SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v13, "S"

    const-string v14, "java.lang.Short"

    const-string v9, "SHORT"

    const/4 v10, 0x3

    const-string v12, "short"

    move-object v8, v3

    invoke-direct/range {v8 .. v14}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lgi/e;->SHORT:Lgi/e;

    new-instance v4, Lgi/e;

    sget-object v18, Lkotlin/reflect/jvm/internal/impl/builtins/l;->INT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v20, "I"

    const-string v21, "java.lang.Integer"

    const-string v16, "INT"

    const/16 v17, 0x4

    const-string v19, "int"

    move-object v15, v4

    invoke-direct/range {v15 .. v21}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v4, Lgi/e;->INT:Lgi/e;

    new-instance v5, Lgi/e;

    sget-object v11, Lkotlin/reflect/jvm/internal/impl/builtins/l;->FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v13, "F"

    const-string v14, "java.lang.Float"

    const-string v9, "FLOAT"

    const/4 v10, 0x5

    const-string v12, "float"

    move-object v8, v5

    invoke-direct/range {v8 .. v14}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lgi/e;->FLOAT:Lgi/e;

    new-instance v6, Lgi/e;

    sget-object v18, Lkotlin/reflect/jvm/internal/impl/builtins/l;->LONG:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v20, "J"

    const-string v21, "java.lang.Long"

    const-string v16, "LONG"

    const/16 v17, 0x6

    const-string v19, "long"

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v6, Lgi/e;->LONG:Lgi/e;

    new-instance v15, Lgi/e;

    sget-object v11, Lkotlin/reflect/jvm/internal/impl/builtins/l;->DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    const-string v13, "D"

    const-string v14, "java.lang.Double"

    const-string v9, "DOUBLE"

    const/4 v10, 0x7

    const-string v12, "double"

    move-object v8, v15

    invoke-direct/range {v8 .. v14}, Lgi/e;-><init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v15, Lgi/e;->DOUBLE:Lgi/e;

    move-object v7, v15

    filled-new-array/range {v0 .. v7}, [Lgi/e;

    move-result-object v0

    sput-object v0, Lgi/e;->$VALUES:[Lgi/e;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lgi/e;->TYPE_BY_NAME:Ljava/util/Map;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lgi/e;->TYPE_BY_PRIMITIVE_TYPE:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lgi/e;->TYPE_BY_DESC:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lgi/e;->WRAPPER_CLASS_INTERNAL_NAMES:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lgi/e;->OWNER_TO_BOXING_METHOD_DESCRIPTOR:Ljava/util/Map;

    invoke-static {}, Lgi/e;->values()[Lgi/e;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    sget-object v4, Lgi/e;->TYPE_BY_NAME:Ljava/util/Map;

    invoke-virtual {v3}, Lgi/e;->getJavaKeywordName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lgi/e;->TYPE_BY_PRIMITIVE_TYPE:Ljava/util/Map;

    invoke-virtual {v3}, Lgi/e;->getPrimitiveType()Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lgi/e;->TYPE_BY_DESC:Ljava/util/Map;

    invoke-virtual {v3}, Lgi/e;->getDesc()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v3, Lgi/e;->wrapperFqName:LZh/c;

    invoke-virtual {v4}, LZh/c;->b()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x2e

    const/16 v6, 0x2f

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lgi/e;->WRAPPER_CLASS_INTERNAL_NAMES:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v5, Lgi/e;->OWNER_TO_BOXING_METHOD_DESCRIPTOR:Ljava/util/Map;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Lgi/e;->desc:Ljava/lang/String;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")L"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ";"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILkotlin/reflect/jvm/internal/impl/builtins/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/impl/builtins/l;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-nez p3, :cond_0

    const/16 v0, 0x8

    invoke-static {v0}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_0
    if-nez p4, :cond_1

    const/16 v0, 0x9

    invoke-static {v0}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0xa

    invoke-static {v0}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 v0, 0xb

    invoke-static {v0}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lgi/e;->primitiveType:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    iput-object p4, p0, Lgi/e;->name:Ljava/lang/String;

    iput-object p5, p0, Lgi/e;->desc:Ljava/lang/String;

    new-instance p1, LZh/c;

    invoke-direct {p1, p6}, LZh/c;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lgi/e;->wrapperFqName:LZh/c;

    return-void
.end method

.method public static get(Ljava/lang/String;)Lgi/e;
    .locals 3

    if-nez p0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lgi/e;->$$$reportNull$$$0(I)V

    .line 1
    :cond_0
    sget-object v0, Lgi/e;->TYPE_BY_NAME:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgi/e;

    if-eqz v0, :cond_1

    return-object v0

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Non-primitive type name passed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static get(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lgi/e;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, Lgi/e;->$$$reportNull$$$0(I)V

    .line 3
    :cond_0
    sget-object v0, Lgi/e;->TYPE_BY_PRIMITIVE_TYPE:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgi/e;

    if-nez p0, :cond_1

    const/4 v0, 0x6

    invoke-static {v0}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_1
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lgi/e;
    .locals 1

    const-class v0, Lgi/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgi/e;

    return-object p0
.end method

.method public static values()[Lgi/e;
    .locals 1

    sget-object v0, Lgi/e;->$VALUES:[Lgi/e;

    invoke-virtual {v0}, [Lgi/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgi/e;

    return-object v0
.end method


# virtual methods
.method public getDesc()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lgi/e;->desc:Ljava/lang/String;

    if-nez v0, :cond_0

    const/16 v1, 0xe

    invoke-static {v1}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_0
    return-object v0
.end method

.method public getJavaKeywordName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lgi/e;->name:Ljava/lang/String;

    if-nez v0, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_0
    return-object v0
.end method

.method public getPrimitiveType()Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 2

    iget-object v0, p0, Lgi/e;->primitiveType:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    if-nez v0, :cond_0

    const/16 v1, 0xc

    invoke-static {v1}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_0
    return-object v0
.end method

.method public getWrapperFqName()LZh/c;
    .locals 2

    iget-object v0, p0, Lgi/e;->wrapperFqName:LZh/c;

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, Lgi/e;->$$$reportNull$$$0(I)V

    :cond_0
    return-object v0
.end method
