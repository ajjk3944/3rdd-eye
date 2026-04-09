.class public final LLi/w$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/w$b;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/h;

.field final synthetic b:Lmh/p;


# direct methods
.method public constructor <init>(LLi/h;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LLi/w$b$a;->a:LLi/h;

    iput-object p2, p0, LLi/w$b$a;->b:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LLi/w$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/w$b$a$a;

    iget v1, v0, LLi/w$b$a$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/w$b$a$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/w$b$a$a;

    invoke-direct {v0, p0, p2}, LLi/w$b$a$a;-><init>(LLi/w$b$a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/w$b$a$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/w$b$a$a;->b:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LLi/w$b$a$a;->e:Ljava/lang/Object;

    check-cast p1, LLi/h;

    iget-object v2, v0, LLi/w$b$a$a;->d:Ljava/lang/Object;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LLi/w$b$a;->a:LLi/h;

    iget-object v2, p0, LLi/w$b$a;->b:Lmh/p;

    iput-object p1, v0, LLi/w$b$a$a;->d:Ljava/lang/Object;

    iput-object p2, v0, LLi/w$b$a$a;->e:Ljava/lang/Object;

    iput v4, v0, LLi/w$b$a$a;->b:I

    const/4 v4, 0x6

    invoke-static {v4}, Lkotlin/jvm/internal/q;->a(I)V

    invoke-interface {v2, p1, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x7

    invoke-static {v4}, Lkotlin/jvm/internal/q;->a(I)V

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p1

    move-object p1, p2

    :goto_1
    const/4 p2, 0x0

    iput-object p2, v0, LLi/w$b$a$a;->d:Ljava/lang/Object;

    iput-object p2, v0, LLi/w$b$a$a;->e:Ljava/lang/Object;

    iput v3, v0, LLi/w$b$a$a;->b:I

    invoke-interface {p1, v2, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
