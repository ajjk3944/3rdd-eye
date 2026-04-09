.class public final LT/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/m$a;,
        LT/m$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Z

.field private final E:LT/m$c;

.field private final F:LT/y1;

.field private G:Z

.field private H:Z

.field private I:LT/a1;

.field private J:LT/b1;

.field private K:LT/e1;

.field private L:Z

.field private M:LT/A0;

.field private N:LU/a;

.field private final O:LU/b;

.field private P:LT/d;

.field private Q:LU/c;

.field private R:Z

.field private S:I

.field private final b:LT/f;

.field private final c:LT/q;

.field private final d:LT/b1;

.field private final e:Ljava/util/Set;

.field private f:LU/a;

.field private g:LU/a;

.field private final h:LT/E;

.field private final i:LT/y1;

.field private j:LT/z0;

.field private k:I

.field private l:I

.field private m:I

.field private final n:LT/V;

.field private o:[I

.field private p:Lo/x;

.field private q:Z

.field private r:Z

.field private s:Z

.field private final t:Ljava/util/List;

.field private final u:LT/V;

.field private v:LT/A0;

.field private w:LV/a;

.field private x:Z

.field private final y:LT/V;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/f;LT/q;LT/b1;Ljava/util/Set;LU/a;LU/a;LT/E;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/m;->b:LT/f;

    iput-object p2, p0, LT/m;->c:LT/q;

    iput-object p3, p0, LT/m;->d:LT/b1;

    iput-object p4, p0, LT/m;->e:Ljava/util/Set;

    iput-object p5, p0, LT/m;->f:LU/a;

    iput-object p6, p0, LT/m;->g:LU/a;

    iput-object p7, p0, LT/m;->h:LT/E;

    new-instance p1, LT/y1;

    invoke-direct {p1}, LT/y1;-><init>()V

    iput-object p1, p0, LT/m;->i:LT/y1;

    new-instance p1, LT/V;

    invoke-direct {p1}, LT/V;-><init>()V

    iput-object p1, p0, LT/m;->n:LT/V;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LT/m;->t:Ljava/util/List;

    new-instance p1, LT/V;

    invoke-direct {p1}, LT/V;-><init>()V

    iput-object p1, p0, LT/m;->u:LT/V;

    invoke-static {}, Lb0/f;->a()Lb0/e;

    move-result-object p1

    iput-object p1, p0, LT/m;->v:LT/A0;

    new-instance p1, LT/V;

    invoke-direct {p1}, LT/V;-><init>()V

    iput-object p1, p0, LT/m;->y:LT/V;

    const/4 p1, -0x1

    iput p1, p0, LT/m;->A:I

    invoke-virtual {p2}, LT/q;->e()Z

    move-result p1

    const/4 p4, 0x1

    const/4 p5, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p2}, LT/q;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, p5

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p4

    :goto_1
    iput-boolean p1, p0, LT/m;->D:Z

    new-instance p1, LT/m$c;

    invoke-direct {p1, p0}, LT/m$c;-><init>(LT/m;)V

    iput-object p1, p0, LT/m;->E:LT/m$c;

    new-instance p1, LT/y1;

    invoke-direct {p1}, LT/y1;-><init>()V

    iput-object p1, p0, LT/m;->F:LT/y1;

    invoke-virtual {p3}, LT/b1;->D()LT/a1;

    move-result-object p1

    invoke-virtual {p1}, LT/a1;->d()V

    iput-object p1, p0, LT/m;->I:LT/a1;

    new-instance p1, LT/b1;

    invoke-direct {p1}, LT/b1;-><init>()V

    invoke-virtual {p2}, LT/q;->e()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, LT/b1;->j()V

    :cond_2
    invoke-virtual {p2}, LT/q;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, LT/b1;->i()V

    :cond_3
    iput-object p1, p0, LT/m;->J:LT/b1;

    invoke-virtual {p1}, LT/b1;->G()LT/e1;

    move-result-object p1

    invoke-virtual {p1, p4}, LT/e1;->L(Z)V

    iput-object p1, p0, LT/m;->K:LT/e1;

    new-instance p1, LU/b;

    iget-object p2, p0, LT/m;->f:LU/a;

    invoke-direct {p1, p0, p2}, LU/b;-><init>(LT/m;LU/a;)V

    iput-object p1, p0, LT/m;->O:LU/b;

    iget-object p1, p0, LT/m;->J:LT/b1;

    invoke-virtual {p1}, LT/b1;->D()LT/a1;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1, p5}, LT/a1;->a(I)LT/d;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, LT/a1;->d()V

    iput-object p2, p0, LT/m;->P:LT/d;

    new-instance p1, LU/c;

    invoke-direct {p1}, LU/c;-><init>()V

    iput-object p1, p0, LT/m;->Q:LU/c;

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, LT/a1;->d()V

    throw p2
.end method

.method private final A0(ZLT/z0;)V
    .locals 2

    iget-object v0, p0, LT/m;->i:LT/y1;

    iget-object v1, p0, LT/m;->j:LT/z0;

    invoke-virtual {v0, v1}, LT/y1;->h(Ljava/lang/Object;)Z

    iput-object p2, p0, LT/m;->j:LT/z0;

    iget-object p2, p0, LT/m;->n:LT/V;

    iget v0, p0, LT/m;->l:I

    invoke-virtual {p2, v0}, LT/V;->j(I)V

    iget-object p2, p0, LT/m;->n:LT/V;

    iget v0, p0, LT/m;->m:I

    invoke-virtual {p2, v0}, LT/V;->j(I)V

    iget-object p2, p0, LT/m;->n:LT/V;

    iget v0, p0, LT/m;->k:I

    invoke-virtual {p2, v0}, LT/V;->j(I)V

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    iput p2, p0, LT/m;->k:I

    :cond_0
    iput p2, p0, LT/m;->l:I

    iput p2, p0, LT/m;->m:I

    return-void
.end method

.method private final A1()V
    .locals 1

    iget-boolean v0, p0, LT/m;->s:Z

    if-nez v0, :cond_0

    const-string v0, "A call to createNode(), emitNode() or useNode() expected was not expected"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LT/m;->s:Z

    return-void
.end method

.method private final B0(IZ)V
    .locals 1

    iget-object v0, p0, LT/m;->i:LT/y1;

    invoke-virtual {v0}, LT/y1;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/z0;

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {v0}, LT/z0;->a()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {v0, p2}, LT/z0;->l(I)V

    :cond_0
    iput-object v0, p0, LT/m;->j:LT/z0;

    iget-object p2, p0, LT/m;->n:LT/V;

    invoke-virtual {p2}, LT/V;->i()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, LT/m;->k:I

    iget-object p2, p0, LT/m;->n:LT/V;

    invoke-virtual {p2}, LT/V;->i()I

    move-result p2

    iput p2, p0, LT/m;->m:I

    iget-object p2, p0, LT/m;->n:LT/V;

    invoke-virtual {p2}, LT/V;->i()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, LT/m;->l:I

    return-void
.end method

.method private final B1()V
    .locals 1

    iget-boolean v0, p0, LT/m;->s:Z

    if-eqz v0, :cond_0

    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final C0()V
    .locals 1

    iget-object v0, p0, LT/m;->O:LU/b;

    invoke-virtual {v0}, LU/b;->m()V

    iget-object v0, p0, LT/m;->i:LT/y1;

    invoke-virtual {v0}, LT/y1;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Start/end imbalance"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, LT/m;->k0()V

    return-void
.end method

.method private final D0()V
    .locals 2

    new-instance v0, LT/b1;

    invoke-direct {v0}, LT/b1;-><init>()V

    iget-boolean v1, p0, LT/m;->D:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LT/b1;->j()V

    :cond_0
    iget-object v1, p0, LT/m;->c:LT/q;

    invoke-virtual {v1}, LT/q;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LT/b1;->i()V

    :cond_1
    iput-object v0, p0, LT/m;->J:LT/b1;

    invoke-virtual {v0}, LT/b1;->G()LT/e1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LT/e1;->L(Z)V

    iput-object v0, p0, LT/m;->K:LT/e1;

    return-void
.end method

