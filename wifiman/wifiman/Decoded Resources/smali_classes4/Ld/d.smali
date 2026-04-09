.class public abstract LLd/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lxa/a$d;)Le8/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lua/a;->h0()Lua/b;

    move-result-object p0

    instance-of v0, p0, Lua/b$c;

    if-nez v0, :cond_7

    instance-of v0, p0, Lua/b$a;

    if-nez v0, :cond_7

    instance-of v0, p0, Lua/b$e;

    if-nez v0, :cond_7

    instance-of v0, p0, Lua/b$f;

    if-nez v0, :cond_7

    instance-of v0, p0, Lua/b$k;

    if-nez v0, :cond_7

    instance-of v0, p0, Lua/b$w;

    if-nez v0, :cond_7

    instance-of v0, p0, Lua/b$b$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lua/b$r;

    if-eqz v0, :cond_1

    sget-object p0, Le8/a;->NETWORK:Le8/a;

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lua/b$t;

    if-eqz v0, :cond_2

    sget-object p0, Le8/a;->PROTECT:Le8/a;

    goto :goto_1

    :cond_2
    instance-of v0, p0, Lua/b$d;

    if-eqz v0, :cond_3

    sget-object p0, Le8/a;->AMPLIFI:Le8/a;

    goto :goto_1

    :cond_3
    instance-of v0, p0, Lua/b$l;

    if-eqz v0, :cond_4

    sget-object p0, Le8/a;->ACCESS:Le8/a;

    goto :goto_1

    :cond_4
    instance-of v0, p0, Lua/b$m;

    if-eqz v0, :cond_5

    sget-object p0, Le8/a;->CONNECT:Le8/a;

    goto :goto_1

    :cond_5
    instance-of p0, p0, Lua/b$s;

    if-eqz p0, :cond_6

    sget-object p0, Le8/a;->PLAY:Le8/a;

    goto :goto_1

    :cond_6
    const/4 p0, 0x0

    goto :goto_1

    :cond_7
    :goto_0
    sget-object p0, Le8/a;->UISP:Le8/a;

    :goto_1
    return-object p0
.end method
