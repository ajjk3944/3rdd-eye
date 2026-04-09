.class public final LR1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LR1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR1/c;

    invoke-direct {v0}, LR1/c;-><init>()V

    sput-object v0, LR1/c;->a:LR1/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP1/b;Ljava/util/List;LIi/N;Lmh/a;)LO1/e;
    .locals 7

    const-string v0, "migrations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LO1/f;->a:LO1/f;

    sget-object v2, LR1/h;->a:LR1/h;

    new-instance v6, LR1/c$a;

    invoke-direct {v6, p4}, LR1/c$a;-><init>(Lmh/a;)V

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, LO1/f;->a(LO1/j;LP1/b;Ljava/util/List;LIi/N;Lmh/a;)LO1/e;

    move-result-object p1

    new-instance p2, LR1/b;

    invoke-direct {p2, p1}, LR1/b;-><init>(LO1/e;)V

    return-object p2
.end method
