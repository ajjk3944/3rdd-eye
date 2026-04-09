.class public final Lwf3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lga4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lwf3;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lwf3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic d()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwf3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwf3;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp21;

    .line 9
    .line 10
    new-instance v1, Lh2;

    .line 11
    .line 12
    iget-object v2, v0, Lp21;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lep2;

    .line 15
    .line 16
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lp21;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, v1, Lh2;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, v1, Lh2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v1

    .line 28
    :pswitch_0
    iget-object v0, p0, Lwf3;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lep2;

    .line 31
    .line 32
    new-instance v1, Lyf3;

    .line 33
    .line 34
    iget-object v0, v0, Lep2;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lep2;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lyf3;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_1
    iget-object v0, p0, Lwf3;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lep2;

    .line 45
    .line 46
    new-instance v1, Lsq0;

    .line 47
    .line 48
    iget-object v0, v0, Lep2;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lep2;

    .line 51
    .line 52
    const/16 v2, 0x14

    .line 53
    .line 54
    invoke-direct {v1, v2, v0}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_2
    iget-object v0, p0, Lwf3;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lep2;

    .line 61
    .line 62
    new-instance v1, Lf20;

    .line 63
    .line 64
    iget-object v0, v0, Lep2;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lep2;

    .line 67
    .line 68
    const/16 v2, 0x1c

    .line 69
    .line 70
    invoke-direct {v1, v2, v0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
