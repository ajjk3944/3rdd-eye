.class public LDh/V;
.super LDh/X;
.source "SourceFile"

# interfaces
.implements LBh/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDh/V$a;,
        LDh/V$b;
    }
.end annotation


# static fields
.field public static final l:LDh/V$a;


# instance fields
.field private final f:I

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private final j:Lpi/S;

.field private final k:LBh/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LDh/V$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDh/V$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDh/V;->l:LDh/V$a;

    return-void
.end method

.method public constructor <init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V
    .locals 7

    move-object v6, p0

    const-string v0, "containingDeclaration"

    move-object v1, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object v2, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object v3, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outType"

    move-object v4, p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v5, p11

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LDh/X;-><init>(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;LBh/g0;)V

    move v0, p3

    iput v0, v6, LDh/V;->f:I

    move v0, p7

    iput-boolean v0, v6, LDh/V;->g:Z

    move v0, p8

    iput-boolean v0, v6, LDh/V;->h:Z

    move/from16 v0, p9

    iput-boolean v0, v6, LDh/V;->i:Z

    move-object/from16 v0, p10

    iput-object v0, v6, LDh/V;->j:Lpi/S;

    if-nez p2, :cond_0

    move-object v0, v6

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    iput-object v0, v6, LDh/V;->k:LBh/s0;

    return-void
.end method

.method public static final K0(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;Lmh/a;)LDh/V;
    .locals 13

    sget-object v0, LDh/V;->l:LDh/V$a;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-virtual/range {v0 .. v12}, LDh/V$a;->a(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;Lmh/a;)LDh/V;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic B0()LBh/p;
    .locals 1

    invoke-virtual {p0}, LDh/V;->a()LBh/s0;

    move-result-object v0

    return-object v0
.end method

.method public E(LBh/a;LZh/f;I)LBh/s0;
    .locals 13

    const-string v0, "newOwner"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newName"

    move-object v6, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDh/V;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    const-string v1, "<get-annotations>(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/X;->getType()Lpi/S;

    move-result-object v7

    const-string v1, "getType(...)"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/V;->s0()Z

    move-result v8

    invoke-virtual {p0}, LDh/V;->Y()Z

    move-result v9

    invoke-virtual {p0}, LDh/V;->W()Z

    move-result v10

    invoke-virtual {p0}, LDh/V;->j0()Lpi/S;

    move-result-object v11

    sget-object v12, LBh/g0;->a:LBh/g0;

    const-string v1, "NO_SOURCE"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    move-object v1, v0

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, LDh/V;-><init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V

    return-object v0
.end method

.method public L0()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public M0(Lpi/G0;)LBh/s0;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/G0;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic V()Ldi/g;
    .locals 1

    invoke-virtual {p0}, LDh/V;->L0()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ldi/g;

    return-object v0
.end method

.method public W()Z
    .locals 1

    iget-boolean v0, p0, LDh/V;->i:Z

    return v0
.end method

.method public Y()Z
    .locals 1

    iget-boolean v0, p0, LDh/V;->h:Z

    return v0
.end method

.method public bridge synthetic a()LBh/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/V;->a()LBh/s0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/V;->a()LBh/s0;

    move-result-object v0

    return-object v0
.end method

.method public a()LBh/s0;
    .locals 1

    .line 3
    iget-object v0, p0, LDh/V;->k:LBh/s0;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LBh/s0;->a()LBh/s0;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public b()LBh/a;
    .locals 2

    .line 2
    invoke-super {p0}, LDh/n;->b()LBh/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/a;

    return-object v0
.end method

.method public bridge synthetic b()LBh/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/V;->b()LBh/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    invoke-virtual {p0, p1}, LDh/V;->M0(Lpi/G0;)LBh/s0;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Collection;
    .locals 4

    invoke-virtual {p0}, LDh/V;->b()LBh/a;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->f()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getOverriddenDescriptors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/a;

    invoke-interface {v2}, LBh/a;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, LDh/V;->getIndex()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/s0;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, LDh/V;->f:I

    return v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    sget-object v0, LBh/t;->f:LBh/u;

    const-string v1, "LOCAL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j0()Lpi/S;
    .locals 1

    iget-object v0, p0, LDh/V;->j:Lpi/S;

    return-object v0
.end method

.method public s0()Z
    .locals 2

    iget-boolean v0, p0, LDh/V;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LDh/V;->b()LBh/a;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/b;

    invoke-interface {v0}, LBh/b;->h()LBh/b$a;

    move-result-object v0

    invoke-virtual {v0}, LBh/b$a;->isReal()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LBh/o;->d(LBh/s0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
