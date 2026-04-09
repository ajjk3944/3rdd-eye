.class final LO1/d$a$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/d$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I


# direct methods
.method constructor <init>(LO1/c;Ldh/e;)V
    .locals 0

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LO1/d$a$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, LO1/d$a$c$a;-><init>(LO1/c;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, LO1/d$a$c$a;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LO1/d$a$c$a;->a:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iput v1, p0, LO1/d$a$c$a;->a:I

    const/4 p1, 0x0

    throw p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LO1/d$a$c$a;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LO1/d$a$c$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, LO1/d$a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
