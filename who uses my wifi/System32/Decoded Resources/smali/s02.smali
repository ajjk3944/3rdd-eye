.class public abstract Ls02;
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

.field public static final i:Lso1;

.field public static final j:Lso1;

.field public static final k:Lso1;

.field public static final l:Lso1;

.field public static final m:Lso1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "gads:disable_adapter_flag_shared_pref_listener_v2:enabled"

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
    sput-object v0, Ls02;->a:Lso1;

    .line 9
    .line 10
    const-string v0, "gads:disable_flag_shared_pref_listener_v2:enabled"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Ls02;->b:Lso1;

    .line 17
    .line 18
    const-string v0, "gads:enable_adapter_flags:enabled"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Ls02;->c:Lso1;

    .line 25
    .line 26
    const-string v0, "gads:include_package_name_v2:enabled"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Ls02;->d:Lso1;

    .line 33
    .line 34
    const-string v0, "gads:js_flags:mf"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Ls02;->e:Lso1;

    .line 41
    .line 42
    const-string v0, "gads:js_flags:update_interval"

    .line 43
    .line 44
    const-wide/32 v2, 0xdbba00

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v2, v3}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Ls02;->f:Lso1;

    .line 52
    .line 53
    const-string v0, "gads:persist_js_flag:ars"

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-static {v0, v2}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Ls02;->g:Lso1;

    .line 61
    .line 62
    const-string v0, "gads:persist_js_flag:scar"

    .line 63
    .line 64
    invoke-static {v0, v2}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Ls02;->h:Lso1;

    .line 69
    .line 70
    const-string v0, "gads:read_local_flags_v2:enabled"

    .line 71
    .line 72
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Ls02;->i:Lso1;

    .line 77
    .line 78
    const-string v0, "gads:read_local_flags_cld_v2:enabled"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sput-object v0, Ls02;->j:Lso1;

    .line 85
    .line 86
    const-string v0, "gads:write_local_flags_cld_v2:enabled"

    .line 87
    .line 88
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sput-object v0, Ls02;->k:Lso1;

    .line 93
    .line 94
    const-string v0, "gads:write_local_flags_client_v2:enabled"

    .line 95
    .line 96
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Ls02;->l:Lso1;

    .line 101
    .line 102
    const-string v0, "gads:write_local_flags_service_v2:enabled"

    .line 103
    .line 104
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sput-object v0, Ls02;->m:Lso1;

    .line 109
    .line 110
    return-void
.end method
