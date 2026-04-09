.class public final Lwd4;
.super Lez;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lg8;


# static fields
.field public static final p:Lgw3;


# instance fields
.field public final n:Landroid/content/Context;

.field public final o:Lgz;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lpz;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lpz;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lqb1;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-direct {v1, v2}, Lqb1;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lgw3;

    .line 15
    .line 16
    const-string v3, "AppSet.API"

    .line 17
    .line 18
    invoke-direct {v2, v3, v1, v0}, Lgw3;-><init>(Ljava/lang/String;Lqb1;Lpz;)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Lwd4;->p:Lgw3;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lgz;)V
    .locals 3

    .line 1
    sget-object v0, Lu4;->a:Lt4;

    .line 2
    .line 3
    sget-object v1, Ldz;->b:Ldz;

    .line 4
    .line 5
    sget-object v2, Lwd4;->p:Lgw3;

    .line 6
    .line 7
    invoke-direct {p0, p1, v2, v0, v1}, Lez;-><init>(Landroid/content/Context;Lgw3;Lu4;Ldz;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lwd4;->n:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lwd4;->o:Lgz;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final h()Lgi4;
    .locals 5

    .line 1
    iget-object v0, p0, Lwd4;->n:Landroid/content/Context;

    .line 2
    .line 3
    const v1, 0xcaf1200

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lwd4;->o:Lgz;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Lgz;->c(Landroid/content/Context;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lsq0;

    .line 15
    .line 16
    const/4 v1, 0x7

    .line 17
    invoke-direct {v0, v1}, Lsq0;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Luk2;->l:Lju;

    .line 21
    .line 22
    filled-new-array {v1}, [Lju;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Ly24;

    .line 27
    .line 28
    const/16 v3, 0x12

    .line 29
    .line 30
    invoke-direct {v2, v3, p0}, Ly24;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, v0, Lsq0;->g:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v2, Lrb;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/16 v4, 0x6bd1

    .line 39
    .line 40
    invoke-direct {v2, v0, v1, v3, v4}, Lrb;-><init>(Lsq0;[Lju;ZI)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v3, v2}, Lez;->b(ILrb;)Lgi4;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_0
    new-instance v0, Ly4;

    .line 49
    .line 50
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 51
    .line 52
    const/16 v2, 0x11

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-direct {v1, v2, v3, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, Ly4;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lgi4;

    .line 62
    .line 63
    invoke-direct {v1}, Lgi4;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Lgi4;->d(Ljava/lang/Exception;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method
