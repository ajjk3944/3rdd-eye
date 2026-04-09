.class public final synthetic Lu52;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lq52;


# direct methods
.method public synthetic constructor <init>(Lq52;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu52;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu52;->g:Lq52;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lu52;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "/result"

    .line 7
    .line 8
    sget-object v1, Lx32;->j:Lv32;

    .line 9
    .line 10
    iget-object v2, p0, Lu52;->g:Lq52;

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Lq52;->h(Ljava/lang/String;Ly32;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v2, Lq52;->f:Lag2;

    .line 16
    .line 17
    invoke-interface {v0}, Lag2;->destroy()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Lu52;->g:Lq52;

    .line 22
    .line 23
    iget-object v0, v0, Lq52;->f:Lag2;

    .line 24
    .line 25
    invoke-interface {v0}, Lag2;->destroy()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    iget-object v0, p0, Lu52;->g:Lq52;

    .line 30
    .line 31
    iget-object v0, v0, Lq52;->f:Lag2;

    .line 32
    .line 33
    invoke-interface {v0}, Lag2;->destroy()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
