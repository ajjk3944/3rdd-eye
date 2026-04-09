.class final LF/m$s$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Ly0/G;

.field final synthetic d:LF/U;

.field final synthetic e:LM/G;


# direct methods
.method constructor <init>(Ly0/G;LF/U;LM/G;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LF/m$s$a;->c:Ly0/G;

    iput-object p2, p0, LF/m$s$a;->d:LF/U;

    iput-object p3, p0, LF/m$s$a;->e:LM/G;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LF/m$s$a;

    iget-object v1, p0, LF/m$s$a;->c:Ly0/G;

    iget-object v2, p0, LF/m$s$a;->d:LF/U;

    iget-object v3, p0, LF/m$s$a;->e:LM/G;

    invoke-direct {v0, v1, v2, v3, p2}, LF/m$s$a;-><init>(Ly0/G;LF/U;LM/G;Ldh/e;)V

    iput-object p1, v0, LF/m$s$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LF/m$s$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LF/m$s$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LF/m$s$a;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    sget-object v6, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v3, LF/m$s$a$a;

    iget-object v0, p0, LF/m$s$a;->c:Ly0/G;

    iget-object v1, p0, LF/m$s$a;->d:LF/U;

    const/4 v7, 0x0

    invoke-direct {v3, v0, v1, v7}, LF/m$s$a$a;-><init>(Ly0/G;LF/U;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance v3, LF/m$s$a$b;

    iget-object v0, p0, LF/m$s$a;->c:Ly0/G;

    iget-object v1, p0, LF/m$s$a;->e:LM/G;

    invoke-direct {v3, v0, v1, v7}, LF/m$s$a$b;-><init>(Ly0/G;LM/G;Ldh/e;)V

    const/4 v1, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

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

    invoke-virtual {p0, p1, p2}, LF/m$s$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LF/m$s$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LF/m$s$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
