.class public final synthetic Lo52;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lq52;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lq52;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lo52;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lo52;->g:Lq52;

    .line 4
    .line 5
    iput-object p2, p0, Lo52;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    .line 1
    iget v0, p0, Lo52;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo52;->h:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Lo52;->g:Lq52;

    .line 9
    .line 10
    iget-object v1, v1, Lq52;->f:Lag2;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Lr52;->l(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lo52;->h:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, p0, Lo52;->g:Lq52;

    .line 19
    .line 20
    iget-object v1, v1, Lq52;->f:Lag2;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Lag2;->loadUrl(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    const-string v0, "UTF-8"

    .line 27
    .line 28
    iget-object v1, p0, Lo52;->g:Lq52;

    .line 29
    .line 30
    iget-object v1, v1, Lq52;->f:Lag2;

    .line 31
    .line 32
    iget-object v2, p0, Lo52;->h:Ljava/lang/String;

    .line 33
    .line 34
    const-string v3, "text/html"

    .line 35
    .line 36
    invoke-interface {v1, v2, v3, v0}, Lag2;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    const-string v0, "UTF-8"

    .line 41
    .line 42
    iget-object v1, p0, Lo52;->g:Lq52;

    .line 43
    .line 44
    iget-object v1, v1, Lq52;->f:Lag2;

    .line 45
    .line 46
    iget-object v2, p0, Lo52;->h:Ljava/lang/String;

    .line 47
    .line 48
    const-string v3, "text/html"

    .line 49
    .line 50
    invoke-interface {v1, v2, v3, v0}, Lag2;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
