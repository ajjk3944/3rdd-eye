.class public final Landroidx/work/OverwritingInputMerger;
.super Lv20;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)Lim;
    .locals 5

    .line 1
    new-instance v0, Lhm;

    .line 2
    .line 3
    invoke-direct {v0}, Lhm;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Lim;

    .line 25
    .line 26
    iget-object v4, v4, Lim;->a:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0, v1}, Lhm;->a(Ljava/util/HashMap;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lim;

    .line 40
    .line 41
    iget-object v0, v0, Lhm;->a:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lim;-><init>(Ljava/util/HashMap;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lim;->c(Lim;)[B

    .line 47
    .line 48
    .line 49
    return-object p1
.end method
