.class final LE8/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/b;-><init>(Lrd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/b$c;

    invoke-direct {v0}, LE8/b$c;-><init>()V

    sput-object v0, LE8/b$c;->a:LE8/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LE8/a$a$a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, LE8/b$c;->d(LE8/a$a$a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LE8/a$a$a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, LE8/b$c;->e(LE8/a$a$a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LE8/a$a$a;)Ljava/lang/Comparable;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LE8/a$a$a;->b()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LE8/a$a$a;)Ljava/lang/Comparable;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LE8/a$a$a;->a()Lrd/b$a;

    move-result-object p0

    invoke-virtual {p0}, Lrd/b$a;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LE8/b$c;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/util/List;)Ljava/util/List;
    .locals 4

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, LE8/d;

    invoke-direct {v0}, LE8/d;-><init>()V

    new-instance v1, LE8/e;

    invoke-direct {v1}, LE8/e;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lmh/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lch/a;->c([Lmh/l;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
