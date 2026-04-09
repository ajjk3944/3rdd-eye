.class public final synthetic La12;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Llz;


# direct methods
.method public synthetic constructor <init>(Llz;I)V
    .locals 0

    .line 1
    iput p2, p0, La12;->f:I

    .line 2
    .line 3
    iput-object p1, p0, La12;->g:Llz;

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
    iget v0, p0, La12;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lah3;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    const-string v2, "Privacy options form is being loading. Please try again later."

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lah3;->a()Lbw;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, La12;->g:Llz;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Llz;->a(Lbw;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    new-instance v0, Lah3;

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    const-string v2, "Privacy options form is not required."

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lah3;->a()Lbw;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, La12;->g:Llz;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Llz;->a(Lbw;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    new-instance v0, Lah3;

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    const-string v2, "No valid response received yet."

    .line 46
    .line 47
    invoke-direct {v0, v2, v1}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lah3;->a()Lbw;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, La12;->g:Llz;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Llz;->a(Lbw;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    new-instance v0, Lah3;

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    const-string v2, "No consentInformation."

    .line 64
    .line 65
    invoke-direct {v0, v2, v1}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lah3;->a()Lbw;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, La12;->g:Llz;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Llz;->a(Lbw;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
