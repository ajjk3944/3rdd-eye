.class public final synthetic Lzi0;
.super Lry;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrx;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Lzi0;->n:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lry;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lzi0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxc;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Laj0;

    .line 9
    .line 10
    invoke-virtual {v0}, Laj0;->e()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lz31;->a:Lz31;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lxc;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Laj0;

    .line 19
    .line 20
    invoke-virtual {v0}, Laj0;->e()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lz31;->a:Lz31;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
