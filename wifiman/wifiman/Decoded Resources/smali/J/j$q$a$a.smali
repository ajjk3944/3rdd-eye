.class final LJ/j$q$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j$q$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:LJ/j;

.field final synthetic d:J

.field final synthetic e:Ly/m;


# direct methods
.method constructor <init>(LJ/j;JLy/m;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LJ/j$q$a$a;->c:LJ/j;

    iput-wide p2, p0, LJ/j$q$a$a;->d:J

    iput-object p4, p0, LJ/j$q$a$a;->e:Ly/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LJ/j$q$a$a;

    iget-object v1, p0, LJ/j$q$a$a;->c:LJ/j;

    iget-wide v2, p0, LJ/j$q$a$a;->d:J

    iget-object v4, p0, LJ/j$q$a$a;->e:Ly/m;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LJ/j$q$a$a;-><init>(LJ/j;JLy/m;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LJ/j$q$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ/j$q$a$a;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, LJ/j$q$a$a;->a:Ljava/lang/Object;

    check-cast v0, Ly/o$b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LJ/j$q$a$a;->a:Ljava/lang/Object;

    check-cast v1, LJ/j;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ/j$q$a$a;->c:LJ/j;

    invoke-static {p1}, LJ/j;->i(LJ/j;)Ly/o$b;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, LJ/j$q$a$a;->e:Ly/m;

    iget-object v5, p0, LJ/j$q$a$a;->c:LJ/j;

    new-instance v6, Ly/o$a;

    invoke-direct {v6, p1}, Ly/o$a;-><init>(Ly/o$b;)V

    iput-object v5, p0, LJ/j$q$a$a;->a:Ljava/lang/Object;

    iput v4, p0, LJ/j$q$a$a;->b:I

    invoke-interface {v1, v6, p0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v1, v5

    :goto_0
    invoke-static {v1, v2}, LJ/j;->t(LJ/j;Ly/o$b;)V

    :cond_4
    new-instance p1, Ly/o$b;

    iget-wide v4, p0, LJ/j$q$a$a;->d:J

    invoke-direct {p1, v4, v5, v2}, Ly/o$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, LJ/j$q$a$a;->e:Ly/m;

    iput-object p1, p0, LJ/j$q$a$a;->a:Ljava/lang/Object;

    iput v3, p0, LJ/j$q$a$a;->b:I

    invoke-interface {v1, p1, p0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v0, p1

    :goto_1
    iget-object p1, p0, LJ/j$q$a$a;->c:LJ/j;

    invoke-static {p1, v0}, LJ/j;->t(LJ/j;Ly/o$b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJ/j$q$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LJ/j$q$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LJ/j$q$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
