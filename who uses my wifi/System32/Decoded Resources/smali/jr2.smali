.class public final Ljr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lu12;


# direct methods
.method public synthetic constructor <init>(Lu12;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljr2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ljr2;->b:Lu12;

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
    .locals 2

    .line 1
    iget v0, p0, Ljr2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljr2;->b:Lu12;

    .line 7
    .line 8
    invoke-virtual {v0}, Lu12;->a()Ltr2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lgu2;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lgu2;-><init>(Ltr2;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    iget-object v0, p0, Ljr2;->b:Lu12;

    .line 19
    .line 20
    invoke-virtual {v0}, Lu12;->a()Ltr2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lir2;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lir2;-><init>(Ltr2;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
