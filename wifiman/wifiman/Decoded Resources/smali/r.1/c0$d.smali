.class final Lr/c0$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c0;->B(Ljava/lang/Object;Lr/H;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lr/o0;

.field final synthetic c:Lr/c0;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lr/H;


# direct methods
.method constructor <init>(Lr/o0;Lr/c0;Ljava/lang/Object;Lr/H;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c0$d;->b:Lr/o0;

    iput-object p2, p0, Lr/c0$d;->c:Lr/c0;

    iput-object p3, p0, Lr/c0$d;->d:Ljava/lang/Object;

    iput-object p4, p0, Lr/c0$d;->e:Lr/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lr/c0$d;

    iget-object v1, p0, Lr/c0$d;->b:Lr/o0;

    iget-object v2, p0, Lr/c0$d;->c:Lr/c0;

    iget-object v3, p0, Lr/c0$d;->d:Ljava/lang/Object;

    iget-object v4, p0, Lr/c0$d;->e:Lr/H;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lr/c0$d;-><init>(Lr/o0;Lr/c0;Ljava/lang/Object;Lr/H;Ldh/e;)V

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lr/c0$d;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/c0$d;->a:I

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

    new-instance p1, Lr/c0$d$a;

    iget-object v4, p0, Lr/c0$d;->c:Lr/c0;

    iget-object v5, p0, Lr/c0$d;->d:Ljava/lang/Object;

    iget-object v6, p0, Lr/c0$d;->b:Lr/o0;

    iget-object v7, p0, Lr/c0$d;->e:Lr/H;

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lr/c0$d$a;-><init>(Lr/c0;Ljava/lang/Object;Lr/o0;Lr/H;Ldh/e;)V

    iput v2, p0, Lr/c0$d;->a:I

    invoke-static {p1, p0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lr/c0$d;->b:Lr/o0;

    invoke-virtual {p1}, Lr/o0;->z()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lr/c0$d;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/c0$d;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lr/c0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
