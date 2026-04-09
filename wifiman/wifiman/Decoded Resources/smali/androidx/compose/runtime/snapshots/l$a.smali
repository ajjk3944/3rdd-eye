.class final Landroidx/compose/runtime/snapshots/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/snapshots/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lmh/l;

.field private b:Ljava/lang/Object;

.field private c:Lo/E;

.field private d:I

.field private final e:LV/f;

.field private final f:Lo/H;

.field private final g:Lo/I;

.field private final h:LV/b;

.field private final i:LT/I;

.field private j:I

.field private final k:LV/f;

.field private final l:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->a:Lmh/l;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/compose/runtime/snapshots/l$a;->d:I

    new-instance p1, LV/f;

    invoke-direct {p1}, LV/f;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->e:LV/f;

    new-instance p1, Lo/H;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lo/H;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    new-instance p1, Lo/I;

    invoke-direct {p1, v0, v1, v2}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->g:Lo/I;

    new-instance p1, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [LT/H;

    invoke-direct {p1, v1, v0}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    new-instance p1, Landroidx/compose/runtime/snapshots/l$a$a;

    invoke-direct {p1, p0}, Landroidx/compose/runtime/snapshots/l$a$a;-><init>(Landroidx/compose/runtime/snapshots/l$a;)V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->i:LT/I;

    new-instance p1, LV/f;

    invoke-direct {p1}, LV/f;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->k:LV/f;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->l:Ljava/util/HashMap;

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/runtime/snapshots/l$a;)I
    .locals 0

    iget p0, p0, Landroidx/compose/runtime/snapshots/l$a;->j:I

    return p0
.end method

