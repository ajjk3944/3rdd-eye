.class final Lw/f$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lw/G;

.field final synthetic d:Lw/f;

.field final synthetic e:Lw/d;

.field final synthetic f:LIi/y0;


# direct methods
.method constructor <init>(Lw/G;Lw/f;Lw/d;LIi/y0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/f$c$a;->c:Lw/G;

    iput-object p2, p0, Lw/f$c$a;->d:Lw/f;

    iput-object p3, p0, Lw/f$c$a;->e:Lw/d;

    iput-object p4, p0, Lw/f$c$a;->f:LIi/y0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lw/f$c$a;

    iget-object v1, p0, Lw/f$c$a;->c:Lw/G;

    iget-object v2, p0, Lw/f$c$a;->d:Lw/f;

    iget-object v3, p0, Lw/f$c$a;->e:Lw/d;

    iget-object v4, p0, Lw/f$c$a;->f:LIi/y0;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lw/f$c$a;-><init>(Lw/G;Lw/f;Lw/d;LIi/y0;Ldh/e;)V

    iput-object p1, v6, Lw/f$c$a;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/p;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/f$c$a;->n(Lw/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/f$c$a;->a:I

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

    iget-object p1, p0, Lw/f$c$a;->b:Ljava/lang/Object;

    check-cast p1, Lw/p;

    iget-object v1, p0, Lw/f$c$a;->c:Lw/G;

    iget-object v3, p0, Lw/f$c$a;->d:Lw/f;

    iget-object v4, p0, Lw/f$c$a;->e:Lw/d;

    invoke-static {v3, v4}, Lw/f;->D2(Lw/f;Lw/d;)F

    move-result v3

    invoke-virtual {v1, v3}, Lw/G;->j(F)V

    iget-object v1, p0, Lw/f$c$a;->c:Lw/G;

    new-instance v3, Lw/f$c$a$a;

    iget-object v4, p0, Lw/f$c$a;->d:Lw/f;

    iget-object v5, p0, Lw/f$c$a;->f:LIi/y0;

    invoke-direct {v3, v4, v1, v5, p1}, Lw/f$c$a$a;-><init>(Lw/f;Lw/G;LIi/y0;Lw/p;)V

    new-instance p1, Lw/f$c$a$b;

    iget-object v4, p0, Lw/f$c$a;->d:Lw/f;

    iget-object v5, p0, Lw/f$c$a;->c:Lw/G;

    iget-object v6, p0, Lw/f$c$a;->e:Lw/d;

    invoke-direct {p1, v4, v5, v6}, Lw/f$c$a$b;-><init>(Lw/f;Lw/G;Lw/d;)V

    iput v2, p0, Lw/f$c$a;->a:I

    invoke-virtual {v1, v3, p1, p0}, Lw/G;->h(Lmh/l;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/f$c$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/f$c$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/f$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
