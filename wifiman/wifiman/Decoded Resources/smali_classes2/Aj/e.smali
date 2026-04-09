.class public LAj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private volatile a:Ljava/time/Instant;

.field private volatile b:Ljava/util/Locale;

.field private final c:Ljava/util/Map;

.field private volatile d:Ljava/util/List;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LAj/e;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iput-object v0, p0, LAj/e;->b:Ljava/util/Locale;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, LAj/e;->c:Ljava/util/Map;

    .line 5
    iput-object p1, p0, LAj/e;->e:Ljava/lang/String;

    .line 6
    invoke-direct {p0}, LAj/e;->j()V

    return-void
.end method

.method public static synthetic a(LAj/e;Ljava/util/Map;LAj/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LAj/e;->k(Ljava/util/Map;LAj/g;)V

    return-void
.end method

.method private b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V
    .locals 2

    new-instance v0, Lorg/ocpsoft/prettytime/impl/a;

    iget-object v1, p0, LAj/e;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lorg/ocpsoft/prettytime/impl/a;-><init>(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, LAj/e;->m(LAj/g;LAj/f;)LAj/e;

    return-void
.end method

.method private d(J)LAj/a;
    .locals 17

    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, LAj/e;->i()Ljava/util/List;

    move-result-object v2

    new-instance v3, LCj/a;

    invoke-direct {v3}, LCj/a;-><init>()V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LAj/g;

    invoke-interface {v6}, LAj/g;->b()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    invoke-interface {v6}, LAj/g;->a()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x1

    sub-int/2addr v11, v12

    if-ne v5, v11, :cond_0

    goto :goto_1

    :cond_0
    move v12, v4

    :goto_1
    const-wide/16 v13, 0x0

    cmp-long v11, v13, v9

    if-nez v11, :cond_1

    if-nez v12, :cond_1

    add-int/lit8 v9, v5, 0x1

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LAj/g;

    invoke-interface {v9}, LAj/g;->b()J

    move-result-wide v9

    invoke-interface {v6}, LAj/g;->b()J

    move-result-wide v15

    div-long/2addr v9, v15

    :cond_1
    mul-long/2addr v9, v7

    cmp-long v9, v9, v0

    if-gtz v9, :cond_3

    if-eqz v12, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {v3, v6}, LCj/a;->i(LAj/g;)V

    cmp-long v0, v7, v0

    if-lez v0, :cond_4

    invoke-direct/range {p0 .. p2}, LAj/e;->h(J)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, LCj/a;->h(J)V

    invoke-virtual {v3, v13, v14}, LCj/a;->g(J)V

    goto :goto_3

    :cond_4
    div-long v0, p1, v7

    invoke-virtual {v3, v0, v1}, LCj/a;->h(J)V

    invoke-virtual {v3}, LCj/a;->c()J

    move-result-wide v0

    mul-long/2addr v0, v7

    sub-long v0, p1, v0

    invoke-virtual {v3, v0, v1}, LCj/a;->g(J)V

    :cond_5
    :goto_3
    return-object v3
.end method

.method private h(J)J
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    const-wide/16 p1, 0x1

    return-wide p1
.end method

.method private j()V
    .locals 1

    new-instance v0, Lorg/ocpsoft/prettytime/units/JustNow;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/JustNow;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Millisecond;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Millisecond;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Second;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Second;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Minute;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Minute;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Hour;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Hour;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Day;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Day;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Week;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Week;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Month;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Month;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Year;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Year;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Decade;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Decade;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Century;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Century;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    new-instance v0, Lorg/ocpsoft/prettytime/units/Millennium;

    invoke-direct {v0}, Lorg/ocpsoft/prettytime/units/Millennium;-><init>()V

    invoke-direct {p0, v0}, LAj/e;->b(Lorg/ocpsoft/prettytime/impl/ResourcesTimeUnit;)V

    return-void
.end method

.method private synthetic k(Ljava/util/Map;LAj/g;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LAj/e;->c:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LAj/f;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private l()Ljava/util/Date;
    .locals 1

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method


# virtual methods
.method public c(Ljava/util/Date;)LAj/a;
    .locals 5

    if-nez p1, :cond_0

    invoke-direct {p0}, LAj/e;->l()Ljava/util/Date;

    move-result-object p1

    :cond_0
    iget-object v0, p0, LAj/e;->a:Ljava/time/Instant;

    if-eqz v0, :cond_1

    iget-object v0, p0, LAj/e;->a:Ljava/time/Instant;

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/time/Instant;->now()Ljava/time/Instant;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-nez p1, :cond_2

    const-wide/16 v1, 0x1

    :cond_2
    invoke-direct {p0, v1, v2}, LAj/e;->d(J)LAj/a;

    move-result-object p1

    return-object p1
.end method

.method public e(LAj/a;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    invoke-direct {p0}, LAj/e;->l()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1}, LAj/e;->f(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, LAj/a;->a()LAj/g;

    move-result-object v0

    invoke-virtual {p0, v0}, LAj/e;->g(LAj/g;)LAj/f;

    move-result-object v0

    invoke-interface {v0, p1}, LAj/f;->b(LAj/a;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, LAj/f;->a(LAj/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/Date;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    invoke-direct {p0}, LAj/e;->l()Ljava/util/Date;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, LAj/e;->c(Ljava/util/Date;)LAj/a;

    move-result-object p1

    invoke-virtual {p0, p1}, LAj/e;->e(LAj/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(LAj/g;)LAj/f;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LAj/e;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LAj/e;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAj/f;

    return-object p1

    :cond_1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iget-object v1, p0, LAj/e;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    new-instance v2, LAj/c;

    invoke-direct {v2, p0, v0}, LAj/c;-><init>(LAj/e;Ljava/util/Map;)V

    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAj/f;

    return-object p1
.end method

.method public i()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LAj/e;->d:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, LAj/e;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, LAj/d;

    invoke-direct {v1}, LAj/d;-><init>()V

    invoke-static {v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LAj/e;->d:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LAj/e;->d:Ljava/util/List;

    return-object v0
.end method

.method public m(LAj/g;LAj/f;)LAj/e;
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, LAj/e;->d:Ljava/util/List;

    iget-object v0, p0, LAj/e;->c:Ljava/util/Map;

    const-string v1, "TimeUnit to register must not be null."

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LAj/g;

    const-string v2, "TimeFormat to register must not be null."

    invoke-static {p2, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v2, p2

    check-cast v2, LAj/f;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, LAj/b;

    if-eqz v0, :cond_0

    check-cast p1, LAj/b;

    iget-object v0, p0, LAj/e;->b:Ljava/util/Locale;

    invoke-interface {p1, v0}, LAj/b;->c(Ljava/util/Locale;)Ljava/lang/Object;

    :cond_0
    instance-of p1, p2, LAj/b;

    if-eqz p1, :cond_1

    check-cast p2, LAj/b;

    iget-object p1, p0, LAj/e;->b:Ljava/util/Locale;

    invoke-interface {p2, p1}, LAj/b;->c(Ljava/util/Locale;)Ljava/lang/Object;

    :cond_1
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrettyTime [reference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LAj/e;->a:Ljava/time/Instant;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", locale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LAj/e;->b:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
