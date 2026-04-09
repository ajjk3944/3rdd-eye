.class final LF/d0$a$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d0$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:J

.field final synthetic d:LIi/N;

.field final synthetic e:LT/q0;

.field final synthetic f:Ly/m;


# direct methods
.method constructor <init>(LIi/N;LT/q0;Ly/m;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LF/d0$a$b$a;->d:LIi/N;

    iput-object p2, p0, LF/d0$a$b$a;->e:LT/q0;

    iput-object p3, p0, LF/d0$a$b$a;->f:Ly/m;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF/d0$a$b$a;->a:I

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

    iget-object p1, p0, LF/d0$a$b$a;->b:Ljava/lang/Object;

    check-cast p1, Lw/r;

    iget-wide v5, p0, LF/d0$a$b$a;->c:J

    iget-object v1, p0, LF/d0$a$b$a;->d:LIi/N;

    new-instance v10, LF/d0$a$b$a$a;

    iget-object v4, p0, LF/d0$a$b$a;->e:LT/q0;

    iget-object v7, p0, LF/d0$a$b$a;->f:Ly/m;

    const/4 v8, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v8}, LF/d0$a$b$a$a;-><init>(LT/q0;JLy/m;Ldh/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v7, v1

    invoke-static/range {v7 .. v12}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iput v2, p0, LF/d0$a$b$a;->a:I

    invoke-interface {p1, p0}, Lw/r;->q0(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, LF/d0$a$b$a;->d:LIi/N;

    new-instance v3, LF/d0$a$b$a$b;

    iget-object v1, p0, LF/d0$a$b$a;->e:LT/q0;

    iget-object v2, p0, LF/d0$a$b$a;->f:Ly/m;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p1, v2, v4}, LF/d0$a$b$a$b;-><init>(LT/q0;ZLy/m;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/r;JLdh/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LF/d0$a$b$a;

    iget-object v1, p0, LF/d0$a$b$a;->d:LIi/N;

    iget-object v2, p0, LF/d0$a$b$a;->e:LT/q0;

    iget-object v3, p0, LF/d0$a$b$a;->f:Ly/m;

    invoke-direct {v0, v1, v2, v3, p4}, LF/d0$a$b$a;-><init>(LIi/N;LT/q0;Ly/m;Ldh/e;)V

    iput-object p1, v0, LF/d0$a$b$a;->b:Ljava/lang/Object;

    iput-wide p2, v0, LF/d0$a$b$a;->c:J

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, LF/d0$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lw/r;

    check-cast p2, Ll0/g;

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, v0, v1, p3}, LF/d0$a$b$a;->n(Lw/r;JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
