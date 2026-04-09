.class public final synthetic Lwk0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldy;


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwk0;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwk0;->f:I

    .line 2
    .line 3
    const-string v1, "msg"

    .line 4
    .line 5
    sget-object v2, Lz31;->a:Lz31;

    .line 6
    .line 7
    const-string v3, "it"

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lhr0;

    .line 13
    .line 14
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->H:I

    .line 15
    .line 16
    invoke-static {p1, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :pswitch_0
    check-cast p1, Lol0;

    .line 21
    .line 22
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 23
    .line 24
    invoke-static {p1, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Lol0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p1, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :pswitch_1
    check-cast p1, Lzk0;

    .line 34
    .line 35
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 36
    .line 37
    invoke-static {p1, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p1, Lzk0;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
