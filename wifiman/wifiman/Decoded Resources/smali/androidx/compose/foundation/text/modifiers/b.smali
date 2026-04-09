.class public final Landroidx/compose/foundation/text/modifiers/b;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;
.implements LE0/r;
.implements LE0/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/modifiers/b$a;
    }
.end annotation


# instance fields
.field private A:Ljava/util/Map;

.field private B:LL/e;

.field private C:Lmh/l;

.field private D:Landroidx/compose/foundation/text/modifiers/b$a;

.field private n:LL0/d;

.field private o:LL0/U;

.field private p:LQ0/k$b;

.field private q:Lmh/l;

.field private r:I

.field private s:Z

.field private t:I

.field private u:I

.field private v:Ljava/util/List;

.field private w:Lmh/l;

.field private x:LL/g;

.field private y:Lm0/y0;

.field private z:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->p:LQ0/k$b;

    .line 6
    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/b;->q:Lmh/l;

    .line 7
    iput p5, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    .line 8
    iput-boolean p6, p0, Landroidx/compose/foundation/text/modifiers/b;->s:Z

    .line 9
    iput p7, p0, Landroidx/compose/foundation/text/modifiers/b;->t:I

    .line 10
    iput p8, p0, Landroidx/compose/foundation/text/modifiers/b;->u:I

    .line 11
    iput-object p9, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    .line 12
    iput-object p10, p0, Landroidx/compose/foundation/text/modifiers/b;->w:Lmh/l;

    .line 13
    iput-object p12, p0, Landroidx/compose/foundation/text/modifiers/b;->y:Lm0/y0;

    .line 14
    iput-object p13, p0, Landroidx/compose/foundation/text/modifiers/b;->z:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, Landroidx/compose/foundation/text/modifiers/b;-><init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)V

    return-void
.end method

.method public static final synthetic D2(Landroidx/compose/foundation/text/modifiers/b;)LL/e;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->M2()LL/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E2(Landroidx/compose/foundation/text/modifiers/b;)Lmh/l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/b;->z:Lmh/l;

    return-object p0
.end method

.method public static final synthetic F2(Landroidx/compose/foundation/text/modifiers/b;)Lm0/y0;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/b;->y:Lm0/y0;

    return-object p0
.end method

.method public static final synthetic G2(Landroidx/compose/foundation/text/modifiers/b;)LL0/U;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    return-object p0
.end method

