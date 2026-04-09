.class public final Lyj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lba4;

.field public final d:Lba4;

.field public final e:Lba4;

.field public final f:Lga4;


# direct methods
.method public constructor <init>(Lba4;Lba4;Lba4;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyj2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyj2;->c:Lba4;

    iput-object p2, p0, Lyj2;->d:Lba4;

    iput-object p3, p0, Lyj2;->b:Lga4;

    iput-object p4, p0, Lyj2;->e:Lba4;

    iput-object p5, p0, Lyj2;->f:Lga4;

    return-void
.end method

.method public constructor <init>(Lda4;Lba4;Lba4;Lda4;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyj2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyj2;->b:Lga4;

    iput-object p2, p0, Lyj2;->c:Lba4;

    iput-object p3, p0, Lyj2;->d:Lba4;

    iput-object p5, p0, Lyj2;->e:Lba4;

    iput-object p4, p0, Lyj2;->f:Lga4;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lyj2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyj2;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Landroid/content/Context;

    .line 14
    .line 15
    iget-object v0, p0, Lyj2;->c:Lba4;

    .line 16
    .line 17
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v3, v0

    .line 22
    check-cast v3, Lge3;

    .line 23
    .line 24
    iget-object v0, p0, Lyj2;->d:Lba4;

    .line 25
    .line 26
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v4, v0

    .line 31
    check-cast v4, Lgd3;

    .line 32
    .line 33
    iget-object v0, p0, Lyj2;->e:Lba4;

    .line 34
    .line 35
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, Lfd3;

    .line 41
    .line 42
    iget-object v0, p0, Lyj2;->f:Lga4;

    .line 43
    .line 44
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lvf3;

    .line 49
    .line 50
    new-instance v1, Lfe3;

    .line 51
    .line 52
    invoke-virtual {v0}, Lvf3;->T()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-direct/range {v1 .. v6}, Lfe3;-><init>(Landroid/content/Context;Lge3;Lgd3;Lfd3;Z)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :pswitch_0
    iget-object v0, p0, Lyj2;->c:Lba4;

    .line 61
    .line 62
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v2, v0

    .line 67
    check-cast v2, Ll62;

    .line 68
    .line 69
    iget-object v0, p0, Lyj2;->d:Lba4;

    .line 70
    .line 71
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v3, v0

    .line 76
    check-cast v3, Lrj2;

    .line 77
    .line 78
    iget-object v0, p0, Lyj2;->b:Lga4;

    .line 79
    .line 80
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v4, v0

    .line 85
    check-cast v4, Ljava/util/concurrent/Executor;

    .line 86
    .line 87
    iget-object v0, p0, Lyj2;->e:Lba4;

    .line 88
    .line 89
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    move-object v5, v0

    .line 94
    check-cast v5, Lqj2;

    .line 95
    .line 96
    iget-object v0, p0, Lyj2;->f:Lga4;

    .line 97
    .line 98
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    move-object v6, v0

    .line 103
    check-cast v6, Lym;

    .line 104
    .line 105
    new-instance v1, Lxj2;

    .line 106
    .line 107
    invoke-direct/range {v1 .. v6}, Lxj2;-><init>(Ll62;Lrj2;Ljava/util/concurrent/Executor;Lqj2;Lym;)V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
