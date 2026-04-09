.class final Lw/h$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/K;

.field final synthetic b:Lw/v;

.field final synthetic c:Lkotlin/jvm/internal/K;

.field final synthetic d:Lw/h;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/K;Lw/v;Lkotlin/jvm/internal/K;Lw/h;)V
    .locals 0

    iput-object p1, p0, Lw/h$a$a;->a:Lkotlin/jvm/internal/K;

    iput-object p2, p0, Lw/h$a$a;->b:Lw/v;

    iput-object p3, p0, Lw/h$a$a;->c:Lkotlin/jvm/internal/K;

    iput-object p4, p0, Lw/h$a$a;->d:Lw/h;

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

    iget-object v1, p0, Lw/h$a$a;->a:Lkotlin/jvm/internal/K;

    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lw/h$a$a;->b:Lw/v;

    invoke-interface {v1, v0}, Lw/v;->a(F)F

    move-result v1

    iget-object v2, p0, Lw/h$a$a;->a:Lkotlin/jvm/internal/K;

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iput v3, v2, Lkotlin/jvm/internal/K;->a:F

    iget-object v2, p0, Lw/h$a$a;->c:Lkotlin/jvm/internal/K;

    invoke-virtual {p1}, Lr/h;->f()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iput v3, v2, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lr/h;->a()V

    :cond_0
    iget-object p1, p0, Lw/h$a$a;->d:Lw/h;

    invoke-virtual {p1}, Lw/h;->e()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lw/h;->g(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/h;

    invoke-virtual {p0, p1}, Lw/h$a$a;->a(Lr/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
