.class public final LE0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/S$a;,
        LE0/S$b;
    }
.end annotation


# instance fields
.field private final a:LE0/G;

.field private final b:LE0/o;

.field private c:Z

.field private d:Z

.field private final e:LE0/k0;

.field private final f:LV/b;

.field private g:J

.field private final h:LV/b;

.field private i:LY0/b;

.field private final j:LE0/N;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/G;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/S;->a:LE0/G;

    new-instance v0, LE0/o;

    sget-object v1, LE0/m0;->L:LE0/m0$a;

    invoke-virtual {v1}, LE0/m0$a;->a()Z

    move-result v2

    invoke-direct {v0, v2}, LE0/o;-><init>(Z)V

    iput-object v0, p0, LE0/S;->b:LE0/o;

    new-instance v2, LE0/k0;

    invoke-direct {v2}, LE0/k0;-><init>()V

    iput-object v2, p0, LE0/S;->e:LE0/k0;

    new-instance v2, LV/b;

    const/16 v3, 0x10

    new-array v4, v3, [LE0/m0$b;

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v2, p0, LE0/S;->f:LV/b;

    const-wide/16 v6, 0x1

    iput-wide v6, p0, LE0/S;->g:J

    new-instance v2, LV/b;

    new-array v3, v3, [LE0/S$a;

    invoke-direct {v2, v3, v5}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v2, p0, LE0/S;->h:LV/b;

    invoke-virtual {v1}, LE0/m0$a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LE0/N;

    invoke-virtual {v2}, LV/b;->g()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, p1, v0, v2}, LE0/N;-><init>(LE0/G;LE0/o;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, LE0/S;->j:LE0/N;

    return-void
.end method

.method private final A(LE0/G;Z)V
    .locals 1

    invoke-virtual {p1}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LE0/S;->a:LE0/G;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, LE0/S;->i:LY0/b;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_2

    invoke-direct {p0, p1, v0}, LE0/S;->e(LE0/G;LY0/b;)Z

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1, v0}, LE0/S;->f(LE0/G;LY0/b;)Z

    :goto_1
    return-void
.end method

.method public static synthetic G(LE0/S;LE0/G;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LE0/S;->F(LE0/G;Z)Z

    move-result p0

    return p0
.end method

.method public static final synthetic a(LE0/S;)LE0/G;
    .locals 0

    iget-object p0, p0, LE0/S;->a:LE0/G;

    return-object p0
.end method

.method private final b()V
    .locals 4

    iget-object v0, p0, LE0/S;->f:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LE0/m0$b;

    invoke-interface {v3}, LE0/m0$b;->d()V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    iget-object v0, p0, LE0/S;->f:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    return-void
.end method

.method public static synthetic d(LE0/S;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LE0/S;->c(Z)V

    return-void
.end method

.method private final e(LE0/G;LY0/b;)Z
    .locals 9

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, LE0/G;->P0(LY0/b;)Z

    move-result p2

    goto :goto_0

    :cond_1
    invoke-static {p1, v2, v0, v2}, LE0/G;->Q0(LE0/G;LY0/b;ILjava/lang/Object;)Z

    move-result p2

    :goto_0
    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object v3

    if-eqz p2, :cond_4

    if-eqz v3, :cond_4

    invoke-virtual {v3}, LE0/G;->a0()LE0/G;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LE0/G;->g0()LE0/G$g;

    move-result-object v4

    sget-object v5, LE0/G$g;->InMeasureBlock:LE0/G$g;

    if-ne v4, v5, :cond_3

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, LE0/G;->g0()LE0/G$g;

    move-result-object p1

    sget-object v4, LE0/G$g;->InLayoutBlock:LE0/G$g;

    if-ne p1, v4, :cond_4

    invoke-static {v3, v1, v0, v2}, LE0/G;->q1(LE0/G;ZILjava/lang/Object;)V

    :cond_4
    :goto_1
    return p2
.end method

.method private final f(LE0/G;LY0/b;)Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, LE0/G;->k1(LY0/b;)Z

    move-result p2

    goto :goto_0

    :cond_0
    invoke-static {p1, v1, v0, v1}, LE0/G;->l1(LE0/G;LY0/b;ILjava/lang/Object;)Z

    move-result p2

    :goto_0
    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz p2, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, LE0/G;->f0()LE0/G$g;

    move-result-object v3

    sget-object v4, LE0/G$g;->InMeasureBlock:LE0/G$g;

    if-ne v3, v4, :cond_1

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LE0/G;->f0()LE0/G$g;

    move-result-object p1

    sget-object v3, LE0/G$g;->InLayoutBlock:LE0/G$g;

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    invoke-static {v2, p1, v0, v1}, LE0/G;->u1(LE0/G;ZILjava/lang/Object;)V

    :cond_2
    :goto_1
    return p2
.end method

.method private final g()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LE0/S;->h:LV/b;

    invoke-virtual {v1}, LV/b;->u()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, LE0/S;->h:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, LE0/S$a;

    invoke-virtual {v4}, LE0/S$a;->a()LE0/G;

    move-result-object v5

    invoke-virtual {v5}, LE0/G;->K0()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, LE0/S$a;->c()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4}, LE0/S$a;->a()LE0/G;

    move-result-object v6

    invoke-virtual {v4}, LE0/S$a;->b()Z

    move-result v7

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, LE0/S$a;->a()LE0/G;

    move-result-object v12

    invoke-virtual {v4}, LE0/S$a;->b()Z

    move-result v13

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_2
    :goto_0
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_3
    iget-object v1, v0, LE0/S;->h:LV/b;

    invoke-virtual {v1}, LV/b;->h()V

    :cond_4
    return-void
.end method

.method private final h(LE0/G;)V
    .locals 5

    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, LE0/G;

    invoke-virtual {v2}, LE0/G;->N0()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, LE0/G;->L0()Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, LE0/S;->b:LE0/o;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4}, LE0/o;->e(LE0/G;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, LE0/G;->R0()V

    :cond_1
    invoke-direct {p0, v2}, LE0/S;->h(LE0/G;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_3
    return-void
.end method

.method private final j(LE0/G;Z)V
    .locals 7

    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LE0/G;

    if-nez p2, :cond_1

    invoke-direct {p0, v4}, LE0/S;->o(LE0/G;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    if-eqz p2, :cond_5

    invoke-direct {p0, v4}, LE0/S;->p(LE0/G;)Z

    move-result v5

    if-eqz v5, :cond_5

    :cond_2
    invoke-static {v4}, LE0/M;->a(LE0/G;)Z

    move-result v5

    if-eqz v5, :cond_4

    if-nez p2, :cond_4

    invoke-virtual {v4}, LE0/G;->Y()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    iget-object v5, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v5, v4, v6}, LE0/o;->e(LE0/G;Z)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-direct {p0, v4, v6, v2}, LE0/S;->x(LE0/G;ZZ)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v4, v6}, LE0/S;->i(LE0/G;Z)V

    :cond_4
    :goto_0
    invoke-direct {p0, v4, p2}, LE0/S;->w(LE0/G;Z)V

    invoke-direct {p0, v4, p2}, LE0/S;->u(LE0/G;Z)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-direct {p0, v4, p2}, LE0/S;->j(LE0/G;Z)V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    :cond_6
    invoke-direct {p0, p1, p2}, LE0/S;->w(LE0/G;Z)V

    return-void
.end method

.method private final k(LE0/G;)Z
    .locals 1

    invoke-virtual {p1}, LE0/G;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LE0/S;->o(LE0/G;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final l(LE0/G;)Z
    .locals 1

    invoke-virtual {p1}, LE0/G;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LE0/S;->p(LE0/G;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final o(LE0/G;)Z
    .locals 2

    invoke-virtual {p1}, LE0/G;->f0()LE0/G$g;

    move-result-object v0

    sget-object v1, LE0/G$g;->InMeasureBlock:LE0/G$g;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, LE0/G;->U()LE0/L;

    move-result-object p1

    invoke-virtual {p1}, LE0/L;->r()LE0/b;

    move-result-object p1

    invoke-interface {p1}, LE0/b;->p()LE0/a;

    move-result-object p1

    invoke-virtual {p1}, LE0/a;->k()Z

    move-result p1

    if-eqz p1, :cond_0

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

.method private final p(LE0/G;)Z
    .locals 3

    invoke-virtual {p1}, LE0/G;->g0()LE0/G$g;

    move-result-object v0

    sget-object v1, LE0/G$g;->InMeasureBlock:LE0/G$g;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, LE0/G;->U()LE0/L;

    move-result-object p1

    invoke-virtual {p1}, LE0/L;->C()LE0/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LE0/b;->p()LE0/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LE0/a;->k()Z

    move-result p1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method private final u(LE0/G;Z)Z
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LE0/G;->Y()Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LE0/G;->d0()Z

    move-result p1

    :goto_0
    return p1
.end method

.method private final w(LE0/G;Z)V
    .locals 1

    invoke-direct {p0, p1, p2}, LE0/S;->u(LE0/G;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v0, p1, p2}, LE0/o;->e(LE0/G;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LE0/S;->x(LE0/G;ZZ)Z

    :cond_0
    return-void
.end method

.method private final x(LE0/G;ZZ)Z
    .locals 3

    invoke-virtual {p1}, LE0/G;->L0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LE0/G;->q()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LE0/G;->M0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LE0/S;->k(LE0/G;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LE0/G;->N0()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LE0/S;->l(LE0/G;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LE0/G;->C()Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_1
    iget-object v0, p0, LE0/S;->a:LE0/G;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, LE0/S;->i:LY0/b;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_5

    invoke-virtual {p1}, LE0/G;->Y()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-direct {p0, p1, v0}, LE0/S;->e(LE0/G;LY0/b;)Z

    move-result v1

    :cond_3
    if-eqz p3, :cond_a

    if-nez v1, :cond_4

    invoke-virtual {p1}, LE0/G;->X()Z

    move-result p2

    if-eqz p2, :cond_a

    :cond_4
    invoke-virtual {p1}, LE0/G;->N0()Ljava/lang/Boolean;

    move-result-object p2

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, LE0/G;->R0()V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, LE0/G;->d0()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-direct {p0, p1, v0}, LE0/S;->f(LE0/G;LY0/b;)Z

    move-result p2

    goto :goto_1

    :cond_6
    move p2, v1

    :goto_1
    if-eqz p3, :cond_9

    invoke-virtual {p1}, LE0/G;->V()Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object p3, p0, LE0/S;->a:LE0/G;

    if-eq p1, p3, :cond_7

    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p3

    if-eqz p3, :cond_9

    invoke-virtual {p3}, LE0/G;->q()Z

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_9

    invoke-virtual {p1}, LE0/G;->M0()Z

    move-result p3

    if-eqz p3, :cond_9

    :cond_7
    iget-object p3, p0, LE0/S;->a:LE0/G;

    if-ne p1, p3, :cond_8

    invoke-virtual {p1, v1, v1}, LE0/G;->i1(II)V

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, LE0/G;->o1()V

    :goto_2
    iget-object p3, p0, LE0/S;->e:LE0/k0;

    invoke-virtual {p3, p1}, LE0/k0;->d(LE0/G;)V

    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, LE0/N;->a()V

    :cond_9
    move v1, p2

    :cond_a
    :goto_3
    invoke-direct {p0}, LE0/S;->g()V

    :cond_b
    return v1
.end method

.method static synthetic y(LE0/S;LE0/G;ZZILjava/lang/Object;)Z
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LE0/S;->x(LE0/G;ZZ)Z

    move-result p0

    return p0
.end method

.method private final z(LE0/G;)V
    .locals 4

    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, LE0/G;

    invoke-direct {p0, v2}, LE0/S;->o(LE0/G;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, LE0/M;->a(LE0/G;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    invoke-direct {p0, v2, v3}, LE0/S;->A(LE0/G;Z)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, v2}, LE0/S;->z(LE0/G;)V

    :cond_2
    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final B(LE0/G;Z)Z
    .locals 4

    invoke-virtual {p1}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/S$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_b

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_b

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, LE0/G;->Y()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, LE0/G;->X()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    if-nez p2, :cond_3

    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, LE0/N;->a()V

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, LE0/G;->T0()V

    invoke-virtual {p1}, LE0/G;->S0()V

    invoke-virtual {p1}, LE0/G;->L0()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p2

    invoke-virtual {p1}, LE0/G;->N0()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz p2, :cond_5

    invoke-virtual {p2}, LE0/G;->Y()Z

    move-result v0

    if-ne v0, v2, :cond_5

    goto :goto_1

    :cond_5
    if-eqz p2, :cond_6

    invoke-virtual {p2}, LE0/G;->X()Z

    move-result v0

    if-ne v0, v2, :cond_6

    goto :goto_1

    :cond_6
    iget-object p2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {p2, p1, v2}, LE0/o;->c(LE0/G;Z)V

    goto :goto_2

    :cond_7
    :goto_1
    invoke-virtual {p1}, LE0/G;->q()Z

    move-result v0

    if-eqz v0, :cond_a

    if-eqz p2, :cond_8

    invoke-virtual {p2}, LE0/G;->V()Z

    move-result v0

    if-ne v0, v2, :cond_8

    goto :goto_2

    :cond_8
    if-eqz p2, :cond_9

    invoke-virtual {p2}, LE0/G;->d0()Z

    move-result p2

    if-ne p2, v2, :cond_9

    goto :goto_2

    :cond_9
    iget-object p2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {p2, p1, v1}, LE0/o;->c(LE0/G;Z)V

    :cond_a
    :goto_2
    iget-boolean p1, p0, LE0/S;->d:Z

    if-nez p1, :cond_c

    move v1, v2

    goto :goto_3

    :cond_b
    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, LE0/N;->a()V

    :cond_c
    :goto_3
    return v1
.end method

.method public final C(LE0/G;Z)Z
    .locals 4

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v3, LE0/S$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    if-eq v0, v2, :cond_c

    const/4 v3, 0x2

    if-eq v0, v3, :cond_b

    const/4 v3, 0x3

    if-eq v0, v3, :cond_b

    const/4 v3, 0x4

    if-eq v0, v3, :cond_b

    const/4 v3, 0x5

    if-ne v0, v3, :cond_a

    invoke-virtual {p1}, LE0/G;->Y()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p1}, LE0/G;->U0()V

    invoke-virtual {p1}, LE0/G;->V0()V

    invoke-virtual {p1}, LE0/G;->L0()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, LE0/G;->N0()Ljava/lang/Boolean;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-direct {p0, p1}, LE0/S;->l(LE0/G;)Z

    move-result p2

    if-eqz p2, :cond_5

    :cond_4
    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, LE0/G;->Y()Z

    move-result p2

    if-ne p2, v2, :cond_8

    :cond_5
    invoke-virtual {p1}, LE0/G;->q()Z

    move-result p2

    if-nez p2, :cond_6

    invoke-direct {p0, p1}, LE0/S;->k(LE0/G;)Z

    move-result p2

    if-eqz p2, :cond_9

    :cond_6
    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, LE0/G;->d0()Z

    move-result p2

    if-ne p2, v2, :cond_7

    goto :goto_1

    :cond_7
    iget-object p2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {p2, p1, v1}, LE0/o;->c(LE0/G;Z)V

    goto :goto_1

    :cond_8
    iget-object p2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {p2, p1, v2}, LE0/o;->c(LE0/G;Z)V

    :cond_9
    :goto_1
    iget-boolean p1, p0, LE0/S;->d:Z

    if-nez p1, :cond_c

    move v1, v2

    goto :goto_2

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    iget-object v0, p0, LE0/S;->h:LV/b;

    new-instance v3, LE0/S$a;

    invoke-direct {v3, p1, v2, p2}, LE0/S$a;-><init>(LE0/G;ZZ)V

    invoke-virtual {v0, v3}, LV/b;->b(Ljava/lang/Object;)Z

    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, LE0/N;->a()V

    :cond_c
    :goto_2
    return v1
.end method

.method public final D(LE0/G;)V
    .locals 1

    iget-object v0, p0, LE0/S;->e:LE0/k0;

    invoke-virtual {v0, p1}, LE0/k0;->d(LE0/G;)V

    return-void
.end method

.method public final E(LE0/G;Z)Z
    .locals 4

    invoke-virtual {p1}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/S$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_7

    const/4 v3, 0x3

    if-eq v0, v3, :cond_7

    const/4 v3, 0x4

    if-eq v0, v3, :cond_7

    const/4 v3, 0x5

    if-ne v0, v3, :cond_6

    if-nez p2, :cond_2

    invoke-virtual {p1}, LE0/G;->q()Z

    move-result p2

    invoke-virtual {p1}, LE0/G;->M0()Z

    move-result v0

    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, LE0/G;->d0()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, LE0/G;->V()Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_0
    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LE0/N;->a()V

    :cond_1
    :goto_0
    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, LE0/G;->S0()V

    invoke-virtual {p1}, LE0/G;->L0()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, LE0/G;->M0()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LE0/G;->V()Z

    move-result v0

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    if-eqz p2, :cond_5

    invoke-virtual {p2}, LE0/G;->d0()Z

    move-result p2

    if-ne p2, v1, :cond_5

    goto :goto_1

    :cond_5
    iget-object p2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {p2, p1, v2}, LE0/o;->c(LE0/G;Z)V

    :goto_1
    iget-boolean p1, p0, LE0/S;->d:Z

    if-nez p1, :cond_1

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LE0/N;->a()V

    goto :goto_0

    :goto_2
    return v1
.end method

.method public final F(LE0/G;Z)Z
    .locals 4

    invoke-virtual {p1}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/S$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_6

    const/4 v3, 0x4

    if-eq v0, v3, :cond_6

    const/4 v3, 0x5

    if-ne v0, v3, :cond_5

    invoke-virtual {p1}, LE0/G;->d0()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    move v1, v2

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, LE0/G;->V0()V

    invoke-virtual {p1}, LE0/G;->L0()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LE0/G;->q()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-direct {p0, p1}, LE0/S;->k(LE0/G;)Z

    move-result p2

    if-eqz p2, :cond_0

    :cond_3
    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LE0/G;->d0()Z

    move-result p2

    if-ne p2, v1, :cond_4

    goto :goto_1

    :cond_4
    iget-object p2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {p2, p1, v2}, LE0/o;->c(LE0/G;Z)V

    :goto_1
    iget-boolean p1, p0, LE0/S;->d:Z

    if-nez p1, :cond_0

    goto :goto_2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    iget-object v0, p0, LE0/S;->h:LV/b;

    new-instance v1, LE0/S$a;

    invoke-direct {v1, p1, v2, p2}, LE0/S$a;-><init>(LE0/G;ZZ)V

    invoke-virtual {v0, v1}, LV/b;->b(Ljava/lang/Object;)Z

    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LE0/N;->a()V

    goto :goto_0

    :goto_2
    return v1
.end method

.method public final H(J)V
    .locals 4

    iget-object v0, p0, LE0/S;->i:LY0/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LY0/b;->r()J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, LY0/b;->f(JJ)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_4

    iget-boolean v0, p0, LE0/S;->c:Z

    if-eqz v0, :cond_1

    const-string v0, "updateRootConstraints called while measuring"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_1
    invoke-static {p1, p2}, LY0/b;->a(J)LY0/b;

    move-result-object p1

    iput-object p1, p0, LE0/S;->i:LY0/b;

    iget-object p1, p0, LE0/S;->a:LE0/G;

    invoke-virtual {p1}, LE0/G;->a0()LE0/G;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LE0/S;->a:LE0/G;

    invoke-virtual {p1}, LE0/G;->U0()V

    :cond_2
    iget-object p1, p0, LE0/S;->a:LE0/G;

    invoke-virtual {p1}, LE0/G;->V0()V

    iget-object p1, p0, LE0/S;->b:LE0/o;

    iget-object p2, p0, LE0/S;->a:LE0/G;

    invoke-virtual {p2}, LE0/G;->a0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    invoke-virtual {p1, p2, v1}, LE0/o;->c(LE0/G;Z)V

    :cond_4
    return-void
.end method

.method public final c(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, LE0/S;->e:LE0/k0;

    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-virtual {p1, v0}, LE0/k0;->e(LE0/G;)V

    :cond_0
    iget-object p1, p0, LE0/S;->e:LE0/k0;

    invoke-virtual {p1}, LE0/k0;->a()V

    return-void
.end method

.method public final i(LE0/G;Z)V
    .locals 1

    iget-object v0, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v0, p2}, LE0/o;->g(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, LE0/S;->c:Z

    if-nez v0, :cond_1

    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, p1, p2}, LE0/S;->u(LE0/G;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "node not yet measured"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-direct {p0, p1, p2}, LE0/S;->j(LE0/G;Z)V

    return-void
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v0}, LE0/o;->h()Z

    move-result v0

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, LE0/S;->e:LE0/k0;

    invoke-virtual {v0}, LE0/k0;->c()Z

    move-result v0

    return v0
.end method

.method public final q()J
    .locals 2

    iget-boolean v0, p0, LE0/S;->c:Z

    if-nez v0, :cond_0

    const-string v0, "measureIteration should be only used during the measure/layout pass"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-wide v0, p0, LE0/S;->g:J

    return-wide v0
.end method

.method public final r(Lmh/a;)Z
    .locals 11

    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "performMeasureAndLayout called with unattached root"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->q()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "performMeasureAndLayout called with unplaced root"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, LE0/S;->c:Z

    if-eqz v0, :cond_2

    const-string v0, "performMeasureAndLayout called during measure layout"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LE0/S;->i:LY0/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/S;->c:Z

    iput-boolean v0, p0, LE0/S;->d:Z

    :try_start_0
    iget-object v2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v2}, LE0/o;->h()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, LE0/S;->b:LE0/o;

    move v3, v1

    :cond_3
    :goto_0
    invoke-virtual {v2}, LE0/o;->h()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v2}, LE0/o;->a(LE0/o;)LE0/n;

    move-result-object v4

    invoke-virtual {v4}, LE0/n;->d()Z

    move-result v4

    xor-int/lit8 v7, v4, 0x1

    if-nez v4, :cond_4

    invoke-static {v2}, LE0/o;->a(LE0/o;)LE0/n;

    move-result-object v4

    :goto_1
    invoke-virtual {v4}, LE0/n;->e()LE0/G;

    move-result-object v4

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {v2}, LE0/o;->b(LE0/o;)LE0/n;

    move-result-object v4

    goto :goto_1

    :goto_2
    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    move-object v6, v4

    invoke-static/range {v5 .. v10}, LE0/S;->y(LE0/S;LE0/G;ZZILjava/lang/Object;)Z

    move-result v5

    invoke-static {p0}, LE0/S;->a(LE0/S;)LE0/G;

    move-result-object v6

    if-ne v4, v6, :cond_3

    if-eqz v5, :cond_3

    move v3, v0

    goto :goto_0

    :cond_5
    if-eqz p1, :cond_7

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_6
    move v3, v1

    :cond_7
    :goto_3
    iput-boolean v1, p0, LE0/S;->c:Z

    iput-boolean v1, p0, LE0/S;->d:Z

    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, LE0/N;->a()V

    :cond_8
    move v1, v3

    goto :goto_5

    :goto_4
    iput-boolean v1, p0, LE0/S;->c:Z

    iput-boolean v1, p0, LE0/S;->d:Z

    throw p1

    :cond_9
    :goto_5
    invoke-direct {p0}, LE0/S;->b()V

    return v1
.end method

.method public final s(LE0/G;J)V
    .locals 3

    invoke-virtual {p1}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "measureAndLayout called on root"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "performMeasureAndLayout called with unattached root"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->q()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "performMeasureAndLayout called with unplaced root"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_3
    iget-boolean v0, p0, LE0/S;->c:Z

    if-eqz v0, :cond_4

    const-string v0, "performMeasureAndLayout called during measure layout"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, LE0/S;->i:LY0/b;

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/S;->c:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/S;->d:Z

    :try_start_0
    iget-object v1, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v1, p1}, LE0/o;->i(LE0/G;)Z

    invoke-static {p2, p3}, LY0/b;->a(J)LY0/b;

    move-result-object v1

    invoke-direct {p0, p1, v1}, LE0/S;->e(LE0/G;LY0/b;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1}, LE0/G;->X()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_5
    :goto_0
    invoke-virtual {p1}, LE0/G;->N0()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, LE0/G;->R0()V

    :cond_6
    invoke-direct {p0, p1}, LE0/S;->h(LE0/G;)V

    invoke-static {p2, p3}, LY0/b;->a(J)LY0/b;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LE0/S;->f(LE0/G;LY0/b;)Z

    invoke-virtual {p1}, LE0/G;->V()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, LE0/G;->q()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, LE0/G;->o1()V

    iget-object p2, p0, LE0/S;->e:LE0/k0;

    invoke-virtual {p2, p1}, LE0/k0;->d(LE0/G;)V

    :cond_7
    invoke-direct {p0}, LE0/S;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LE0/S;->c:Z

    iput-boolean v0, p0, LE0/S;->d:Z

    iget-object p1, p0, LE0/S;->j:LE0/N;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, LE0/N;->a()V

    goto :goto_2

    :goto_1
    iput-boolean v0, p0, LE0/S;->c:Z

    iput-boolean v0, p0, LE0/S;->d:Z

    throw p1

    :cond_8
    :goto_2
    invoke-direct {p0}, LE0/S;->b()V

    return-void
.end method

.method public final t()V
    .locals 3

    iget-object v0, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v0}, LE0/o;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "performMeasureAndLayout called with unattached root"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->q()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "performMeasureAndLayout called with unplaced root"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, LE0/S;->c:Z

    if-eqz v0, :cond_2

    const-string v0, "performMeasureAndLayout called during measure layout"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LE0/S;->i:LY0/b;

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/S;->c:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LE0/S;->d:Z

    :try_start_0
    iget-object v2, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v2, v0}, LE0/o;->g(Z)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, LE0/S;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->a0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, p0, LE0/S;->a:LE0/G;

    invoke-direct {p0, v2, v0}, LE0/S;->A(LE0/G;Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-direct {p0, v0}, LE0/S;->z(LE0/G;)V

    :cond_4
    :goto_0
    iget-object v0, p0, LE0/S;->a:LE0/G;

    invoke-direct {p0, v0, v1}, LE0/S;->A(LE0/G;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, LE0/S;->c:Z

    iput-boolean v1, p0, LE0/S;->d:Z

    iget-object v0, p0, LE0/S;->j:LE0/N;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LE0/N;->a()V

    goto :goto_2

    :goto_1
    iput-boolean v1, p0, LE0/S;->c:Z

    iput-boolean v1, p0, LE0/S;->d:Z

    throw v0

    :cond_5
    :goto_2
    return-void
.end method

.method public final v(LE0/G;)V
    .locals 1

    iget-object v0, p0, LE0/S;->b:LE0/o;

    invoke-virtual {v0, p1}, LE0/o;->i(LE0/G;)Z

    iget-object v0, p0, LE0/S;->e:LE0/k0;

    invoke-virtual {v0, p1}, LE0/k0;->f(LE0/G;)V

    return-void
.end method
