.class public final Lx91;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljz0;


# instance fields
.field public final f:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx91;->f:Landroid/content/Context;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lrl;)Lkz0;
    .locals 4

    .line 1
    iget-object v0, p1, Lrl;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object p1, p1, Lrl;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ll92;

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lx91;->f:Landroid/content/Context;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Lrl;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v2, v1, v0, p1, v3}, Lrl;-><init>(Landroid/content/Context;Ljava/lang/String;Ll92;Z)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lox;

    .line 28
    .line 29
    iget-object v0, v2, Lrl;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/content/Context;

    .line 32
    .line 33
    iget-object v1, v2, Lrl;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, v2, Lrl;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Ll92;

    .line 40
    .line 41
    iget-boolean v2, v2, Lrl;->f:Z

    .line 42
    .line 43
    invoke-direct {p1, v0, v1, v3, v2}, Lox;-><init>(Landroid/content/Context;Ljava/lang/String;Ll92;Z)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "Must set a non-null database name to a configuration that uses the no backup directory."

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string v0, "Must set a non-null context to create the configuration."

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string v0, "Must set a callback to create the configuration."

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public b(Z)Ln70;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lzy;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lzy;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lx91;->f:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p1}, Ll21;->a(Landroid/content/Context;)Ll21;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ll21;->b(Lzy;)Ln70;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :catch_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-object p1

    .line 31
    :goto_0
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
