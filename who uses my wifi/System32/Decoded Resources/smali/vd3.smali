.class public final Lvd3;
.super Ldc2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final y:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lt9;Lu9;I)V
    .locals 6

    .line 1
    const/16 v3, 0x74

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Ldc2;-><init>(Landroid/content/Context;Landroid/os/Looper;ILt9;Lu9;)V

    .line 9
    .line 10
    .line 11
    iput p5, v0, Lvd3;->y:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lvd3;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final o(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    const-string v0, "com.google.android.gms.gass.internal.IGassService"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Lyd3;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    check-cast v1, Lyd3;

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_1
    new-instance v1, Lyd3;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v1, p1, v0, v2}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.gass.internal.IGassService"

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.gass.START"

    .line 2
    .line 3
    return-object v0
.end method
