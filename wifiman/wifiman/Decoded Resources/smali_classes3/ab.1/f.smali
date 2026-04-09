.class public final Lab/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lab/a;

.field private final b:Lab/b;

.field private final c:Lab/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lab/a;

    invoke-direct {v0}, Lab/a;-><init>()V

    iput-object v0, p0, Lab/f;->a:Lab/a;

    new-instance v0, Lab/b;

    invoke-direct {v0}, Lab/b;-><init>()V

    iput-object v0, p0, Lab/f;->b:Lab/b;

    new-instance v0, Lab/c;

    invoke-direct {v0}, Lab/c;-><init>()V

    iput-object v0, p0, Lab/f;->c:Lab/c;

    return-void
.end method

.method public static synthetic a(Lab/f;Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;
    .locals 0

    invoke-static {p0, p1}, Lab/f;->j(Lab/f;Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lcom/ui/uidb/api/ApiProduct;)Ljava/util/Map;
    .locals 7

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Btle;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    const-string/jumbo v4, "fromString(...)"

    if-eqz v2, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Btle;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lva/b;->c(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v5, Lva/c;->FACTORY:Lva/c;

    new-instance v6, Lva/a;

    invoke-direct {v6, v2, v5, v1}, Lva/a;-><init>(Ljava/util/UUID;Lva/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    new-instance v0, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct$Btle;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Factory BTLE service is not in UUID format: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v1, v3, v1}, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Btle;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Btle;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lva/b;->c(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    sget-object v2, Lva/c;->CONFIGURED:Lva/c;

    new-instance v3, Lva/a;

    invoke-direct {v3, p1, v2, v1}, Lva/a;-><init>(Ljava/util/UUID;Lva/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catch_1
    new-instance v0, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct$Btle;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Configured BTLE service is not in UUID format: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v1, v3, v1}, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    const/16 p1, 0xa

    invoke-static {v0, p1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {p1}, LZg/U;->d(I)I

    move-result p1

    const/16 v1, 0x10

    invoke-static {p1, v1}, Lsh/m;->d(II)I

    move-result p1

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lva/a;

    invoke-virtual {v2}, Lva/a;->a()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2}, Lva/b;->a(Ljava/util/UUID;)Lva/b;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    return-object v1
.end method

.method private final c(Lcom/ui/uidb/api/ApiProduct;)LCa/a;
    .locals 14

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->b()Lcom/ui/uidb/api/ApiProductCompliance;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_17

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->j()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->l()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->n()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->q()Ljava/util/List;

    move-result-object v3

    new-instance v6, LCa/a$g;

    invoke-direct {v6, v1, v2, v3}, LCa/a$g;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V

    invoke-virtual {v6}, LCa/a$g;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v6}, LCa/a$g;->c()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v6}, LCa/a$g;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    move-object v6, v0

    :cond_4
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    move-object v1, v0

    :goto_3
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, v0

    :goto_4
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->o()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->b()Ljava/util/List;

    move-result-object v7

    new-instance v8, LCa/a$c;

    invoke-direct {v8, v1, v2, v3, v7}, LCa/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V

    invoke-virtual {v8}, LCa/a$c;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-virtual {v8}, LCa/a$c;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-virtual {v8}, LCa/a$c;->d()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-virtual {v8}, LCa/a$c;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    move-object v7, v0

    goto :goto_5

    :cond_8
    move-object v7, v8

    :goto_5
    new-instance v1, LCa/a$a;

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->m()Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v1, v2}, LCa/a$a;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v1}, LCa/a$a;->a()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_9

    move-object v8, v1

    goto :goto_6

    :cond_9
    move-object v8, v0

    :goto_6
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_7

    :cond_a
    move-object v1, v0

    :goto_7
    new-instance v2, LCa/a$b;

    invoke-direct {v2, v1}, LCa/a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, LCa/a$b;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    move-object v9, v2

    goto :goto_8

    :cond_b
    move-object v9, v0

    :goto_8
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->h()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_c

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_9

    :cond_c
    move-object v1, v0

    :goto_9
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->h()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_d

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_a

    :cond_d
    move-object v2, v0

    :goto_a
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->r()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_e

    goto :goto_b

    :cond_e
    move-object v3, v0

    :goto_b
    new-instance v10, LCa/a$d;

    invoke-direct {v10, v1, v2, v3}, LCa/a$d;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v10}, LCa/a$d;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_f

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    :cond_f
    invoke-virtual {v10}, LCa/a$d;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_10

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    :cond_10
    invoke-virtual {v10}, LCa/a$d;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_11

    goto :goto_c

    :cond_11
    move-object v10, v0

    :cond_12
    :goto_c
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->k()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_d

    :cond_13
    move-object v1, v0

    :goto_d
    new-instance v2, LCa/a$f;

    invoke-direct {v2, v1}, LCa/a$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, LCa/a$f;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    move-object v11, v2

    goto :goto_e

    :cond_14
    move-object v11, v0

    :goto_e
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_f

    :cond_15
    move-object v1, v0

    :goto_f
    new-instance v2, LCa/a$e;

    invoke-direct {v2, v1}, LCa/a$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, LCa/a$e;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_16

    move-object v12, v2

    goto :goto_10

    :cond_16
    move-object v12, v0

    :goto_10
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductCompliance;->f()Ljava/lang/Boolean;

    move-result-object v13

    new-instance v0, LCa/a;

    move-object v3, v0

    invoke-direct/range {v3 .. v13}, LCa/a;-><init>(Ljava/lang/String;Ljava/lang/String;LCa/a$g;LCa/a$c;LCa/a$a;LCa/a$b;LCa/a$d;LCa/a$f;LCa/a$e;Ljava/lang/Boolean;)V

    :cond_17
    return-object v0
