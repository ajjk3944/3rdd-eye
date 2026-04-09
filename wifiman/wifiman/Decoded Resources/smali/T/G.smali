.class final LT/G;
.super Ld0/l;
.source "SourceFile"

# interfaces
.implements LT/H;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/G$a;
    }
.end annotation


# instance fields
.field private final b:Lmh/a;

.field private final c:LT/n1;

.field private d:LT/G$a;


# direct methods
.method public constructor <init>(Lmh/a;LT/n1;)V
    .locals 0

    invoke-direct {p0}, Ld0/l;-><init>()V

    iput-object p1, p0, LT/G;->b:Lmh/a;

    iput-object p2, p0, LT/G;->c:LT/n1;

    new-instance p1, LT/G$a;

    invoke-direct {p1}, LT/G$a;-><init>()V

    iput-object p1, p0, LT/G;->d:LT/G$a;

    return-void
.end method

.method private final t(LT/G$a;Landroidx/compose/runtime/snapshots/g;ZLmh/a;)LT/G$a;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, LT/G$a;->k(LT/H;Landroidx/compose/runtime/snapshots/g;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_b

    if-eqz p3, :cond_a

    invoke-static {}, LT/o1;->c()LV/b;

    move-result-object v3

    invoke-virtual {v3}, LV/b;->o()I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v7

    move v8, v5

    :cond_0
    aget-object v9, v7, v8

    check-cast v9, LT/I;

    invoke-interface {v9, v1}, LT/I;->b(LT/H;)V

    add-int/2addr v8, v4

    if-lt v8, v6, :cond_0

    :cond_1
    :try_start_0
    invoke-virtual/range {p1 .. p1}, LT/G$a;->b()Lo/K;

    move-result-object v6

    invoke-static {}, LT/p1;->a()LT/u1;

    move-result-object v7

    invoke-virtual {v7}, LT/u1;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb0/d;

    if-nez v7, :cond_2

    new-instance v7, Lb0/d;

    invoke-direct {v7, v5}, Lb0/d;-><init>(I)V

    invoke-static {}, LT/p1;->a()LT/u1;

    move-result-object v8

    invoke-virtual {v8, v7}, LT/u1;->b(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_2
    :goto_0
    invoke-virtual {v7}, Lb0/d;->a()I

    move-result v8

    iget-object v9, v6, Lo/K;->b:[Ljava/lang/Object;

    iget-object v10, v6, Lo/K;->c:[I

    iget-object v6, v6, Lo/K;->a:[J

    array-length v11, v6

    add-int/lit8 v11, v11, -0x2

    if-ltz v11, :cond_7

    move v12, v5

    :goto_1
    aget-wide v13, v6, v12

    move-object/from16 p3, v6

    not-long v5, v13

    const/16 v16, 0x7

    shl-long v5, v5, v16

    and-long/2addr v5, v13

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v5, v5, v16

    cmp-long v5, v5, v16

    if-eqz v5, :cond_6

    sub-int v5, v12, v11

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v6, 0x8

    rsub-int/lit8 v5, v5, 0x8

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v5, :cond_5

    const-wide/16 v17, 0xff

    and-long v17, v13, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_4

    shl-int/lit8 v17, v12, 0x3

    add-int v17, v17, v15

    aget-object v18, v9, v17

    aget v17, v10, v17

    move-object/from16 v4, v18

    check-cast v4, Ld0/k;

    add-int v6, v8, v17

    invoke-virtual {v7, v6}, Lb0/d;->b(I)V

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v6, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/16 v4, 0x8

    goto :goto_3

    :cond_4
    move v4, v6

    :goto_3
    shr-long/2addr v13, v4

    const/4 v6, 0x1

    add-int/2addr v15, v6

    move/from16 v21, v6

    move v6, v4

    move/from16 v4, v21

    goto :goto_2

    :cond_5
    move/from16 v21, v6

    move v6, v4

    move/from16 v4, v21

    if-ne v5, v4, :cond_7

    goto :goto_4

    :cond_6
    move v6, v4

    :goto_4
    if-eq v12, v11, :cond_7

    add-int/2addr v12, v6

    move v4, v6

    const/4 v5, 0x0

    move-object/from16 v6, p3

    goto :goto_1

    :cond_7
    invoke-virtual {v7, v8}, Lb0/d;->b(I)V

    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_a

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x0

    :cond_8
    aget-object v4, v3, v5

    check-cast v4, LT/I;

    invoke-interface {v4, v1}, LT/I;->a(LT/H;)V

    const/4 v4, 0x1

    add-int/2addr v5, v4

    if-lt v5, v2, :cond_8

    goto :goto_7

    :goto_5
    invoke-virtual {v3}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_9

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x0

    :goto_6
    aget-object v4, v3, v5

    check-cast v4, LT/I;

    invoke-interface {v4, v1}, LT/I;->a(LT/H;)V

    const/4 v4, 0x1

    add-int/2addr v5, v4

    if-ge v5, v2, :cond_9

    goto :goto_6

    :cond_9
    throw v0

    :cond_a
    :goto_7
    return-object v0

    :cond_b
    new-instance v2, Lo/E;

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v4, v3}, Lo/E;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LT/p1;->a()LT/u1;

    move-result-object v4

    invoke-virtual {v4}, LT/u1;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb0/d;

    if-nez v4, :cond_c

    new-instance v4, Lb0/d;

    invoke-direct {v4, v5}, Lb0/d;-><init>(I)V

    invoke-static {}, LT/p1;->a()LT/u1;

    move-result-object v6

    invoke-virtual {v6, v4}, LT/u1;->b(Ljava/lang/Object;)V

    :cond_c
    invoke-virtual {v4}, Lb0/d;->a()I

    move-result v6

    invoke-static {}, LT/o1;->c()LV/b;

    move-result-object v7

    invoke-virtual {v7}, LV/b;->o()I

    move-result v8

    if-lez v8, :cond_e

    invoke-virtual {v7}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v9

    move/from16 v16, v5

    :goto_8
    aget-object v10, v9, v16

    check-cast v10, LT/I;

    invoke-interface {v10, v1}, LT/I;->b(LT/H;)V

    const/4 v10, 0x1

    add-int/lit8 v11, v16, 0x1

    if-lt v11, v8, :cond_d

    goto :goto_9

    :cond_d
    move/from16 v16, v11

    goto :goto_8

    :cond_e
    const/4 v10, 0x1

    :goto_9
    add-int/lit8 v8, v6, 0x1

    :try_start_1
    invoke-virtual {v4, v8}, Lb0/d;->b(I)V

    sget-object v8, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    new-instance v9, LT/G$b;

    invoke-direct {v9, v1, v4, v2, v6}, LT/G$b;-><init>(LT/G;Lb0/d;Lo/E;I)V

    move-object/from16 v10, p4

    invoke-virtual {v8, v9, v3, v10}, Landroidx/compose/runtime/snapshots/g$a;->h(Lmh/l;Lmh/l;Lmh/a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v6}, Lb0/d;->b(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    invoke-virtual {v7}, LV/b;->o()I

    move-result v4

    if-lez v4, :cond_10

    invoke-virtual {v7}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v6

    :cond_f
    aget-object v7, v6, v5

    check-cast v7, LT/I;

    invoke-interface {v7, v1}, LT/I;->a(LT/H;)V

    const/4 v7, 0x1

    add-int/2addr v5, v7

    if-lt v5, v4, :cond_f

    :cond_10
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_2
    sget-object v5, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LT/G$a;->j()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, LT/G$a;->h:LT/G$a$a;

    invoke-virtual {v8}, LT/G$a$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-eq v7, v8, :cond_11

    invoke-virtual/range {p0 .. p0}, LT/G;->d()LT/n1;

    move-result-object v7

    if-eqz v7, :cond_11

    invoke-virtual/range {p1 .. p1}, LT/G$a;->j()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, v3, v8}, LT/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_11

    invoke-virtual {v0, v2}, LT/G$a;->m(Lo/K;)V

    invoke-virtual {v0, v1, v6}, LT/G$a;->l(LT/H;Landroidx/compose/runtime/snapshots/g;)I

    move-result v2

    invoke-virtual {v0, v2}, LT/G$a;->o(I)V

    goto :goto_a

    :catchall_1
    move-exception v0

    goto :goto_c

    :cond_11
    iget-object v0, v1, LT/G;->d:LT/G$a;

    invoke-static {v0, v1, v6}, Landroidx/compose/runtime/snapshots/j;->O(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/G$a;

    invoke-virtual {v0, v2}, LT/G$a;->m(Lo/K;)V

    invoke-virtual {v0, v1, v6}, LT/G$a;->l(LT/H;Landroidx/compose/runtime/snapshots/g;)I

    move-result v2

    invoke-virtual {v0, v2}, LT/G$a;->o(I)V

    invoke-virtual {v0, v3}, LT/G$a;->n(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_a
    monitor-exit v4

    invoke-static {}, LT/p1;->a()LT/u1;

    move-result-object v2

    invoke-virtual {v2}, LT/u1;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb0/d;

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Lb0/d;->a()I

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->g()V

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_3
    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result v4

    invoke-virtual {v0, v4}, LT/G$a;->p(I)V

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->j()I

    move-result v3

    invoke-virtual {v0, v3}, LT/G$a;->q(I)V

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit v2

    goto :goto_b

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_12
    :goto_b
    return-object v0

    :goto_c
    monitor-exit v4

    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {v7}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_13

    invoke-virtual {v7}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    :goto_d
    aget-object v4, v3, v5

    check-cast v4, LT/I;

    invoke-interface {v4, v1}, LT/I;->a(LT/H;)V

    const/4 v4, 0x1

    add-int/2addr v5, v4

    if-ge v5, v2, :cond_13

    goto :goto_d

    :cond_13
    throw v0
.end method

.method private final u()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LT/G;->d:LT/G$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/G$a;

    sget-object v1, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, LT/G$a;->k(LT/H;Landroidx/compose/runtime/snapshots/g;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LT/G$a;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "<Not calculated>"

    return-object v0
.end method


# virtual methods
.method public d()LT/n1;
    .locals 1

    iget-object v0, p0, LT/G;->c:LT/n1;

    return-object v0
.end method

.method public g(Landroidx/compose/runtime/snapshots/n;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LT/G$a;

    iput-object p1, p0, LT/G;->d:LT/G$a;

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 4

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    iget-object v1, p0, LT/G;->d:LT/G$a;

    invoke-static {v1, v0}, Landroidx/compose/runtime/snapshots/j;->G(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, LT/G$a;

    const/4 v2, 0x1

    iget-object v3, p0, LT/G;->b:Lmh/a;

    invoke-direct {p0, v1, v0, v2, v3}, LT/G;->t(LT/G$a;Landroidx/compose/runtime/snapshots/g;ZLmh/a;)LT/G$a;

    move-result-object v0

    invoke-virtual {v0}, LT/G$a;->j()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public i()Landroidx/compose/runtime/snapshots/n;
    .locals 1

    iget-object v0, p0, LT/G;->d:LT/G$a;

    return-object v0
.end method

.method public o()LT/H$a;
    .locals 4

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v0

    iget-object v1, p0, LT/G;->d:LT/G$a;

    invoke-static {v1, v0}, Landroidx/compose/runtime/snapshots/j;->G(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v1

    check-cast v1, LT/G$a;

    const/4 v2, 0x0

    iget-object v3, p0, LT/G;->b:Lmh/a;

    invoke-direct {p0, v1, v0, v2, v3}, LT/G;->t(LT/G$a;Landroidx/compose/runtime/snapshots/g;ZLmh/a;)LT/G$a;

    move-result-object v0

    return-object v0
.end method

.method public final r(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;
    .locals 3

    iget-object v0, p0, LT/G;->d:LT/G$a;

    invoke-static {v0, p1}, Landroidx/compose/runtime/snapshots/j;->G(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/G$a;

    const/4 v1, 0x0

    iget-object v2, p0, LT/G;->b:Lmh/a;

    invoke-direct {p0, v0, p1, v1, v2}, LT/G;->t(LT/G$a;Landroidx/compose/runtime/snapshots/g;ZLmh/a;)LT/G$a;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LT/G;->d:LT/G$a;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v0

    check-cast v0, LT/G$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DerivedState(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LT/G;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
