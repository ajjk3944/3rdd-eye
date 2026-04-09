.class public final LJh/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJh/K;


# instance fields
.field private final b:Ljava/util/Map;

.field private final c:Loi/f;

.field private final d:Loi/h;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    const-string v0, "states"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJh/M;->b:Ljava/util/Map;

    new-instance p1, Loi/f;

    const-string v0, "Java nullability annotation states"

    invoke-direct {p1, v0}, Loi/f;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LJh/M;->c:Loi/f;

    new-instance v0, LJh/L;

    invoke-direct {v0, p0}, LJh/L;-><init>(LJh/M;)V

    invoke-virtual {p1, v0}, Loi/f;->i(Lmh/l;)Loi/h;

    move-result-object p1

    const-string v0, "createMemoizedFunctionWithNullableValues(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJh/M;->d:Loi/h;

    return-void
.end method

.method static synthetic b(LJh/M;LZh/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LJh/M;->c(LJh/M;LZh/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LJh/M;LZh/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object p0, p0, LJh/M;->b:Ljava/util/Map;

    invoke-static {p1, p0}, LZh/e;->a(LZh/c;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LZh/c;)Ljava/lang/Object;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJh/M;->d:Loi/h;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
