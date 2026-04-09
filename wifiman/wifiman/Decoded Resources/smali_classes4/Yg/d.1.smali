.class final LYg/d;
.super LYg/c;
.source "SourceFile"

# interfaces
.implements Ldh/e;


# instance fields
.field private a:Lmh/q;

.field private b:Ljava/lang/Object;

.field private c:Ldh/e;

.field private d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmh/q;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYg/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LYg/d;->a:Lmh/q;

    iput-object p2, p0, LYg/d;->b:Ljava/lang/Object;

    const-string p1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p0, LYg/d;->c:Ldh/e;

    invoke-static {}, LYg/b;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LYg/d;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LYg/d;->c:Ldh/e;

    iput-object p1, p0, LYg/d;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, LYg/d;->d:Ljava/lang/Object;

    iget-object v1, p0, LYg/d;->c:Ldh/e;

    if-nez v1, :cond_1

    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    invoke-static {}, LYg/b;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, LYg/u;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :try_start_0
    iget-object v0, p0, LYg/d;->a:Lmh/q;

    iget-object v2, p0, LYg/d;->b:Ljava/lang/Object;

    instance-of v3, v0, Lkotlin/coroutines/jvm/internal/a;

    if-nez v3, :cond_2

    invoke-static {v0, p0, v2, v1}, Leh/b;->f(Lmh/q;Ljava/lang/Object;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    const/4 v3, 0x3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/q;

    invoke-interface {v0, p0, v2, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v2

    if-eq v0, v2, :cond_0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :goto_2
    sget-object v2, LYg/u;->b:LYg/u$a;

    invoke-static {v0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {}, LYg/b;->a()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, LYg/d;->d:Ljava/lang/Object;

    invoke-interface {v1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public getContext()Ldh/i;
    .locals 1

    sget-object v0, Ldh/j;->a:Ldh/j;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LYg/d;->c:Ldh/e;

    iput-object p1, p0, LYg/d;->d:Ljava/lang/Object;

    return-void
.end method
