.class public final Lv4/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/r$c;,
        Lv4/r$d;,
        Lv4/r$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;


# direct methods
.method private constructor <init>(Lv4/r$b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lv4/r$b;->b(Lv4/r$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lv4/r;->a:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lv4/r$b;->c(Lv4/r$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lv4/r;->b:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lv4/r$b;->d(Lv4/r$b;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lv4/r;->c:Ljava/util/Map;

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-static {p1}, Lv4/r$b;->a(Lv4/r$b;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lv4/r;->d:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lv4/r$b;Lv4/r$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv4/r;-><init>(Lv4/r$b;)V

    return-void
.end method

.method static synthetic a(Lv4/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lv4/r;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic b(Lv4/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lv4/r;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic c(Lv4/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lv4/r;->c:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic d(Lv4/r;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lv4/r;->d:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public e(Lv4/q;)Z
    .locals 3

    new-instance v0, Lv4/r$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p1}, Lv4/q;->a()LC4/a;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lv4/r$c;-><init>(Ljava/lang/Class;LC4/a;Lv4/r$a;)V

    iget-object p1, p0, Lv4/r;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lv4/q;Lo4/y;)Lo4/g;
    .locals 4

    new-instance v0, Lv4/r$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p1}, Lv4/q;->a()LC4/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lv4/r$c;-><init>(Ljava/lang/Class;LC4/a;Lv4/r$a;)V

    iget-object v1, p0, Lv4/r;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lv4/r;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/b;

    invoke-virtual {v0, p1, p2}, Lv4/b;->d(Lv4/q;Lo4/y;)Lo4/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "No Key Parser for requested key type "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " available"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
