.class public final Lk03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lqq2;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lc03;

.field public final synthetic h:La83;


# direct methods
.method public synthetic constructor <init>(Lf03;Lc03;La83;I)V
    .locals 0

    .line 1
    iput p4, p0, Lk03;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lk03;->g:Lc03;

    .line 4
    .line 5
    iput-object p3, p0, Lk03;->h:La83;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()La83;
    .locals 1

    .line 1
    iget v0, p0, Lk03;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk03;->h:La83;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lk03;->h:La83;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(ZLandroid/content/Context;Lan2;)V
    .locals 0

    .line 1
    iget p3, p0, Lk03;->f:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p2, p0, Lk03;->g:Lc03;

    .line 7
    .line 8
    iget-object p2, p2, Lc03;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Lu83;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Lu83;->b(Z)V
    :try_end_0
    .catch Ln83; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    iget-object p1, p2, Lu83;->a:Lw62;

    .line 16
    .line 17
    invoke-interface {p1}, Lw62;->S()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_2
    new-instance p2, Ln83;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p2
    :try_end_2
    .catch Ln83; {:try_start_2 .. :try_end_2} :catch_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    const/4 p2, 0x5

    .line 30
    invoke-static {p2}, Lgi2;->q0(I)Z

    .line 31
    .line 32
    .line 33
    new-instance p2, Lpq2;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw p2

    .line 43
    :pswitch_0
    :try_start_3
    iget-object p3, p0, Lk03;->g:Lc03;

    .line 44
    .line 45
    iget-object p3, p3, Lc03;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p3, Lu83;

    .line 48
    .line 49
    invoke-virtual {p3, p1}, Lu83;->b(Z)V
    :try_end_3
    .catch Ln83; {:try_start_3 .. :try_end_3} :catch_1

    .line 50
    .line 51
    .line 52
    :try_start_4
    iget-object p1, p3, Lu83;->a:Lw62;

    .line 53
    .line 54
    new-instance p3, Loi0;

    .line 55
    .line 56
    invoke-direct {p3, p2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p3}, Lw62;->e3(Lu10;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    :try_start_5
    new-instance p2, Ln83;

    .line 65
    .line 66
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw p2
    :try_end_5
    .catch Ln83; {:try_start_5 .. :try_end_5} :catch_1

    .line 70
    :catch_1
    move-exception p1

    .line 71
    new-instance p2, Lpq2;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    throw p2

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
