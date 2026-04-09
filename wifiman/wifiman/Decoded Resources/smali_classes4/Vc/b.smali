.class public abstract LVc/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v0, p0}, Lokhttp3/HttpUrl$Companion;->f(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final b(LVc/g;LUc/c;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, LUc/c;->getKeys()[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {p0}, LVc/g;->b()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final c(LVc/h;LUc/d;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, LUc/d;->getKeys()[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {p0}, LVc/h;->a()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final d(LVc/g;Lcom/ui/wifiman/model/vendor/d$b;Linet/ipaddr/g;J)LVc/a;
    .locals 21

    move-object/from16 v15, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v1, "<this>"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "vendorManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "inetAddress"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LUc/c;->TYPE:LUc/c;

    invoke-static {v15, v1}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LVc/b;->f(Ljava/lang/String;)LUc/b;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    sget-object v4, LUc/c;->NAME_FRIENDLY:LUc/c;

    invoke-static {v15, v4}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, LUc/c;->MODEL_NAME:LUc/c;

    invoke-static {v15, v5}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, LUc/c;->MODEL_DESCRIPTION:LUc/c;

    invoke-static {v15, v6}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, LUc/c;->MODEL_URL:LUc/c;

    invoke-static {v15, v7}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-static {v7}, LVc/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_1
    move-object v7, v3

    :goto_1
    sget-object v8, LUc/c;->VENDOR_NAME:LUc/c;

    invoke-static {v15, v8}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-interface {v0, v8}, Lcom/ui/wifiman/model/vendor/d$b;->b(Ljava/lang/String;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v8

    goto :goto_2

    :cond_2
    move-object v8, v3

    :goto_2
    sget-object v9, LUc/c;->VENDOR_URL:LUc/c;

    invoke-static {v15, v9}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-static {v9}, LVc/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_3
    move-object v9, v3

    sget-object v3, LUc/c;->FW_VERSION:LUc/c;

    invoke-static {v15, v3}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v10

    sget-object v3, LUc/c;->FW_GEN:LUc/c;

    invoke-static {v15, v3}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v11

    sget-object v3, LUc/c;->HW_VERSION:LUc/c;

    invoke-static {v15, v3}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v12

    sget-object v3, LUc/c;->SERIAL_NUMBER:LUc/c;

    invoke-static {v15, v3}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v13

    sget-object v3, LUc/c;->UDN:LUc/c;

    invoke-static {v15, v3}, LVc/b;->b(LVc/g;LUc/c;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, LVc/g;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v16, v14

    const/16 v14, 0xa

    move-object/from16 v17, v13

    invoke-static {v3, v14}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v15, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LVc/g;

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    move-wide/from16 v11, p3

    invoke-static {v13, v0, v2, v11, v12}, LVc/b;->d(LVc/g;Lcom/ui/wifiman/model/vendor/d$b;Linet/ipaddr/g;J)LVc/a;

    move-result-object v13

    invoke-interface {v15, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v11, v18

    move-object/from16 v12, v19

    goto :goto_3

    :cond_4
    move-object/from16 v18, v11

    move-object/from16 v19, v12

    move-wide/from16 v11, p3

    invoke-virtual/range {p0 .. p0}, LVc/g;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v0, v14}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LVc/h;

    invoke-static {v3}, LVc/b;->e(LVc/h;)LVc/c;

    move-result-object v3

    invoke-interface {v13, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    new-instance v20, LVc/a;

    move-object/from16 v0, v20

    move-object/from16 v2, p2

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object/from16 v10, v18

    move-object/from16 v11, v19

    move-object/from16 v12, v17

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    move-object v14, v15

    move-object/from16 v15, v17

    move-wide/from16 v16, p3

    move-object/from16 v18, p0

    invoke-direct/range {v0 .. v18}, LVc/a;-><init>(LUc/b;Linet/ipaddr/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLVc/g;)V

    return-object v20
.end method

.method public static final e(LVc/h;)LVc/c;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVc/c;

    sget-object v1, LUc/d;->TYPE:LUc/d;

    invoke-static {p0, v1}, LVc/b;->c(LVc/h;LUc/d;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LVc/b;->f(Ljava/lang/String;)LUc/b;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, LUc/d;->ID:LUc/d;

    invoke-static {p0, v2}, LVc/b;->c(LVc/h;LUc/d;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0}, LVc/c;-><init>(LUc/b;Ljava/lang/String;LVc/h;)V

    return-object v0
.end method

.method private static final f(Ljava/lang/String;)LUc/b;
    .locals 4

    new-instance v0, Lkotlin/text/p;

    const-string v1, "urn:([^:]+):([^:]+):([^:]+):(\\d+)$"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lkotlin/text/p;->l(Ljava/lang/CharSequence;)Lkotlin/text/l;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, LUc/b;

    invoke-interface {p0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p0}, Lkotlin/text/l;->b()Ljava/util/List;

    move-result-object p0

    const/4 v3, 0x4

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, LUc/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
