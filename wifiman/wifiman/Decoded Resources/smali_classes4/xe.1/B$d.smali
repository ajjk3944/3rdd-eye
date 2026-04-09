.class final Lxe/B$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/B;->x(Lxe/h;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Z

.field final synthetic c:LIi/N;

.field final synthetic d:Lxe/h;


# direct methods
.method constructor <init>(ZLIi/N;Lxe/h;Ldh/e;)V
    .locals 0

    iput-boolean p1, p0, Lxe/B$d;->b:Z

    iput-object p2, p0, Lxe/B$d;->c:LIi/N;

    iput-object p3, p0, Lxe/B$d;->d:Lxe/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lxe/B$d;

    iget-boolean v0, p0, Lxe/B$d;->b:Z

    iget-object v1, p0, Lxe/B$d;->c:LIi/N;

    iget-object v2, p0, Lxe/B$d;->d:Lxe/h;

    invoke-direct {p1, v0, v1, v2, p2}, Lxe/B$d;-><init>(ZLIi/N;Lxe/h;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lxe/B$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lxe/B$d;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lxe/B$d;->b:Z

    if-nez p1, :cond_0

    iget-object v0, p0, Lxe/B$d;->c:LIi/N;

    new-instance v3, Lxe/B$d$a;

    iget-object p1, p0, Lxe/B$d;->d:Lxe/h;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lxe/B$d$a;-><init>(Lxe/h;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxe/B$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lxe/B$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lxe/B$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
