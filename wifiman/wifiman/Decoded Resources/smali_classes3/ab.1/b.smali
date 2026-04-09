.class public final Lab/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/ui/product/firmware/UiFirmwareBoard;->Companion:Lcom/ui/product/firmware/UiFirmwareBoard$Companion;

    invoke-virtual {v0}, Lcom/ui/product/firmware/UiFirmwareBoard$Companion;->getValues()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, LZg/U;->d(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lsh/m;->d(II)I

    move-result v2

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string/jumbo v5, "toLowerCase(...)"

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/ui/product/firmware/UiFirmwareBoard;

    invoke-virtual {v6}, Lcom/ui/product/firmware/UiFirmwareBoard;->getId()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v4, p0, Lab/b;->a:Ljava/util/Map;

    sget-object v0, Lcom/ui/product/firmware/UiFirmwarePlatform;->Companion:Lcom/ui/product/firmware/UiFirmwarePlatform$Companion;

    invoke-virtual {v0}, Lcom/ui/product/firmware/UiFirmwarePlatform$Companion;->getValues()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    invoke-static {v1, v3}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/ui/product/firmware/UiFirmwarePlatform;

    invoke-virtual {v3}, Lcom/ui/product/firmware/UiFirmwarePlatform;->getId()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iput-object v2, p0, Lab/b;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string/jumbo v0, "default_legacy"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_1
    const-string/jumbo v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :sswitch_2
    const-string/jumbo v0, "factory_legacy"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :sswitch_3
    const-string/jumbo v0, "factory"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4114cef6 -> :sswitch_3
        0x3a92609e -> :sswitch_2
        0x5c13d641 -> :sswitch_1
        0x73b6bf87 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Ljava/lang/String;)Lva/c;
    .locals 1

    const-string/jumbo v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string/jumbo v0, "default_legacy"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_1
    const-string/jumbo v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lva/c;->CONFIGURED:Lva/c;

    goto :goto_2

    :sswitch_2
    const-string/jumbo v0, "factory_legacy"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :sswitch_3
    const-string/jumbo v0, "factory"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    sget-object p1, Lva/c;->FACTORY:Lva/c;

    :goto_2
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4114cef6 -> :sswitch_3
        0x3a92609e -> :sswitch_2
        0x5c13d641 -> :sswitch_1
        0x73b6bf87 -> :sswitch_0
    .end sparse-switch
.end method

