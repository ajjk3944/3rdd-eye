.class public abstract Lp8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LCc/a;)LMe/c;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LCc/a;->p()Lwc/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lp8/l;->d(Lwc/a;)Ljava/lang/String;

    move-result-object v3

    sget-object v2, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    const/4 v4, 0x2

    invoke-static {p0, v2, v1, v4, v1}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object v5

    invoke-interface {p0}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-interface {p0}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    new-instance v6, Ls9/d$c;

    invoke-direct {v6, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    new-instance v2, Ls9/d$b;

    const v6, 0x7f1100af

    invoke-direct {v2, v6}, Ls9/d$b;-><init>(I)V

    move-object v6, v2

    :goto_1
    invoke-interface {p0}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    sget-object p0, LMe/c$a;->IDENTIFIED:LMe/c$a;

    :goto_2
    move-object v8, p0

    goto :goto_3

    :cond_3
    sget-object p0, LMe/c$a;->UNIDENTIFIED:LMe/c$a;

    goto :goto_2

    :goto_3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 p0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, p0}, Lq8/f;->a(Lwc/a;ZZ)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v9, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0, v2}, Lq8/f;->c(Lwc/a;Z)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v9, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p0, Ls9/d$c;

    invoke-virtual {v0}, Lwc/a;->h()Lh9/a;

    move-result-object v7

    const-string v10, ":"

    invoke-virtual {v7, v10}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string/jumbo v10, "toLowerCase(...)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v7}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lwc/a;->e()Z

    move-result v7

    if-eqz v7, :cond_4

    new-instance v0, Ls9/d$a;

    const-string/jumbo v1, "connected"

    sget-object v2, Lp8/l$a;->a:Lp8/l$a;

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    :goto_4
    move-object v7, v0

    goto :goto_5

    :cond_4
    invoke-virtual {v0}, Lwc/a;->k()LU7/a;

    move-result-object v0

    invoke-static {v0, v2, v1, v4, v1}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v0

    goto :goto_4

    :goto_5
    new-instance v0, LMe/c;

    move-object v2, v0

    move-object v4, v5

    move-object v5, v6

    move-object v6, p0

    invoke-direct/range {v2 .. v9}, LMe/c;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Ls9/d;LMe/c$a;Ljava/util/List;)V

    return-object v0

    :cond_5
    return-object v1
.end method

.method public static final b(LCc/a;)LMe/g;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lp8/l;->c(LDc/j;)Ljava/lang/String;

    move-result-object v3

    sget-object v2, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    const/4 v4, 0x2

    invoke-static {p0, v2, v1, v4, v1}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object v4

    invoke-interface {p0}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-interface {p0}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    new-instance v2, Ls9/d$c;

    invoke-direct {v2, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v5, v2

    goto :goto_1

    :cond_2
    new-instance v1, Ls9/d$b;

    const v2, 0x7f1100af

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    move-object v5, v1

    :goto_1
    invoke-interface {p0}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    sget-object p0, LMe/g$a;->IDENTIFIED:LMe/g$a;

    :goto_2
    move-object v7, p0

    goto :goto_3

    :cond_3
    sget-object p0, LMe/g$a;->UNIDENTIFIED:LMe/g$a;

    goto :goto_2

    :goto_3
    const/4 p0, 0x1

    invoke-static {v0, p0, p0}, Lr8/e;->a(LDc/j;ZZ)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0}, LDc/j;->w()Linet/ipaddr/g;

    move-result-object p0

    invoke-static {p0}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v6, v0

    goto :goto_4

    :cond_4
    new-instance p0, Ls9/d$c;

    const-string v0, ""

    invoke-direct {p0, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v6, p0

    :goto_4
    new-instance v1, LMe/g;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LMe/g;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;LMe/g$a;Ljava/util/List;)V

    :cond_5
    return-object v1
.end method

.method public static final c(LDc/j;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDc/j;->l()Lh9/a;

    move-result-object v0

    invoke-virtual {p0}, LDc/j;->w()Linet/ipaddr/g;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "m"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ":ip"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lwc/a;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwc/a;->d()Lh9/a;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "bt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
