.class public final Lnv;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcr1;Lad2;ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lnv;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnv;->b:Ljava/lang/Object;

    iput-object p2, p0, Lnv;->c:Ljava/lang/Object;

    iput p3, p0, Lnv;->e:I

    iput-object p4, p0, Lnv;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Lg4;II)V
    .locals 0

    .line 1
    iput p5, p0, Lnv;->a:I

    iput-object p1, p0, Lnv;->b:Ljava/lang/Object;

    iput-object p2, p0, Lnv;->c:Ljava/lang/Object;

    iput-object p3, p0, Lnv;->d:Ljava/lang/Object;

    iput p4, p0, Lnv;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lnv;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnv;->b:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lcr1;

    .line 10
    .line 11
    iget-object v0, p0, Lnv;->c:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v10, v0

    .line 14
    check-cast v10, Lad2;

    .line 15
    .line 16
    iget-object v0, p0, Lnv;->d:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v9, v0

    .line 19
    check-cast v9, Landroid/os/Bundle;

    .line 20
    .line 21
    iget-object v2, v1, Lcr1;->h:Landroid/content/Context;

    .line 22
    .line 23
    iget-object v3, v10, Lad2;->f:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v4, v10, Lad2;->g:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, v10, Lad2;->h:Lxe4;

    .line 28
    .line 29
    iget-object v6, v10, Lad2;->i:Lpc4;

    .line 30
    .line 31
    iget-object v8, v10, Lad2;->k:Ljava/lang/String;

    .line 32
    .line 33
    iget v7, p0, Lnv;->e:I

    .line 34
    .line 35
    invoke-virtual/range {v1 .. v10}, Lcr1;->G3(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lxe4;Lpc4;ILjava/lang/String;Landroid/os/Bundle;Lad2;)Lki2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lnv;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p0, Lnv;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroid/content/Context;

    .line 47
    .line 48
    iget-object v2, p0, Lnv;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lg4;

    .line 51
    .line 52
    iget v3, p0, Lnv;->e:I

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, Lqv;->a(Ljava/lang/String;Landroid/content/Context;Lg4;I)Lpv;

    .line 55
    .line 56
    .line 57
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    new-instance v0, Lpv;

    .line 60
    .line 61
    const/4 v1, -0x3

    .line 62
    invoke-direct {v0, v1}, Lpv;-><init>(I)V

    .line 63
    .line 64
    .line 65
    :goto_0
    return-object v0

    .line 66
    :pswitch_1
    iget-object v0, p0, Lnv;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, p0, Lnv;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Landroid/content/Context;

    .line 73
    .line 74
    iget-object v2, p0, Lnv;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lg4;

    .line 77
    .line 78
    iget v3, p0, Lnv;->e:I

    .line 79
    .line 80
    invoke-static {v0, v1, v2, v3}, Lqv;->a(Ljava/lang/String;Landroid/content/Context;Lg4;I)Lpv;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
