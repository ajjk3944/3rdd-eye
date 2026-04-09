.class final LB/g$a$b;
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
.field final synthetic a:F

.field final synthetic b:Lkotlin/jvm/internal/K;

.field final synthetic c:Lw/v;


# direct methods
.method constructor <init>(FLkotlin/jvm/internal/K;Lw/v;)V
    .locals 0

    iput p1, p0, LB/g$a$b;->a:F

    iput-object p2, p0, LB/g$a$b;->b:Lkotlin/jvm/internal/K;

    iput-object p3, p0, LB/g$a$b;->c:Lw/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/h;)V
    .locals 3

    iget v0, p0, LB/g$a$b;->a:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, LB/g$a$b;->a:F

    invoke-static {v0, v1}, Lsh/m;->f(FF)F

    move-result v1

    goto :goto_0

    :cond_0
    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, LB/g$a$b;->a:F

    invoke-static {v0, v1}, Lsh/m;->c(FF)F

    move-result v1

    :cond_1
    :goto_0
    iget-object v0, p0, LB/g$a$b;->b:Lkotlin/jvm/internal/K;

    iget v0, v0, Lkotlin/jvm/internal/K;->a:F

    sub-float v0, v1, v0

    iget-object v2, p0, LB/g$a$b;->c:Lw/v;

    invoke-interface {v2, v0}, Lw/v;->a(F)F

    move-result v2

    cmpg-float v2, v0, v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lr/h;->a()V

    :goto_1
    iget-object p1, p0, LB/g$a$b;->b:Lkotlin/jvm/internal/K;

    iget v1, p1, Lkotlin/jvm/internal/K;->a:F

    add-float/2addr v1, v0

    iput v1, p1, Lkotlin/jvm/internal/K;->a:F

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/h;

    invoke-virtual {p0, p1}, LB/g$a$b;->a(Lr/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
