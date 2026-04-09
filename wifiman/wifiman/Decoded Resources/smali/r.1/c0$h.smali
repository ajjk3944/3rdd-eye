.class final Lr/c0$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c0;->P(FLjava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lr/c0;

.field final synthetic e:Lr/o0;

.field final synthetic f:F


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lr/c0;Lr/o0;FLdh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c0$h;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr/c0$h;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr/c0$h;->d:Lr/c0;

    iput-object p4, p0, Lr/c0$h;->e:Lr/o0;

    iput p5, p0, Lr/c0$h;->f:F

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Lr/c0$h;

    iget-object v1, p0, Lr/c0$h;->b:Ljava/lang/Object;

    iget-object v2, p0, Lr/c0$h;->c:Ljava/lang/Object;

    iget-object v3, p0, Lr/c0$h;->d:Lr/c0;

    iget-object v4, p0, Lr/c0$h;->e:Lr/o0;

    iget v5, p0, Lr/c0$h;->f:F

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lr/c0$h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr/c0;Lr/o0;FLdh/e;)V

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lr/c0$h;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/c0$h;->a:I

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

    new-instance p1, Lr/c0$h$a;

    iget-object v4, p0, Lr/c0$h;->b:Ljava/lang/Object;

    iget-object v5, p0, Lr/c0$h;->c:Ljava/lang/Object;

    iget-object v6, p0, Lr/c0$h;->d:Lr/c0;

    iget-object v7, p0, Lr/c0$h;->e:Lr/o0;

    iget v8, p0, Lr/c0$h;->f:F

    const/4 v9, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lr/c0$h$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr/c0;Lr/o0;FLdh/e;)V

    iput v2, p0, Lr/c0$h;->a:I

    invoke-static {p1, p0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lr/c0$h;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/c0$h;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lr/c0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
