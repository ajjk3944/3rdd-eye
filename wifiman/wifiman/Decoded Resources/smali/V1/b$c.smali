.class public final LV1/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV1/b$c$a;
    }
.end annotation


# static fields
.field public static final c:LV1/b$c$a;

.field public static final d:LV1/b$c;


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LV1/b$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV1/b$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LV1/b$c;->c:LV1/b$c$a;

    new-instance v0, LV1/b$c;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, LV1/b$c;-><init>(Ljava/util/Set;LV1/b$b;Ljava/util/Map;)V

    sput-object v0, LV1/b$c;->d:LV1/b$c;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;LV1/b$b;Ljava/util/Map;)V
    .locals 1

    const-string p2, "flags"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "allowedViolations"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV1/b$c;->a:Ljava/util/Set;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Set;

    invoke-interface {p1, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LV1/b$c;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LV1/b$c;->a:Ljava/util/Set;

    return-object v0
.end method

.method public final b()LV1/b$b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LV1/b$c;->b:Ljava/util/Map;

    return-object v0
.end method
