.class public final Lne/b;
.super Lge/a;
.source "SourceFile"

# interfaces
.implements Lne/a$a;


# instance fields
.field private final d:Lgg/i;


# direct methods
.method public constructor <init>(Lle/g;Lfe/u;)V
    .locals 1

    const-string v0, "scannerService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lge/a;-><init>(Lfe/u;)V

    invoke-interface {p1}, Lle/g;->a()Lgg/i;

    move-result-object p1

    iput-object p1, p0, Lne/b;->d:Lgg/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic d(JLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lne/a;

    check-cast p4, Lle/i;

    invoke-virtual {p0, p1, p2, p3, p4}, Lne/b;->h(JLne/a;Lle/i;)Lne/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS8/k;

    invoke-virtual {p1}, LS8/k;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lne/b;->i(Ljava/lang/String;)Lne/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lle/i;

    invoke-virtual {p0, p1}, Lne/b;->j(Lle/i;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object p1

    return-object p1
.end method

.method protected g()Lgg/i;
    .locals 1

    iget-object v0, p0, Lne/b;->d:Lgg/i;

    return-object v0
.end method

.method protected h(JLne/a;Lle/i;)Lne/a;
    .locals 5

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    new-instance v1, Lne/a;

    invoke-virtual {p3}, Lne/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lne/a;->a()LS8/l;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p4}, Lle/i;->q()LS8/l;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p3}, Lne/a;->a()LS8/l;

    move-result-object v3

    invoke-virtual {p4}, Lle/i;->q()LS8/l;

    move-result-object v4

    invoke-virtual {v3, v4}, LW7/f;->a(LW7/f;)I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {p3}, Lne/a;->a()LS8/l;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lle/i;->q()LS8/l;

    move-result-object v3

    :goto_0
    invoke-virtual {p3}, Lne/a;->b()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p4}, Lle/i;->q()LS8/l;

    move-result-object p4

    invoke-virtual {p0, p3, p4, p1, p2}, Lge/a;->c(Ljava/util/List;Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1, v0}, Lne/a;-><init>(Ljava/lang/String;LS8/l;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    goto :goto_1

    :cond_1
    if-eqz p3, :cond_2

    new-instance p4, Lne/a;

    invoke-virtual {p3}, Lne/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lne/a;->a()LS8/l;

    move-result-object v2

    invoke-virtual {p3}, Lne/a;->b()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p3, v0, p1, p2}, Lge/a;->c(Ljava/util/List;Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p4, v1, v2, p1, v0}, Lne/a;-><init>(Ljava/lang/String;LS8/l;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, p4

    goto :goto_1

    :cond_2
    if-eqz p4, :cond_3

    new-instance p3, Lne/a;

    invoke-virtual {p4}, Lle/i;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4}, Lle/i;->q()LS8/l;

    move-result-object v2

    new-instance v3, LWc/c;

    invoke-virtual {p4}, Lle/i;->q()LS8/l;

    move-result-object p4

    invoke-direct {v3, p1, p2, p4}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-static {v3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, v1, v2, p1, v0}, Lne/a;-><init>(Ljava/lang/String;LS8/l;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, p3

    :cond_3
    :goto_1
    return-object v0
.end method

.method protected i(Ljava/lang/String;)Lne/a;
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lne/a;

    const/4 v1, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2, v1}, Lne/a;-><init>(Ljava/lang/String;LS8/l;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected j(Lle/i;)Ljava/lang/String;
    .locals 1

    const-string v0, "$this$itemIdentity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lle/i;->k()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
