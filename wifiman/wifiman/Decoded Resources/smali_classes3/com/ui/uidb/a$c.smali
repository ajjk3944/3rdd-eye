.class final Lcom/ui/uidb/a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/uidb/a;->a(LYa/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/uidb/a;

.field final synthetic c:LYa/a;


# direct methods
.method constructor <init>(Lcom/ui/uidb/a;LYa/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/uidb/a$c;->b:Lcom/ui/uidb/a;

    iput-object p2, p0, Lcom/ui/uidb/a$c;->c:LYa/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/uidb/a$c;

    iget-object v0, p0, Lcom/ui/uidb/a$c;->b:Lcom/ui/uidb/a;

    iget-object v1, p0, Lcom/ui/uidb/a$c;->c:LYa/a;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/uidb/a$c;-><init>(Lcom/ui/uidb/a;LYa/a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/uidb/a$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/uidb/a$c;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/uidb/a$c;->b:Lcom/ui/uidb/a;

    new-instance v1, Lcom/ui/uidb/a$c$a;

    iget-object v3, p0, Lcom/ui/uidb/a$c;->c:LYa/a;

    const/4 v4, 0x0

    invoke-direct {v1, p1, v3, v4}, Lcom/ui/uidb/a$c$a;-><init>(Lcom/ui/uidb/a;LYa/a;Ldh/e;)V

    iput v2, p0, Lcom/ui/uidb/a$c;->a:I

    invoke-static {p1, v1, p0}, Lcom/ui/uidb/a;->b(Lcom/ui/uidb/a;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/ui/uidb/a$a;

    iget-object v0, p0, Lcom/ui/uidb/a$c;->b:Lcom/ui/uidb/a;

    invoke-static {v0}, Lcom/ui/uidb/a;->e(Lcom/ui/uidb/a;)Lbb/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/uidb/a$c;->b:Lcom/ui/uidb/a;

    invoke-static {v1}, Lcom/ui/uidb/a;->d(Lcom/ui/uidb/a;)Lcom/ui/uidb/UiDB$b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/uidb/a$a;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lbb/b;->a(Lcom/ui/uidb/UiDB$b;Ljava/lang/String;)Lbb/a;

    move-result-object v0

    new-instance v1, Lcom/ui/uidb/UiDB$c;

    new-instance v2, Lbb/a$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ui/uidb/a$a;->b()LYa/a;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lbb/a$a;-><init>(JLYa/a;)V

    invoke-virtual {p1}, Lcom/ui/uidb/a$a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/uidb/a$c;->b:Lcom/ui/uidb/a;

    invoke-static {v3}, Lcom/ui/uidb/a;->d(Lcom/ui/uidb/a;)Lcom/ui/uidb/UiDB$b;

    move-result-object v3

    invoke-direct {v1, v2, v0, p1, v3}, Lcom/ui/uidb/UiDB$c;-><init>(Lbb/a$a;Lbb/a;Ljava/lang/String;Lcom/ui/uidb/UiDB$b;)V

    return-object v1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/uidb/a$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/uidb/a$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/uidb/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
