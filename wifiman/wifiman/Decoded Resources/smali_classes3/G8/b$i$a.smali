.class public final LG8/b$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/b$i;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/h;


# direct methods
.method public constructor <init>(LLi/h;)V
    .locals 0

    iput-object p1, p0, LG8/b$i$a;->a:LLi/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LG8/b$i$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LG8/b$i$a$a;

    iget v1, v0, LG8/b$i$a$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LG8/b$i$a$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, LG8/b$i$a$a;

    invoke-direct {v0, p0, p2}, LG8/b$i$a$a;-><init>(LG8/b$i$a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LG8/b$i$a$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG8/b$i$a$a;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LG8/b$i$a;->a:LLi/h;

    check-cast p1, Lq9/h;

    sget-object v2, LG8/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v3, :cond_4

    const/4 v2, 0x2

    if-ne p1, v2, :cond_3

    new-instance p1, Ls9/d$b;

    const v2, 0x7f110024

    invoke-direct {p1, v2}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ls9/d$b;

    const v2, 0x7f110025

    invoke-direct {p1, v2}, Ls9/d$b;-><init>(I)V

    :goto_1
    iput v3, v0, LG8/b$i$a$a;->b:I

    invoke-interface {p2, p1, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
