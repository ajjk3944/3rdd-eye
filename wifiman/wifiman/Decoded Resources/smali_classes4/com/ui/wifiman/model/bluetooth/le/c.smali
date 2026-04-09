.class public final Lcom/ui/wifiman/model/bluetooth/le/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/bluetooth/le/a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;

.field private final b:Lcom/ui/wifiman/model/vendor/d$b;

.field private final c:Ljava/util/HashMap;

.field private final d:LFg/a;

.field private final e:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;Lcom/ui/wifiman/model/vendor/d$b;)V
    .locals 2

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->a:Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->b:Lcom/ui/wifiman/model/vendor/d$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->c:Ljava/util/HashMap;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string p2, "createDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->d:LFg/a;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/le/c$a;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/bluetooth/le/c$a;-><init>(Lcom/ui/wifiman/model/bluetooth/le/c;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->e:Lgg/i;

    return-void
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/bluetooth/le/c;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->d:LFg/a;

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/bluetooth/le/c;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->c:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;Ljava/util/Set;)Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/bluetooth/le/c;->f(Lh9/a;Ljava/util/Set;)Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lh9/a;Ljava/util/Set;)Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 11

    check-cast p2, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p2, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a()Lcom/ui/wifiman/model/bluetooth/le/i$a;

    move-result-object v1

    invoke-interface {v10, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/ui/wifiman/model/bluetooth/le/i$a;->NAME:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-interface {v10, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->c()Ljava/lang/String;

    move-result-object p2

    move-object v3, p2

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    sget-object p2, Lcom/ui/wifiman/model/bluetooth/le/i$a;->MODEL_NUMBER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-interface {v10, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->c()Ljava/lang/String;

    move-result-object p2

    move-object v4, p2

    goto :goto_2

    :cond_2
    move-object v4, v0

    :goto_2
    sget-object p2, Lcom/ui/wifiman/model/bluetooth/le/i$a;->MANUFACTURER:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-interface {v10, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->b:Lcom/ui/wifiman/model/vendor/d$b;

    invoke-interface {v1, p2}, Lcom/ui/wifiman/model/vendor/d$b;->b(Ljava/lang/String;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object p2

    move-object v5, p2

    goto :goto_3

    :cond_3
    move-object v5, v0

    :goto_3
    sget-object p2, Lcom/ui/wifiman/model/bluetooth/le/i$a;->BATTERY_LEVEL:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-interface {v10, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->c()Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_4

    :cond_4
    move-object v6, v0

    :goto_4
    sget-object p2, Lcom/ui/wifiman/model/bluetooth/le/i$a;->FIRMWARE_REVISION:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-interface {v10, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->c()Ljava/lang/String;

    move-result-object p2

    move-object v7, p2

    goto :goto_5

    :cond_5
    move-object v7, v0

    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Lcom/ui/wifiman/model/bluetooth/le/a$a;-><init>(Lh9/a;Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V

    return-object p2
.end method


# virtual methods
.method public a(Lh9/a;)Lgg/z;
    .locals 4

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/c$b;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/c$b;-><init>(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->a:Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;

    invoke-interface {v2, p1}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;->a(Lh9/a;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->M0()Lgg/n;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/model/bluetooth/le/c$c;

    invoke-direct {v3, p1}, Lcom/ui/wifiman/model/bluetooth/le/c$c;-><init>(Lh9/a;)V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/bluetooth/le/c$d;

    invoke-direct {v2, p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/c$d;-><init>(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;)V

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/bluetooth/le/c$e;

    invoke-direct {v2, p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/c$e;-><init>(Lcom/ui/wifiman/model/bluetooth/le/c;Lh9/a;)V

    invoke-virtual {v1, v2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object p1

    const-string v0, "switchIfEmpty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/c;->e:Lgg/i;

    return-object v0
.end method
