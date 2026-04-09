.class public final synthetic Lg03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lag2;


# direct methods
.method public synthetic constructor <init>(Lag2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg03;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lg03;->g:Lag2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic D0()V
    .locals 2

    .line 1
    iget v0, p0, Lg03;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg03;->g:Lag2;

    .line 7
    .line 8
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lsg2;->U()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lg03;->g:Lag2;

    .line 23
    .line 24
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lsg2;->U()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :pswitch_1
    iget-object v0, p0, Lg03;->g:Lag2;

    .line 39
    .line 40
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lsg2;->U()V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void

    .line 54
    :pswitch_2
    iget-object v0, p0, Lg03;->g:Lag2;

    .line 55
    .line 56
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lsg2;->U()V

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
