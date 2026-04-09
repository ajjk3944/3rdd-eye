.class final LM5/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/a;->c(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LO5/a;

.field final synthetic c:Lx6/b;

.field final synthetic d:Lx6/b;

.field final synthetic e:LO5/c;


# direct methods
.method constructor <init>(LO5/a;Lx6/b;Lx6/b;LO5/c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LM5/a$d;->b:LO5/a;

    iput-object p2, p0, LM5/a$d;->c:Lx6/b;

    iput-object p3, p0, LM5/a$d;->d:Lx6/b;

    iput-object p4, p0, LM5/a$d;->e:LO5/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LM5/a$d;

    iget-object v1, p0, LM5/a$d;->b:LO5/a;

    iget-object v2, p0, LM5/a$d;->c:Lx6/b;

    iget-object v3, p0, LM5/a$d;->d:Lx6/b;

    iget-object v4, p0, LM5/a$d;->e:LO5/c;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LM5/a$d;-><init>(LO5/a;Lx6/b;Lx6/b;LO5/c;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LM5/a$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM5/a$d;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM5/a$d;->b:LO5/a;

    iget-object v1, p0, LM5/a$d;->c:Lx6/b;

    iget-object v3, p0, LM5/a$d;->d:Lx6/b;

    iget-object v4, p0, LM5/a$d;->e:LO5/c;

    iput v2, p0, LM5/a$d;->a:I

    invoke-virtual {p1, v1, v3, v4, p0}, LO5/a;->c(Lx6/b;Lx6/b;LO5/c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM5/a$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LM5/a$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LM5/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
