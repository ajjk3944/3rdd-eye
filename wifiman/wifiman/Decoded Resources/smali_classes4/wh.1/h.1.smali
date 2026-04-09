.class public abstract Lwh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lwh/a;

.field private static final b:Lwh/a;

.field private static final c:Lwh/a;

.field private static final d:Lwh/a;

.field private static final e:Lwh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lwh/c;->a:Lwh/c;

    invoke-static {v0}, Lwh/b;->a(Lmh/l;)Lwh/a;

    move-result-object v0

    sput-object v0, Lwh/h;->a:Lwh/a;

    sget-object v0, Lwh/d;->a:Lwh/d;

    invoke-static {v0}, Lwh/b;->a(Lmh/l;)Lwh/a;

    move-result-object v0

    sput-object v0, Lwh/h;->b:Lwh/a;

    sget-object v0, Lwh/e;->a:Lwh/e;

    invoke-static {v0}, Lwh/b;->a(Lmh/l;)Lwh/a;

    move-result-object v0

    sput-object v0, Lwh/h;->c:Lwh/a;

    sget-object v0, Lwh/f;->a:Lwh/f;

    invoke-static {v0}, Lwh/b;->a(Lmh/l;)Lwh/a;

    move-result-object v0

    sput-object v0, Lwh/h;->d:Lwh/a;

    sget-object v0, Lwh/g;->a:Lwh/g;

    invoke-static {v0}, Lwh/b;->a(Lmh/l;)Lwh/a;

    move-result-object v0

    sput-object v0, Lwh/h;->e:Lwh/a;

    return-void
.end method

.method private static final a(Ljava/lang/Class;)Lth/p;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwh/h;->m(Ljava/lang/Class;)Lwh/X;

    move-result-object p0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Luh/a;->b(Lth/e;Ljava/util/List;ZLjava/util/List;)Lth/p;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object p0
.end method

.method private static final c(Ljava/lang/Class;)Lth/p;
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwh/h;->m(Ljava/lang/Class;)Lwh/X;

    move-result-object p0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Luh/a;->b(Lth/e;Ljava/util/List;ZLjava/util/List;)Lth/p;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Class;)Lwh/X;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwh/X;

    invoke-direct {v0, p0}, Lwh/X;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method private static final e(Ljava/lang/Class;)Lwh/v0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwh/v0;

    invoke-direct {v0, p0}, Lwh/v0;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method static synthetic f(Ljava/lang/Class;)Lwh/X;
    .locals 0

    invoke-static {p0}, Lwh/h;->d(Ljava/lang/Class;)Lwh/X;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Ljava/lang/Class;)Lwh/v0;
    .locals 0

    invoke-static {p0}, Lwh/h;->e(Ljava/lang/Class;)Lwh/v0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Ljava/lang/Class;)Lth/p;
    .locals 0

    invoke-static {p0}, Lwh/h;->a(Ljava/lang/Class;)Lth/p;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Ljava/lang/Class;)Lth/p;
    .locals 0

    invoke-static {p0}, Lwh/h;->c(Ljava/lang/Class;)Lth/p;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    invoke-static {p0}, Lwh/h;->b(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Ljava/lang/Class;Ljava/util/List;Z)Lth/p;
    .locals 1

    const-string v0, "jClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    sget-object p1, Lwh/h;->d:Lwh/a;

    invoke-virtual {p1, p0}, Lwh/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lth/p;

    goto :goto_0

    :cond_0
    sget-object p1, Lwh/h;->c:Lwh/a;

    invoke-virtual {p1, p0}, Lwh/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lth/p;

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2}, Lwh/h;->l(Ljava/lang/Class;Ljava/util/List;Z)Lth/p;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final l(Ljava/lang/Class;Ljava/util/List;Z)Lth/p;
    .locals 3

    sget-object v0, Lwh/h;->e:Lwh/a;

    invoke-virtual {v0, p0}, Lwh/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {p0}, Lwh/h;->m(Ljava/lang/Class;)Lwh/X;

    move-result-object p0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {p0, p1, p2, v2}, Luh/a;->b(Lth/e;Ljava/util/List;ZLjava/util/List;)Lth/p;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    move-object v2, p0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :cond_1
    :goto_0
    const-string p0, "getOrPut(...)"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lth/p;

    return-object v2
.end method

.method public static final m(Ljava/lang/Class;)Lwh/X;
    .locals 1

    const-string v0, "jClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwh/h;->a:Lwh/a;

    invoke-virtual {v0, p0}, Lwh/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lwh/X;

    return-object p0
.end method

.method public static final n(Ljava/lang/Class;)Lth/f;
    .locals 1

    const-string v0, "jClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwh/h;->b:Lwh/a;

    invoke-virtual {v0, p0}, Lwh/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lth/f;

    return-object p0
.end method
