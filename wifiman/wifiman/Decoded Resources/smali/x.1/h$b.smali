.class final Lx/h$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/h;->f(Lw/v;FLr/k;Lr/z;Lmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lkotlin/jvm/internal/K;

.field final synthetic c:Lw/v;

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(FLkotlin/jvm/internal/K;Lw/v;Lmh/l;)V
    .locals 0

    iput p1, p0, Lx/h$b;->a:F

    iput-object p2, p0, Lx/h$b;->b:Lkotlin/jvm/internal/K;

    iput-object p3, p0, Lx/h$b;->c:Lw/v;

    iput-object p4, p0, Lx/h$b;->d:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/h;)V
    .locals 4

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lx/h$b;->a:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, Lx/h$b;->a:F

    invoke-static {v0, v1}, Lx/h;->e(FF)F

    move-result v0

    iget-object v1, p0, Lx/h$b;->b:Lkotlin/jvm/internal/K;

    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lx/h$b;->c:Lw/v;

    iget-object v3, p0, Lx/h$b;->d:Lmh/l;

    invoke-static {p1, v2, v3, v1}, Lx/h;->b(Lr/h;Lw/v;Lmh/l;F)V

    invoke-virtual {p1}, Lr/h;->a()V

    iget-object p1, p0, Lx/h$b;->b:Lkotlin/jvm/internal/K;

    iput v0, p1, Lkotlin/jvm/internal/K;->a:F

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Lx/h$b;->b:Lkotlin/jvm/internal/K;

    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lx/h$b;->c:Lw/v;

    iget-object v2, p0, Lx/h$b;->d:Lmh/l;

    invoke-static {p1, v1, v2, v0}, Lx/h;->b(Lr/h;Lw/v;Lmh/l;F)V

    iget-object v0, p0, Lx/h$b;->b:Lkotlin/jvm/internal/K;

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/K;->a:F

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/h;

    invoke-virtual {p0, p1}, Lx/h$b;->a(Lr/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
