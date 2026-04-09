.class public final Lot1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/app/AppOpsManager$OnOpActiveChangedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lot1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lot1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onOpActiveChanged(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 4

    .line 1
    iget p1, p0, Lot1;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lot1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lek3;

    .line 9
    .line 10
    monitor-enter p1

    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    iput-wide p2, p1, Lek3;->c:J

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p1, Lek3;->f:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide p2

    .line 29
    iget-wide v0, p1, Lek3;->d:J

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    cmp-long p4, v0, v2

    .line 34
    .line 35
    if-lez p4, :cond_1

    .line 36
    .line 37
    cmp-long p4, p2, v0

    .line 38
    .line 39
    if-ltz p4, :cond_1

    .line 40
    .line 41
    sub-long/2addr p2, v0

    .line 42
    iput-wide p2, p1, Lek3;->e:J

    .line 43
    .line 44
    :cond_1
    const/4 p2, 0x0

    .line 45
    iput-boolean p2, p1, Lek3;->f:Z

    .line 46
    .line 47
    :goto_0
    monitor-exit p1

    .line 48
    return-void

    .line 49
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw p2

    .line 51
    :pswitch_0
    if-eqz p4, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lot1;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lpt1;

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    iput-wide p2, p1, Lpt1;->a:J

    .line 62
    .line 63
    const/4 p2, 0x1

    .line 64
    iput-boolean p2, p1, Lpt1;->d:Z

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget-object p1, p0, Lot1;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lpt1;

    .line 70
    .line 71
    iget-wide p2, p1, Lpt1;->b:J

    .line 72
    .line 73
    const-wide/16 v0, 0x0

    .line 74
    .line 75
    cmp-long p2, p2, v0

    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide p3

    .line 81
    if-lez p2, :cond_3

    .line 82
    .line 83
    iget-wide v0, p1, Lpt1;->b:J

    .line 84
    .line 85
    cmp-long p2, p3, v0

    .line 86
    .line 87
    if-ltz p2, :cond_3

    .line 88
    .line 89
    sub-long/2addr p3, v0

    .line 90
    iput-wide p3, p1, Lpt1;->c:J

    .line 91
    .line 92
    :cond_3
    const/4 p2, 0x0

    .line 93
    iput-boolean p2, p1, Lpt1;->d:Z

    .line 94
    .line 95
    :goto_2
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
