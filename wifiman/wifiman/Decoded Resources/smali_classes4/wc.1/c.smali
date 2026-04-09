.class public final Lwc/c;
.super Lge/a;
.source "SourceFile"

# interfaces
.implements Lwc/b$a;


# instance fields
.field private final d:Lgg/i;


# direct methods
.method public constructor <init>(Lwc/h;Lfe/u;)V
    .locals 1

    const-string v0, "scanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lge/a;-><init>(Lfe/u;)V

    sget-object p2, Lwc/f;->BLE:Lwc/f;

    invoke-interface {p1, p2}, Lwc/h;->a(Lwc/f;)Lgg/i;

    move-result-object p1

    iput-object p1, p0, Lwc/c;->d:Lgg/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic d(JLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lwc/b;

    check-cast p4, Lwc/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lwc/c;->h(JLwc/b;Lwc/a;)Lwc/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh9/a;

    invoke-virtual {p0, p1}, Lwc/c;->i(Lh9/a;)Lwc/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwc/a;

    invoke-virtual {p0, p1}, Lwc/c;->j(Lwc/a;)Lh9/a;

    move-result-object p1

    return-object p1
.end method

.method protected g()Lgg/i;
    .locals 1

    iget-object v0, p0, Lwc/c;->d:Lgg/i;

    return-object v0
.end method

.method protected h(JLwc/b;Lwc/a;)Lwc/b;
    .locals 4

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lwc/b;->a()LU7/a;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_3

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Lwc/a;->k()LU7/a;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    new-instance v0, Lwc/b;

    invoke-virtual {p3}, Lwc/b;->c()Lh9/a;

    move-result-object v1

    invoke-virtual {p3}, Lwc/b;->a()LU7/a;

    move-result-object v2

    invoke-virtual {p4}, Lwc/a;->k()LU7/a;

    move-result-object v3

    invoke-virtual {v2, v3}, LW7/f;->a(LW7/f;)I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {p3}, Lwc/b;->a()LU7/a;

    move-result-object v2

    goto :goto_2

    :cond_2
    invoke-virtual {p4}, Lwc/a;->k()LU7/a;

    move-result-object v2

    :goto_2
    invoke-virtual {p3}, Lwc/b;->b()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p4}, Lwc/a;->k()LU7/a;

    move-result-object p4

    invoke-virtual {p0, p3, p4, p1, p2}, Lge/a;->c(Ljava/util/List;Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lwc/b;-><init>(Lh9/a;LU7/a;Ljava/util/List;)V

    goto :goto_4

    :cond_3
    if-eqz p3, :cond_4

    new-instance p4, Lwc/b;

    invoke-virtual {p3}, Lwc/b;->c()Lh9/a;

    move-result-object v1

    invoke-virtual {p3}, Lwc/b;->a()LU7/a;

    move-result-object v2

    invoke-virtual {p3}, Lwc/b;->b()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p3, v0, p1, p2}, Lge/a;->c(Ljava/util/List;Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p4, v1, v2, p1}, Lwc/b;-><init>(Lh9/a;LU7/a;Ljava/util/List;)V

    move-object v0, p4

    goto :goto_4

    :cond_4
    if-eqz p4, :cond_6

    new-instance v0, Lwc/b;

    invoke-virtual {p4}, Lwc/a;->h()Lh9/a;

    move-result-object p3

    invoke-virtual {p4}, Lwc/a;->k()LU7/a;

    move-result-object v1

    if-nez v1, :cond_5

    sget-object v1, LU7/a;->e:LU7/a$a;

    invoke-virtual {v1}, LU7/a$a;->b()LU7/a;

    move-result-object v1

    goto :goto_3

    :cond_5
    invoke-virtual {p4}, Lwc/a;->k()LU7/a;

    move-result-object v1

    :goto_3
    new-instance v2, LWc/c;

    invoke-virtual {p4}, Lwc/a;->k()LU7/a;

    move-result-object p4

    invoke-direct {v2, p1, p2, p4}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-static {v2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p3, v1, p1}, Lwc/b;-><init>(Lh9/a;LU7/a;Ljava/util/List;)V

    :cond_6
    :goto_4
    return-object v0
.end method

.method protected i(Lh9/a;)Lwc/b;
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwc/b;

    const/4 v1, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lwc/b;-><init>(Lh9/a;LU7/a;Ljava/util/List;)V

    return-object v0
.end method

.method protected j(Lwc/a;)Lh9/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwc/a;->d()Lh9/a;

    move-result-object p1

    return-object p1
.end method
