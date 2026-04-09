.class public final Lab/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lua/b;
    .locals 1

    const-string/jumbo v0, "line"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string/jumbo v0, "unifi-access"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Lua/b$l;->a:Lua/b$l;

    goto/16 :goto_1

    :sswitch_1
    const-string/jumbo v0, "wifiman"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p1, Lua/b$x;->a:Lua/b$x;

    goto/16 :goto_1

    :sswitch_2
    const-string/jumbo v0, "unifi-mobility"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p1, Lua/b$q;->a:Lua/b$q;

    goto/16 :goto_1

    :sswitch_3
    const-string/jumbo v0, "unifi-drive"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p1, Lua/b$n;->a:Lua/b$n;

    goto/16 :goto_1

    :sswitch_4
    const-string/jumbo v0, "toughswitch"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p1, Lua/b$i;->a:Lua/b$i;

    goto/16 :goto_1

    :sswitch_5
    const-string/jumbo v0, "unifi-network"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p1, Lua/b$r$e;->b:Lua/b$r$e;

    goto/16 :goto_1

    :sswitch_6
    const-string/jumbo v0, "unifi-connect"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p1, Lua/b$m;->a:Lua/b$m;

    goto/16 :goto_1

    :sswitch_7
    const-string/jumbo v0, "wave"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :cond_7
    sget-object p1, Lua/b$w$a;->b:Lua/b$w$a;

    goto/16 :goto_1

    :sswitch_8
    const-string/jumbo v0, "uisp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_0

    :cond_8
    sget-object p1, Lua/b$k$a;->b:Lua/b$k$a;

    goto/16 :goto_1

    :sswitch_9
    const-string/jumbo v0, "mfi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    sget-object p1, Lua/b$g;->a:Lua/b$g;

    goto/16 :goto_1

    :sswitch_a
    const-string/jumbo v0, "ltu"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_0

    :cond_a
    sget-object p1, Lua/b$f$a;->b:Lua/b$f$a;

    goto/16 :goto_1

    :sswitch_b
    const-string/jumbo v0, "airfiber"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    sget-object p1, Lua/b$b$c;->b:Lua/b$b$c;

    goto/16 :goto_1

    :sswitch_c
    const-string/jumbo v0, "ufiber"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    sget-object p1, Lua/b$j$a;->b:Lua/b$j$a;

    goto/16 :goto_1

    :sswitch_d
    const-string/jumbo v0, "unifi-lte"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    sget-object p1, Lua/b$p;->a:Lua/b$p;

    goto/16 :goto_1

    :sswitch_e
    const-string/jumbo v0, "unifi-led"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    sget-object p1, Lua/b$o;->a:Lua/b$o;

    goto/16 :goto_1

    :sswitch_f
    const-string/jumbo v0, "amplifi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_0

    :cond_f
    sget-object p1, Lua/b$d;->a:Lua/b$d;

    goto :goto_1

    :sswitch_10
    const-string/jumbo v0, "sunmax"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_0

    :cond_10
    sget-object p1, Lua/b$h$a;->b:Lua/b$h$a;

    goto :goto_1

    :sswitch_11
    const-string/jumbo v0, "aircube"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_0

    :cond_11
    sget-object p1, Lua/b$a;->a:Lua/b$a;

    goto :goto_1

    :sswitch_12
    const-string/jumbo v0, "unifi-talk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_0

    :cond_12
    sget-object p1, Lua/b$u;->a:Lua/b$u;

    goto :goto_1

    :sswitch_13
    const-string/jumbo v0, "unifi-protect"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto :goto_0

    :cond_13
    sget-object p1, Lua/b$t$d;->b:Lua/b$t$d;

    goto :goto_1

    :sswitch_14
    const-string/jumbo v0, "apollo"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto :goto_0

    :cond_14
    sget-object p1, Lua/b$s;->a:Lua/b$s;

    goto :goto_1

    :sswitch_15
    const-string/jumbo v0, "airmax"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto :goto_0

    :cond_15
    sget-object p1, Lua/b$c$d;->b:Lua/b$c$d;

    goto :goto_1

    :sswitch_16
    const-string/jumbo v0, "edgemax"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_16
    sget-object p1, Lua/b$e$e;->b:Lua/b$e$e;

    :goto_1
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x70aafd79 -> :sswitch_16
        -0x547cd026 -> :sswitch_15
        -0x541b8b31 -> :sswitch_14
        -0x487d534b -> :sswitch_13
        -0x4013677a -> :sswitch_12
        -0x3b217781 -> :sswitch_11
        -0x351e4c68 -> :sswitch_10
        -0x3466593c -> :sswitch_f
        -0x339da50f -> :sswitch_e
        -0x339da33d -> :sswitch_d
        -0x328a6a69 -> :sswitch_c
        -0x28e8a61e -> :sswitch_b
        0x1a3ed -> :sswitch_a
        0x1a5f0 -> :sswitch_9
        0x36c7f1 -> :sswitch_8
        0x3792f9 -> :sswitch_7
        0x2a24ed0 -> :sswitch_6
        0x37cf3014 -> :sswitch_5
        0x3adc9eaf -> :sswitch_4
        0x3cccb0f0 -> :sswitch_3
        0x4bb5f485 -> :sswitch_2
        0x50012225 -> :sswitch_1
        0x56d48abe -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Lua/b;Ljava/lang/String;)Lua/b;
    .locals 1

    const-string/jumbo v0, "line"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "productType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lua/b$t;

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string/jumbo p1, "doorlock"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lua/b$t$c;->b:Lua/b$t$c;

    goto/16 :goto_2

    :sswitch_1
    const-string/jumbo p1, "light"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lua/b$t$e;->b:Lua/b$t$e;

    goto/16 :goto_2

    :sswitch_2
    const-string/jumbo p1, "chime"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lua/b$t$b;->b:Lua/b$t$b;

    goto/16 :goto_2

    :sswitch_3
    const-string/jumbo p1, "viewer"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lua/b$t$h;->b:Lua/b$t$h;

    goto/16 :goto_2

    :sswitch_4
    const-string/jumbo p1, "sensor"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lua/b$t$g;->b:Lua/b$t$g;

    goto/16 :goto_2

    :sswitch_5
    const-string/jumbo p1, "camera"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    sget-object p1, Lua/b$t$d;->b:Lua/b$t$d;

    goto/16 :goto_2

    :cond_5
    sget-object p1, Lua/b$t$a;->b:Lua/b$t$a;

    goto/16 :goto_2

    :cond_6
    instance-of p2, p1, Lua/b$h;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$g;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$a;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$k;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$i;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$e;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$w;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$f;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$b;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$c;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$d;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$j;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$r;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$l;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$u;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$o;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$m;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$p;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$n;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$q;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$s;

    if-nez p2, :cond_8

    instance-of p2, p1, Lua/b$x;

    if-nez p2, :cond_8

    instance-of p1, p1, Lua/b$v;

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_1
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x51863cdb -> :sswitch_5
        -0x35ffac46 -> :sswitch_4
        -0x30accdee -> :sswitch_3
        0x5a3f53c -> :sswitch_2
        0x6233516 -> :sswitch_1
        0x47ac61d9 -> :sswitch_0
    .end sparse-switch
.end method
