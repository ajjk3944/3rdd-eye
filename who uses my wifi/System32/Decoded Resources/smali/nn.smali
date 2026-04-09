.class public final Lnn;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly50;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La60;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lnn;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnn;->g:Ljava/lang/Object;

    .line 4
    sget-object v0, Llf;->c:Llf;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 5
    iget-object v1, v0, Llf;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Llf;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Ljf;

    move-result-object v1

    .line 7
    :goto_0
    iput-object v1, p0, Lnn;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnn;->f:I

    iput-object p1, p0, Lnn;->g:Ljava/lang/Object;

    iput-object p2, p0, Lnn;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb60;Lt50;)V
    .locals 5

    .line 1
    iget v0, p0, Lnn;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnn;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljf;

    .line 9
    .line 10
    iget-object v1, p0, Lnn;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La60;

    .line 13
    .line 14
    iget-object v0, v0, Ljf;->a:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v2, p1, p2, v1}, Ljf;->a(Ljava/util/List;Lb60;Lt50;La60;)V

    .line 23
    .line 24
    .line 25
    sget-object v2, Lt50;->ON_ANY:Lt50;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/List;

    .line 32
    .line 33
    invoke-static {v0, p1, p2, v1}, Ljf;->a(Ljava/util/List;Lb60;Lt50;La60;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    sget-object p1, Lt50;->ON_START:Lt50;

    .line 38
    .line 39
    if-ne p2, p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lnn;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ld60;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ld60;->f(La60;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lnn;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lvq2;

    .line 51
    .line 52
    invoke-virtual {p1}, Lvq2;->r()V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void

    .line 56
    :pswitch_1
    iget-object v0, p0, Lnn;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lsr;

    .line 59
    .line 60
    sget-object v1, Lmn;->a:[I

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    aget v1, v1, v2

    .line 67
    .line 68
    packed-switch v1, :pswitch_data_1

    .line 69
    .line 70
    .line 71
    new-instance p1, Lrg;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :pswitch_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    const-string p2, "ON_ANY must not been send by anybody"

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :pswitch_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 86
    .line 87
    const/16 v2, 0x1c

    .line 88
    .line 89
    if-lt v1, v2, :cond_1

    .line 90
    .line 91
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1}, Llh;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    new-instance v1, Landroid/os/Handler;

    .line 101
    .line 102
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 107
    .line 108
    .line 109
    :goto_0
    new-instance v2, Lvr;

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    invoke-direct {v2, v3}, Lvr;-><init>(I)V

    .line 113
    .line 114
    .line 115
    const-wide/16 v3, 0x1f4

    .line 116
    .line 117
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 118
    .line 119
    .line 120
    iget-object v1, v0, Lsr;->f:Ld60;

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Ld60;->f(La60;)V

    .line 123
    .line 124
    .line 125
    :pswitch_4
    iget-object v0, p0, Lnn;->h:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Ly50;

    .line 128
    .line 129
    if-eqz v0, :cond_2

    .line 130
    .line 131
    invoke-interface {v0, p1, p2}, Ly50;->a(Lb60;Lt50;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    return-void

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
    .end packed-switch
.end method
