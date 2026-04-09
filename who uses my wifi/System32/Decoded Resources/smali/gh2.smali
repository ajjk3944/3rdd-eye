.class public final Lgh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Leh2;


# direct methods
.method public synthetic constructor <init>(Leh2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgh2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lgh2;->b:Leh2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lgh2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgh2;->b:Leh2;

    .line 7
    .line 8
    iget-wide v0, v0, Leh2;->c:J

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    sget-object v0, Lhg4;->C:Lhg4;

    .line 16
    .line 17
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 18
    .line 19
    iget-object v1, p0, Lgh2;->b:Leh2;

    .line 20
    .line 21
    iget-object v2, v1, Leh2;->a:Le51;

    .line 22
    .line 23
    iget-object v1, v1, Leh2;->b:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v2, v2, Le51;->f:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_1
    new-instance v0, Lgb4;

    .line 36
    .line 37
    iget-object v1, p0, Lgh2;->b:Leh2;

    .line 38
    .line 39
    iget-object v2, v1, Leh2;->b:Landroid/content/Context;

    .line 40
    .line 41
    iget-object v1, v1, Leh2;->a:Le51;

    .line 42
    .line 43
    invoke-direct {v0, v2, v1}, Lgb4;-><init>(Landroid/content/Context;Le51;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_2
    new-instance v0, Lnc3;

    .line 48
    .line 49
    iget-object v1, p0, Lgh2;->b:Leh2;

    .line 50
    .line 51
    iget-object v1, v1, Leh2;->b:Landroid/content/Context;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v0, v1, v2}, Lnc3;-><init>(Landroid/content/Context;Z)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_3
    iget-object v0, p0, Lgh2;->b:Leh2;

    .line 59
    .line 60
    iget-object v0, v0, Leh2;->d:Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_4
    iget-object v0, p0, Lgh2;->b:Leh2;

    .line 67
    .line 68
    iget-object v0, v0, Leh2;->b:Landroid/content/Context;

    .line 69
    .line 70
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_5
    new-instance v0, Ldh2;

    .line 75
    .line 76
    iget-object v1, p0, Lgh2;->b:Leh2;

    .line 77
    .line 78
    iget-object v2, v1, Leh2;->b:Landroid/content/Context;

    .line 79
    .line 80
    iget-object v1, v1, Leh2;->a:Le51;

    .line 81
    .line 82
    invoke-direct {v0, v2, v1}, Ldh2;-><init>(Landroid/content/Context;Le51;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
