.class public final Lnh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lhh2;

.field public final c:Lba4;


# direct methods
.method public constructor <init>(Lhh2;Lba4;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lnh2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnh2;->c:Lba4;

    iput-object p1, p0, Lnh2;->b:Lhh2;

    return-void
.end method

.method public synthetic constructor <init>(Lhh2;Lba4;I)V
    .locals 0

    .line 2
    iput p3, p0, Lnh2;->a:I

    iput-object p1, p0, Lnh2;->b:Lhh2;

    iput-object p2, p0, Lnh2;->c:Lba4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lsq0;
    .locals 3

    .line 1
    iget-object v0, p0, Lnh2;->c:Lba4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lmv2;

    .line 8
    .line 9
    iget-object v1, p0, Lnh2;->b:Lhh2;

    .line 10
    .line 11
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    new-instance v1, Lsq0;

    .line 15
    .line 16
    const/16 v2, 0x13

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lnh2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnh2;->b:Lhh2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lnh2;->c:Lba4;

    .line 13
    .line 14
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lpv2;

    .line 19
    .line 20
    sget-object v2, Lmd2;->a:Lld2;

    .line 21
    .line 22
    invoke-static {v2}, Li41;->M(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ljd4;

    .line 26
    .line 27
    invoke-direct {v3, v0, v1, v2}, Ljd4;-><init>(Landroid/content/Context;Lpv2;Lld2;)V

    .line 28
    .line 29
    .line 30
    return-object v3

    .line 31
    :pswitch_0
    invoke-virtual {p0}, Lnh2;->a()Lsq0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :pswitch_1
    sget-object v0, Lmd2;->a:Lld2;

    .line 37
    .line 38
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lnh2;->b:Lhh2;

    .line 42
    .line 43
    invoke-virtual {v1}, Lhh2;->a()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, p0, Lnh2;->c:Lba4;

    .line 48
    .line 49
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lgx2;

    .line 54
    .line 55
    new-instance v3, Lk33;

    .line 56
    .line 57
    const/4 v4, 0x4

    .line 58
    invoke-direct {v3, v0, v1, v2, v4}, Lk33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :pswitch_2
    iget-object v0, p0, Lnh2;->b:Lhh2;

    .line 63
    .line 64
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, p0, Lnh2;->c:Lba4;

    .line 69
    .line 70
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/lang/String;

    .line 75
    .line 76
    new-instance v2, Lug4;

    .line 77
    .line 78
    invoke-direct {v2, v0, v1}, Lug4;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :pswitch_3
    iget-object v0, p0, Lnh2;->b:Lhh2;

    .line 83
    .line 84
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v1, p0, Lnh2;->c:Lba4;

    .line 89
    .line 90
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Landroid/content/pm/ApplicationInfo;

    .line 95
    .line 96
    :try_start_0
    invoke-static {v0}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-virtual {v0, v1, v2}, Lzj0;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 108
    :catch_0
    const/4 v0, 0x0

    .line 109
    :goto_0
    return-object v0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
