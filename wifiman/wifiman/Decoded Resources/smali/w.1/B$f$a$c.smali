.class final Lw/B$f$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/B$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lmh/q;

.field final synthetic c:Lw/s;

.field final synthetic d:Ly0/y;


# direct methods
.method constructor <init>(Lmh/q;Lw/s;Ly0/y;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/B$f$a$c;->b:Lmh/q;

    iput-object p2, p0, Lw/B$f$a$c;->c:Lw/s;

    iput-object p3, p0, Lw/B$f$a$c;->d:Ly0/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lw/B$f$a$c;

    iget-object v0, p0, Lw/B$f$a$c;->b:Lmh/q;

    iget-object v1, p0, Lw/B$f$a$c;->c:Lw/s;

    iget-object v2, p0, Lw/B$f$a$c;->d:Ly0/y;

    invoke-direct {p1, v0, v1, v2, p2}, Lw/B$f$a$c;-><init>(Lmh/q;Lw/s;Ly0/y;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/B$f$a$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/B$f$a$c;->a:I

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

    iget-object p1, p0, Lw/B$f$a$c;->b:Lmh/q;

    iget-object v1, p0, Lw/B$f$a$c;->c:Lw/s;

    iget-object v3, p0, Lw/B$f$a$c;->d:Ly0/y;

    invoke-virtual {v3}, Ly0/y;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->d(J)Ll0/g;

    move-result-object v3

    iput v2, p0, Lw/B$f$a$c;->a:I

    invoke-interface {p1, v1, v3, p0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lw/B$f$a$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/B$f$a$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/B$f$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
