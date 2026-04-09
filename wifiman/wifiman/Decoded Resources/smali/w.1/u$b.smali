.class final Lw/u$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/u;->a(Lw/y;FLr/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:F

.field final synthetic d:Lr/i;

.field final synthetic e:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(FLr/i;Lkotlin/jvm/internal/K;Ldh/e;)V
    .locals 0

    iput p1, p0, Lw/u$b;->c:F

    iput-object p2, p0, Lw/u$b;->d:Lr/i;

    iput-object p3, p0, Lw/u$b;->e:Lkotlin/jvm/internal/K;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lw/u$b;

    iget v1, p0, Lw/u$b;->c:F

    iget-object v2, p0, Lw/u$b;->d:Lr/i;

    iget-object v3, p0, Lw/u$b;->e:Lkotlin/jvm/internal/K;

    invoke-direct {v0, v1, v2, v3, p2}, Lw/u$b;-><init>(FLr/i;Lkotlin/jvm/internal/K;Ldh/e;)V

    iput-object p1, v0, Lw/u$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/v;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/u$b;->n(Lw/v;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/u$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw/u$b;->b:Ljava/lang/Object;

    check-cast p1, Lw/v;

    iget v4, p0, Lw/u$b;->c:F

    iget-object v6, p0, Lw/u$b;->d:Lr/i;

    new-instance v7, Lw/u$b$a;

    iget-object v1, p0, Lw/u$b;->e:Lkotlin/jvm/internal/K;

    invoke-direct {v7, v1, p1}, Lw/u$b$a;-><init>(Lkotlin/jvm/internal/K;Lw/v;)V

    iput v2, p0, Lw/u$b;->a:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lr/m0;->e(FFFLr/i;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/v;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/u$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/u$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/u$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
