.class public abstract Lkotlin/reflect/jvm/internal/impl/builtins/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/builtins/i$e;
    }
.end annotation


# static fields
.field public static final g:LZh/f;


# instance fields
.field private a:LDh/F;

.field private b:Loi/i;

.field private final c:Loi/i;

.field private final d:Loi/i;

.field private final e:Loi/g;

.field private final f:Loi/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "<built-ins module>"

    invoke-static {v0}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g:LZh/f;

    return-void
.end method

.method protected constructor <init>(Loi/n;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f:Loi/n;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/i$a;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i$a;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;)V

    invoke-interface {p1, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->d:Loi/i;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/i$b;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i$b;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;)V

    invoke-interface {p1, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c:Loi/i;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/i$c;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i$c;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;)V

    invoke-interface {p1, v0}, Loi/n;->e(Lmh/l;)Loi/g;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e:Loi/g;

    return-void
.end method

.method private static A(Lpi/S;LBh/G;)Lpi/S;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x48

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x49

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_2

    return-object v0

    :cond_2
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/s;->a:Lkotlin/reflect/jvm/internal/impl/builtins/s;

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/s;->b(LZh/f;)Z

    move-result v2

    if-nez v2, :cond_3

    return-object v0

    :cond_3
    invoke-static {p0}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object p0

    if-nez p0, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {v1, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/s;->a(LZh/b;)LZh/b;

    move-result-object p0

    if-nez p0, :cond_5

    return-object v0

    :cond_5
    invoke-static {p1, p0}, LBh/y;->b(LBh/G;LZh/b;)LBh/e;

    move-result-object p0

    if-nez p0, :cond_6

    return-object v0

    :cond_6
    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static A0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x82

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->I0:LZh/c;

    invoke-virtual {v0}, LZh/c;->j()LZh/d;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method public static B0(LBh/m;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    :goto_0
    if-eqz p0, :cond_2

    instance-of v0, p0, LBh/M;

    if-eqz v0, :cond_1

    check-cast p0, LBh/M;

    invoke-interface {p0}, LBh/M;->e()LZh/c;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->z:LZh/f;

    invoke-virtual {p0, v0}, LZh/c;->i(LZh/f;)Z

    move-result p0

    return p0

    :cond_1
    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static C0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x8f

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->f:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->m0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method public static D0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x85

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->x0(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->A0(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->y0(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->z0(Lpi/S;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static N(Lpi/S;)Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x5d

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->P(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static P(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x4e

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->M0:Ljava/util/Set;

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->O0:Ljava/util/Map;

    invoke-static {p0}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private Q(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LBh/e;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x10

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/l;->getTypeName()LZh/f;

    move-result-object p1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public static S(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x4d

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->L0:Ljava/util/Set;

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->N0:Ljava/util/Map;

    invoke-static {p0}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/builtins/l;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static synthetic a(I)V
    .locals 13

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    :pswitch_2
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_3
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "storageManager"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "declarationDescriptor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "classDescriptor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "typeConstructor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "annotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "argument"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "projectionType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "kotlinType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "primitiveType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "notNullArrayType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    const-string v5, "arrayType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_e
    const-string v5, "classSimpleName"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_f
    const-string v5, "type"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_10
    const-string v5, "simpleName"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_11
    const-string v5, "fqName"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_12
    const-string v5, "descriptor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_13
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_14
    const-string v5, "computation"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_15
    const-string v5, "module"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "getBuiltInClassByFqName"

    const-string v5, "getBuiltInClassByName"

    const-string v6, "getBuiltInTypeByClassName"

    const-string v7, "getPrimitiveKotlinType"

    const-string v8, "getArrayElementType"

    const-string v9, "getPrimitiveArrayKotlinType"

    const-string v10, "getArrayType"

    const-string v11, "getEnumType"

    const/4 v12, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_16
    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_17
    const-string v3, "getAnnotationType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_18
    aput-object v11, v2, v12

    goto/16 :goto_3

    :pswitch_19
    aput-object v10, v2, v12

    goto/16 :goto_3

    :pswitch_1a
    aput-object v9, v2, v12

    goto/16 :goto_3

    :pswitch_1b
    aput-object v8, v2, v12

    goto/16 :goto_3

    :pswitch_1c
    const-string v3, "getIterableType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_1d
    const-string v3, "getStringType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_1e
    const-string v3, "getUnitType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_1f
    const-string v3, "getBooleanType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_20
    const-string v3, "getCharType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_21
    const-string v3, "getDoubleType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_22
    const-string v3, "getFloatType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_23
    const-string v3, "getLongType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_24
    const-string v3, "getIntType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_25
    const-string v3, "getShortType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_26
    const-string v3, "getByteType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_27
    const-string v3, "getNumberType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_28
    aput-object v7, v2, v12

    goto/16 :goto_3

    :pswitch_29
    const-string v3, "getDefaultBound"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_2a
    const-string v3, "getNullableAnyType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_2b
    const-string v3, "getAnyType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_2c
    const-string v3, "getNullableNothingType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_2d
    const-string v3, "getNothingType"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_2e
    aput-object v6, v2, v12

    goto/16 :goto_3

    :pswitch_2f
    const-string v3, "getMutableListIterator"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_30
    const-string v3, "getListIterator"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_31
    const-string v3, "getMutableMapEntry"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_32
    const-string v3, "getMapEntry"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_33
    const-string v3, "getMutableMap"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_34
    const-string v3, "getMap"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_35
    const-string v3, "getMutableSet"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_36
    const-string v3, "getSet"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_37
    const-string v3, "getMutableList"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_38
    const-string v3, "getList"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_39
    const-string v3, "getMutableCollection"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_3a
    const-string v3, "getCollection"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_3b
    const-string v3, "getMutableIterator"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_3c
    const-string v3, "getMutableIterable"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_3d
    const-string v3, "getIterable"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_3e
    const-string v3, "getIterator"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_3f
    const-string v3, "getKMutableProperty2"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_40
    const-string v3, "getKMutableProperty1"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_41
    const-string v3, "getKMutableProperty0"

    aput-object v3, v2, v12

    goto/16 :goto_3

    :pswitch_42
    const-string v3, "getKProperty2"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_43
    const-string v3, "getKProperty1"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_44
    const-string v3, "getKProperty0"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_45
    const-string v3, "getKProperty"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_46
    const-string v3, "getKCallable"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_47
    const-string v3, "getKType"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_48
    const-string v3, "getKClass"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_49
    const-string v3, "getKSuspendFunction"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_4a
    const-string v3, "getKFunction"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_4b
    const-string v3, "getSuspendFunction"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_4c
    aput-object v5, v2, v12

    goto :goto_3

    :pswitch_4d
    aput-object v4, v2, v12

    goto :goto_3

    :pswitch_4e
    const-string v3, "getBuiltInsPackageScope"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_4f
    const-string v3, "getBuiltInPackagesImportedByDefault"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_50
    const-string v3, "getBuiltInsModule"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_51
    const-string v3, "getStorageManager"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_52
    const-string v3, "getClassDescriptorFactories"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_53
    const-string v3, "getPlatformDependentDeclarationFilter"

    aput-object v3, v2, v12

    goto :goto_3

    :pswitch_54
    const-string v3, "getAdditionalClassPartsProvider"

    aput-object v3, v2, v12

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_55
    const-string v3, "isNotNullOrNullableFunctionSupertype"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_56
    const-string v3, "isDeprecated"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_57
    const-string v3, "isCloneable"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_58
    const-string v3, "isNonPrimitiveArray"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_59
    const-string v3, "isKClass"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_5a
    const-string v3, "isThrowable"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_5b
    const-string v3, "isThrowableOrNullableThrowable"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_5c
    const-string v3, "isIterableOrNullableIterable"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_5d
    const-string v3, "isMapOrNullableMap"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_5e
    const-string v3, "isSetOrNullableSet"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_5f
    const-string v3, "isListOrNullableList"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_60
    const-string v3, "isCollectionOrNullableCollection"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_61
    const-string v3, "isComparable"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_62
    const-string v3, "isEnum"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_63
    const-string v3, "isMemberOfAny"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_64
    const-string v3, "isBooleanOrSubtype"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_65
    const-string v3, "isUnitOrNullableUnit"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_66
    const-string v3, "mayReturnNonUnitValue"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_67
    const-string v3, "isUnit"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_68
    const-string v3, "isDefaultBound"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_69
    const-string v3, "isNullableAny"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_6a
    const-string v3, "isAnyOrNullableAny"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_6b
    const-string v3, "isNothingOrNullableNothing"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_6c
    const-string v3, "isNullableNothing"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_6d
    const-string v3, "isNothing"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_6e
    const-string v3, "isConstructedFromGivenClassAndNotNullable"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_6f
    const-string v3, "isDoubleOrNullableDouble"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_70
    const-string v3, "isUnsignedArrayType"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_71
    const-string v3, "isULongArray"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_72
    const-string v3, "isUIntArray"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_73
    const-string v3, "isUShortArray"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_74
    const-string v3, "isUByteArray"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_75
    const-string v3, "isULong"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_76
    const-string v3, "isUInt"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_77
    const-string v3, "isUShort"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_78
    const-string v3, "isUByte"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_79
    const-string v3, "isDouble"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_7a
    const-string v3, "isFloatOrNullableFloat"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_7b
    const-string v3, "isFloat"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_7c
    const-string v3, "isShort"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_7d
    const-string v3, "isLongOrNullableLong"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_7e
    const-string v3, "isLong"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_7f
    const-string v3, "isByte"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_80
    const-string v3, "isInt"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_81
    const-string v3, "isCharOrNullableChar"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_82
    const-string v3, "isChar"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_83
    const-string v3, "isNumber"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_84
    const-string v3, "isBooleanOrNullableBoolean"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_85
    const-string v3, "isBoolean"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_86
    const-string v3, "isAny"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_87
    const-string v3, "isSpecialClassWithNoSupertypes"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_88
    const-string v3, "isNotNullConstructedFromGivenClass"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_89
    const-string v3, "classFqNameEquals"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_8a
    const-string v3, "isTypeConstructorForGivenClass"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_8b
    const-string v3, "isConstructedFromGivenClass"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_8c
    const-string v3, "isPrimitiveClass"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_8d
    const-string v3, "isPrimitiveTypeOrNullablePrimitiveType"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_8e
    const-string v3, "isPrimitiveType"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_8f
    const-string v3, "getPrimitiveArrayElementType"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_90
    const-string v3, "isPrimitiveArray"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_91
    const-string v3, "isArrayOrPrimitiveArray"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_92
    const-string v3, "isArray"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_93
    aput-object v11, v2, v1

    goto :goto_4

    :pswitch_94
    aput-object v10, v2, v1

    goto :goto_4

    :pswitch_95
    const-string v3, "getPrimitiveArrayType"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_96
    const-string v3, "getPrimitiveType"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_97
    const-string v3, "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_98
    aput-object v9, v2, v1

    goto :goto_4

    :pswitch_99
    const-string v3, "getElementTypeForUnsignedArray"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_9a
    aput-object v8, v2, v1

    goto :goto_4

    :pswitch_9b
    aput-object v7, v2, v1

    goto :goto_4

    :pswitch_9c
    aput-object v6, v2, v1

    goto :goto_4

    :pswitch_9d
    const-string v3, "getPrimitiveArrayClassDescriptor"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_9e
    const-string v3, "getPrimitiveClassDescriptor"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_9f
    aput-object v5, v2, v1

    goto :goto_4

    :pswitch_a0
    aput-object v4, v2, v1

    goto :goto_4

    :pswitch_a1
    const-string v3, "isUnderKotlinPackage"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_a2
    const-string v3, "isBuiltIn"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_a3
    const-string v3, "setPostponedBuiltinsModuleComputation"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_a4
    const-string v3, "setBuiltInsModule"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_a5
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_a6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_a7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_12
        :pswitch_13
        :pswitch_11
        :pswitch_13
        :pswitch_10
        :pswitch_13
        :pswitch_f
        :pswitch_f
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_e
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_f
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_d
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_c
        :pswitch_15
        :pswitch_b
        :pswitch_13
        :pswitch_a
        :pswitch_12
        :pswitch_12
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_13
        :pswitch_9
        :pswitch_8
        :pswitch_13
        :pswitch_8
        :pswitch_13
        :pswitch_13
        :pswitch_f
        :pswitch_12
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_12
        :pswitch_f
        :pswitch_11
        :pswitch_f
        :pswitch_11
        :pswitch_6
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_f
        :pswitch_11
        :pswitch_12
        :pswitch_12
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_5
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_11
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_12
        :pswitch_f
        :pswitch_f
        :pswitch_12
        :pswitch_12
        :pswitch_f
        :pswitch_12
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_4
        :pswitch_f
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x3
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_16
        :pswitch_16
        :pswitch_4e
        :pswitch_16
        :pswitch_4d
        :pswitch_16
        :pswitch_4c
        :pswitch_16
        :pswitch_16
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_16
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_16
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_16
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_1a
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_19
        :pswitch_16
        :pswitch_16
        :pswitch_19
        :pswitch_16
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_a4
        :pswitch_a3
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a2
        :pswitch_a1
        :pswitch_a5
        :pswitch_a0
        :pswitch_a5
        :pswitch_9f
        :pswitch_a5
        :pswitch_9e
        :pswitch_9d
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_9c
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_9b
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_9a
        :pswitch_a5
        :pswitch_a5
        :pswitch_a5
        :pswitch_99
        :pswitch_99
        :pswitch_98
        :pswitch_a5
        :pswitch_97
        :pswitch_96
        :pswitch_95
        :pswitch_94
        :pswitch_94
        :pswitch_94
        :pswitch_a5
        :pswitch_94
        :pswitch_94
        :pswitch_a5
        :pswitch_93
        :pswitch_a5
        :pswitch_a5
        :pswitch_92
        :pswitch_91
        :pswitch_91
        :pswitch_90
        :pswitch_8f
        :pswitch_96
        :pswitch_8e
        :pswitch_8d
        :pswitch_8c
        :pswitch_8b
        :pswitch_8b
        :pswitch_8b
        :pswitch_8b
        :pswitch_8a
        :pswitch_8a
        :pswitch_89
        :pswitch_89
        :pswitch_88
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_85
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_62
        :pswitch_61
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x3
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a6
        :pswitch_a6
        :pswitch_a7
        :pswitch_a6
        :pswitch_a7
        :pswitch_a6
        :pswitch_a7
        :pswitch_a6
        :pswitch_a6
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a6
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a6
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a6
        :pswitch_a7
        :pswitch_a7
        :pswitch_a7
        :pswitch_a6
        :pswitch_a6
        :pswitch_a6
        :pswitch_a7
        :pswitch_a6
        :pswitch_a6
        :pswitch_a6
        :pswitch_a6
        :pswitch_a6
        :pswitch_a6
        :pswitch_a7
        :pswitch_a6
        :pswitch_a6
        :pswitch_a7
        :pswitch_a6
        :pswitch_a7
        :pswitch_a7
    .end packed-switch
.end method

.method public static a0(LBh/e;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x6d

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->b:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e(LBh/h;LZh/d;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lkotlin/reflect/jvm/internal/impl/builtins/i;Ljava/lang/String;)Lpi/d0;
    .locals 0

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->q(Ljava/lang/String;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static b0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x8c

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->b:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->h0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lkotlin/reflect/jvm/internal/impl/builtins/i;)LDh/F;
    .locals 0

    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    return-object p0
.end method

.method public static c0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x59

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->i:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->h0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method static synthetic d(Lkotlin/reflect/jvm/internal/impl/builtins/i;LDh/F;)LDh/F;
    .locals 0

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    return-object p1
.end method

.method public static d0(LBh/e;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x5a

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->i:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e(LBh/h;LZh/d;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->P(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static e(LBh/h;LZh/d;)Z
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x68

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x69

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {p1}, LZh/d;->i()LZh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, LZh/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object p0

    invoke-virtual {p1, p0}, LZh/d;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x5b

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c0(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->q0(Lpi/S;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static f0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x6f

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->j:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method public static g0(LBh/m;)Z
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    const-class v0, Lkotlin/reflect/jvm/internal/impl/builtins/c;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lbi/i;->r(LBh/m;Ljava/lang/Class;Z)LBh/m;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private static h0(Lpi/S;LZh/d;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x62

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x63

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->w0(Lpi/v0;LZh/d;)Z

    move-result p0

    return p0
.end method

.method private static i0(Lpi/S;LZh/d;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x87

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x88

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->h0(Lpi/S;LZh/d;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static j0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x8e

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p0(Lpi/S;)Z

    move-result p0

    return p0
.end method

.method public static k0(LBh/m;)Z
    .locals 4

    if-nez p0, :cond_0

    const/16 v0, 0xa2

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-interface {p0}, LBh/m;->a()LBh/m;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->y:LZh/c;

    invoke-interface {v0, v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    return v1

    :cond_1
    instance-of v0, p0, LBh/Y;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p0, LBh/Y;

    invoke-interface {p0}, LBh/t0;->h0()Z

    move-result v0

    invoke-interface {p0}, LBh/Y;->d()LBh/Z;

    move-result-object v3

    invoke-interface {p0}, LBh/Y;->g()LBh/a0;

    move-result-object p0

    if-eqz v3, :cond_2

    invoke-static {v3}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k0(LBh/m;)Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz v0, :cond_3

    if-eqz p0, :cond_2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k0(LBh/m;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :cond_3
    :goto_0
    return v1

    :cond_4
    return v2
.end method

.method public static l0(LBh/e;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x9f

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->l0:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e(LBh/h;LZh/d;)Z

    move-result p0

    return p0
.end method

.method private static m0(Lpi/S;LZh/d;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x6a

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x6b

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->h0(Lpi/S;LZh/d;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x89

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->o0(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lpi/J0;->l(Lpi/S;)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static o0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x8b

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->c:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->h0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method private p(Ljava/lang/String;)LBh/e;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e:Loi/g;

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/e;

    if-nez p1, :cond_1

    const/16 v0, 0xf

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    return-object p1
.end method

.method public static p0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x8d

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->b0(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private q(Ljava/lang/String;)Lpi/d0;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x2f

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object p1

    invoke-interface {p1}, LBh/e;->u()Lpi/d0;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0x30

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    return-object p1
.end method

.method public static q0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x5c

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->P(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static r0(LBh/e;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x61

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->S(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static s0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x5f

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->t0(Lpi/S;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static t0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x60

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_1

    check-cast p0, LBh/e;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->r0(LBh/e;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static u0(LBh/e;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x6c

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->b:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e(LBh/h;LZh/d;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->c:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e(LBh/h;LZh/d;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static v0(Lpi/S;)Z
    .locals 1

    if-eqz p0, :cond_0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->h:LZh/d;

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->m0(Lpi/S;LZh/d;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static w0(Lpi/v0;LZh/d;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x66

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x67

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_2

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e(LBh/h;LZh/d;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static x0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x81

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->H0:LZh/c;

    invoke-virtual {v0}, LZh/c;->j()LZh/d;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method public static y0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x83

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->J0:LZh/c;

    invoke-virtual {v0}, LZh/c;->j()LZh/d;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method

.method public static z0(Lpi/S;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x84

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->K0:LZh/c;

    invoke-virtual {v0}, LZh/c;->j()LZh/d;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i0(Lpi/S;LZh/d;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public B()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x3d

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public C(I)LBh/e;
    .locals 0

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/o;->b(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public D()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->INT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x3b

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public E()LBh/e;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->l0:LZh/d;

    invoke-virtual {v0}, LZh/d;->l()LZh/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->o(LZh/c;)LBh/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public E0(LDh/F;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f:Loi/n;

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;

    invoke-direct {v1, p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LDh/F;)V

    invoke-interface {v0, v1}, Loi/n;->d(Lmh/a;)Ljava/lang/Object;

    return-void
.end method

.method public F()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->LONG:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x3c

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public G()LBh/e;
    .locals 1

    const-string v0, "Nothing"

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public H()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->G()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x31

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public I()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x34

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public J()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->H()Lpi/d0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x32

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public K()LBh/e;
    .locals 1

    const-string v0, "Number"

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public L()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->K()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x38

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method protected M()LCh/c;
    .locals 2

    sget-object v0, LCh/c$b;->a:LCh/c$b;

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public O(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x4a

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/builtins/i$e;

    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/builtins/i$e;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/d0;

    if-nez p1, :cond_1

    const/16 v0, 0x4b

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    return-object p1
.end method

.method public R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x36

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->Q(Lkotlin/reflect/jvm/internal/impl/builtins/l;)LBh/e;

    move-result-object p1

    invoke-interface {p1}, LBh/e;->u()Lpi/d0;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0x37

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    return-object p1
.end method

.method public T()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x3a

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method protected U()Loi/n;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f:Loi/n;

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public V()LBh/e;
    .locals 1

    const-string v0, "String"

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public W()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->V()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x42

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public X(I)LBh/e;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->s:LZh/c;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/o;->d(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p1

    invoke-virtual {v0, p1}, LZh/c;->c(LZh/f;)LZh/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->o(LZh/c;)LBh/e;

    move-result-object p1

    if-nez p1, :cond_0

    const/16 v0, 0x12

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object p1
.end method

.method public Y()LBh/e;
    .locals 1

    const-string v0, "Unit"

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public Z()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->Y()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x41

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method protected f(Z)V
    .locals 9

    new-instance v0, LDh/F;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g:LZh/f;

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f:Loi/n;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p0, v3}, LDh/F;-><init>(LZh/f;Loi/n;Lkotlin/reflect/jvm/internal/impl/builtins/i;Lai/a;)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/b;->a:Lkotlin/reflect/jvm/internal/impl/builtins/b$a;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/b$a;->c()Lkotlin/reflect/jvm/internal/impl/builtins/b;

    move-result-object v2

    iget-object v3, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f:Loi/n;

    iget-object v4, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->v()Ljava/lang/Iterable;

    move-result-object v5

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->M()LCh/c;

    move-result-object v6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g()LCh/a;

    move-result-object v7

    move v8, p1

    invoke-interface/range {v2 .. v8}, Lkotlin/reflect/jvm/internal/impl/builtins/b;->a(Loi/n;LBh/G;Ljava/lang/Iterable;LCh/c;LCh/a;Z)LBh/N;

    move-result-object p1

    invoke-virtual {v0, p1}, LDh/F;->O0(LBh/N;)V

    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    filled-new-array {p1}, [LDh/F;

    move-result-object v0

    invoke-virtual {p1, v0}, LDh/F;->W0([LDh/F;)V

    return-void
.end method

.method protected g()LCh/a;
    .locals 2

    sget-object v0, LCh/a$a;->a:LCh/a$a;

    if-nez v0, :cond_0

    const/4 v1, 0x3

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public h()LBh/e;
    .locals 1

    const-string v0, "Any"

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public i()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->h()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x33

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public j()LBh/e;
    .locals 1

    const-string v0, "Array"

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public k(Lpi/S;)Lpi/S;
    .locals 3

    if-nez p1, :cond_0

    const/16 v0, 0x44

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c0(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/B0;

    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0x45

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_3
    invoke-static {p1}, Lpi/J0;->n(Lpi/S;)Lpi/S;

    move-result-object v0

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c:Loi/i;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/builtins/i$e;

    iget-object v1, v1, Lkotlin/reflect/jvm/internal/impl/builtins/i$e;->c:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    invoke-static {v0}, Lbi/i;->i(Lpi/S;)LBh/G;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->A(Lpi/S;LBh/G;)Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not array: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l(Lpi/N0;Lpi/S;)Lpi/d0;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x53

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x54

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->m(Lpi/N0;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/d0;

    move-result-object p1

    if-nez p1, :cond_2

    const/16 p2, 0x55

    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_2
    return-object p1
.end method

.method public m(Lpi/N0;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/d0;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x4f

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x50

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    if-nez p3, :cond_2

    const/16 v0, 0x51

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_2
    new-instance v0, Lpi/D0;

    invoke-direct {v0, p1, p2}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p3}, Lpi/s0;->b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/r0;

    move-result-object p2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->j()LBh/e;

    move-result-object p3

    invoke-static {p2, p3, p1}, Lpi/V;->h(Lpi/r0;LBh/e;Ljava/util/List;)Lpi/d0;

    move-result-object p1

    if-nez p1, :cond_3

    const/16 p2, 0x52

    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_3
    return-object p1
.end method

.method public n()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x40

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public o(LZh/c;)LBh/e;
    .locals 2

    if-nez p1, :cond_0

    const/16 v0, 0xc

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->r()LDh/F;

    move-result-object v0

    sget-object v1, LIh/d;->FROM_BUILTINS:LIh/d;

    invoke-static {v0, p1, v1}, LBh/s;->d(LBh/G;LZh/c;LIh/b;)LBh/e;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0xd

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    return-object p1
.end method

.method public r()LDh/F;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->b:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDh/F;

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    :cond_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a:LDh/F;

    if-nez v0, :cond_1

    const/4 v1, 0x7

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_1
    return-object v0
.end method

.method public s()Lii/k;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->r()LDh/F;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    invoke-virtual {v0, v1}, LDh/F;->y(LZh/c;)LBh/U;

    move-result-object v0

    invoke-interface {v0}, LBh/U;->r()Lii/k;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xb

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public t()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x39

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public u()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x3f

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method protected v()Ljava/lang/Iterable;
    .locals 3

    new-instance v0, Lzh/a;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f:Loi/n;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->r()LDh/F;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lzh/a;-><init>(Loi/n;LBh/G;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public w()LBh/e;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->X:LZh/c;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->o(LZh/c;)LBh/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x23

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public x()LBh/e;
    .locals 1

    const-string v0, "Comparable"

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->p(Ljava/lang/String;)LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public y()Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x35

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method

.method public z()Lpi/d0;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->R(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x3e

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->a(I)V

    :cond_0
    return-object v0
.end method