.end method

.method private final d(Lcom/ui/uidb/api/ApiProduct;)Ljava/util/Set;
    .locals 3

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->c()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "GUID is not in UUID format: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_0
    return-object v0
.end method

.method private final e(Lcom/ui/uidb/api/ApiProduct;Ljava/lang/String;Lcom/ui/uidb/UiDB$b;)Ljava/util/Set;
    .locals 10

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->e()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v1}, Lab/d$a$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v3, -0x70059cd0

    if-eq v1, v3, :cond_5

    const v3, -0x38b63d91

    if-eq v1, v3, :cond_3

    const v3, 0x5c13d641

    if-eq v1, v3, :cond_1

    goto :goto_2

    :cond_1
    const-string/jumbo v1, "default"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Lab/d$a$b$b;->b:Lab/d$a$b$b;

    :goto_1
    move-object v7, v1

    goto :goto_3

    :cond_3
    const-string/jumbo v1, "topology"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    sget-object v1, Lab/d$a$b$d;->b:Lab/d$a$b$d;

    goto :goto_1

    :cond_5
    const-string/jumbo v1, "nopadding"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :goto_2
    new-instance v1, Lab/d$a$b$e;

    invoke-direct {v1, v2}, Lab/d$a$b$e;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    sget-object v1, Lab/d$a$b$c;->b:Lab/d$a$b$c;

    goto :goto_1

    :goto_3
    new-instance v1, Lab/d$a;

    const/4 v9, 0x0

    move-object v4, v1

    move-object v6, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lab/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lab/d$a$b;Lcom/ui/uidb/UiDB$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    return-object v0
.end method

