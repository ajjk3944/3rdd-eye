.class public abstract Lm02;
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


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "gads:always_enable_crash_loop_counter_v2:enabled"

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
    sput-object v0, Lm02;->a:Lso1;

    .line 9
    .line 10
    const-string v0, "gads:crash_loop_stats_signal_v2:enabled"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lm02;->b:Lso1;

    .line 17
    .line 18
    const-string v0, "gads:crash_without_flag_write_count_v2:enabled"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lm02;->c:Lso1;

    .line 25
    .line 26
    const-string v0, "gads:crash_without_write_reset_v2:count"

    .line 27
    .line 28
    const-wide/16 v2, -0x1

    .line 29
    .line 30
    invoke-static {v0, v2, v3}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lm02;->d:Lso1;

    .line 35
    .line 36
    const-string v0, "gads:init_without_flag_write_count_v2:enabled"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lm02;->e:Lso1;

    .line 43
    .line 44
    const-string v0, "gads:init_without_write_reset_v2:count"

    .line 45
    .line 46
    invoke-static {v0, v2, v3}, Lso1;->r(Ljava/lang/String;J)Lso1;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lm02;->f:Lso1;

    .line 51
    .line 52
    const-string v0, "gads:reset_app_settings_v2:enabled"

    .line 53
    .line 54
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lm02;->g:Lso1;

    .line 59
    .line 60
    const-string v0, "gads:reset_counts_on_failure_service_v2:enabled"

    .line 61
    .line 62
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lm02;->h:Lso1;

    .line 67
    .line 68
    const-string v0, "gads:reset_counts_on_local_flag_save_v2:enabled"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Lm02;->i:Lso1;

    .line 75
    .line 76
    const-string v0, "gads:reset_counts_on_successful_service_v2:enabled"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lso1;->o(Ljava/lang/String;Z)Lso1;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lm02;->j:Lso1;

    .line 83
    .line 84
    return-void
.end method
