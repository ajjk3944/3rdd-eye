.class public abstract Lft0;
.super Lht;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public h:Lpk;


# virtual methods
.method public final k(Lhk;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lft0;->h:Lpk;

    .line 2
    .line 3
    sget-object v0, Lpk;->m:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 4
    .line 5
    sget-object v0, Lo01;->g:Lh80;

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Lpk;->c(Ljava/lang/Runnable;Lh80;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
