.class final Lyd/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->l(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V
    .locals 0

    iput-object p1, p0, Lyd/b$c;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ll9/a;
    .locals 10

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LDc/j;

    invoke-virtual {v2}, LDc/j;->C()LIc/a$a;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, LDc/j;

    new-instance p1, Ll9/a;

    iget-object v2, p0, Lyd/b$c;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/b;->u()Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->b()Linet/ipaddr/g;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v4

    const-string v2, "toNormalizedString(...)"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LDc/j;->getName()Ljava/lang/String;

    move-result-object v2

    move-object v5, v2

    goto :goto_1

    :cond_2
    move-object v5, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, LDc/j;->b()Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    goto :goto_2

    :cond_3
    move-object v8, v1

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LDc/j;->L()LTc/a$a;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LTc/a$a;->j()Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto :goto_3

    :cond_4
    move-object v6, v1

    :goto_3
    if-eqz v0, :cond_5

    invoke-virtual {v0}, LDc/j;->N()LS8/g;

    move-result-object v2

    move-object v9, v2

    goto :goto_4

    :cond_5
    move-object v9, v1

    :goto_4
    if-eqz v0, :cond_6

    invoke-virtual {v0}, LDc/j;->f()Lxa/a$d;

    move-result-object v1

    :cond_6
    move-object v7, v1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;LS8/g;)V

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lyd/b$c;->a(Ljava/util/Map;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
