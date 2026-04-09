.class public Lpi/G0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/G0$d;,
        Lpi/G0$c;
    }
.end annotation


# static fields
.field public static final b:Lpi/G0;


# instance fields
.field private final a:Lpi/E0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lpi/E0;->b:Lpi/E0;

    invoke-static {v0}, Lpi/G0;->g(Lpi/E0;)Lpi/G0;

    move-result-object v0

    sput-object v0, Lpi/G0;->b:Lpi/G0;

    return-void
.end method

.method protected constructor <init>(Lpi/E0;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/G0;->a:Lpi/E0;

    return-void
.end method

.method private static synthetic a(I)V
    .locals 13

    const/16 v0, 0x25

    const/16 v1, 0x22

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq p0, v3, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v3, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_4

    packed-switch p0, :pswitch_data_5

    packed-switch p0, :pswitch_data_6

    packed-switch p0, :pswitch_data_7

    const/4 v6, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v6, v4

    :goto_1
    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor"

    const/4 v8, 0x0

    packed-switch p0, :pswitch_data_8

    :pswitch_2
    const-string v9, "substitution"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_3
    const-string v9, "projectionKind"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_4
    const-string v9, "typeParameterVariance"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_5
    const-string v9, "annotations"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_6
    const-string v9, "substituted"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_7
    const-string v9, "originalType"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_8
    const-string v9, "originalProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_9
    const-string v9, "typeProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_a
    const-string v9, "howThisTypeIsUsed"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_b
    const-string v9, "type"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_c
    const-string v9, "context"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_d
    const-string v9, "substitutionContext"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_e
    const-string v9, "second"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_f
    const-string v9, "first"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_10
    aput-object v7, v6, v8

    :goto_2
    const-string v8, "safeSubstitute"

    const-string v9, "unsafeSubstitute"

    const-string v10, "projectedTypeForConflictedTypeWithUnsafeVariance"

    const-string v11, "filterOutUnsafeVariance"

    const-string v12, "combine"

    if-eq p0, v3, :cond_6

    if-eq p0, v4, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_9

    packed-switch p0, :pswitch_data_a

    packed-switch p0, :pswitch_data_b

    packed-switch p0, :pswitch_data_c

    aput-object v7, v6, v3

    goto :goto_3

    :pswitch_11
    aput-object v10, v6, v3

    goto :goto_3

    :pswitch_12
    aput-object v9, v6, v3

    goto :goto_3

    :pswitch_13
    aput-object v8, v6, v3

    goto :goto_3

    :cond_2
    :pswitch_14
    aput-object v12, v6, v3

    goto :goto_3

    :cond_3
    aput-object v11, v6, v3

    goto :goto_3

    :cond_4
    const-string v7, "getSubstitution"

    aput-object v7, v6, v3

    goto :goto_3

    :cond_5
    const-string v7, "replaceWithContravariantApproximatingSubstitution"

    aput-object v7, v6, v3

    goto :goto_3

    :cond_6
    const-string v7, "replaceWithNonApproximatingSubstitution"

    aput-object v7, v6, v3

    :goto_3
    packed-switch p0, :pswitch_data_d

    :pswitch_15
    const-string v7, "create"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_16
    aput-object v12, v6, v4

    goto :goto_4

    :pswitch_17
    aput-object v11, v6, v4

    goto :goto_4

    :pswitch_18
    aput-object v10, v6, v4

    goto :goto_4

    :pswitch_19
    aput-object v9, v6, v4

    goto :goto_4

    :pswitch_1a
    const-string v7, "substituteWithoutApproximation"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1b
    const-string v7, "substitute"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1c
    aput-object v8, v6, v4

    goto :goto_4

    :pswitch_1d
    const-string v7, "<init>"

    aput-object v7, v6, v4

    goto :goto_4

    :pswitch_1e
    const-string v7, "createChainedSubstitutor"

    aput-object v7, v6, v4

    :goto_4
    :pswitch_1f
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eq p0, v3, :cond_7

    if-eq p0, v4, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    packed-switch p0, :pswitch_data_e

    packed-switch p0, :pswitch_data_f

    packed-switch p0, :pswitch_data_10

    packed-switch p0, :pswitch_data_11

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    :pswitch_20
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x28
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xb
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x13
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1d
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x28
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_2
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_5
        :pswitch_10
        :pswitch_4
        :pswitch_9
        :pswitch_10
        :pswitch_4
        :pswitch_3
        :pswitch_10
        :pswitch_10
        :pswitch_10
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0xb
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x13
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x1d
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x28
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_15
        :pswitch_15
        :pswitch_1d
        :pswitch_1f
        :pswitch_1c
        :pswitch_1c
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_17
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0xb
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x13
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x1d
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x28
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch
.end method

.method private static b(ILpi/B0;Lpi/E0;)V
    .locals 2

    const/16 v0, 0x64

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Recursion too deep. Most likely infinite loop while substituting "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lpi/G0;->o(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; substitution: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lpi/G0;->o(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lpi/N0;Lpi/B0;)Lpi/N0;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x23

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x24

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_1
    invoke-interface {p1}, Lpi/B0;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    if-nez p0, :cond_2

    const/16 p1, 0x25

    invoke-static {p1}, Lpi/G0;->a(I)V

    :cond_2
    return-object p0

    :cond_3
    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object p1

    invoke-static {p0, p1}, Lpi/G0;->d(Lpi/N0;Lpi/N0;)Lpi/N0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lpi/N0;Lpi/N0;)Lpi/N0;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x26

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x27

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_1
    sget-object v0, Lpi/N0;->INVARIANT:Lpi/N0;

    if-ne p0, v0, :cond_3

    if-nez p1, :cond_2

    const/16 p0, 0x28

    invoke-static {p0}, Lpi/G0;->a(I)V

    :cond_2
    return-object p1

    :cond_3
    if-ne p1, v0, :cond_5

    if-nez p0, :cond_4

    const/16 p1, 0x29

    invoke-static {p1}, Lpi/G0;->a(I)V

    :cond_4
    return-object p0

    :cond_5
    if-ne p0, p1, :cond_7

    if-nez p1, :cond_6

    const/16 p0, 0x2a

    invoke-static {p0}, Lpi/G0;->a(I)V

    :cond_6
    return-object p1

    :cond_7
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Variance conflict: type parameter variance \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' and projection kind \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' cannot be combined"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method private static e(Lpi/N0;Lpi/N0;)Lpi/G0$d;
    .locals 2

    sget-object v0, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    if-ne p0, v0, :cond_0

    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    if-ne p1, v1, :cond_0

    sget-object p0, Lpi/G0$d;->OUT_IN_IN_POSITION:Lpi/G0$d;

    return-object p0

    :cond_0
    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    if-ne p0, v1, :cond_1

    if-ne p1, v0, :cond_1

    sget-object p0, Lpi/G0$d;->IN_IN_OUT_POSITION:Lpi/G0$d;

    return-object p0

    :cond_1
    sget-object p0, Lpi/G0$d;->NO_CONFLICT:Lpi/G0$d;

    return-object p0
