.class public abstract Lq8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lwc/a;ZZ)Ljava/util/List;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lwc/a;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lq8/d$a;

    invoke-direct {p2, p1}, Lq8/d$a;-><init>(Z)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lwc/a;->m()Ljava/util/Set;

    move-result-object p0

    sget-object p2, LU7/b;->BLE:LU7/b;

    invoke-interface {p0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Lq8/d$b;

    invoke-direct {p0, p1}, Lq8/d$b;-><init>(Z)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public static synthetic b(Lwc/a;ZZILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-static {p0, p1, p2}, Lq8/f;->a(Lwc/a;ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lwc/a;Z)Ljava/util/List;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lwc/a;->l()Lwc/a$a;

    move-result-object v1

    sget-object v2, Lwc/a$a;->BOOTING:Lwc/a$a;

    if-ne v1, v2, :cond_0

    new-instance v1, Lq8/e$a;

    invoke-direct {v1, p1}, Lq8/e$a;-><init>(Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lwc/a;->l()Lwc/a$a;

    move-result-object p0

    sget-object v1, Lwc/a$a;->FACTORY:Lwc/a$a;

    if-ne p0, v1, :cond_1

    new-instance p0, Lq8/e$b;

    invoke-direct {p0, p1}, Lq8/e$b;-><init>(Z)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method
