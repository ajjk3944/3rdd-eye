.class public final Lui3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lda4;

.field public final c:Lga4;

.field public final d:Lba4;

.field public final e:Lda4;

.field public final f:Lga4;


# direct methods
.method public constructor <init>(Lda4;Lba4;Lba4;Lda4;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lui3;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lui3;->b:Lda4;

    iput-object p2, p0, Lui3;->c:Lga4;

    iput-object p3, p0, Lui3;->d:Lba4;

    iput-object p4, p0, Lui3;->e:Lda4;

    iput-object p5, p0, Lui3;->f:Lga4;

    return-void
.end method

.method public constructor <init>(Lda4;Lba4;Lda4;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lui3;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lui3;->b:Lda4;

    iput-object p2, p0, Lui3;->c:Lga4;

    iput-object p3, p0, Lui3;->e:Lda4;

    iput-object p4, p0, Lui3;->d:Lba4;

    iput-object p5, p0, Lui3;->f:Lga4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lui3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lui3;->b:Lda4;

    .line 7
    .line 8
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lfr1;

    .line 12
    .line 13
    iget-object v0, p0, Lui3;->c:Lga4;

    .line 14
    .line 15
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v3, v0

    .line 20
    check-cast v3, Lgi3;

    .line 21
    .line 22
    iget-object v0, p0, Lui3;->d:Lba4;

    .line 23
    .line 24
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Landroid/util/DisplayMetrics;

    .line 30
    .line 31
    iget-object v0, p0, Lui3;->e:Lda4;

    .line 32
    .line 33
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v5, v0

    .line 36
    check-cast v5, Landroid/view/View;

    .line 37
    .line 38
    iget-object v0, p0, Lui3;->f:Lga4;

    .line 39
    .line 40
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v6, v0

    .line 45
    check-cast v6, Lgk3;

    .line 46
    .line 47
    new-instance v1, Lii3;

    .line 48
    .line 49
    invoke-direct/range {v1 .. v6}, Lii3;-><init>(Lfr1;Lgi3;Landroid/util/DisplayMetrics;Landroid/view/View;Lgk3;)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_0
    iget-object v0, p0, Lui3;->b:Lda4;

    .line 54
    .line 55
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v2, v0

    .line 58
    check-cast v2, Lfr1;

    .line 59
    .line 60
    iget-object v0, p0, Lui3;->c:Lga4;

    .line 61
    .line 62
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v3, v0

    .line 67
    check-cast v3, Lgi3;

    .line 68
    .line 69
    iget-object v0, p0, Lui3;->e:Lda4;

    .line 70
    .line 71
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v4, v0

    .line 74
    check-cast v4, Ljava/util/Map;

    .line 75
    .line 76
    iget-object v0, p0, Lui3;->d:Lba4;

    .line 77
    .line 78
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v5, v0

    .line 83
    check-cast v5, Landroid/util/DisplayMetrics;

    .line 84
    .line 85
    iget-object v0, p0, Lui3;->f:Lga4;

    .line 86
    .line 87
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v6, v0

    .line 92
    check-cast v6, Lgk3;

    .line 93
    .line 94
    new-instance v1, Lri3;

    .line 95
    .line 96
    invoke-direct/range {v1 .. v6}, Lri3;-><init>(Lfr1;Lgi3;Ljava/util/Map;Landroid/util/DisplayMetrics;Lgk3;)V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
