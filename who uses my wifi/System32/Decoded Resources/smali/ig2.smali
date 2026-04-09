.class public final synthetic Lig2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lag2;


# direct methods
.method public synthetic constructor <init>(Lag2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lig2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lig2;->g:Lag2;

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
    iget v0, p0, Lig2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lig2;->g:Lag2;

    .line 7
    .line 8
    invoke-interface {v0}, Lag2;->H0()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lig2;->g:Lag2;

    .line 13
    .line 14
    invoke-interface {v0}, Lag2;->destroy()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    new-instance v0, Ls8;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Lbw0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lig2;->g:Lag2;

    .line 25
    .line 26
    const-string v2, "onSdkImpression"

    .line 27
    .line 28
    invoke-interface {v1, v2, v0}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    iget-object v0, p0, Lig2;->g:Lag2;

    .line 33
    .line 34
    invoke-interface {v0}, Lag2;->destroy()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    iget-object v0, p0, Lig2;->g:Lag2;

    .line 39
    .line 40
    invoke-interface {v0}, Lag2;->onResume()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_4
    iget-object v0, p0, Lig2;->g:Lag2;

    .line 45
    .line 46
    invoke-interface {v0}, Lag2;->onPause()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_5
    iget-object v0, p0, Lig2;->g:Lag2;

    .line 51
    .line 52
    invoke-interface {v0}, Lag2;->destroy()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_6
    iget-object v0, p0, Lig2;->g:Lag2;

    .line 57
    .line 58
    invoke-interface {v0}, Lag2;->destroy()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
