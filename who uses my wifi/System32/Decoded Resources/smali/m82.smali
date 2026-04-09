.class public final Lm82;
.super Lgw3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Ljava/util/Map;

.field public final j:Landroid/app/Activity;

.field public final k:Ljava/lang/String;

.field public final l:J

.field public final m:J

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lag2;Ljava/util/Map;)V
    .locals 3

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "createCalendarEvent"

    .line 5
    .line 6
    invoke-direct {p0, p1, v2, v0, v1}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lm82;->i:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p1}, Lag2;->g()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lm82;->j:Landroid/app/Activity;

    .line 16
    .line 17
    const-string p1, "description"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lm82;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lm82;->k:Ljava/lang/String;

    .line 24
    .line 25
    const-string p1, "summary"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lm82;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lm82;->n:Ljava/lang/String;

    .line 32
    .line 33
    const-string p1, "start_ticks"

    .line 34
    .line 35
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    const-wide/16 v0, -0x1

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    :catch_0
    move-wide p1, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :goto_0
    iput-wide p1, p0, Lm82;->l:J

    .line 52
    .line 53
    const-string p1, "end_ticks"

    .line 54
    .line 55
    iget-object p2, p0, Lm82;->i:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/String;

    .line 62
    .line 63
    if-nez p1, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :try_start_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    :catch_1
    :goto_1
    iput-wide v0, p0, Lm82;->m:J

    .line 71
    .line 72
    const-string p1, "location"

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lm82;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lm82;->o:Ljava/lang/String;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lm82;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/String;

    .line 23
    .line 24
    return-object p1
.end method
