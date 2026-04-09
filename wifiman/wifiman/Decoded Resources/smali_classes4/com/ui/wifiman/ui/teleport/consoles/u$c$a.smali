.class final Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/consoles/u$c;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/consoles/i;

.field final synthetic c:Lcom/ui/wifiman/ui/teleport/consoles/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/consoles/i;Lcom/ui/wifiman/ui/teleport/consoles/h;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->b:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->c:Lcom/ui/wifiman/ui/teleport/consoles/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->b:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->c:Lcom/ui/wifiman/ui/teleport/consoles/h;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;-><init>(Lcom/ui/wifiman/ui/teleport/consoles/i;Lcom/ui/wifiman/ui/teleport/consoles/h;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->b:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->c:Lcom/ui/wifiman/ui/teleport/consoles/h;

    invoke-virtual {p1, v0}, Lcom/ui/wifiman/ui/teleport/consoles/i;->p0(Lcom/ui/wifiman/ui/teleport/consoles/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
