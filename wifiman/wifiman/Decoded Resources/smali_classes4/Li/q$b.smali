.class public final LLi/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/q;->d(LLi/g;Lmh/q;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/g;

.field final synthetic b:Lmh/q;


# direct methods
.method public constructor <init>(LLi/g;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LLi/q$b;->a:LLi/g;

    iput-object p2, p0, LLi/q$b;->b:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, LLi/q$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/q$b$a;

    iget v1, v0, LLi/q$b$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/q$b$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/q$b$a;

    invoke-direct {v0, p0, p2}, LLi/q$b$a;-><init>(LLi/q$b;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/q$b$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/q$b$a;->b:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LLi/q$b$a;->d:Ljava/lang/Object;

    check-cast p1, LMi/t;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LLi/q$b$a;->d:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    iget-object p1, v0, LLi/q$b$a;->e:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v2, v0, LLi/q$b$a;->d:Ljava/lang/Object;

    check-cast v2, LLi/q$b;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p0, LLi/q$b;->a:LLi/g;

    iput-object p0, v0, LLi/q$b$a;->d:Ljava/lang/Object;

    iput-object p1, v0, LLi/q$b$a;->e:Ljava/lang/Object;

    iput v5, v0, LLi/q$b$a;->b:I

    invoke-interface {p2, p1, v0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    new-instance p2, LMi/t;

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v4

    invoke-direct {p2, p1, v4}, LMi/t;-><init>(LLi/h;Ldh/i;)V

    :try_start_3
    iget-object p1, v2, LLi/q$b;->b:Lmh/q;

    iput-object p2, v0, LLi/q$b$a;->d:Ljava/lang/Object;

    iput-object v6, v0, LLi/q$b$a;->e:Ljava/lang/Object;

    iput v3, v0, LLi/q$b$a;->b:I

    const/4 v2, 0x6

    invoke-static {v2}, Lkotlin/jvm/internal/q;->a(I)V

    invoke-interface {p1, p2, v6, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x7

    invoke-static {v0}, Lkotlin/jvm/internal/q;->a(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, LMi/t;->releaseIntercepted()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_2
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    invoke-virtual {p1}, LMi/t;->releaseIntercepted()V

    throw p2

    :catchall_3
    move-exception p1

    move-object v2, p0

    :goto_4
    new-instance p2, LLi/S;

    invoke-direct {p2, p1}, LLi/S;-><init>(Ljava/lang/Throwable;)V

    iget-object v2, v2, LLi/q$b;->b:Lmh/q;

    iput-object p1, v0, LLi/q$b$a;->d:Ljava/lang/Object;

    iput-object v6, v0, LLi/q$b$a;->e:Ljava/lang/Object;

    iput v4, v0, LLi/q$b$a;->b:I

    invoke-static {p2, v2, p1, v0}, LLi/q;->a(LLi/h;Lmh/q;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_5
    throw p1
.end method
