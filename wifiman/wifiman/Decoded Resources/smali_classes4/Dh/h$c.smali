.class LDh/h$c;
.super Lpi/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDh/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private final d:LBh/j0;

.field final synthetic e:LDh/h;


# direct methods
.method public constructor <init>(LDh/h;Loi/n;LBh/j0;)V
    .locals 1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LDh/h$c;->H(I)V

    :cond_0
    iput-object p1, p0, LDh/h$c;->e:LDh/h;

    invoke-direct {p0, p2}, Lpi/p;-><init>(Loi/n;)V

    iput-object p3, p0, LDh/h$c;->d:LBh/j0;

    return-void
.end method

.method private static synthetic H(I)V
    .locals 11

    const/16 v0, 0x8

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq p0, v5, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v6, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v6, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v5, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v7, v3

    goto :goto_1

    :cond_1
    move v7, v4

    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor"

    const/4 v9, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v10, "storageManager"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_0
    const-string v10, "classifier"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_1
    const-string v10, "supertypes"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_2
    const-string v10, "type"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_3
    aput-object v8, v7, v9

    :goto_2
    const-string v9, "processSupertypesWithoutCycles"

    if-eq p0, v5, :cond_7

    if-eq p0, v4, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v8, v7, v5

    goto :goto_3

    :cond_2
    aput-object v9, v7, v5

    goto :goto_3

    :cond_3
    const-string v8, "getSupertypeLoopChecker"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_4
    const-string v8, "getBuiltIns"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_5
    const-string v8, "getDeclarationDescriptor"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_6
    const-string v8, "getParameters"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_7
    const-string v8, "computeSupertypes"

    aput-object v8, v7, v5

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v8, "<init>"

    aput-object v8, v7, v4

    goto :goto_4

    :pswitch_4
    const-string v8, "isSameClassifier"

    aput-object v8, v7, v4

    goto :goto_4

    :pswitch_5
    aput-object v9, v7, v4

    goto :goto_4

    :pswitch_6
    const-string v8, "reportSupertypeLoopError"

    aput-object v8, v7, v4

    :goto_4
    :pswitch_7
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    if-eq p0, v5, :cond_8

    if-eq p0, v4, :cond_8

    if-eq p0, v3, :cond_8

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_8

    if-eq p0, v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public c()LBh/h;
    .locals 2

    iget-object v0, p0, LDh/h$c;->e:LDh/h;

    if-nez v0, :cond_0

    const/4 v1, 0x3

    invoke-static {v1}, LDh/h$c;->H(I)V

    :cond_0
    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x2

    invoke-static {v1}, LDh/h$c;->H(I)V

    :cond_0
    return-object v0
.end method

.method protected h(LBh/h;)Z
    .locals 3

    if-nez p1, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, LDh/h$c;->H(I)V

    :cond_0
    instance-of v0, p1, LBh/l0;

    if-eqz v0, :cond_1

    sget-object v0, Lbi/g;->a:Lbi/g;

    iget-object v1, p0, LDh/h$c;->e:LDh/h;

    check-cast p1, LBh/l0;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Lbi/g;->m(LBh/l0;LBh/l0;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 2

    iget-object v0, p0, LDh/h$c;->e:LDh/h;

    invoke-static {v0}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, LDh/h$c;->H(I)V

    :cond_0
    return-object v0
.end method

.method protected r()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, LDh/h$c;->e:LDh/h;

    invoke-virtual {v0}, LDh/h;->L0()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, LDh/h$c;->H(I)V

    :cond_0
    return-object v0
.end method

.method protected s()Lpi/S;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/error/k;->CYCLIC_UPPER_BOUNDS:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDh/h$c;->e:LDh/h;

    invoke-virtual {v0}, LDh/m;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected v()LBh/j0;
    .locals 2

    iget-object v0, p0, LDh/h$c;->d:LBh/j0;

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LDh/h$c;->H(I)V

    :cond_0
    return-object v0
.end method

.method protected x(Ljava/util/List;)Ljava/util/List;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, LDh/h$c;->H(I)V

    :cond_0
    iget-object v0, p0, LDh/h$c;->e:LDh/h;

    invoke-virtual {v0, p1}, LDh/h;->G0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0x8

    invoke-static {v0}, LDh/h$c;->H(I)V

    :cond_1
    return-object p1
.end method

.method protected z(Lpi/S;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LDh/h$c;->H(I)V

    :cond_0
    iget-object v0, p0, LDh/h$c;->e:LDh/h;

    invoke-virtual {v0, p1}, LDh/h;->K0(Lpi/S;)V

    return-void
.end method
