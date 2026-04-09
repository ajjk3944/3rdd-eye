.class final LT5/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT5/a;->b(Landroidx/compose/ui/e;Lmh/l;Lw/y;Lmh/p;Ly/m;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LT5/a$b;->c:Lmh/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LT5/a$b;

    iget-object v1, p0, LT5/a$b;->c:Lmh/l;

    invoke-direct {v0, v1, p2}, LT5/a$b;-><init>(Lmh/l;Ldh/e;)V

    iput-object p1, v0, LT5/a$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LT5/a$b;->n(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LT5/a$b;->a:I

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

    iget-object p1, p0, LT5/a$b;->b:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ly0/G;

    new-instance v5, LT5/a$b$a;

    iget-object p1, p0, LT5/a$b;->c:Lmh/l;

    invoke-direct {v5, p1}, LT5/a$b$a;-><init>(Lmh/l;)V

    new-instance v6, LT5/a$b$b;

    iget-object p1, p0, LT5/a$b;->c:Lmh/l;

    invoke-direct {v6, p1}, LT5/a$b$b;-><init>(Lmh/l;)V

    new-instance v7, LT5/a$b$c;

    iget-object p1, p0, LT5/a$b;->c:Lmh/l;

    invoke-direct {v7, p1}, LT5/a$b$c;-><init>(Lmh/l;)V

    iput v2, p0, LT5/a$b;->a:I

    const/4 v4, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lw/j;->g(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LT5/a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LT5/a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LT5/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
