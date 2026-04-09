.class public final LL/i;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;
.implements LE0/r;
.implements LE0/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL/i$a;
    }
.end annotation


# instance fields
.field private n:Ljava/lang/String;

.field private o:LL0/U;

.field private p:LQ0/k$b;

.field private q:I

.field private r:Z

.field private s:I

.field private t:I

.field private u:Lm0/y0;

.field private v:Ljava/util/Map;

.field private w:LL/f;

.field private x:Lmh/l;

.field private y:LL/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;LL0/U;LQ0/k$b;IZIILm0/y0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-object p1, p0, LL/i;->n:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LL/i;->o:LL0/U;

    .line 5
    iput-object p3, p0, LL/i;->p:LQ0/k$b;

    .line 6
    iput p4, p0, LL/i;->q:I

    .line 7
    iput-boolean p5, p0, LL/i;->r:Z

    .line 8
    iput p6, p0, LL/i;->s:I

    .line 9
    iput p7, p0, LL/i;->t:I

    .line 10
    iput-object p8, p0, LL/i;->u:Lm0/y0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LL0/U;LQ0/k$b;IZIILm0/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, LL/i;-><init>(Ljava/lang/String;LL0/U;LQ0/k$b;IZIILm0/y0;)V

    return-void
.end method

.method public static final synthetic D2(LL/i;)V
    .locals 0

    invoke-direct {p0}, LL/i;->K2()V

    return-void
.end method

.method public static final synthetic E2(LL/i;)LL/f;
    .locals 0

    invoke-direct {p0}, LL/i;->M2()LL/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F2(LL/i;)Lm0/y0;
    .locals 0

    iget-object p0, p0, LL/i;->u:Lm0/y0;

    return-object p0
.end method

.method public static final synthetic G2(LL/i;)LL0/U;
    .locals 0

    iget-object p0, p0, LL/i;->o:LL0/U;

    return-object p0
.end method

.method public static final synthetic H2(LL/i;)LL/i$a;
    .locals 0

    iget-object p0, p0, LL/i;->y:LL/i$a;

    return-object p0
.end method

.method public static final synthetic I2(LL/i;)V
    .locals 0

    invoke-direct {p0}, LL/i;->O2()V

    return-void
.end method

