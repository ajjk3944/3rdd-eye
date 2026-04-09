.class final LI0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/g;


# static fields
.field public static final a:LI0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI0/g;

    invoke-direct {v0}, LI0/g;-><init>()V

    sput-object v0, LI0/g;->a:LI0/g;

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

    invoke-static {p0, p1, p2}, Lf0/g$a;->a(Lf0/g;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->b(Lf0/g;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->c(Lf0/g;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Lf0/g$a;->d(Lf0/g;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public v()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
