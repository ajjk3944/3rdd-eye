.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;
    }
.end annotation


# instance fields
.field private final a:Lo/H;

.field private b:Landroidx/compose/foundation/lazy/layout/c;

.field private c:I

.field private final d:Lo/I;

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:Ljava/util/List;

.field private final h:Ljava/util/List;

.field private final i:Ljava/util/List;

.field private j:LE0/r;

.field private final k:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lo/S;->d()Lo/H;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-static {}, Lo/U;->a()Lo/I;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lo/I;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k:Landroidx/compose/ui/e;

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f(LB/z;)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)LE0/r;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j:LE0/r;

    return-object p0
.end method

.method public static final synthetic d(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LE0/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j:LE0/r;

    return-void
.end method

.method private final f(LB/z;)I
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LB/z;->j(I)J

    move-result-wide v0

    invoke-interface {p1}, LB/z;->i()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final g(LB/z;)Z
    .locals 4

    invoke-interface {p1}, LB/z;->c()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, LB/z;->h(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, LB/q;->b(Ljava/lang/Object;)LB/i;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final h(LB/z;)I
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LB/z;->j(I)J

    move-result-wide v0

    invoke-interface {p1}, LB/z;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final k(LB/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V
    .locals 11

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LB/z;->j(I)J

    move-result-wide v7

    invoke-interface {p1}, LB/z;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-wide v1, v7

    move v4, p2

    invoke-static/range {v1 .. v6}, LY0/n;->e(JIIILjava/lang/Object;)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-wide v1, v7

    move v3, p2

    invoke-static/range {v1 .. v6}, LY0/n;->e(JIIILjava/lang/Object;)J

    move-result-wide v1

    :goto_0
    invoke-virtual {p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object p2

    array-length p3, p2

    move v3, v0

    :goto_1
    if-ge v0, p3, :cond_2

    aget-object v4, p2, v0

    add-int/lit8 v5, v3, 0x1

    if-eqz v4, :cond_1

    invoke-interface {p1, v3}, LB/z;->j(I)J

    move-result-wide v9

    invoke-static {v9, v10, v7, v8}, LY0/n;->k(JJ)J

    move-result-wide v9

    invoke-static {v1, v2, v9, v10}, LY0/n;->l(JJ)J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Landroidx/compose/foundation/lazy/layout/b;->J(J)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    move v3, v5

    goto :goto_1

    :cond_2
    return-void
.end method

.method static synthetic l(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    iget-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-interface {p1}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p3, p4}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k(LB/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V

    return-void
.end method

.method private final n(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-virtual {v0, p1}, Lo/H;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object p1

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/b;->y()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final p(LB/z;Z)V
    .locals 12

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-interface {p1}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v4, v0, v2

    add-int/lit8 v5, v3, 0x1

    if-eqz v4, :cond_1

    invoke-interface {p1, v3}, LB/z;->j(I)J

    move-result-wide v6

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/layout/b;->s()J

    move-result-wide v8

    sget-object v3, Landroidx/compose/foundation/lazy/layout/b;->s:Landroidx/compose/foundation/lazy/layout/b$a;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/b$a;->a()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, LY0/n;->g(JJ)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v8, v9, v6, v7}, LY0/n;->g(JJ)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v6, v7, v8, v9}, LY0/n;->k(JJ)J

    move-result-wide v8

    invoke-virtual {v4, v8, v9, p2}, Landroidx/compose/foundation/lazy/layout/b;->m(JZ)V

    :cond_0
    invoke-virtual {v4, v6, v7}, Landroidx/compose/foundation/lazy/layout/b;->J(J)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic q(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->p(LB/z;Z)V

    return-void
.end method

.method private final r([ILB/z;)I
    .locals 5

    invoke-interface {p2}, LB/z;->k()I

    move-result v0

    invoke-interface {p2}, LB/z;->g()I

    move-result v1

    add-int/2addr v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget v3, p1, v0

    invoke-interface {p2}, LB/z;->f()I

    move-result v4

    add-int/2addr v3, v4

    aput v3, p1, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method


# virtual methods
.method public final e(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-virtual {v0, p1}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object p1

    if-eqz p1, :cond_0

    aget-object p1, p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final i()J
    .locals 11

    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-virtual {v0}, LY0/r$a;->a()J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/b;->p()Lp0/c;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v7

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/b;->s()J

    move-result-wide v8

    invoke-static {v8, v9}, LY0/n;->h(J)I

    move-result v8

    invoke-virtual {v6}, Lp0/c;->v()J

    move-result-wide v9

    invoke-static {v9, v10}, LY0/r;->g(J)I

    move-result v9

    add-int/2addr v8, v9

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/b;->s()J

    move-result-wide v8

    invoke-static {v8, v9}, LY0/n;->i(J)I

    move-result v1

    invoke-virtual {v6}, Lp0/c;->v()J

    move-result-wide v5

    invoke-static {v5, v6}, LY0/r;->f(J)I

    move-result v5

    add-int/2addr v1, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v7, v0}, LY0/s;->a(II)J

    move-result-wide v0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-wide v0
.end method

.method public final j()Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public final m(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LB/A;ZZIZIILIi/N;Lm0/H0;)V
    .locals 35

    move-object/from16 v6, p0

    move/from16 v0, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v11, p9

    const/4 v12, 0x1

    iget-object v13, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->b:Landroidx/compose/foundation/lazy/layout/c;

    iput-object v10, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->b:Landroidx/compose/foundation/lazy/layout/c;

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v1

    const/4 v14, 0x0

    move v2, v14

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB/z;

    invoke-direct {v6, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g(LB/z;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v2, v12

    goto :goto_0

    :cond_1
    iget-object v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-virtual {v1}, Lo/Q;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->o()V

    return-void

    :cond_2
    :goto_1
    iget v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    invoke-static/range {p4 .. p4}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LB/z;

    if-eqz v2, :cond_3

    invoke-interface {v2}, LB/z;->getIndex()I

    move-result v2

    goto :goto_2

    :cond_3
    move v2, v14

    :goto_2
    iput v2, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    if-eqz p7, :cond_4

    invoke-static {v14, v0}, LY0/o;->a(II)J

    move-result-wide v2

    goto :goto_3

    :cond_4
    invoke-static {v0, v14}, LY0/o;->a(II)J

    move-result-wide v2

    :goto_3
    if-nez p8, :cond_6

    if-nez p10, :cond_5

    goto :goto_4

    :cond_5
    move v15, v14

    goto :goto_5

    :cond_6
    :goto_4
    move v15, v12

    :goto_5
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    iget-object v4, v0, Lo/Q;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lo/Q;->a:[J

    array-length v5, v0

    const/4 v14, 0x2

    sub-int/2addr v5, v14

    const-wide/16 v16, 0x80

    const-wide/16 v18, 0xff

    const/16 v20, 0x7

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move/from16 p7, v15

    if-ltz v5, :cond_a

    const/4 v12, 0x0

    :goto_6
    aget-wide v14, v0, v12

    not-long v7, v14

    shl-long v7, v7, v20

    and-long/2addr v7, v14

    and-long v7, v7, v21

    cmp-long v7, v7, v21

    if-eqz v7, :cond_9

    sub-int v7, v12, v5

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v7, :cond_8

    and-long v24, v14, v18

    cmp-long v24, v24, v16

    if-gez v24, :cond_7

    shl-int/lit8 v24, v12, 0x3

    add-int v24, v24, v8

    move-object/from16 v25, v0

    aget-object v0, v4, v24

    move-object/from16 v24, v4

    iget-object v4, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lo/I;

    invoke-virtual {v4, v0}, Lo/I;->h(Ljava/lang/Object;)Z

    :goto_8
    const/16 v0, 0x8

    goto :goto_9

    :cond_7
    move-object/from16 v25, v0

    move-object/from16 v24, v4

    goto :goto_8

    :goto_9
    shr-long/2addr v14, v0

    const/4 v4, 0x1

    add-int/2addr v8, v4

    move-object/from16 v4, v24

    move-object/from16 v0, v25

    goto :goto_7

    :cond_8
    move-object/from16 v25, v0

    move-object/from16 v24, v4

    const/16 v0, 0x8

    const/4 v4, 0x1

    if-ne v7, v0, :cond_a

    goto :goto_a

    :cond_9
    move-object/from16 v25, v0

    move-object/from16 v24, v4

    const/4 v4, 0x1

    :goto_a
    if-eq v12, v5, :cond_a

    add-int/2addr v12, v4

    move/from16 v7, p2

    move/from16 v8, p3

    move-object/from16 v4, v24

    move-object/from16 v0, v25

    goto :goto_6

    :cond_a
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x0

    :goto_b
    const/4 v7, -0x1

    if-ge v4, v0, :cond_1a

    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LB/z;

    iget-object v12, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lo/I;

    invoke-interface {v5}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v12, v14}, Lo/I;->x(Ljava/lang/Object;)Z

    invoke-direct {v6, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g(LB/z;)Z

    move-result v12

    if-eqz v12, :cond_19

    iget-object v12, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-interface {v5}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v12, v14}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    if-eqz v13, :cond_b

    invoke-interface {v5}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v13, v14}, Landroidx/compose/foundation/lazy/layout/c;->c(Ljava/lang/Object;)I

    move-result v14

    goto :goto_c

    :cond_b
    move v14, v7

    :goto_c
    if-ne v14, v7, :cond_c

    if-eqz v13, :cond_c

    const/4 v15, 0x1

    goto :goto_d

    :cond_c
    const/4 v15, 0x0

    :goto_d
    if-nez v12, :cond_12

    new-instance v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    invoke-direct {v8, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    const/16 v31, 0x20

    const/16 v32, 0x0

    const/16 v30, 0x0

    move-object/from16 v24, v8

    move-object/from16 v25, v5

    move-object/from16 v26, p13

    move-object/from16 v27, p14

    move/from16 v28, p11

    move/from16 v29, p12

    invoke-static/range {v24 .. v32}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->l(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;LB/z;LIi/N;Lm0/H0;IIIILjava/lang/Object;)V

    iget-object v12, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-interface {v5}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v12, v7, v8}, Lo/H;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5}, LB/z;->getIndex()I

    move-result v7

    if-eq v7, v14, :cond_f

    const/4 v7, -0x1

    if-eq v14, v7, :cond_f

    if-ge v14, v1, :cond_e

    iget-object v7, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    :goto_e
    move/from16 v26, v0

    move-object/from16 v27, v13

    const/4 v0, 0x0

    const/4 v9, 0x1

    goto/16 :goto_15

    :cond_e
    iget-object v7, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_f
    const/4 v7, 0x0

    invoke-interface {v5, v7}, LB/z;->j(I)J

    move-result-wide v24

    invoke-interface {v5}, LB/z;->i()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-static/range {v24 .. v25}, LY0/n;->i(J)I

    move-result v7

    goto :goto_f

    :cond_10
    invoke-static/range {v24 .. v25}, LY0/n;->h(J)I

    move-result v7

    :goto_f
    invoke-direct {v6, v5, v7, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->k(LB/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V

    if-eqz v15, :cond_d

    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v5

    array-length v7, v5

    const/4 v8, 0x0

    :goto_10
    if-ge v8, v7, :cond_d

    aget-object v12, v5, v8

    if-eqz v12, :cond_11

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/b;->k()V

    sget-object v12, LYg/J;->a:LYg/J;

    :cond_11
    const/4 v12, 0x1

    add-int/2addr v8, v12

    goto :goto_10

    :cond_12
    if-eqz p7, :cond_d

    const/16 v31, 0x20

    const/16 v32, 0x0

    const/16 v30, 0x0

    move-object/from16 v24, v12

    move-object/from16 v25, v5

    move-object/from16 v26, p13

    move-object/from16 v27, p14

    move/from16 v28, p11

    move/from16 v29, p12

    invoke-static/range {v24 .. v32}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->l(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;LB/z;LIi/N;Lm0/H0;IIIILjava/lang/Object;)V

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v7

    array-length v14, v7

    const/4 v8, 0x0

    :goto_11
    if-ge v8, v14, :cond_15

    move/from16 v26, v0

    aget-object v0, v7, v8

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/b;->s()J

    move-result-wide v9

    sget-object v24, Landroidx/compose/foundation/lazy/layout/b;->s:Landroidx/compose/foundation/lazy/layout/b$a;

    move-object/from16 v27, v13

    move/from16 v28, v14

    invoke-virtual/range {v24 .. v24}, Landroidx/compose/foundation/lazy/layout/b$a;->a()J

    move-result-wide v13

    invoke-static {v9, v10, v13, v14}, LY0/n;->g(JJ)Z

    move-result v9

    if-nez v9, :cond_13

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/b;->s()J

    move-result-wide v9

    invoke-static {v9, v10, v2, v3}, LY0/n;->l(JJ)J

    move-result-wide v9

    invoke-virtual {v0, v9, v10}, Landroidx/compose/foundation/lazy/layout/b;->J(J)V

    :cond_13
    :goto_12
    const/4 v0, 0x1

    goto :goto_13

    :cond_14
    move-object/from16 v27, v13

    move/from16 v28, v14

    goto :goto_12

    :goto_13
    add-int/2addr v8, v0

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v0, v26

    move-object/from16 v13, v27

    move/from16 v14, v28

    goto :goto_11

    :cond_15
    move/from16 v26, v0

    move-object/from16 v27, v13

    if-eqz v15, :cond_18

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v0

    array-length v7, v0

    const/4 v8, 0x0

    :goto_14
    if-ge v8, v7, :cond_18

    aget-object v9, v0, v8

    if-eqz v9, :cond_17

    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/layout/b;->v()Z

    move-result v10

    if-eqz v10, :cond_16

    iget-object v10, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v10, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j:LE0/r;

    if-eqz v10, :cond_16

    invoke-static {v10}, LE0/s;->a(LE0/r;)V

    sget-object v10, LYg/J;->a:LYg/J;

    :cond_16
    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/layout/b;->k()V

    :cond_17
    const/4 v9, 0x1

    add-int/2addr v8, v9

    goto :goto_14

    :cond_18
    const/4 v9, 0x1

    const/4 v0, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v6, v5, v0, v7, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->q(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;ZILjava/lang/Object;)V

    goto :goto_15

    :cond_19
    move/from16 v26, v0

    move-object/from16 v27, v13

    const/4 v0, 0x0

    const/4 v9, 0x1

    invoke-interface {v5}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v6, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n(Ljava/lang/Object;)V

    :goto_15
    add-int/2addr v4, v9

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v0, v26

    move-object/from16 v13, v27

    goto/16 :goto_b

    :cond_1a
    move-object/from16 v27, v13

    const/4 v0, 0x0

    const/4 v9, 0x1

    new-array v7, v11, [I

    move v1, v0

    :goto_16
    if-ge v1, v11, :cond_1b

    aput v0, v7, v1

    add-int/2addr v1, v9

    const/4 v0, 0x0

    goto :goto_16

    :cond_1b
    if-eqz p7, :cond_21

    if-eqz v27, :cond_21

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v9, :cond_1c

    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$e;

    move-object/from16 v8, v27

    invoke-direct {v1, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$e;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v0, v1}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_17

    :cond_1c
    move-object/from16 v8, v27

    :goto_17
    iget-object v9, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v12, 0x0

    :goto_18
    if-ge v12, v10, :cond_1d

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, LB/z;

    invoke-direct {v6, v7, v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->r([ILB/z;)I

    move-result v0

    sub-int v2, p11, v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object v1, v13

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;ILjava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v6, v13, v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->q(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;ZILjava/lang/Object;)V

    const/4 v0, 0x1

    add-int/2addr v12, v0

    goto :goto_18

    :cond_1d
    const/16 v32, 0x6

    const/16 v33, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v28, v7

    invoke-static/range {v28 .. v33}, LZg/n;->w([IIIIILjava/lang/Object;)V

    goto :goto_19

    :cond_1e
    move-object/from16 v8, v27

    :goto_19
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_22

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1f

    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$c;

    invoke-direct {v1, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$c;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v0, v1}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1f
    iget-object v9, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v12, 0x0

    :goto_1a
    if-ge v12, v10, :cond_20

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, LB/z;

    invoke-direct {v6, v7, v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->r([ILB/z;)I

    move-result v0

    add-int v0, p12, v0

    invoke-interface {v13}, LB/z;->f()I

    move-result v1

    sub-int v2, v0, v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object v1, v13

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;ILjava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v6, v13, v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->q(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;LB/z;ZILjava/lang/Object;)V

    const/4 v0, 0x1

    add-int/2addr v12, v0

    goto :goto_1a

    :cond_20
    const/16 v32, 0x6

    const/16 v33, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v28, v7

    invoke-static/range {v28 .. v33}, LZg/n;->w([IIIIILjava/lang/Object;)V

    goto :goto_1b

    :cond_21
    move-object/from16 v8, v27

    :cond_22
    :goto_1b
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lo/I;

    iget-object v1, v0, Lo/T;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lo/T;->a:[J

    array-length v2, v0

    const/4 v3, 0x2

    sub-int/2addr v2, v3

    if-ltz v2, :cond_35

    const/4 v3, 0x0

    :goto_1c
    aget-wide v4, v0, v3

    not-long v9, v4

    shl-long v9, v9, v20

    and-long/2addr v9, v4

    and-long v9, v9, v21

    cmp-long v9, v9, v21

    if-eqz v9, :cond_34

    sub-int v9, v3, v2

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v14, v9, 0x8

    const/4 v9, 0x0

    :goto_1d
    if-ge v9, v14, :cond_33

    and-long v12, v4, v18

    cmp-long v10, v12, v16

    if-gez v10, :cond_31

    shl-int/lit8 v10, v3, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    iget-object v12, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-virtual {v12, v10}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    move-object/from16 v15, p5

    invoke-interface {v15, v10}, Landroidx/compose/foundation/lazy/layout/c;->c(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v33, v0

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->g()I

    move-result v0

    invoke-static {v11, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v12, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->j(I)V

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->g()I

    move-result v0

    sub-int v0, v11, v0

    move-object/from16 p1, v1

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->d()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v12, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->i(I)V

    const/4 v0, -0x1

    if-ne v13, v0, :cond_2b

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v1

    array-length v13, v1

    const/4 v0, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    :goto_1e
    if-ge v0, v13, :cond_2a

    aget-object v11, v1, v0

    const/16 v23, 0x1

    add-int/lit8 v28, v26, 0x1

    if-eqz v11, :cond_29

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/layout/b;->v()Z

    move-result v29

    if-eqz v29, :cond_24

    move-object/from16 v29, v1

    :cond_23
    :goto_1f
    const/4 v1, 0x1

    const/4 v11, 0x0

    const/16 v27, 0x1

    goto :goto_22

    :cond_24
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/layout/b;->u()Z

    move-result v29

    if-eqz v29, :cond_26

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/layout/b;->y()V

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v29

    const/16 v25, 0x0

    aput-object v25, v29, v26

    move-object/from16 v29, v1

    iget-object v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j:LE0/r;

    if-eqz v1, :cond_25

    invoke-static {v1}, LE0/s;->a(LE0/r;)V

    sget-object v1, LYg/J;->a:LYg/J;

    :cond_25
    :goto_20
    const/4 v11, 0x0

    goto :goto_21

    :cond_26
    move-object/from16 v29, v1

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/layout/b;->p()Lp0/c;

    move-result-object v1

    if-eqz v1, :cond_27

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/layout/b;->l()V

    :cond_27
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/layout/b;->v()Z

    move-result v1

    if-eqz v1, :cond_28

    iget-object v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->j:LE0/r;

    if-eqz v1, :cond_23

    invoke-static {v1}, LE0/s;->a(LE0/r;)V

    sget-object v1, LYg/J;->a:LYg/J;

    goto :goto_1f

    :cond_28
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/layout/b;->y()V

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v1

    const/4 v11, 0x0

    aput-object v11, v1, v26

    goto :goto_21

    :cond_29
    move-object/from16 v29, v1

    goto :goto_20

    :goto_21
    const/4 v1, 0x1

    :goto_22
    add-int/2addr v0, v1

    move/from16 v11, p9

    move/from16 v26, v28

    move-object/from16 v1, v29

    goto :goto_1e

    :cond_2a
    const/4 v11, 0x0

    if-nez v27, :cond_32

    invoke-direct {v6, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n(Ljava/lang/Object;)V

    goto/16 :goto_26

    :cond_2b
    const/4 v11, 0x0

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->b()LY0/b;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LY0/b;->r()J

    move-result-wide v30

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->d()I

    move-result v28

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->g()I

    move-result v29

    move-object/from16 v26, p6

    move/from16 v27, v13

    invoke-interface/range {v26 .. v31}, LB/A;->a(IIIJ)LB/z;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, LB/z;->e(Z)V

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v11

    array-length v1, v11

    move-object/from16 v34, v7

    const/4 v7, 0x0

    :goto_23
    if-ge v7, v1, :cond_2e

    aget-object v26, v11, v7

    move/from16 v27, v1

    if-eqz v26, :cond_2c

    invoke-virtual/range {v26 .. v26}, Landroidx/compose/foundation/lazy/layout/b;->w()Z

    move-result v1

    move-object/from16 v26, v11

    const/4 v11, 0x1

    if-ne v1, v11, :cond_2d

    goto :goto_24

    :cond_2c
    move-object/from16 v26, v11

    const/4 v11, 0x1

    :cond_2d
    add-int/2addr v7, v11

    move-object/from16 v11, v26

    move/from16 v1, v27

    goto :goto_23

    :cond_2e
    if-eqz v8, :cond_2f

    invoke-interface {v8, v10}, Landroidx/compose/foundation/lazy/layout/c;->c(Ljava/lang/Object;)I

    move-result v1

    if-ne v13, v1, :cond_2f

    invoke-direct {v6, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n(Ljava/lang/Object;)V

    goto :goto_25

    :cond_2f
    :goto_24
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->c()I

    move-result v32

    move-object/from16 v26, v12

    move-object/from16 v27, v0

    move-object/from16 v28, p13

    move-object/from16 v29, p14

    move/from16 v30, p11

    move/from16 v31, p12

    invoke-virtual/range {v26 .. v32}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->k(LB/z;LIi/N;Lm0/H0;III)V

    iget v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    if-ge v13, v1, :cond_30

    iget-object v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_30
    iget-object v1, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_25
    const/16 v0, 0x8

    goto :goto_27

    :cond_31
    move-object/from16 v15, p5

    move-object/from16 v33, v0

    move-object/from16 p1, v1

    :cond_32
    :goto_26
    move-object/from16 v34, v7

    goto :goto_25

    :goto_27
    shr-long/2addr v4, v0

    const/4 v1, 0x1

    add-int/2addr v9, v1

    move-object/from16 v1, p1

    move/from16 v11, p9

    move-object/from16 v0, v33

    move-object/from16 v7, v34

    goto/16 :goto_1d

    :cond_33
    move-object/from16 v15, p5

    move-object/from16 v33, v0

    move-object/from16 p1, v1

    move-object/from16 v34, v7

    const/16 v0, 0x8

    const/4 v1, 0x1

    if-ne v14, v0, :cond_36

    goto :goto_28

    :cond_34
    move-object/from16 v15, p5

    move-object/from16 v33, v0

    move-object/from16 p1, v1

    move-object/from16 v34, v7

    const/16 v0, 0x8

    const/4 v1, 0x1

    :goto_28
    if-eq v3, v2, :cond_36

    add-int/2addr v3, v1

    move-object/from16 v1, p1

    move/from16 v11, p9

    move-object/from16 v0, v33

    move-object/from16 v7, v34

    goto/16 :goto_1c

    :cond_35
    move-object/from16 v15, p5

    move-object/from16 v34, v7

    :cond_36
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3b

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_37

    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$f;

    invoke-direct {v1, v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$f;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v0, v1}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_37
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v7, 0x0

    :goto_29
    if-ge v7, v1, :cond_3a

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LB/z;

    iget-object v3, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-interface {v2}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    move-object/from16 v4, v34

    invoke-direct {v6, v4, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->r([ILB/z;)I

    move-result v5

    if-eqz p8, :cond_38

    invoke-static/range {p4 .. p4}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LB/z;

    invoke-direct {v6, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h(LB/z;)I

    move-result v8

    goto :goto_2a

    :cond_38
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->f()I

    move-result v8

    :goto_2a
    sub-int/2addr v8, v5

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->c()I

    move-result v3

    move/from16 v5, p2

    move/from16 v9, p3

    invoke-interface {v2, v8, v3, v5, v9}, LB/z;->l(IIII)V

    const/4 v3, 0x1

    if-eqz p7, :cond_39

    invoke-direct {v6, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->p(LB/z;Z)V

    :cond_39
    add-int/2addr v7, v3

    move-object/from16 v34, v4

    goto :goto_29

    :cond_3a
    move/from16 v5, p2

    move/from16 v9, p3

    move-object/from16 v4, v34

    const/4 v14, 0x6

    const/4 v0, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v4

    move-object v1, v15

    move-object v15, v0

    invoke-static/range {v10 .. v15}, LZg/n;->w([IIIIILjava/lang/Object;)V

    goto :goto_2b

    :cond_3b
    move/from16 v5, p2

    move/from16 v9, p3

    move-object v1, v15

    move-object/from16 v4, v34

    :goto_2b
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3f

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3c

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$d;

    invoke-direct {v2, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$d;-><init>(Landroidx/compose/foundation/lazy/layout/c;)V

    invoke-static {v0, v2}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_3c
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v7, 0x0

    :goto_2c
    if-ge v7, v1, :cond_3f

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LB/z;

    iget-object v3, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-interface {v2}, LB/z;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v8}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    invoke-direct {v6, v4, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->r([ILB/z;)I

    move-result v8

    if-eqz p8, :cond_3d

    invoke-static/range {p4 .. p4}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LB/z;

    invoke-direct {v6, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h(LB/z;)I

    move-result v10

    goto :goto_2d

    :cond_3d
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->e()I

    move-result v10

    invoke-interface {v2}, LB/z;->f()I

    move-result v11

    sub-int/2addr v10, v11

    :goto_2d
    add-int/2addr v10, v8

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->c()I

    move-result v3

    invoke-interface {v2, v10, v3, v5, v9}, LB/z;->l(IIII)V

    const/4 v3, 0x1

    if-eqz p7, :cond_3e

    invoke-direct {v6, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->p(LB/z;Z)V

    :cond_3e
    add-int/2addr v7, v3

    goto :goto_2c

    :cond_3f
    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-static {v0}, LZg/v;->X(Ljava/util/List;)V

    sget-object v1, LYg/J;->a:LYg/J;

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v1, p4

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d:Lo/I;

    invoke-virtual {v0}, Lo/I;->m()V

    return-void
.end method

.method public final o()V
    .locals 14

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-virtual {v0}, Lo/Q;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    iget-object v1, v0, Lo/Q;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lo/Q;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_4

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_3

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_2

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_1

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;->a()[Landroidx/compose/foundation/lazy/layout/b;

    move-result-object v10

    array-length v11, v10

    move v12, v3

    :goto_2
    if-ge v12, v11, :cond_1

    aget-object v13, v10, v12

    if-eqz v13, :cond_0

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/b;->y()V

    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_1
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    if-ne v7, v8, :cond_4

    :cond_3
    if-eq v4, v2, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->a:Lo/H;

    invoke-virtual {v0}, Lo/H;->i()V

    :cond_5
    sget-object v0, Landroidx/compose/foundation/lazy/layout/c;->a:Landroidx/compose/foundation/lazy/layout/c$a;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->b:Landroidx/compose/foundation/lazy/layout/c;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->c:I

    return-void
.end method
