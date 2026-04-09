.class public abstract Lg12;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lso1;

.field public static final b:Lso1;

.field public static final c:Lso1;

.field public static final d:Lso1;

.field public static final e:Lso1;

.field public static final f:Lso1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lso1;

    .line 2
    .line 3
    const-string v1, "gads:mediation_client_sdkcore_url"

    .line 4
    .line 5
    const-string v2, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html"

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lso1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lg12;->a:Lso1;

    .line 12
    .line 13
    new-instance v0, Lso1;

    .line 14
    .line 15
    const-string v1, "gads:mediation_service_sdkcore_url"

    .line 16
    .line 17
    const-string v2, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html"

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, Lso1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lg12;->b:Lso1;

    .line 23
    .line 24
    const-string v0, "gads:mediation_serving_domain:enabled"

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lg12;->c:Lso1;

    .line 32
    .line 33
    new-instance v0, Lso1;

    .line 34
    .line 35
    const-string v1, "gads:mediation_serving_domain:locale_list"

    .line 36
    .line 37
    const-string v4, ""

    .line 38
    .line 39
    invoke-direct {v0, v1, v4, v3}, Lso1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lg12;->d:Lso1;

    .line 43
    .line 44
    new-instance v0, Lso1;

    .line 45
    .line 46
    const-string v1, "gads:mediation_templated_client_sdkcore_url"

    .line 47
    .line 48
    const-string v4, "https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html"

    .line 49
    .line 50
    invoke-direct {v0, v1, v4, v3}, Lso1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lg12;->e:Lso1;

    .line 54
    .line 55
    new-instance v0, Lso1;

    .line 56
    .line 57
    const-string v1, "gads:sdk_core_location"

    .line 58
    .line 59
    invoke-direct {v0, v1, v2, v3}, Lso1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lg12;->f:Lso1;

    .line 63
    .line 64
    return-void
.end method
