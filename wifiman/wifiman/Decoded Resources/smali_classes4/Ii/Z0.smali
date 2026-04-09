.class final LIi/Z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$b;
.implements Ldh/i$c;


# static fields
.field public static final a:LIi/Z0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/Z0;

    invoke-direct {v0}, LIi/Z0;-><init>()V

    sput-object v0, LIi/Z0;->a:LIi/Z0;

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

    invoke-static {p0, p1, p2}, Ldh/i$b$a;->a(Ldh/i$b;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->b(Ldh/i$b;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ldh/i$c;
    .locals 0

    return-object p0
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->c(Ldh/i$b;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->d(Ldh/i$b;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
