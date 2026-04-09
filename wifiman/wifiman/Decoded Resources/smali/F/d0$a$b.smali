.class final LF/d0$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d0$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LIi/N;

.field final synthetic d:LT/q0;

.field final synthetic e:Ly/m;

.field final synthetic f:LT/z1;


# direct methods
.method constructor <init>(LIi/N;LT/q0;Ly/m;LT/z1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LF/d0$a$b;->c:LIi/N;

    iput-object p2, p0, LF/d0$a$b;->d:LT/q0;

    iput-object p3, p0, LF/d0$a$b;->e:Ly/m;

    iput-object p4, p0, LF/d0$a$b;->f:LT/z1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, LF/d0$a$b;

    iget-object v1, p0, LF/d0$a$b;->c:LIi/N;

    iget-object v2, p0, LF/d0$a$b;->d:LT/q0;

    iget-object v3, p0, LF/d0$a$b;->e:Ly/m;

    iget-object v4, p0, LF/d0$a$b;->f:LT/z1;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LF/d0$a$b;-><init>(LIi/N;LT/q0;Ly/m;LT/z1;Ldh/e;)V

    iput-object p1, v6, LF/d0$a$b;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LF/d0$a$b;->n(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF/d0$a$b;->a:I

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

    iget-object p1, p0, LF/d0$a$b;->b:Ljava/lang/Object;

    check-cast p1, Ly0/G;

    new-instance v1, LF/d0$a$b$a;

    iget-object v3, p0, LF/d0$a$b;->c:LIi/N;

    iget-object v4, p0, LF/d0$a$b;->d:LT/q0;

    iget-object v5, p0, LF/d0$a$b;->e:Ly/m;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, LF/d0$a$b$a;-><init>(LIi/N;LT/q0;Ly/m;Ldh/e;)V

    new-instance v3, LF/d0$a$b$b;

    iget-object v4, p0, LF/d0$a$b;->f:LT/z1;

    invoke-direct {v3, v4}, LF/d0$a$b$b;-><init>(LT/z1;)V

    iput v2, p0, LF/d0$a$b;->a:I

    invoke-static {p1, v1, v3, p0}, Lw/B;->i(Ly0/G;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF/d0$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LF/d0$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LF/d0$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
