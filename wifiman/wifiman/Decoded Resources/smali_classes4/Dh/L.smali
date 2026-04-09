.class public LDh/L;
.super LDh/J;
.source "SourceFile"

# interfaces
.implements LBh/Z;


# instance fields
.field private m:Lpi/S;

.field private final n:LBh/Z;


# direct methods
.method public constructor <init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/Z;LBh/g0;)V
    .locals 11

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LDh/L;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LDh/L;->I(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LDh/L;->I(I)V

    :cond_2
    if-nez p4, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LDh/L;->I(I)V

    :cond_3
    if-nez p8, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LDh/L;->I(I)V

    :cond_4
    if-nez p10, :cond_5

    const/4 v0, 0x5

    invoke-static {v0}, LDh/L;->I(I)V

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<get-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v5

    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object v3, p1

    move-object v4, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LDh/J;-><init>(LBh/D;LBh/u;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;ZZZLBh/b$a;LBh/g0;)V

    if-eqz p9, :cond_6

    move-object v1, p0

    move-object/from16 v0, p9

    goto :goto_0

    :cond_6
    move-object v0, p0

    move-object v1, v0

    :goto_0
    iput-object v0, v1, LDh/L;->n:LBh/Z;

    return-void
.end method

.method private static synthetic I(I)V
    .locals 9

    const/16 v0, 0x8

    const/4 v1, 0x7

    const/4 v2, 0x6

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v5, 0x3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v8, "correspondingProperty"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_0
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "kind"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    const-string v8, "modality"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const/4 v7, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v7

    goto :goto_3

    :cond_2
    const-string v6, "getOriginal"

    aput-object v6, v5, v7

    goto :goto_3

    :cond_3
    const-string v6, "getValueParameters"

    aput-object v6, v5, v7

    goto :goto_3

    :cond_4
    const-string v6, "getOverriddenDescriptors"

    aput-object v6, v5, v7

    :goto_3
    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    const-string v6, "<init>"

    aput-object v6, v5, v4

    :cond_5
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_6

    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public bridge synthetic B0()LBh/p;
    .locals 1

    invoke-virtual {p0}, LDh/L;->O0()LBh/Z;

    move-result-object v0

    return-object v0
.end method

.method public O0()LBh/Z;
    .locals 2

    iget-object v0, p0, LDh/L;->n:LBh/Z;

    if-nez v0, :cond_0

    const/16 v1, 0x8

    invoke-static {v1}, LDh/L;->I(I)V

    :cond_0
    return-object v0
.end method

.method public P0(Lpi/S;)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, LDh/J;->C0()LBh/Y;

    move-result-object p1

    invoke-interface {p1}, LBh/r0;->getType()Lpi/S;

    move-result-object p1

    :cond_0
    iput-object p1, p0, LDh/L;->m:Lpi/S;

    return-void
.end method

.method public bridge synthetic a()LBh/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/L;->O0()LBh/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/L;->O0()LBh/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, LDh/L;->O0()LBh/Z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/z;
    .locals 1

    .line 4
    invoke-virtual {p0}, LDh/L;->O0()LBh/Z;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    const/4 v0, 0x1

    invoke-super {p0, v0}, LDh/J;->K0(Z)Ljava/util/Collection;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, LDh/L;->I(I)V

    :cond_0
    return-object v0
.end method

.method public getReturnType()Lpi/S;
    .locals 1

    iget-object v0, p0, LDh/L;->m:Lpi/S;

    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, LDh/L;->I(I)V

    :cond_0
    return-object v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LBh/o;->m(LBh/Z;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
