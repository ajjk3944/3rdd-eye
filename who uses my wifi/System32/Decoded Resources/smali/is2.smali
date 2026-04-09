.class public final Lis2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lfr2;


# direct methods
.method public constructor <init>(Lba4;Lfr2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lis2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis2;->b:Lga4;

    iput-object p2, p0, Lis2;->c:Lfr2;

    return-void
.end method

.method public constructor <init>(Lfr2;Lba4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lis2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis2;->c:Lfr2;

    iput-object p2, p0, Lis2;->b:Lga4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lis2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lis2;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lpu2;

    .line 13
    .line 14
    iget-object v1, p0, Lis2;->c:Lfr2;

    .line 15
    .line 16
    iget-object v1, v1, Lfr2;->b:Lmc2;

    .line 17
    .line 18
    iget-object v1, v1, Lmc2;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lau2;

    .line 21
    .line 22
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lqs2;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lqs2;-><init>(Lpu2;Lau2;)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :pswitch_0
    iget-object v0, p0, Lis2;->c:Lfr2;

    .line 32
    .line 33
    iget-object v0, v0, Lfr2;->b:Lmc2;

    .line 34
    .line 35
    iget-object v0, v0, Lmc2;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lau2;

    .line 38
    .line 39
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lis2;->b:Lga4;

    .line 43
    .line 44
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lym;

    .line 49
    .line 50
    new-instance v2, Lhs2;

    .line 51
    .line 52
    invoke-direct {v2, v0, v1}, Lhs2;-><init>(Lau2;Lym;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
