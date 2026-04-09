.class public interface abstract Laa3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public static g(Landroid/content/Context;IILpc4;)Laa3;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Lba3;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    move-object p1, p0

    .line 11
    check-cast p1, Lba3;

    .line 12
    .line 13
    invoke-virtual {p1}, Lba3;->c()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lba3;->f(I)Laa3;

    .line 17
    .line 18
    .line 19
    iget-object p2, p3, Lpc4;->r:Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-static {p2}, La30;->y(Landroid/os/Bundle;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p1, p2}, Lba3;->t(I)Laa3;

    .line 26
    .line 27
    .line 28
    iget-object p2, p3, Lpc4;->u:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    const/4 p3, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object p3, Lmz1;->w9:Liz1;

    .line 39
    .line 40
    sget-object v0, Ltw1;->e:Ltw1;

    .line 41
    .line 42
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 43
    .line 44
    invoke-virtual {v0, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    check-cast p3, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p3, p2}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    :goto_0
    if-eqz p3, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lba3;->G(Ljava/lang/String;)Laa3;

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static l(Landroid/content/Context;I)Laa3;
    .locals 2

    .line 1
    invoke-static {}, Lea3;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    add-int/lit8 v0, p1, -0x2

    .line 8
    .line 9
    const/16 v1, 0x14

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x15

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x6e

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :pswitch_0
    sget-object v0, Ln02;->b:Lso1;

    .line 26
    .line 27
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    sget-object v0, Ln02;->d:Lso1;

    .line 39
    .line 40
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    goto :goto_0

    .line 51
    :pswitch_2
    sget-object v0, Ln02;->c:Lso1;

    .line 52
    .line 53
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object v0, Lmz1;->E9:Liz1;

    .line 65
    .line 66
    sget-object v1, Ltw1;->e:Ltw1;

    .line 67
    .line 68
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-object v0, Ln02;->e:Lso1;

    .line 82
    .line 83
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    :goto_0
    if-eqz v0, :cond_2

    .line 94
    .line 95
    new-instance v0, Lba3;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1}, Lba3;-><init>(Landroid/content/Context;I)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_2
    :goto_1
    new-instance p0, Lpa3;

    .line 102
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public abstract G(Ljava/lang/String;)Laa3;
.end method

.method public abstract a()Laa3;
.end method

.method public abstract b(Z)Laa3;
.end method

.method public abstract d()Z
.end method

.method public abstract f(I)Laa3;
.end method

.method public abstract h()Laa3;
.end method

.method public abstract i()Z
.end method

.method public abstract j(Ljava/lang/Throwable;)Laa3;
.end method

.method public abstract k(Lnx2;)Laa3;
.end method

.method public abstract m(Ljava/lang/String;)Laa3;
.end method

.method public abstract n()Lca3;
.end method

.method public abstract o(Lp21;)Laa3;
.end method

.method public abstract q0(Ljava/lang/String;)Laa3;
.end method

.method public abstract t(I)Laa3;
.end method
