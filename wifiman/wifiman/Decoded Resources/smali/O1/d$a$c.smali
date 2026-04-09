.class final LO1/d$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/d$a;->c(Ljava/util/List;LO1/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field synthetic e:Ljava/lang/Object;

.field final synthetic f:Ljava/util/List;

.field final synthetic g:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/List;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LO1/d$a$c;->f:Ljava/util/List;

    iput-object p2, p0, LO1/d$a$c;->g:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LO1/d$a$c;

    iget-object v1, p0, LO1/d$a$c;->f:Ljava/util/List;

    iget-object v2, p0, LO1/d$a$c;->g:Ljava/util/List;

    invoke-direct {v0, v1, v2, p2}, LO1/d$a$c;-><init>(Ljava/util/List;Ljava/util/List;Ldh/e;)V

    iput-object p1, v0, LO1/d$a$c;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LO1/d$a$c;->n(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LO1/d$a$c;->d:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    const/4 v3, 0x2

    if-eq v0, v1, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, p0, LO1/d$a$c;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    iget-object v3, p0, LO1/d$a$c;->e:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, LO1/d$a$c;->c:Ljava/lang/Object;

    iget-object v4, p0, LO1/d$a$c;->b:Ljava/lang/Object;

    invoke-static {v4}, Lf/d;->a(Ljava/lang/Object;)V

    iget-object v4, p0, LO1/d$a$c;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p0, LO1/d$a$c;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    move-object p1, v0

    move-object v0, v4

    move-object v3, v5

    goto :goto_0

    :cond_2
    new-instance p1, LO1/d$a$c$a;

    invoke-direct {p1, v2, v2}, LO1/d$a$c$a;-><init>(LO1/c;Ldh/e;)V

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v5, p0, LO1/d$a$c;->e:Ljava/lang/Object;

    iput-object v4, p0, LO1/d$a$c;->a:Ljava/lang/Object;

    iput-object v2, p0, LO1/d$a$c;->b:Ljava/lang/Object;

    iput-object v2, p0, LO1/d$a$c;->c:Ljava/lang/Object;

    iput v3, p0, LO1/d$a$c;->d:I

    throw v2

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LO1/d$a$c;->e:Ljava/lang/Object;

    iget-object v0, p0, LO1/d$a$c;->f:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v3, p0, LO1/d$a$c;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    return-object p1

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lf/d;->a(Ljava/lang/Object;)V

    iput-object v3, p0, LO1/d$a$c;->e:Ljava/lang/Object;

    iput-object v0, p0, LO1/d$a$c;->a:Ljava/lang/Object;

    iput-object v2, p0, LO1/d$a$c;->b:Ljava/lang/Object;

    iput-object p1, p0, LO1/d$a$c;->c:Ljava/lang/Object;

    iput v1, p0, LO1/d$a$c;->d:I

    throw v2
.end method

.method public final n(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LO1/d$a$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LO1/d$a$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LO1/d$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
