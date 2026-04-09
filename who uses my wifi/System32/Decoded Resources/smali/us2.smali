.class public final Lus2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lt83;


# direct methods
.method public synthetic constructor <init>(Lt83;I)V
    .locals 0

    .line 1
    iput p2, p0, Lus2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lus2;->b:Lt83;

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
    iget v0, p0, Lus2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lus2;->b:Lt83;

    .line 7
    .line 8
    iget-object v0, v0, Lt83;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Le72;

    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lus2;->b:Lt83;

    .line 14
    .line 15
    iget-object v0, v0, Lt83;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lc72;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_1
    iget-object v0, p0, Lus2;->b:Lt83;

    .line 21
    .line 22
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lb72;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
