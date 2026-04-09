.class final Lcom/ui/sso/api/a$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/a;->a(LIi/N;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/ui/sso/api/a;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/a$e;->c:Lcom/ui/sso/api/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/sso/api/a$e;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/sso/api/a$e;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_0

    new-instance p1, Lcom/ui/sso/api/a$e$a;

    iget-object v0, p0, Lcom/ui/sso/api/a$e;->c:Lcom/ui/sso/api/a;

    invoke-direct {p1, v0}, Lcom/ui/sso/api/a$e$a;-><init>(Lcom/ui/sso/api/a;)V

    invoke-static {p1}, LUa/a;->e(Lmh/a;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/a$e$b;

    iget-object v1, p0, Lcom/ui/sso/api/a$e;->c:Lcom/ui/sso/api/a;

    invoke-direct {v0, v1}, Lcom/ui/sso/api/a$e$b;-><init>(Lcom/ui/sso/api/a;)V

    invoke-static {v0, p1}, LUa/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LLi/h;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Lcom/ui/sso/api/a$e;

    iget-object v0, p0, Lcom/ui/sso/api/a$e;->c:Lcom/ui/sso/api/a;

    invoke-direct {p1, v0, p3}, Lcom/ui/sso/api/a$e;-><init>(Lcom/ui/sso/api/a;Ldh/e;)V

    iput-object p2, p1, Lcom/ui/sso/api/a$e;->b:Ljava/lang/Object;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/sso/api/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/sso/api/a$e;->n(LLi/h;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
