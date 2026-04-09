.class final LB/g$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/h;

.field final synthetic b:I

.field final synthetic c:F

.field final synthetic d:Lkotlin/jvm/internal/K;

.field final synthetic e:Lw/v;

.field final synthetic f:Lkotlin/jvm/internal/J;

.field final synthetic g:Z

.field final synthetic h:F

.field final synthetic i:Lkotlin/jvm/internal/L;

.field final synthetic j:I

.field final synthetic k:I

.field final synthetic l:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(LB/h;IFLkotlin/jvm/internal/K;Lw/v;Lkotlin/jvm/internal/J;ZFLkotlin/jvm/internal/L;IILkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, LB/g$a$a;->a:LB/h;

    iput p2, p0, LB/g$a$a;->b:I

    iput p3, p0, LB/g$a$a;->c:F

    iput-object p4, p0, LB/g$a$a;->d:Lkotlin/jvm/internal/K;

    iput-object p5, p0, LB/g$a$a;->e:Lw/v;

    iput-object p6, p0, LB/g$a$a;->f:Lkotlin/jvm/internal/J;

    iput-boolean p7, p0, LB/g$a$a;->g:Z

    iput p8, p0, LB/g$a$a;->h:F

    iput-object p9, p0, LB/g$a$a;->i:Lkotlin/jvm/internal/L;

    iput p10, p0, LB/g$a$a;->j:I

    iput p11, p0, LB/g$a$a;->k:I

    iput-object p12, p0, LB/g$a$a;->l:Lkotlin/jvm/internal/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/h;)V
    .locals 7

    iget-object v0, p0, LB/g$a$a;->a:LB/h;

    iget v1, p0, LB/g$a$a;->b:I

    invoke-static {v0, v1}, LB/g;->e(LB/h;I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget v0, p0, LB/g$a$a;->c:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LB/g$a$a;->c:F

    invoke-static {v0, v2}, Lsh/m;->f(FF)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LB/g$a$a;->c:F

    invoke-static {v0, v2}, Lsh/m;->c(FF)F

    move-result v0

    :goto_0
    iget-object v2, p0, LB/g$a$a;->d:Lkotlin/jvm/internal/K;

    iget v2, v2, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v0, v2

    iget-object v2, p0, LB/g$a$a;->e:Lw/v;

    invoke-interface {v2, v0}, Lw/v;->a(F)F

    move-result v2

    iget-object v3, p0, LB/g$a$a;->a:LB/h;

    iget v4, p0, LB/g$a$a;->b:I

    invoke-static {v3, v4}, LB/g;->e(LB/h;I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-boolean v3, p0, LB/g$a$a;->g:Z

    iget-object v4, p0, LB/g$a$a;->a:LB/h;

    iget v5, p0, LB/g$a$a;->b:I

    iget v6, p0, LB/g$a$a;->k:I

    invoke-static {v3, v4, v5, v6}, LB/g$a;->n(ZLB/h;II)Z

    move-result v3

    if-nez v3, :cond_6

    cmpg-float v2, v0, v2

    if-nez v2, :cond_5

    iget-object v2, p0, LB/g$a$a;->d:Lkotlin/jvm/internal/K;

    iget v3, v2, Lkotlin/jvm/internal/K;->a:F

    add-float/2addr v3, v0

    iput v3, v2, Lkotlin/jvm/internal/K;->a:F

    iget-boolean v0, p0, LB/g$a$a;->g:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LB/g$a$a;->h:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    invoke-virtual {p1}, Lr/h;->a()V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, LB/g$a$a;->h:F

    neg-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_3

    invoke-virtual {p1}, Lr/h;->a()V

    :cond_3
    :goto_1
    iget-boolean v0, p0, LB/g$a$a;->g:Z

    const/4 v2, 0x2

    if-eqz v0, :cond_4

    iget-object v0, p0, LB/g$a$a;->i:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    if-lt v0, v2, :cond_6

    iget v0, p0, LB/g$a$a;->b:I

    iget-object v2, p0, LB/g$a$a;->a:LB/h;

    invoke-interface {v2}, LB/h;->c()I

    move-result v2

    sub-int/2addr v0, v2

    iget v2, p0, LB/g$a$a;->j:I

    if-le v0, v2, :cond_6

    iget-object v0, p0, LB/g$a$a;->a:LB/h;

    iget-object v3, p0, LB/g$a$a;->e:Lw/v;

    iget v4, p0, LB/g$a$a;->b:I

    sub-int/2addr v4, v2

    invoke-interface {v0, v3, v4, v1}, LB/h;->b(Lw/v;II)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, LB/g$a$a;->i:Lkotlin/jvm/internal/L;

    iget v0, v0, Lkotlin/jvm/internal/L;->a:I

    if-lt v0, v2, :cond_6

    iget-object v0, p0, LB/g$a$a;->a:LB/h;

    invoke-interface {v0}, LB/h;->g()I

    move-result v0

    iget v2, p0, LB/g$a$a;->b:I

    sub-int/2addr v0, v2

    iget v3, p0, LB/g$a$a;->j:I

    if-le v0, v3, :cond_6

    iget-object v0, p0, LB/g$a$a;->a:LB/h;

    iget-object v4, p0, LB/g$a$a;->e:Lw/v;

    add-int/2addr v2, v3

    invoke-interface {v0, v4, v2, v1}, LB/h;->b(Lw/v;II)V

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Lr/h;->a()V

    iget-object p1, p0, LB/g$a$a;->f:Lkotlin/jvm/internal/J;

    iput-boolean v1, p1, Lkotlin/jvm/internal/J;->a:Z

    return-void

    :cond_6
    :goto_2
    iget-boolean v0, p0, LB/g$a$a;->g:Z

    iget-object v2, p0, LB/g$a$a;->a:LB/h;

    iget v3, p0, LB/g$a$a;->b:I

    iget v4, p0, LB/g$a$a;->k:I

    invoke-static {v0, v2, v3, v4}, LB/g$a;->n(ZLB/h;II)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, LB/g$a$a;->a:LB/h;

    iget v2, p0, LB/g$a$a;->k:I

    iget-object v3, p0, LB/g$a$a;->e:Lw/v;

    iget v4, p0, LB/g$a$a;->b:I

    invoke-interface {v0, v3, v4, v2}, LB/h;->b(Lw/v;II)V

    iget-object v0, p0, LB/g$a$a;->f:Lkotlin/jvm/internal/J;

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    invoke-virtual {p1}, Lr/h;->a()V

    return-void

    :cond_7
    iget-object p1, p0, LB/g$a$a;->a:LB/h;

    iget v0, p0, LB/g$a$a;->b:I

    invoke-static {p1, v0}, LB/g;->e(LB/h;I)Z

    move-result p1

    if-nez p1, :cond_8

    return-void

    :cond_8
    iget-object p1, p0, LB/g$a$a;->a:LB/h;

    iget v0, p0, LB/g$a$a;->b:I

    invoke-interface {p1, v0}, LB/h;->f(I)F

    move-result p1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    new-instance v0, LB/f;

    iget-object v1, p0, LB/g$a$a;->l:Lkotlin/jvm/internal/N;

    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Lr/k;

    invoke-direct {v0, p1, v1}, LB/f;-><init>(ILr/k;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/h;

    invoke-virtual {p0, p1}, LB/g$a$a;->a(Lr/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
