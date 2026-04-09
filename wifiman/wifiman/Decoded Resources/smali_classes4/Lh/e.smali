.class public LLh/e;
.super LDh/O;
.source "SourceFile"

# interfaces
.implements LLh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLh/e$c;
    }
.end annotation


# static fields
.field public static final G:LBh/a$a;

.field public static final H:LBh/a$a;


# instance fields
.field private E:LLh/e$c;

.field private final F:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LLh/e$a;

    invoke-direct {v0}, LLh/e$a;-><init>()V

    sput-object v0, LLh/e;->G:LBh/a$a;

    new-instance v0, LLh/e$b;

    invoke-direct {v0}, LLh/e$b;-><init>()V

    sput-object v0, LLh/e;->H:LBh/a$a;

    return-void
.end method

.method protected constructor <init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_1
    if-nez p4, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_2
    if-nez p5, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_3
    if-nez p6, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_4
    invoke-direct/range {p0 .. p6}, LDh/O;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)V

    const/4 p1, 0x0

    iput-object p1, p0, LLh/e;->E:LLh/e$c;

    iput-boolean p7, p0, LLh/e;->F:Z

    return-void
.end method

.method private static synthetic I(I)V
    .locals 11

    const/16 v0, 0x15

    const/16 v1, 0x12

    const/16 v2, 0xd

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

    const-string v6, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v8, "containingDeclaration"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "enhancedReturnType"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "enhancedValueParameterTypes"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "newOwner"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_6
    const-string v8, "unsubstitutedValueParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_7
    const-string v8, "typeParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_8
    const-string v8, "contextReceiverParameters"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_9
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_a
    const-string v8, "kind"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_b
    const-string v8, "name"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_c
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const-string v7, "initialize"

    const-string v8, "createSubstitutedCopy"

    const-string v9, "enhance"

    const/4 v10, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v10

    goto :goto_3

    :cond_2
    aput-object v9, v5, v10

    goto :goto_3

    :cond_3
    aput-object v8, v5, v10

    goto :goto_3

    :cond_4
    aput-object v7, v5, v10

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v6, "<init>"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_d
    aput-object v9, v5, v4

    goto :goto_4

    :pswitch_e
    aput-object v8, v5, v4

    goto :goto_4

    :pswitch_f
    aput-object v7, v5, v4

    goto :goto_4

    :pswitch_10
    const-string v6, "createJavaMethod"

    aput-object v6, v5, v4

    :goto_4
    :pswitch_11
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_c
        :pswitch_9
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x5
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_11
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_11
        :pswitch_d
        :pswitch_d
        :pswitch_11
    .end packed-switch
.end method

.method public static p1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;Z)LLh/e;
    .locals 9

    if-nez p0, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x6

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v0, 0x7

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_2
    if-nez p3, :cond_3

    const/16 v0, 0x8

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_3
    new-instance v0, LLh/e;

    const/4 v3, 0x0

    sget-object v6, LBh/b$a;->DECLARATION:LBh/b$a;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, LLh/e;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;Z)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic A0(Lpi/S;Ljava/util/List;Lpi/S;LYg/s;)LLh/a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LLh/e;->r1(Lpi/S;Ljava/util/List;Lpi/S;LYg/s;)LLh/e;

    move-result-object p1

    return-object p1
.end method

.method public H()Z
    .locals 1

    iget-object v0, p0, LLh/e;->E:LLh/e$c;

    iget-boolean v0, v0, LLh/e$c;->isSynthesized:Z

    return v0
.end method

.method protected bridge synthetic L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LLh/e;->q1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LLh/e;

    move-result-object p1

    return-object p1
.end method

.method public Q0()Z
    .locals 1

    iget-object v0, p0, LLh/e;->E:LLh/e$c;

    iget-boolean v0, v0, LLh/e$c;->isStable:Z

    return v0
.end method

.method public o1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;Ljava/util/Map;)LDh/O;
    .locals 1

    if-nez p3, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_0
    if-nez p4, :cond_1

    const/16 v0, 0xa

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0xb

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_2
    if-nez p8, :cond_3

    const/16 v0, 0xc

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_3
    invoke-super/range {p0 .. p9}, LDh/O;->o1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;Ljava/util/Map;)LDh/O;

    move-result-object p1

    sget-object p2, Lui/s;->a:Lui/s;

    invoke-virtual {p2, p1}, Lui/b;->a(LBh/z;)Lui/g;

    move-result-object p2

    invoke-virtual {p2}, Lui/g;->a()Z

    move-result p2

    invoke-virtual {p0, p2}, LDh/s;->f1(Z)V

    if-nez p1, :cond_4

    const/16 p2, 0xd

    invoke-static {p2}, LLh/e;->I(I)V

    :cond_4
    return-object p1
.end method

.method protected q1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LLh/e;
    .locals 9

    if-nez p1, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0xf

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0x10

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 v0, 0x11

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_3
    new-instance v0, LLh/e;

    move-object v3, p2

    check-cast v3, LBh/f0;

    if-eqz p4, :cond_4

    :goto_0
    move-object v5, p4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LDh/m;->getName()LZh/f;

    move-result-object p4

    goto :goto_0

    :goto_1
    iget-boolean v8, p0, LLh/e;->F:Z

    move-object v1, v0

    move-object v2, p1

    move-object v4, p5

    move-object v6, p3

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, LLh/e;-><init>(LBh/m;LBh/f0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;Z)V

    invoke-virtual {p0}, LLh/e;->Q0()Z

    move-result p1

    invoke-virtual {p0}, LLh/e;->H()Z

    move-result p2

    invoke-virtual {v0, p1, p2}, LLh/e;->s1(ZZ)V

    return-object v0
.end method

.method public r1(Lpi/S;Ljava/util/List;Lpi/S;LYg/s;)LLh/e;
    .locals 1

    if-nez p2, :cond_0

    const/16 v0, 0x13

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0x14

    invoke-static {v0}, LLh/e;->I(I)V

    :cond_1
    invoke-virtual {p0}, LDh/s;->i()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, v0, p0}, LLh/h;->a(Ljava/util/Collection;Ljava/util/Collection;LBh/a;)Ljava/util/List;

    move-result-object p2

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lbi/h;->i(LBh/a;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/b0;

    move-result-object p1

    :goto_0
    invoke-virtual {p0}, LDh/O;->v()LBh/z$a;

    move-result-object v0

    invoke-interface {v0, p2}, LBh/z$a;->d(Ljava/util/List;)LBh/z$a;

    move-result-object p2

    invoke-interface {p2, p3}, LBh/z$a;->g(Lpi/S;)LBh/z$a;

    move-result-object p2

    invoke-interface {p2, p1}, LBh/z$a;->c(LBh/b0;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->b()LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->i()LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    check-cast p1, LLh/e;

    if-eqz p4, :cond_3

    invoke-virtual {p4}, LYg/s;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LBh/a$a;

    invoke-virtual {p4}, LYg/s;->j()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LDh/s;->U0(LBh/a$a;Ljava/lang/Object;)V

    :cond_3
    if-nez p1, :cond_4

    const/16 p2, 0x15

    invoke-static {p2}, LLh/e;->I(I)V

    :cond_4
    return-object p1
.end method

.method public s1(ZZ)V
    .locals 0

    invoke-static {p1, p2}, LLh/e$c;->get(ZZ)LLh/e$c;

    move-result-object p1

    iput-object p1, p0, LLh/e;->E:LLh/e$c;

    return-void
.end method
