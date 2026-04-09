.class public final synthetic Lvi0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrx;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Laj0;


# direct methods
.method public synthetic constructor <init>(Laj0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvi0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lvi0;->g:Laj0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lvi0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvi0;->g:Laj0;

    .line 7
    .line 8
    invoke-virtual {v0}, Laj0;->c()V

    .line 9
    .line 10
    .line 11
    :goto_0
    sget-object v0, Lz31;->a:Lz31;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lvi0;->g:Laj0;

    .line 15
    .line 16
    invoke-virtual {v0}, Laj0;->b()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    iget-object v0, p0, Lvi0;->g:Laj0;

    .line 21
    .line 22
    invoke-virtual {v0}, Laj0;->c()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
