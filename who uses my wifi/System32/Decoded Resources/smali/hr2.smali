.class public final Lhr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lga4;

.field public final d:Lga4;

.field public final e:Lga4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lba4;Lba4;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lhr2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhr2;->b:Lba4;

    .line 4
    .line 5
    iput-object p2, p0, Lhr2;->c:Lga4;

    .line 6
    .line 7
    iput-object p3, p0, Lhr2;->d:Lga4;

    .line 8
    .line 9
    check-cast p4, Lga4;

    .line 10
    .line 11
    iput-object p4, p0, Lhr2;->e:Lga4;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lhr2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhr2;->b:Lba4;

    .line 7
    .line 8
    invoke-static {v0}, Lba4;->b(Lga4;)Lz94;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lhr2;->c:Lga4;

    .line 13
    .line 14
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lgk3;

    .line 19
    .line 20
    iget-object v2, p0, Lhr2;->d:Lga4;

    .line 21
    .line 22
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lrf3;

    .line 27
    .line 28
    iget-object v2, p0, Lhr2;->e:Lga4;

    .line 29
    .line 30
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lvf3;

    .line 35
    .line 36
    new-instance v3, Lvj3;

    .line 37
    .line 38
    invoke-virtual {v2}, Lvf3;->K()Lcg3;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lcg3;->B()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    invoke-direct {v3, v0, v1, v4, v5}, Lvj3;-><init>(Lz94;Lgk3;J)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :pswitch_0
    iget-object v0, p0, Lhr2;->b:Lba4;

    .line 51
    .line 52
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lmv1;

    .line 57
    .line 58
    iget-object v1, p0, Lhr2;->c:Lga4;

    .line 59
    .line 60
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 65
    .line 66
    iget-object v2, p0, Lhr2;->d:Lga4;

    .line 67
    .line 68
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Landroid/content/Context;

    .line 73
    .line 74
    iget-object v3, p0, Lhr2;->e:Lga4;

    .line 75
    .line 76
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lym;

    .line 81
    .line 82
    new-instance v4, Lzj2;

    .line 83
    .line 84
    new-instance v5, Lrj2;

    .line 85
    .line 86
    invoke-direct {v5, v2, v0}, Lrj2;-><init>(Landroid/content/Context;Lmv1;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v4, v1, v5, v3}, Lzj2;-><init>(Ljava/util/concurrent/Executor;Lrj2;Lym;)V

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
