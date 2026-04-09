.class final Ly9/s$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/s;->c(LLi/g;Ljava/lang/Object;Lmh/r;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LLi/g;

.field final synthetic d:LT/q0;

.field final synthetic e:LT/q0;

.field final synthetic f:Lmh/r;


# direct methods
.method constructor <init>(LLi/g;LT/q0;LT/q0;Lmh/r;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ly9/s$b;->c:LLi/g;

    iput-object p2, p0, Ly9/s$b;->d:LT/q0;

    iput-object p3, p0, Ly9/s$b;->e:LT/q0;

    iput-object p4, p0, Ly9/s$b;->f:Lmh/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Ly9/s$b;

    iget-object v1, p0, Ly9/s$b;->c:LLi/g;

    iget-object v2, p0, Ly9/s$b;->d:LT/q0;

    iget-object v3, p0, Ly9/s$b;->e:LT/q0;

    iget-object v4, p0, Ly9/s$b;->f:Lmh/r;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ly9/s$b;-><init>(LLi/g;LT/q0;LT/q0;Lmh/r;Ldh/e;)V

    iput-object p1, v6, Ly9/s$b;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ly9/s$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Ly9/s$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly9/s$b;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v0, p0, Ly9/s$b;->c:LLi/g;

    new-instance v1, Ly9/s$b$a;

    iget-object v2, p0, Ly9/s$b;->d:LT/q0;

    iget-object v3, p0, Ly9/s$b;->e:LT/q0;

    iget-object v4, p0, Ly9/s$b;->f:Lmh/r;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Ly9/s$b$a;-><init>(LT/q0;LT/q0;Lmh/r;Ldh/e;)V

    invoke-static {v0, v1}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {v0, p1}, LLi/i;->D(LLi/g;LIi/N;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly9/s$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ly9/s$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ly9/s$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
