.class public abstract LSc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lxa/a$d;)LCc/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lua/a;->h0()Lua/b;

    move-result-object p0

    instance-of v0, p0, Lua/b$r$a;

    if-nez v0, :cond_c

    instance-of v0, p0, Lua/b$r$c;

    if-eqz v0, :cond_0

    goto :goto_4

    :cond_0
    instance-of v0, p0, Lua/b$r$f;

    if-nez v0, :cond_b

    instance-of v0, p0, Lua/b$r$g;

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    instance-of v0, p0, Lua/b$r$h;

    if-eqz v0, :cond_2

    sget-object p0, LCc/b$g$c;->b:LCc/b$g$c;

    goto :goto_5

    :cond_2
    instance-of v0, p0, Lua/b$r;

    if-eqz v0, :cond_3

    sget-object p0, LCc/b$g$d;->b:LCc/b$g$d;

    goto :goto_5

    :cond_3
    instance-of v0, p0, Lua/b$k$e;

    if-nez v0, :cond_a

    instance-of v0, p0, Lua/b$e$d;

    if-nez v0, :cond_a

    instance-of v0, p0, Lua/b$i;

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    instance-of v0, p0, Lua/b$k$d;

    if-nez v0, :cond_9

    instance-of v0, p0, Lua/b$e;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    instance-of v0, p0, Lua/b$c;

    if-nez v0, :cond_8

    instance-of v0, p0, Lua/b$a;

    if-nez v0, :cond_8

    instance-of v0, p0, Lua/b$b;

    if-nez v0, :cond_8

    instance-of v0, p0, Lua/b$w;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    instance-of p0, p0, Lua/b$k;

    if-eqz p0, :cond_7

    sget-object p0, LCc/b$g$d;->b:LCc/b$g$d;

    goto :goto_5

    :cond_7
    const/4 p0, 0x0

    goto :goto_5

    :cond_8
    :goto_0
    sget-object p0, LCc/b$g$a;->b:LCc/b$g$a;

    goto :goto_5

    :cond_9
    :goto_1
    sget-object p0, LCc/b$g$b;->b:LCc/b$g$b;

    goto :goto_5

    :cond_a
    :goto_2
    sget-object p0, LCc/b$g$c;->b:LCc/b$g$c;

    goto :goto_5

    :cond_b
    :goto_3
    sget-object p0, LCc/b$g$b;->b:LCc/b$g$b;

    goto :goto_5

    :cond_c
    :goto_4
    sget-object p0, LCc/b$g$a;->b:LCc/b$g$a;

    :goto_5
    return-object p0
.end method
