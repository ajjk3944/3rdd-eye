.class final LM/t$o;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/t;->q(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:J

.field final synthetic e:Lkotlin/jvm/internal/M;


# direct methods
.method constructor <init>(JLkotlin/jvm/internal/M;Ldh/e;)V
    .locals 0

    iput-wide p1, p0, LM/t$o;->d:J

    iput-object p3, p0, LM/t$o;->e:Lkotlin/jvm/internal/M;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LM/t$o;

    iget-wide v1, p0, LM/t$o;->d:J

    iget-object v3, p0, LM/t$o;->e:Lkotlin/jvm/internal/M;

    invoke-direct {v0, v1, v2, v3, p2}, LM/t$o;-><init>(JLkotlin/jvm/internal/M;Ldh/e;)V

    iput-object p1, v0, LM/t$o;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LM/t$o;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM/t$o;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LM/t$o;->c:Ljava/lang/Object;

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

    iget-object p1, p0, LM/t$o;->c:Ljava/lang/Object;

    check-cast p1, Ly0/b;

    iget-wide v3, p0, LM/t$o;->d:J

    new-instance v1, LM/t$o$a;

    iget-object v5, p0, LM/t$o;->e:Lkotlin/jvm/internal/M;

    invoke-direct {v1, v5}, LM/t$o$a;-><init>(Lkotlin/jvm/internal/M;)V

    iput-object p1, p0, LM/t$o;->c:Ljava/lang/Object;

    iput v2, p0, LM/t$o;->b:I

    invoke-static {p1, v3, v4, v1, p0}, Lw/j;->d(Ly0/b;JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Ly0/y;

    if-eqz p1, :cond_3

    iget-object p1, p0, LM/t$o;->e:Lkotlin/jvm/internal/M;

    iget-wide v1, p1, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v1, v2}, Ll0/h;->c(J)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LM/f;->Drag:LM/f;

    return-object p1

    :cond_3
    invoke-interface {v0}, Ly0/b;->Z()Ly0/n;

    move-result-object p1

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly0/y;

    invoke-static {p1}, Ly0/o;->d(Ly0/y;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ly0/y;->a()V

    sget-object p1, LM/f;->Up:LM/f;

    goto :goto_1

    :cond_4
    sget-object p1, LM/f;->Cancel:LM/f;

    :goto_1
    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM/t$o;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LM/t$o;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LM/t$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
