.class public Lcom/bumptech/glide/i;
.super Lcom/bumptech/glide/request/a;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field protected static final f1:Lcom/bumptech/glide/request/f;


# instance fields
.field private final A:Landroid/content/Context;

.field private final B:Lcom/bumptech/glide/j;

.field private final C:Ljava/lang/Class;

.field private final D:Lcom/bumptech/glide/b;

.field private final E:Lcom/bumptech/glide/d;

.field private F:Lcom/bumptech/glide/k;

.field private G:Ljava/lang/Object;

.field private H:Ljava/util/List;

.field private I:Lcom/bumptech/glide/i;

.field private J:Lcom/bumptech/glide/i;

.field private N:Ljava/lang/Float;

.field private X:Z

.field private Y:Z

.field private Z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bumptech/glide/request/f;

    invoke-direct {v0}, Lcom/bumptech/glide/request/f;-><init>()V

    sget-object v1, LE2/a;->c:LE2/a;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/a;->f(LE2/a;)Lcom/bumptech/glide/request/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/f;

    sget-object v1, Lcom/bumptech/glide/g;->LOW:Lcom/bumptech/glide/g;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/a;->R(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/request/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/a;->X(Z)Lcom/bumptech/glide/request/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/f;

    sput-object v0, Lcom/bumptech/glide/i;->f1:Lcom/bumptech/glide/request/f;

    return-void
.end method

.method protected constructor <init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/j;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lcom/bumptech/glide/request/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/i;->X:Z

    iput-object p1, p0, Lcom/bumptech/glide/i;->D:Lcom/bumptech/glide/b;

    iput-object p2, p0, Lcom/bumptech/glide/i;->B:Lcom/bumptech/glide/j;

    iput-object p3, p0, Lcom/bumptech/glide/i;->C:Ljava/lang/Class;

    iput-object p4, p0, Lcom/bumptech/glide/i;->A:Landroid/content/Context;

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/j;->t(Ljava/lang/Class;)Lcom/bumptech/glide/k;

    move-result-object p3

    iput-object p3, p0, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    invoke-virtual {p1}, Lcom/bumptech/glide/b;->i()Lcom/bumptech/glide/d;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/i;->E:Lcom/bumptech/glide/d;

    invoke-virtual {p2}, Lcom/bumptech/glide/j;->r()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bumptech/glide/i;->k0(Ljava/util/List;)V

    invoke-virtual {p2}, Lcom/bumptech/glide/j;->s()Lcom/bumptech/glide/request/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/i;->e0(Lcom/bumptech/glide/request/a;)Lcom/bumptech/glide/i;

    return-void
.end method

.method private f0(LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;
    .locals 11

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v5, p0, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    invoke-virtual {p3}, Lcom/bumptech/glide/request/a;->u()Lcom/bumptech/glide/g;

    move-result-object v6

    invoke-virtual {p3}, Lcom/bumptech/glide/request/a;->q()I

    move-result v7

    invoke-virtual {p3}, Lcom/bumptech/glide/request/a;->p()I

    move-result v8

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v9, p3

    move-object v10, p4

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/i;->g0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object p1

    return-object p1
.end method

.method private g0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;
    .locals 23

    move-object/from16 v11, p0

    iget-object v0, v11, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/bumptech/glide/request/b;

    move-object/from16 v13, p1

    move-object/from16 v1, p4

    invoke-direct {v0, v13, v1}, Lcom/bumptech/glide/request/b;-><init>(Ljava/lang/Object;Lcom/bumptech/glide/request/d;)V

    move-object v4, v0

    move-object v15, v4

    goto :goto_0

    :cond_0
    move-object/from16 v13, p1

    move-object/from16 v1, p4

    const/4 v0, 0x0

    move-object v15, v0

    move-object v4, v1

    :goto_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/i;->h0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object v0

    if-nez v15, :cond_1

    return-object v0

    :cond_1
    iget-object v1, v11, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    invoke-virtual {v1}, Lcom/bumptech/glide/request/a;->q()I

    move-result v1

    iget-object v2, v11, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    invoke-virtual {v2}, Lcom/bumptech/glide/request/a;->p()I

    move-result v2

    invoke-static/range {p7 .. p8}, LW2/l;->t(II)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v11, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    invoke-virtual {v3}, Lcom/bumptech/glide/request/a;->O()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p9 .. p9}, Lcom/bumptech/glide/request/a;->q()I

    move-result v1

    invoke-virtual/range {p9 .. p9}, Lcom/bumptech/glide/request/a;->p()I

    move-result v2

    :cond_2
    move/from16 v19, v1

    move/from16 v20, v2

    iget-object v12, v11, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    iget-object v1, v12, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    invoke-virtual {v12}, Lcom/bumptech/glide/request/a;->u()Lcom/bumptech/glide/g;

    move-result-object v18

    iget-object v2, v11, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move-object v3, v15

    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move-object/from16 v17, v1

    move-object/from16 v21, v2

    move-object/from16 v22, p10

    invoke-direct/range {v12 .. v22}, Lcom/bumptech/glide/i;->g0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lcom/bumptech/glide/request/b;->o(Lcom/bumptech/glide/request/c;Lcom/bumptech/glide/request/c;)V

    return-object v3
.end method

.method private h0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;
    .locals 18

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v5, p4

    move-object/from16 v13, p6

    iget-object v0, v11, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    if-eqz v0, :cond_4

    iget-boolean v1, v11, Lcom/bumptech/glide/i;->Z:Z

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    iget-boolean v2, v0, Lcom/bumptech/glide/i;->X:Z

    if-eqz v2, :cond_0

    move-object/from16 v14, p5

    goto :goto_0

    :cond_0
    move-object v14, v1

    :goto_0
    invoke-virtual {v0}, Lcom/bumptech/glide/request/a;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v11, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    invoke-virtual {v0}, Lcom/bumptech/glide/request/a;->u()Lcom/bumptech/glide/g;

    move-result-object v0

    :goto_1
    move-object v15, v0

    goto :goto_2

    :cond_1
    invoke-direct {v11, v13}, Lcom/bumptech/glide/i;->j0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;

    move-result-object v0

    goto :goto_1

    :goto_2
    iget-object v0, v11, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    invoke-virtual {v0}, Lcom/bumptech/glide/request/a;->q()I

    move-result v0

    iget-object v1, v11, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    invoke-virtual {v1}, Lcom/bumptech/glide/request/a;->p()I

    move-result v1

    invoke-static/range {p7 .. p8}, LW2/l;->t(II)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v11, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    invoke-virtual {v2}, Lcom/bumptech/glide/request/a;->O()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p9 .. p9}, Lcom/bumptech/glide/request/a;->q()I

    move-result v0

    invoke-virtual/range {p9 .. p9}, Lcom/bumptech/glide/request/a;->p()I

    move-result v1

    :cond_2
    move/from16 v16, v0

    move/from16 v17, v1

    new-instance v10, Lcom/bumptech/glide/request/i;

    invoke-direct {v10, v12, v5}, Lcom/bumptech/glide/request/i;-><init>(Ljava/lang/Object;Lcom/bumptech/glide/request/d;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object v13, v10

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/i;->s0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object v10

    const/4 v0, 0x1

    iput-boolean v0, v11, Lcom/bumptech/glide/i;->Z:Z

    iget-object v9, v11, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    move-object v0, v9

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    move/from16 v7, v16

    move/from16 v8, v17

    move-object v12, v10

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/i;->g0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v11, Lcom/bumptech/glide/i;->Z:Z

    invoke-virtual {v13, v12, v0}, Lcom/bumptech/glide/request/i;->n(Lcom/bumptech/glide/request/c;Lcom/bumptech/glide/request/c;)V

    return-object v13

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, v11, Lcom/bumptech/glide/i;->N:Ljava/lang/Float;

    if-eqz v0, :cond_5

    new-instance v14, Lcom/bumptech/glide/request/i;

    invoke-direct {v14, v12, v5}, Lcom/bumptech/glide/request/i;-><init>(Ljava/lang/Object;Lcom/bumptech/glide/request/d;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v14

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/i;->s0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object v15

    invoke-virtual/range {p9 .. p9}, Lcom/bumptech/glide/request/a;->d()Lcom/bumptech/glide/request/a;

    move-result-object v0

    iget-object v1, v11, Lcom/bumptech/glide/i;->N:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/a;->W(F)Lcom/bumptech/glide/request/a;

    move-result-object v4

    invoke-direct {v11, v13}, Lcom/bumptech/glide/i;->j0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;

    move-result-object v7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/i;->s0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object v0

    invoke-virtual {v14, v15, v0}, Lcom/bumptech/glide/request/i;->n(Lcom/bumptech/glide/request/c;Lcom/bumptech/glide/request/c;)V

    return-object v14

    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/i;->s0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object v0

    return-object v0
.end method

.method private j0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;
    .locals 2

    sget-object v0, Lcom/bumptech/glide/i$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown priority: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->u()Lcom/bumptech/glide/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/bumptech/glide/g;->IMMEDIATE:Lcom/bumptech/glide/g;

    return-object p1

    :cond_2
    sget-object p1, Lcom/bumptech/glide/g;->HIGH:Lcom/bumptech/glide/g;

    return-object p1

    :cond_3
    sget-object p1, Lcom/bumptech/glide/g;->NORMAL:Lcom/bumptech/glide/g;

    return-object p1
.end method

.method private k0(Ljava/util/List;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/e;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/i;->d0(Lcom/bumptech/glide/request/e;)Lcom/bumptech/glide/i;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private m0(LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)LT2/d;
    .locals 1

    invoke-static {p1}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lcom/bumptech/glide/i;->Y:Z

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/i;->f0(LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;

    move-result-object p2

    invoke-interface {p1}, LT2/d;->j()Lcom/bumptech/glide/request/c;

    move-result-object p4

    invoke-interface {p2, p4}, Lcom/bumptech/glide/request/c;->d(Lcom/bumptech/glide/request/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p3, p4}, Lcom/bumptech/glide/i;->o0(Lcom/bumptech/glide/request/a;Lcom/bumptech/glide/request/c;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-static {p4}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bumptech/glide/request/c;

    invoke-interface {p2}, Lcom/bumptech/glide/request/c;->isRunning()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p4}, Lcom/bumptech/glide/request/c;->i()V

    :cond_0
    return-object p1

    :cond_1
    iget-object p3, p0, Lcom/bumptech/glide/i;->B:Lcom/bumptech/glide/j;

    invoke-virtual {p3, p1}, Lcom/bumptech/glide/j;->p(LT2/d;)V

    invoke-interface {p1, p2}, LT2/d;->e(Lcom/bumptech/glide/request/c;)V

    iget-object p3, p0, Lcom/bumptech/glide/i;->B:Lcom/bumptech/glide/j;

    invoke-virtual {p3, p1, p2}, Lcom/bumptech/glide/j;->z(LT2/d;Lcom/bumptech/glide/request/c;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must call #load() before calling #into()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private o0(Lcom/bumptech/glide/request/a;Lcom/bumptech/glide/request/c;)Z
    .locals 0

    invoke-virtual {p1}, Lcom/bumptech/glide/request/a;->H()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2}, Lcom/bumptech/glide/request/c;->isComplete()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private r0(Ljava/lang/Object;)Lcom/bumptech/glide/i;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/i;->i0()Lcom/bumptech/glide/i;

    move-result-object v0

    invoke-direct {v0, p1}, Lcom/bumptech/glide/i;->r0(Ljava/lang/Object;)Lcom/bumptech/glide/i;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/i;->G:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/bumptech/glide/i;->Y:Z

    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->U()Lcom/bumptech/glide/request/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/i;

    return-object p1
.end method

.method private s0(Ljava/lang/Object;LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/k;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Lcom/bumptech/glide/request/c;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/i;->A:Landroid/content/Context;

    iget-object v2, v0, Lcom/bumptech/glide/i;->E:Lcom/bumptech/glide/d;

    iget-object v4, v0, Lcom/bumptech/glide/i;->G:Ljava/lang/Object;

    iget-object v5, v0, Lcom/bumptech/glide/i;->C:Ljava/lang/Class;

    iget-object v12, v0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->e()Lcom/bumptech/glide/load/engine/j;

    move-result-object v14

    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/k;->c()LU2/c;

    move-result-object v15

    move-object/from16 v3, p1

    move-object/from16 v6, p4

    move/from16 v7, p8

    move/from16 v8, p9

    move-object/from16 v9, p7

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v13, p5

    move-object/from16 v16, p10

    invoke-static/range {v1 .. v16}, Lcom/bumptech/glide/request/h;->y(Landroid/content/Context;Lcom/bumptech/glide/d;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lcom/bumptech/glide/request/a;IILcom/bumptech/glide/g;LT2/d;Lcom/bumptech/glide/request/e;Ljava/util/List;Lcom/bumptech/glide/request/d;Lcom/bumptech/glide/load/engine/j;LU2/c;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/request/h;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic b(Lcom/bumptech/glide/request/a;)Lcom/bumptech/glide/request/a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/i;->e0(Lcom/bumptech/glide/request/a;)Lcom/bumptech/glide/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/i;->i0()Lcom/bumptech/glide/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/bumptech/glide/request/a;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/i;->i0()Lcom/bumptech/glide/i;

    move-result-object v0

    return-object v0
.end method

.method public d0(Lcom/bumptech/glide/request/e;)Lcom/bumptech/glide/i;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/i;->i0()Lcom/bumptech/glide/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/i;->d0(Lcom/bumptech/glide/request/e;)Lcom/bumptech/glide/i;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->U()Lcom/bumptech/glide/request/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/i;

    return-object p1
.end method

.method public e0(Lcom/bumptech/glide/request/a;)Lcom/bumptech/glide/i;
    .locals 0

    invoke-static {p1}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {p0, p1}, Lcom/bumptech/glide/request/a;->b(Lcom/bumptech/glide/request/a;)Lcom/bumptech/glide/request/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/i;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/bumptech/glide/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/bumptech/glide/i;

    invoke-super {p0, p1}, Lcom/bumptech/glide/request/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/i;->C:Ljava/lang/Class;

    iget-object v2, p1, Lcom/bumptech/glide/i;->C:Ljava/lang/Class;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    iget-object v2, p1, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/i;->G:Ljava/lang/Object;

    iget-object v2, p1, Lcom/bumptech/glide/i;->G:Ljava/lang/Object;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    iget-object v2, p1, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    iget-object v2, p1, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    iget-object v2, p1, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/i;->N:Ljava/lang/Float;

    iget-object v2, p1, Lcom/bumptech/glide/i;->N:Ljava/lang/Float;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/i;->X:Z

    iget-boolean v2, p1, Lcom/bumptech/glide/i;->X:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/i;->Y:Z

    iget-boolean p1, p1, Lcom/bumptech/glide/i;->Y:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lcom/bumptech/glide/request/a;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/i;->C:Ljava/lang/Class;

    invoke-static {v1, v0}, LW2/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    invoke-static {v1, v0}, LW2/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/i;->G:Ljava/lang/Object;

    invoke-static {v1, v0}, LW2/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    invoke-static {v1, v0}, LW2/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    invoke-static {v1, v0}, LW2/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    invoke-static {v1, v0}, LW2/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/i;->N:Ljava/lang/Float;

    invoke-static {v1, v0}, LW2/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/i;->X:Z

    invoke-static {v1, v0}, LW2/l;->p(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/i;->Y:Z

    invoke-static {v1, v0}, LW2/l;->p(ZI)I

    move-result v0

    return v0
.end method

.method public i0()Lcom/bumptech/glide/i;
    .locals 3

    invoke-super {p0}, Lcom/bumptech/glide/request/a;->d()Lcom/bumptech/glide/request/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/i;

    iget-object v1, v0, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    invoke-virtual {v1}, Lcom/bumptech/glide/k;->b()Lcom/bumptech/glide/k;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/i;->F:Lcom/bumptech/glide/k;

    iget-object v1, v0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lcom/bumptech/glide/i;->H:Ljava/util/List;

    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/bumptech/glide/i;->i0()Lcom/bumptech/glide/i;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/i;->I:Lcom/bumptech/glide/i;

    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/bumptech/glide/i;->i0()Lcom/bumptech/glide/i;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/i;->J:Lcom/bumptech/glide/i;

    :cond_2
    return-object v0
.end method

.method public l0(LT2/d;)LT2/d;
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, LW2/e;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/bumptech/glide/i;->n0(LT2/d;Lcom/bumptech/glide/request/e;Ljava/util/concurrent/Executor;)LT2/d;

    move-result-object p1

    return-object p1
.end method

.method n0(LT2/d;Lcom/bumptech/glide/request/e;Ljava/util/concurrent/Executor;)LT2/d;
    .locals 0

    invoke-direct {p0, p1, p2, p0, p3}, Lcom/bumptech/glide/i;->m0(LT2/d;Lcom/bumptech/glide/request/e;Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)LT2/d;

    move-result-object p1

    return-object p1
.end method

.method public p0(Ljava/lang/Object;)Lcom/bumptech/glide/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/bumptech/glide/i;->r0(Ljava/lang/Object;)Lcom/bumptech/glide/i;

    move-result-object p1

    return-object p1
.end method