.method public final c(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lab/b;->a:Ljava/util/Map;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "toLowerCase(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/product/firmware/UiFirmwareBoard;

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwarePlatform;
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lab/b;->b:Ljava/util/Map;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "toLowerCase(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/product/firmware/UiFirmwarePlatform;

    return-object p1
.end method

.method public final e(Ljava/lang/String;)Lua/b;
    .locals 1

    const-string/jumbo v0, "line"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string/jumbo v0, "airfiber_60"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Lua/b$b$a$a;->b:Lua/b$b$a$a;

    goto/16 :goto_1

    :sswitch_1
    const-string/jumbo v0, "edge_switch_x"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p1, Lua/b$e$d$b;->b:Lua/b$e$d$b;

    goto/16 :goto_1

    :sswitch_2
    const-string/jumbo v0, "ufiber_onu"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p1, Lua/b$j$c$a;->b:Lua/b$j$c$a;

    goto/16 :goto_1

    :sswitch_3
    const-string/jumbo v0, "ufiber_olt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p1, Lua/b$j$b;->b:Lua/b$j$b;

    goto/16 :goto_1

    :sswitch_4
    const-string/jumbo v0, "wave_60"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p1, Lua/b$w$b;->b:Lua/b$w$b;

    goto/16 :goto_1

    :sswitch_5
    const-string/jumbo v0, "edge_switch"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p1, Lua/b$e$d$a;->b:Lua/b$e$d$a;

    goto/16 :goto_1

    :sswitch_6
    const-string/jumbo v0, "edge_router"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p1, Lua/b$e$c;->b:Lua/b$e$c;

    goto/16 :goto_1

    :sswitch_7
    const-string/jumbo v0, "ltu_ptp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :cond_7
    sget-object p1, Lua/b$f$b$b;->b:Lua/b$f$b$b;

    goto/16 :goto_1

    :sswitch_8
    const-string/jumbo v0, "sunmac_solarswitch"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_0

    :cond_8
    sget-object p1, Lua/b$h$c;->b:Lua/b$h$c;

    goto/16 :goto_1

    :sswitch_9
    const-string/jumbo v0, "airmax_m6"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    sget-object p1, Lua/b$c$f$g;->b:Lua/b$c$f$g;

    goto/16 :goto_1

    :sswitch_a
    const-string/jumbo v0, "airmax_m5"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_0

    :cond_a
    sget-object p1, Lua/b$c$f$f;->b:Lua/b$c$f$f;

    goto/16 :goto_1

    :sswitch_b
    const-string/jumbo v0, "airmax_m3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    sget-object p1, Lua/b$c$f$e;->b:Lua/b$c$f$e;

    goto/16 :goto_1

    :sswitch_c
    const-string/jumbo v0, "airmax_m2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    sget-object p1, Lua/b$c$f$c;->b:Lua/b$c$f$c;

    goto/16 :goto_1

    :sswitch_d
    const-string/jumbo v0, "airmax_gw"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    sget-object p1, Lua/b$c$c;->b:Lua/b$c$c;

    goto/16 :goto_1

    :sswitch_e
    const-string/jumbo v0, "edge_point_switch"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    sget-object p1, Lua/b$e$a$b;->b:Lua/b$e$a$b;

    goto/16 :goto_1

    :sswitch_f
    const-string/jumbo v0, "edge_point_router"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    sget-object p1, Lua/b$e$a$a;->b:Lua/b$e$a$a;

    goto/16 :goto_1

    :sswitch_10
    const-string/jumbo v0, "sunmax_solarpoint"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_0

    :cond_10
    sget-object p1, Lua/b$h$b;->b:Lua/b$h$b;

    goto/16 :goto_1

    :sswitch_11
    const-string/jumbo v0, "tough_switch"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_0

    :cond_11
    sget-object p1, Lua/b$i;->a:Lua/b$i;

    goto/16 :goto_1

    :sswitch_12
    const-string/jumbo v0, "uisp_lte"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto/16 :goto_0

    :cond_12
    sget-object p1, Lua/b$k$b;->b:Lua/b$k$b;

    goto/16 :goto_1

    :sswitch_13
    const-string/jumbo v0, "ufiber_onu_wifi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto/16 :goto_0

    :cond_13
    sget-object p1, Lua/b$j$c$b;->b:Lua/b$j$c$b;

    goto/16 :goto_1

    :sswitch_14
    const-string/jumbo v0, "uisp_power"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto/16 :goto_0

    :cond_14
    sget-object p1, Lua/b$k$c;->b:Lua/b$k$c;

    goto/16 :goto_1

    :sswitch_15
    const-string/jumbo v0, "airfiber"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto/16 :goto_0

    :cond_15
    sget-object p1, Lua/b$b$b;->b:Lua/b$b$b;

    goto/16 :goto_1

    :sswitch_16
    const-string/jumbo v0, "airmax_m25"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto/16 :goto_0

    :cond_16
    sget-object p1, Lua/b$c$f$b;->b:Lua/b$c$f$b;

    goto/16 :goto_1

    :sswitch_17
    const-string/jumbo v0, "airmax_m10"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto/16 :goto_0

    :cond_17
    sget-object p1, Lua/b$c$f$a;->b:Lua/b$c$f$a;

    goto/16 :goto_1

    :sswitch_18
    const-string/jumbo v0, "airmax_ax5"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    goto/16 :goto_0

    :cond_18
    sget-object p1, Lua/b$c$b$c;->b:Lua/b$c$b$c;

    goto/16 :goto_1

    :sswitch_19
    const-string/jumbo v0, "airmax_ax2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    goto/16 :goto_0

    :cond_19
    sget-object p1, Lua/b$c$b$b;->b:Lua/b$c$b$b;

    goto/16 :goto_1

    :sswitch_1a
    const-string/jumbo v0, "airmax_ac5"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    sget-object p1, Lua/b$c$a$c;->b:Lua/b$c$a$c;

    goto/16 :goto_1

    :sswitch_1b
    const-string/jumbo v0, "airmax_ac2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    sget-object p1, Lua/b$c$a$b;->b:Lua/b$c$a$b;

    goto/16 :goto_1

    :sswitch_1c
    const-string/jumbo v0, "airmax_installer"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    sget-object p1, Lua/b$c$e;->b:Lua/b$c$e;

    goto/16 :goto_1

    :sswitch_1d
    const-string/jumbo v0, "aircube"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    goto/16 :goto_0

    :cond_1d
    sget-object p1, Lua/b$a;->a:Lua/b$a;

    goto/16 :goto_1

    :sswitch_1e
    const-string/jumbo v0, "ltu_ptmp_ap"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1e

    goto/16 :goto_0

    :cond_1e
    sget-object p1, Lua/b$f$b$a$a;->b:Lua/b$f$b$a$a;

    goto/16 :goto_1

    :sswitch_1f
    const-string/jumbo v0, "airmax_m900"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    goto/16 :goto_0

    :cond_1f
    sget-object p1, Lua/b$c$f$h;->b:Lua/b$c$f$h;

    goto/16 :goto_1

    :sswitch_20
    const-string/jumbo v0, "airmax_m365"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_20

    goto/16 :goto_0

    :cond_20
    sget-object p1, Lua/b$c$f$d;->b:Lua/b$c$f$d;

    goto/16 :goto_1

    :sswitch_21
    const-string/jumbo v0, "airmax_ax60"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_21

    goto/16 :goto_0

    :cond_21
    sget-object p1, Lua/b$c$b$d;->b:Lua/b$c$b$d;

    goto/16 :goto_1

    :sswitch_22
    const-string/jumbo v0, "airmax_ax25"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    goto/16 :goto_0

    :cond_22
    sget-object p1, Lua/b$c$b$a;->b:Lua/b$c$b$a;

    goto/16 :goto_1

    :sswitch_23
    const-string/jumbo v0, "airmax_ac60"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_23

    goto :goto_0

    :cond_23
    sget-object p1, Lua/b$c$a$d;->b:Lua/b$c$a$d;

    goto :goto_1

    :sswitch_24
    const-string/jumbo v0, "airmax_ac25"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_24

    goto :goto_0

    :cond_24
    sget-object p1, Lua/b$c$a$a;->b:Lua/b$c$a$a;

    goto :goto_1

    :sswitch_25
    const-string/jumbo v0, "uisp_switch"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_25

    goto :goto_0

    :cond_25
    sget-object p1, Lua/b$k$e;->b:Lua/b$k$e;

    goto :goto_1

    :sswitch_26
    const-string/jumbo v0, "uisp_router"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_26

    goto :goto_0

    :cond_26
    sget-object p1, Lua/b$k$d;->b:Lua/b$k$d;

    goto :goto_1

    :sswitch_27
    const-string/jumbo v0, "airmax"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_27

    goto :goto_0

    :cond_27
    sget-object p1, Lua/b$c$d;->b:Lua/b$c$d;

    goto :goto_1

    :sswitch_28
    const-string/jumbo v0, "edge_power"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_28

    goto :goto_0

    :cond_28
    sget-object p1, Lua/b$e$b;->b:Lua/b$e$b;

    goto :goto_1

    :sswitch_29
    const-string/jumbo v0, "ltu_ptmp_sta"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_29

    goto :goto_0

    :cond_29
    sget-object p1, Lua/b$f$b$a$b;->b:Lua/b$f$b$a$b;

    goto :goto_1

    :sswitch_2a
    const-string/jumbo v0, "airfiber_60talyn"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2a

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_2a
    sget-object p1, Lua/b$b$a$b;->b:Lua/b$b$a$b;

    :goto_1
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x734e80e3 -> :sswitch_2a
        -0x73496b66 -> :sswitch_29
        -0x6161a7fd -> :sswitch_28
        -0x547cd026 -> :sswitch_27
        -0x49cdd4a9 -> :sswitch_26
        -0x47adb4be -> :sswitch_25
        -0x44750cd6 -> :sswitch_24
        -0x44750c5f -> :sswitch_23
        -0x4474be01 -> :sswitch_22
        -0x4474bd8a -> :sswitch_21
        -0x44704c16 -> :sswitch_20
        -0x4470364f -> :sswitch_1f
        -0x3d86818b -> :sswitch_1e
        -0x3b217781 -> :sswitch_1d
        -0x2baf269d -> :sswitch_1c
        -0x2b7fa595 -> :sswitch_1b
        -0x2b7fa592 -> :sswitch_1a
        -0x2b7fa30a -> :sswitch_19
        -0x2b7fa307 -> :sswitch_18
        -0x2b7f7e99 -> :sswitch_17
        -0x2b7f7e75 -> :sswitch_16
        -0x28e8a61e -> :sswitch_15
        -0x1301c4c9 -> :sswitch_14
        -0xb9db71a -> :sswitch_13
        -0x913c571 -> :sswitch_12
        -0x75843c8 -> :sswitch_11
        0x5451376 -> :sswitch_10
        0x723d41a -> :sswitch_f
        0x943f405 -> :sswitch_e
        0x175efb75 -> :sswitch_d
        0x175efbea -> :sswitch_c
        0x175efbeb -> :sswitch_b
        0x175efbed -> :sswitch_a
        0x175efbee -> :sswitch_9
        0x182d2d79 -> :sswitch_8
        0x1db0c79a -> :sswitch_7
        0x3895a80b -> :sswitch_6
        0x3ab5c7f6 -> :sswitch_5
        0x4339c9c0 -> :sswitch_4
        0x471fcf8f -> :sswitch_3
        0x471fcfce -> :sswitch_2
        0x6463ae6f -> :sswitch_1
        0x66662e37 -> :sswitch_0
    .end sparse-switch
.end method
