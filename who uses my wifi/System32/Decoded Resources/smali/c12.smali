.class public abstract Lc12;
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


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "gads:adapter_initialization:red_button"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lc12;->a:Lso1;

    .line 9
    .line 10
    const-string v0, "gads:adapter_settings:red_button"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lc12;->b:Lso1;

    .line 17
    .line 18
    const-string v0, "gads:banner_refresh_sequential_caching:red_button"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lc12;->c:Lso1;

    .line 25
    .line 26
    const-string v0, "gads:adaptive_banner:fail_invalid_ad_size"

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-static {v0, v2}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lc12;->d:Lso1;

    .line 34
    .line 35
    const-string v0, "gads:signal_adapters:red_button"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lc12;->e:Lso1;

    .line 42
    .line 43
    const-string v0, "gads:use_non_templated_client_sdkcore:enabled"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lc12;->f:Lso1;

    .line 50
    .line 51
    const-string v0, "gads:use_non_templated_mediation_client_sdkcore:enabled"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lc12;->g:Lso1;

    .line 58
    .line 59
    return-void
.end method
