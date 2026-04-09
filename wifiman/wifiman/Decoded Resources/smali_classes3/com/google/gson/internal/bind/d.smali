.class public final Lcom/google/gson/internal/bind/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/d$b;
    }
.end annotation


# static fields
.field private static final c:Lcom/google/gson/q;

.field private static final d:Lcom/google/gson/q;


# instance fields
.field private final a:Lt5/c;

.field private final b:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/gson/internal/bind/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/d$b;-><init>(Lcom/google/gson/internal/bind/d$a;)V

    sput-object v0, Lcom/google/gson/internal/bind/d;->c:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/d$b;

    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/d$b;-><init>(Lcom/google/gson/internal/bind/d$a;)V

    sput-object v0, Lcom/google/gson/internal/bind/d;->d:Lcom/google/gson/q;

    return-void
.end method

.method public constructor <init>(Lt5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/d;->a:Lt5/c;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/d;->b:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method private static a(Lt5/c;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/gson/reflect/a;->a(Ljava/lang/Class;)Lcom/google/gson/reflect/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt5/c;->b(Lcom/google/gson/reflect/a;)Lt5/j;

    move-result-object p0

    invoke-interface {p0}, Lt5/j;->a()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/Class;)Ls5/b;
    .locals 1

    const-class v0, Ls5/b;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Ls5/b;

    return-object p0
.end method

.method private f(Ljava/lang/Class;Lcom/google/gson/q;)Lcom/google/gson/q;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/bind/d;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/q;

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    return-object p2
.end method


# virtual methods
.method public b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 7

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/internal/bind/d;->c(Ljava/lang/Class;)Ls5/b;

    move-result-object v5

    if-nez v5, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v2, p0, Lcom/google/gson/internal/bind/d;->a:Lt5/c;

    const/4 v6, 0x1

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lcom/google/gson/internal/bind/d;->d(Lt5/c;Lcom/google/gson/e;Lcom/google/gson/reflect/a;Ls5/b;Z)Lcom/google/gson/p;

    move-result-object p1

    return-object p1
.end method

.method d(Lt5/c;Lcom/google/gson/e;Lcom/google/gson/reflect/a;Ls5/b;Z)Lcom/google/gson/p;
    .locals 1

    invoke-interface {p4}, Ls5/b;->value()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/gson/internal/bind/d;->a(Lt5/c;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p4}, Ls5/b;->nullSafe()Z

    move-result p4

    instance-of v0, p1, Lcom/google/gson/p;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/gson/p;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/google/gson/q;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/gson/q;

    if-eqz p5, :cond_1

    invoke-virtual {p3}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object p5

    invoke-direct {p0, p5, p1}, Lcom/google/gson/internal/bind/d;->f(Ljava/lang/Class;Lcom/google/gson/q;)Lcom/google/gson/q;

    move-result-object p1

    :cond_1
    invoke-interface {p1, p2, p3}, Lcom/google/gson/q;->b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    if-eqz p4, :cond_2

    invoke-virtual {p1}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object p1

    :cond_2
    return-object p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p5, "Invalid attempt to bind an instance of "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/google/gson/reflect/a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public e(Lcom/google/gson/reflect/a;Lcom/google/gson/q;)Z
    .locals 4

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/gson/internal/bind/d;->c:Lcom/google/gson/q;

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lcom/google/gson/internal/bind/d;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/q;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    return v1

    :cond_2
    invoke-static {p1}, Lcom/google/gson/internal/bind/d;->c(Ljava/lang/Class;)Ls5/b;

    move-result-object v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    invoke-interface {v0}, Ls5/b;->value()Ljava/lang/Class;

    move-result-object v0

    const-class v3, Lcom/google/gson/q;

    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/google/gson/internal/bind/d;->a:Lt5/c;

    invoke-static {v3, v0}, Lcom/google/gson/internal/bind/d;->a(Lt5/c;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/q;

    invoke-direct {p0, p1, v0}, Lcom/google/gson/internal/bind/d;->f(Ljava/lang/Class;Lcom/google/gson/q;)Lcom/google/gson/q;

    move-result-object p1

    if-ne p1, p2, :cond_5

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    return v1
.end method
