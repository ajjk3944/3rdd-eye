.class final LT/Y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/g0;


# static fields
.field public static final a:LT/Y0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/Y0;

    invoke-direct {v0}, LT/Y0;-><init>()V

    sput-object v0, LT/Y0;->a:LT/Y0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LT/g0$a;->a(LT/g0;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->b(LT/g0;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public j(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v0

    new-instance v1, LT/Y0$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LT/Y0$a;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->c(LT/g0;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->d(LT/g0;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
