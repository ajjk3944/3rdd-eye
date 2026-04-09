.class final Ljd/c$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/c;-><init>(LZc/f;LZc/a;Lje/u;LDc/e;Lbe/e;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljd/c;


# direct methods
.method constructor <init>(Ljd/c;)V
    .locals 0

    iput-object p1, p0, Ljd/c$p;->a:Ljd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    check-cast p2, La8/a;

    check-cast p3, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Ljd/c$p;->b(Ljava/util/Map;La8/a;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Map;La8/a;Ljava/util/List;)Ljava/util/List;
    .locals 5

    const-string v0, "networkDiscoveryResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topologyItemsInBetween"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Iterable;

    iget-object v0, p0, Ljd/c$p;->a:Ljd/c;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p3, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lce/b$a;

    invoke-virtual {v2}, Lce/b$a;->f()Linet/ipaddr/g;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LDc/j;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LDc/j;->u()La8/b;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p2, v4}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LCc/a$b;

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v3}, LDc/n;->a(LDc/j;)LCc/a;

    move-result-object v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    invoke-static {v0, v2, v4}, Ljd/c;->e(Ljd/c;Lce/b$a;LCc/a;)Ljd/a$b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method