.method private final f(Lcom/ui/uidb/api/ApiProduct;)Lab/d$b;
    .locals 7

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->j()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_b

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/ui/uidb/api/ApiProductUisp;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string/jumbo v0, "uisp"

    const-string/jumbo v1, "nameLegacy"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->g()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    check-cast v1, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/uidb/api/ApiProduct$Triplet;

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Triplet;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    :cond_3
    move-object v3, v4

    :cond_4
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Triplet;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-static {v5}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    :cond_5
    move-object v5, v4

    :cond_6
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Triplet;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_3

    :cond_7
    move-object v4, v2

    :cond_8
    :goto_3
    new-instance v2, Lab/d$b$a;

    invoke-direct {v2, v3, v5, v4}, Lab/d$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    new-instance v1, Lab/d$b;

    invoke-direct {v1, p1, v0}, Lab/d$b;-><init>(Ljava/util/List;Ljava/util/Set;)V

    return-object v1

    :cond_a
    const-string/jumbo v0, "triplets"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_b
    const-string/jumbo v0, "shortnames"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method private final g(Lcom/ui/uidb/api/ApiProduct;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->h()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final h(Lcom/ui/uidb/api/ApiProduct;)Lua/b;
    .locals 5

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->f()Lcom/ui/uidb/api/ApiProduct$Line;

    move-result-object v0

    const-string/jumbo v1, "line"

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/ui/uidb/api/ApiProduct$Line;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lab/f;->a:Lab/a;

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->f()Lcom/ui/uidb/api/ApiProduct$Line;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Line;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lab/a;->a(Ljava/lang/String;)Lua/b;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lua/b$v;

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->f()Lcom/ui/uidb/api/ApiProduct$Line;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Line;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lua/b$v;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->l()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_2

    iget-object v2, p0, Lab/f;->a:Lab/a;

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Lab/a;->b(Lua/b;Ljava/lang/String;)Lua/b;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    if-nez v2, :cond_5

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProductUisp;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object v2, v3

    :cond_3
    if-eqz v2, :cond_4

    iget-object v1, p0, Lab/f;->b:Lab/b;

    invoke-virtual {v1, v2}, Lab/b;->e(Ljava/lang/String;)Lua/b;

    move-result-object v2

    goto :goto_2

    :cond_4
    const-string/jumbo v0, "uisp"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_5
    :goto_2
    if-nez v2, :cond_8

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->n()Lcom/ui/uidb/api/ApiProductUnifi;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->n()Lcom/ui/uidb/api/ApiProductUnifi;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductUnifi;->a()Lcom/ui/uidb/api/ApiProductUnifi$Network;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProductUnifi$Network;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    move-object p1, v3

    :cond_6
    if-eqz p1, :cond_7

    iget-object v1, p0, Lab/f;->c:Lab/c;

    invoke-virtual {v1, p1}, Lab/c;->a(Ljava/lang/String;)Lua/b;

    move-result-object v3

    :cond_7
    move-object v2, v3

    :cond_8
    if-nez v2, :cond_9

    goto :goto_3

    :cond_9
    move-object v0, v2

    :goto_3
    return-object v0

    :cond_a
    const-string/jumbo v0, "id"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method private final i(Lcom/ui/uidb/api/ApiProduct;)Lab/d$c;
    .locals 12

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/uidb/api/ApiProductUisp;->b()Lcom/ui/uidb/api/ApiProductUisp$Firmware;

    move-result-object v0

    const-string/jumbo v2, "uisp"

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/ui/uidb/api/ApiProductUisp$Firmware;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v3, Lab/e;

    invoke-direct {v3, p0}, Lab/e;-><init>(Lab/f;)V

    invoke-static {v0, v3}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUisp;->b()Lcom/ui/uidb/api/ApiProductUisp$Firmware;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUisp$Firmware;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Lab/f;->b:Lab/b;

    invoke-virtual {v4, v3}, Lab/b;->d(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwarePlatform;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_0
    new-instance v3, Lcom/ui/product/firmware/UiFirmwarePlatform$Unknown;

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/uidb/api/ApiProductUisp;->b()Lcom/ui/uidb/api/ApiProductUisp$Firmware;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/uidb/api/ApiProductUisp$Firmware;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    const-string/jumbo v4, "unknown"

    :cond_1
    invoke-direct {v3, v4}, Lcom/ui/product/firmware/UiFirmwarePlatform$Unknown;-><init>(Ljava/lang/String;)V

    :cond_2
    new-instance v4, LEa/b;

    invoke-direct {v4, v0, v3}, LEa/b;-><init>(Ljava/util/Set;Lcom/ui/product/firmware/UiFirmwarePlatform;)V

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/uidb/api/ApiProductUisp;->a()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/uidb/api/ApiProductUisp$BleService;

    :try_start_0
    invoke-static {v6}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v6}, Lva/b;->c(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v6

    invoke-static {v6}, Lva/b;->a(Ljava/util/UUID;)Lva/b;

    move-result-object v7

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUisp$BleService;->a()Ljava/lang/String;

    move-result-object v8

    const-string/jumbo v9, "mode"

    const-string/jumbo v10, "bleServices"

    if-eqz v8, :cond_4

    iget-object v11, p0, Lab/f;->b:Lab/b;

    invoke-virtual {v11, v8}, Lab/b;->b(Ljava/lang/String;)Lva/c;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUisp$BleService;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v11, p0, Lab/f;->b:Lab/b;

    invoke-virtual {v11, v5}, Lab/b;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    new-instance v9, LEa/a;

    invoke-direct {v9, v6, v8, v5, v1}, LEa/a;-><init>(Ljava/util/UUID;Lva/c;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    filled-new-array {v2, v10, v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_4
    filled-new-array {v2, v10, v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :catch_0
    new-instance p1, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "UISP BTLE service is not in UUID format: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, v2, v1}, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_5
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    move-object v1, v3

    :cond_6
    new-instance p1, Lab/d$c;

    invoke-direct {p1, v1, v4}, Lab/d$c;-><init>(Ljava/util/Map;LEa/b;)V

    move-object v1, p1

    goto :goto_1

    :cond_7
    const-string/jumbo v0, "firmware"

    const-string/jumbo v1, "board"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_8
    :goto_1
    return-object v1
.end method

.method private static final j(Lab/f;Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;
    .locals 1

    const-string/jumbo v0, "board"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lab/f;->b:Lab/b;

    invoke-virtual {p0, p1}, Lab/b;->c(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;

    move-result-object p0

    if-nez p0, :cond_0

    new-instance p0, Lcom/ui/product/firmware/UiFirmwareBoard$Unknown;

    invoke-direct {p0, p1}, Lcom/ui/product/firmware/UiFirmwareBoard$Unknown;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method private final k(Lcom/ui/uidb/api/ApiProduct;)Lab/d$d;
    .locals 12

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->n()Lcom/ui/uidb/api/ApiProductUnifi;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/ui/uidb/api/ApiProductUnifi;->a()Lcom/ui/uidb/api/ApiProductUnifi$Network;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/ui/uidb/api/ApiProductUnifi$Network;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/uidb/api/ApiProductUnifi$BleService;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->c()Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->a()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    const-string/jumbo v7, "Unifi BTLE service is not in UUID format: "

    const-string/jumbo v8, "fromString(...)"

    if-eqz v5, :cond_0

    :try_start_0
    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lva/b;->c(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v9, Lva/c;->CONFIGURED:Lva/c;

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->c()Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;

    move-result-object v10

    invoke-virtual {v10}, Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;->a()Ljava/lang/Boolean;

    move-result-object v10

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    new-instance v11, LFa/a;

    invoke-direct {v11, v5, v9, v10, v1}, LFa/a;-><init>(Ljava/util/UUID;Lva/c;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catch_0
    new-instance p1, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v1, v6, v1}, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_0
    :goto_1
    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    :try_start_1
    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lva/b;->c(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    sget-object v6, Lva/c;->FACTORY:Lva/c;

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->c()Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService$Features;->a()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    new-instance v7, LFa/a;

    invoke-direct {v7, v5, v6, v3, v1}, LFa/a;-><init>(Ljava/util/UUID;Lva/c;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catch_1
    new-instance p1, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProductUnifi$BleService;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v1, v6, v1}, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_1
    :goto_2
    invoke-static {v2, v4}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto/16 :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_4

    const/16 v0, 0xa

    invoke-static {v2, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v3, 0x10

    invoke-static {v0, v3}, Lsh/m;->d(II)I

    move-result v0

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LFa/a;

    invoke-virtual {v4}, LFa/a;->a()Ljava/util/UUID;

    move-result-object v4

    invoke-static {v4}, Lva/b;->a(Ljava/util/UUID;)Lva/b;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_4
    move-object v3, v1

    :cond_5
    const-string/jumbo v0, "net"

    invoke-direct {p0, p1, v0}, Lab/f;->g(Lcom/ui/uidb/api/ApiProduct;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    move-object v0, v1

    :goto_5
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->n()Lcom/ui/uidb/api/ApiProductUnifi;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProductUnifi;->a()Lcom/ui/uidb/api/ApiProductUnifi$Network;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProductUnifi$Network;->b()Ljava/lang/String;

    move-result-object v2

    goto :goto_6

    :cond_7
    move-object v2, v1

    :goto_6
    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->p()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->n()Lcom/ui/uidb/api/ApiProductUnifi;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUnifi;->a()Lcom/ui/uidb/api/ApiProductUnifi$Network;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUnifi$Network;->c()Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;->b()Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;->a()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_8

    return-object v1

    :cond_8
    new-instance v6, LGa/a;

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;->b()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v5}, Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v7, v5}, LGa/a;-><init>(ILjava/lang/String;)V

    goto :goto_7

    :cond_9
    return-object v1

    :cond_a
    move-object v6, v1

    :goto_7
    new-instance v5, Lab/d$d$a;

    invoke-direct {v5, v0, v2, v4, v6}, Lab/d$d$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LGa/a;)V

    invoke-virtual {v5}, Lab/d$d$a;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_c

    invoke-virtual {v5}, Lab/d$d$a;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_c

    invoke-virtual {v5}, Lab/d$d$a;->c()LGa/a;

    move-result-object v0

    if-eqz v0, :cond_b

    goto :goto_8

    :cond_b
    move-object v5, v1

    :cond_c
    :goto_8
    const-string/jumbo v0, "protect"

    invoke-direct {p0, p1, v0}, Lab/f;->g(Lcom/ui/uidb/api/ApiProduct;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_9

    :cond_d
    move-object p1, v1

    :goto_9
    if-eqz p1, :cond_e

    new-instance v0, Lab/d$d$b;

    invoke-direct {v0, p1}, Lab/d$d$b;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :cond_e
    move-object v0, v1

    :goto_a
    new-instance p1, Lab/d$d;

    invoke-direct {p1, v3, v5, v0}, Lab/d$d;-><init>(Ljava/util/Map;Lab/d$d$a;Lab/d$d$b;)V

    invoke-virtual {p1}, Lab/d$d;->D()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_f
    invoke-virtual {p1}, Lab/d$d;->a()Lab/d$d$a;

    move-result-object v0

    if-nez v0, :cond_10

    invoke-virtual {p1}, Lab/d$d;->c()Lab/d$d$b;

    move-result-object v0

    if-eqz v0, :cond_11

    :cond_10
    move-object v1, p1

    :cond_11
    return-object v1
.end method

.method private final l(Lcom/ui/uidb/api/ApiProduct;Ljava/lang/String;Lcom/ui/uidb/UiDB$b;)Ljava/util/Set;
    .locals 10

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->o()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v1}, Lab/d$e$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v3, 0x2e958981

    if-eq v1, v3, :cond_5

    const v3, 0x431b5cda

    if-eq v1, v3, :cond_3

    const v3, 0x659979e2

    if-eq v1, v3, :cond_1

    goto :goto_2

    :cond_1
    const-string/jumbo v1, "mobile-setup-wizard-testing-connection"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Lab/d$e$b$d;->b:Lab/d$e$b$d;

    :goto_1
    move-object v7, v1

    goto :goto_3

    :cond_3
    const-string/jumbo v1, "mobile-setup-wizard-plugin"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    sget-object v1, Lab/d$e$b$c;->b:Lab/d$e$b$c;

    goto :goto_1

    :cond_5
    const-string/jumbo v1, "mobile-intro"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :goto_2
    new-instance v1, Lab/d$e$b$e;

    invoke-direct {v1, v2}, Lab/d$e$b$e;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    sget-object v1, Lab/d$e$b$b;->b:Lab/d$e$b$b;

    goto :goto_1

    :goto_3
    new-instance v1, Lab/d$e;

    const/4 v9, 0x0

    move-object v4, v1

    move-object v6, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lab/d$e;-><init>(Ljava/lang/String;Ljava/lang/String;Lab/d$e$b;Lcom/ui/uidb/UiDB$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    return-object v0
.end method

.method private final varargs n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;
    .locals 10

    new-instance v0, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const-string v2, "."

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v9}, LZg/n;->I0([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct;->i()Lcom/ui/uidb/api/ApiProduct$Names;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/uidb/api/ApiProduct$Names;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Missing field - \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' at product ["

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p2, "]("

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    invoke-direct {v0, p1, v2, p2, v2}, Lcom/ui/uidb/product/UiDBProduct$Factory$InvalidProduct;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method


# virtual methods
.method public m(Lcom/ui/uidb/UiDB$b;Lcom/ui/uidb/api/ApiProduct;)Lab/d;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string/jumbo v3, "environment"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "apiProduct"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/ui/uidb/api/ApiProduct;->d()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v3, v5

    :cond_0
    if-eqz v3, :cond_b

    invoke-static {v3}, Lua/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lcom/ui/uidb/api/ApiProduct;->i()Lcom/ui/uidb/api/ApiProduct$Names;

    move-result-object v3

    const-string/jumbo v4, "product"

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProduct$Names;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v9, v5

    goto :goto_0

    :cond_1
    move-object v9, v3

    :goto_0
    if-eqz v9, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/ui/uidb/api/ApiProduct;->i()Lcom/ui/uidb/api/ApiProduct$Names;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/uidb/api/ApiProduct$Names;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v10, v5

    goto :goto_1

    :cond_2
    move-object v10, v3

    :goto_1
    if-eqz v10, :cond_9

    invoke-virtual/range {p2 .. p2}, Lcom/ui/uidb/api/ApiProduct;->j()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_7

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v5

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-le v4, v8, :cond_6

    move-object v5, v6

    move v4, v8

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_5

    :goto_2
    check-cast v5, Ljava/lang/String;

    :cond_7
    move-object v11, v5

    invoke-direct {v0, v2}, Lab/f;->h(Lcom/ui/uidb/api/ApiProduct;)Lua/b;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, Lcom/ui/uidb/api/ApiProduct;->k()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_8

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v3

    sget-object v4, Lab/f$a;->a:Lab/f$a;

    invoke-static {v3, v4}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    invoke-static {v3}, Lzi/m;->b0(Lzi/j;)Ljava/util/Set;

    move-result-object v13

    if-eqz v13, :cond_8

    invoke-direct {v0, v2, v7, v1}, Lab/f;->e(Lcom/ui/uidb/api/ApiProduct;Ljava/lang/String;Lcom/ui/uidb/UiDB$b;)Ljava/util/Set;

    move-result-object v14

    invoke-direct {v0, v2, v7, v1}, Lab/f;->l(Lcom/ui/uidb/api/ApiProduct;Ljava/lang/String;Lcom/ui/uidb/UiDB$b;)Ljava/util/Set;

    move-result-object v15

    invoke-direct {v0, v2}, Lab/f;->i(Lcom/ui/uidb/api/ApiProduct;)Lab/d$c;

    move-result-object v16

    invoke-direct {v0, v2}, Lab/f;->k(Lcom/ui/uidb/api/ApiProduct;)Lab/d$d;

    move-result-object v17

    invoke-direct {v0, v2}, Lab/f;->b(Lcom/ui/uidb/api/ApiProduct;)Ljava/util/Map;

    move-result-object v18

    invoke-direct {v0, v2}, Lab/f;->f(Lcom/ui/uidb/api/ApiProduct;)Lab/d$b;

    move-result-object v20

    invoke-direct {v0, v2}, Lab/f;->d(Lcom/ui/uidb/api/ApiProduct;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v0, v2}, Lab/f;->c(Lcom/ui/uidb/api/ApiProduct;)LCa/a;

    move-result-object v19

    new-instance v1, Lab/d;

    const/16 v21, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v21}, Lab/d;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lua/b;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lab/d$c;Lab/d$d;Ljava/util/Map;LCa/a;Lab/d$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_8
    const-string/jumbo v1, "sysids"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :cond_9
    const-string/jumbo v1, "abbrev"

    filled-new-array {v4, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :cond_a
    const-string/jumbo v1, "name"

    filled-new-array {v4, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :cond_b
    const-string/jumbo v1, "id"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lab/f;->n(Lcom/ui/uidb/api/ApiProduct;[Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1
.end method
