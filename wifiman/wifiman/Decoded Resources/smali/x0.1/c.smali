.class public final Lx0/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A0;
.implements Lx0/a;


# instance fields
.field private n:Lx0/a;

.field private o:Lx0/b;

.field private final p:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx0/a;Lx0/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Lx0/c;->n:Lx0/a;

    if-nez p2, :cond_0

    new-instance p2, Lx0/b;

    invoke-direct {p2}, Lx0/b;-><init>()V

    :cond_0
    iput-object p2, p0, Lx0/c;->o:Lx0/b;

    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    iput-object p1, p0, Lx0/c;->p:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic D2(Lx0/c;)LIi/N;
    .locals 0

    invoke-direct {p0}, Lx0/c;->E2()LIi/N;

    move-result-object p0

    return-object p0
.end method

.method private final E2()LIi/N;
    .locals 2

    invoke-virtual {p0}, Lx0/c;->G2()Lx0/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {v0}, Lx0/c;->E2()LIi/N;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lx0/c;->o:Lx0/b;

    invoke-virtual {v0}, Lx0/b;->h()LIi/N;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final F2()Lx0/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx0/c;->G2()Lx0/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final H2()V
    .locals 2

    iget-object v0, p0, Lx0/c;->o:Lx0/b;

    invoke-virtual {v0}, Lx0/b;->f()Lx0/c;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-object v0, p0, Lx0/c;->o:Lx0/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx0/b;->j(Lx0/c;)V

    :cond_0
    return-void
.end method

.method private final I2(Lx0/b;)V
    .locals 1

    invoke-direct {p0}, Lx0/c;->H2()V

    if-nez p1, :cond_0

    new-instance p1, Lx0/b;

    invoke-direct {p1}, Lx0/b;-><init>()V

    iput-object p1, p0, Lx0/c;->o:Lx0/b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx0/c;->o:Lx0/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lx0/c;->o:Lx0/b;

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lx0/c;->J2()V

    :cond_2
    return-void
.end method

.method private final J2()V
    .locals 2

    iget-object v0, p0, Lx0/c;->o:Lx0/b;

    invoke-virtual {v0, p0}, Lx0/b;->j(Lx0/c;)V

    iget-object v0, p0, Lx0/c;->o:Lx0/b;

    new-instance v1, Lx0/c$c;

    invoke-direct {v1, p0}, Lx0/c$c;-><init>(Lx0/c;)V

    invoke-virtual {v0, v1}, Lx0/b;->i(Lmh/a;)V

    iget-object v0, p0, Lx0/c;->o:Lx0/b;

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/b;->k(LIi/N;)V

    return-void
.end method


# virtual methods
.method public final G2()Lx0/c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LE0/B0;->b(LE0/A0;)LE0/A0;

    move-result-object v0

    check-cast v0, Lx0/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final K2(Lx0/a;Lx0/b;)V
    .locals 0

    iput-object p1, p0, Lx0/c;->n:Lx0/a;

    invoke-direct {p0, p2}, Lx0/c;->I2(Lx0/b;)V

    return-void
.end method

