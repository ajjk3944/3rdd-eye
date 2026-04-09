.class public final synthetic Lhj4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lhj4;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lhj4;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p4, p0, Lhj4;->g:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lhj4;->i:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lhj4;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhj4;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Landroid/util/Pair;

    .line 9
    .line 10
    iget-object v1, p0, Lhj4;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lpv2;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    iget-object v3, v1, Lpv2;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    const-string v3, "action"

    .line 25
    .line 26
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    iget-object v4, p0, Lhj4;->g:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    const/4 v3, 0x0

    .line 45
    move v4, v3

    .line 46
    :goto_1
    array-length v5, v0

    .line 47
    if-ge v4, v5, :cond_4

    .line 48
    .line 49
    aget-object v5, v0, v4

    .line 50
    .line 51
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-nez v7, :cond_3

    .line 64
    .line 65
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    invoke-virtual {v2, v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-virtual {v1, v2, v3}, Lpv2;->a(Ljava/util/Map;Z)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_0
    iget-object v0, p0, Lhj4;->h:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lzb1;

    .line 85
    .line 86
    iget-object v1, p0, Lhj4;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Ljava/util/HashMap;

    .line 89
    .line 90
    iget-object v0, v0, Lzb1;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lag2;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    iget-object v2, p0, Lhj4;->g:Ljava/lang/String;

    .line 97
    .line 98
    invoke-interface {v0, v2, v1}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
