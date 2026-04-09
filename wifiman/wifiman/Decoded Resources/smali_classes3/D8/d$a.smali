.class final LD8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/d;


# direct methods
.method constructor <init>(LD8/d;)V
    .locals 0

    iput-object p1, p0, LD8/d$a;->a:LD8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ll9/a;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p1

    const-string/jumbo v1, "hosts"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "<destruct>"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd/a$b;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v2, p0

    iget-object v3, v2, LD8/d$a;->a:LD8/d;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/network/hosts/NetworkHost;

    instance-of v6, v5, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    check-cast v5, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljd/a$b;->b()LCc/a;

    move-result-object v6

    if-eqz v6, :cond_1

    sget-object v8, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {v3}, LD8/d;->t0(LD8/d;)Ls9/b;

    move-result-object v9

    invoke-static {v6, v8, v9}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v6

    if-nez v6, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object v12, v6

    goto :goto_3

    :cond_1
    :goto_2
    invoke-static {v3}, LD8/d;->t0(LD8/d;)Ls9/b;

    move-result-object v6

    goto :goto_1

    :goto_3
    new-instance v13, Ls9/d$b;

    const v6, 0x7f1101fb

    invoke-direct {v13, v6}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;->b()Ldd/i;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ldd/i;->g()Linet/ipaddr/g;

    move-result-object v6

    if-eqz v6, :cond_2

    new-instance v8, Ls9/d$c;

    invoke-static {v6}, LL8/f;->a(Linet/ipaddr/g;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v8, v6}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v14, v8

    goto :goto_4

    :cond_2
    move-object v14, v7

    :goto_4
    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$b;->b()Ldd/i;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ldd/i;->d()Lb8/b;

    move-result-object v7

    :cond_3
    move-object/from16 v16, v7

    new-instance v5, Lbf/e;

    const/4 v15, 0x1

    const/16 v17, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v17}, Lbf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;ZLb8/b;Z)V

    goto/16 :goto_8

    :cond_4
    instance-of v6, v5, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;

    if-eqz v6, :cond_8

    check-cast v5, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->b()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    sget-object v6, LL8/e;->a:LL8/e;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, LL8/e;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v13

    if-eqz v13, :cond_5

    new-instance v6, Ls9/c$b;

    invoke-static {v3}, LD8/d;->t0(LD8/d;)Ls9/b;

    move-result-object v14

    const/16 v17, 0xc

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v12, v6

    invoke-direct/range {v12 .. v18}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    invoke-static {v3}, LD8/d;->t0(LD8/d;)Ls9/b;

    move-result-object v6

    move-object v12, v6

    :goto_5
    new-instance v13, Ls9/d$c;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v13, v6}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c()Ldd/i;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Ldd/i;->g()Linet/ipaddr/g;

    move-result-object v6

    if-eqz v6, :cond_6

    new-instance v7, Ls9/d$c;

    invoke-virtual {v6}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v6

    const-string/jumbo v8, "toNormalizedString(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v6}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_6
    move-object v14, v7

    invoke-static {v5}, LD8/b;->a(Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;)Lb8/b;

    move-result-object v16

    invoke-virtual {v5}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$a;->c()Ldd/i;

    move-result-object v5

    if-eqz v5, :cond_7

    const/4 v5, 0x1

    :goto_6
    move v15, v5

    goto :goto_7

    :cond_7
    const/4 v5, 0x0

    goto :goto_6

    :goto_7
    new-instance v5, Lbf/e;

    const/16 v17, 0x1

    move-object v10, v5

    invoke-direct/range {v10 .. v17}, Lbf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;ZLb8/b;Z)V

    :goto_8
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    return-object v4
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LD8/d$a;->a(Ljava/util/List;Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
