.class final Lcom/ui/wifiman/ui/teleport/o$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/o;->q(Lcom/ui/wifiman/ui/teleport/d;Lof/a$c;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LHe/p;

.field final synthetic c:Lcom/ui/wifiman/ui/teleport/d;


# direct methods
.method constructor <init>(LHe/p;Lcom/ui/wifiman/ui/teleport/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$h;->b:LHe/p;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/o$h;->c:Lcom/ui/wifiman/ui/teleport/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lcom/ui/wifiman/ui/teleport/o$h;

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/o$h;->b:LHe/p;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/o$h;->c:Lcom/ui/wifiman/ui/teleport/d;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/wifiman/ui/teleport/o$h;-><init>(LHe/p;Lcom/ui/wifiman/ui/teleport/d;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/o$h;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/wifiman/ui/teleport/o$h;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$h;->b:LHe/p;

    invoke-virtual {p1}, LHe/p;->c()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$h;->c:Lcom/ui/wifiman/ui/teleport/d;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/d;->t0()V

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/o$h;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/ui/teleport/o$h;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/ui/teleport/o$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
