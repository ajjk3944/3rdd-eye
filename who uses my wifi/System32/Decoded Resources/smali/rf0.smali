.class public final Lrf0;
.super Le50;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldy;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ltf0;


# direct methods
.method public synthetic constructor <init>(Ltf0;Lsf0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lrf0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lrf0;->h:Ltf0;

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
    iget v0, p0, Lrf0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    sget-object p1, Ltf0;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iget-object v1, p0, Lrf0;->h:Ltf0;

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ltf0;->d()V

    .line 17
    .line 18
    .line 19
    sget-object p1, Lz31;->a:Lz31;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 23
    .line 24
    iget-object p1, p0, Lrf0;->h:Ltf0;

    .line 25
    .line 26
    invoke-virtual {p1}, Ltf0;->d()V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lz31;->a:Lz31;

    .line 30
    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
