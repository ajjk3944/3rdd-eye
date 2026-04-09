.class public final Lq92;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public final synthetic c:Lr92;


# direct methods
.method public synthetic constructor <init>(Lr92;Ljava/lang/Thread$UncaughtExceptionHandler;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq92;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lq92;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 4
    .line 5
    iput-object p1, p0, Lq92;->c:Lr92;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget v0, p0, Lq92;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq92;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Lq92;->c:Lr92;

    .line 9
    .line 10
    invoke-virtual {v1, p2}, Lr92;->f(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    :try_start_1
    const-string v1, "AdMob exception reporter failed reporting the exception."

    .line 15
    .line 16
    invoke-static {v1}, Lgi2;->Z(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    .line 18
    .line 19
    :goto_0
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :catchall_1
    move-exception v1

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    throw v1

    .line 33
    :pswitch_0
    iget-object v0, p0, Lq92;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 34
    .line 35
    :try_start_2
    iget-object v1, p0, Lq92;->c:Lr92;

    .line 36
    .line 37
    invoke-virtual {v1, p2}, Lr92;->f(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :catchall_2
    :try_start_3
    const-string v1, "AdMob exception reporter failed reporting the exception."

    .line 42
    .line 43
    invoke-static {v1}, Lgi2;->Z(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 44
    .line 45
    .line 46
    :goto_2
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void

    .line 52
    :catchall_3
    move-exception v1

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_3
    throw v1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
