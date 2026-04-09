.class public final Lg23;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lf23;


# direct methods
.method public synthetic constructor <init>(Lf23;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg23;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lg23;->b:Lf23;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lg23;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg23;->b:Lf23;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lg23;->b:Lf23;

    .line 10
    .line 11
    iget-object v0, v0, Lf23;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lvz1;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
