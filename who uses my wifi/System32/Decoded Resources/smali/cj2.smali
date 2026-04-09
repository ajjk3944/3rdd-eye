.class public final Lcj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Len2;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcj2;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lcj2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final h(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget p1, p0, Lcj2;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcj2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lag2;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lag2;->destroy()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    :try_start_0
    iget-object p1, p0, Lcj2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lu83;
    :try_end_0
    .catch Ln83; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    :try_start_1
    iget-object p1, p1, Lu83;->a:Lw62;

    .line 21
    .line 22
    invoke-interface {p1}, Lw62;->j()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_2
    new-instance v0, Ln83;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw v0
    :try_end_2
    .catch Ln83; {:try_start_2 .. :try_end_2} :catch_0

    .line 33
    :catch_0
    const/4 p1, 0x5

    .line 34
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget p1, p0, Lcj2;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcj2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lag2;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lag2;->onPause()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    :try_start_0
    iget-object p1, p0, Lcj2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lu83;
    :try_end_0
    .catch Ln83; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    :try_start_1
    iget-object p1, p1, Lu83;->a:Lw62;

    .line 21
    .line 22
    invoke-interface {p1}, Lw62;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_2
    new-instance v0, Ln83;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw v0
    :try_end_2
    .catch Ln83; {:try_start_2 .. :try_end_2} :catch_0

    .line 33
    :catch_0
    const/4 p1, 0x5

    .line 34
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget v0, p0, Lcj2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcj2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lag2;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lag2;->onResume()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcj2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lu83;
    :try_end_0
    .catch Ln83; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    :try_start_1
    iget-object v0, v0, Lu83;->a:Lw62;

    .line 21
    .line 22
    invoke-interface {v0}, Lw62;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    :try_start_2
    new-instance v1, Loi0;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lw62;->l0(Lu10;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    :try_start_3
    new-instance v0, Ln83;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :catchall_1
    move-exception p1

    .line 44
    new-instance v0, Ln83;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v0
    :try_end_3
    .catch Ln83; {:try_start_3 .. :try_end_3} :catch_0

    .line 50
    :catch_0
    const/4 p1, 0x5

    .line 51
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
