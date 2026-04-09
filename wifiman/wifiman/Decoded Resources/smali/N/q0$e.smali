.class final LN/q0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/q0;->j(Landroidx/compose/ui/e;JLz/N;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/q0$e$a;
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lz/N;


# direct methods
.method constructor <init>(JLz/N;)V
    .locals 0

    iput-wide p1, p0, LN/q0$e;->a:J

    iput-object p3, p0, LN/q0$e;->b:Lz/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 13

    iget-wide v0, p0, LN/q0$e;->a:J

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_2

    invoke-static {}, LN/q0;->e()F

    move-result v2

    invoke-interface {p1, v2}, LY0/d;->d1(F)F

    move-result v2

    iget-object v3, p0, LN/q0$e;->b:Lz/N;

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v4

    invoke-interface {v3, v4}, Lz/N;->a(LY0/t;)F

    move-result v3

    invoke-interface {p1, v3}, LY0/d;->d1(F)F

    move-result v3

    sub-float/2addr v3, v2

    add-float/2addr v0, v3

    const/4 v4, 0x2

    int-to-float v4, v4

    mul-float/2addr v2, v4

    add-float/2addr v0, v2

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v2

    sget-object v5, LN/q0$e$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    const/4 v6, 0x1

    if-ne v2, v6, :cond_0

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v7

    invoke-static {v7, v8}, Ll0/m;->i(J)F

    move-result v2

    sub-float/2addr v2, v0

    :goto_0
    move v8, v2

    goto :goto_1

    :cond_0
    invoke-static {v3, v1}, Lsh/m;->c(FF)F

    move-result v2

    goto :goto_0

    :goto_1
    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    if-ne v2, v6, :cond_1

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/m;->i(J)F

    move-result v0

    invoke-static {v3, v1}, Lsh/m;->c(FF)F

    move-result v1

    sub-float/2addr v0, v1

    :cond_1
    move v10, v0

    iget-wide v0, p0, LN/q0$e;->a:J

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    neg-float v1, v0

    div-float v9, v1, v4

    div-float v11, v0, v4

    sget-object v0, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {v0}, Lm0/u0$a;->a()I

    move-result v12

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->c()J

    move-result-wide v1

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v3

    invoke-interface {v3}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v0}, Lo0/d;->e()Lo0/h;

    move-result-object v7

    invoke-interface/range {v7 .. v12}, Lo0/h;->b(FFFFI)V

    invoke-interface {p1}, Lo0/c;->X1()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v0, v1, v2}, Lo0/d;->f(J)V

    goto :goto_2

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v3

    invoke-interface {v3}, Lm0/n0;->r()V

    invoke-interface {v0, v1, v2}, Lo0/d;->f(J)V

    throw p1

    :cond_2
    invoke-interface {p1}, Lo0/c;->X1()V

    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, LN/q0$e;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
