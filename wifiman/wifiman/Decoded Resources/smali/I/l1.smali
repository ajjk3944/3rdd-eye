.class public final LI/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LI/i1;

.field private b:Lmh/p;

.field private final c:LI/i1;

.field private final d:LT/q0;

.field private final e:LT/q0;

.field private final f:LT/q0;

.field private final g:LT/q0;

.field private final h:LD/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI/i1;

    invoke-direct {v0}, LI/i1;-><init>()V

    iput-object v0, p0, LI/l1;->a:LI/i1;

    iput-object v0, p0, LI/l1;->c:LI/i1;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LI/l1;->d:LT/q0;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v0

    invoke-static {v1, v0}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LI/l1;->e:LT/q0;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v0

    invoke-static {v1, v0}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LI/l1;->f:LT/q0;

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LY0/h;->d(F)LY0/h;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LI/l1;->g:LT/q0;

    invoke-static {}, Landroidx/compose/foundation/relocation/b;->a()LD/b;

    move-result-object v0

    iput-object v0, p0, LI/l1;->h:LD/b;

    return-void
.end method

.method public static final synthetic a(LI/l1;)LI/i1;
    .locals 0

    iget-object p0, p0, LI/l1;->a:LI/i1;

    return-object p0
.end method

.method public static synthetic i(LI/l1;JZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LI/l1;->h(JZ)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(J)J
    .locals 5

    invoke-virtual {p0}, LI/l1;->j()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LI/l1;->e()LC0/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v3, v4, v2}, LC0/r;->c0(LC0/r;LC0/r;ZILjava/lang/Object;)Ll0/i;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v2

    :cond_1
    :goto_0
    if-nez v2, :cond_3

    :cond_2
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v2

    :cond_3
    invoke-static {p1, p2, v2}, LI/m1;->a(JLl0/i;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c()LD/b;
    .locals 1

    iget-object v0, p0, LI/l1;->h:LD/b;

    return-object v0
.end method

.method public final d()LC0/r;
    .locals 1

    iget-object v0, p0, LI/l1;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/r;

    return-object v0
.end method

.method public final e()LC0/r;
    .locals 1

    iget-object v0, p0, LI/l1;->f:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/r;

    return-object v0
.end method

.method public final f()LL0/M;
    .locals 1

    iget-object v0, p0, LI/l1;->c:LI/i1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/M;

    return-object v0
.end method

.method public final g()F
    .locals 1

    iget-object v0, p0, LI/l1;->g:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/h;

    invoke-virtual {v0}, LY0/h;->s()F

    move-result v0

    return v0
.end method

.method public final h(JZ)I
    .locals 1

    invoke-virtual {p0}, LI/l1;->f()LL0/M;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2}, LI/l1;->b(J)J

    move-result-wide p1

    :cond_1
    invoke-static {p0, p1, p2}, LI/m1;->b(LI/l1;J)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, LL0/M;->x(J)I

    move-result p1

    return p1
.end method

.method public final j()LC0/r;
    .locals 1

    iget-object v0, p0, LI/l1;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/r;

    return-object v0
.end method

.method public final k(J)Z
    .locals 5

    invoke-virtual {p0}, LI/l1;->f()LL0/M;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1, p2}, LI/l1;->b(J)J

    move-result-wide p1

    invoke-static {p0, p1, p2}, LI/m1;->b(LI/l1;J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v2

    invoke-virtual {v0, v2}, LL0/M;->r(F)I

    move-result v2

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v3

    invoke-virtual {v0, v2}, LL0/M;->s(I)F

    move-result v4

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    invoke-virtual {v0, v2}, LL0/M;->t(I)F

    move-result p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final l(LY0/d;LY0/t;LQ0/k$b;J)LL0/M;
    .locals 6

    iget-object v0, p0, LI/l1;->a:LI/i1;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, LI/i1;->u(LY0/d;LY0/t;LQ0/k$b;J)LL0/M;

    move-result-object p2

    iget-object p3, p0, LI/l1;->b:Lmh/p;

    if-eqz p3, :cond_0

    new-instance p4, LI/l1$a;

    invoke-direct {p4, p0}, LI/l1$a;-><init>(LI/l1;)V

    invoke-interface {p3, p1, p4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final m(LC0/r;)V
    .locals 1

    iget-object v0, p0, LI/l1;->e:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final n(LC0/r;)V
    .locals 1

    iget-object v0, p0, LI/l1;->f:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final o(F)V
    .locals 1

    iget-object v0, p0, LI/l1;->g:LT/q0;

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final p(Lmh/p;)V
    .locals 0

    iput-object p1, p0, LI/l1;->b:Lmh/p;

    return-void
.end method

.method public final q(LC0/r;)V
    .locals 1

    iget-object v0, p0, LI/l1;->d:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final r(LI/o1;LL0/U;ZZ)V
    .locals 1

    iget-object v0, p0, LI/l1;->a:LI/i1;

    invoke-virtual {v0, p1, p2, p3, p4}, LI/i1;->y(LI/o1;LL0/U;ZZ)V

    return-void
.end method
