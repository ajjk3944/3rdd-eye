.class final Ljj/f$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/f;->a(Ly0/G;JLmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:J

.field final synthetic e:Lmh/a;

.field final synthetic f:Lmh/a;

.field final synthetic g:Lmh/p;


# direct methods
.method constructor <init>(JLmh/a;Lmh/a;Lmh/p;Ldh/e;)V
    .locals 0

    iput-wide p1, p0, Ljj/f$a;->d:J

    iput-object p3, p0, Ljj/f$a;->e:Lmh/a;

    iput-object p4, p0, Ljj/f$a;->f:Lmh/a;

    iput-object p5, p0, Ljj/f$a;->g:Lmh/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Ljj/f$a;

    iget-wide v1, p0, Ljj/f$a;->d:J

    iget-object v3, p0, Ljj/f$a;->e:Lmh/a;

    iget-object v4, p0, Ljj/f$a;->f:Lmh/a;

    iget-object v5, p0, Ljj/f$a;->g:Lmh/p;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ljj/f$a;-><init>(JLmh/a;Lmh/a;Lmh/p;Ldh/e;)V

    iput-object p1, v7, Ljj/f$a;->c:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ljj/f$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/f$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ljj/f$a;->c:Ljava/lang/Object;

    check-cast v0, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ljj/f$a;->c:Ljava/lang/Object;

    check-cast p1, Ly0/b;

    iget-wide v3, p0, Ljj/f$a;->d:J

    new-instance v1, Ljj/f$a$a;

    iget-object v5, p0, Ljj/f$a;->g:Lmh/p;

    invoke-direct {v1, v5}, Ljj/f$a$a;-><init>(Lmh/p;)V

    iput-object p1, p0, Ljj/f$a;->c:Ljava/lang/Object;

    iput v2, p0, Ljj/f$a;->b:I

    invoke-static {p1, v3, v4, v1, p0}, Lw/j;->h(Ly0/b;JLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v0}, Ly0/b;->Z()Ly0/n;

    move-result-object p1

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/y;

    invoke-static {v0}, Ly0/o;->c(Ly0/y;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ly0/y;->a()V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Ljj/f$a;->e:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_5
    iget-object p1, p0, Ljj/f$a;->f:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljj/f$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ljj/f$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ljj/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
