.class public final synthetic Lg90;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lh90;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li90;


# direct methods
.method public synthetic constructor <init>(Li90;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg90;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lg90;->b:Li90;

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
    .locals 1

    .line 1
    iget v0, p0, Lg90;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg90;->b:Li90;

    .line 7
    .line 8
    invoke-virtual {v0}, Li90;->k()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lg90;->b:Li90;

    .line 13
    .line 14
    invoke-virtual {v0}, Li90;->m()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