.end method

.method public static f(Lpi/S;)Lpi/G0;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0}, Lpi/w0;->i(Lpi/v0;Ljava/util/List;)Lpi/E0;

    move-result-object p0

    invoke-static {p0}, Lpi/G0;->g(Lpi/E0;)Lpi/G0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lpi/E0;)Lpi/G0;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    new-instance v0, Lpi/G0;

    invoke-direct {v0, p0}, Lpi/G0;-><init>(Lpi/E0;)V

    return-object v0
.end method

.method public static h(Lpi/E0;Lpi/E0;)Lpi/G0;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x4

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_1
    invoke-static {p0, p1}, Lpi/D;->i(Lpi/E0;Lpi/E0;)Lpi/E0;

    move-result-object p0

    invoke-static {p0}, Lpi/G0;->g(Lpi/E0;)Lpi/G0;

    move-result-object p0

    return-object p0
.end method

.method private static i(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x21

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->Q:LZh/c;

    invoke-interface {p0, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/p;

    new-instance v1, Lpi/G0$a;

    invoke-direct {v1}, Lpi/G0$a;-><init>()V

    invoke-direct {v0, p0, v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/p;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lmh/l;)V

    return-object v0
.end method

.method private static l(Lpi/S;Lpi/B0;LBh/l0;Lpi/B0;)Lpi/B0;
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x1a

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x1b

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_1
    if-nez p3, :cond_2

    const/16 v0, 0x1c

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_2
    invoke-virtual {p0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->Q:LZh/c;

    invoke-interface {p0, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result p0

    if-nez p0, :cond_4

    if-nez p1, :cond_3

    const/16 p0, 0x1d

    invoke-static {p0}, Lpi/G0;->a(I)V

    :cond_3
    return-object p1

    :cond_4
    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    instance-of v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    if-nez v0, :cond_5

    return-object p1

    :cond_5
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/n;->e()Lpi/B0;

    move-result-object p0

    invoke-interface {p0}, Lpi/B0;->a()Lpi/N0;

    move-result-object v0

    invoke-interface {p3}, Lpi/B0;->a()Lpi/N0;

    move-result-object p3

    invoke-static {p3, v0}, Lpi/G0;->e(Lpi/N0;Lpi/N0;)Lpi/G0$d;

    move-result-object p3

    sget-object v1, Lpi/G0$d;->OUT_IN_IN_POSITION:Lpi/G0$d;

    if-ne p3, v1, :cond_6

    new-instance p1, Lpi/D0;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    invoke-direct {p1, p0}, Lpi/D0;-><init>(Lpi/S;)V

    return-object p1

    :cond_6
    if-nez p2, :cond_7

    return-object p1

    :cond_7
    invoke-interface {p2}, LBh/l0;->p()Lpi/N0;

    move-result-object p2

    invoke-static {p2, v0}, Lpi/G0;->e(Lpi/N0;Lpi/N0;)Lpi/G0$d;

    move-result-object p2

    if-ne p2, v1, :cond_8

    new-instance p1, Lpi/D0;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    invoke-direct {p1, p0}, Lpi/D0;-><init>(Lpi/S;)V

    :cond_8
    return-object p1
.end method

.method private static o(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lxi/d;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Exception while computing toString(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0
.end method

.method private r(Lpi/B0;I)Lpi/B0;
    .locals 4

    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object v0

    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object v1

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v2

    invoke-interface {v2}, Lpi/v0;->c()LBh/h;

    move-result-object v2

    instance-of v2, v2, LBh/l0;

    if-eqz v2, :cond_0

    return-object p1

    :cond_0
    invoke-static {v0}, Lpi/h0;->b(Lpi/S;)Lpi/d0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lpi/G0;->m()Lpi/G0;

    move-result-object v2

    sget-object v3, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v2, p1, v3}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v2

    invoke-interface {v2}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, v2, v3, p2}, Lpi/G0;->s(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object p2

    iget-object v2, p0, Lpi/G0;->a:Lpi/E0;

    invoke-virtual {v0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-virtual {v2, v3}, Lpi/E0;->d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-static {v0, p2, v2}, Lpi/F0;->b(Lpi/S;Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/S;

    move-result-object p2

    instance-of v0, p2, Lpi/d0;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lpi/d0;

    if-eqz v0, :cond_2

    check-cast p2, Lpi/d0;

    check-cast p1, Lpi/d0;

    invoke-static {p2, p1}, Lpi/h0;->j(Lpi/d0;Lpi/d0;)Lpi/d0;

    move-result-object p2

    :cond_2
    new-instance p1, Lpi/D0;

    invoke-direct {p1, v1, p2}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p1
.end method

.method private s(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/l0;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/B0;

    const/4 v5, 0x1

    add-int/lit8 v6, p3, 0x1

    invoke-direct {p0, v4, v3, v6}, Lpi/G0;->u(Lpi/B0;LBh/l0;I)Lpi/B0;

    move-result-object v6

    sget-object v7, Lpi/G0$b;->a:[I

    invoke-interface {v3}, LBh/l0;->p()Lpi/N0;

    move-result-object v8

    invoke-interface {v6}, Lpi/B0;->a()Lpi/N0;

    move-result-object v9

    invoke-static {v8, v9}, Lpi/G0;->e(Lpi/N0;Lpi/N0;)Lpi/G0$d;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    if-eq v7, v5, :cond_1

    const/4 v8, 0x2

    if-eq v7, v8, :cond_1

    const/4 v8, 0x3

    if-eq v7, v8, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3}, LBh/l0;->p()Lpi/N0;

    move-result-object v3

    sget-object v7, Lpi/N0;->INVARIANT:Lpi/N0;

    if-eq v3, v7, :cond_2

    invoke-interface {v6}, Lpi/B0;->c()Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, Lpi/D0;

    invoke-interface {v6}, Lpi/B0;->getType()Lpi/S;

    move-result-object v6

    invoke-direct {v3, v7, v6}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    move-object v6, v3

    goto :goto_1

    :cond_1
    invoke-static {v3}, Lpi/J0;->s(LBh/l0;)Lpi/B0;

    move-result-object v6

    :cond_2
    :goto_1
    if-eq v6, v4, :cond_3

    move v2, v5

    :cond_3
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-nez v2, :cond_5

    return-object p2

    :cond_5
    return-object v0
.end method

.method private u(Lpi/B0;LBh/l0;I)Lpi/B0;
    .locals 7

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-nez p1, :cond_0

    const/16 v2, 0x12

    invoke-static {v2}, Lpi/G0;->a(I)V

    :cond_0
    iget-object v2, p0, Lpi/G0;->a:Lpi/E0;

    invoke-static {p3, p1, v2}, Lpi/G0;->b(ILpi/B0;Lpi/E0;)V

    invoke-interface {p1}, Lpi/B0;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object v2

    instance-of v3, v2, Lpi/K0;

    if-eqz v3, :cond_3

    check-cast v2, Lpi/K0;

    invoke-interface {v2}, Lpi/K0;->G0()Lpi/M0;

    move-result-object v0

    invoke-interface {v2}, Lpi/K0;->I()Lpi/S;

    move-result-object v2

    new-instance v3, Lpi/D0;

    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    add-int/2addr p3, v1

    invoke-direct {p0, v3, p2, p3}, Lpi/G0;->u(Lpi/B0;LBh/l0;I)Lpi/B0;

    move-result-object p2

    invoke-interface {p2}, Lpi/B0;->c()Z

    move-result p3

    if-eqz p3, :cond_2

    return-object p2

    :cond_2
    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    invoke-interface {p2}, Lpi/B0;->getType()Lpi/S;

    move-result-object p3

    invoke-virtual {p3}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p3

    invoke-static {p3, p1}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    new-instance p3, Lpi/D0;

    invoke-interface {p2}, Lpi/B0;->a()Lpi/N0;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p3

    :cond_3
    invoke-static {v2}, Lpi/E;->a(Lpi/S;)Z

    move-result v3

    if-nez v3, :cond_11

    invoke-virtual {v2}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v3

    instance-of v3, v3, Lpi/c0;

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-object v3, p0, Lpi/G0;->a:Lpi/E0;

    invoke-virtual {v3, v2}, Lpi/E0;->e(Lpi/S;)Lpi/B0;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-static {v2, v3, p2, p1}, Lpi/G0;->l(Lpi/S;Lpi/B0;LBh/l0;Lpi/B0;)Lpi/B0;

    move-result-object v3

    goto :goto_0

    :cond_5
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Lpi/B0;->a()Lpi/N0;

    move-result-object v4

    if-nez v3, :cond_7

    invoke-static {v2}, Lpi/L;->b(Lpi/S;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v2}, Lpi/t0;->b(Lpi/S;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-static {v2}, Lpi/L;->a(Lpi/S;)Lpi/I;

    move-result-object v0

    new-instance v2, Lpi/D0;

    invoke-virtual {v0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    add-int/2addr p3, v1

    invoke-direct {p0, v2, p2, p3}, Lpi/G0;->u(Lpi/B0;LBh/l0;I)Lpi/B0;

    move-result-object v1

    new-instance v2, Lpi/D0;

    invoke-virtual {v0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    invoke-direct {p0, v2, p2, p3}, Lpi/G0;->u(Lpi/B0;LBh/l0;I)Lpi/B0;

    move-result-object p2

    invoke-interface {v1}, Lpi/B0;->a()Lpi/N0;

    move-result-object p3

    invoke-interface {v1}, Lpi/B0;->getType()Lpi/S;

    move-result-object v2

    invoke-virtual {v0}, Lpi/I;->V0()Lpi/d0;

    move-result-object v3

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, Lpi/B0;->getType()Lpi/S;

    move-result-object v2

    invoke-virtual {v0}, Lpi/I;->W0()Lpi/d0;

    move-result-object v0

    if-ne v2, v0, :cond_6

    return-object p1

    :cond_6
    invoke-interface {v1}, Lpi/B0;->getType()Lpi/S;

    move-result-object p1

    invoke-static {p1}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object p1

    invoke-interface {p2}, Lpi/B0;->getType()Lpi/S;

    move-result-object p2

    invoke-static {p2}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object p2

    invoke-static {p1, p2}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    new-instance p2, Lpi/D0;

    invoke-direct {p2, p3, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p2

    :cond_7
    invoke-static {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->n0(Lpi/S;)Z

    move-result p2

    if-nez p2, :cond_11

    invoke-static {v2}, Lpi/W;->a(Lpi/S;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto/16 :goto_3

    :cond_8
    if-eqz v3, :cond_10

    invoke-interface {v3}, Lpi/B0;->a()Lpi/N0;

    move-result-object p1

    invoke-static {v4, p1}, Lpi/G0;->e(Lpi/N0;Lpi/N0;)Lpi/G0$d;

    move-result-object p1

    invoke-static {v2}, Lci/e;->f(Lpi/S;)Z

    move-result p2

    if-nez p2, :cond_b

    sget-object p2, Lpi/G0$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    if-eq p2, v1, :cond_a

    if-eq p2, v0, :cond_9

    goto :goto_1

    :cond_9
    new-instance p1, Lpi/D0;

    sget-object p2, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-virtual {v2}, Lpi/S;->N0()Lpi/v0;

    move-result-object p3

    invoke-interface {p3}, Lpi/v0;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p3

    invoke-virtual {p3}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p1

    :cond_a
    new-instance p1, Lpi/G0$c;

    const-string p2, "Out-projection in in-position"

    invoke-direct {p1, p2}, Lpi/G0$c;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_1
    invoke-static {v2}, Lpi/t0;->a(Lpi/S;)Lpi/w;

    move-result-object p2

    invoke-interface {v3}, Lpi/B0;->c()Z

    move-result p3

    if-eqz p3, :cond_c

    return-object v3

    :cond_c
    if-eqz p2, :cond_d

    invoke-interface {v3}, Lpi/B0;->getType()Lpi/S;

    move-result-object p3

    invoke-interface {p2, p3}, Lpi/w;->i0(Lpi/S;)Lpi/S;

    move-result-object p2

    goto :goto_2

    :cond_d
    invoke-interface {v3}, Lpi/B0;->getType()Lpi/S;

    move-result-object p2

    invoke-virtual {v2}, Lpi/S;->O0()Z

    move-result p3

    invoke-static {p2, p3}, Lpi/J0;->q(Lpi/S;Z)Lpi/S;

    move-result-object p2

    :goto_2
    invoke-virtual {v2}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p3

    invoke-interface {p3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_e

    iget-object p3, p0, Lpi/G0;->a:Lpi/E0;

    invoke-virtual {v2}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-virtual {p3, v2}, Lpi/E0;->d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p3

    invoke-static {p3}, Lpi/G0;->i(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p3

    new-instance v2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/o;

    invoke-virtual {p2}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    new-array v0, v0, [Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    const/4 v6, 0x0

    aput-object v5, v0, v6

    aput-object p3, v0, v1

    invoke-direct {v2, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/o;-><init>([Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-static {p2, v2}, Lsi/d;->C(Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/S;

    move-result-object p2

    :cond_e
    sget-object p3, Lpi/G0$d;->NO_CONFLICT:Lpi/G0$d;

    if-ne p1, p3, :cond_f

    invoke-interface {v3}, Lpi/B0;->a()Lpi/N0;

    move-result-object p1

    invoke-static {v4, p1}, Lpi/G0;->d(Lpi/N0;Lpi/N0;)Lpi/N0;

    move-result-object v4

    :cond_f
    new-instance p1, Lpi/D0;

    invoke-direct {p1, v4, p2}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object p1

    :cond_10
    invoke-direct {p0, p1, p3}, Lpi/G0;->r(Lpi/B0;I)Lpi/B0;

    move-result-object p1

    if-nez p1, :cond_11

    const/16 p2, 0x19

    invoke-static {p2}, Lpi/G0;->a(I)V

    :cond_11
    :goto_3
    return-object p1
.end method


# virtual methods
.method public j()Lpi/E0;
    .locals 2

    iget-object v0, p0, Lpi/G0;->a:Lpi/E0;

    if-nez v0, :cond_0

    const/16 v1, 0x8

    invoke-static {v1}, Lpi/G0;->a(I)V

    :cond_0
    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lpi/G0;->a:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->f()Z

    move-result v0

    return v0
.end method

.method public m()Lpi/G0;
    .locals 5

    iget-object v0, p0, Lpi/G0;->a:Lpi/E0;

    instance-of v1, v0, Lpi/M;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lpi/E0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lpi/G0;

    new-instance v1, Lpi/M;

    iget-object v2, p0, Lpi/G0;->a:Lpi/E0;

    check-cast v2, Lpi/M;

    invoke-virtual {v2}, Lpi/M;->j()[LBh/l0;

    move-result-object v2

    iget-object v3, p0, Lpi/G0;->a:Lpi/E0;

    check-cast v3, Lpi/M;

    invoke-virtual {v3}, Lpi/M;->i()[Lpi/B0;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lpi/M;-><init>([LBh/l0;[Lpi/B0;Z)V

    invoke-direct {v0, v1}, Lpi/G0;-><init>(Lpi/E0;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public n(Lpi/S;Lpi/N0;)Lpi/S;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xa

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_1
    invoke-virtual {p0}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    const/16 p2, 0xb

    invoke-static {p2}, Lpi/G0;->a(I)V

    :cond_2
    return-object p1

    :cond_3
    :try_start_0
    new-instance v0, Lpi/D0;

    invoke-direct {v0, p2, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-direct {p0, v0, p1, p2}, Lpi/G0;->u(Lpi/B0;LBh/l0;I)Lpi/B0;

    move-result-object p1

    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object p1
    :try_end_0
    .catch Lpi/G0$c; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_4

    const/16 p2, 0xc

    invoke-static {p2}, Lpi/G0;->a(I)V

    :cond_4
    return-object p1

    :catch_0
    move-exception p1

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/types/error/k;->UNABLE_TO_SUBSTITUTE_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    if-nez p1, :cond_5

    const/16 p2, 0xd

    invoke-static {p2}, Lpi/G0;->a(I)V

    :cond_5
    return-object p1
.end method

.method public p(Lpi/S;Lpi/N0;)Lpi/S;
    .locals 2

    if-nez p1, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xf

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_1
    new-instance v0, Lpi/D0;

    invoke-virtual {p0}, Lpi/G0;->j()Lpi/E0;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lpi/E0;->g(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    invoke-virtual {p0, v0}, Lpi/G0;->q(Lpi/B0;)Lpi/B0;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public q(Lpi/B0;)Lpi/B0;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x10

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    invoke-virtual {p0, p1}, Lpi/G0;->t(Lpi/B0;)Lpi/B0;

    move-result-object p1

    iget-object v0, p0, Lpi/G0;->a:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lpi/G0;->a:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, Lpi/G0;->a:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->b()Z

    move-result v0

    invoke-static {p1, v0}, Lti/c;->d(Lpi/B0;Z)Lpi/B0;

    move-result-object p1

    return-object p1
.end method

.method public t(Lpi/B0;)Lpi/B0;
    .locals 2

    if-nez p1, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, Lpi/G0;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, p1, v1, v0}, Lpi/G0;->u(Lpi/B0;LBh/l0;I)Lpi/B0;

    move-result-object p1
    :try_end_0
    .catch Lpi/G0$c; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v1
.end method
