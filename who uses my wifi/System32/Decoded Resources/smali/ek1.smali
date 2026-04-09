.class public final synthetic Lek1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcr1;


# direct methods
.method public synthetic constructor <init>(Lcr1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lek1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lek1;->b:Lcr1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic c(Ljava/lang/Object;)Ln70;
    .locals 4

    .line 1
    iget v0, p0, Lek1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/net/Uri;

    .line 7
    .line 8
    const-string v0, "google.afma.nativeAds.getPublisherCustomRenderedClickSignals"

    .line 9
    .line 10
    iget-object v1, p0, Lek1;->b:Lcr1;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcr1;->H3(Ljava/lang/String;)Lgq3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v2, Lvn1;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v3, p1}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, v1, Lcr1;->l:Lpq3;

    .line 23
    .line 24
    invoke-static {v0, v2, p1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_0
    check-cast p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    const-string v0, "google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"

    .line 32
    .line 33
    iget-object v1, p0, Lek1;->b:Lcr1;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lcr1;->H3(Ljava/lang/String;)Lgq3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, Ldn1;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, v1, p1, v3}, Ldn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v1, Lcr1;->l:Lpq3;

    .line 46
    .line 47
    invoke-static {v0, v2, p1}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
