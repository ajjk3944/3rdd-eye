.class public final LO1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO1/f;

    invoke-direct {v0}, LO1/f;-><init>()V

    sput-object v0, LO1/f;->a:LO1/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LO1/j;LP1/b;Ljava/util/List;LIi/N;Lmh/a;)LO1/e;
    .locals 6

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    new-instance p2, LP1/a;

    invoke-direct {p2}, LP1/a;-><init>()V

    :cond_0
    move-object v4, p2

    sget-object p2, LO1/d;->a:LO1/d$a;

    invoke-virtual {p2, p3}, LO1/d$a;->b(Ljava/util/List;)Lmh/p;

    move-result-object p2

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance p2, LO1/l;

    move-object v0, p2

    move-object v1, p5

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LO1/l;-><init>(Lmh/a;LO1/j;Ljava/util/List;LO1/a;LIi/N;)V

    return-object p2
.end method
