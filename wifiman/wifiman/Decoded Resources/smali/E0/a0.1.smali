.class public final LE0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/a0$a;,
        LE0/a0$b;
    }
.end annotation


# instance fields
.field private final a:LE0/G;

.field private final b:LE0/w;

.field private c:LE0/c0;

.field private final d:Landroidx/compose/ui/e$c;

.field private e:Landroidx/compose/ui/e$c;

.field private f:LV/b;

.field private g:LV/b;

.field private h:LE0/a0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/G;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/a0;->a:LE0/G;

    new-instance v0, LE0/w;

    invoke-direct {v0, p1}, LE0/w;-><init>(LE0/G;)V

    iput-object v0, p0, LE0/a0;->b:LE0/w;

    iput-object v0, p0, LE0/a0;->c:LE0/c0;

    invoke-virtual {v0}, LE0/w;->B3()LE0/y0;

    move-result-object p1

    iput-object p1, p0, LE0/a0;->d:Landroidx/compose/ui/e$c;

    iput-object p1, p0, LE0/a0;->e:Landroidx/compose/ui/e$c;

    return-void
.end method

.method private final A(ILV/b;LV/b;Landroidx/compose/ui/e$c;Z)V
    .locals 6

    move-object v0, p0

    move-object v1, p4

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LE0/a0;->j(Landroidx/compose/ui/e$c;ILV/b;LV/b;Z)LE0/a0$a;

    move-result-object p4

    invoke-virtual {p2}, LV/b;->o()I

    move-result p2

    sub-int/2addr p2, p1

    invoke-virtual {p3}, LV/b;->o()I

    move-result p3

    sub-int/2addr p3, p1

    invoke-static {p2, p3, p4}, LE0/Y;->e(IILE0/p;)V

    invoke-direct {p0}, LE0/a0;->B()V

    return-void
.end method

