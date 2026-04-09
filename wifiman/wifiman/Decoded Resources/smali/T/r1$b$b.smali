.class final LT/r1$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/r1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKi/g;


# direct methods
.method constructor <init>(LKi/g;)V
    .locals 0

    iput-object p1, p0, LT/r1$b$b;->a:LKi/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V
    .locals 16

    move-object/from16 v0, p1

    instance-of v1, v0, LV/d;

    const/4 v2, 0x4

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, LV/d;

    invoke-virtual {v1}, LV/d;->b()Lo/T;

    move-result-object v1

    iget-object v3, v1, Lo/T;->b:[Ljava/lang/Object;

    iget-object v1, v1, Lo/T;->a:[J

    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    aget-wide v7, v1, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_3

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move v11, v5

    :goto_1
    if-ge v11, v9, :cond_2

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_1

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget-object v12, v3, v12

    instance-of v13, v12, Ld0/l;

    if-eqz v13, :cond_0

    check-cast v12, Ld0/l;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v13

    invoke-virtual {v12, v13}, Ld0/l;->p(I)Z

    move-result v12

    if-eqz v12, :cond_1

    :cond_0
    :goto_2
    move-object/from16 v1, p0

    goto :goto_4

    :cond_1
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    if-ne v9, v10, :cond_4

    :cond_3
    if-eq v6, v4, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    :goto_3
    move-object/from16 v1, p0

    goto :goto_5

    :cond_5
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_6

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ld0/l;

    if-eqz v4, :cond_0

    check-cast v3, Ld0/l;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, Ld0/l;->p(I)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_2

    :goto_4
    iget-object v2, v1, LT/r1$b$b;->a:LKi/g;

    invoke-interface {v2, v0}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Landroidx/compose/runtime/snapshots/g;

    invoke-virtual {p0, p1, p2}, LT/r1$b$b;->a(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
