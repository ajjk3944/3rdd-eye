.class final LC/c$d$a$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/c$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:LC/C;


# direct methods
.method constructor <init>(LC/C;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LC/c$d$a$a;->f:LC/C;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LC/c$d$a$a;

    iget-object v1, p0, LC/c$d$a$a;->f:LC/C;

    invoke-direct {v0, v1, p2}, LC/c$d$a$a;-><init>(LC/C;Ldh/e;)V

    iput-object p1, v0, LC/c$d$a$a;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LC/c$d$a$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LC/c$d$a$a;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LC/c$d$a$a;->c:Ljava/lang/Object;

    check-cast v1, Ly0/y;

    iget-object v4, p0, LC/c$d$a$a;->b:Ljava/lang/Object;

    check-cast v4, Ly0/y;

    iget-object v5, p0, LC/c$d$a$a;->e:Ljava/lang/Object;

    check-cast v5, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LC/c$d$a$a;->e:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LC/c$d$a$a;->e:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly0/b;

    sget-object p1, Ly0/p;->Initial:Ly0/p;

    iput-object v1, p0, LC/c$d$a$a;->e:Ljava/lang/Object;

    iput v4, p0, LC/c$d$a$a;->d:I

    invoke-static {v1, v3, p1, p0}, Lw/B;->e(Ly0/b;ZLy0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ly0/y;

    iget-object v4, p0, LC/c$d$a$a;->f:LC/C;

    sget-object v5, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v5}, Ll0/g$a;->c()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, LC/C;->h0(J)V

    const/4 v4, 0x0

    move-object v5, v1

    move-object v1, v4

    move-object v4, p1

    :goto_1
    if-nez v1, :cond_7

    sget-object p1, Ly0/p;->Initial:Ly0/p;

    iput-object v5, p0, LC/c$d$a$a;->e:Ljava/lang/Object;

    iput-object v4, p0, LC/c$d$a$a;->b:Ljava/lang/Object;

    iput-object v1, p0, LC/c$d$a$a;->c:Ljava/lang/Object;

    iput v2, p0, LC/c$d$a$a;->d:I

    invoke-interface {v5, p1, p0}, Ly0/b;->A1(Ly0/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Ly0/n;

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    move v8, v3

    :goto_3
    if-ge v8, v7, :cond_6

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly0/y;

    invoke-static {v9}, Ly0/o;->c(Ly0/y;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ly0/y;

    goto :goto_1

    :cond_7
    iget-object p1, p0, LC/c$d$a$a;->f:LC/C;

    invoke-virtual {v1}, Ly0/y;->h()J

    move-result-wide v0

    invoke-virtual {v4}, Ly0/y;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/g;->q(JJ)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LC/C;->h0(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LC/c$d$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LC/c$d$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LC/c$d$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
