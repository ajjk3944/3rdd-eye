.class public final LI/j1;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;
.implements LE0/t;
.implements LE0/h;


# instance fields
.field private n:LI/l1;

.field private o:Z

.field private p:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LI/l1;LI/o1;LL0/U;ZLmh/p;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, LI/j1;->n:LI/l1;

    iput-boolean p4, p0, LI/j1;->o:Z

    invoke-virtual {p1, p5}, LI/l1;->p(Lmh/p;)V

    iget-object p1, p0, LI/j1;->n:LI/l1;

    iget-boolean p4, p0, LI/j1;->o:Z

    xor-int/lit8 p5, p4, 0x1

    invoke-virtual {p1, p2, p3, p4, p5}, LI/l1;->r(LI/o1;LL0/U;ZZ)V

    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    iget-object v0, p0, LI/j1;->n:LI/l1;

    invoke-virtual {v0, p1}, LI/l1;->q(LC0/r;)V

    return-void
.end method

.method public final D2(LI/l1;LI/o1;LL0/U;ZLmh/p;)V
    .locals 0

    iput-object p1, p0, LI/j1;->n:LI/l1;

    invoke-virtual {p1, p5}, LI/l1;->p(Lmh/p;)V

    iput-boolean p4, p0, LI/j1;->o:Z

    iget-object p1, p0, LI/j1;->n:LI/l1;

    xor-int/lit8 p5, p4, 0x1

    invoke-virtual {p1, p2, p3, p4, p5}, LI/l1;->r(LI/o1;LL0/U;ZZ)V

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 6

    iget-object v0, p0, LI/j1;->n:LI/l1;

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object v1

    invoke-static {p0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LQ0/k$b;

    move-object v1, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, LI/l1;->l(LY0/d;LY0/t;LQ0/k$b;J)LL0/M;

    move-result-object p3

    sget-object p4, LY0/b;->b:LY0/b$a;

    invoke-virtual {p3}, LL0/M;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    invoke-virtual {p3}, LL0/M;->B()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    invoke-virtual {p3}, LL0/M;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v2

    invoke-virtual {p3}, LL0/M;->B()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v3

    invoke-virtual {p4, v0, v1, v2, v3}, LY0/b$a;->b(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p2

    iget-object p4, p0, LI/j1;->n:LI/l1;

    iget-boolean v0, p0, LI/j1;->o:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p3, v1}, LL0/M;->m(I)F

    move-result v0

    invoke-static {v0}, LF/T;->a(F)I

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->x(I)F

    move-result v0

    goto :goto_0

    :cond_0
    int-to-float v0, v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    :goto_0
    invoke-virtual {p4, v0}, LI/l1;->o(F)V

    iget-object p4, p0, LI/j1;->p:Ljava/util/Map;

    if-nez p4, :cond_1

    new-instance p4, Ljava/util/LinkedHashMap;

    const/4 v0, 0x2

    invoke-direct {p4, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    :cond_1
    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v0

    invoke-virtual {p3}, LL0/M;->h()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v0

    invoke-virtual {p3}, LL0/M;->k()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, LI/j1;->p:Ljava/util/Map;

    invoke-virtual {p3}, LL0/M;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p4

    invoke-virtual {p3}, LL0/M;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result p3

    iget-object v0, p0, LI/j1;->p:Ljava/util/Map;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, LI/j1$a;

    invoke-direct {v1, p2}, LI/j1$a;-><init>(Landroidx/compose/ui/layout/t;)V

    invoke-interface {p1, p4, p3, v0, v1}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1
.end method