.method private final I0(LT/a1;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p1}, LT/a1;->u()I

    move-result v0

    invoke-virtual {p1, v0}, LT/a1;->L(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final K0(LT/a1;I)I
    .locals 2

    invoke-virtual {p1, p2}, LT/a1;->G(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, p2}, LT/a1;->D(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of p2, p1, Ljava/lang/Enum;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2}, LT/a1;->C(I)I

    move-result v0

    const/16 v1, 0xcf

    if-ne v0, v1, :cond_4

    invoke-virtual {p1, p2}, LT/a1;->z(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_4
    :goto_0
    move p1, v0

    :goto_1
    return p1
.end method

.method private final L0(Ljava/util/List;)V
    .locals 25

    move-object/from16 v9, p0

    const/4 v0, 0x1

    iget-object v10, v9, LT/m;->O:LU/b;

    iget-object v1, v9, LT/m;->g:LU/a;

    invoke-virtual {v10}, LU/b;->n()LU/a;

    move-result-object v11

    :try_start_0
    invoke-virtual {v10, v1}, LU/b;->R(LU/a;)V

    iget-object v1, v9, LT/m;->O:LU/b;

    invoke-virtual {v1}, LU/b;->P()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v13, 0x0

    move v14, v13

    :goto_0
    if-ge v14, v12, :cond_3

    move-object/from16 v15, p1

    :try_start_1
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYg/s;

    invoke-virtual {v1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LT/l0;

    invoke-virtual {v1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/l0;

    invoke-virtual {v2}, LT/l0;->a()LT/d;

    move-result-object v3

    invoke-virtual {v2}, LT/l0;->g()LT/b1;

    move-result-object v4

    invoke-virtual {v4, v3}, LT/b1;->e(LT/d;)I

    move-result v4

    new-instance v8, Lb0/d;

    const/4 v5, 0x0

    invoke-direct {v8, v13, v0, v5}, Lb0/d;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v6, v9, LT/m;->O:LU/b;

    invoke-virtual {v6, v8, v3}, LU/b;->e(Lb0/d;LT/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    if-nez v1, :cond_1

    :try_start_2
    invoke-virtual {v2}, LT/l0;->g()LT/b1;

    move-result-object v1

    iget-object v3, v9, LT/m;->J:LT/b1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct/range {p0 .. p0}, LT/m;->o0()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v10

    move-object v2, v11

    goto/16 :goto_9

    :cond_0
    :goto_1
    invoke-virtual {v2}, LT/l0;->g()LT/b1;

    move-result-object v1

    invoke-virtual {v1}, LT/b1;->D()LT/a1;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v7, v4}, LT/a1;->Q(I)V

    iget-object v1, v9, LT/m;->O:LU/b;

    invoke-virtual {v1, v4}, LU/b;->y(I)V

    new-instance v6, LU/a;

    invoke-direct {v6}, LU/a;-><init>()V

    new-instance v5, LT/m$d;

    invoke-direct {v5, v9, v6, v7, v2}, LT/m$d;-><init>(LT/m;LU/a;LT/a1;LT/l0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p0

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    move-object v0, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v7

    move/from16 v7, v16

    move-object v13, v8

    move-object/from16 v8, v17

    :try_start_4
    invoke-static/range {v1 .. v8}, LT/m;->Y0(LT/m;LT/E;LT/E;Ljava/lang/Integer;Ljava/util/List;Lmh/a;ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v9, LT/m;->O:LU/b;

    invoke-virtual {v1, v0, v13}, LU/b;->r(LU/a;Lb0/d;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual/range {v19 .. v19}, LT/a1;->d()V

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    move/from16 v17, v12

    move/from16 v20, v14

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object/from16 v19, v7

    :goto_2
    invoke-virtual/range {v19 .. v19}, LT/a1;->d()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_1
    move-object v13, v8

    :try_start_6
    iget-object v0, v9, LT/m;->c:LT/q;

    invoke-virtual {v0, v1}, LT/q;->l(LT/l0;)LT/k0;

    move-result-object v0

    invoke-virtual {v1}, LT/l0;->g()LT/b1;

    move-result-object v4

    invoke-virtual {v1}, LT/l0;->a()LT/d;

    move-result-object v6

    invoke-static {v4, v6}, LT/o;->e(LT/b1;LT/d;)Ljava/util/List;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_c

    if-nez v8, :cond_2

    :try_start_7
    iget-object v8, v9, LT/m;->O:LU/b;

    invoke-virtual {v8, v7, v13}, LU/b;->b(Ljava/util/List;Lb0/d;)V

    invoke-virtual {v2}, LT/l0;->g()LT/b1;

    move-result-object v8

    iget-object v5, v9, LT/m;->d:LT/b1;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v9, LT/m;->d:LT/b1;

    invoke-virtual {v5, v3}, LT/b1;->e(LT/d;)I

    move-result v3

    invoke-direct {v9, v3}, LT/m;->z1(I)I

    move-result v5

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    add-int/2addr v5, v7

    invoke-direct {v9, v3, v5}, LT/m;->u1(II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_2
    :try_start_8
    iget-object v3, v9, LT/m;->O:LU/b;

    iget-object v5, v9, LT/m;->c:LT/q;

    invoke-virtual {v3, v0, v5, v1, v2}, LU/b;->c(LT/k0;LT/q;LT/l0;LT/l0;)V

    invoke-virtual {v4}, LT/b1;->D()LT/a1;

    move-result-object v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    :try_start_9
    invoke-virtual/range {p0 .. p0}, LT/m;->J0()LT/a1;

    move-result-object v8

    invoke-static/range {p0 .. p0}, LT/m;->a0(LT/m;)[I

    move-result-object v5

    invoke-static/range {p0 .. p0}, LT/m;->c0(LT/m;)LV/a;

    move-result-object v3

    const/4 v0, 0x0

    invoke-static {v9, v0}, LT/m;->g0(LT/m;[I)V

    invoke-static {v9, v0}, LT/m;->h0(LT/m;LV/a;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    :try_start_a
    invoke-virtual {v9, v7}, LT/m;->i1(LT/a1;)V

    invoke-virtual {v4, v6}, LT/b1;->e(LT/d;)I

    move-result v0

    invoke-virtual {v7, v0}, LT/a1;->Q(I)V

    iget-object v4, v9, LT/m;->O:LU/b;

    invoke-virtual {v4, v0}, LU/b;->y(I)V

    new-instance v0, LU/a;

    invoke-direct {v0}, LU/a;-><init>()V

    iget-object v6, v9, LT/m;->O:LU/b;

    invoke-virtual {v6}, LU/b;->n()LU/a;

    move-result-object v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    :try_start_b
    invoke-virtual {v6, v0}, LU/b;->R(LU/a;)V

    move/from16 v17, v12

    iget-object v12, v9, LT/m;->O:LU/b;

    invoke-virtual {v12}, LU/b;->o()Z

    move-result v15
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    move-object/from16 v19, v3

    const/4 v3, 0x0

    :try_start_c
    invoke-virtual {v12, v3}, LU/b;->S(Z)V

    invoke-virtual {v1}, LT/l0;->b()LT/E;

    move-result-object v3

    invoke-virtual {v2}, LT/l0;->b()LT/E;

    move-result-object v20

    invoke-virtual {v7}, LT/a1;->k()I

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    invoke-virtual {v1}, LT/l0;->d()Ljava/util/List;

    move-result-object v22

    new-instance v1, LT/m$e;

    invoke-direct {v1, v9, v2}, LT/m$e;-><init>(LT/m;LT/l0;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    move-object/from16 v23, v1

    move-object/from16 v1, p0

    move-object v2, v3

    move-object/from16 v24, v10

    move-object/from16 v10, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v11

    move-object v11, v4

    move-object/from16 v4, v21

    move/from16 v20, v14

    move-object v14, v5

    move-object/from16 v5, v22

    move-object/from16 v21, v7

    move-object v7, v6

    move-object/from16 v6, v23

    :try_start_d
    invoke-direct/range {v1 .. v6}, LT/m;->X0(LT/E;LT/E;Ljava/lang/Integer;Ljava/util/List;Lmh/a;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :try_start_e
    invoke-virtual {v12, v15}, LU/b;->S(Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :try_start_f
    invoke-virtual {v7, v11}, LU/b;->R(LU/a;)V

    iget-object v1, v9, LT/m;->O:LU/b;

    invoke-virtual {v1, v0, v13}, LU/b;->r(LU/a;Lb0/d;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    :try_start_10
    invoke-virtual {v9, v8}, LT/m;->i1(LT/a1;)V

    invoke-static {v9, v14}, LT/m;->g0(LT/m;[I)V

    invoke-static {v9, v10}, LT/m;->h0(LT/m;LV/a;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :try_start_11
    invoke-virtual/range {v21 .. v21}, LT/a1;->d()V

    :goto_3
    iget-object v0, v9, LT/m;->O:LU/b;

    invoke-virtual {v0}, LU/b;->U()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    const/4 v0, 0x1

    add-int/lit8 v14, v20, 0x1

    move/from16 v12, v17

    move-object/from16 v11, v19

    move-object/from16 v10, v24

    const/4 v13, 0x0

    goto/16 :goto_0

    :catchall_3
    move-exception v0

    :goto_4
    move-object/from16 v2, v19

    move-object/from16 v1, v24

    goto/16 :goto_9

    :catchall_4
    move-exception v0

    goto :goto_8

    :catchall_5
    move-exception v0

    goto :goto_7

    :catchall_6
    move-exception v0

    goto :goto_6

    :catchall_7
    move-exception v0

    goto :goto_5

    :catchall_8
    move-exception v0

    move-object v14, v5

    move-object/from16 v21, v7

    move-object/from16 v24, v10

    move-object/from16 v10, v19

    move-object v7, v6

    move-object/from16 v19, v11

    move-object v11, v4

    :goto_5
    :try_start_12
    invoke-virtual {v12, v15}, LU/b;->S(Z)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :catchall_9
    move-exception v0

    move-object v14, v5

    move-object/from16 v21, v7

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    move-object v10, v3

    move-object v11, v4

    move-object v7, v6

    :goto_6
    :try_start_13
    invoke-virtual {v7, v11}, LU/b;->R(LU/a;)V

    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    :catchall_a
    move-exception v0

    move-object v14, v5

    move-object/from16 v21, v7

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    move-object v10, v3

    :goto_7
    :try_start_14
    invoke-virtual {v9, v8}, LT/m;->i1(LT/a1;)V

    invoke-static {v9, v14}, LT/m;->g0(LT/m;[I)V

    invoke-static {v9, v10}, LT/m;->h0(LT/m;LV/a;)V

    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    :catchall_b
    move-exception v0

    move-object/from16 v21, v7

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    :goto_8
    :try_start_15
    invoke-virtual/range {v21 .. v21}, LT/a1;->d()V

    throw v0

    :catchall_c
    move-exception v0

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    goto :goto_4

    :cond_3
    move-object/from16 v24, v10

    move-object/from16 v19, v11

    iget-object v0, v9, LT/m;->O:LU/b;

    invoke-virtual {v0}, LU/b;->h()V

    iget-object v0, v9, LT/m;->O:LU/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LU/b;->y(I)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    move-object/from16 v2, v19

    move-object/from16 v1, v24

    invoke-virtual {v1, v2}, LU/b;->R(LU/a;)V

    return-void

    :goto_9
    invoke-virtual {v1, v2}, LU/b;->R(LU/a;)V

    throw v0
.end method

.method private final N0(I)I
    .locals 0

    rsub-int/lit8 p1, p1, -0x2

    return p1
.end method

.method private final O0(LT/j0;LT/A0;Ljava/lang/Object;Z)V
    .locals 11

    const v0, 0x78cc281

    invoke-virtual {p0, v0, p1}, LT/m;->s(ILjava/lang/Object;)V

    invoke-direct {p0, p3}, LT/m;->x1(Ljava/lang/Object;)V

    invoke-virtual {p0}, LT/m;->L()I

    move-result v1

    const/4 v2, 0x0

    :try_start_0
    iput v0, p0, LT/m;->S:I

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-static {v0, v3, v4, v2}, LT/e1;->t0(LT/e1;IILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_0
    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v3, v4

    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    invoke-direct {p0, p2}, LT/m;->c1(LT/A0;)V

    :cond_3
    invoke-static {}, LT/o;->y()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, LT/T;->a:LT/T$a;

    invoke-virtual {v5}, LT/T$a;->a()I

    move-result v5

    const/16 v6, 0xca

    invoke-direct {p0, v6, v0, v5, p2}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    iput-object v2, p0, LT/m;->M:LT/A0;

    invoke-virtual {p0}, LT/m;->o()Z

    move-result p2

    if-eqz p2, :cond_4

    if-nez p4, :cond_4

    iput-boolean v4, p0, LT/m;->L:Z

    iget-object p2, p0, LT/m;->K:LT/e1;

    invoke-virtual {p2}, LT/e1;->c0()I

    move-result p4

    invoke-virtual {p2, p4}, LT/e1;->E0(I)I

    move-result p4

    invoke-virtual {p2, p4}, LT/e1;->E(I)LT/d;

    move-result-object v8

    new-instance p2, LT/l0;

    invoke-virtual {p0}, LT/m;->F0()LT/E;

    move-result-object v6

    iget-object v7, p0, LT/m;->J:LT/b1;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v9

    invoke-direct {p0}, LT/m;->p0()LT/A0;

    move-result-object v10

    move-object v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-direct/range {v3 .. v10}, LT/l0;-><init>(LT/j0;Ljava/lang/Object;LT/E;LT/b1;LT/d;Ljava/util/List;LT/A0;)V

    iget-object p1, p0, LT/m;->c:LT/q;

    invoke-virtual {p1, p2}, LT/q;->j(LT/l0;)V

    goto :goto_2

    :cond_4
    iget-boolean p2, p0, LT/m;->x:Z

    iput-boolean v3, p0, LT/m;->x:Z

    new-instance p4, LT/m$f;

    invoke-direct {p4, p1, p3}, LT/m$f;-><init>(LT/j0;Ljava/lang/Object;)V

    const p1, 0x12d6006f

    invoke-static {p1, v4, p4}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p1

    invoke-static {p0, p1}, LT/c;->d(LT/l;Lmh/p;)V

    iput-boolean p2, p0, LT/m;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-direct {p0}, LT/m;->w0()V

    iput-object v2, p0, LT/m;->M:LT/A0;

    iput v1, p0, LT/m;->S:I

    invoke-virtual {p0}, LT/m;->N()V

    return-void

    :goto_3
    invoke-direct {p0}, LT/m;->w0()V

    iput-object v2, p0, LT/m;->M:LT/A0;

    iput v1, p0, LT/m;->S:I

    invoke-virtual {p0}, LT/m;->N()V

    throw p1
.end method

.method private final S0(LT/a1;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2}, LT/a1;->L(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final T0(IIII)I
    .locals 2

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p2}, LT/a1;->P(I)I

    move-result v0

    :goto_0
    if-eq v0, p3, :cond_0

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, v0}, LT/a1;->J(I)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, v0}, LT/a1;->P(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object p3, p0, LT/m;->I:LT/a1;

    invoke-virtual {p3, v0}, LT/a1;->J(I)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    if-ne v0, p2, :cond_2

    return p4

    :cond_2
    invoke-direct {p0, v0}, LT/m;->z1(I)I

    move-result p3

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, p2}, LT/a1;->N(I)I

    move-result p2

    sub-int/2addr p3, p2

    add-int/2addr p3, p4

    :cond_3
    if-ge p4, p3, :cond_5

    if-eq v0, p1, :cond_5

    add-int/lit8 v0, v0, 0x1

    :goto_1
    if-ge v0, p1, :cond_5

    iget-object p2, p0, LT/m;->I:LT/a1;

    invoke-virtual {p2, v0}, LT/a1;->E(I)I

    move-result p2

    add-int/2addr p2, v0

    if-lt p1, p2, :cond_3

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, v0}, LT/a1;->J(I)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    invoke-direct {p0, v0}, LT/m;->z1(I)I

    move-result v0

    :goto_2
    add-int/2addr p4, v0

    move v0, p2

    goto :goto_1

    :cond_5
    return p4
.end method

.method private final V0(I)I
    .locals 3

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->P(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2, v0}, LT/a1;->G(I)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2, v0}, LT/a1;->E(I)I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final X()V
    .locals 1

    invoke-direct {p0}, LT/m;->k0()V

    iget-object v0, p0, LT/m;->i:LT/y1;

    invoke-virtual {v0}, LT/y1;->a()V

    iget-object v0, p0, LT/m;->n:LT/V;

    invoke-virtual {v0}, LT/V;->a()V

    iget-object v0, p0, LT/m;->u:LT/V;

    invoke-virtual {v0}, LT/V;->a()V

    iget-object v0, p0, LT/m;->y:LT/V;

    invoke-virtual {v0}, LT/V;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->w:LV/a;

    iget-object v0, p0, LT/m;->Q:LU/c;

    invoke-virtual {v0}, LU/c;->a()V

    const/4 v0, 0x0

    iput v0, p0, LT/m;->S:I

    iput v0, p0, LT/m;->B:I

    iput-boolean v0, p0, LT/m;->s:Z

    iput-boolean v0, p0, LT/m;->R:Z

    iput-boolean v0, p0, LT/m;->z:Z

    iput-boolean v0, p0, LT/m;->G:Z

    iput-boolean v0, p0, LT/m;->r:Z

    const/4 v0, -0x1

    iput v0, p0, LT/m;->A:I

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->d()V

    :cond_0
    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->Z()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, LT/m;->D0()V

    :cond_1
    return-void
.end method

.method private final X0(LT/E;LT/E;Ljava/lang/Integer;Ljava/util/List;Lmh/a;)Ljava/lang/Object;
    .locals 6

    iget-boolean v0, p0, LT/m;->G:Z

    iget v1, p0, LT/m;->k:I

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, p0, LT/m;->G:Z

    const/4 v2, 0x0

    iput v2, p0, LT/m;->k:I

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_1

    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYg/s;

    invoke-virtual {v4}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LT/K0;

    invoke-virtual {v4}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v5, v4}, LT/m;->s1(LT/K0;Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {p0, v5, v4}, LT/m;->s1(LT/K0;Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_2

    :cond_2
    const/4 p3, -0x1

    :goto_2
    invoke-interface {p1, p2, p3, p5}, LT/E;->f(LT/E;ILmh/a;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    invoke-interface {p5}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    iput-boolean v0, p0, LT/m;->G:Z

    iput v1, p0, LT/m;->k:I

    return-object p1

    :goto_3
    iput-boolean v0, p0, LT/m;->G:Z

    iput v1, p0, LT/m;->k:I

    throw p1
.end method

.method public static final synthetic Y(LT/m;)LU/b;
    .locals 0

    iget-object p0, p0, LT/m;->O:LU/b;

    return-object p0
.end method

.method static synthetic Y0(LT/m;LT/E;LT/E;Ljava/lang/Integer;Ljava/util/List;Lmh/a;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p4

    :cond_3
    move-object v5, p4

    move-object v1, p0

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LT/m;->X0(LT/E;LT/E;Ljava/lang/Integer;Ljava/util/List;Lmh/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Z(LT/m;)I
    .locals 0

    iget p0, p0, LT/m;->B:I

    return p0
.end method

.method private final Z0()V
    .locals 13

    iget-boolean v0, p0, LT/m;->G:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LT/m;->G:Z

    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->u()I

    move-result v2

    iget-object v3, p0, LT/m;->I:LT/a1;

    invoke-virtual {v3, v2}, LT/a1;->E(I)I

    move-result v3

    add-int/2addr v3, v2

    iget v4, p0, LT/m;->k:I

    invoke-virtual {p0}, LT/m;->L()I

    move-result v5

    iget v6, p0, LT/m;->l:I

    iget v7, p0, LT/m;->m:I

    iget-object v8, p0, LT/m;->t:Ljava/util/List;

    iget-object v9, p0, LT/m;->I:LT/a1;

    invoke-virtual {v9}, LT/a1;->k()I

    move-result v9

    invoke-static {v8, v9, v3}, LT/o;->f(Ljava/util/List;II)LT/X;

    move-result-object v8

    const/4 v9, 0x0

    move v10, v2

    :goto_0
    if-eqz v8, :cond_1

    invoke-virtual {v8}, LT/X;->b()I

    move-result v11

    iget-object v12, p0, LT/m;->t:Ljava/util/List;

    invoke-static {v12, v11}, LT/o;->l(Ljava/util/List;I)LT/X;

    invoke-virtual {v8}, LT/X;->d()Z

    move-result v12

    if-eqz v12, :cond_0

    iget-object v9, p0, LT/m;->I:LT/a1;

    invoke-virtual {v9, v11}, LT/a1;->Q(I)V

    iget-object v9, p0, LT/m;->I:LT/a1;

    invoke-virtual {v9}, LT/a1;->k()I

    move-result v9

    invoke-direct {p0, v10, v9, v2}, LT/m;->d1(III)V

    invoke-direct {p0, v11, v9, v2, v4}, LT/m;->T0(IIII)I

    move-result v10

    iput v10, p0, LT/m;->k:I

    invoke-direct {p0, v9}, LT/m;->V0(I)I

    move-result v10

    iput v10, p0, LT/m;->m:I

    iget-object v10, p0, LT/m;->I:LT/a1;

    invoke-virtual {v10, v9}, LT/a1;->P(I)I

    move-result v10

    invoke-direct {p0, v10}, LT/m;->V0(I)I

    move-result v11

    invoke-direct {p0, v10, v11, v2, v5}, LT/m;->n0(IIII)I

    move-result v10

    iput v10, p0, LT/m;->S:I

    const/4 v10, 0x0

    iput-object v10, p0, LT/m;->M:LT/A0;

    invoke-virtual {v8}, LT/X;->c()LT/K0;

    move-result-object v8

    invoke-virtual {v8, p0}, LT/K0;->g(LT/l;)V

    iput-object v10, p0, LT/m;->M:LT/A0;

    iget-object v8, p0, LT/m;->I:LT/a1;

    invoke-virtual {v8, v2}, LT/a1;->R(I)V

    move v10, v9

    move v9, v1

    goto :goto_1

    :cond_0
    iget-object v11, p0, LT/m;->F:LT/y1;

    invoke-virtual {v8}, LT/X;->c()LT/K0;

    move-result-object v12

    invoke-virtual {v11, v12}, LT/y1;->h(Ljava/lang/Object;)Z

    invoke-virtual {v8}, LT/X;->c()LT/K0;

    move-result-object v8

    invoke-virtual {v8}, LT/K0;->y()V

    iget-object v8, p0, LT/m;->F:LT/y1;

    invoke-virtual {v8}, LT/y1;->g()Ljava/lang/Object;

    :goto_1
    iget-object v8, p0, LT/m;->t:Ljava/util/List;

    iget-object v11, p0, LT/m;->I:LT/a1;

    invoke-virtual {v11}, LT/a1;->k()I

    move-result v11

    invoke-static {v8, v11, v3}, LT/o;->f(Ljava/util/List;II)LT/X;

    move-result-object v8

    goto :goto_0

    :cond_1
    if-eqz v9, :cond_2

    invoke-direct {p0, v10, v2, v2}, LT/m;->d1(III)V

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1}, LT/a1;->T()V

    invoke-direct {p0, v2}, LT/m;->z1(I)I

    move-result v1

    add-int/2addr v4, v1

    iput v4, p0, LT/m;->k:I

    add-int/2addr v6, v1

    iput v6, p0, LT/m;->l:I

    iput v7, p0, LT/m;->m:I

    goto :goto_2

    :cond_2
    invoke-direct {p0}, LT/m;->l1()V

    :goto_2
    iput v5, p0, LT/m;->S:I

    iput-boolean v0, p0, LT/m;->G:Z

    return-void
.end method

.method public static final synthetic a0(LT/m;)[I
    .locals 0

    iget-object p0, p0, LT/m;->o:[I

    return-object p0
.end method

.method private final a1()V
    .locals 1

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->k()I

    move-result v0

    invoke-direct {p0, v0}, LT/m;->g1(I)V

    iget-object v0, p0, LT/m;->O:LU/b;

    invoke-virtual {v0}, LU/b;->N()V

    return-void
.end method

.method public static final synthetic b0(LT/m;)LT/q;
    .locals 0

    iget-object p0, p0, LT/m;->c:LT/q;

    return-object p0
.end method

.method private final b1(LT/d;)V
    .locals 3

    iget-object v0, p0, LT/m;->Q:LU/c;

    invoke-virtual {v0}, LU/c;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->O:LU/b;

    iget-object v1, p0, LT/m;->J:LT/b1;

    invoke-virtual {v0, p1, v1}, LU/b;->s(LT/d;LT/b1;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LT/m;->O:LU/b;

    iget-object v1, p0, LT/m;->J:LT/b1;

    iget-object v2, p0, LT/m;->Q:LU/c;

    invoke-virtual {v0, p1, v1, v2}, LU/b;->t(LT/d;LT/b1;LU/c;)V

    new-instance p1, LU/c;

    invoke-direct {p1}, LU/c;-><init>()V

    iput-object p1, p0, LT/m;->Q:LU/c;

    :goto_0
    return-void
.end method

.method public static final synthetic c0(LT/m;)LV/a;
    .locals 0

    iget-object p0, p0, LT/m;->w:LV/a;

    return-object p0
.end method

.method private final c1(LT/A0;)V
    .locals 4

    iget-object v0, p0, LT/m;->w:LV/a;

    if-nez v0, :cond_0

    new-instance v0, LV/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LV/a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LT/m;->w:LV/a;

    :cond_0
    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1}, LT/a1;->k()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LV/a;->b(ILjava/lang/Object;)V

    return-void
.end method

.method public static final synthetic d0(LT/m;)LT/b1;
    .locals 0

    iget-object p0, p0, LT/m;->d:LT/b1;

    return-object p0
.end method

.method private final d1(III)V
    .locals 2

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-static {v0, p1, p2, p3}, LT/o;->k(LT/a1;III)I

    move-result p3

    :goto_0
    if-lez p1, :cond_1

    if-eq p1, p3, :cond_1

    invoke-virtual {v0, p1}, LT/a1;->J(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LT/m;->O:LU/b;

    invoke-virtual {v1}, LU/b;->z()V

    :cond_0
    invoke-virtual {v0, p1}, LT/a1;->P(I)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2, p3}, LT/m;->u0(II)V

    return-void
.end method

.method public static final synthetic e0(LT/m;LT/j0;LT/A0;Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LT/m;->O0(LT/j0;LT/A0;Ljava/lang/Object;Z)V

    return-void
.end method

.method private final e1()LT/d;
    .locals 4

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-static {v0}, LT/o;->G(LT/e1;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->a0()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, LT/m;->K:LT/e1;

    invoke-virtual {v1, v0}, LT/e1;->E0(I)I

    move-result v1

    :goto_0
    move v3, v1

    move v1, v0

    move v0, v3

    iget-object v2, p0, LT/m;->K:LT/e1;

    invoke-virtual {v2}, LT/e1;->c0()I

    move-result v2

    if-eq v0, v2, :cond_0

    if-ltz v0, :cond_0

    iget-object v1, p0, LT/m;->K:LT/e1;

    invoke-virtual {v1, v0}, LT/e1;->E0(I)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0, v1}, LT/e1;->E(I)LT/d;

    move-result-object v1

    goto :goto_2

    :cond_1
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-static {v0}, LT/o;->F(LT/a1;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->k()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, v0}, LT/a1;->P(I)I

    move-result v1

    :goto_1
    move v3, v1

    move v1, v0

    move v0, v3

    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->u()I

    move-result v2

    if-eq v0, v2, :cond_2

    if-ltz v0, :cond_2

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, v0}, LT/a1;->P(I)I

    move-result v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, v1}, LT/a1;->a(I)LT/d;

    move-result-object v1

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static final synthetic f0(LT/m;I)V
    .locals 0

    iput p1, p0, LT/m;->B:I

    return-void
.end method

.method private final f1()V
    .locals 4

    iget-object v0, p0, LT/m;->d:LT/b1;

    invoke-virtual {v0}, LT/b1;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LU/a;

    invoke-direct {v0}, LU/a;-><init>()V

    iput-object v0, p0, LT/m;->N:LU/a;

    iget-object v1, p0, LT/m;->d:LT/b1;

    invoke-virtual {v1}, LT/b1;->D()LT/a1;

    move-result-object v1

    :try_start_0
    iput-object v1, p0, LT/m;->I:LT/a1;

    iget-object v2, p0, LT/m;->O:LU/b;

    invoke-virtual {v2}, LU/b;->n()LU/a;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2, v0}, LU/b;->R(LU/a;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LT/m;->g1(I)V

    iget-object v0, p0, LT/m;->O:LU/b;

    invoke-virtual {v0}, LU/b;->L()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2, v3}, LU/b;->R(LU/a;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, LT/a1;->d()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    invoke-virtual {v2, v3}, LU/b;->R(LU/a;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    invoke-virtual {v1}, LT/a1;->d()V

    throw v0

    :cond_0
    :goto_1
    return-void
.end method

.method public static final synthetic g0(LT/m;[I)V
    .locals 0

    iput-object p1, p0, LT/m;->o:[I

    return-void
.end method

.method private final g1(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, v0}, LT/m;->h1(LT/m;IZI)I

    iget-object p1, p0, LT/m;->O:LU/b;

    invoke-virtual {p1}, LU/b;->i()V

    return-void
.end method

.method public static final synthetic h0(LT/m;LV/a;)V
    .locals 0

    iput-object p1, p0, LT/m;->w:LV/a;

    return-void
.end method

.method private static final h1(LT/m;IZI)I
    .locals 9

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->F(I)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    invoke-virtual {v0, p1}, LT/a1;->C(I)I

    move-result p2

    invoke-virtual {v0, p1}, LT/a1;->D(I)Ljava/lang/Object;

    move-result-object p3

    const/16 v1, 0xce

    if-ne p2, v1, :cond_2

    invoke-static {}, LT/o;->D()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v0, p1, v2}, LT/a1;->B(II)Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, LT/m$a;

    if-eqz p3, :cond_0

    check-cast p2, LT/m$a;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, LT/m$a;->a()LT/m$b;

    move-result-object p2

    invoke-virtual {p2}, LT/m$b;->t()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LT/m;

    invoke-direct {p3}, LT/m;->f1()V

    iget-object v1, p0, LT/m;->c:LT/q;

    invoke-virtual {p3}, LT/m;->F0()LT/E;

    move-result-object p3

    invoke-virtual {v1, p3}, LT/q;->o(LT/E;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, LT/a1;->N(I)I

    move-result v3

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v0, p1}, LT/a1;->J(I)Z

    move-result p0

    if-eqz p0, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {v0, p1}, LT/a1;->N(I)I

    move-result v3

    goto/16 :goto_6

    :cond_4
    invoke-virtual {v0, p1}, LT/a1;->e(I)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0, p1}, LT/a1;->E(I)I

    move-result v1

    add-int/2addr v1, p1

    add-int/lit8 v4, p1, 0x1

    move v5, v2

    :goto_2
    if-ge v4, v1, :cond_a

    invoke-virtual {v0, v4}, LT/a1;->J(I)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v7, p0, LT/m;->O:LU/b;

    invoke-virtual {v7}, LU/b;->i()V

    iget-object v7, p0, LT/m;->O:LU/b;

    invoke-virtual {v0, v4}, LT/a1;->L(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, LU/b;->v(Ljava/lang/Object;)V

    :cond_5
    if-nez v6, :cond_7

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    move v7, v2

    goto :goto_4

    :cond_7
    :goto_3
    move v7, v3

    :goto_4
    if-eqz v6, :cond_8

    move v8, v2

    goto :goto_5

    :cond_8
    add-int v8, p3, v5

    :goto_5
    invoke-static {p0, v4, v7, v8}, LT/m;->h1(LT/m;IZI)I

    move-result v7

    add-int/2addr v5, v7

    if-eqz v6, :cond_9

    iget-object v6, p0, LT/m;->O:LU/b;

    invoke-virtual {v6}, LU/b;->i()V

    iget-object v6, p0, LT/m;->O:LU/b;

    invoke-virtual {v6}, LU/b;->z()V

    :cond_9
    invoke-virtual {v0, v4}, LT/a1;->E(I)I

    move-result v6

    add-int/2addr v4, v6

    goto :goto_2

    :cond_a
    invoke-virtual {v0, p1}, LT/a1;->J(I)Z

    move-result p0

    if-eqz p0, :cond_b

    goto :goto_6

    :cond_b
    move v3, v5

    goto :goto_6

    :cond_c
    invoke-virtual {v0, p1}, LT/a1;->J(I)Z

    move-result p0

    if-eqz p0, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v0, p1}, LT/a1;->N(I)I

    move-result v3

    :goto_6
    return v3
.end method

.method private final i0()V
    .locals 4

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"

    if-eqz v0, :cond_0

    new-instance v0, LT/K0;

    invoke-virtual {p0}, LT/m;->F0()LT/E;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LT/s;

    invoke-direct {v0, v2}, LT/K0;-><init>(LT/M0;)V

    iget-object v1, p0, LT/m;->F:LT/y1;

    invoke-virtual {v1, v0}, LT/y1;->h(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, LT/m;->y1(Ljava/lang/Object;)V

    iget v1, p0, LT/m;->C:I

    invoke-virtual {v0, v1}, LT/K0;->I(I)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, LT/m;->t:Ljava/util/List;

    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->u()I

    move-result v2

    invoke-static {v0, v2}, LT/o;->l(Ljava/util/List;I)LT/X;

    move-result-object v0

    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->K()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v2, LT/K0;

    invoke-virtual {p0}, LT/m;->F0()LT/E;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LT/s;

    invoke-direct {v2, v3}, LT/K0;-><init>(LT/M0;)V

    invoke-virtual {p0, v2}, LT/m;->y1(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LT/K0;

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {v2}, LT/K0;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v2, v1}, LT/K0;->D(Z)V

    :cond_2
    if-eqz v0, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    invoke-virtual {v2, v1}, LT/K0;->E(Z)V

    iget-object v0, p0, LT/m;->F:LT/y1;

    invoke-virtual {v0, v2}, LT/y1;->h(Ljava/lang/Object;)Z

    iget v0, p0, LT/m;->C:I

    invoke-virtual {v2, v0}, LT/K0;->I(I)V

    :goto_1
    return-void
.end method

.method private final k0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->j:LT/z0;

    const/4 v0, 0x0

    iput v0, p0, LT/m;->k:I

    iput v0, p0, LT/m;->l:I

    iput v0, p0, LT/m;->S:I

    iput-boolean v0, p0, LT/m;->s:Z

    iget-object v0, p0, LT/m;->O:LU/b;

    invoke-virtual {v0}, LU/b;->Q()V

    iget-object v0, p0, LT/m;->F:LT/y1;

    invoke-virtual {v0}, LT/y1;->a()V

    invoke-direct {p0}, LT/m;->l0()V

    return-void
.end method

.method private final k1()V
    .locals 2

    iget v0, p0, LT/m;->l:I

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1}, LT/a1;->S()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LT/m;->l:I

    return-void
.end method

.method private final l0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->o:[I

    iput-object v0, p0, LT/m;->p:Lo/x;

    return-void
.end method

.method private final l1()V
    .locals 1

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->v()I

    move-result v0

    iput v0, p0, LT/m;->l:I

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->T()V

    return-void
.end method

.method private final m1(ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 13

    move-object v0, p0

    move v2, p1

    move-object v1, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    invoke-direct {p0}, LT/m;->B1()V

    iget v5, v0, LT/m;->m:I

    const/4 v6, 0x3

    if-nez v1, :cond_1

    if-eqz v4, :cond_0

    const/16 v7, 0xcf

    if-ne v2, v7, :cond_0

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->hashCode()I

    move-result v7

    invoke-virtual {p0}, LT/m;->L()I

    move-result v8

    invoke-static {v8, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v8

    xor-int/2addr v7, v8

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v6

    xor-int/2addr v5, v6

    iput v5, v0, LT/m;->S:I

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, LT/m;->L()I

    move-result v7

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v7, v2

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v6

    xor-int/2addr v5, v6

    :goto_0
    iput v5, v0, LT/m;->S:I

    goto :goto_2

    :cond_1
    instance-of v5, v1, Ljava/lang/Enum;

    if-eqz v5, :cond_2

    move-object v5, v1

    check-cast v5, Ljava/lang/Enum;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    :goto_1
    invoke-virtual {p0}, LT/m;->L()I

    move-result v7

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v5

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_1

    :goto_2
    const/4 v5, 0x1

    if-nez v1, :cond_3

    iget v6, v0, LT/m;->m:I

    add-int/2addr v6, v5

    iput v6, v0, LT/m;->m:I

    :cond_3
    sget-object v6, LT/T;->a:LT/T$a;

    invoke-virtual {v6}, LT/T$a;->a()I

    move-result v7

    const/4 v8, 0x0

    if-eq v3, v7, :cond_4

    move v7, v5

    goto :goto_3

    :cond_4
    move v7, v8

    :goto_3
    invoke-virtual {p0}, LT/m;->o()Z

    move-result v9

    const/4 v10, -0x1

    const/4 v11, 0x0

    if-eqz v9, :cond_a

    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->c()V

    iget-object v3, v0, LT/m;->K:LT/e1;

    invoke-virtual {v3}, LT/e1;->a0()I

    move-result v3

    if-eqz v7, :cond_5

    iget-object v1, v0, LT/m;->K:LT/e1;

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, LT/e1;->j1(ILjava/lang/Object;)V

    goto :goto_4

    :cond_5
    if-eqz v4, :cond_7

    iget-object v5, v0, LT/m;->K:LT/e1;

    if-nez v1, :cond_6

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_6
    invoke-virtual {v5, p1, v1, v4}, LT/e1;->f1(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    iget-object v4, v0, LT/m;->K:LT/e1;

    if-nez v1, :cond_8

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_8
    invoke-virtual {v4, p1, v1}, LT/e1;->h1(ILjava/lang/Object;)V

    :goto_4
    iget-object v8, v0, LT/m;->j:LT/z0;

    if-eqz v8, :cond_9

    new-instance v9, LT/a0;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v3}, LT/m;->N0(I)I

    move-result v5

    const/4 v6, -0x1

    const/4 v10, 0x0

    move-object v1, v9

    move v2, p1

    move-object v3, v4

    move v4, v5

    move v5, v6

    move v6, v10

    invoke-direct/range {v1 .. v6}, LT/a0;-><init>(ILjava/lang/Object;III)V

    iget v1, v0, LT/m;->k:I

    invoke-virtual {v8}, LT/z0;->e()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v8, v9, v1}, LT/z0;->i(LT/a0;I)V

    invoke-virtual {v8, v9}, LT/z0;->h(LT/a0;)Z

    :cond_9
    invoke-direct {p0, v7, v11}, LT/m;->A0(ZLT/z0;)V

    return-void

    :cond_a
    invoke-virtual {v6}, LT/T$a;->b()I

    move-result v6

    if-eq v3, v6, :cond_b

    goto :goto_5

    :cond_b
    iget-boolean v3, v0, LT/m;->z:Z

    if-eqz v3, :cond_c

    move v3, v5

    goto :goto_6

    :cond_c
    :goto_5
    move v3, v8

    :goto_6
    iget-object v6, v0, LT/m;->j:LT/z0;

    if-nez v6, :cond_e

    iget-object v6, v0, LT/m;->I:LT/a1;

    invoke-virtual {v6}, LT/a1;->n()I

    move-result v6

    if-nez v3, :cond_d

    if-ne v6, v2, :cond_d

    iget-object v6, v0, LT/m;->I:LT/a1;

    invoke-virtual {v6}, LT/a1;->o()Ljava/lang/Object;

    move-result-object v6

    invoke-static {p2, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-direct {p0, v7, v4}, LT/m;->p1(ZLjava/lang/Object;)V

    goto :goto_7

    :cond_d
    new-instance v6, LT/z0;

    iget-object v9, v0, LT/m;->I:LT/a1;

    invoke-virtual {v9}, LT/a1;->h()Ljava/util/List;

    move-result-object v9

    iget v12, v0, LT/m;->k:I

    invoke-direct {v6, v9, v12}, LT/z0;-><init>(Ljava/util/List;I)V

    iput-object v6, v0, LT/m;->j:LT/z0;

    :cond_e
    :goto_7
    iget-object v9, v0, LT/m;->j:LT/z0;

    if-eqz v9, :cond_16

    invoke-virtual {v9, p1, p2}, LT/z0;->d(ILjava/lang/Object;)LT/a0;

    move-result-object v6

    if-nez v3, :cond_10

    if-eqz v6, :cond_10

    invoke-virtual {v9, v6}, LT/z0;->h(LT/a0;)Z

    invoke-virtual {v6}, LT/a0;->b()I

    move-result v1

    invoke-virtual {v9, v6}, LT/z0;->g(LT/a0;)I

    move-result v2

    invoke-virtual {v9}, LT/z0;->e()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, LT/m;->k:I

    invoke-virtual {v9, v6}, LT/z0;->m(LT/a0;)I

    move-result v2

    invoke-virtual {v9}, LT/z0;->a()I

    move-result v3

    sub-int v3, v2, v3

    invoke-virtual {v9}, LT/z0;->a()I

    move-result v5

    invoke-virtual {v9, v2, v5}, LT/z0;->k(II)V

    iget-object v2, v0, LT/m;->O:LU/b;

    invoke-virtual {v2, v1}, LU/b;->x(I)V

    iget-object v2, v0, LT/m;->I:LT/a1;

    invoke-virtual {v2, v1}, LT/a1;->Q(I)V

    if-lez v3, :cond_f

    iget-object v1, v0, LT/m;->O:LU/b;

    invoke-virtual {v1, v3}, LU/b;->u(I)V

    :cond_f
    invoke-direct {p0, v7, v4}, LT/m;->p1(ZLjava/lang/Object;)V

    goto/16 :goto_a

    :cond_10
    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->c()V

    iput-boolean v5, v0, LT/m;->R:Z

    iput-object v11, v0, LT/m;->M:LT/A0;

    invoke-direct {p0}, LT/m;->z0()V

    iget-object v3, v0, LT/m;->K:LT/e1;

    invoke-virtual {v3}, LT/e1;->I()V

    iget-object v3, v0, LT/m;->K:LT/e1;

    invoke-virtual {v3}, LT/e1;->a0()I

    move-result v3

    if-eqz v7, :cond_11

    iget-object v1, v0, LT/m;->K:LT/e1;

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, LT/e1;->j1(ILjava/lang/Object;)V

    goto :goto_8

    :cond_11
    if-eqz v4, :cond_13

    iget-object v5, v0, LT/m;->K:LT/e1;

    if-nez v1, :cond_12

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_12
    invoke-virtual {v5, p1, v1, v4}, LT/e1;->f1(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :cond_13
    iget-object v4, v0, LT/m;->K:LT/e1;

    if-nez v1, :cond_14

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_14
    invoke-virtual {v4, p1, v1}, LT/e1;->h1(ILjava/lang/Object;)V

    :goto_8
    iget-object v1, v0, LT/m;->K:LT/e1;

    invoke-virtual {v1, v3}, LT/e1;->E(I)LT/d;

    move-result-object v1

    iput-object v1, v0, LT/m;->P:LT/d;

    new-instance v11, LT/a0;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v3}, LT/m;->N0(I)I

    move-result v5

    const/4 v6, -0x1

    const/4 v10, 0x0

    move-object v1, v11

    move v2, p1

    move-object v3, v4

    move v4, v5

    move v5, v6

    move v6, v10

    invoke-direct/range {v1 .. v6}, LT/a0;-><init>(ILjava/lang/Object;III)V

    iget v1, v0, LT/m;->k:I

    invoke-virtual {v9}, LT/z0;->e()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v9, v11, v1}, LT/z0;->i(LT/a0;I)V

    invoke-virtual {v9, v11}, LT/z0;->h(LT/a0;)Z

    new-instance v11, LT/z0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v7, :cond_15

    goto :goto_9

    :cond_15
    iget v8, v0, LT/m;->k:I

    :goto_9
    invoke-direct {v11, v1, v8}, LT/z0;-><init>(Ljava/util/List;I)V

    :cond_16
    :goto_a
    invoke-direct {p0, v7, v11}, LT/m;->A0(ZLT/z0;)V

    return-void
.end method

.method private final n0(IIII)I
    .locals 3

    if-ne p1, p3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-direct {p0, v0, p1}, LT/m;->K0(LT/a1;I)I

    move-result v0

    const v1, 0x78cc281

    if-ne v0, v1, :cond_1

    move p4, v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, p1}, LT/a1;->P(I)I

    move-result v1

    if-ne v1, p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, v1}, LT/m;->V0(I)I

    move-result v2

    invoke-direct {p0, v1, v2, p3, p4}, LT/m;->n0(IIII)I

    move-result p4

    :goto_0
    iget-object p3, p0, LT/m;->I:LT/a1;

    invoke-virtual {p3, p1}, LT/a1;->G(I)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p2, 0x0

    :cond_3
    const/4 p1, 0x3

    invoke-static {p4, p1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result p3

    xor-int/2addr p3, v0

    invoke-static {p3, p1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result p1

    xor-int/2addr p1, p2

    move p4, p1

    :goto_1
    return p4
.end method

.method private final n1(I)V
    .locals 2

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final o0()V
    .locals 1

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->Z()Z

    move-result v0

    invoke-static {v0}, LT/o;->O(Z)V

    invoke-direct {p0}, LT/m;->D0()V

    return-void
.end method

.method private final o1(ILjava/lang/Object;)V
    .locals 2

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final p0()LT/A0;
    .locals 1

    iget-object v0, p0, LT/m;->M:LT/A0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->u()I

    move-result v0

    invoke-direct {p0, v0}, LT/m;->q0(I)LT/A0;

    move-result-object v0

    return-object v0
.end method

.method private final p1(ZLjava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, LT/m;->I:LT/a1;

    invoke-virtual {p1}, LT/a1;->V()V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, LT/m;->I:LT/a1;

    invoke-virtual {p1}, LT/a1;->l()Ljava/lang/Object;

    move-result-object p1

    if-eq p1, p2, :cond_1

    iget-object p1, p0, LT/m;->O:LU/b;

    invoke-virtual {p1, p2}, LU/b;->X(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, LT/m;->I:LT/a1;

    invoke-virtual {p1}, LT/a1;->U()V

    :goto_0
    return-void
.end method

.method private final q0(I)LT/A0;
    .locals 5

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    const/16 v2, 0xca

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LT/m;->L:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->c0()I

    move-result v0

    :goto_0
    if-lez v0, :cond_1

    iget-object v3, p0, LT/m;->K:LT/e1;

    invoke-virtual {v3, v0}, LT/e1;->i0(I)I

    move-result v3

    if-ne v3, v2, :cond_0

    iget-object v3, p0, LT/m;->K:LT/e1;

    invoke-virtual {v3, v0}, LT/e1;->j0(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LT/o;->y()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p1, p0, LT/m;->K:LT/e1;

    invoke-virtual {p1, v0}, LT/e1;->g0(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LT/A0;

    iput-object p1, p0, LT/m;->M:LT/A0;

    return-object p1

    :cond_0
    iget-object v3, p0, LT/m;->K:LT/e1;

    invoke-virtual {v3, v0}, LT/e1;->E0(I)I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->x()I

    move-result v0

    if-lez v0, :cond_5

    :goto_1
    if-lez p1, :cond_5

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->C(I)I

    move-result v0

    if-ne v0, v2, :cond_4

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->D(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LT/o;->y()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LT/m;->w:LV/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LV/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/A0;

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->z(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LT/A0;

    :cond_3
    iput-object v0, p0, LT/m;->M:LT/A0;

    return-object v0

    :cond_4
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->P(I)I

    move-result p1

    goto :goto_1

    :cond_5
    iget-object p1, p0, LT/m;->v:LT/A0;

    iput-object p1, p0, LT/m;->M:LT/A0;

    return-object p1
.end method

.method private final r1()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LT/m;->m:I

    iget-object v0, p0, LT/m;->d:LT/b1;

    invoke-virtual {v0}, LT/b1;->D()LT/a1;

    move-result-object v0

    iput-object v0, p0, LT/m;->I:LT/a1;

    const/16 v0, 0x64

    invoke-direct {p0, v0}, LT/m;->n1(I)V

    iget-object v0, p0, LT/m;->c:LT/q;

    invoke-virtual {v0}, LT/q;->p()V

    iget-object v0, p0, LT/m;->c:LT/q;

    invoke-virtual {v0}, LT/q;->f()LT/A0;

    move-result-object v0

    iput-object v0, p0, LT/m;->v:LT/A0;

    iget-object v0, p0, LT/m;->y:LT/V;

    iget-boolean v1, p0, LT/m;->x:Z

    invoke-static {v1}, LT/o;->d(Z)I

    move-result v1

    invoke-virtual {v0, v1}, LT/V;->j(I)V

    iget-object v0, p0, LT/m;->v:LT/A0;

    invoke-virtual {p0, v0}, LT/m;->T(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, LT/m;->x:Z

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->M:LT/A0;

    iget-boolean v0, p0, LT/m;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LT/m;->c:LT/q;

    invoke-virtual {v0}, LT/q;->d()Z

    move-result v0

    iput-boolean v0, p0, LT/m;->q:Z

    :cond_0
    iget-boolean v0, p0, LT/m;->D:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LT/m;->c:LT/q;

    invoke-virtual {v0}, LT/q;->e()Z

    move-result v0

    iput-boolean v0, p0, LT/m;->D:Z

    :cond_1
    iget-object v0, p0, LT/m;->v:LT/A0;

    invoke-static {}, Le0/d;->a()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LT/y;->b(LT/A0;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_2

    iget-object v1, p0, LT/m;->d:LT/b1;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LT/m;->c:LT/q;

    invoke-virtual {v1, v0}, LT/q;->m(Ljava/util/Set;)V

    :cond_2
    iget-object v0, p0, LT/m;->c:LT/q;

    invoke-virtual {v0}, LT/q;->g()I

    move-result v0

    invoke-direct {p0, v0}, LT/m;->n1(I)V

    return-void
.end method

.method private final t0(LV/f;Lmh/p;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-boolean v3, v1, LT/m;->G:Z

    if-eqz v3, :cond_0

    const-string v3, "Reentrant composition is not supported"

    invoke-static {v3}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    const-string v3, "Compose:recompose"

    sget-object v4, LT/D1;->a:LT/D1;

    invoke-virtual {v4, v3}, LT/D1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :try_start_0
    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->H()Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/g;->f()I

    move-result v4

    iput v4, v1, LT/m;->C:I

    const/4 v4, 0x0

    iput-object v4, v1, LT/m;->w:LV/a;

    invoke-virtual/range {p1 .. p1}, LV/f;->d()Lo/H;

    move-result-object v5

    iget-object v6, v5, Lo/Q;->b:[Ljava/lang/Object;

    iget-object v7, v5, Lo/Q;->c:[Ljava/lang/Object;

    iget-object v5, v5, Lo/Q;->a:[J

    array-length v8, v5

    const/4 v9, 0x2

    sub-int/2addr v8, v9

    if-ltz v8, :cond_6

    const/4 v11, 0x0

    :goto_0
    aget-wide v12, v5, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_5

    sub-int v14, v11, v8

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v14, :cond_4

    const-wide/16 v17, 0xff

    and-long v17, v12, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_3

    shl-int/lit8 v17, v11, 0x3

    add-int v17, v17, v4

    aget-object v9, v6, v17

    aget-object v10, v7, v17

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v9

    check-cast v2, LT/K0;

    move-object v2, v9

    check-cast v2, LT/K0;

    invoke-virtual {v2}, LT/K0;->i()LT/d;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LT/d;->a()I

    move-result v2

    iget-object v15, v1, LT/m;->t:Ljava/util/List;

    check-cast v9, LT/K0;

    move-object/from16 v20, v5

    sget-object v5, LT/W0;->a:LT/W0;

    if-ne v10, v5, :cond_1

    const/4 v10, 0x0

    :cond_1
    new-instance v5, LT/X;

    invoke-direct {v5, v9, v2, v10}, LT/X;-><init>(LT/K0;ILjava/lang/Object;)V

    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_2
    move-object/from16 v20, v5

    :goto_2
    const/16 v2, 0x8

    goto :goto_3

    :cond_3
    move-object/from16 v20, v5

    move v2, v15

    :goto_3
    shr-long/2addr v12, v2

    const/4 v5, 0x1

    add-int/2addr v4, v5

    move v15, v2

    move-object/from16 v5, v20

    const/4 v9, 0x2

    goto :goto_1

    :cond_4
    move-object/from16 v20, v5

    move v2, v15

    const/4 v5, 0x1

    if-ne v14, v2, :cond_6

    goto :goto_4

    :cond_5
    move-object/from16 v20, v5

    const/4 v5, 0x1

    :goto_4
    if-eq v11, v8, :cond_6

    add-int/2addr v11, v5

    move-object/from16 v5, v20

    const/4 v4, 0x0

    const/4 v9, 0x2

    goto :goto_0

    :cond_6
    iget-object v2, v1, LT/m;->t:Ljava/util/List;

    invoke-static {}, LT/o;->g()Ljava/util/Comparator;

    move-result-object v4

    invoke-static {v2, v4}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v2, 0x0

    iput v2, v1, LT/m;->k:I

    const/4 v2, 0x1

    iput-boolean v2, v1, LT/m;->G:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-direct/range {p0 .. p0}, LT/m;->r1()V

    invoke-virtual/range {p0 .. p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_7

    if-eqz v0, :cond_7

    invoke-virtual {v1, v0}, LT/m;->y1(Ljava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception v0

    const/4 v2, 0x0

    goto/16 :goto_8

    :cond_7
    :goto_5
    iget-object v4, v1, LT/m;->E:LT/m$c;

    invoke-static {}, LT/o1;->c()LV/b;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v5, v4}, LV/b;->b(Ljava/lang/Object;)Z

    const/16 v4, 0xc8

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->z()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v4, v2}, LT/m;->o1(ILjava/lang/Object;)V

    invoke-static {v1, v0}, LT/c;->d(LT/l;Lmh/p;)V

    invoke-direct/range {p0 .. p0}, LT/m;->w0()V

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_7

    :cond_8
    iget-boolean v0, v1, LT/m;->r:Z

    if-nez v0, :cond_9

    iget-boolean v0, v1, LT/m;->x:Z

    if-eqz v0, :cond_a

    :cond_9
    if-eqz v2, :cond_a

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {}, LT/o;->z()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v1, v4, v0}, LT/m;->o1(ILjava/lang/Object;)V

    const/4 v0, 0x2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/p;

    invoke-static {v1, v0}, LT/c;->d(LT/l;Lmh/p;)V

    invoke-direct/range {p0 .. p0}, LT/m;->w0()V

    goto :goto_6

    :cond_a
    invoke-virtual/range {p0 .. p0}, LT/m;->j1()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_6
    :try_start_3
    invoke-virtual {v5}, LV/b;->o()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {v5, v0}, LV/b;->z(I)Ljava/lang/Object;

    invoke-direct/range {p0 .. p0}, LT/m;->y0()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v2, 0x0

    :try_start_4
    iput-boolean v2, v1, LT/m;->G:Z

    iget-object v0, v1, LT/m;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-direct/range {p0 .. p0}, LT/m;->o0()V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget-object v0, LT/D1;->a:LT/D1;

    invoke-virtual {v0, v3}, LT/D1;->b(Ljava/lang/Object;)V

    return-void

    :goto_7
    :try_start_5
    invoke-virtual {v5}, LV/b;->o()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v5, v2}, LV/b;->z(I)Ljava/lang/Object;

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_8
    :try_start_6
    iput-boolean v2, v1, LT/m;->G:Z

    iget-object v2, v1, LT/m;->t:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    invoke-direct/range {p0 .. p0}, LT/m;->X()V

    invoke-direct/range {p0 .. p0}, LT/m;->o0()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_9
    sget-object v2, LT/D1;->a:LT/D1;

    invoke-virtual {v2, v3}, LT/D1;->b(Ljava/lang/Object;)V

    throw v0
.end method

.method private final u0(II)V
    .locals 1

    if-lez p1, :cond_0

    if-eq p1, p2, :cond_0

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->P(I)I

    move-result v0

    invoke-direct {p0, v0, p2}, LT/m;->u0(II)V

    iget-object p2, p0, LT/m;->I:LT/a1;

    invoke-virtual {p2, p1}, LT/a1;->J(I)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LT/m;->O:LU/b;

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-direct {p0, v0, p1}, LT/m;->S0(LT/a1;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, LU/b;->v(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final u1(II)V
    .locals 7

    invoke-direct {p0, p1}, LT/m;->z1(I)I

    move-result v0

    if-eq v0, p2, :cond_3

    if-gez p1, :cond_1

    iget-object v0, p0, LT/m;->p:Lo/x;

    if-nez v0, :cond_0

    new-instance v0, Lo/x;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/x;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LT/m;->p:Lo/x;

    :cond_0
    invoke-virtual {v0, p1, p2}, Lo/x;->q(II)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LT/m;->o:[I

    if-nez v0, :cond_2

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->x()I

    move-result v0

    new-array v0, v0, [I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v6}, LZg/n;->w([IIIIILjava/lang/Object;)V

    iput-object v0, p0, LT/m;->o:[I

    :cond_2
    aput p2, v0, p1

    :cond_3
    :goto_0
    return-void
.end method

.method private final v0(Z)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, LT/m;->n:LT/V;

    invoke-virtual {v1}, LT/V;->g()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, LT/m;->o()Z

    move-result v3

    const/16 v4, 0xcf

    const/4 v5, 0x3

    if-eqz v3, :cond_3

    iget-object v3, v0, LT/m;->K:LT/e1;

    invoke-virtual {v3}, LT/e1;->c0()I

    move-result v3

    iget-object v6, v0, LT/m;->K:LT/e1;

    invoke-virtual {v6, v3}, LT/e1;->i0(I)I

    move-result v6

    iget-object v7, v0, LT/m;->K:LT/e1;

    invoke-virtual {v7, v3}, LT/e1;->j0(I)Ljava/lang/Object;

    move-result-object v7

    iget-object v8, v0, LT/m;->K:LT/e1;

    invoke-virtual {v8, v3}, LT/e1;->g0(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v7, :cond_1

    if-eqz v3, :cond_0

    if-ne v6, v4, :cond_0

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, LT/m;->L()I

    move-result v4

    xor-int/2addr v1, v4

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    invoke-static {v3}, Ljava/lang/Integer;->hashCode(I)I

    move-result v3

    xor-int/2addr v1, v3

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    iput v1, v0, LT/m;->S:I

    goto/16 :goto_4

    :cond_0
    invoke-virtual/range {p0 .. p0}, LT/m;->L()I

    move-result v3

    xor-int/2addr v1, v3

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    invoke-static {v6}, Ljava/lang/Integer;->hashCode(I)I

    move-result v3

    xor-int/2addr v1, v3

    :goto_0
    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    iput v1, v0, LT/m;->S:I

    goto/16 :goto_4

    :cond_1
    instance-of v1, v7, Ljava/lang/Enum;

    if-eqz v1, :cond_2

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    :goto_1
    invoke-virtual/range {p0 .. p0}, LT/m;->L()I

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v3

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    xor-int/2addr v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_3
    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->u()I

    move-result v3

    iget-object v6, v0, LT/m;->I:LT/a1;

    invoke-virtual {v6, v3}, LT/a1;->C(I)I

    move-result v6

    iget-object v7, v0, LT/m;->I:LT/a1;

    invoke-virtual {v7, v3}, LT/a1;->D(I)Ljava/lang/Object;

    move-result-object v7

    iget-object v8, v0, LT/m;->I:LT/a1;

    invoke-virtual {v8, v3}, LT/a1;->z(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v7, :cond_5

    if-eqz v3, :cond_4

    if-ne v6, v4, :cond_4

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, LT/m;->L()I

    move-result v4

    xor-int/2addr v1, v4

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    invoke-static {v3}, Ljava/lang/Integer;->hashCode(I)I

    move-result v3

    xor-int/2addr v1, v3

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    iput v1, v0, LT/m;->S:I

    goto :goto_4

    :cond_4
    invoke-virtual/range {p0 .. p0}, LT/m;->L()I

    move-result v3

    xor-int/2addr v1, v3

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    invoke-static {v6}, Ljava/lang/Integer;->hashCode(I)I

    move-result v3

    xor-int/2addr v1, v3

    :goto_2
    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    iput v1, v0, LT/m;->S:I

    goto :goto_4

    :cond_5
    instance-of v1, v7, Ljava/lang/Enum;

    if-eqz v1, :cond_6

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    :goto_3
    invoke-virtual/range {p0 .. p0}, LT/m;->L()I

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v3

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    xor-int/2addr v1, v3

    goto :goto_2

    :cond_6
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_3

    :goto_4
    iget v1, v0, LT/m;->l:I

    iget-object v3, v0, LT/m;->j:LT/z0;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, LT/z0;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_d

    invoke-virtual {v3}, LT/z0;->b()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3}, LT/z0;->f()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Ld0/a;->e(Ljava/util/List;)Ljava/util/Set;

    move-result-object v7

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_5
    if-ge v11, v10, :cond_c

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LT/a0;

    invoke-interface {v7, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_8

    invoke-virtual {v3, v14}, LT/z0;->g(LT/a0;)I

    move-result v15

    iget-object v2, v0, LT/m;->O:LU/b;

    invoke-virtual {v3}, LT/z0;->e()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v14}, LT/a0;->c()I

    move-result v4

    invoke-virtual {v2, v15, v4}, LU/b;->O(II)V

    invoke-virtual {v14}, LT/a0;->b()I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, LT/z0;->n(II)Z

    iget-object v2, v0, LT/m;->O:LU/b;

    invoke-virtual {v14}, LT/a0;->b()I

    move-result v4

    invoke-virtual {v2, v4}, LU/b;->x(I)V

    iget-object v2, v0, LT/m;->I:LT/a1;

    invoke-virtual {v14}, LT/a0;->b()I

    move-result v4

    invoke-virtual {v2, v4}, LT/a1;->Q(I)V

    invoke-direct/range {p0 .. p0}, LT/m;->a1()V

    iget-object v2, v0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->S()I

    iget-object v2, v0, LT/m;->t:Ljava/util/List;

    invoke-virtual {v14}, LT/a0;->b()I

    move-result v4

    invoke-virtual {v14}, LT/a0;->b()I

    move-result v15

    move-object/from16 v17, v7

    iget-object v7, v0, LT/m;->I:LT/a1;

    invoke-virtual {v14}, LT/a0;->b()I

    move-result v14

    invoke-virtual {v7, v14}, LT/a1;->E(I)I

    move-result v7

    add-int/2addr v15, v7

    invoke-static {v2, v4, v15}, LT/o;->m(Ljava/util/List;II)V

    :goto_6
    add-int/lit8 v11, v11, 0x1

    :cond_7
    move-object/from16 v7, v17

    :goto_7
    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    move-object/from16 v17, v7

    invoke-interface {v8, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_6

    :cond_9
    if-ge v12, v9, :cond_7

    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LT/a0;

    if-eq v2, v14, :cond_b

    invoke-virtual {v3, v2}, LT/z0;->g(LT/a0;)I

    move-result v4

    invoke-interface {v8, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eq v4, v13, :cond_a

    invoke-virtual {v3, v2}, LT/z0;->o(LT/a0;)I

    move-result v7

    iget-object v14, v0, LT/m;->O:LU/b;

    invoke-virtual {v3}, LT/z0;->e()I

    move-result v15

    add-int/2addr v15, v4

    invoke-virtual {v3}, LT/z0;->e()I

    move-result v18

    move-object/from16 v19, v6

    add-int v6, v13, v18

    invoke-virtual {v14, v15, v6, v7}, LU/b;->w(III)V

    invoke-virtual {v3, v4, v13, v7}, LT/z0;->j(III)V

    goto :goto_8

    :cond_a
    move-object/from16 v19, v6

    goto :goto_8

    :cond_b
    move-object/from16 v19, v6

    add-int/lit8 v11, v11, 0x1

    :goto_8
    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v3, v2}, LT/z0;->o(LT/a0;)I

    move-result v2

    add-int/2addr v13, v2

    move-object/from16 v7, v17

    move-object/from16 v6, v19

    goto :goto_7

    :cond_c
    iget-object v2, v0, LT/m;->O:LU/b;

    invoke-virtual {v2}, LU/b;->i()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_d

    iget-object v2, v0, LT/m;->O:LU/b;

    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->m()I

    move-result v3

    invoke-virtual {v2, v3}, LU/b;->x(I)V

    iget-object v2, v0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->T()V

    :cond_d
    iget v2, v0, LT/m;->k:I

    :goto_9
    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->H()Z

    move-result v3

    if-nez v3, :cond_e

    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->k()I

    move-result v3

    invoke-direct/range {p0 .. p0}, LT/m;->a1()V

    iget-object v4, v0, LT/m;->I:LT/a1;

    invoke-virtual {v4}, LT/a1;->S()I

    move-result v4

    iget-object v5, v0, LT/m;->O:LU/b;

    invoke-virtual {v5, v2, v4}, LU/b;->O(II)V

    iget-object v4, v0, LT/m;->t:Ljava/util/List;

    iget-object v5, v0, LT/m;->I:LT/a1;

    invoke-virtual {v5}, LT/a1;->k()I

    move-result v5

    invoke-static {v4, v3, v5}, LT/o;->m(Ljava/util/List;II)V

    goto :goto_9

    :cond_e
    invoke-virtual/range {p0 .. p0}, LT/m;->o()Z

    move-result v2

    if-eqz v2, :cond_10

    if-eqz p1, :cond_f

    iget-object v1, v0, LT/m;->Q:LU/c;

    invoke-virtual {v1}, LU/c;->c()V

    const/4 v1, 0x1

    :cond_f
    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->f()V

    iget-object v3, v0, LT/m;->K:LT/e1;

    invoke-virtual {v3}, LT/e1;->c0()I

    move-result v3

    iget-object v4, v0, LT/m;->K:LT/e1;

    invoke-virtual {v4}, LT/e1;->T()I

    iget-object v4, v0, LT/m;->I:LT/a1;

    invoke-virtual {v4}, LT/a1;->t()Z

    move-result v4

    if-nez v4, :cond_15

    invoke-direct {v0, v3}, LT/m;->N0(I)I

    move-result v3

    iget-object v4, v0, LT/m;->K:LT/e1;

    invoke-virtual {v4}, LT/e1;->U()V

    iget-object v4, v0, LT/m;->K:LT/e1;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, LT/e1;->L(Z)V

    iget-object v4, v0, LT/m;->P:LT/d;

    invoke-direct {v0, v4}, LT/m;->b1(LT/d;)V

    const/4 v4, 0x0

    iput-boolean v4, v0, LT/m;->R:Z

    iget-object v5, v0, LT/m;->d:LT/b1;

    invoke-virtual {v5}, LT/b1;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-direct {v0, v3, v4}, LT/m;->u1(II)V

    invoke-direct {v0, v3, v1}, LT/m;->v1(II)V

    goto :goto_a

    :cond_10
    const/4 v5, 0x1

    if-eqz p1, :cond_11

    iget-object v3, v0, LT/m;->O:LU/b;

    invoke-virtual {v3}, LU/b;->z()V

    :cond_11
    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->w()I

    move-result v3

    if-lez v3, :cond_12

    iget-object v4, v0, LT/m;->O:LU/b;

    invoke-virtual {v4, v3}, LU/b;->V(I)V

    :cond_12
    iget-object v3, v0, LT/m;->O:LU/b;

    invoke-virtual {v3}, LU/b;->g()V

    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->u()I

    move-result v3

    invoke-direct {v0, v3}, LT/m;->z1(I)I

    move-result v4

    if-eq v1, v4, :cond_13

    invoke-direct {v0, v3, v1}, LT/m;->v1(II)V

    :cond_13
    if-eqz p1, :cond_14

    move v1, v5

    :cond_14
    iget-object v3, v0, LT/m;->I:LT/a1;

    invoke-virtual {v3}, LT/a1;->g()V

    iget-object v3, v0, LT/m;->O:LU/b;

    invoke-virtual {v3}, LU/b;->i()V

    :cond_15
    :goto_a
    invoke-direct {v0, v1, v2}, LT/m;->B0(IZ)V

    return-void
.end method

.method private final v1(II)V
    .locals 5

    invoke-direct {p0, p1}, LT/m;->z1(I)I

    move-result v0

    if-eq v0, p2, :cond_3

    sub-int/2addr p2, v0

    iget-object v0, p0, LT/m;->i:LT/y1;

    invoke-virtual {v0}, LT/y1;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    invoke-direct {p0, p1}, LT/m;->z1(I)I

    move-result v2

    add-int/2addr v2, p2

    invoke-direct {p0, p1, v2}, LT/m;->u1(II)V

    move v3, v0

    :goto_1
    if-ge v1, v3, :cond_1

    iget-object v4, p0, LT/m;->i:LT/y1;

    invoke-virtual {v4, v3}, LT/y1;->f(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LT/z0;

    if-eqz v4, :cond_0

    invoke-virtual {v4, p1, v2}, LT/z0;->n(II)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    move v0, v3

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-gez p1, :cond_2

    iget-object p1, p0, LT/m;->I:LT/a1;

    invoke-virtual {p1}, LT/a1;->u()I

    move-result p1

    goto :goto_0

    :cond_2
    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, p1}, LT/a1;->J(I)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, p1}, LT/a1;->P(I)I

    move-result p1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final w0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LT/m;->v0(Z)V

    return-void
.end method

.method private final w1(LT/A0;LT/A0;)LT/A0;
    .locals 2

    invoke-interface {p1}, LT/A0;->c()LT/A0$a;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {p1}, LT/A0$a;->a()LT/A0;

    move-result-object p1

    const/16 v0, 0xcc

    invoke-static {}, LT/o;->C()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LT/m;->o1(ILjava/lang/Object;)V

    invoke-direct {p0, p1}, LT/m;->x1(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, LT/m;->x1(Ljava/lang/Object;)V

    invoke-direct {p0}, LT/m;->w0()V

    return-object p1
.end method

.method private final x1(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    return-void
.end method

.method private final y0()V
    .locals 1

    invoke-direct {p0}, LT/m;->w0()V

    iget-object v0, p0, LT/m;->c:LT/q;

    invoke-virtual {v0}, LT/q;->b()V

    invoke-direct {p0}, LT/m;->w0()V

    iget-object v0, p0, LT/m;->O:LU/b;

    invoke-virtual {v0}, LU/b;->j()V

    invoke-direct {p0}, LT/m;->C0()V

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->d()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LT/m;->r:Z

    iget-object v0, p0, LT/m;->y:LT/V;

    invoke-virtual {v0}, LT/V;->i()I

    move-result v0

    invoke-static {v0}, LT/o;->c(I)Z

    move-result v0

    iput-boolean v0, p0, LT/m;->x:Z

    return-void
.end method

.method private final z0()V
    .locals 1

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->J:LT/b1;

    invoke-virtual {v0}, LT/b1;->G()LT/e1;

    move-result-object v0

    iput-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->W0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LT/m;->L:Z

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->M:LT/A0;

    :cond_0
    return-void
.end method

.method private final z1(I)I
    .locals 3

    if-gez p1, :cond_1

    iget-object v0, p0, LT/m;->p:Lo/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lo/i;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lo/i;->c(I)I

    move-result v1

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, LT/m;->o:[I

    if-eqz v0, :cond_2

    aget v0, v0, p1

    if-ltz v0, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0, p1}, LT/a1;->N(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public A()V
    .locals 3

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->b()I

    move-result v0

    const/16 v1, 0x7d

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0, v2}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LT/m;->s:Z

    return-void
.end method

.method public B([LT/I0;)V
    .locals 6

    invoke-direct {p0}, LT/m;->p0()LT/A0;

    move-result-object v0

    const/16 v1, 0xc9

    invoke-static {}, LT/o;->B()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v1, v2}, LT/m;->o1(ILjava/lang/Object;)V

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    const/4 v4, 0x0

    invoke-static {p1, v0, v4, v1, v4}, LT/y;->d([LT/I0;LT/A0;LT/A0;ILjava/lang/Object;)LT/A0;

    move-result-object p1

    invoke-direct {p0, v0, p1}, LT/m;->w1(LT/A0;LT/A0;)LT/A0;

    move-result-object p1

    iput-boolean v2, p0, LT/m;->L:Z

    goto :goto_2

    :cond_0
    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1, v3}, LT/a1;->A(I)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LT/A0;

    iget-object v5, p0, LT/m;->I:LT/a1;

    invoke-virtual {v5, v2}, LT/a1;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LT/A0;

    invoke-static {p1, v0, v5}, LT/y;->c([LT/I0;LT/A0;LT/A0;)LT/A0;

    move-result-object p1

    invoke-virtual {p0}, LT/m;->v()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-boolean v4, p0, LT/m;->z:Z

    if-nez v4, :cond_2

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LT/m;->k1()V

    move-object p1, v1

    goto :goto_2

    :cond_2
    :goto_0
    invoke-direct {p0, v0, p1}, LT/m;->w1(LT/A0;LT/A0;)LT/A0;

    move-result-object p1

    iget-boolean v0, p0, LT/m;->z:Z

    if-nez v0, :cond_4

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :cond_4
    :goto_1
    move v3, v2

    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0, p1}, LT/m;->c1(LT/A0;)V

    :cond_5
    iget-object v0, p0, LT/m;->y:LT/V;

    iget-boolean v1, p0, LT/m;->x:Z

    invoke-static {v1}, LT/o;->d(Z)I

    move-result v1

    invoke-virtual {v0, v1}, LT/V;->j(I)V

    iput-boolean v3, p0, LT/m;->x:Z

    iput-object p1, p0, LT/m;->M:LT/A0;

    invoke-static {}, LT/o;->y()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/T;->a:LT/T$a;

    invoke-virtual {v1}, LT/T$a;->a()I

    move-result v1

    const/16 v2, 0xca

    invoke-direct {p0, v2, v0, v1, p1}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public C()V
    .locals 1

    iget v0, p0, LT/m;->l:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "No nodes can be emitted before calling skipAndEndGroup"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, LT/m;->G0()LT/K0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LT/K0;->z()V

    :cond_2
    iget-object v0, p0, LT/m;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, LT/m;->l1()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, LT/m;->Z0()V

    :goto_1
    return-void
.end method

.method public D(Lmh/a;)V
    .locals 3

    invoke-direct {p0}, LT/m;->A1()V

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "createNode() can only be called when inserting"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LT/m;->n:LT/V;

    invoke-virtual {v0}, LT/V;->e()I

    move-result v0

    iget-object v1, p0, LT/m;->K:LT/e1;

    invoke-virtual {v1}, LT/e1;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, LT/e1;->E(I)LT/d;

    move-result-object v1

    iget v2, p0, LT/m;->l:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LT/m;->l:I

    iget-object v2, p0, LT/m;->Q:LU/c;

    invoke-virtual {v2, p1, v0, v1}, LU/c;->b(Lmh/a;ILT/d;)V

    return-void
.end method

.method public E()Ldh/i;
    .locals 1

    iget-object v0, p0, LT/m;->c:LT/q;

    invoke-virtual {v0}, LT/q;->h()Ldh/i;

    move-result-object v0

    return-object v0
.end method

.method public final E0()Z
    .locals 1

    iget v0, p0, LT/m;->B:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public F()V
    .locals 1

    invoke-direct {p0}, LT/m;->w0()V

    invoke-direct {p0}, LT/m;->w0()V

    iget-object v0, p0, LT/m;->y:LT/V;

    invoke-virtual {v0}, LT/V;->i()I

    move-result v0

    invoke-static {v0}, LT/o;->c(I)Z

    move-result v0

    iput-boolean v0, p0, LT/m;->x:Z

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->M:LT/A0;

    return-void
.end method

.method public F0()LT/E;
    .locals 1

    iget-object v0, p0, LT/m;->h:LT/E;

    return-object v0
.end method

.method public G()LT/x;
    .locals 1

    invoke-direct {p0}, LT/m;->p0()LT/A0;

    move-result-object v0

    return-object v0
.end method

.method public final G0()LT/K0;
    .locals 2

    iget-object v0, p0, LT/m;->F:LT/y1;

    iget v1, p0, LT/m;->B:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, LT/y1;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LT/y1;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/K0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public H()Z
    .locals 2

    invoke-virtual {p0}, LT/m;->v()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LT/m;->x:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, LT/m;->G0()LT/K0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT/K0;->l()Z

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public final H0()LU/a;
    .locals 1

    iget-object v0, p0, LT/m;->N:LU/a;

    return-object v0
.end method

.method public I()V
    .locals 2

    invoke-direct {p0}, LT/m;->A1()V

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "useNode() called while inserting"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-direct {p0, v0}, LT/m;->I0(LT/a1;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LT/m;->O:LU/b;

    invoke-virtual {v1, v0}, LU/b;->v(Ljava/lang/Object;)V

    iget-boolean v1, p0, LT/m;->z:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, LT/k;

    if-eqz v1, :cond_1

    iget-object v1, p0, LT/m;->O:LU/b;

    invoke-virtual {v1, v0}, LU/b;->a0(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public J()V
    .locals 0

    invoke-direct {p0}, LT/m;->w0()V

    return-void
.end method

.method public final J0()LT/a1;
    .locals 1

    iget-object v0, p0, LT/m;->I:LT/a1;

    return-object v0
.end method

.method public K(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, LT/m;->t1(Ljava/lang/Object;)V

    return-void
.end method

.method public L()I
    .locals 1

    iget v0, p0, LT/m;->S:I

    return v0
.end method

.method public M()LT/q;
    .locals 9

    const/16 v0, 0xce

    invoke-static {}, LT/o;->D()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LT/m;->o1(ILjava/lang/Object;)V

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->K:LT/e1;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, LT/e1;->t0(LT/e1;IILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, LT/m$a;

    if-eqz v2, :cond_1

    check-cast v0, LT/m$a;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    new-instance v0, LT/m$a;

    new-instance v8, LT/m$b;

    invoke-virtual {p0}, LT/m;->L()I

    move-result v4

    iget-boolean v5, p0, LT/m;->q:Z

    iget-boolean v6, p0, LT/m;->D:Z

    invoke-virtual {p0}, LT/m;->F0()LT/E;

    move-result-object v2

    instance-of v3, v2, LT/s;

    if-eqz v3, :cond_2

    check-cast v2, LT/s;

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LT/s;->E()LT/z;

    move-result-object v1

    :cond_3
    move-object v7, v1

    move-object v2, v8

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, LT/m$b;-><init>(LT/m;IZZLT/z;)V

    invoke-direct {v0, v8}, LT/m$a;-><init>(LT/m$b;)V

    invoke-virtual {p0, v0}, LT/m;->y1(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v0}, LT/m$a;->a()LT/m$b;

    move-result-object v1

    invoke-direct {p0}, LT/m;->p0()LT/A0;

    move-result-object v2

    invoke-virtual {v1, v2}, LT/m$b;->w(LT/A0;)V

    invoke-direct {p0}, LT/m;->w0()V

    invoke-virtual {v0}, LT/m$a;->a()LT/m$b;

    move-result-object v0

    return-object v0
.end method

.method public M0(Ljava/util/List;)V
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, LT/m;->L0(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, LT/m;->k0()V

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, LT/m;->X()V

    throw p1
.end method

.method public N()V
    .locals 0

    invoke-direct {p0}, LT/m;->w0()V

    return-void
.end method

.method public O()V
    .locals 1

    invoke-direct {p0}, LT/m;->w0()V

    invoke-direct {p0}, LT/m;->w0()V

    iget-object v0, p0, LT/m;->y:LT/V;

    invoke-virtual {v0}, LT/V;->i()I

    move-result v0

    invoke-static {v0}, LT/o;->c(I)Z

    move-result v0

    iput-boolean v0, p0, LT/m;->x:Z

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->M:LT/A0;

    return-void
.end method

.method public P()V
    .locals 0

    invoke-direct {p0}, LT/m;->w0()V

    return-void
.end method

.method public final P0()Z
    .locals 1

    iget-boolean v0, p0, LT/m;->G:Z

    return v0
.end method

.method public Q(Ljava/lang/Object;Lmh/p;)V
    .locals 1

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->Q:LU/c;

    invoke-virtual {v0, p1, p2}, LU/c;->f(Ljava/lang/Object;Lmh/p;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LT/m;->O:LU/b;

    invoke-virtual {v0, p1, p2}, LU/b;->Y(Ljava/lang/Object;Lmh/p;)V

    :goto_0
    return-void
.end method

.method public final Q0()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LT/m;->B1()V

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->K()Ljava/lang/Object;

    move-result-object v0

    iget-boolean v1, p0, LT/m;->z:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, LT/V0;

    if-nez v1, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public R()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LT/m;->v0(Z)V

    return-void
.end method

.method public final R0()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LT/m;->B1()V

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->K()Ljava/lang/Object;

    move-result-object v0

    iget-boolean v1, p0, LT/m;->z:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, LT/V0;

    if-nez v1, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v1, v0, LT/T0;

    if-eqz v1, :cond_2

    check-cast v0, LT/T0;

    invoke-virtual {v0}, LT/T0;->b()LT/S0;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public S()V
    .locals 2

    invoke-direct {p0}, LT/m;->w0()V

    invoke-virtual {p0}, LT/m;->G0()LT/K0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT/K0;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LT/K0;->B(Z)V

    :cond_0
    return-void
.end method

.method public T(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public U(I)V
    .locals 8

    iget-object v0, p0, LT/m;->j:LT/z0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->a()I

    move-result v0

    invoke-direct {p0, p1, v1, v0, v1}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-direct {p0}, LT/m;->B1()V

    iget v0, p0, LT/m;->m:I

    invoke-virtual {p0}, LT/m;->L()I

    move-result v2

    const/4 v3, 0x3

    invoke-static {v2, v3}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v2

    xor-int/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v2

    xor-int/2addr v0, v2

    iput v0, p0, LT/m;->S:I

    iget v0, p0, LT/m;->m:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, LT/m;->m:I

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v0}, LT/a1;->c()V

    iget-object v0, p0, LT/m;->K:LT/e1;

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, LT/e1;->h1(ILjava/lang/Object;)V

    invoke-direct {p0, v4, v1}, LT/m;->A0(ZLT/z0;)V

    return-void

    :cond_1
    invoke-virtual {v0}, LT/a1;->n()I

    move-result v3

    if-ne v3, p1, :cond_2

    invoke-virtual {v0}, LT/a1;->s()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, LT/a1;->U()V

    invoke-direct {p0, v4, v1}, LT/m;->A0(ZLT/z0;)V

    return-void

    :cond_2
    invoke-virtual {v0}, LT/a1;->H()Z

    move-result v3

    if-nez v3, :cond_3

    iget v3, p0, LT/m;->k:I

    invoke-virtual {v0}, LT/a1;->k()I

    move-result v5

    invoke-direct {p0}, LT/m;->a1()V

    invoke-virtual {v0}, LT/a1;->S()I

    move-result v6

    iget-object v7, p0, LT/m;->O:LU/b;

    invoke-virtual {v7, v3, v6}, LU/b;->O(II)V

    iget-object v3, p0, LT/m;->t:Ljava/util/List;

    invoke-virtual {v0}, LT/a1;->k()I

    move-result v6

    invoke-static {v3, v5, v6}, LT/o;->m(Ljava/util/List;II)V

    :cond_3
    invoke-virtual {v0}, LT/a1;->c()V

    iput-boolean v2, p0, LT/m;->R:Z

    iput-object v1, p0, LT/m;->M:LT/A0;

    invoke-direct {p0}, LT/m;->z0()V

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->I()V

    invoke-virtual {v0}, LT/e1;->a0()I

    move-result v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, p1, v3}, LT/e1;->h1(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, LT/e1;->E(I)LT/d;

    move-result-object p1

    iput-object p1, p0, LT/m;->P:LT/d;

    invoke-direct {p0, v4, v1}, LT/m;->A0(ZLT/z0;)V

    return-void
.end method

.method public final U0(Lmh/a;)V
    .locals 1

    iget-boolean v0, p0, LT/m;->G:Z

    if-eqz v0, :cond_0

    const-string v0, "Preparing a composition while composing is not supported"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LT/m;->G:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LT/m;->G:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, LT/m;->G:Z

    throw p1
.end method

.method public V(LT/J0;)V
    .locals 1

    instance-of v0, p1, LT/K0;

    if-eqz v0, :cond_0

    check-cast p1, LT/K0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LT/K0;->H(Z)V

    :goto_1
    return-void
.end method

.method public W(LT/I0;)V
    .locals 8

    invoke-direct {p0}, LT/m;->p0()LT/A0;

    move-result-object v0

    const/16 v1, 0xc9

    invoke-static {}, LT/o;->B()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v1, v2}, LT/m;->o1(ILjava/lang/Object;)V

    invoke-virtual {p0}, LT/m;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LT/F1;

    :goto_0
    invoke-virtual {p1}, LT/I0;->b()LT/u;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v1}, LT/u;->b(LT/I0;LT/F1;)LT/F1;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0, v3}, LT/m;->K(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, LT/m;->o()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    invoke-virtual {p1}, LT/I0;->a()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {v0, v2}, LT/y;->a(LT/A0;LT/u;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    invoke-interface {v0, v2, v3}, LT/A0;->F(LT/u;LT/F1;)LT/A0;

    move-result-object v0

    :cond_3
    iput-boolean v5, p0, LT/m;->L:Z

    goto :goto_4

    :cond_4
    iget-object v4, p0, LT/m;->I:LT/a1;

    invoke-virtual {v4}, LT/a1;->k()I

    move-result v7

    invoke-virtual {v4, v7}, LT/a1;->z(I)Ljava/lang/Object;

    move-result-object v4

    const-string v7, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LT/A0;

    invoke-virtual {p0}, LT/m;->v()Z

    move-result v7

    if-eqz v7, :cond_5

    if-nez v1, :cond_6

    :cond_5
    invoke-virtual {p1}, LT/I0;->a()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {v0, v2}, LT/y;->a(LT/A0;LT/u;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    move-object v0, v4

    goto :goto_2

    :cond_7
    :goto_1
    invoke-interface {v0, v2, v3}, LT/A0;->F(LT/u;LT/F1;)LT/A0;

    move-result-object p1

    move-object v0, p1

    :goto_2
    iget-boolean p1, p0, LT/m;->z:Z

    if-nez p1, :cond_9

    if-eq v4, v0, :cond_8

    goto :goto_3

    :cond_8
    move v5, v6

    :cond_9
    :goto_3
    move v6, v5

    :goto_4
    if-eqz v6, :cond_a

    invoke-virtual {p0}, LT/m;->o()Z

    move-result p1

    if-nez p1, :cond_a

    invoke-direct {p0, v0}, LT/m;->c1(LT/A0;)V

    :cond_a
    iget-object p1, p0, LT/m;->y:LT/V;

    iget-boolean v1, p0, LT/m;->x:Z

    invoke-static {v1}, LT/o;->d(Z)I

    move-result v1

    invoke-virtual {p1, v1}, LT/V;->j(I)V

    iput-boolean v6, p0, LT/m;->x:Z

    iput-object v0, p0, LT/m;->M:LT/A0;

    invoke-static {}, LT/o;->y()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, LT/T;->a:LT/T$a;

    invoke-virtual {v1}, LT/T$a;->a()I

    move-result v1

    const/16 v2, 0xca

    invoke-direct {p0, v2, p1, v1, v0}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final W0(LV/f;)Z
    .locals 1

    iget-object v0, p0, LT/m;->f:LU/a;

    invoke-virtual {v0}, LU/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected applyChanges() to have been called"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, LV/f;->e()I

    move-result v0

    if-gtz v0, :cond_2

    iget-object v0, p0, LT/m;->t:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, LT/m;->r:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LT/m;->t0(LV/f;Lmh/p;)V

    iget-object p1, p0, LT/m;->f:LU/a;

    invoke-virtual {p1}, LU/a;->d()Z

    move-result p1

    return p1
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LT/m;->q:Z

    iput-boolean v0, p0, LT/m;->D:Z

    iget-object v0, p0, LT/m;->d:LT/b1;

    invoke-virtual {v0}, LT/b1;->j()V

    iget-object v0, p0, LT/m;->J:LT/b1;

    invoke-virtual {v0}, LT/b1;->j()V

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0}, LT/e1;->v1()V

    return-void
.end method

.method public b()LT/J0;
    .locals 1

    invoke-virtual {p0}, LT/m;->G0()LT/K0;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Z
    .locals 2

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public d()V
    .locals 3

    iget-boolean v0, p0, LT/m;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->u()I

    move-result v0

    iget v2, p0, LT/m;->A:I

    if-ne v0, v2, :cond_0

    const/4 v0, -0x1

    iput v0, p0, LT/m;->A:I

    iput-boolean v1, p0, LT/m;->z:Z

    :cond_0
    invoke-direct {p0, v1}, LT/m;->v0(Z)V

    return-void
.end method

.method public e(I)V
    .locals 2

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/m;->R0()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g(F)Z
    .locals 2

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public h()V
    .locals 1

    iget v0, p0, LT/m;->A:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, LT/m;->z:Z

    return-void
.end method

.method public i(I)Z
    .locals 2

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final i1(LT/a1;)V
    .locals 0

    iput-object p1, p0, LT/m;->I:LT/a1;

    return-void
.end method

.method public j(J)Z
    .locals 2

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final j0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->w:LV/a;

    return-void
.end method

.method public j1()V
    .locals 9

    iget-object v0, p0, LT/m;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LT/m;->k1()V

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->n()I

    move-result v1

    invoke-virtual {v0}, LT/a1;->o()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LT/a1;->l()Ljava/lang/Object;

    move-result-object v3

    iget v4, p0, LT/m;->m:I

    const/16 v5, 0xcf

    const/4 v6, 0x3

    if-nez v2, :cond_2

    if-eqz v3, :cond_1

    if-ne v1, v5, :cond_1

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    invoke-virtual {p0}, LT/m;->L()I

    move-result v8

    invoke-static {v8, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v8

    xor-int/2addr v7, v8

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v7, v4

    iput v7, p0, LT/m;->S:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, LT/m;->L()I

    move-result v7

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v7, v1

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v7, v4

    :goto_0
    iput v7, p0, LT/m;->S:I

    goto :goto_2

    :cond_2
    instance-of v7, v2, Ljava/lang/Enum;

    if-eqz v7, :cond_3

    move-object v7, v2

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_1
    invoke-virtual {p0}, LT/m;->L()I

    move-result v8

    invoke-static {v8, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v8

    xor-int/2addr v7, v8

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, LT/a1;->I()Z

    move-result v7

    const/4 v8, 0x0

    invoke-direct {p0, v7, v8}, LT/m;->p1(ZLjava/lang/Object;)V

    invoke-direct {p0}, LT/m;->Z0()V

    invoke-virtual {v0}, LT/a1;->g()V

    if-nez v2, :cond_5

    if-eqz v3, :cond_4

    if-ne v1, v5, :cond_4

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0}, LT/m;->L()I

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v0

    iput v0, p0, LT/m;->S:I

    goto :goto_5

    :cond_4
    invoke-virtual {p0}, LT/m;->L()I

    move-result v0

    xor-int/2addr v0, v4

    invoke-static {v0, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v0

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    xor-int/2addr v0, v1

    :goto_3
    invoke-static {v0, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v0

    iput v0, p0, LT/m;->S:I

    goto :goto_5

    :cond_5
    instance-of v0, v2, Ljava/lang/Enum;

    if-eqz v0, :cond_6

    check-cast v2, Ljava/lang/Enum;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    :goto_4
    invoke-virtual {p0}, LT/m;->L()I

    move-result v1

    invoke-static {v1, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_3

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_4

    :goto_5
    return-void
.end method

.method public k()Le0/a;
    .locals 1

    iget-object v0, p0, LT/m;->d:LT/b1;

    return-object v0
.end method

.method public l(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public m(Lmh/a;)V
    .locals 1

    iget-object v0, p0, LT/m;->O:LU/b;

    invoke-virtual {v0, p1}, LU/b;->T(Lmh/a;)V

    return-void
.end method

.method public final m0(LV/f;Lmh/p;)V
    .locals 1

    iget-object v0, p0, LT/m;->f:LU/a;

    invoke-virtual {v0}, LU/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected applyChanges() to have been called"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, LT/m;->t0(LV/f;Lmh/p;)V

    return-void
.end method

.method public n(C)Z
    .locals 2

    invoke-virtual {p0}, LT/m;->Q0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Character;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, LT/m;->R:Z

    return v0
.end method

.method public p(Z)V
    .locals 2

    iget v0, p0, LT/m;->l:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "No nodes can be emitted before calling dactivateToEndGroup"

    invoke-static {v0}, LT/o;->r(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p1, :cond_2

    invoke-direct {p0}, LT/m;->l1()V

    return-void

    :cond_2
    iget-object p1, p0, LT/m;->I:LT/a1;

    invoke-virtual {p1}, LT/a1;->k()I

    move-result p1

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->j()I

    move-result v0

    iget-object v1, p0, LT/m;->O:LU/b;

    invoke-virtual {v1}, LU/b;->d()V

    iget-object v1, p0, LT/m;->t:Ljava/util/List;

    invoke-static {v1, p1, v0}, LT/o;->m(Ljava/util/List;II)V

    iget-object p1, p0, LT/m;->I:LT/a1;

    invoke-virtual {p1}, LT/a1;->T()V

    :cond_3
    return-void
.end method

.method public q()V
    .locals 3

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->a()I

    move-result v0

    const/16 v1, -0x7f

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0, v2}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final q1()V
    .locals 1

    const/16 v0, 0x64

    iput v0, p0, LT/m;->A:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LT/m;->z:Z

    return-void
.end method

.method public r(I)LT/l;
    .locals 0

    invoke-virtual {p0, p1}, LT/m;->U(I)V

    invoke-direct {p0}, LT/m;->i0()V

    return-object p0
.end method

.method public final r0()V
    .locals 1

    iget-object v0, p0, LT/m;->F:LT/y1;

    invoke-virtual {v0}, LT/y1;->a()V

    iget-object v0, p0, LT/m;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LT/m;->f:LU/a;

    invoke-virtual {v0}, LU/a;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, LT/m;->w:LV/a;

    return-void
.end method

.method public s(ILjava/lang/Object;)V
    .locals 2

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final s0()V
    .locals 3

    sget-object v0, LT/D1;->a:LT/D1;

    const-string v1, "Compose:Composer.dispose"

    invoke-virtual {v0, v1}, LT/D1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, LT/m;->c:LT/q;

    invoke-virtual {v2, p0}, LT/q;->q(LT/l;)V

    invoke-virtual {p0}, LT/m;->r0()V

    invoke-virtual {p0}, LT/m;->x()LT/f;

    move-result-object v2

    invoke-interface {v2}, LT/f;->clear()V

    const/4 v2, 0x1

    iput-boolean v2, p0, LT/m;->H:Z

    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1}, LT/D1;->b(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    sget-object v2, LT/D1;->a:LT/D1;

    invoke-virtual {v2, v1}, LT/D1;->b(Ljava/lang/Object;)V

    throw v0
.end method

.method public final s1(LT/K0;Ljava/lang/Object;)Z
    .locals 3

    invoke-virtual {p1}, LT/K0;->i()LT/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->y()LT/b1;

    move-result-object v2

    invoke-virtual {v0, v2}, LT/d;->d(LT/b1;)I

    move-result v0

    iget-boolean v2, p0, LT/m;->G:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->k()I

    move-result v2

    if-lt v0, v2, :cond_1

    iget-object v1, p0, LT/m;->t:Ljava/util/List;

    invoke-static {v1, v0, p1, p2}, LT/o;->i(Ljava/util/List;ILT/K0;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public t(LT/u;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, LT/m;->p0()LT/A0;

    move-result-object v0

    invoke-static {v0, p1}, LT/y;->b(LT/A0;LT/u;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final t1(Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, LT/S0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->O:LU/b;

    move-object v1, p1

    check-cast v1, LT/S0;

    invoke-virtual {v0, v1}, LU/b;->M(LT/S0;)V

    :cond_0
    iget-object v0, p0, LT/m;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, LT/T0;

    check-cast p1, LT/S0;

    invoke-direct {p0}, LT/m;->e1()LT/d;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LT/T0;-><init>(LT/S0;LT/d;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p0, p1}, LT/m;->y1(Ljava/lang/Object;)V

    return-void
.end method

.method public u()V
    .locals 3

    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->c()I

    move-result v0

    const/16 v1, 0x7d

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0, v2}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LT/m;->s:Z

    return-void
.end method

.method public v()Z
    .locals 1

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, LT/m;->z:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LT/m;->x:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LT/m;->G0()LT/K0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT/K0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, LT/m;->r:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LT/m;->z:Z

    return-void
.end method

.method public x()LT/f;
    .locals 1

    iget-object v0, p0, LT/m;->b:LT/f;

    return-object v0
.end method

.method public final x0()V
    .locals 3

    iget-boolean v0, p0, LT/m;->G:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, LT/m;->A:I

    const/16 v2, 0x64

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Cannot disable reuse from root if it was caused by other groups"

    invoke-static {v0}, LT/B0;->a(Ljava/lang/String;)V

    :cond_1
    const/4 v0, -0x1

    iput v0, p0, LT/m;->A:I

    iput-boolean v1, p0, LT/m;->z:Z

    return-void
.end method

.method public y(ILjava/lang/Object;)V
    .locals 2

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->n()I

    move-result v0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, LT/m;->A:I

    if-gez v0, :cond_0

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->k()I

    move-result v0

    iput v0, p0, LT/m;->A:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LT/m;->z:Z

    :cond_0
    sget-object v0, LT/T;->a:LT/T$a;

    invoke-virtual {v0}, LT/T$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, p2}, LT/m;->m1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final y1(Ljava/lang/Object;)V
    .locals 4

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->K:LT/e1;

    invoke-virtual {v0, p1}, LT/e1;->m1(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LT/m;->I:LT/a1;

    invoke-virtual {v0}, LT/a1;->q()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, LT/m;->O:LU/b;

    invoke-virtual {v1}, LU/b;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LT/m;->O:LU/b;

    iget-object v2, p0, LT/m;->I:LT/a1;

    invoke-virtual {v2}, LT/a1;->u()I

    move-result v3

    invoke-virtual {v2, v3}, LT/a1;->a(I)LT/d;

    move-result-object v2

    invoke-virtual {v1, p1, v2, v0}, LU/b;->W(Ljava/lang/Object;LT/d;I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LT/m;->O:LU/b;

    invoke-virtual {v1, p1, v0}, LU/b;->Z(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LT/m;->O:LU/b;

    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1}, LT/a1;->u()I

    move-result v2

    invoke-virtual {v1, v2}, LT/a1;->a(I)LT/d;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LU/b;->a(LT/d;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public z()LT/X0;
    .locals 6

    iget-object v0, p0, LT/m;->F:LT/y1;

    invoke-virtual {v0}, LT/y1;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LT/m;->F:LT/y1;

    invoke-virtual {v0}, LT/y1;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/K0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, LT/K0;->E(Z)V

    :goto_1
    if-eqz v0, :cond_2

    iget v3, p0, LT/m;->C:I

    invoke-virtual {v0, v3}, LT/K0;->h(I)Lmh/l;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v4, p0, LT/m;->O:LU/b;

    invoke-virtual {p0}, LT/m;->F0()LT/E;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, LU/b;->f(Lmh/l;LT/p;)V

    :cond_2
    if-eqz v0, :cond_6

    invoke-virtual {v0}, LT/K0;->p()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v0}, LT/K0;->q()Z

    move-result v3

    if-nez v3, :cond_3

    iget-boolean v3, p0, LT/m;->q:Z

    if-eqz v3, :cond_6

    :cond_3
    invoke-virtual {v0}, LT/K0;->i()LT/d;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, LT/m;->o()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LT/m;->K:LT/e1;

    invoke-virtual {v1}, LT/e1;->c0()I

    move-result v3

    invoke-virtual {v1, v3}, LT/e1;->E(I)LT/d;

    move-result-object v1

    goto :goto_2

    :cond_4
    iget-object v1, p0, LT/m;->I:LT/a1;

    invoke-virtual {v1}, LT/a1;->u()I

    move-result v3

    invoke-virtual {v1, v3}, LT/a1;->a(I)LT/d;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, LT/K0;->A(LT/d;)V

    :cond_5
    invoke-virtual {v0, v2}, LT/K0;->C(Z)V

    move-object v1, v0

    :cond_6
    invoke-direct {p0, v2}, LT/m;->v0(Z)V

    return-object v1
.end method
