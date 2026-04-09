.class public abstract Lr8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LDc/j;ZZ)Ljava/util/List;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LDc/j;->F()LMc/a$a;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lr8/d$d;

    invoke-direct {v1, p1}, Lr8/d$d;-><init>(Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, LDc/j;->C()LIc/a$a;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v1, Lr8/d$c;

    invoke-direct {v1, p1}, Lr8/d$c;-><init>(Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, LDc/j;->v()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lr8/d$b;

    invoke-direct {v1, p1}, Lr8/d$b;-><init>(Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, LDc/j;->z()LFc/a$b;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v1, Lr8/d$a;

    invoke-direct {v1, p1}, Lr8/d$a;-><init>(Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, LDc/j;->f()Lxa/a$d;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, LCc/m;->a(Lxa/a$d;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    if-eqz p2, :cond_6

    invoke-virtual {p0}, LDc/j;->K()LRc/a$a;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance p2, Lr8/d$f;

    invoke-direct {p2, p1}, Lr8/d$f;-><init>(Z)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {p0}, LDc/j;->J()LQc/a$b;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance p0, Lr8/d$e;

    invoke-direct {p0, p1}, Lr8/d$e;-><init>(Z)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_0
    return-object v0
.end method
