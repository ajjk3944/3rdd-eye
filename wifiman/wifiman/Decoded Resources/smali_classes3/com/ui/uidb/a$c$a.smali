.class final Lcom/ui/uidb/a$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/uidb/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/ui/uidb/a$c$a;->b:Lcom/ui/uidb/a;

    iput-object p2, p0, Lcom/ui/uidb/a$c$a;->c:LYa/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, Lcom/ui/uidb/a$c$a;

    iget-object v1, p0, Lcom/ui/uidb/a$c$a;->b:Lcom/ui/uidb/a;

    iget-object v2, p0, Lcom/ui/uidb/a$c$a;->c:LYa/a;

    invoke-direct {v0, v1, v2, p1}, Lcom/ui/uidb/a$c$a;-><init>(Lcom/ui/uidb/a;LYa/a;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lcom/ui/uidb/a$c$a;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/ui/uidb/a$c$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/uidb/a$c$a;->b:Lcom/ui/uidb/a;

    invoke-static {p1}, Lcom/ui/uidb/a;->c(Lcom/ui/uidb/a;)LXa/a;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/uidb/a$c$a;->c:LYa/a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LYa/a;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iput v2, p0, Lcom/ui/uidb/a$c$a;->a:I

    invoke-interface {p1, v1, p0}, LXa/a;->a(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/ui/uidb/a$c$a;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/uidb/a$c$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lcom/ui/uidb/a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
