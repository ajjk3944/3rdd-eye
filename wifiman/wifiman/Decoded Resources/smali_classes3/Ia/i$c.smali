.class final LIa/i$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIa/i;->a(Lspeedtest/DirectoryServerApi;LIa/d;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LIa/d;


# direct methods
.method constructor <init>(LIa/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LIa/i$c;->b:LIa/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LIa/i$c;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, LIa/i$c$a;

    iget-object v0, p0, LIa/i$c;->b:LIa/d;

    invoke-direct {p1, v0}, LIa/i$c$a;-><init>(LIa/d;)V

    invoke-static {p1}, LLa/a;->b(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LLi/h;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;
    .locals 0

    new-instance p1, LIa/i$c;

    iget-object p2, p0, LIa/i$c;->b:LIa/d;

    invoke-direct {p1, p2, p3}, LIa/i$c;-><init>(LIa/d;Ldh/e;)V

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LIa/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/h;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, LIa/i$c;->n(LLi/h;Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
