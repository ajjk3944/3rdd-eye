.class final Lr/C$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/C;->f(Ljava/lang/Object;LIi/N;Lr/H;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lr/a;

.field final synthetic c:Lr/C;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lr/H;


# direct methods
.method constructor <init>(Lr/a;Lr/C;Ljava/lang/Object;Lr/H;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/C$a;->b:Lr/a;

    iput-object p2, p0, Lr/C$a;->c:Lr/C;

    iput-object p3, p0, Lr/C$a;->d:Ljava/lang/Object;

    iput-object p4, p0, Lr/C$a;->e:Lr/H;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Lr/C$a;

    iget-object v1, p0, Lr/C$a;->b:Lr/a;

    iget-object v2, p0, Lr/C$a;->c:Lr/C;

    iget-object v3, p0, Lr/C$a;->d:Ljava/lang/Object;

    iget-object v4, p0, Lr/C$a;->e:Lr/H;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lr/C$a;-><init>(Lr/a;Lr/C;Ljava/lang/Object;Lr/H;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/C$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/C$a;->a:I

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

    iget-object p1, p0, Lr/C$a;->b:Lr/a;

    invoke-virtual {p1}, Lr/a;->k()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lr/C$a;->c:Lr/C;

    invoke-static {v1}, Lr/C;->a(Lr/C;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object v3, p0, Lr/C$a;->b:Lr/a;

    iget-object v4, p0, Lr/C$a;->d:Ljava/lang/Object;

    iget-object v5, p0, Lr/C$a;->e:Lr/H;

    iput v2, p0, Lr/C$a;->a:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/C$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/C$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/C$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
