.class public abstract Lk02;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lso1;

.field public static final b:Lso1;

.field public static final c:Lso1;

.field public static final d:Lso1;

.field public static final e:Lso1;

.field public static final f:Lso1;

.field public static final g:Lso1;

.field public static final h:Lso1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "gads:app_permissions_caching_expiry_ms:expiry"

    .line 2
    .line 3
    const-wide/32 v1, 0xea60

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1, v2}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lk02;->a:Lso1;

    .line 11
    .line 12
    const-string v0, "gads:audio_caching_expiry_ms:expiry"

    .line 13
    .line 14
    const-wide/16 v1, 0x1388

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lk02;->b:Lso1;

    .line 21
    .line 22
    const-string v0, "gads:battery_caching_expiry_ms:expiry"

    .line 23
    .line 24
    const-wide/16 v3, 0x2710

    .line 25
    .line 26
    invoke-static {v0, v3, v4}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lk02;->c:Lso1;

    .line 31
    .line 32
    const-string v0, "gads:device_info_caching_expiry_ms:expiry"

    .line 33
    .line 34
    const-wide/32 v3, 0x493e0

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v3, v4}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lk02;->d:Lso1;

    .line 42
    .line 43
    const-string v0, "gads:hsdp_caching_expiry_ms:expiry"

    .line 44
    .line 45
    const-wide/32 v3, 0x927c0

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v3, v4}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lk02;->e:Lso1;

    .line 53
    .line 54
    const-string v0, "gads:memory_caching_expiry_ms:expiry"

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Lk02;->f:Lso1;

    .line 61
    .line 62
    const-string v0, "gads:sdk_environment_caching_expiry_ms:expiry"

    .line 63
    .line 64
    invoke-static {v0, v3, v4}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lk02;->g:Lso1;

    .line 69
    .line 70
    const-string v0, "gads:telephony_caching_expiry_ms:expiry"

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Lk02;->h:Lso1;

    .line 77
    .line 78
    return-void
.end method
