.class final LLi/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/r;->b(LLi/g;LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/h;

.field final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(LLi/h;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, LLi/r$c;->a:LLi/h;

    iput-object p2, p0, LLi/r$c;->b:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LLi/r$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/r$c$a;

    iget v1, v0, LLi/r$c$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/r$c$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/r$c$a;

    invoke-direct {v0, p0, p2}, LLi/r$c$a;-><init>(LLi/r$c;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/r$c$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/r$c$a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LLi/r$c$a;->a:Ljava/lang/Object;

    check-cast p1, LLi/r$c;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, LLi/r$c;->a:LLi/h;

    iput-object p0, v0, LLi/r$c$a;->a:Ljava/lang/Object;

    iput v3, v0, LLi/r$c$a;->d:I

    invoke-interface {p2, p1, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    iget-object p1, p1, LLi/r$c;->b:Lkotlin/jvm/internal/N;

    iput-object p2, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    throw p2
.end method
