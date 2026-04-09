.class final LJ/j$q;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->N(Ly0/G;Ly/m;Lmh/a;Lmh/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:J

.field final synthetic d:Ly/m;

.field final synthetic e:LJ/j;


# direct methods
.method constructor <init>(Ly/m;LJ/j;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LJ/j$q;->d:Ly/m;

    iput-object p2, p0, LJ/j$q;->e:LJ/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ/j$q;->a:I

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

    iget-object p1, p0, LJ/j$q;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lw/r;

    iget-wide v6, p0, LJ/j$q;->c:J

    iget-object v8, p0, LJ/j$q;->d:Ly/m;

    if-eqz v8, :cond_2

    iget-object v5, p0, LJ/j$q;->e:LJ/j;

    new-instance p1, LJ/j$q$a;

    const/4 v9, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, LJ/j$q$a;-><init>(Lw/r;LJ/j;JLy/m;Ldh/e;)V

    iput v2, p0, LJ/j$q;->a:I

    invoke-static {p1, p0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/r;JLdh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LJ/j$q;

    iget-object v1, p0, LJ/j$q;->d:Ly/m;

    iget-object v2, p0, LJ/j$q;->e:LJ/j;

    invoke-direct {v0, v1, v2, p4}, LJ/j$q;-><init>(Ly/m;LJ/j;Ldh/e;)V

    iput-object p1, v0, LJ/j$q;->b:Ljava/lang/Object;

    iput-wide p2, v0, LJ/j$q;->c:J

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, LJ/j$q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, v0, v1, p3}, LJ/j$q;->n(Lw/r;JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