.method private final B()V
    .locals 3

    iget-object v0, p0, LE0/a0;->d:Landroidx/compose/ui/e$c;

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_0

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v2

    if-eq v0, v2, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->t2(I)V

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final D(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 5

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "trimChain called on already trimmed chain"

    invoke-static {p1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, LE0/a0;->d:Landroidx/compose/ui/e$c;

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->z2(Landroidx/compose/ui/e$c;)V

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroidx/compose/ui/e$c;->v2(Landroidx/compose/ui/e$c;)V

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v3

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroidx/compose/ui/e$c;->t2(I)V

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroidx/compose/ui/e$c;->C2(LE0/c0;)V

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v0

    if-eq p1, v0, :cond_3

    move v1, v2

    :cond_3
    if-nez v1, :cond_4

    const-string v0, "trimChain did not update the head"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_4
    return-object p1
.end method

.method private final F(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V
    .locals 1

    instance-of p1, p1, LE0/V;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    instance-of p1, p2, LE0/V;

    if-eqz p1, :cond_1

    check-cast p2, LE0/V;

    invoke-static {p2, p3}, LE0/b0;->c(LE0/V;Landroidx/compose/ui/e$c;)V

    invoke-virtual {p3}, Landroidx/compose/ui/e$c;->k2()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p3}, LE0/f0;->e(Landroidx/compose/ui/e$c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Landroidx/compose/ui/e$c;->A2(Z)V

    goto :goto_0

    :cond_1
    instance-of p1, p3, LE0/c;

    if-eqz p1, :cond_3

    move-object p1, p3

    check-cast p1, LE0/c;

    invoke-virtual {p1, p2}, LE0/c;->H2(Landroidx/compose/ui/e$b;)V

    invoke-virtual {p3}, Landroidx/compose/ui/e$c;->k2()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p3}, LE0/f0;->e(Landroidx/compose/ui/e$c;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p3, v0}, Landroidx/compose/ui/e$c;->A2(Z)V

    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown Modifier.Node type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a(LE0/a0;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 0

    invoke-direct {p0, p1, p2}, LE0/a0;->g(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LE0/a0;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 0

    invoke-direct {p0, p1}, LE0/a0;->h(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LE0/a0;)I
    .locals 0

    invoke-direct {p0}, LE0/a0;->i()I

    move-result p0

    return p0
.end method

.method public static final synthetic d(LE0/a0;)LE0/a0$b;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic e(LE0/a0;Landroidx/compose/ui/e$c;LE0/c0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LE0/a0;->v(Landroidx/compose/ui/e$c;LE0/c0;)V

    return-void
.end method

.method public static final synthetic f(LE0/a0;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LE0/a0;->F(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V

    return-void
.end method

.method private final g(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 1

    instance-of v0, p1, LE0/V;

    if-eqz v0, :cond_0

    check-cast p1, LE0/V;

    invoke-virtual {p1}, LE0/V;->a()Landroidx/compose/ui/e$c;

    move-result-object p1

    invoke-static {p1}, LE0/f0;->h(Landroidx/compose/ui/e$c;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->x2(I)V

    goto :goto_0

    :cond_0
    new-instance v0, LE0/c;

    invoke-direct {v0, p1}, LE0/c;-><init>(Landroidx/compose/ui/e$b;)V

    move-object p1, v0

    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->w2(Z)V

    invoke-direct {p0, p1, p2}, LE0/a0;->r(Landroidx/compose/ui/e$c;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    move-result-object p1

    return-object p1
.end method

.method private final h(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 1

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LE0/f0;->d(Landroidx/compose/ui/e$c;)V

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->s2()V

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->m2()V

    :cond_0
    invoke-direct {p0, p1}, LE0/a0;->w(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    move-result-object p1

    return-object p1
.end method

.method private final i()I
    .locals 1

    iget-object v0, p0, LE0/a0;->e:Landroidx/compose/ui/e$c;

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v0

    return v0
.end method

.method private final j(Landroidx/compose/ui/e$c;ILV/b;LV/b;Z)LE0/a0$a;
    .locals 8

    iget-object v0, p0, LE0/a0;->h:LE0/a0$a;

    if-nez v0, :cond_0

    new-instance v0, LE0/a0$a;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, LE0/a0$a;-><init>(LE0/a0;Landroidx/compose/ui/e$c;ILV/b;LV/b;Z)V

    iput-object v0, p0, LE0/a0;->h:LE0/a0$a;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LE0/a0$a;->g(Landroidx/compose/ui/e$c;)V

    invoke-virtual {v0, p2}, LE0/a0$a;->h(I)V

    invoke-virtual {v0, p3}, LE0/a0$a;->f(LV/b;)V

    invoke-virtual {v0, p4}, LE0/a0$a;->e(LV/b;)V

    invoke-virtual {v0, p5}, LE0/a0$a;->i(Z)V

    :goto_0
    return-object v0
.end method

.method private final r(Landroidx/compose/ui/e$c;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 1

    invoke-virtual {p2}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/e$c;->z2(Landroidx/compose/ui/e$c;)V

    invoke-virtual {p1, v0}, Landroidx/compose/ui/e$c;->v2(Landroidx/compose/ui/e$c;)V

    :cond_0
    invoke-virtual {p2, p1}, Landroidx/compose/ui/e$c;->v2(Landroidx/compose/ui/e$c;)V

    invoke-virtual {p1, p2}, Landroidx/compose/ui/e$c;->z2(Landroidx/compose/ui/e$c;)V

    return-object p1
.end method

.method private final u()Landroidx/compose/ui/e$c;
    .locals 2

    iget-object v0, p0, LE0/a0;->e:Landroidx/compose/ui/e$c;

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "padChain called on already padded chain"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LE0/a0;->e:Landroidx/compose/ui/e$c;

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->z2(Landroidx/compose/ui/e$c;)V

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/compose/ui/e$c;->v2(Landroidx/compose/ui/e$c;)V

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v0

    return-object v0
.end method

.method private final v(Landroidx/compose/ui/e$c;LE0/c0;)V
    .locals 2

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_3

    invoke-static {}, LE0/b0;->b()LE0/b0$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LE0/a0;->a:LE0/G;

    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LE0/G;->P()LE0/c0;

    move-result-object p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {p2, p1}, LE0/c0;->n3(LE0/c0;)V

    iput-object p2, p0, LE0/a0;->c:LE0/c0;

    goto :goto_2

    :cond_1
    const/4 v0, 0x2

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1, p2}, Landroidx/compose/ui/e$c;->C2(LE0/c0;)V

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private final w(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;
    .locals 3

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->z2(Landroidx/compose/ui/e$c;)V

    invoke-virtual {p1, v2}, Landroidx/compose/ui/e$c;->v2(Landroidx/compose/ui/e$c;)V

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroidx/compose/ui/e$c;->v2(Landroidx/compose/ui/e$c;)V

    invoke-virtual {p1, v2}, Landroidx/compose/ui/e$c;->z2(Landroidx/compose/ui/e$c;)V

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v1
.end method


# virtual methods
.method public final C()V
    .locals 5

    iget-object v0, p0, LE0/a0;->b:LE0/w;

    iget-object v1, p0, LE0/a0;->d:Landroidx/compose/ui/e$c;

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    invoke-static {v1}, LE0/k;->d(Landroidx/compose/ui/e$c;)LE0/B;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->c2()LE0/c0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->c2()LE0/c0;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LE0/C;

    invoke-virtual {v3}, LE0/C;->C3()LE0/B;

    move-result-object v4

    invoke-virtual {v3, v2}, LE0/C;->G3(LE0/B;)V

    if-eq v4, v1, :cond_1

    invoke-virtual {v3}, LE0/c0;->W2()V

    goto :goto_1

    :cond_0
    new-instance v3, LE0/C;

    iget-object v4, p0, LE0/a0;->a:LE0/G;

    invoke-direct {v3, v4, v2}, LE0/C;-><init>(LE0/G;LE0/B;)V

    invoke-virtual {v1, v3}, Landroidx/compose/ui/e$c;->C2(LE0/c0;)V

    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, LE0/c0;->n3(LE0/c0;)V

    invoke-virtual {v3, v0}, LE0/c0;->m3(LE0/c0;)V

    move-object v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v0}, Landroidx/compose/ui/e$c;->C2(LE0/c0;)V

    :goto_2
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_0

    :cond_3
    iget-object v1, p0, LE0/a0;->a:LE0/G;

    invoke-virtual {v1}, LE0/G;->o0()LE0/G;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LE0/G;->P()LE0/c0;

    move-result-object v1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, LE0/c0;->n3(LE0/c0;)V

    iput-object v0, p0, LE0/a0;->c:LE0/c0;

    return-void
.end method

.method public final E(Landroidx/compose/ui/e;)V
    .locals 12

    invoke-direct {p0}, LE0/a0;->u()Landroidx/compose/ui/e$c;

    move-result-object v6

    iget-object v7, p0, LE0/a0;->f:LV/b;

    const/4 v0, 0x0

    if-eqz v7, :cond_0

    invoke-virtual {v7}, LV/b;->o()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, LE0/a0;->g:LV/b;

    const/16 v3, 0x10

    if-nez v2, :cond_1

    new-instance v2, LV/b;

    new-array v4, v3, [Landroidx/compose/ui/e$b;

    invoke-direct {v2, v4, v0}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_1
    invoke-static {p1, v2}, LE0/b0;->a(Landroidx/compose/ui/e;LV/b;)LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v2

    const/4 v8, 0x0

    const-string v4, "expected prior modifier list to be non-empty"

    const/4 v9, 0x1

    if-ne v2, v1, :cond_8

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v2

    move-object v3, v2

    move v2, v0

    :goto_1
    if-eqz v3, :cond_4

    if-ge v2, v1, :cond_4

    if-eqz v7, :cond_5

    invoke-virtual {v7}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v2

    check-cast v5, Landroidx/compose/ui/e$b;

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v10

    aget-object v10, v10, v2

    check-cast v10, Landroidx/compose/ui/e$b;

    invoke-static {v5, v10}, LE0/b0;->d(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;)I

    move-result v11

    if-eqz v11, :cond_3

    if-eq v11, v9, :cond_2

    goto :goto_2

    :cond_2
    invoke-direct {p0, v5, v10, v3}, LE0/a0;->F(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)V

    :goto_2
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v3

    :cond_4
    move-object v5, v3

    goto :goto_3

    :cond_5
    invoke-static {v4}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :goto_3
    if-ge v2, v1, :cond_10

    if-eqz v7, :cond_7

    if-eqz v5, :cond_6

    iget-object v0, p0, LE0/a0;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->D()Z

    move-result v0

    xor-int/lit8 v10, v0, 0x1

    move-object v0, p0

    move v1, v2

    move-object v2, v7

    move-object v3, p1

    move-object v4, v5

    move v5, v10

    invoke-direct/range {v0 .. v5}, LE0/a0;->A(ILV/b;LV/b;Landroidx/compose/ui/e$c;Z)V

    :goto_4
    move v0, v9

    goto/16 :goto_8

    :cond_6
    const-string p1, "structuralUpdate requires a non-null tail"

    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_7
    invoke-static {v4}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_8
    iget-object v2, p0, LE0/a0;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->D()Z

    move-result v2

    if-eqz v2, :cond_a

    if-nez v1, :cond_a

    move-object v1, v6

    :goto_5
    invoke-virtual {p1}, LV/b;->o()I

    move-result v2

    if-ge v0, v2, :cond_9

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v0

    check-cast v2, Landroidx/compose/ui/e$b;

    invoke-direct {p0, v2, v1}, LE0/a0;->g(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_9
    invoke-direct {p0}, LE0/a0;->B()V

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, LV/b;->o()I

    move-result v1

    if-nez v1, :cond_e

    if-eqz v7, :cond_d

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v1

    move v2, v0

    :goto_6
    if-eqz v1, :cond_b

    invoke-virtual {v7}, LV/b;->o()I

    move-result v3

    if-ge v2, v3, :cond_b

    invoke-direct {p0, v1}, LE0/a0;->h(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_b
    iget-object v1, p0, LE0/a0;->b:LE0/w;

    iget-object v2, p0, LE0/a0;->a:LE0/G;

    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, LE0/G;->P()LE0/c0;

    move-result-object v2

    goto :goto_7

    :cond_c
    move-object v2, v8

    :goto_7
    invoke-virtual {v1, v2}, LE0/c0;->n3(LE0/c0;)V

    iget-object v1, p0, LE0/a0;->b:LE0/w;

    iput-object v1, p0, LE0/a0;->c:LE0/c0;

    goto :goto_8

    :cond_d
    invoke-static {v4}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_e
    if-nez v7, :cond_f

    new-instance v7, LV/b;

    new-array v1, v3, [Landroidx/compose/ui/e$b;

    invoke-direct {v7, v1, v0}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_f
    iget-object v0, p0, LE0/a0;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->D()Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v7

    move-object v3, p1

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, LE0/a0;->A(ILV/b;LV/b;Landroidx/compose/ui/e$c;Z)V

    goto/16 :goto_4

    :cond_10
    :goto_8
    iput-object p1, p0, LE0/a0;->f:LV/b;

    if-eqz v7, :cond_11

    invoke-virtual {v7}, LV/b;->h()V

    move-object v8, v7

    :cond_11
    iput-object v8, p0, LE0/a0;->g:LV/b;

    invoke-direct {p0, v6}, LE0/a0;->D(Landroidx/compose/ui/e$c;)Landroidx/compose/ui/e$c;

    move-result-object p1

    iput-object p1, p0, LE0/a0;->e:Landroidx/compose/ui/e$c;

    if-eqz v0, :cond_12

    invoke-virtual {p0}, LE0/a0;->C()V

    :cond_12
    return-void
.end method

.method public final k()Landroidx/compose/ui/e$c;
    .locals 1

    iget-object v0, p0, LE0/a0;->e:Landroidx/compose/ui/e$c;

    return-object v0
.end method

.method public final l()LE0/w;
    .locals 1

    iget-object v0, p0, LE0/a0;->b:LE0/w;

    return-object v0
.end method

.method public final m()LE0/G;
    .locals 1

    iget-object v0, p0, LE0/a0;->a:LE0/G;

    return-object v0
.end method

.method public final n()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/a0;->c:LE0/c0;

    return-object v0
.end method

.method public final o()Landroidx/compose/ui/e$c;
    .locals 1

    iget-object v0, p0, LE0/a0;->d:Landroidx/compose/ui/e$c;

    return-object v0
.end method

.method public final p(I)Z
    .locals 1

    invoke-direct {p0}, LE0/a0;->i()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final q(I)Z
    .locals 1

    invoke-direct {p0}, LE0/a0;->i()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final s()V
    .locals 1

    invoke-virtual {p0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->l2()V

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 2

    invoke-virtual {p0}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->m2()V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LE0/a0;->e:Landroidx/compose/ui/e$c;

    iget-object v2, p0, LE0/a0;->d:Landroidx/compose/ui/e$c;

    const-string v3, "]"

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {p0}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v2

    if-eq v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v2

    iget-object v4, p0, LE0/a0;->d:Landroidx/compose/ui/e$c;

    if-ne v2, v4, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final x()V
    .locals 2

    invoke-virtual {p0}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->q2()V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LE0/a0;->z()V

    invoke-virtual {p0}, LE0/a0;->t()V

    return-void
.end method

.method public final y()V
    .locals 2

    invoke-virtual {p0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->r2()V

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->e2()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LE0/f0;->a(Landroidx/compose/ui/e$c;)V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->j2()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, LE0/f0;->e(Landroidx/compose/ui/e$c;)V

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->w2(Z)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/e$c;->A2(Z)V

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final z()V
    .locals 2

    invoke-virtual {p0}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->s2()V

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-void
.end method
