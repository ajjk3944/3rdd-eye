.class public final synthetic Lqv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lpv2;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpv2;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqv2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lqv2;->g:Lpv2;

    .line 4
    .line 5
    iput-object p2, p0, Lqv2;->h:Ljava/lang/String;

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
    .locals 3

    .line 1
    iget v0, p0, Lqv2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqv2;->g:Lpv2;

    .line 7
    .line 8
    iget-object v0, v0, Lpv2;->d:Lug4;

    .line 9
    .line 10
    iget-object v1, p0, Lqv2;->h:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Lqv2;->g:Lpv2;

    .line 18
    .line 19
    iget-object v0, v0, Lpv2;->d:Lug4;

    .line 20
    .line 21
    iget-object v1, p0, Lqv2;->h:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, v1, v2}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
