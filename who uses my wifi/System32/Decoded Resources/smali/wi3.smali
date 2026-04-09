.class public final Lwi3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lda4;

.field public final c:Lba4;

.field public final d:Lda4;

.field public final e:Lba4;


# direct methods
.method public synthetic constructor <init>(ILba4;Lba4;Lda4;Lda4;)V
    .locals 0

    .line 1
    iput p1, p0, Lwi3;->a:I

    iput-object p4, p0, Lwi3;->b:Lda4;

    iput-object p2, p0, Lwi3;->c:Lba4;

    iput-object p3, p0, Lwi3;->e:Lba4;

    iput-object p5, p0, Lwi3;->d:Lda4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lda4;Lba4;Lda4;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwi3;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwi3;->b:Lda4;

    iput-object p2, p0, Lwi3;->c:Lba4;

    iput-object p3, p0, Lwi3;->d:Lda4;

    iput-object p4, p0, Lwi3;->e:Lba4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lwi3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwi3;->b:Lda4;

    .line 7
    .line 8
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/content/Context;

    .line 11
    .line 12
    iget-object v1, p0, Lwi3;->c:Lba4;

    .line 13
    .line 14
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lgk3;

    .line 19
    .line 20
    iget-object v2, p0, Lwi3;->e:Lba4;

    .line 21
    .line 22
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lpq3;

    .line 27
    .line 28
    iget-object v3, p0, Lwi3;->d:Lda4;

    .line 29
    .line 30
    iget-object v3, v3, Lda4;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lvf3;

    .line 33
    .line 34
    new-instance v4, Lzj3;

    .line 35
    .line 36
    invoke-direct {v4, v0, v1, v2, v3}, Lzj3;-><init>(Landroid/content/Context;Lgk3;Lpq3;Lvf3;)V

    .line 37
    .line 38
    .line 39
    return-object v4

    .line 40
    :pswitch_0
    iget-object v0, p0, Lwi3;->b:Lda4;

    .line 41
    .line 42
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroid/content/Context;

    .line 45
    .line 46
    iget-object v1, p0, Lwi3;->c:Lba4;

    .line 47
    .line 48
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lgk3;

    .line 53
    .line 54
    iget-object v2, p0, Lwi3;->d:Lda4;

    .line 55
    .line 56
    iget-object v2, v2, Lda4;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lvf3;

    .line 59
    .line 60
    iget-object v3, p0, Lwi3;->e:Lba4;

    .line 61
    .line 62
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lpq3;

    .line 67
    .line 68
    new-instance v4, Lzj3;

    .line 69
    .line 70
    invoke-direct {v4, v0, v1, v2, v3}, Lzj3;-><init>(Landroid/content/Context;Lgk3;Lvf3;Lpq3;)V

    .line 71
    .line 72
    .line 73
    return-object v4

    .line 74
    :pswitch_1
    iget-object v0, p0, Lwi3;->b:Lda4;

    .line 75
    .line 76
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Landroid/content/Context;

    .line 79
    .line 80
    iget-object v1, p0, Lwi3;->c:Lba4;

    .line 81
    .line 82
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lgk3;

    .line 87
    .line 88
    iget-object v2, p0, Lwi3;->e:Lba4;

    .line 89
    .line 90
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lwh3;

    .line 95
    .line 96
    iget-object v3, p0, Lwi3;->d:Lda4;

    .line 97
    .line 98
    iget-object v3, v3, Lda4;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Lvf3;

    .line 101
    .line 102
    new-instance v4, Lvi3;

    .line 103
    .line 104
    invoke-direct {v4, v0, v1, v2, v3}, Lvi3;-><init>(Landroid/content/Context;Lgk3;Lwh3;Lvf3;)V

    .line 105
    .line 106
    .line 107
    return-object v4

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
