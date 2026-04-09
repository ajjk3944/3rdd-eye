.class final LLi/v$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/v$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLi/v$a$b$a;
    }
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LLi/g;

.field final synthetic d:LLi/y;

.field final synthetic e:Ljava/lang/Object;


# direct methods
.method constructor <init>(LLi/g;LLi/y;Ljava/lang/Object;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LLi/v$a$b;->c:LLi/g;

    iput-object p2, p0, LLi/v$a$b;->d:LLi/y;

    iput-object p3, p0, LLi/v$a$b;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LLi/v$a$b;

    iget-object v1, p0, LLi/v$a$b;->c:LLi/g;

    iget-object v2, p0, LLi/v$a$b;->d:LLi/y;

    iget-object v3, p0, LLi/v$a$b;->e:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3, p2}, LLi/v$a$b;-><init>(LLi/g;LLi/y;Ljava/lang/Object;Ldh/e;)V

    iput-object p1, v0, LLi/v$a$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/H;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LLi/v$a$b;->n(LLi/H;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LLi/v$a$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LLi/v$a$b;->b:Ljava/lang/Object;

    check-cast p1, LLi/H;

    sget-object v1, LLi/v$a$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v2, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    iget-object p1, p0, LLi/v$a$b;->e:Ljava/lang/Object;

    sget-object v0, LLi/F;->a:LNi/C;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LLi/v$a$b;->d:LLi/y;

    invoke-interface {p1}, LLi/y;->h()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LLi/v$a$b;->d:LLi/y;

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    iget-object p1, p0, LLi/v$a$b;->c:LLi/g;

    iget-object v1, p0, LLi/v$a$b;->d:LLi/y;

    iput v2, p0, LLi/v$a$b;->a:I

    invoke-interface {p1, v1, p0}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LLi/H;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LLi/v$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LLi/v$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LLi/v$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
