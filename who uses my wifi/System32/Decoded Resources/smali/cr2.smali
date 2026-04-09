.class public final Lcr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lau2;Ljava/lang/ref/WeakReference;Ljava/lang/String;Ly32;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcr2;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr2;->j:Ljava/lang/Object;

    iput-object p2, p0, Lcr2;->g:Ljava/lang/Object;

    iput-object p3, p0, Lcr2;->h:Ljava/lang/Object;

    iput-object p4, p0, Lcr2;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldr2;Leb3;Lx34;Lda3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcr2;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcr2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lcr2;->h:Ljava/lang/Object;

    iput-object p3, p0, Lcr2;->i:Ljava/lang/Object;

    iput-object p4, p0, Lcr2;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lxp2;Lgj2;Leb3;Ljz2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcr2;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lcr2;->i:Ljava/lang/Object;

    iput-object p3, p0, Lcr2;->h:Ljava/lang/Object;

    iput-object p4, p0, Lcr2;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 8

    .line 1
    iget v0, p0, Lcr2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v2, p1

    .line 7
    check-cast v2, Lag2;

    .line 8
    .line 9
    iget-object p1, p0, Lcr2;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lxp2;

    .line 12
    .line 13
    invoke-static {p2, p1}, Lx32;->b(Ljava/util/Map;Lxp2;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "u"

    .line 17
    .line 18
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/String;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const-string p1, "URL missing from click GMSG."

    .line 27
    .line 28
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p2, p0, Lcr2;->j:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v5, p2

    .line 35
    check-cast v5, Ljz2;

    .line 36
    .line 37
    iget-object p2, p0, Lcr2;->h:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v4, p2

    .line 40
    check-cast v4, Leb3;

    .line 41
    .line 42
    iget-object p2, p0, Lcr2;->i:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v3, p2

    .line 45
    check-cast v3, Lgj2;

    .line 46
    .line 47
    invoke-static {v2, p1}, Lx32;->a(Lag2;Ljava/lang/String;)Ln70;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v1, Lmc2;

    .line 52
    .line 53
    const/16 v6, 0x14

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-direct/range {v1 .. v7}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 57
    .line 58
    .line 59
    sget-object p2, Lmd2;->a:Lld2;

    .line 60
    .line 61
    new-instance v0, Ljq3;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v0, p1, v1, v2}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v0, p2}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :pswitch_0
    iget-object p1, p0, Lcr2;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-nez p1, :cond_1

    .line 80
    .line 81
    iget-object p1, p0, Lcr2;->j:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Lau2;

    .line 84
    .line 85
    iget-object p2, p0, Lcr2;->h:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1, p2, p0}, Lau2;->c(Ljava/lang/String;Ly32;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object v0, p0, Lcr2;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ly32;

    .line 96
    .line 97
    invoke-interface {v0, p1, p2}, Ly32;->c(Ljava/lang/Object;Ljava/util/Map;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void

    .line 101
    :pswitch_1
    iget-object p1, p0, Lcr2;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ldr2;

    .line 110
    .line 111
    const-string v0, "u"

    .line 112
    .line 113
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, Ljava/lang/String;

    .line 118
    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    iget-object v0, p0, Lcr2;->h:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Leb3;

    .line 131
    .line 132
    iget-object v1, p0, Lcr2;->i:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Lx34;

    .line 135
    .line 136
    iget-object v2, p0, Lcr2;->j:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Lda3;

    .line 139
    .line 140
    iget-object p1, p1, Ldr2;->I:Lao2;

    .line 141
    .line 142
    invoke-virtual {v0, p2, v1, v2, p1}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    :goto_2
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
