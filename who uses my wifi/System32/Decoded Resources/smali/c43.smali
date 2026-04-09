.class public final Lc43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final a:D

.field public final b:Z


# direct methods
.method public constructor <init>(DZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lc43;->a:D

    .line 5
    .line 6
    iput-boolean p3, p0, Lc43;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ljm2;

    .line 2
    .line 3
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v0, "device"

    .line 6
    .line 7
    invoke-static {p1, v0}, Li30;->Y(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "battery"

    .line 15
    .line 16
    invoke-static {v1, p1}, Li30;->Y(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v1, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "is_charging"

    .line 24
    .line 25
    iget-boolean v1, p0, Lc43;->b:Z

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    const-string p1, "battery_level"

    .line 31
    .line 32
    iget-wide v1, p0, Lc43;->a:D

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