.method public L1(JJI)J
    .locals 8

    iget-object v0, p0, Lx0/c;->n:Lx0/a;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lx0/a;->L1(JJI)J

    move-result-wide v0

    invoke-direct {p0}, Lx0/c;->F2()Lx0/a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {p1, p2, v0, v1}, Ll0/g;->r(JJ)J

    move-result-wide v3

    invoke-static {p3, p4, v0, v1}, Ll0/g;->q(JJ)J

    move-result-wide v5

    move v7, p5

    invoke-interface/range {v2 .. v7}, Lx0/a;->L1(JJI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    :goto_0
    invoke-static {v0, v1, p1, p2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public R(JLdh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lx0/c$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lx0/c$b;

    iget v1, v0, Lx0/c$b;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx0/c$b;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx0/c$b;

    invoke-direct {v0, p0, p3}, Lx0/c$b;-><init>(Lx0/c;Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lx0/c$b;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx0/c$b;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lx0/c$b;->b:J

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lx0/c$b;->b:J

    iget-object v2, v0, Lx0/c$b;->a:Ljava/lang/Object;

    check-cast v2, Lx0/c;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-direct {p0}, Lx0/c;->F2()Lx0/a;

    move-result-object p3

    if-eqz p3, :cond_5

    iput-object p0, v0, Lx0/c$b;->a:Ljava/lang/Object;

    iput-wide p1, v0, Lx0/c$b;->b:J

    iput v4, v0, Lx0/c$b;->e:I

    invoke-interface {p3, p1, p2, v0}, Lx0/a;->R(JLdh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p3, LY0/y;

    invoke-virtual {p3}, LY0/y;->o()J

    move-result-wide v4

    :goto_2
    move-wide v6, p1

    move-wide p1, v4

    move-wide v4, v6

    goto :goto_3

    :cond_5
    sget-object p3, LY0/y;->b:LY0/y$a;

    invoke-virtual {p3}, LY0/y$a;->a()J

    move-result-wide v4

    move-object v2, p0

    goto :goto_2

    :goto_3
    iget-object p3, v2, Lx0/c;->n:Lx0/a;

    invoke-static {v4, v5, p1, p2}, LY0/y;->k(JJ)J

    move-result-wide v4

    const/4 v2, 0x0

    iput-object v2, v0, Lx0/c$b;->a:Ljava/lang/Object;

    iput-wide p1, v0, Lx0/c$b;->b:J

    iput v3, v0, Lx0/c$b;->e:I

    invoke-interface {p3, v4, v5, v0}, Lx0/a;->R(JLdh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    return-object v1

    :cond_6
    :goto_4
    check-cast p3, LY0/y;

    invoke-virtual {p3}, LY0/y;->o()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/y;->l(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    return-object p1
.end method

.method public V0(JI)J
    .locals 3

    invoke-direct {p0}, Lx0/c;->F2()Lx0/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lx0/a;->V0(JI)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Lx0/c;->n:Lx0/a;

    invoke-static {p1, p2, v0, v1}, Ll0/g;->q(JJ)J

    move-result-wide p1

    invoke-interface {v2, p1, p2, p3}, Lx0/a;->V0(JI)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx0/c;->p:Ljava/lang/Object;

    return-object v0
.end method

.method public g1(JJLdh/e;)Ljava/lang/Object;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Lx0/c$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lx0/c$a;

    iget v3, v2, Lx0/c$a;->f:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lx0/c$a;->f:I

    goto :goto_0

    :cond_0
    new-instance v2, Lx0/c$a;

    invoke-direct {v2, p0, v1}, Lx0/c$a;-><init>(Lx0/c;Ldh/e;)V

    :goto_0
    iget-object v1, v2, Lx0/c$a;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v9

    iget v3, v2, Lx0/c$a;->f:I

    const/4 v10, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v10, :cond_1

    iget-wide v2, v2, Lx0/c$a;->b:J

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-wide v3, v2, Lx0/c$a;->c:J

    iget-wide v5, v2, Lx0/c$a;->b:J

    iget-object v7, v2, Lx0/c$a;->a:Ljava/lang/Object;

    check-cast v7, Lx0/c;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    move-wide v13, v3

    move-wide v11, v5

    goto :goto_1

    :cond_3
    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v3, v0, Lx0/c;->n:Lx0/a;

    iput-object v0, v2, Lx0/c$a;->a:Ljava/lang/Object;

    move-wide/from16 v11, p1

    iput-wide v11, v2, Lx0/c$a;->b:J

    move-wide/from16 v13, p3

    iput-wide v13, v2, Lx0/c$a;->c:J

    iput v4, v2, Lx0/c$a;->f:I

    move-wide/from16 v4, p1

    move-wide/from16 v6, p3

    move-object v8, v2

    invoke-interface/range {v3 .. v8}, Lx0/a;->g1(JJLdh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_4

    return-object v9

    :cond_4
    move-object v7, v0

    :goto_1
    check-cast v1, LY0/y;

    invoke-virtual {v1}, LY0/y;->o()J

    move-result-wide v4

    invoke-direct {v7}, Lx0/c;->F2()Lx0/a;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v11, v12, v4, v5}, LY0/y;->l(JJ)J

    move-result-wide v6

    invoke-static {v13, v14, v4, v5}, LY0/y;->k(JJ)J

    move-result-wide v11

    const/4 v1, 0x0

    iput-object v1, v2, Lx0/c$a;->a:Ljava/lang/Object;

    iput-wide v4, v2, Lx0/c$a;->b:J

    iput v10, v2, Lx0/c$a;->f:I

    move-wide v13, v4

    move-wide v4, v6

    move-wide v6, v11

    move-object v8, v2

    invoke-interface/range {v3 .. v8}, Lx0/a;->g1(JJLdh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_5

    return-object v9

    :cond_5
    move-wide v2, v13

    :goto_2
    check-cast v1, LY0/y;

    invoke-virtual {v1}, LY0/y;->o()J

    move-result-wide v4

    move-wide v13, v2

    goto :goto_3

    :cond_6
    move-wide v13, v4

    sget-object v1, LY0/y;->b:LY0/y$a;

    invoke-virtual {v1}, LY0/y$a;->a()J

    move-result-wide v4

    :goto_3
    invoke-static {v13, v14, v4, v5}, LY0/y;->l(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/y;->b(J)LY0/y;

    move-result-object v1

    return-object v1
.end method

.method public n2()V
    .locals 0

    invoke-direct {p0}, Lx0/c;->J2()V

    return-void
.end method

.method public o2()V
    .locals 0

    invoke-direct {p0}, Lx0/c;->H2()V

    return-void
.end method
