.class final Ls/f$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/f;-><init>(FLm0/l0;Lm0/i1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls/f;


# direct methods
.method constructor <init>(Ls/f;)V
    .locals 0

    iput-object p1, p0, Ls/f$e;->a:Ls/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lj0/d;)Lj0/h;
    .locals 13

    iget-object v0, p0, Ls/f$e;->a:Ls/f;

    invoke-virtual {v0}, Ls/f;->P2()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->d1(F)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_5

    invoke-virtual {p1}, Lj0/d;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->h(J)F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    iget-object v0, p0, Ls/f$e;->a:Ls/f;

    invoke-virtual {v0}, Ls/f;->P2()F

    move-result v0

    sget-object v1, LY0/h;->b:LY0/h$a;

    invoke-virtual {v1}, LY0/h$a;->a()F

    move-result v1

    invoke-static {v0, v1}, LY0/h;->n(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls/f$e;->a:Ls/f;

    invoke-virtual {v0}, Ls/f;->P2()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->d1(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_0
    invoke-virtual {p1}, Lj0/d;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->h(J)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    div-float v1, v0, v2

    invoke-static {v1, v1}, Ll0/h;->a(FF)J

    move-result-wide v7

    invoke-virtual {p1}, Lj0/d;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->i(J)F

    move-result v1

    sub-float/2addr v1, v0

    invoke-virtual {p1}, Lj0/d;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->g(J)F

    move-result v3

    sub-float/2addr v3, v0

    invoke-static {v1, v3}, Ll0/n;->a(FF)J

    move-result-wide v9

    mul-float/2addr v2, v0

    invoke-virtual {p1}, Lj0/d;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->h(J)F

    move-result v1

    cmpl-float v1, v2, v1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iget-object v2, p0, Ls/f$e;->a:Ls/f;

    invoke-virtual {v2}, Ls/f;->O2()Lm0/i1;

    move-result-object v2

    invoke-virtual {p1}, Lj0/d;->c()J

    move-result-wide v3

    invoke-virtual {p1}, Lj0/d;->getLayoutDirection()LY0/t;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5, p1}, Lm0/i1;->a(JLY0/t;LY0/d;)Lm0/Q0;

    move-result-object v2

    instance-of v3, v2, Lm0/Q0$a;

    if-eqz v3, :cond_2

    iget-object v3, p0, Ls/f$e;->a:Ls/f;

    invoke-virtual {v3}, Ls/f;->N2()Lm0/l0;

    move-result-object v5

    move-object v6, v2

    check-cast v6, Lm0/Q0$a;

    move-object v4, p1

    move v7, v1

    move v8, v0

    invoke-static/range {v3 .. v8}, Ls/f;->J2(Ls/f;Lj0/d;Lm0/l0;Lm0/Q0$a;ZF)Lj0/h;

    move-result-object p1

    goto :goto_2

    :cond_2
    instance-of v3, v2, Lm0/Q0$c;

    if-eqz v3, :cond_3

    iget-object v3, p0, Ls/f$e;->a:Ls/f;

    invoke-virtual {v3}, Ls/f;->N2()Lm0/l0;

    move-result-object v5

    move-object v6, v2

    check-cast v6, Lm0/Q0$c;

    move-object v4, p1

    move v11, v1

    move v12, v0

    invoke-static/range {v3 .. v12}, Ls/f;->K2(Ls/f;Lj0/d;Lm0/l0;Lm0/Q0$c;JJZF)Lj0/h;

    move-result-object p1

    goto :goto_2

    :cond_3
    instance-of v2, v2, Lm0/Q0$b;

    if-eqz v2, :cond_4

    iget-object v2, p0, Ls/f$e;->a:Ls/f;

    invoke-virtual {v2}, Ls/f;->N2()Lm0/l0;

    move-result-object v4

    move-object v3, p1

    move-wide v5, v7

    move-wide v7, v9

    move v9, v1

    move v10, v0

    invoke-static/range {v3 .. v10}, Ls/e;->c(Lj0/d;Lm0/l0;JJZF)Lj0/h;

    move-result-object p1

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    invoke-static {p1}, Ls/e;->b(Lj0/d;)Lj0/h;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj0/d;

    invoke-virtual {p0, p1}, Ls/f$e;->a(Lj0/d;)Lj0/h;

    move-result-object p1

    return-object p1
.end method
