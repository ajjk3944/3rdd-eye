.class public final synthetic Lmj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lnj2;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lnj2;III)V
    .locals 0

    .line 1
    iput p4, p0, Lmj2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lmj2;->g:Lnj2;

    .line 4
    .line 5
    iput p2, p0, Lmj2;->h:I

    .line 6
    .line 7
    iput p3, p0, Lmj2;->i:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 5

    .line 1
    iget v0, p0, Lmj2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lmj2;->h:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    iget-object v1, p0, Lmj2;->g:Lnj2;

    .line 11
    .line 12
    iget v2, p0, Lmj2;->i:I

    .line 13
    .line 14
    invoke-virtual {v1, v0, v2}, Lnj2;->h(II)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    new-instance v0, Lmj2;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget-object v2, p0, Lmj2;->g:Lnj2;

    .line 22
    .line 23
    iget v3, p0, Lmj2;->h:I

    .line 24
    .line 25
    iget v4, p0, Lmj2;->i:I

    .line 26
    .line 27
    invoke-direct {v0, v2, v3, v4, v1}, Lmj2;-><init>(Lnj2;III)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v2, Lnj2;->g:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
