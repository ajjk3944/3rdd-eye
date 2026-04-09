.class public final Ls0/p;
.super Lr0/d;
.source "SourceFile"


# static fields
.field public static final n:I = 0x8


# instance fields
.field private final g:LT/q0;

.field private final h:LT/q0;

.field private final i:Ls0/l;

.field private final j:LT/n0;

.field private k:F

.field private l:Lm0/w0;

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls0/c;)V
    .locals 3

    invoke-direct {p0}, Lr0/d;-><init>()V

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->c(J)Ll0/m;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Ls0/p;->g:LT/q0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Ls0/p;->h:LT/q0;

    new-instance v0, Ls0/l;

    invoke-direct {v0, p1}, Ls0/l;-><init>(Ls0/c;)V

    new-instance p1, Ls0/p$a;

    invoke-direct {p1, p0}, Ls0/p$a;-><init>(Ls0/p;)V

    invoke-virtual {v0, p1}, Ls0/l;->o(Lmh/a;)V

    iput-object v0, p0, Ls0/p;->i:Ls0/l;

    const/4 p1, 0x0

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, Ls0/p;->j:LT/n0;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Ls0/p;->k:F

    const/4 p1, -0x1

    iput p1, p0, Ls0/p;->m:I

    return-void
.end method

.method public static final synthetic o(Ls0/p;)I
    .locals 0

    iget p0, p0, Ls0/p;->m:I

    return p0
.end method

.method public static final synthetic p(Ls0/p;)I
    .locals 0

    invoke-direct {p0}, Ls0/p;->s()I

    move-result p0

    return p0
.end method

.method public static final synthetic q(Ls0/p;I)V
    .locals 0

    invoke-direct {p0, p1}, Ls0/p;->w(I)V

    return-void
.end method

.method private final s()I
    .locals 1

    iget-object v0, p0, Ls0/p;->j:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method private final w(I)V
    .locals 1

    iget-object v0, p0, Ls0/p;->j:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method


# virtual methods
.method protected a(F)Z
    .locals 0

    iput p1, p0, Ls0/p;->k:F

    const/4 p1, 0x1

    return p1
.end method

.method protected e(Lm0/w0;)Z
    .locals 0

    iput-object p1, p0, Ls0/p;->l:Lm0/w0;

    const/4 p1, 0x1

    return p1
.end method

.method public l()J
    .locals 2

    invoke-virtual {p0}, Ls0/p;->t()J

    move-result-wide v0

    return-wide v0
.end method

.method protected n(Lo0/f;)V
    .locals 10

    iget-object v0, p0, Ls0/p;->i:Ls0/l;

    iget-object v1, p0, Ls0/p;->l:Lm0/w0;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ls0/l;->k()Lm0/w0;

    move-result-object v1

    :cond_0
    invoke-virtual {p0}, Ls0/p;->r()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v2

    sget-object v3, LY0/t;->Rtl:LY0/t;

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, Lo0/f;->D1()J

    move-result-wide v2

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v4

    invoke-interface {v4}, Lo0/d;->c()J

    move-result-wide v5

    invoke-interface {v4}, Lo0/d;->d()Lm0/n0;

    move-result-object v7

    invoke-interface {v7}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v4}, Lo0/d;->e()Lo0/h;

    move-result-object v7

    const/high16 v8, -0x40800000    # -1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-interface {v7, v8, v9, v2, v3}, Lo0/h;->f(FFJ)V

    iget v2, p0, Ls0/p;->k:F

    invoke-virtual {v0, p1, v2, v1}, Ls0/l;->i(Lo0/f;FLm0/w0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v4}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v4, v5, v6}, Lo0/d;->f(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v4}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v4, v5, v6}, Lo0/d;->f(J)V

    throw p1

    :cond_1
    iget v2, p0, Ls0/p;->k:F

    invoke-virtual {v0, p1, v2, v1}, Ls0/l;->i(Lo0/f;FLm0/w0;)V

    :goto_0
    invoke-direct {p0}, Ls0/p;->s()I

    move-result p1

    iput p1, p0, Ls0/p;->m:I

    return-void
.end method

.method public final r()Z
    .locals 1

    iget-object v0, p0, Ls0/p;->h:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final t()J
    .locals 2

    iget-object v0, p0, Ls0/p;->g:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/m;

    invoke-virtual {v0}, Ll0/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(Z)V
    .locals 1

    iget-object v0, p0, Ls0/p;->h:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final v(Lm0/w0;)V
    .locals 1

    iget-object v0, p0, Ls0/p;->i:Ls0/l;

    invoke-virtual {v0, p1}, Ls0/l;->n(Lm0/w0;)V

    return-void
.end method

.method public final x(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ls0/p;->i:Ls0/l;

    invoke-virtual {v0, p1}, Ls0/l;->p(Ljava/lang/String;)V

    return-void
.end method

.method public final y(J)V
    .locals 1

    iget-object v0, p0, Ls0/p;->g:LT/q0;

    invoke-static {p1, p2}, Ll0/m;->c(J)Ll0/m;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final z(J)V
    .locals 1

    iget-object v0, p0, Ls0/p;->i:Ls0/l;

    invoke-virtual {v0, p1, p2}, Ls0/l;->q(J)V

    return-void
.end method
