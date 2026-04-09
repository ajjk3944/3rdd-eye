.class final LF/d0$a$b$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d0$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:LT/q0;

.field final synthetic d:Z

.field final synthetic e:Ly/m;


# direct methods
.method constructor <init>(LT/q0;ZLy/m;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LF/d0$a$b$a$b;->c:LT/q0;

    iput-boolean p2, p0, LF/d0$a$b$a$b;->d:Z

    iput-object p3, p0, LF/d0$a$b$a$b;->e:Ly/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LF/d0$a$b$a$b;

    iget-object v0, p0, LF/d0$a$b$a$b;->c:LT/q0;

    iget-boolean v1, p0, LF/d0$a$b$a$b;->d:Z

    iget-object v2, p0, LF/d0$a$b$a$b;->e:Ly/m;

    invoke-direct {p1, v0, v1, v2, p2}, LF/d0$a$b$a$b;-><init>(LT/q0;ZLy/m;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LF/d0$a$b$a$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF/d0$a$b$a$b;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LF/d0$a$b$a$b;->a:Ljava/lang/Object;

    check-cast v0, LT/q0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LF/d0$a$b$a$b;->c:LT/q0;

    invoke-interface {p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly/o$b;

    if-eqz p1, :cond_5

    iget-boolean v1, p0, LF/d0$a$b$a$b;->d:Z

    iget-object v3, p0, LF/d0$a$b$a$b;->e:Ly/m;

    iget-object v4, p0, LF/d0$a$b$a$b;->c:LT/q0;

    if-eqz v1, :cond_2

    new-instance v1, Ly/o$c;

    invoke-direct {v1, p1}, Ly/o$c;-><init>(Ly/o$b;)V

    goto :goto_0

    :cond_2
    new-instance v1, Ly/o$a;

    invoke-direct {v1, p1}, Ly/o$a;-><init>(Ly/o$b;)V

    :goto_0
    if-eqz v3, :cond_4

    iput-object v4, p0, LF/d0$a$b$a$b;->a:Ljava/lang/Object;

    iput v2, p0, LF/d0$a$b$a$b;->b:I

    invoke-interface {v3, v1, p0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, v4

    :goto_1
    move-object v4, v0

    :cond_4
    const/4 p1, 0x0

    invoke-interface {v4, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    :cond_5
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF/d0$a$b$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LF/d0$a$b$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LF/d0$a$b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
