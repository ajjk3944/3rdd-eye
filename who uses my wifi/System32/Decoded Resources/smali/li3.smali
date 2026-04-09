.class public final Lli3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lda4;

.field public final c:Lga4;

.field public final d:Lda4;

.field public final e:Lga4;


# direct methods
.method public constructor <init>(Lda4;Lba4;Lda4;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lli3;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli3;->b:Lda4;

    iput-object p2, p0, Lli3;->c:Lga4;

    iput-object p3, p0, Lli3;->d:Lda4;

    iput-object p4, p0, Lli3;->e:Lga4;

    return-void
.end method

.method public constructor <init>(Lda4;Lda4;Lda4;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lli3;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli3;->b:Lda4;

    iput-object p2, p0, Lli3;->d:Lda4;

    iput-object p3, p0, Lli3;->c:Lga4;

    iput-object p4, p0, Lli3;->e:Lga4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lli3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lli3;->b:Lda4;

    .line 7
    .line 8
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lfr1;

    .line 11
    .line 12
    iget-object v1, p0, Lli3;->c:Lga4;

    .line 13
    .line 14
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lgi3;

    .line 19
    .line 20
    iget-object v2, p0, Lli3;->d:Lda4;

    .line 21
    .line 22
    iget-object v2, v2, Lda4;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Ljava/util/Map;

    .line 25
    .line 26
    iget-object v3, p0, Lli3;->e:Lga4;

    .line 27
    .line 28
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lgk3;

    .line 33
    .line 34
    new-instance v4, Lpi3;

    .line 35
    .line 36
    invoke-direct {v4, v0, v1, v2, v3}, Lpi3;-><init>(Lfr1;Lgi3;Ljava/util/Map;Lgk3;)V

    .line 37
    .line 38
    .line 39
    return-object v4

    .line 40
    :pswitch_0
    iget-object v0, p0, Lli3;->b:Lda4;

    .line 41
    .line 42
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lfr1;

    .line 45
    .line 46
    iget-object v1, p0, Lli3;->d:Lda4;

    .line 47
    .line 48
    iget-object v1, v1, Lda4;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/util/Map;

    .line 51
    .line 52
    iget-object v2, p0, Lli3;->c:Lga4;

    .line 53
    .line 54
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lvf3;

    .line 59
    .line 60
    iget-object v3, p0, Lli3;->e:Lga4;

    .line 61
    .line 62
    invoke-interface {v3}, Lga4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lgk3;

    .line 67
    .line 68
    new-instance v4, Lki3;

    .line 69
    .line 70
    invoke-direct {v4, v0, v1, v2, v3}, Lki3;-><init>(Lfr1;Ljava/util/Map;Lvf3;Lgk3;)V

    .line 71
    .line 72
    .line 73
    return-object v4

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
