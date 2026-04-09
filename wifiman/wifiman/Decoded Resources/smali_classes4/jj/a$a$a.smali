.class final Ljj/a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljj/i;


# direct methods
.method constructor <init>(Ljj/i;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ljj/a$a$a;->c:Ljj/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Ljj/a$a$a;

    iget-object v1, p0, Ljj/a$a$a;->c:Ljj/i;

    invoke-direct {v0, v1, p2}, Ljj/a$a$a;-><init>(Ljj/i;Ldh/e;)V

    iput-object p1, v0, Ljj/a$a$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ljj/a$a$a;->n(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/a$a$a;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ljj/a$a$a;->b:Ljava/lang/Object;

    check-cast v0, Ly0/y;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ljj/a$a$a;->b:Ljava/lang/Object;

    check-cast v1, Ly0/G;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ljj/a$a$a;->b:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly0/G;

    new-instance p1, Ljj/a$a$a$a;

    const/4 v4, 0x0

    invoke-direct {p1, v4}, Ljj/a$a$a$a;-><init>(Ldh/e;)V

    iput-object v1, p0, Ljj/a$a$a;->b:Ljava/lang/Object;

    iput v3, p0, Ljj/a$a$a;->a:I

    invoke-interface {v1, p1, p0}, Ly0/G;->P(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ly0/y;

    iput-object p1, p0, Ljj/a$a$a;->b:Ljava/lang/Object;

    iput v2, p0, Ljj/a$a$a;->a:I

    invoke-static {v1, p1, p0}, Ljj/c;->b(Ly0/G;Ly0/y;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, p1

    move-object p1, v1

    :goto_1
    check-cast p1, Ly0/y;

    if-eqz p1, :cond_5

    iget-object p1, p0, Ljj/a$a$a;->c:Ljj/i;

    invoke-virtual {p1}, Ljj/i;->w()LKi/g;

    move-result-object p1

    new-instance v7, Ljj/k;

    invoke-virtual {v0}, Ly0/y;->f()J

    move-result-wide v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ljj/k;-><init>(JLl0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v7}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljj/a$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ljj/a$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ljj/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
