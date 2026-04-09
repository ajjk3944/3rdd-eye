.class final Lya/m$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lya/m;->a(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lya/m;

.field final synthetic c:Lcom/ui/uidb/UiDB$c;


# direct methods
.method constructor <init>(Lya/m;Lcom/ui/uidb/UiDB$c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lya/m$e;->b:Lya/m;

    iput-object p2, p0, Lya/m$e;->c:Lcom/ui/uidb/UiDB$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lya/m$e;

    iget-object v0, p0, Lya/m$e;->b:Lya/m;

    iget-object v1, p0, Lya/m$e;->c:Lcom/ui/uidb/UiDB$c;

    invoke-direct {p1, v0, v1, p2}, Lya/m$e;-><init>(Lya/m;Lcom/ui/uidb/UiDB$c;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lya/m$e;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lya/m$e;->a:I

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

    iget-object p1, p0, Lya/m$e;->b:Lya/m;

    invoke-static {p1}, Lya/m;->l(Lya/m;)Lza/d;

    move-result-object p1

    iget-object v1, p0, Lya/m$e;->c:Lcom/ui/uidb/UiDB$c;

    iput v2, p0, Lya/m$e;->a:I

    invoke-interface {p1, v1, p0}, Lza/d;->a(Lcom/ui/uidb/UiDB$c;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lya/m$e;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lya/m$e;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lya/m$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
