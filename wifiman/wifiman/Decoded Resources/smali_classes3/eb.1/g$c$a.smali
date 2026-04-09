.class public final Leb/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/g$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Leb/g$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/g$c$a;

    invoke-direct {v0}, Leb/g$c$a;-><init>()V

    sput-object v0, Leb/g$c$a;->a:Leb/g$c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;Llb/c;)Ljava/util/Map;
    .locals 2

    const-string/jumbo v0, "meta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v0

    if-eqz p1, :cond_0

    sget-object v1, Lub/c;->a:Lub/c;

    invoke-virtual {v1, p1}, Lub/c;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    invoke-virtual {p2}, Llb/c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Laj/k;->b(Ljava/lang/String;)Laj/G;

    move-result-object p1

    const-string/jumbo v1, "x-client-name"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Llb/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Laj/k;->b(Ljava/lang/String;)Laj/G;

    move-result-object p1

    const-string/jumbo p2, "x-client-version"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo p1, "ucore-android"

    invoke-static {p1}, Laj/k;->b(Ljava/lang/String;)Laj/G;

    move-result-object p1

    const-string/jumbo p2, "x-client-platform"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
