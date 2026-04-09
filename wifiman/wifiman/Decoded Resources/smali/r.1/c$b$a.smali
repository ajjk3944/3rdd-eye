.class final Lr/c$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lr/a;

.field final synthetic d:LT/z1;

.field final synthetic e:LT/z1;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lr/a;LT/z1;LT/z1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c$b$a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr/c$b$a;->c:Lr/a;

    iput-object p3, p0, Lr/c$b$a;->d:LT/z1;

    iput-object p4, p0, Lr/c$b$a;->e:LT/z1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Lr/c$b$a;

    iget-object v1, p0, Lr/c$b$a;->b:Ljava/lang/Object;

    iget-object v2, p0, Lr/c$b$a;->c:Lr/a;

    iget-object v3, p0, Lr/c$b$a;->d:LT/z1;

    iget-object v4, p0, Lr/c$b$a;->e:LT/z1;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lr/c$b$a;-><init>(Ljava/lang/Object;Lr/a;LT/z1;LT/z1;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/c$b$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/c$b$a;->a:I

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

    iget-object p1, p0, Lr/c$b$a;->b:Ljava/lang/Object;

    iget-object v1, p0, Lr/c$b$a;->c:Lr/a;

    invoke-virtual {v1}, Lr/a;->k()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object v3, p0, Lr/c$b$a;->c:Lr/a;

    iget-object v4, p0, Lr/c$b$a;->b:Ljava/lang/Object;

    iget-object p1, p0, Lr/c$b$a;->d:LT/z1;

    invoke-static {p1}, Lr/c;->b(LT/z1;)Lr/i;

    move-result-object v5

    iput v2, p0, Lr/c$b$a;->a:I

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
    iget-object p1, p0, Lr/c$b$a;->e:LT/z1;

    invoke-static {p1}, Lr/c;->a(LT/z1;)Lmh/l;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lr/c$b$a;->c:Lr/a;

    invoke-virtual {v0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/c$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/c$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/c$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
