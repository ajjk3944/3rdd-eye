.class public final Lab/c;
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
    const-string/jumbo v0, "unvr"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Lua/b$t$f;->b:Lua/b$t$f;

    goto/16 :goto_1

    :sswitch_1
    const-string/jumbo v0, "usw"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lua/b$r$h;->b:Lua/b$r$h;

    goto :goto_1

    :sswitch_2
    const-string/jumbo v0, "uph"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lua/b$u;->a:Lua/b$u;

    goto :goto_1

    :sswitch_3
    const-string/jumbo v0, "ugw"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lua/b$r$g;->b:Lua/b$r$g;

    goto :goto_1

    :sswitch_4
    const-string/jumbo v0, "udm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lua/b$r$f;->b:Lua/b$r$f;

    goto :goto_1

    :sswitch_5
    const-string/jumbo v0, "uck"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, Lua/b$r$d;->b:Lua/b$r$d;

    goto :goto_1

    :sswitch_6
    const-string/jumbo v0, "ubb"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    sget-object p1, Lua/b$r$c;->b:Lua/b$r$c;

    goto :goto_1

    :sswitch_7
    const-string/jumbo v0, "uas"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    sget-object p1, Lua/b$r$b;->b:Lua/b$r$b;

    goto :goto_1

    :sswitch_8
    const-string/jumbo v0, "uap"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_8
    sget-object p1, Lua/b$r$a;->b:Lua/b$r$a;

    :goto_1
    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1c364 -> :sswitch_8
        0x1c367 -> :sswitch_7
        0x1c375 -> :sswitch_6
        0x1c39d -> :sswitch_5
        0x1c3be -> :sswitch_4
        0x1c425 -> :sswitch_3
        0x1c52d -> :sswitch_2
        0x1c599 -> :sswitch_1
        0x36db15 -> :sswitch_0
    .end sparse-switch
.end method
