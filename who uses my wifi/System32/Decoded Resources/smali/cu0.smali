.class public final Lcu0;
.super Le50;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldy;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcu0;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lcu0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Le50;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcu0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcu0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lyw0;

    .line 14
    .line 15
    iget-object v0, v0, Lyw0;->e:Lay0;

    .line 16
    .line 17
    new-instance v1, Lmu;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Lmu;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lay0;->F(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object p1, Lyw0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v0, p0, Lcu0;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lyw0;

    .line 30
    .line 31
    monitor-enter p1

    .line 32
    :try_start_0
    sget-object v1, Lyw0;->h:Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-virtual {v0}, Lyw0;->b()Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit p1

    .line 46
    sget-object p1, Lz31;->a:Lz31;

    .line 47
    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    monitor-exit p1

    .line 51
    throw v0

    .line 52
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 53
    .line 54
    iget-object p1, p0, Lcu0;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Leu0;

    .line 57
    .line 58
    invoke-virtual {p1}, Leu0;->b()V

    .line 59
    .line 60
    .line 61
    sget-object p1, Lz31;->a:Lz31;

    .line 62
    .line 63
    return-object p1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
