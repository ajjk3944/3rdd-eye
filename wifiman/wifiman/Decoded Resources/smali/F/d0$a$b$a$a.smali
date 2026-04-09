.class final LF/d0$a$b$a$a;
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

.field final synthetic d:J

.field final synthetic e:Ly/m;


# direct methods
.method constructor <init>(LT/q0;JLy/m;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LF/d0$a$b$a$a;->c:LT/q0;

    iput-wide p2, p0, LF/d0$a$b$a$a;->d:J

    iput-object p4, p0, LF/d0$a$b$a$a;->e:Ly/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LF/d0$a$b$a$a;

    iget-object v1, p0, LF/d0$a$b$a$a;->c:LT/q0;

    iget-wide v2, p0, LF/d0$a$b$a$a;->d:J

    iget-object v4, p0, LF/d0$a$b$a$a;->e:Ly/m;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LF/d0$a$b$a$a;-><init>(LT/q0;JLy/m;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LF/d0$a$b$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF/d0$a$b$a$a;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, LF/d0$a$b$a$a;->a:Ljava/lang/Object;

    check-cast v0, Ly/o$b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LF/d0$a$b$a$a;->a:Ljava/lang/Object;

    check-cast v1, LT/q0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LF/d0$a$b$a$a;->c:LT/q0;

    invoke-interface {p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly/o$b;

    if-eqz p1, :cond_5

    iget-object v1, p0, LF/d0$a$b$a$a;->e:Ly/m;

    iget-object v5, p0, LF/d0$a$b$a$a;->c:LT/q0;

    new-instance v6, Ly/o$a;

    invoke-direct {v6, p1}, Ly/o$a;-><init>(Ly/o$b;)V

    if-eqz v1, :cond_4

    iput-object v5, p0, LF/d0$a$b$a$a;->a:Ljava/lang/Object;

    iput v4, p0, LF/d0$a$b$a$a;->b:I

    invoke-interface {v1, v6, p0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v1, v5

    :goto_0
    move-object v5, v1

    :cond_4
    invoke-interface {v5, v2}, LT/q0;->setValue(Ljava/lang/Object;)V

    :cond_5
    new-instance p1, Ly/o$b;

    iget-wide v4, p0, LF/d0$a$b$a$a;->d:J

    invoke-direct {p1, v4, v5, v2}, Ly/o$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, LF/d0$a$b$a$a;->e:Ly/m;

    if-eqz v1, :cond_7

    iput-object p1, p0, LF/d0$a$b$a$a;->a:Ljava/lang/Object;

    iput v3, p0, LF/d0$a$b$a$a;->b:I

    invoke-interface {v1, p1, p0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, p1

    :goto_1
    move-object p1, v0

    :cond_7
    iget-object v0, p0, LF/d0$a$b$a$a;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF/d0$a$b$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LF/d0$a$b$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LF/d0$a$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