.method public static final synthetic J2(LL/i;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, LL/i;->P2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final K2()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LL/i;->y:LL/i$a;

    return-void
.end method

.method private final M2()LL/f;
    .locals 10

    iget-object v0, p0, LL/i;->w:LL/f;

    if-nez v0, :cond_0

    new-instance v0, LL/f;

    iget-object v2, p0, LL/i;->n:Ljava/lang/String;

    iget-object v3, p0, LL/i;->o:LL0/U;

    iget-object v4, p0, LL/i;->p:LQ0/k$b;

    iget v5, p0, LL/i;->q:I

    iget-boolean v6, p0, LL/i;->r:Z

    iget v7, p0, LL/i;->s:I

    iget v8, p0, LL/i;->t:I

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, LL/f;-><init>(Ljava/lang/String;LL0/U;LQ0/k$b;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LL/i;->w:LL/f;

    :cond_0
    iget-object v0, p0, LL/i;->w:LL/f;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final N2(LY0/d;)LL/f;
    .locals 2

    iget-object v0, p0, LL/i;->y:LL/i$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LL/i$a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LL/i$a;->a()LL/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LL/f;->m(LY0/d;)V

    return-object v0

    :cond_0
    invoke-direct {p0}, LL/i;->M2()LL/f;

    move-result-object v0

    invoke-virtual {v0, p1}, LL/f;->m(LY0/d;)V

    return-object v0
.end method

.method private final O2()V
    .locals 0

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    invoke-static {p0}, LE0/E;->b(LE0/B;)V

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method

.method private final P2(Ljava/lang/String;)Z
    .locals 12

    iget-object v0, p0, LL/i;->y:LL/i$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LL/i$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v8, 0x0

    if-eqz v1, :cond_0

    return v8

    :cond_0
    invoke-virtual {v0, p1}, LL/i$a;->f(Ljava/lang/String;)V

    invoke-virtual {v0}, LL/i$a;->a()LL/f;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, LL/i;->o:LL0/U;

    iget-object v3, p0, LL/i;->p:LQ0/k$b;

    iget v4, p0, LL/i;->q:I

    iget-boolean v5, p0, LL/i;->r:Z

    iget v6, p0, LL/i;->s:I

    iget v9, p0, LL/i;->t:I

    move-object v1, p1

    move v7, v9

    invoke-virtual/range {v0 .. v7}, LL/f;->p(Ljava/lang/String;LL0/U;LQ0/k$b;IZII)V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    return v8

    :cond_2
    new-instance v9, LL/i$a;

    iget-object v1, p0, LL/i;->n:Ljava/lang/String;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, LL/i$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZLL/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, LL/f;

    iget-object v2, p0, LL/i;->o:LL0/U;

    iget-object v3, p0, LL/i;->p:LQ0/k$b;

    iget v4, p0, LL/i;->q:I

    iget-boolean v5, p0, LL/i;->r:Z

    iget v6, p0, LL/i;->s:I

    iget v8, p0, LL/i;->t:I

    const/4 v11, 0x0

    move-object v0, v10

    move-object v1, p1

    move v7, v8

    move-object v8, v11

    invoke-direct/range {v0 .. v8}, LL/f;-><init>(Ljava/lang/String;LL0/U;LQ0/k$b;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, LL/i;->M2()LL/f;

    move-result-object v0

    invoke-virtual {v0}, LL/f;->a()LY0/d;

    move-result-object v0

    invoke-virtual {v10, v0}, LL/f;->m(LY0/d;)V

    invoke-virtual {v9, v10}, LL/i$a;->d(LL/f;)V

    iput-object v9, p0, LL/i;->y:LL/i$a;

    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LL/i;->N2(LY0/d;)LL/f;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p1}, LL/f;->j(LY0/t;)I

    move-result p1

    return p1
.end method

.method public J(Lo0/c;)V
    .locals 12

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, LL/i;->N2(LY0/d;)LL/f;

    move-result-object v0

    invoke-virtual {v0}, LL/f;->e()LL0/p;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-virtual {v0}, LL/f;->b()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v0}, LL/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    int-to-float v5, v2

    invoke-virtual {v0}, LL/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v0

    int-to-float v6, v0

    invoke-interface {p1}, Lm0/n0;->j()V

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lm0/n0;->p(Lm0/n0;FFFFIILjava/lang/Object;)V

    :cond_1
    :try_start_0
    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0}, LL0/U;->A()LW0/k;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, LW0/k;->b:LW0/k$a;

    invoke-virtual {v0}, LW0/k$a;->c()LW0/k;

    move-result-object v0

    :cond_2
    move-object v6, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :goto_0
    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0}, LL0/U;->x()Lm0/g1;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lm0/g1;->d:Lm0/g1$a;

    invoke-virtual {v0}, Lm0/g1$a;->a()Lm0/g1;

    move-result-object v0

    :cond_3
    move-object v5, v0

    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0}, LL0/U;->i()Lo0/g;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Lo0/j;->a:Lo0/j;

    :cond_4
    move-object v7, v0

    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0}, LL0/U;->g()Lm0/l0;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0}, LL0/U;->d()F

    move-result v4

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v10}, LL0/p;->d(LL0/p;Lm0/n0;Lm0/l0;FLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V

    goto :goto_4

    :cond_5
    iget-object v0, p0, LL/i;->u:Lm0/y0;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lm0/y0;->a()J

    move-result-wide v2

    goto :goto_1

    :cond_6
    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->e()J

    move-result-wide v2

    :goto_1
    const-wide/16 v8, 0x10

    cmp-long v0, v2, v8

    if-eqz v0, :cond_7

    :goto_2
    move-wide v3, v2

    goto :goto_3

    :cond_7
    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0}, LL0/U;->h()J

    move-result-wide v2

    cmp-long v0, v2, v8

    if-eqz v0, :cond_8

    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0}, LL0/U;->h()J

    move-result-wide v2

    goto :goto_2

    :cond_8
    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->a()J

    move-result-wide v2

    goto :goto_2

    :goto_3
    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v10}, LL0/p;->w(LL0/p;Lm0/n0;JLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    if-eqz v11, :cond_9

    invoke-interface {p1}, Lm0/n0;->r()V

    :cond_9
    return-void

    :goto_5
    if-eqz v11, :cond_a

    invoke-interface {p1}, Lm0/n0;->r()V

    :cond_a
    throw v0

    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "no paragraph (layoutCache="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LL/i;->w:LL/f;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textSubstitution="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LL/i;->y:LL/i$a;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L2(ZZZ)V
    .locals 8

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    invoke-direct {p0}, LL/i;->M2()LL/f;

    move-result-object v0

    iget-object v1, p0, LL/i;->n:Ljava/lang/String;

    iget-object v2, p0, LL/i;->o:LL0/U;

    iget-object v3, p0, LL/i;->p:LQ0/k$b;

    iget v4, p0, LL/i;->q:I

    iget-boolean v5, p0, LL/i;->r:Z

    iget v6, p0, LL/i;->s:I

    iget v7, p0, LL/i;->t:I

    invoke-virtual/range {v0 .. v7}, LL/f;->p(Ljava/lang/String;LL0/U;LQ0/k$b;IZII)V

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    iget-object v0, p0, LL/i;->x:Lmh/l;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_4
    if-nez p2, :cond_5

    if-eqz p3, :cond_6

    :cond_5
    invoke-static {p0}, LE0/E;->b(LE0/B;)V

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    :cond_7
    return-void
.end method

.method public final Q2(Lm0/y0;LL0/U;)Z
    .locals 1

    iget-object v0, p0, LL/i;->u:Lm0/y0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iput-object p1, p0, LL/i;->u:Lm0/y0;

    if-eqz v0, :cond_1

    iget-object p1, p0, LL/i;->o:LL0/U;

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

.method public final R2(LL0/U;IIZLQ0/k$b;I)Z
    .locals 2

    iget-object v0, p0, LL/i;->o:LL0/U;

    invoke-virtual {v0, p1}, LL0/U;->G(LL0/U;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, LL/i;->o:LL0/U;

    iget p1, p0, LL/i;->t:I

    if-eq p1, p2, :cond_0

    iput p2, p0, LL/i;->t:I

    move v0, v1

    :cond_0
    iget p1, p0, LL/i;->s:I

    if-eq p1, p3, :cond_1

    iput p3, p0, LL/i;->s:I

    move v0, v1

    :cond_1
    iget-boolean p1, p0, LL/i;->r:Z

    if-eq p1, p4, :cond_2

    iput-boolean p4, p0, LL/i;->r:Z

    move v0, v1

    :cond_2
    iget-object p1, p0, LL/i;->p:LQ0/k$b;

    invoke-static {p1, p5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iput-object p5, p0, LL/i;->p:LQ0/k$b;

    move v0, v1

    :cond_3
    iget p1, p0, LL/i;->q:I

    invoke-static {p1, p6}, LW0/t;->e(II)Z

    move-result p1

    if-nez p1, :cond_4

    iput p6, p0, LL/i;->q:I

    goto :goto_0

    :cond_4
    move v1, v0

    :goto_0
    return v1
.end method

.method public final S2(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LL/i;->n:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p1, p0, LL/i;->n:Ljava/lang/String;

    invoke-direct {p0}, LL/i;->K2()V

    const/4 p1, 0x1

    return p1
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 5

    invoke-direct {p0, p1}, LL/i;->N2(LY0/d;)LL/f;

    move-result-object v0

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v1

    invoke-virtual {v0, p3, p4, v1}, LL/f;->h(JLY0/t;)Z

    move-result p3

    invoke-virtual {v0}, LL/f;->d()LYg/J;

    invoke-virtual {v0}, LL/f;->e()LL0/p;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LL/f;->c()J

    move-result-wide v0

    if-eqz p3, :cond_1

    invoke-static {p0}, LE0/E;->a(LE0/B;)V

    iget-object p3, p0, LL/i;->v:Ljava/util/Map;

    if-nez p3, :cond_0

    new-instance p3, Ljava/util/LinkedHashMap;

    const/4 v2, 0x2

    invoke-direct {p3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    :cond_0
    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v2

    invoke-interface {p4}, LL0/p;->k()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v2

    invoke-interface {p4}, LL0/p;->g()F

    move-result p4

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, v2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, LL/i;->v:Ljava/util/Map;

    :cond_1
    sget-object p3, LY0/b;->b:LY0/b$a;

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p4

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v3

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v4

    invoke-virtual {p3, p4, v2, v3, v4}, LY0/b$a;->b(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p3

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result p4

    iget-object v0, p0, LL/i;->v:Ljava/util/Map;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, LL/i$f;

    invoke-direct {v1, p2}, LL/i$f;-><init>(Landroidx/compose/ui/layout/t;)V

    invoke-interface {p1, p3, p4, v0, v1}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LL/i;->N2(LY0/d;)LL/f;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LL/f;->f(ILY0/t;)I

    move-result p1

    return p1
.end method

.method public q(LJ0/w;)V
    .locals 9

    iget-object v0, p0, LL/i;->x:Lmh/l;

    if-nez v0, :cond_0

    new-instance v0, LL/i$b;

    invoke-direct {v0, p0}, LL/i$b;-><init>(LL/i;)V

    iput-object v0, p0, LL/i;->x:Lmh/l;

    :cond_0
    new-instance v7, LL0/d;

    iget-object v2, p0, LL/i;->n:Ljava/lang/String;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v7}, LJ0/t;->o0(LJ0/w;LL0/d;)V

    iget-object v1, p0, LL/i;->y:LL/i$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LL/i$a;->c()Z

    move-result v2

    invoke-static {p1, v2}, LJ0/t;->m0(LJ0/w;Z)V

    new-instance v2, LL0/d;

    invoke-virtual {v1}, LL/i$a;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v2}, LJ0/t;->s0(LJ0/w;LL0/d;)V

    :cond_1
    new-instance v1, LL/i$c;

    invoke-direct {v1, p0}, LL/i$c;-><init>(LL/i;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v2, v1, v3, v2}, LJ0/t;->u0(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    new-instance v1, LL/i$d;

    invoke-direct {v1, p0}, LL/i$d;-><init>(LL/i;)V

    invoke-static {p1, v2, v1, v3, v2}, LJ0/t;->z0(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    new-instance v1, LL/i$e;

    invoke-direct {v1, p0}, LL/i$e;-><init>(LL/i;)V

    invoke-static {p1, v2, v1, v3, v2}, LJ0/t;->d(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    invoke-static {p1, v2, v0, v3, v2}, LJ0/t;->u(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LL/i;->N2(LY0/d;)LL/f;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p1}, LL/f;->k(LY0/t;)I

    move-result p1

    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LL/i;->N2(LY0/d;)LL/f;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LL/f;->f(ILY0/t;)I

    move-result p1

    return p1
.end method
