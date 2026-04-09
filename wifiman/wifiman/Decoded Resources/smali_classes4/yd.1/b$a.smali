.class final Lyd/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->j(LCd/n;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCd/n;


# direct methods
.method constructor <init>(LCd/n;)V
    .locals 0

    iput-object p1, p0, Lyd/b$a;->a:LCd/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lcom/ui/wifiman/model/speedtest/result/b$b$c;
    .locals 10

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lyd/b$a;->a:LCd/n;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LDc/j;

    invoke-virtual {v3}, LDc/j;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, LCd/n;->o()LCd/j$c;

    move-result-object v4

    invoke-virtual {v4}, LCd/j$c;->a()Linet/ipaddr/g;

    move-result-object v4

    invoke-virtual {v4}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LDc/j;

    iget-object p1, p0, Lyd/b$a;->a:LCd/n;

    invoke-virtual {p1}, LCd/n;->o()LCd/j$c;

    move-result-object p1

    invoke-virtual {p1}, LCd/j$c;->a()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v4

    const-string p1, "toString(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LDc/j;->getName()Ljava/lang/String;

    move-result-object p1

    move-object v5, p1

    goto :goto_1

    :cond_2
    move-object v5, v2

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, LDc/j;->b()Ljava/lang/String;

    move-result-object p1

    move-object v8, p1

    goto :goto_2

    :cond_3
    move-object v8, v2

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, LDc/j;->L()LTc/a$a;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LTc/a$a;->j()Ljava/lang/String;

    move-result-object p1

    move-object v6, p1

    goto :goto_3

    :cond_4
    move-object v6, v2

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, LDc/j;->N()LS8/g;

    move-result-object p1

    move-object v9, p1

    goto :goto_4

    :cond_5
    move-object v9, v2

    :goto_4
    if-eqz v1, :cond_6

    invoke-virtual {v1}, LDc/j;->f()Lxa/a$d;

    move-result-object v2

    :cond_6
    move-object v7, v2

    new-instance p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;LS8/g;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lyd/b$a;->a(Ljava/util/Map;)Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    move-result-object p1

    return-object p1
.end method