.method public static final synthetic b(Landroidx/compose/runtime/snapshots/l$a;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/snapshots/l$a;->j:I

    return-void
.end method

.method private final d(Ljava/lang/Object;)V
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Landroidx/compose/runtime/snapshots/l$a;->d:I

    iget-object v2, v0, Landroidx/compose/runtime/snapshots/l$a;->c:Lo/E;

    if-eqz v2, :cond_6

    iget-object v3, v2, Lo/K;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_6

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    aget-wide v7, v3, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_5

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move v11, v5

    :goto_1
    if-ge v11, v9, :cond_4

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_2

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    iget-object v13, v2, Lo/K;->b:[Ljava/lang/Object;

    aget-object v13, v13, v12

    iget-object v14, v2, Lo/K;->c:[I

    aget v14, v14, v12

    if-eq v14, v1, :cond_0

    const/4 v14, 0x1

    goto :goto_2

    :cond_0
    move v14, v5

    :goto_2
    move-object/from16 v15, p1

    if-eqz v14, :cond_1

    invoke-direct {v0, v15, v13}, Landroidx/compose/runtime/snapshots/l$a;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    if-eqz v14, :cond_3

    invoke-virtual {v2, v12}, Lo/E;->p(I)V

    goto :goto_3

    :cond_2
    move-object/from16 v15, p1

    :cond_3
    :goto_3
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_4
    move-object/from16 v15, p1

    if-ne v9, v10, :cond_6

    goto :goto_4

    :cond_5
    move-object/from16 v15, p1

    :goto_4
    if-eq v6, v4, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method private final l(Ljava/lang/Object;ILjava/lang/Object;Lo/E;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    iget v3, v0, Landroidx/compose/runtime/snapshots/l$a;->j:I

    if-lez v3, :cond_0

    return-void

    :cond_0
    const/4 v3, -0x1

    move-object/from16 v4, p4

    invoke-virtual {v4, v1, v2, v3}, Lo/E;->o(Ljava/lang/Object;II)I

    move-result v4

    instance-of v5, v1, LT/H;

    const/4 v6, 0x2

    if-eqz v5, :cond_6

    if-eq v4, v2, :cond_6

    move-object v2, v1

    check-cast v2, LT/H;

    invoke-interface {v2}, LT/H;->o()LT/H$a;

    move-result-object v2

    iget-object v5, v0, Landroidx/compose/runtime/snapshots/l$a;->l:Ljava/util/HashMap;

    invoke-interface {v2}, LT/H$a;->a()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, LT/H$a;->b()Lo/K;

    move-result-object v2

    iget-object v5, v0, Landroidx/compose/runtime/snapshots/l$a;->k:LV/f;

    invoke-virtual {v5, v1}, LV/f;->g(Ljava/lang/Object;)V

    iget-object v7, v2, Lo/K;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lo/K;->a:[J

    array-length v8, v2

    sub-int/2addr v8, v6

    if-ltz v8, :cond_5

    const/4 v10, 0x0

    :goto_0
    aget-wide v11, v2, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_4

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_3

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_2

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    aget-object v16, v7, v16

    move-object/from16 v9, v16

    check-cast v9, Ld0/k;

    instance-of v3, v9, Ld0/l;

    if-eqz v3, :cond_1

    move-object v3, v9

    check-cast v3, Ld0/l;

    invoke-static {v6}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v14

    invoke-virtual {v3, v14}, Ld0/l;->q(I)V

    :cond_1
    invoke-virtual {v5, v9, v1}, LV/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x8

    goto :goto_2

    :cond_2
    move v3, v14

    :goto_2
    shr-long/2addr v11, v3

    add-int/lit8 v15, v15, 0x1

    move v14, v3

    const/4 v3, -0x1

    goto :goto_1

    :cond_3
    move v3, v14

    if-ne v13, v3, :cond_5

    :cond_4
    if-eq v10, v8, :cond_5

    add-int/lit8 v10, v10, 0x1

    const/4 v3, -0x1

    goto :goto_0

    :cond_5
    const/4 v2, -0x1

    goto :goto_3

    :cond_6
    move v2, v3

    :goto_3
    if-ne v4, v2, :cond_8

    instance-of v2, v1, Ld0/l;

    if-eqz v2, :cond_7

    move-object v2, v1

    check-cast v2, Ld0/l;

    invoke-static {v6}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ld0/l;->q(I)V

    :cond_7
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/l$a;->e:LV/f;

    move-object/from16 v3, p3

    invoke-virtual {v2, v1, v3}, LV/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method private final m(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->e:LV/f;

    invoke-virtual {v0, p2, p1}, LV/f;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    instance-of p1, p2, LT/H;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->e:LV/f;

    invoke-virtual {p1, p2}, LV/f;->c(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->k:LV/f;

    invoke-virtual {p1, p2}, LV/f;->g(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->l:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->e:LV/f;

    invoke-virtual {v0}, LV/f;->b()V

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    invoke-virtual {v0}, Lo/H;->i()V

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->k:LV/f;

    invoke-virtual {v0}, LV/f;->b()V

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    invoke-virtual {v2, v1}, Lo/H;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/E;

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v3, v2, Lo/K;->b:[Ljava/lang/Object;

    iget-object v4, v2, Lo/K;->c:[I

    iget-object v2, v2, Lo/K;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    aget-wide v8, v2, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_3

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_1
    if-ge v12, v10, :cond_2

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_1

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v14, v3, v13

    aget v13, v4, v13

    invoke-direct {v0, v1, v14}, Landroidx/compose/runtime/snapshots/l$a;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    if-ne v10, v11, :cond_4

    :cond_3
    if-eq v7, v5, :cond_4

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final f()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->a:Lmh/l;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    invoke-virtual {v0}, Lo/Q;->g()Z

    move-result v0

    return v0
.end method

.method public final h()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/runtime/snapshots/l$a;->g:Lo/I;

    iget-object v2, v0, Landroidx/compose/runtime/snapshots/l$a;->a:Lmh/l;

    iget-object v3, v1, Lo/T;->b:[Ljava/lang/Object;

    iget-object v4, v1, Lo/T;->a:[J

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_3

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    aget-wide v8, v4, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_1
    if-ge v12, v10, :cond_1

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v3, v13

    invoke-interface {v2, v13}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    if-ne v10, v11, :cond_3

    :cond_2
    if-eq v7, v5, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lo/I;->m()V

    return-void
.end method

.method public final i(Ljava/lang/Object;Lmh/l;Lmh/a;)V
    .locals 5

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->b:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/runtime/snapshots/l$a;->c:Lo/E;

    iget v2, p0, Landroidx/compose/runtime/snapshots/l$a;->d:I

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->b:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    invoke-virtual {v3, p1}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/E;

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->c:Lo/E;

    iget p1, p0, Landroidx/compose/runtime/snapshots/l$a;->d:I

    const/4 v3, -0x1

    if-ne p1, v3, :cond_0

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->H()Landroidx/compose/runtime/snapshots/g;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result p1

    iput p1, p0, Landroidx/compose/runtime/snapshots/l$a;->d:I

    :cond_0
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->i:LT/I;

    invoke-static {}, LT/o1;->c()LV/b;

    move-result-object v3

    :try_start_0
    invoke-virtual {v3, p1}, LV/b;->b(Ljava/lang/Object;)Z

    sget-object p1, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    const/4 v4, 0x0

    invoke-virtual {p1, p2, v4, p3}, Landroidx/compose/runtime/snapshots/g$a;->h(Lmh/l;Lmh/l;Lmh/a;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, LV/b;->o()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v3, p1}, LV/b;->z(I)Ljava/lang/Object;

    iget-object p1, p0, Landroidx/compose/runtime/snapshots/l$a;->b:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Landroidx/compose/runtime/snapshots/l$a;->d(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->b:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/runtime/snapshots/l$a;->c:Lo/E;

    iput v2, p0, Landroidx/compose/runtime/snapshots/l$a;->d:I

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v3}, LV/b;->o()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v3, p2}, LV/b;->z(I)Ljava/lang/Object;

    throw p1
.end method

.method public final j(Ljava/util/Set;)Z
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/runtime/snapshots/l$a;->k:LV/f;

    iget-object v3, v0, Landroidx/compose/runtime/snapshots/l$a;->l:Ljava/util/HashMap;

    iget-object v4, v0, Landroidx/compose/runtime/snapshots/l$a;->e:LV/f;

    iget-object v5, v0, Landroidx/compose/runtime/snapshots/l$a;->g:Lo/I;

    instance-of v6, v1, LV/d;

    const-string v7, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    const/4 v12, 0x7

    const/4 v13, 0x2

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v18, 0x0

    if-eqz v6, :cond_20

    check-cast v1, LV/d;

    invoke-virtual {v1}, LV/d;->b()Lo/T;

    move-result-object v1

    iget-object v6, v1, Lo/T;->b:[Ljava/lang/Object;

    iget-object v1, v1, Lo/T;->a:[J

    array-length v9, v1

    sub-int/2addr v9, v13

    if-ltz v9, :cond_1f

    move/from16 v13, v18

    move/from16 v20, v13

    :goto_0
    aget-wide v10, v1, v13

    move/from16 p1, v9

    not-long v8, v10

    shl-long/2addr v8, v12

    and-long/2addr v8, v10

    and-long/2addr v8, v14

    cmp-long v8, v8, v14

    if-eqz v8, :cond_1e

    sub-int v8, v13, p1

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move/from16 v9, v18

    :goto_1
    if-ge v9, v8, :cond_1d

    const-wide/16 v21, 0xff

    and-long v23, v10, v21

    const-wide/16 v16, 0x80

    cmp-long v23, v23, v16

    if-gez v23, :cond_1c

    shl-int/lit8 v23, v13, 0x3

    add-int v23, v23, v9

    aget-object v14, v6, v23

    instance-of v15, v14, Ld0/l;

    if-eqz v15, :cond_0

    move-object v15, v14

    check-cast v15, Ld0/l;

    const/16 v19, 0x2

    invoke-static/range {v19 .. v19}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v12

    invoke-virtual {v15, v12}, Ld0/l;->p(I)Z

    move-result v12

    if-nez v12, :cond_0

    goto/16 :goto_13

    :cond_0
    invoke-virtual {v2, v14}, LV/f;->c(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-virtual {v2}, LV/f;->d()Lo/H;

    move-result-object v12

    invoke-virtual {v12, v14}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_15

    instance-of v15, v12, Lo/I;

    if-eqz v15, :cond_e

    check-cast v12, Lo/I;

    iget-object v15, v12, Lo/T;->b:[Ljava/lang/Object;

    iget-object v12, v12, Lo/T;->a:[J

    move-object/from16 v26, v1

    array-length v1, v12

    const/16 v19, 0x2

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_c

    move-object/from16 v27, v6

    move/from16 v28, v8

    move/from16 v29, v9

    move/from16 v6, v18

    :goto_2
    aget-wide v8, v12, v6

    move-object/from16 v31, v12

    move/from16 v30, v13

    not-long v12, v8

    const/16 v23, 0x7

    shl-long v12, v12, v23

    and-long/2addr v12, v8

    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v12, v24

    cmp-long v12, v12, v24

    if-eqz v12, :cond_b

    sub-int v12, v6, v1

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move/from16 v13, v18

    :goto_3
    if-ge v13, v12, :cond_a

    const-wide/16 v21, 0xff

    and-long v32, v8, v21

    const-wide/16 v16, 0x80

    cmp-long v32, v32, v16

    if-gez v32, :cond_9

    shl-int/lit8 v32, v6, 0x3

    add-int v32, v32, v13

    aget-object v32, v15, v32

    move-object/from16 v33, v15

    move-object/from16 v15, v32

    check-cast v15, LT/H;

    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v32, v7

    invoke-virtual {v3, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v15}, LT/H;->d()LT/n1;

    move-result-object v34

    if-nez v34, :cond_1

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object v34

    :cond_1
    move-object/from16 v35, v2

    move-object/from16 v2, v34

    invoke-interface {v15}, LT/H;->o()LT/H$a;

    move-result-object v34

    move-wide/from16 v36, v10

    invoke-interface/range {v34 .. v34}, LT/H$a;->a()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v2, v10, v7}, LT/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v4}, LV/f;->d()Lo/H;

    move-result-object v2

    invoke-virtual {v2, v15}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    instance-of v7, v2, Lo/I;

    if-eqz v7, :cond_6

    check-cast v2, Lo/I;

    iget-object v7, v2, Lo/T;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lo/T;->a:[J

    array-length v10, v2

    const/4 v11, 0x2

    sub-int/2addr v10, v11

    if-ltz v10, :cond_5

    move-object/from16 v34, v14

    move/from16 v11, v18

    :goto_4
    aget-wide v14, v2, v11

    move-object/from16 v39, v2

    move-object/from16 v38, v3

    not-long v2, v14

    const/16 v23, 0x7

    shl-long v2, v2, v23

    and-long/2addr v2, v14

    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v24

    cmp-long v2, v2, v24

    if-eqz v2, :cond_4

    sub-int v2, v11, v10

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    move/from16 v3, v18

    :goto_5
    if-ge v3, v2, :cond_3

    const-wide/16 v21, 0xff

    and-long v40, v14, v21

    const-wide/16 v16, 0x80

    cmp-long v40, v40, v16

    if-gez v40, :cond_2

    shl-int/lit8 v20, v11, 0x3

    add-int v20, v20, v3

    move-object/from16 v40, v4

    aget-object v4, v7, v20

    invoke-virtual {v5, v4}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v4, 0x8

    const/16 v20, 0x1

    goto :goto_6

    :cond_2
    move-object/from16 v40, v4

    const/16 v4, 0x8

    :goto_6
    shr-long/2addr v14, v4

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v4, v40

    goto :goto_5

    :cond_3
    move-object/from16 v40, v4

    const/16 v4, 0x8

    if-ne v2, v4, :cond_8

    goto :goto_7

    :cond_4
    move-object/from16 v40, v4

    :goto_7
    if-eq v11, v10, :cond_8

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v3, v38

    move-object/from16 v2, v39

    move-object/from16 v4, v40

    goto :goto_4

    :cond_5
    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v34, v14

    goto :goto_8

    :cond_6
    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v34, v14

    invoke-virtual {v5, v2}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v20, 0x1

    goto :goto_8

    :cond_7
    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v34, v14

    iget-object v2, v0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    invoke-virtual {v2, v15}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_8
    :goto_8
    const/16 v2, 0x8

    goto :goto_9

    :cond_9
    move-object/from16 v35, v2

    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v32, v7

    move-wide/from16 v36, v10

    move-object/from16 v34, v14

    move-object/from16 v33, v15

    goto :goto_8

    :goto_9
    shr-long/2addr v8, v2

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v7, v32

    move-object/from16 v15, v33

    move-object/from16 v14, v34

    move-object/from16 v2, v35

    move-wide/from16 v10, v36

    move-object/from16 v3, v38

    move-object/from16 v4, v40

    goto/16 :goto_3

    :cond_a
    move-object/from16 v35, v2

    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v32, v7

    move-wide/from16 v36, v10

    move-object/from16 v34, v14

    move-object/from16 v33, v15

    const/16 v2, 0x8

    if-ne v12, v2, :cond_d

    goto :goto_a

    :cond_b
    move-object/from16 v35, v2

    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v32, v7

    move-wide/from16 v36, v10

    move-object/from16 v34, v14

    move-object/from16 v33, v15

    :goto_a
    if-eq v6, v1, :cond_d

    add-int/lit8 v6, v6, 0x1

    move/from16 v13, v30

    move-object/from16 v12, v31

    move-object/from16 v7, v32

    move-object/from16 v15, v33

    move-object/from16 v14, v34

    move-object/from16 v2, v35

    move-wide/from16 v10, v36

    move-object/from16 v3, v38

    move-object/from16 v4, v40

    goto/16 :goto_2

    :cond_c
    move-object/from16 v35, v2

    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v27, v6

    move-object/from16 v32, v7

    move/from16 v28, v8

    move/from16 v29, v9

    move-wide/from16 v36, v10

    move/from16 v30, v13

    move-object/from16 v34, v14

    :cond_d
    move-object/from16 v2, v38

    goto/16 :goto_e

    :cond_e
    move-object/from16 v26, v1

    move-object/from16 v35, v2

    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v27, v6

    move-object/from16 v32, v7

    move/from16 v28, v8

    move/from16 v29, v9

    move-wide/from16 v36, v10

    move/from16 v30, v13

    move-object/from16 v34, v14

    check-cast v12, LT/H;

    move-object/from16 v2, v38

    invoke-virtual {v2, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v12}, LT/H;->d()LT/n1;

    move-result-object v3

    if-nez v3, :cond_f

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object v3

    :cond_f
    invoke-interface {v12}, LT/H;->o()LT/H$a;

    move-result-object v4

    invoke-interface {v4}, LT/H$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4, v1}, LT/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual/range {v40 .. v40}, LV/f;->d()Lo/H;

    move-result-object v1

    invoke-virtual {v1, v12}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_16

    instance-of v3, v1, Lo/I;

    if-eqz v3, :cond_13

    check-cast v1, Lo/I;

    iget-object v3, v1, Lo/T;->b:[Ljava/lang/Object;

    iget-object v1, v1, Lo/T;->a:[J

    array-length v4, v1

    const/4 v6, 0x2

    sub-int/2addr v4, v6

    if-ltz v4, :cond_16

    move/from16 v6, v18

    :goto_b
    aget-wide v7, v1, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_12

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move/from16 v10, v18

    :goto_c
    if-ge v10, v9, :cond_11

    const-wide/16 v11, 0xff

    and-long v13, v7, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v13, v11

    if-gez v13, :cond_10

    shl-int/lit8 v11, v6, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    invoke-virtual {v5, v11}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v11, 0x8

    const/16 v20, 0x1

    goto :goto_d

    :cond_10
    const/16 v11, 0x8

    :goto_d
    shr-long/2addr v7, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    :cond_11
    const/16 v11, 0x8

    if-ne v9, v11, :cond_16

    :cond_12
    if-eq v6, v4, :cond_16

    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_13
    invoke-virtual {v5, v1}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v20, 0x1

    goto :goto_e

    :cond_14
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    invoke-virtual {v1, v12}, LV/b;->b(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_15
    move-object/from16 v26, v1

    move-object/from16 v35, v2

    move-object v2, v3

    move-object/from16 v40, v4

    move-object/from16 v27, v6

    move-object/from16 v32, v7

    move/from16 v28, v8

    move/from16 v29, v9

    move-wide/from16 v36, v10

    move/from16 v30, v13

    move-object/from16 v34, v14

    :cond_16
    :goto_e
    invoke-virtual/range {v40 .. v40}, LV/f;->d()Lo/H;

    move-result-object v1

    move-object/from16 v3, v34

    invoke-virtual {v1, v3}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1b

    instance-of v3, v1, Lo/I;

    if-eqz v3, :cond_1a

    check-cast v1, Lo/I;

    iget-object v3, v1, Lo/T;->b:[Ljava/lang/Object;

    iget-object v1, v1, Lo/T;->a:[J

    array-length v4, v1

    const/4 v6, 0x2

    sub-int/2addr v4, v6

    if-ltz v4, :cond_1b

    move/from16 v6, v18

    :goto_f
    aget-wide v7, v1, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_19

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move/from16 v10, v18

    :goto_10
    if-ge v10, v9, :cond_18

    const-wide/16 v11, 0xff

    and-long v13, v7, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v13, v11

    if-gez v13, :cond_17

    shl-int/lit8 v11, v6, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    invoke-virtual {v5, v11}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v11, 0x8

    const/16 v20, 0x1

    goto :goto_11

    :cond_17
    const/16 v11, 0x8

    :goto_11
    shr-long/2addr v7, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    :cond_18
    const/16 v11, 0x8

    if-ne v9, v11, :cond_1b

    :cond_19
    if-eq v6, v4, :cond_1b

    add-int/lit8 v6, v6, 0x1

    goto :goto_f

    :cond_1a
    invoke-virtual {v5, v1}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v20, 0x1

    :cond_1b
    :goto_12
    const/16 v1, 0x8

    goto :goto_14

    :cond_1c
    :goto_13
    move-object/from16 v26, v1

    move-object/from16 v35, v2

    move-object v2, v3

    move-object/from16 v40, v4

    move-object/from16 v27, v6

    move-object/from16 v32, v7

    move/from16 v28, v8

    move/from16 v29, v9

    move-wide/from16 v36, v10

    move/from16 v30, v13

    goto :goto_12

    :goto_14
    shr-long v10, v36, v1

    add-int/lit8 v9, v29, 0x1

    move-object v3, v2

    move-object/from16 v1, v26

    move-object/from16 v6, v27

    move/from16 v8, v28

    move/from16 v13, v30

    move-object/from16 v7, v32

    move-object/from16 v2, v35

    move-object/from16 v4, v40

    const/4 v12, 0x7

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto/16 :goto_1

    :cond_1d
    move-object/from16 v26, v1

    move-object/from16 v35, v2

    move-object v2, v3

    move-object/from16 v40, v4

    move-object/from16 v27, v6

    move-object/from16 v32, v7

    move/from16 v30, v13

    const/16 v1, 0x8

    if-ne v8, v1, :cond_3e

    move/from16 v9, p1

    move/from16 v1, v30

    goto :goto_15

    :cond_1e
    move-object/from16 v26, v1

    move-object/from16 v35, v2

    move-object v2, v3

    move-object/from16 v40, v4

    move-object/from16 v27, v6

    move-object/from16 v32, v7

    move/from16 v9, p1

    move v1, v13

    :goto_15
    if-eq v1, v9, :cond_3e

    add-int/lit8 v13, v1, 0x1

    move-object v3, v2

    move-object/from16 v1, v26

    move-object/from16 v6, v27

    move-object/from16 v7, v32

    move-object/from16 v2, v35

    move-object/from16 v4, v40

    const/4 v12, 0x7

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto/16 :goto_0

    :cond_1f
    move/from16 v20, v18

    goto/16 :goto_29

    :cond_20
    move-object/from16 v35, v2

    move-object v2, v3

    move-object/from16 v40, v4

    move-object/from16 v32, v7

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v20, v18

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ld0/l;

    if-eqz v4, :cond_22

    move-object v4, v3

    check-cast v4, Ld0/l;

    const/4 v6, 0x2

    invoke-static {v6}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v7

    invoke-virtual {v4, v7}, Ld0/l;->p(I)Z

    move-result v4

    if-nez v4, :cond_22

    move-object/from16 p1, v1

    move-object v1, v2

    move-object/from16 v15, v32

    :cond_21
    const/16 v6, 0x8

    const/4 v12, 0x7

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-wide/16 v16, 0x80

    const-wide/16 v21, 0xff

    goto/16 :goto_28

    :cond_22
    move-object/from16 v4, v35

    invoke-virtual {v4, v3}, LV/f;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-virtual {v4}, LV/f;->d()Lo/H;

    move-result-object v6

    invoke-virtual {v6, v3}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_37

    instance-of v7, v6, Lo/I;

    if-eqz v7, :cond_30

    check-cast v6, Lo/I;

    iget-object v7, v6, Lo/T;->b:[Ljava/lang/Object;

    iget-object v6, v6, Lo/T;->a:[J

    array-length v8, v6

    const/4 v9, 0x2

    sub-int/2addr v8, v9

    if-ltz v8, :cond_2e

    move/from16 v9, v18

    :goto_17
    aget-wide v10, v6, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_2d

    sub-int v12, v9, v8

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move/from16 v13, v18

    :goto_18
    if-ge v13, v12, :cond_2c

    const-wide/16 v14, 0xff

    and-long v26, v10, v14

    const-wide/16 v14, 0x80

    cmp-long v26, v26, v14

    if-gez v26, :cond_2b

    shl-int/lit8 v14, v9, 0x3

    add-int/2addr v14, v13

    aget-object v14, v7, v14

    check-cast v14, LT/H;

    move-object/from16 v15, v32

    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 p1, v1

    invoke-virtual {v2, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v14}, LT/H;->d()LT/n1;

    move-result-object v26

    if-nez v26, :cond_23

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object v26

    :cond_23
    move-object/from16 v35, v4

    move-object/from16 v4, v26

    invoke-interface {v14}, LT/H;->o()LT/H$a;

    move-result-object v26

    move-object/from16 v27, v6

    invoke-interface/range {v26 .. v26}, LT/H$a;->a()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v6, v1}, LT/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    invoke-virtual/range {v40 .. v40}, LV/f;->d()Lo/H;

    move-result-object v1

    invoke-virtual {v1, v14}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_27

    instance-of v4, v1, Lo/I;

    if-eqz v4, :cond_28

    check-cast v1, Lo/I;

    iget-object v4, v1, Lo/T;->b:[Ljava/lang/Object;

    iget-object v1, v1, Lo/T;->a:[J

    array-length v6, v1

    const/4 v14, 0x2

    sub-int/2addr v6, v14

    if-ltz v6, :cond_27

    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move/from16 v14, v18

    :goto_19
    aget-wide v2, v1, v14

    move-object/from16 v28, v7

    move/from16 v29, v8

    not-long v7, v2

    const/16 v23, 0x7

    shl-long v7, v7, v23

    and-long/2addr v7, v2

    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v7, v7, v24

    cmp-long v7, v7, v24

    if-eqz v7, :cond_26

    sub-int v7, v14, v6

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move/from16 v8, v18

    :goto_1a
    if-ge v8, v7, :cond_25

    const-wide/16 v21, 0xff

    and-long v30, v2, v21

    const-wide/16 v16, 0x80

    cmp-long v30, v30, v16

    if-gez v30, :cond_24

    shl-int/lit8 v20, v14, 0x3

    add-int v20, v20, v8

    move-object/from16 v30, v1

    aget-object v1, v4, v20

    invoke-virtual {v5, v1}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v1, 0x8

    const/16 v20, 0x1

    goto :goto_1b

    :cond_24
    move-object/from16 v30, v1

    const/16 v1, 0x8

    :goto_1b
    shr-long/2addr v2, v1

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v30

    goto :goto_1a

    :cond_25
    move-object/from16 v30, v1

    const/16 v1, 0x8

    if-ne v7, v1, :cond_2a

    goto :goto_1c

    :cond_26
    move-object/from16 v30, v1

    :goto_1c
    if-eq v14, v6, :cond_2a

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v7, v28

    move/from16 v8, v29

    move-object/from16 v1, v30

    goto :goto_19

    :cond_27
    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v28, v7

    move/from16 v29, v8

    goto :goto_1d

    :cond_28
    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v28, v7

    move/from16 v29, v8

    invoke-virtual {v5, v1}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v20, 0x1

    goto :goto_1d

    :cond_29
    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v28, v7

    move/from16 v29, v8

    iget-object v1, v0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    invoke-virtual {v1, v14}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_2a
    :goto_1d
    const/16 v1, 0x8

    goto :goto_1e

    :cond_2b
    move-object/from16 p1, v1

    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v35, v4

    move-object/from16 v27, v6

    move-object/from16 v28, v7

    move/from16 v29, v8

    move-object/from16 v15, v32

    goto :goto_1d

    :goto_1e
    shr-long/2addr v10, v1

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p1

    move-object/from16 v32, v15

    move-object/from16 v3, v26

    move-object/from16 v6, v27

    move-object/from16 v7, v28

    move/from16 v8, v29

    move-object/from16 v4, v35

    move-object/from16 v2, v38

    goto/16 :goto_18

    :cond_2c
    move-object/from16 p1, v1

    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v35, v4

    move-object/from16 v27, v6

    move-object/from16 v28, v7

    move/from16 v29, v8

    move-object/from16 v15, v32

    const/16 v1, 0x8

    if-ne v12, v1, :cond_2f

    move/from16 v8, v29

    goto :goto_1f

    :cond_2d
    move-object/from16 p1, v1

    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v35, v4

    move-object/from16 v27, v6

    move-object/from16 v28, v7

    move-object/from16 v15, v32

    :goto_1f
    if-eq v9, v8, :cond_2f

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v32, v15

    move-object/from16 v3, v26

    move-object/from16 v6, v27

    move-object/from16 v7, v28

    move-object/from16 v4, v35

    move-object/from16 v2, v38

    goto/16 :goto_17

    :cond_2e
    move-object/from16 p1, v1

    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v35, v4

    move-object/from16 v15, v32

    :cond_2f
    move-object/from16 v1, v38

    goto/16 :goto_23

    :cond_30
    move-object/from16 p1, v1

    move-object/from16 v38, v2

    move-object/from16 v26, v3

    move-object/from16 v35, v4

    move-object/from16 v15, v32

    check-cast v6, LT/H;

    move-object/from16 v1, v38

    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v6}, LT/H;->d()LT/n1;

    move-result-object v3

    if-nez v3, :cond_31

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object v3

    :cond_31
    invoke-interface {v6}, LT/H;->o()LT/H$a;

    move-result-object v4

    invoke-interface {v4}, LT/H$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4, v2}, LT/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_36

    invoke-virtual/range {v40 .. v40}, LV/f;->d()Lo/H;

    move-result-object v2

    invoke-virtual {v2, v6}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_38

    instance-of v3, v2, Lo/I;

    if-eqz v3, :cond_35

    check-cast v2, Lo/I;

    iget-object v3, v2, Lo/T;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lo/T;->a:[J

    array-length v4, v2

    const/4 v6, 0x2

    sub-int/2addr v4, v6

    if-ltz v4, :cond_38

    move/from16 v6, v18

    :goto_20
    aget-wide v7, v2, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_34

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move/from16 v10, v18

    :goto_21
    if-ge v10, v9, :cond_33

    const-wide/16 v11, 0xff

    and-long v13, v7, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v13, v11

    if-gez v13, :cond_32

    shl-int/lit8 v11, v6, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    invoke-virtual {v5, v11}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v11, 0x8

    const/16 v20, 0x1

    goto :goto_22

    :cond_32
    const/16 v11, 0x8

    :goto_22
    shr-long/2addr v7, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_21

    :cond_33
    const/16 v11, 0x8

    if-ne v9, v11, :cond_38

    :cond_34
    if-eq v6, v4, :cond_38

    add-int/lit8 v6, v6, 0x1

    goto :goto_20

    :cond_35
    invoke-virtual {v5, v2}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v20, 0x1

    goto :goto_23

    :cond_36
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    invoke-virtual {v2, v6}, LV/b;->b(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_37
    move-object/from16 p1, v1

    move-object v1, v2

    move-object/from16 v26, v3

    move-object/from16 v35, v4

    move-object/from16 v15, v32

    :cond_38
    :goto_23
    invoke-virtual/range {v40 .. v40}, LV/f;->d()Lo/H;

    move-result-object v2

    move-object/from16 v3, v26

    invoke-virtual {v2, v3}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_21

    instance-of v3, v2, Lo/I;

    if-eqz v3, :cond_3c

    check-cast v2, Lo/I;

    iget-object v3, v2, Lo/T;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lo/T;->a:[J

    array-length v4, v2

    const/4 v6, 0x2

    sub-int/2addr v4, v6

    if-ltz v4, :cond_21

    move/from16 v7, v18

    :goto_24
    aget-wide v8, v2, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v13

    cmp-long v10, v10, v13

    if-eqz v10, :cond_3b

    sub-int v10, v7, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move/from16 v11, v18

    :goto_25
    if-ge v11, v10, :cond_3a

    const-wide/16 v21, 0xff

    and-long v23, v8, v21

    const-wide/16 v16, 0x80

    cmp-long v19, v23, v16

    if-gez v19, :cond_39

    shl-int/lit8 v19, v7, 0x3

    add-int v19, v19, v11

    aget-object v6, v3, v19

    invoke-virtual {v5, v6}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v6, 0x8

    const/16 v20, 0x1

    goto :goto_26

    :cond_39
    const/16 v6, 0x8

    :goto_26
    shr-long/2addr v8, v6

    add-int/lit8 v11, v11, 0x1

    const/4 v6, 0x2

    goto :goto_25

    :cond_3a
    const/16 v6, 0x8

    const-wide/16 v16, 0x80

    const-wide/16 v21, 0xff

    if-ne v10, v6, :cond_3d

    goto :goto_27

    :cond_3b
    const/16 v6, 0x8

    const-wide/16 v16, 0x80

    const-wide/16 v21, 0xff

    :goto_27
    if-eq v7, v4, :cond_3d

    add-int/lit8 v7, v7, 0x1

    const/4 v6, 0x2

    goto :goto_24

    :cond_3c
    const/16 v6, 0x8

    const/4 v12, 0x7

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-wide/16 v16, 0x80

    const-wide/16 v21, 0xff

    invoke-virtual {v5, v2}, Lo/I;->h(Ljava/lang/Object;)Z

    const/16 v20, 0x1

    :cond_3d
    :goto_28
    move-object v2, v1

    move-object/from16 v32, v15

    move-object/from16 v1, p1

    goto/16 :goto_16

    :cond_3e
    :goto_29
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    invoke-virtual {v1}, LV/b;->u()Z

    move-result v1

    if-eqz v1, :cond_41

    iget-object v1, v0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_40

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    :goto_2a
    aget-object v3, v1, v18

    check-cast v3, LT/H;

    invoke-virtual {v0, v3}, Landroidx/compose/runtime/snapshots/l$a;->o(LT/H;)V

    const/4 v3, 0x1

    add-int/lit8 v4, v18, 0x1

    if-lt v4, v2, :cond_3f

    goto :goto_2b

    :cond_3f
    move/from16 v18, v4

    goto :goto_2a

    :cond_40
    :goto_2b
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/l$a;->h:LV/b;

    invoke-virtual {v1}, LV/b;->h()V

    :cond_41
    return v20
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/l$a;->b:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v1, p0, Landroidx/compose/runtime/snapshots/l$a;->d:I

    iget-object v2, p0, Landroidx/compose/runtime/snapshots/l$a;->c:Lo/E;

    if-nez v2, :cond_0

    new-instance v2, Lo/E;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Lo/E;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Landroidx/compose/runtime/snapshots/l$a;->c:Lo/E;

    iget-object v3, p0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    invoke-virtual {v3, v0, v2}, Lo/H;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v3, LYg/J;->a:LYg/J;

    :cond_0
    invoke-direct {p0, p1, v1, v0, v2}, Landroidx/compose/runtime/snapshots/l$a;->l(Ljava/lang/Object;ILjava/lang/Object;Lo/E;)V

    return-void
.end method

.method public final n(Lmh/l;)V
    .locals 33

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    iget-object v2, v1, Lo/Q;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_a

    const/4 v5, 0x0

    :goto_0
    aget-wide v6, v2, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v11

    cmp-long v8, v8, v11

    if-eqz v8, :cond_9

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v8, :cond_8

    const-wide/16 v14, 0xff

    and-long v16, v6, v14

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_7

    shl-int/lit8 v16, v5, 0x3

    add-int v4, v16, v13

    iget-object v14, v1, Lo/Q;->b:[Ljava/lang/Object;

    aget-object v14, v14, v4

    iget-object v15, v1, Lo/Q;->c:[Ljava/lang/Object;

    aget-object v15, v15, v4

    check-cast v15, Lo/E;

    move-object/from16 v9, p1

    invoke-interface {v9, v14}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/lang/Boolean;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    if-eqz v23, :cond_4

    iget-object v11, v15, Lo/K;->b:[Ljava/lang/Object;

    iget-object v12, v15, Lo/K;->c:[I

    iget-object v15, v15, Lo/K;->a:[J

    array-length v10, v15

    add-int/lit8 v10, v10, -0x2

    move-object/from16 v26, v2

    if-ltz v10, :cond_3

    move/from16 v27, v8

    const/4 v2, 0x0

    :goto_2
    aget-wide v8, v15, v2

    move/from16 v28, v5

    move-wide/from16 v29, v6

    not-long v5, v8

    const/4 v7, 0x7

    shl-long/2addr v5, v7

    and-long/2addr v5, v8

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v5, v5, v23

    cmp-long v5, v5, v23

    if-eqz v5, :cond_2

    sub-int v5, v2, v10

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v6, 0x8

    rsub-int/lit8 v5, v5, 0x8

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_1

    const-wide/16 v20, 0xff

    and-long v31, v8, v20

    cmp-long v25, v31, v18

    if-gez v25, :cond_0

    shl-int/lit8 v25, v2, 0x3

    add-int v25, v25, v6

    aget-object v7, v11, v25

    aget v25, v12, v25

    invoke-direct {v0, v14, v7}, Landroidx/compose/runtime/snapshots/l$a;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/16 v7, 0x8

    shr-long/2addr v8, v7

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x7

    goto :goto_3

    :cond_1
    const/16 v7, 0x8

    const-wide/16 v20, 0xff

    if-ne v5, v7, :cond_5

    goto :goto_4

    :cond_2
    const-wide/16 v20, 0xff

    :goto_4
    if-eq v2, v10, :cond_5

    add-int/lit8 v2, v2, 0x1

    move/from16 v5, v28

    move-wide/from16 v6, v29

    goto :goto_2

    :cond_3
    move/from16 v28, v5

    move-wide/from16 v29, v6

    move/from16 v27, v8

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_5

    :cond_4
    move-object/from16 v26, v2

    move/from16 v28, v5

    move-wide/from16 v29, v6

    move/from16 v27, v8

    move-wide/from16 v23, v11

    :cond_5
    :goto_5
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1, v4}, Lo/H;->q(I)Ljava/lang/Object;

    :cond_6
    const/16 v2, 0x8

    goto :goto_6

    :cond_7
    move-object/from16 v26, v2

    move/from16 v28, v5

    move-wide/from16 v29, v6

    move/from16 v27, v8

    move-wide/from16 v23, v11

    move v2, v9

    :goto_6
    shr-long v6, v29, v2

    add-int/lit8 v13, v13, 0x1

    move v9, v2

    move-wide/from16 v11, v23

    move-object/from16 v2, v26

    move/from16 v8, v27

    move/from16 v5, v28

    const/4 v10, 0x7

    goto/16 :goto_1

    :cond_8
    move-object/from16 v26, v2

    move/from16 v28, v5

    move v2, v9

    move v9, v8

    if-ne v9, v2, :cond_a

    move/from16 v4, v28

    goto :goto_7

    :cond_9
    move-object/from16 v26, v2

    move v4, v5

    :goto_7
    if-eq v4, v3, :cond_a

    add-int/lit8 v5, v4, 0x1

    move-object/from16 v2, v26

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public final o(LT/H;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    iget-object v3, v0, Landroidx/compose/runtime/snapshots/l$a;->f:Lo/H;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->H()Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result v4

    iget-object v5, v0, Landroidx/compose/runtime/snapshots/l$a;->e:LV/f;

    invoke-virtual {v5}, LV/f;->d()Lo/H;

    move-result-object v5

    invoke-virtual {v5, v1}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_6

    instance-of v6, v5, Lo/I;

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v6, :cond_4

    check-cast v5, Lo/I;

    iget-object v6, v5, Lo/T;->b:[Ljava/lang/Object;

    iget-object v5, v5, Lo/T;->a:[J

    array-length v9, v5

    add-int/lit8 v9, v9, -0x2

    if-ltz v9, :cond_6

    move v10, v8

    :goto_0
    aget-wide v11, v5, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_3

    sub-int v13, v10, v9

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    move v15, v8

    :goto_1
    if-ge v15, v13, :cond_2

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_1

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    aget-object v14, v6, v16

    invoke-virtual {v3, v14}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lo/E;

    move-object/from16 v18, v5

    if-nez v16, :cond_0

    new-instance v5, Lo/E;

    invoke-direct {v5, v8, v2, v7}, Lo/E;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v14, v5}, Lo/H;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v16, LYg/J;->a:LYg/J;

    goto :goto_2

    :cond_0
    move-object/from16 v5, v16

    :goto_2
    invoke-direct {v0, v1, v4, v14, v5}, Landroidx/compose/runtime/snapshots/l$a;->l(Ljava/lang/Object;ILjava/lang/Object;Lo/E;)V

    const/16 v5, 0x8

    goto :goto_3

    :cond_1
    move-object/from16 v18, v5

    move v5, v14

    :goto_3
    shr-long/2addr v11, v5

    add-int/2addr v15, v2

    move v14, v5

    move-object/from16 v5, v18

    goto :goto_1

    :cond_2
    move-object/from16 v18, v5

    move v5, v14

    if-ne v13, v5, :cond_6

    goto :goto_4

    :cond_3
    move-object/from16 v18, v5

    :goto_4
    if-eq v10, v9, :cond_6

    add-int/2addr v10, v2

    move-object/from16 v5, v18

    goto :goto_0

    :cond_4
    invoke-virtual {v3, v5}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo/E;

    if-nez v6, :cond_5

    new-instance v6, Lo/E;

    invoke-direct {v6, v8, v2, v7}, Lo/E;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v5, v6}, Lo/H;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, LYg/J;->a:LYg/J;

    :cond_5
    invoke-direct {v0, v1, v4, v5, v6}, Landroidx/compose/runtime/snapshots/l$a;->l(Ljava/lang/Object;ILjava/lang/Object;Lo/E;)V

    :cond_6
    return-void
.end method
