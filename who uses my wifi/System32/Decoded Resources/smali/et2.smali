.class public final synthetic Let2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqp3;


# direct methods
.method public synthetic constructor <init>(Lqp3;I)V
    .locals 0

    .line 1
    iput p2, p0, Let2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Let2;->b:Lqp3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 2

    .line 1
    iget v0, p0, Let2;->a:I

    .line 2
    .line 3
    check-cast p1, Lag2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lag2;->f()Lqg2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Let2;->b:Lqp3;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Lr13;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    const-string v1, "Retrieve video view in html5 ad response failed."

    .line 23
    .line 24
    invoke-direct {p1, v1, v0}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :pswitch_0
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Let2;->b:Lqp3;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    new-instance p1, Lr13;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    const-string v1, "Retrieve Web View from image ad response failed."

    .line 37
    .line 38
    invoke-direct {p1, v1, v0}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
