.class final LMi/j$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMi/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:[LLi/g;

.field final synthetic c:I

.field final synthetic d:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic e:LKi/g;


# direct methods
.method constructor <init>([LLi/g;ILjava/util/concurrent/atomic/AtomicInteger;LKi/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LMi/j$a$a;->b:[LLi/g;

    iput p2, p0, LMi/j$a$a;->c:I

    iput-object p3, p0, LMi/j$a$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, LMi/j$a$a;->e:LKi/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LMi/j$a$a;

    iget-object v1, p0, LMi/j$a$a;->b:[LLi/g;

    iget v2, p0, LMi/j$a$a;->c:I

    iget-object v3, p0, LMi/j$a$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, LMi/j$a$a;->e:LKi/g;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LMi/j$a$a;-><init>([LLi/g;ILjava/util/concurrent/atomic/AtomicInteger;LKi/g;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LMi/j$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LMi/j$a$a;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, LMi/j$a$a;->b:[LLi/g;

    iget v1, p0, LMi/j$a$a;->c:I

    aget-object p1, p1, v1

    new-instance v4, LMi/j$a$a$a;

    iget-object v5, p0, LMi/j$a$a;->e:LKi/g;

    invoke-direct {v4, v5, v1}, LMi/j$a$a$a;-><init>(LKi/g;I)V

    iput v3, p0, LMi/j$a$a;->a:I

    invoke-interface {p1, v4, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LMi/j$a$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, LMi/j$a$a;->e:LKi/g;

    invoke-static {p1, v2, v3, v2}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_1
    iget-object v0, p0, LMi/j$a$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LMi/j$a$a;->e:LKi/g;

    invoke-static {v0, v2, v3, v2}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_4
    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LMi/j$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LMi/j$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LMi/j$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
