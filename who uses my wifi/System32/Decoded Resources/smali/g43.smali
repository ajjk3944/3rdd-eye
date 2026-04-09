.class public final Lg43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# static fields
.field public static c:Ljava/lang/String;


# instance fields
.field public final synthetic a:I

.field public final b:Lpq3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpq3;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Lg43;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg43;->b:Lpq3;

    return-void
.end method

.method public synthetic constructor <init>(Lpq3;I)V
    .locals 0

    .line 2
    iput p2, p0, Lg43;->a:I

    iput-object p1, p0, Lg43;->b:Lpq3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 2

    .line 1
    iget v0, p0, Lg43;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lgz1;->e:Lgz1;

    .line 7
    .line 8
    iget-object v1, p0, Lg43;->b:Lpq3;

    .line 9
    .line 10
    check-cast v1, Lld2;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lgz1;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, v1}, Lgz1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lg43;->b:Lpq3;

    .line 24
    .line 25
    check-cast v1, Lld2;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, Lgz1;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lgz1;-><init>(Lg43;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lg43;->b:Lpq3;

    .line 38
    .line 39
    check-cast v1, Lld2;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_2
    sget-object v0, Lgz1;->d:Lgz1;

    .line 47
    .line 48
    iget-object v1, p0, Lg43;->b:Lpq3;

    .line 49
    .line 50
    check-cast v1, Lld2;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :pswitch_3
    sget-object v0, Lgz1;->c:Lgz1;

    .line 58
    .line 59
    iget-object v1, p0, Lg43;->b:Lpq3;

    .line 60
    .line 61
    check-cast v1, Lld2;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :pswitch_4
    new-instance v0, Lgz1;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-direct {v0, v1}, Lgz1;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lg43;->b:Lpq3;

    .line 75
    .line 76
    check-cast v1, Lld2;

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lg43;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x33

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    const/16 v0, 0x2d

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    const/16 v0, 0x1b

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_2
    const/16 v0, 0x18

    .line 16
    .line 17
    return v0

    .line 18
    :pswitch_3
    const/16 v0, 0x14

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_4
    const/16 v0, 0x37

    .line 22
    .line 23
    return v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
