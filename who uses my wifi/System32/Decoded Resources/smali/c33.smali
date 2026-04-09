.class public final Lc33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final synthetic a:I

.field public final b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lc33;->a:I

    .line 2
    .line 3
    iput-boolean p2, p0, Lc33;->b:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lc33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljm2;

    .line 7
    .line 8
    iget-boolean v0, p0, Lc33;->b:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v0, "sdk_prefetch"

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    check-cast p1, Ljm2;

    .line 22
    .line 23
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 24
    .line 25
    const-string v0, "ibrr"

    .line 26
    .line 27
    iget-boolean v1, p0, Lc33;->b:Z

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    check-cast p1, Ljm2;

    .line 34
    .line 35
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iget-boolean v1, p0, Lc33;->b:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    const-string v0, "0"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-string v0, "1"

    .line 46
    .line 47
    :goto_0
    const-string v1, "adid_p"

    .line 48
    .line 49
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
