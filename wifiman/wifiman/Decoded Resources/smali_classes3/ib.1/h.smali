.class public final Lib/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lib/h$a;,
        Lib/h$b;
    }
.end annotation


# static fields
.field public static final c:Lib/h$a;

.field private static d:I

.field private static e:I

.field private static final f:Lkotlin/text/p;

.field private static final g:Lkotlin/text/p;

.field private static final h:Ljava/util/Map;


# instance fields
.field private a:Z

.field private final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lib/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lib/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lib/h;->c:Lib/h$a;

    const/4 v0, 0x1

    sput v0, Lib/h;->d:I

    sput v0, Lib/h;->e:I

    new-instance v0, Lkotlin/text/p;

    const-string v1, "(?:(?<=\\s|,|:|/)|(?<=^))(?:(?:(?:[0-9a-f|x]{1,4}:)|(?:):){2,10})(?:(?:[0-9a-f|x]{1,4})|(?:))"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lib/h;->f:Lkotlin/text/p;

    new-instance v0, Lkotlin/text/p;

    const-string v1, "(?:[0-9]{1,3}\\.){3}(?:[0-9]{1,3}|x)"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lib/h;->g:Lkotlin/text/p;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lib/h;->h:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string/jumbo v1, "synchronizedList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lib/h;->b:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lib/h;->e:I

    return v0
.end method

.method public static final synthetic b()Lkotlin/text/p;
    .locals 1

    sget-object v0, Lib/h;->g:Lkotlin/text/p;

    return-object v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Lib/h;->d:I

    return v0
.end method

.method public static final synthetic d()Lkotlin/text/p;
    .locals 1

    sget-object v0, Lib/h;->f:Lkotlin/text/p;

    return-object v0
.end method

.method public static final synthetic e()Ljava/util/Map;
    .locals 1

    sget-object v0, Lib/h;->h:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic f(I)V
    .locals 0

    sput p0, Lib/h;->e:I

    return-void
.end method

.method public static final synthetic g(I)V
    .locals 0

    sput p0, Lib/h;->d:I

    return-void
.end method


# virtual methods
.method public final h()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lib/h;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lib/h;->b:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lib/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lib/h;->a:Z

    return-void
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/h;->a:Z

    iget-object v0, p0, Lib/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public onLogMessage(Ljava/lang/String;Lorg/webrtc/Logging$Severity;Ljava/lang/String;)V
    .locals 9

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "severity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lib/h;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lib/h$b;

    sget-object v1, Lib/h;->c:Lib/h$a;

    invoke-static {v1, p1}, Lib/h$a;->c(Lib/h$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    move-object v1, v0

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v8}, Lib/h$b;-><init>(Ljava/lang/String;Lorg/webrtc/Logging$Severity;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lib/h;->b:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
