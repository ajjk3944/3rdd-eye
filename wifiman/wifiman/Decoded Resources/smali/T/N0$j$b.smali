.class final LT/N0$j$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/N0$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/N0;


# direct methods
.method constructor <init>(LT/N0;)V
    .locals 0

    iput-object p1, p0, LT/N0$j$b;->a:LT/N0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/4 v2, 0x1

    iget-object v3, v1, LT/N0$j$b;->a:LT/N0;

    invoke-static {v3}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v1, LT/N0$j$b;->a:LT/N0;

    monitor-enter v3

    :try_start_0
    invoke-static {v4}, LT/N0;->J(LT/N0;)LLi/z;

    move-result-object v5

    invoke-interface {v5}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LT/N0$d;

    sget-object v6, LT/N0$d;->Idle:LT/N0$d;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-ltz v5, :cond_7

    invoke-static {v4}, LT/N0;->F(LT/N0;)Lo/I;

    move-result-object v5

    instance-of v6, v0, LV/d;

    if-eqz v6, :cond_4

    check-cast v0, LV/d;

    invoke-virtual {v0}, LV/d;->b()Lo/T;

    move-result-object v0

    iget-object v6, v0, Lo/T;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lo/T;->a:[J

    array-length v7, v0

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_6

    const/4 v9, 0x0

    :goto_0
    aget-wide v10, v0, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_3

    sub-int v12, v9, v7

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v12, :cond_2

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_1

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    aget-object v15, v6, v15

    instance-of v8, v15, Ld0/l;

    if-eqz v8, :cond_0

    move-object v8, v15

    check-cast v8, Ld0/l;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v13

    invoke-virtual {v8, v13}, Ld0/l;->p(I)Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_0
    invoke-virtual {v5, v15}, Lo/I;->h(Ljava/lang/Object;)Z

    :goto_2
    const/16 v8, 0x8

    goto :goto_3

    :cond_1
    move v8, v13

    :goto_3
    shr-long/2addr v10, v8

    add-int/2addr v14, v2

    move v13, v8

    goto :goto_1

    :cond_2
    move v8, v13

    if-ne v12, v8, :cond_6

    :cond_3
    if-eq v9, v7, :cond_6

    add-int/2addr v9, v2

    goto :goto_0

    :cond_4
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ld0/l;

    if-eqz v7, :cond_5

    move-object v7, v6

    check-cast v7, Ld0/l;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v8

    invoke-virtual {v7, v8}, Ld0/l;->p(I)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v5, v6}, Lo/I;->h(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-static {v4}, LT/N0;->t(LT/N0;)LIi/n;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    monitor-exit v3

    if-eqz v0, :cond_8

    sget-object v2, LYg/u;->b:LYg/u$a;

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-static {v2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_8
    return-void

    :goto_6
    monitor-exit v3

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Landroidx/compose/runtime/snapshots/g;

    invoke-virtual {p0, p1, p2}, LT/N0$j$b;->a(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
