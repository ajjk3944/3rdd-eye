.class final LN/R0$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0;->G(FLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:F

.field final synthetic d:LN/R0;


# direct methods
.method constructor <init>(FLN/R0;Ldh/e;)V
    .locals 0

    iput p1, p0, LN/R0$h;->c:F

    iput-object p2, p0, LN/R0$h;->d:LN/R0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LN/R0$h;

    iget v1, p0, LN/R0$h;->c:F

    iget-object v2, p0, LN/R0$h;->d:LN/R0;

    invoke-direct {v0, v1, v2, p2}, LN/R0$h;-><init>(FLN/R0;Ldh/e;)V

    iput-object p1, v0, LN/R0$h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/k;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LN/R0$h;->n(Lw/k;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LN/R0$h;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LN/R0$h;->b:Ljava/lang/Object;

    check-cast p1, Lw/k;

    iget v0, p0, LN/R0$h;->c:F

    iget-object v1, p0, LN/R0$h;->d:LN/R0;

    invoke-static {v1}, LN/R0;->b(LN/R0;)LT/m0;

    move-result-object v1

    invoke-interface {v1}, LT/m0;->c()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-interface {p1, v0}, Lw/k;->a(F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Lw/k;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/R0$h;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/R0$h;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/R0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
