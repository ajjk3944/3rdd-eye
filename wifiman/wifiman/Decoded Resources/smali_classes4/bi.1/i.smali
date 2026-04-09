.class public abstract Lbi/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZh/c;

    const-string v1, "kotlin.jvm.JvmName"

    invoke-direct {v0, v1}, LZh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbi/i;->a:LZh/c;

    return-void
.end method

.method public static A(LBh/m;)Z
    .locals 1

    sget-object v0, LBh/f;->ENUM_CLASS:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result p0

    return p0
.end method

.method public static B(LBh/m;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x24

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    sget-object v0, LBh/f;->ENUM_ENTRY:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result p0

    return p0
.end method

.method public static C(LBh/m;)Z
    .locals 1

    sget-object v0, LBh/f;->INTERFACE:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result p0

    return p0
.end method

.method private static D(LBh/m;LBh/f;)Z
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x25

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_1

    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->h()LBh/f;

    move-result-object p0

    if-ne p0, p1, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static E(LBh/m;)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    :goto_0
    if-eqz p0, :cond_3

    invoke-static {p0}, Lbi/i;->u(LBh/m;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p0}, Lbi/i;->y(LBh/m;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    goto :goto_0

    :cond_2
    :goto_1
    return v0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private static F(Lpi/S;LBh/m;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x1e

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x1f

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, LBh/m;->a()LBh/m;

    move-result-object p0

    instance-of v0, p0, LBh/h;

    if-eqz v0, :cond_2

    instance-of v0, p1, LBh/h;

    if-eqz v0, :cond_2

    check-cast p1, LBh/h;

    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object p1

    check-cast p0, LBh/h;

    invoke-interface {p0}, LBh/h;->k()Lpi/v0;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static G(LBh/m;)Z
    .locals 1

    sget-object v0, LBh/f;->CLASS:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LBh/f;->INTERFACE:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->l()LBh/D;

    move-result-object p0

    sget-object v0, LBh/D;->SEALED:LBh/D;

    if-ne p0, v0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static H(LBh/e;LBh/e;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x1c

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x1d

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    invoke-interface {p1}, LBh/e;->a()LBh/e;

    move-result-object p1

    invoke-static {p0, p1}, Lbi/i;->I(Lpi/S;LBh/m;)Z

    move-result p0

    return p0
.end method

.method public static I(Lpi/S;LBh/m;)Z
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x20

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x21

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    invoke-static {p0, p1}, Lbi/i;->F(Lpi/S;LBh/m;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-static {v0, p1}, Lbi/i;->I(Lpi/S;LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static J(LBh/m;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    instance-of p0, p0, LBh/M;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static K(LBh/t0;Lpi/S;)Z
    .locals 4

    if-nez p0, :cond_0

    const/16 v0, 0x42

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x43

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    invoke-interface {p0}, LBh/t0;->h0()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    invoke-static {p1}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lpi/J0;->b(Lpi/S;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    return v2

    :cond_3
    invoke-static {p0}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p0

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->s0(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/e;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->W()Lpi/d0;

    move-result-object v3

    invoke-interface {v0, v3, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->b(Lpi/S;Lpi/S;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->K()LBh/e;

    move-result-object v3

    invoke-interface {v3}, LBh/e;->u()Lpi/d0;

    move-result-object v3

    invoke-interface {v0, v3, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->b(Lpi/S;Lpi/S;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object p0

    invoke-interface {v0, p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->b(Lpi/S;Lpi/S;)Z

    move-result p0

    if-nez p0, :cond_4

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/s;->d(Lpi/S;)Z

    move-result p0

    if-eqz p0, :cond_5

    :cond_4
    move v1, v2

    :cond_5
    :goto_0
    return v1
.end method

.method public static L(LBh/b;)LBh/b;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x3b

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    :goto_0
    invoke-interface {p0}, LBh/b;->h()LBh/b$a;

    move-result-object v0

    sget-object v1, LBh/b$a;->FAKE_OVERRIDE:LBh/b$a;

    if-ne v0, v1, :cond_2

    invoke-interface {p0}, LBh/b;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBh/b;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fake override should have at least one overridden descriptor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-object p0
.end method

.method public static M(LBh/q;)LBh/q;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x40

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    instance-of v0, p0, LBh/b;

    if-eqz v0, :cond_1

    check-cast p0, LBh/b;

    invoke-static {p0}, Lbi/i;->L(LBh/b;)LBh/b;

    move-result-object p0

    return-object p0

    :cond_1
    if-nez p0, :cond_2

    const/16 v0, 0x41

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_2
    return-object p0
.end method

.method private static synthetic a(I)V
    .locals 23

    sparse-switch p0, :sswitch_data_0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :sswitch_0
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    sparse-switch p0, :sswitch_data_1

    const/4 v2, 0x3

    goto :goto_1

    :sswitch_1
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v5, "containingDeclaration"

    aput-object v5, v2, v4

    goto/16 :goto_2

    :pswitch_0
    const-string v5, "name"

    aput-object v5, v2, v4

    goto/16 :goto_2

    :pswitch_1
    const-string v5, "scope"

    aput-object v5, v2, v4

    goto/16 :goto_2

    :pswitch_2
    const-string v5, "annotated"

    aput-object v5, v2, v4

    goto/16 :goto_2

    :pswitch_3
    const-string v5, "memberDescriptor"

    aput-object v5, v2, v4

    goto/16 :goto_2

    :pswitch_4
    const-string v5, "result"

    aput-object v5, v2, v4

    goto/16 :goto_2

    :pswitch_5
    const-string v5, "current"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "f"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "variable"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "location"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "innerClassName"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "typeConstructor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "classDescriptor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "classKind"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    const-string v5, "other"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_e
    const-string v5, "type"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_f
    const-string v5, "superClass"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_10
    const-string v5, "subClass"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_11
    const-string v5, "declarationDescriptor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_12
    const-string v5, "kotlinType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_13
    const-string v5, "aClass"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_14
    const-string v5, "second"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_15
    const-string v5, "first"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_16
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_17
    const-string v5, "descriptor"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "getFqNameUnsafe"

    const-string v5, "getFqNameFromTopLevelClass"

    const-string v6, "getClassIdForNonLocalClass"

    const-string v7, "getContainingModule"

    const-string v8, "getSuperclassDescriptors"

    const-string v9, "getSuperClassType"

    const-string v10, "getClassDescriptorForTypeConstructor"

    const-string v11, "getDefaultConstructorVisibility"

    const-string v12, "unwrapFakeOverride"

    const-string v13, "unwrapSubstitutionOverride"

    const-string v14, "unwrapFakeOverrideToAnyDeclaration"

    const-string v15, "getAllOverriddenDescriptors"

    const-string v16, "getAllOverriddenDeclarations"

    const-string v17, "getContainingSourceFile"

    const-string v18, "getAllDescriptors"

    const-string v19, "getFunctionByName"

    const-string v20, "getPropertyByName"

    const-string v21, "getDirectMember"

    const/16 v22, 0x1

    sparse-switch p0, :sswitch_data_2

    aput-object v3, v2, v22

    goto :goto_3

    :sswitch_2
    aput-object v21, v2, v22

    goto :goto_3

    :sswitch_3
    aput-object v20, v2, v22

    goto :goto_3

    :sswitch_4
    aput-object v19, v2, v22

    goto :goto_3

    :sswitch_5
    aput-object v18, v2, v22

    goto :goto_3

    :sswitch_6
    aput-object v17, v2, v22

    goto :goto_3

    :sswitch_7
    aput-object v16, v2, v22

    goto :goto_3

    :sswitch_8
    aput-object v15, v2, v22

    goto :goto_3

    :sswitch_9
    aput-object v14, v2, v22

    goto :goto_3

    :sswitch_a
    aput-object v13, v2, v22

    goto :goto_3

    :sswitch_b
    aput-object v12, v2, v22

    goto :goto_3

    :sswitch_c
    aput-object v11, v2, v22

    goto :goto_3

    :sswitch_d
    aput-object v10, v2, v22

    goto :goto_3

    :sswitch_e
    aput-object v9, v2, v22

    goto :goto_3

    :sswitch_f
    aput-object v8, v2, v22

    goto :goto_3

    :sswitch_10
    aput-object v7, v2, v22

    goto :goto_3

    :sswitch_11
    aput-object v6, v2, v22

    goto :goto_3

    :sswitch_12
    aput-object v5, v2, v22

    goto :goto_3

    :sswitch_13
    aput-object v4, v2, v22

    goto :goto_3

    :sswitch_14
    const-string v3, "getFqNameSafe"

    aput-object v3, v2, v22

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v3, "getDispatchReceiverParameterIfNeeded"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_18
    const-string v3, "isMethodOfAny"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_19
    aput-object v21, v2, v1

    goto/16 :goto_4

    :pswitch_1a
    aput-object v20, v2, v1

    goto/16 :goto_4

    :pswitch_1b
    const-string v3, "getFunctionByNameOrNull"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_1c
    aput-object v19, v2, v1

    goto/16 :goto_4

    :pswitch_1d
    aput-object v18, v2, v1

    goto/16 :goto_4

    :pswitch_1e
    aput-object v17, v2, v1

    goto/16 :goto_4

    :pswitch_1f
    const-string v3, "hasJvmNameAnnotation"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_20
    const-string v3, "findJvmNameAnnotation"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_21
    const-string v3, "getJvmName"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_22
    const-string v3, "canHaveDeclaredConstructors"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_23
    const-string v3, "isSingletonOrAnonymousObject"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_24
    aput-object v16, v2, v1

    goto/16 :goto_4

    :pswitch_25
    const-string v3, "collectAllOverriddenDescriptors"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_26
    aput-object v15, v2, v1

    goto/16 :goto_4

    :pswitch_27
    const-string v3, "classCanHaveOpenMembers"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_28
    const-string v3, "classCanHaveAbstractDeclaration"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_29
    const-string v3, "classCanHaveAbstractFakeOverride"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_2a
    const-string v3, "shouldRecordInitializerForProperty"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_2b
    aput-object v14, v2, v1

    goto/16 :goto_4

    :pswitch_2c
    aput-object v13, v2, v1

    goto/16 :goto_4

    :pswitch_2d
    aput-object v12, v2, v1

    goto/16 :goto_4

    :pswitch_2e
    const-string v3, "isTopLevelOrInnerClass"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_2f
    const-string v3, "isStaticNestedClass"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_30
    const-string v3, "getInnerClassByName"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_31
    aput-object v11, v2, v1

    goto/16 :goto_4

    :pswitch_32
    aput-object v10, v2, v1

    goto/16 :goto_4

    :pswitch_33
    const-string v3, "getClassDescriptorForType"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_34
    const-string v3, "getSuperClassDescriptor"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_35
    aput-object v9, v2, v1

    goto/16 :goto_4

    :pswitch_36
    aput-object v8, v2, v1

    goto/16 :goto_4

    :pswitch_37
    const-string v3, "hasAbstractMembers"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_38
    const-string v3, "isKindOf"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_39
    const-string v3, "isEnumEntry"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_3a
    const-string v3, "isAnonymousFunction"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_3b
    const-string v3, "isAnonymousObject"

    aput-object v3, v2, v1

    goto/16 :goto_4

    :pswitch_3c
    const-string v3, "isSubtypeOfClass"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_3d
    const-string v3, "isSameClass"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_3e
    const-string v3, "isSubclass"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_3f
    const-string v3, "isDirectSubclass"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_40
    const-string v3, "isAncestor"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_41
    const-string v3, "getContainingClass"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_42
    aput-object v7, v2, v1

    goto :goto_4

    :pswitch_43
    const-string v3, "getContainingModuleOrNull"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_44
    const-string v3, "getParentOfType"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_45
    const-string v3, "areInSameModule"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_46
    const-string v3, "isStaticDeclaration"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_47
    const-string v3, "isOverride"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_48
    const-string v3, "isExtension"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_49
    aput-object v6, v2, v1

    goto :goto_4

    :pswitch_4a
    aput-object v5, v2, v1

    goto :goto_4

    :pswitch_4b
    aput-object v4, v2, v1

    goto :goto_4

    :pswitch_4c
    const-string v3, "getFqNameSafeIfPossible"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_4d
    const-string v3, "getFqNameSafe"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_4e
    const-string v3, "getFqName"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_4f
    const-string v3, "isLocal"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_50
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sparse-switch p0, :sswitch_data_3

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :sswitch_15
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v1

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x7 -> :sswitch_0
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xc -> :sswitch_0
        0x16 -> :sswitch_0
        0x28 -> :sswitch_0
        0x2a -> :sswitch_0
        0x2b -> :sswitch_0
        0x2f -> :sswitch_0
        0x31 -> :sswitch_0
        0x32 -> :sswitch_0
        0x33 -> :sswitch_0
        0x34 -> :sswitch_0
        0x35 -> :sswitch_0
        0x3c -> :sswitch_0
        0x3e -> :sswitch_0
        0x3f -> :sswitch_0
        0x41 -> :sswitch_0
        0x48 -> :sswitch_0
        0x4c -> :sswitch_0
        0x53 -> :sswitch_0
        0x54 -> :sswitch_0
        0x56 -> :sswitch_0
        0x59 -> :sswitch_0
        0x5e -> :sswitch_0
        0x60 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x4 -> :sswitch_1
        0x7 -> :sswitch_1
        0x9 -> :sswitch_1
        0xa -> :sswitch_1
        0xc -> :sswitch_1
        0x16 -> :sswitch_1
        0x28 -> :sswitch_1
        0x2a -> :sswitch_1
        0x2b -> :sswitch_1
        0x2f -> :sswitch_1
        0x31 -> :sswitch_1
        0x32 -> :sswitch_1
        0x33 -> :sswitch_1
        0x34 -> :sswitch_1
        0x35 -> :sswitch_1
        0x3c -> :sswitch_1
        0x3e -> :sswitch_1
        0x3f -> :sswitch_1
        0x41 -> :sswitch_1
        0x48 -> :sswitch_1
        0x4c -> :sswitch_1
        0x53 -> :sswitch_1
        0x54 -> :sswitch_1
        0x56 -> :sswitch_1
        0x59 -> :sswitch_1
        0x5e -> :sswitch_1
        0x60 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_16
        :pswitch_16
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_17
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_16
        :pswitch_b
        :pswitch_16
        :pswitch_16
        :pswitch_b
        :pswitch_e
        :pswitch_a
        :pswitch_16
        :pswitch_b
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_16
        :pswitch_16
        :pswitch_17
        :pswitch_16
        :pswitch_7
        :pswitch_e
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_6
        :pswitch_16
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_16
        :pswitch_b
        :pswitch_b
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_17
        :pswitch_16
        :pswitch_16
        :pswitch_1
        :pswitch_16
        :pswitch_1
        :pswitch_0
        :pswitch_16
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_16
        :pswitch_17
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x4 -> :sswitch_14
        0x7 -> :sswitch_13
        0x9 -> :sswitch_12
        0xa -> :sswitch_12
        0xc -> :sswitch_11
        0x16 -> :sswitch_10
        0x28 -> :sswitch_f
        0x2a -> :sswitch_e
        0x2b -> :sswitch_e
        0x2f -> :sswitch_d
        0x31 -> :sswitch_c
        0x32 -> :sswitch_c
        0x33 -> :sswitch_c
        0x34 -> :sswitch_c
        0x35 -> :sswitch_c
        0x3c -> :sswitch_b
        0x3e -> :sswitch_a
        0x3f -> :sswitch_a
        0x41 -> :sswitch_9
        0x48 -> :sswitch_8
        0x4c -> :sswitch_7
        0x53 -> :sswitch_6
        0x54 -> :sswitch_6
        0x56 -> :sswitch_5
        0x59 -> :sswitch_4
        0x5e -> :sswitch_3
        0x60 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_50
        :pswitch_4c
        :pswitch_4b
        :pswitch_50
        :pswitch_4a
        :pswitch_50
        :pswitch_50
        :pswitch_49
        :pswitch_50
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_45
        :pswitch_44
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_50
        :pswitch_43
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3f
        :pswitch_3e
        :pswitch_3e
        :pswitch_3d
        :pswitch_3d
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_50
        :pswitch_35
        :pswitch_50
        :pswitch_50
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_50
        :pswitch_31
        :pswitch_50
        :pswitch_50
        :pswitch_50
        :pswitch_50
        :pswitch_50
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_50
        :pswitch_2c
        :pswitch_50
        :pswitch_50
        :pswitch_2b
        :pswitch_50
        :pswitch_2a
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_50
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_50
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_50
        :pswitch_50
        :pswitch_1d
        :pswitch_50
        :pswitch_1c
        :pswitch_1c
        :pswitch_50
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_50
        :pswitch_19
        :pswitch_50
        :pswitch_18
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        0x4 -> :sswitch_15
        0x7 -> :sswitch_15
        0x9 -> :sswitch_15
        0xa -> :sswitch_15
        0xc -> :sswitch_15
        0x16 -> :sswitch_15
        0x28 -> :sswitch_15
        0x2a -> :sswitch_15
        0x2b -> :sswitch_15
        0x2f -> :sswitch_15
        0x31 -> :sswitch_15
        0x32 -> :sswitch_15
        0x33 -> :sswitch_15
        0x34 -> :sswitch_15
        0x35 -> :sswitch_15
        0x3c -> :sswitch_15
        0x3e -> :sswitch_15
        0x3f -> :sswitch_15
        0x41 -> :sswitch_15
        0x48 -> :sswitch_15
        0x4c -> :sswitch_15
        0x53 -> :sswitch_15
        0x54 -> :sswitch_15
        0x56 -> :sswitch_15
        0x59 -> :sswitch_15
        0x5e -> :sswitch_15
        0x60 -> :sswitch_15
    .end sparse-switch
.end method

.method public static b(LBh/m;LBh/m;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x10

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x11

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    invoke-static {p0}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object p0

    invoke-static {p1}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static c(LBh/a;Ljava/util/Set;)V
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x49

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x4a

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-interface {p0}, LBh/a;->a()LBh/a;

    move-result-object p0

    invoke-interface {p0}, LBh/a;->f()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/a;

    invoke-interface {v0}, LBh/a;->a()LBh/a;

    move-result-object v0

    invoke-static {v0, p1}, Lbi/i;->c(LBh/a;Ljava/util/Set;)V

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static d(LBh/a;)Ljava/util/Set;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x47

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, LBh/a;->a()LBh/a;

    move-result-object p0

    invoke-static {p0, v0}, Lbi/i;->c(LBh/a;Ljava/util/Set;)V

    return-object v0
.end method

.method public static e(Lpi/S;)LBh/e;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x2d

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-static {p0}, Lbi/i;->f(Lpi/v0;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lpi/v0;)LBh/e;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x2e

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    check-cast p0, LBh/e;

    if-nez p0, :cond_1

    const/16 v0, 0x2f

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    return-object p0
.end method

.method public static g(LBh/m;)LBh/G;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x15

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lbi/i;->h(LBh/m;)LBh/G;

    move-result-object p0

    if-nez p0, :cond_1

    const/16 v0, 0x16

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    return-object p0
.end method

.method public static h(LBh/m;)LBh/G;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x17

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    :goto_0
    if-eqz p0, :cond_3

    instance-of v0, p0, LBh/G;

    if-eqz v0, :cond_1

    check-cast p0, LBh/G;

    return-object p0

    :cond_1
    instance-of v0, p0, LBh/U;

    if-eqz v0, :cond_2

    check-cast p0, LBh/U;

    invoke-interface {p0}, LBh/U;->u0()LBh/G;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Lpi/S;)LBh/G;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x14

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-static {p0}, Lbi/i;->h(LBh/m;)LBh/G;

    move-result-object p0

    return-object p0
.end method

.method public static j(LBh/m;)LBh/h0;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x52

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    instance-of v0, p0, LBh/a0;

    if-eqz v0, :cond_1

    check-cast p0, LBh/a0;

    invoke-interface {p0}, LBh/X;->C0()LBh/Y;

    move-result-object p0

    :cond_1
    instance-of v0, p0, LBh/p;

    if-eqz v0, :cond_3

    check-cast p0, LBh/p;

    invoke-interface {p0}, LBh/p;->j()LBh/g0;

    move-result-object p0

    invoke-interface {p0}, LBh/g0;->a()LBh/h0;

    move-result-object p0

    if-nez p0, :cond_2

    const/16 v0, 0x53

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_2
    return-object p0

    :cond_3
    sget-object p0, LBh/h0;->a:LBh/h0;

    if-nez p0, :cond_4

    const/16 v0, 0x54

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_4
    return-object p0
.end method

.method public static k(LBh/e;Z)LBh/u;
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x30

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-interface {p0}, LBh/e;->h()LBh/f;

    move-result-object v0

    sget-object v1, LBh/f;->ENUM_CLASS:LBh/f;

    if-eq v0, v1, :cond_9

    invoke-virtual {v0}, LBh/f;->isSingleton()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lbi/i;->G(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_3

    sget-object p0, LBh/t;->c:LBh/u;

    if-nez p0, :cond_2

    const/16 p1, 0x32

    invoke-static {p1}, Lbi/i;->a(I)V

    :cond_2
    return-object p0

    :cond_3
    sget-object p0, LBh/t;->a:LBh/u;

    if-nez p0, :cond_4

    const/16 p1, 0x33

    invoke-static {p1}, Lbi/i;->a(I)V

    :cond_4
    return-object p0

    :cond_5
    invoke-static {p0}, Lbi/i;->u(LBh/m;)Z

    move-result p0

    if-eqz p0, :cond_7

    sget-object p0, LBh/t;->l:LBh/u;

    if-nez p0, :cond_6

    const/16 p1, 0x34

    invoke-static {p1}, Lbi/i;->a(I)V

    :cond_6
    return-object p0

    :cond_7
    sget-object p0, LBh/t;->e:LBh/u;

    if-nez p0, :cond_8

    const/16 p1, 0x35

    invoke-static {p1}, Lbi/i;->a(I)V

    :cond_8
    return-object p0

    :cond_9
    :goto_0
    sget-object p0, LBh/t;->a:LBh/u;

    if-nez p0, :cond_a

    const/16 p1, 0x31

    invoke-static {p1}, Lbi/i;->a(I)V

    :cond_a
    return-object p0
.end method

.method public static l(LBh/m;)LBh/b0;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    instance-of v0, p0, LBh/e;

    if-eqz v0, :cond_1

    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->J0()LBh/b0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static m(LBh/m;)LZh/d;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lbi/i;->o(LBh/m;)LZh/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LZh/c;->j()LZh/d;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lbi/i;->p(LBh/m;)LZh/d;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static n(LBh/m;)LZh/c;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lbi/i;->o(LBh/m;)LZh/c;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lbi/i;->p(LBh/m;)LZh/d;

    move-result-object p0

    invoke-virtual {p0}, LZh/d;->l()LZh/c;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    const/4 p0, 0x4

    invoke-static {p0}, Lbi/i;->a(I)V

    :cond_2
    return-object v0
.end method

.method private static o(LBh/m;)LZh/c;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    instance-of v0, p0, LBh/G;

    if-nez v0, :cond_4

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->m(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, LBh/U;

    if-eqz v0, :cond_2

    check-cast p0, LBh/U;

    invoke-interface {p0}, LBh/U;->e()LZh/c;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, LBh/M;

    if-eqz v0, :cond_3

    check-cast p0, LBh/M;

    invoke-interface {p0}, LBh/M;->e()LZh/c;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0

    :cond_4
    :goto_0
    sget-object p0, LZh/c;->c:LZh/c;

    return-object p0
.end method

.method private static p(LBh/m;)LZh/d;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object v0

    invoke-static {v0}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object v0

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object p0

    invoke-virtual {v0, p0}, LZh/d;->c(LZh/f;)LZh/d;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 v0, 0x7

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    return-object p0
.end method

.method public static q(LBh/m;Ljava/lang/Class;)LBh/m;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x12

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lbi/i;->r(LBh/m;Ljava/lang/Class;Z)LBh/m;

    move-result-object p0

    return-object p0
.end method

.method public static r(LBh/m;Ljava/lang/Class;Z)LBh/m;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x13

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    :cond_2
    :goto_0
    if-eqz p0, :cond_4

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    return-object p0

    :cond_3
    invoke-interface {p0}, LBh/m;->b()LBh/m;

    move-result-object p0

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public static s(LBh/e;)LBh/e;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x2c

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-interface {p0}, LBh/h;->k()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-static {v0}, Lbi/i;->e(Lpi/S;)LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->h()LBh/f;

    move-result-object v1

    sget-object v2, LBh/f;->INTERFACE:LBh/f;

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static t(LBh/m;)Z
    .locals 1

    sget-object v0, LBh/f;->ANNOTATION_CLASS:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result p0

    return p0
.end method

.method public static u(LBh/m;)Z
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x22

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    invoke-static {p0}, Lbi/i;->v(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object p0

    sget-object v0, LZh/h;->b:LZh/f;

    invoke-virtual {p0, v0}, LZh/f;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static v(LBh/m;)Z
    .locals 1

    sget-object v0, LBh/f;->CLASS:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result p0

    return p0
.end method

.method public static w(LBh/m;)Z
    .locals 1

    invoke-static {p0}, Lbi/i;->v(LBh/m;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lbi/i;->A(LBh/m;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static x(LBh/m;)Z
    .locals 1

    sget-object v0, LBh/f;->OBJECT:LBh/f;

    invoke-static {p0, v0}, Lbi/i;->D(LBh/m;LBh/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, LBh/e;

    invoke-interface {p0}, LBh/e;->z()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static y(LBh/m;)Z
    .locals 1

    instance-of v0, p0, LBh/q;

    if-eqz v0, :cond_0

    check-cast p0, LBh/q;

    invoke-interface {p0}, LBh/q;->getVisibility()LBh/u;

    move-result-object p0

    sget-object v0, LBh/t;->f:LBh/u;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static z(LBh/e;LBh/e;)Z
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x1a

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x1b

    invoke-static {v0}, Lbi/i;->a(I)V

    :cond_1
    invoke-interface {p0}, LBh/h;->k()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-interface {p1}, LBh/e;->a()LBh/e;

    move-result-object v1

    invoke-static {v0, v1}, Lbi/i;->F(Lpi/S;LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method
