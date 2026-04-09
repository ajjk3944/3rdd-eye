.class final LLi/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/e;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/e;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:LLi/h;


# direct methods
.method constructor <init>(LLi/e;Lkotlin/jvm/internal/N;LLi/h;)V
    .locals 0

    iput-object p1, p0, LLi/e$a;->a:LLi/e;

    iput-object p2, p0, LLi/e$a;->b:Lkotlin/jvm/internal/N;

    iput-object p3, p0, LLi/e$a;->c:LLi/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LLi/e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/e$a$a;

    iget v1, v0, LLi/e$a$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/e$a$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/e$a$a;

    invoke-direct {v0, p0, p2}, LLi/e$a$a;-><init>(LLi/e$a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/e$a$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/e$a$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LLi/e$a;->a:LLi/e;

    iget-object p2, p2, LLi/e;->b:Lmh/l;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, LLi/e$a;->b:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object v4, LMi/r;->a:LNi/C;

    if-eq v2, v4, :cond_4

    iget-object v4, p0, LLi/e$a;->a:LLi/e;

    iget-object v4, v4, LLi/e;->c:Lmh/p;

    invoke-interface {v4, v2, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    :goto_1
    iget-object v2, p0, LLi/e$a;->b:Lkotlin/jvm/internal/N;

    iput-object p2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object p2, p0, LLi/e$a;->c:LLi/h;

    iput v3, v0, LLi/e$a$a;->c:I

    invoke-interface {p2, p1, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
