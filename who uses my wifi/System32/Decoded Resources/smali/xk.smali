.class public final Lxk;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lhh2;

.field public final c:Lph2;


# direct methods
.method public synthetic constructor <init>(Lhh2;Lph2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxk;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lxk;->b:Lhh2;

    .line 4
    .line 5
    iput-object p2, p0, Lxk;->c:Lph2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lxk;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lxk;->c:Lph2;

    .line 4
    .line 5
    iget-object v2, p0, Lxk;->b:Lhh2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lmz1;->a:Liz1;

    .line 15
    .line 16
    sget-object v2, Ltw1;->e:Ltw1;

    .line 17
    .line 18
    iget-object v2, v2, Ltw1;->a:Lxb4;

    .line 19
    .line 20
    invoke-virtual {v2}, Lxb4;->H()Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1}, Lph2;->a()Le51;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v3, Lk63;

    .line 29
    .line 30
    invoke-direct {v3, v0, v2, v1}, Lk63;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Le51;)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :pswitch_0
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1}, Lph2;->a()Le51;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v2, Lmd2;->a:Lld2;

    .line 43
    .line 44
    invoke-static {v2}, Li41;->M(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lgx2;

    .line 48
    .line 49
    invoke-direct {v3, v0, v1, v2}, Lgx2;-><init>(Landroid/content/Context;Le51;Lld2;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :pswitch_1
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v1}, Lph2;->a()Le51;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v2, Lax2;

    .line 62
    .line 63
    invoke-direct {v2, v0, v1}, Lax2;-><init>(Landroid/content/Context;Le51;)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :pswitch_2
    invoke-virtual {v2}, Lhh2;->d()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v1}, Lph2;->d()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Le51;

    .line 78
    .line 79
    new-instance v2, Lt83;

    .line 80
    .line 81
    invoke-direct {v2, v0, v1}, Lt83;-><init>(Landroid/content/Context;Le51;)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