.method public static final synthetic H2(Landroidx/compose/foundation/text/modifiers/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->P2()V

    return-void
.end method

.method public static final synthetic I2(Landroidx/compose/foundation/text/modifiers/b;LL0/d;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->V2(LL0/d;)Z

    move-result p0

    return p0
.end method

.method private final M2()LL/e;
    .locals 11

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->B:LL/e;

    if-nez v0, :cond_0

    new-instance v0, LL/e;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/b;->p:LQ0/k$b;

    iget v5, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    iget-boolean v6, p0, Landroidx/compose/foundation/text/modifiers/b;->s:Z

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/b;->t:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/b;->u:I

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LL/e;-><init>(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->B:LL/e;

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->B:LL/e;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final N2(LY0/d;)LL/e;
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->D:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->a()LL/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LL/e;->k(LY0/d;)V

    return-object v0

    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->M2()LL/e;

    move-result-object v0

    invoke-virtual {v0, p1}, LL/e;->k(LY0/d;)V

    return-object v0
.end method

.method private final P2()V
    .locals 0

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    invoke-static {p0}, LE0/E;->b(LE0/B;)V

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method

.method private final V2(LL0/d;)Z
    .locals 13

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->D:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->c()LL0/d;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v9, 0x0

    if-eqz v1, :cond_0

    return v9

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/b$a;->g(LL0/d;)V

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->a()LL/e;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->p:LQ0/k$b;

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/b;->s:Z

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/b;->t:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/b;->u:I

    iget-object v10, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    move-object v1, p1

    move v7, v8

    move-object v8, v10

    invoke-virtual/range {v0 .. v8}, LL/e;->n(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;)V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    return v9

    :cond_2
    new-instance v10, Landroidx/compose/foundation/text/modifiers/b$a;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v10

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text/modifiers/b$a;-><init>(LL0/d;LL0/d;ZLL/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, LL/e;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->p:LQ0/k$b;

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/b;->s:Z

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/b;->t:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/b;->u:I

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    const/4 v12, 0x0

    move-object v0, v11

    move-object v1, p1

    move v7, v8

    move-object v8, v9

    move-object v9, v12

    invoke-direct/range {v0 .. v9}, LL/e;-><init>(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->M2()LL/e;

    move-result-object v0

    invoke-virtual {v0}, LL/e;->a()LY0/d;

    move-result-object v0

    invoke-virtual {v11, v0}, LL/e;->k(LY0/d;)V

    invoke-virtual {v10, v11}, Landroidx/compose/foundation/text/modifiers/b$a;->e(LL/e;)V

    iput-object v10, p0, Landroidx/compose/foundation/text/modifiers/b;->D:Landroidx/compose/foundation/text/modifiers/b$a;

    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->N2(LY0/d;)LL/e;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p1}, LL/e;->h(LY0/t;)I

    move-result p1

    return p1
.end method

.method public J(Lo0/c;)V
    .locals 14

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->N2(LY0/d;)LL/e;

    move-result-object v1

    invoke-virtual {v1}, LL/e;->c()LL0/M;

    move-result-object v1

    invoke-virtual {v1}, LL0/M;->w()LL0/k;

    move-result-object v2

    invoke-virtual {v1}, LL0/M;->i()Z

    move-result v3

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_1

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    sget-object v4, LW0/t;->a:LW0/t$a;

    invoke-virtual {v4}, LW0/t$a;->c()I

    move-result v4

    invoke-static {v3, v4}, LW0/t;->e(II)Z

    move-result v3

    if-nez v3, :cond_1

    move v13, v11

    goto :goto_0

    :cond_1
    move v13, v12

    :goto_0
    if-eqz v13, :cond_2

    invoke-virtual {v1}, LL0/M;->B()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->g(J)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1}, LL0/M;->B()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/r;->f(J)I

    move-result v1

    int-to-float v1, v1

    sget-object v4, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v4}, Ll0/g$a;->c()J

    move-result-wide v4

    invoke-static {v3, v1}, Ll0/n;->a(FF)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object v1

    invoke-interface {v0}, Lm0/n0;->j()V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v12, v3, v4}, Lm0/n0;->o(Lm0/n0;Ll0/i;IILjava/lang/Object;)V

    :cond_2
    :try_start_0
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v1}, LL0/U;->A()LW0/k;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, LW0/k;->b:LW0/k$a;

    invoke-virtual {v1}, LW0/k$a;->c()LW0/k;

    move-result-object v1

    :cond_3
    move-object v6, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :goto_1
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v1}, LL0/U;->x()Lm0/g1;

    move-result-object v1

    if-nez v1, :cond_4

    sget-object v1, Lm0/g1;->d:Lm0/g1$a;

    invoke-virtual {v1}, Lm0/g1$a;->a()Lm0/g1;

    move-result-object v1

    :cond_4
    move-object v5, v1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v1}, LL0/U;->i()Lo0/g;

    move-result-object v1

    if-nez v1, :cond_5

    sget-object v1, Lo0/j;->a:Lo0/j;

    :cond_5
    move-object v7, v1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v1}, LL0/U;->g()Lm0/l0;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v1}, LL0/U;->d()F

    move-result v4

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v10}, LL0/k;->F(LL0/k;Lm0/n0;Lm0/l0;FLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V

    goto :goto_4

    :cond_6
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->y:Lm0/y0;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lm0/y0;->a()J

    move-result-wide v3

    goto :goto_2

    :cond_7
    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->e()J

    move-result-wide v3

    :goto_2
    const-wide/16 v8, 0x10

    cmp-long v1, v3, v8

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v1}, LL0/U;->h()J

    move-result-wide v3

    cmp-long v1, v3, v8

    if-eqz v1, :cond_9

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v1}, LL0/U;->h()J

    move-result-wide v3

    goto :goto_3

    :cond_9
    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->a()J

    move-result-wide v3

    :goto_3
    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v10}, LL0/k;->D(LL0/k;Lm0/n0;JLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    if-eqz v13, :cond_a

    invoke-interface {v0}, Lm0/n0;->r()V

    :cond_a
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->D:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->d()Z

    move-result v0

    if-ne v0, v11, :cond_b

    move v0, v12

    goto :goto_5

    :cond_b
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    invoke-static {v0}, LL/h;->a(LL0/d;)Z

    move-result v0

    :goto_5
    if-nez v0, :cond_e

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_d

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    move v11, v12

    :cond_d
    :goto_6
    if-nez v11, :cond_f

    :cond_e
    invoke-interface {p1}, Lo0/c;->X1()V

    :cond_f
    return-void

    :goto_7
    if-eqz v13, :cond_10

    invoke-interface {v0}, Lm0/n0;->r()V

    :cond_10
    throw p1
.end method

.method public final J2()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->D:Landroidx/compose/foundation/text/modifiers/b$a;

    return-void
.end method

.method public final K2(ZZZZ)V
    .locals 9

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-eqz p4, :cond_1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->M2()LL/e;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->p:LQ0/k$b;

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/b;->s:Z

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/b;->t:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/b;->u:I

    iget-object v8, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    invoke-virtual/range {v0 .. v8}, LL/e;->n(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->C:Lmh/l;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_4
    if-nez p2, :cond_5

    if-nez p3, :cond_5

    if-eqz p4, :cond_6

    :cond_5
    invoke-static {p0}, LE0/E;->b(LE0/B;)V

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    :cond_7
    return-void
.end method

.method public final L2(Lo0/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->J(Lo0/c;)V

    return-void
.end method

.method public final O2()Landroidx/compose/foundation/text/modifiers/b$a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->D:Landroidx/compose/foundation/text/modifiers/b$a;

    return-object v0
.end method

.method public final Q2(LC0/o;LC0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->v(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public final R2(LC0/o;LC0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->A(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public final S2(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/modifiers/b;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public final T2(LC0/o;LC0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->p(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public final U2(LC0/o;LC0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->r(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public final W2(Lmh/l;Lmh/l;LL/g;Lmh/l;)Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->q:Lmh/l;

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->q:Lmh/l;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->w:Lmh/l;

    if-eq v0, p2, :cond_1

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->w:Lmh/l;

    move p1, v1

    :cond_1
    iget-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->x:LL/g;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    move p1, v1

    :cond_2
    iget-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->z:Lmh/l;

    if-eq p2, p4, :cond_3

    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/b;->z:Lmh/l;

    goto :goto_1

    :cond_3
    move v1, p1

    :goto_1
    return v1
.end method

.method public final X2(Lm0/y0;LL0/U;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->y:Lm0/y0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->y:Lm0/y0;

    if-eqz v0, :cond_1

    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {p2, p1}, LL0/U;->F(LL0/U;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final Y2(LL0/U;Ljava/util/List;IIZLQ0/k$b;I)Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    invoke-virtual {v0, p1}, LL0/U;->G(LL0/U;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->o:LL0/U;

    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->v:Ljava/util/List;

    move v0, v1

    :cond_0
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/b;->u:I

    if-eq p1, p3, :cond_1

    iput p3, p0, Landroidx/compose/foundation/text/modifiers/b;->u:I

    move v0, v1

    :cond_1
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/b;->t:I

    if-eq p1, p4, :cond_2

    iput p4, p0, Landroidx/compose/foundation/text/modifiers/b;->t:I

    move v0, v1

    :cond_2
    iget-boolean p1, p0, Landroidx/compose/foundation/text/modifiers/b;->s:Z

    if-eq p1, p5, :cond_3

    iput-boolean p5, p0, Landroidx/compose/foundation/text/modifiers/b;->s:Z

    move v0, v1

    :cond_3
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->p:LQ0/k$b;

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iput-object p6, p0, Landroidx/compose/foundation/text/modifiers/b;->p:LQ0/k$b;

    move v0, v1

    :cond_4
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    invoke-static {p1, p7}, LW0/t;->e(II)Z

    move-result p1

    if-nez p1, :cond_5

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/b;->r:I

    goto :goto_0

    :cond_5
    move v1, v0

    :goto_0
    return v1
.end method

.method public final Z2(LL0/d;)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    invoke-virtual {v1}, LL0/d;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, LL0/d;->g()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    invoke-virtual {v2}, LL0/d;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, LL0/d;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    invoke-virtual {v3, p1}, LL0/d;->n(LL0/d;)Z

    move-result v3

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroidx/compose/foundation/text/modifiers/b;->J2()V

    :cond_3
    return v1
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 5

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->N2(LY0/d;)LL/e;

    move-result-object v0

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v1

    invoke-virtual {v0, p3, p4, v1}, LL/e;->f(JLY0/t;)Z

    move-result p3

    invoke-virtual {v0}, LL/e;->c()LL0/M;

    move-result-object p4

    invoke-virtual {p4}, LL0/M;->w()LL0/k;

    move-result-object v0

    invoke-virtual {v0}, LL0/k;->j()LL0/l;

    move-result-object v0

    invoke-virtual {v0}, LL0/l;->c()Z

    if-eqz p3, :cond_2

    invoke-static {p0}, LE0/E;->a(LE0/B;)V

    iget-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->q:Lmh/l;

    if-eqz p3, :cond_0

    invoke-interface {p3, p4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->A:Ljava/util/Map;

    if-nez p3, :cond_1

    new-instance p3, Ljava/util/LinkedHashMap;

    const/4 v0, 0x2

    invoke-direct {p3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    :cond_1
    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v0

    invoke-virtual {p4}, LL0/M;->h()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v0

    invoke-virtual {p4}, LL0/M;->k()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->A:Ljava/util/Map;

    :cond_2
    iget-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->w:Lmh/l;

    if-eqz p3, :cond_3

    invoke-virtual {p4}, LL0/M;->A()Ljava/util/List;

    move-result-object v0

    invoke-interface {p3, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p3, LY0/b;->b:LY0/b$a;

    invoke-virtual {p4}, LL0/M;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    invoke-virtual {p4}, LL0/M;->B()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    invoke-virtual {p4}, LL0/M;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v2

    invoke-virtual {p4}, LL0/M;->B()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v3

    invoke-virtual {p3, v0, v1, v2, v3}, LY0/b$a;->b(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-virtual {p4}, LL0/M;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p3

    invoke-virtual {p4}, LL0/M;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result p4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->A:Ljava/util/Map;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$f;

    invoke-direct {v1, p2}, Landroidx/compose/foundation/text/modifiers/b$f;-><init>(Landroidx/compose/ui/layout/t;)V

    invoke-interface {p1, p3, p4, v0, v1}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->N2(LY0/d;)LL/e;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LL/e;->d(ILY0/t;)I

    move-result p1

    return p1
.end method

.method public q(LJ0/w;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->C:Lmh/l;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/text/modifiers/b$b;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/modifiers/b$b;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->C:Lmh/l;

    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->n:LL0/d;

    invoke-static {p1, v1}, LJ0/t;->o0(LJ0/w;LL0/d;)V

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->D:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/b$a;->c()LL0/d;

    move-result-object v2

    invoke-static {p1, v2}, LJ0/t;->s0(LJ0/w;LL0/d;)V

    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/b$a;->d()Z

    move-result v1

    invoke-static {p1, v1}, LJ0/t;->m0(LJ0/w;Z)V

    :cond_1
    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$c;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/b$c;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v2, v1, v3, v2}, LJ0/t;->u0(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$d;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/b$d;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    invoke-static {p1, v2, v1, v3, v2}, LJ0/t;->z0(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$e;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/b$e;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    invoke-static {p1, v2, v1, v3, v2}, LJ0/t;->d(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    invoke-static {p1, v2, v0, v3, v2}, LJ0/t;->u(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->N2(LY0/d;)LL/e;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p1}, LL/e;->i(LY0/t;)I

    move-result p1

    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->N2(LY0/d;)LL/e;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LL/e;->d(ILY0/t;)I

    move-result p1

    return p1
.end method
