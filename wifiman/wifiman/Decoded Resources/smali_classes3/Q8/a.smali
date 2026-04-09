.class public final LQ8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ8/a;

    invoke-direct {v0}, LQ8/a;-><init>()V

    sput-object v0, LQ8/a;->a:LQ8/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh9/a;)Ls9/d;
    .locals 3

    const-string/jumbo v0, "hwAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$a;

    const-string v1, ""

    invoke-virtual {p1, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LQ8/a$a;

    invoke-direct {v2, p1}, LQ8/a$a;-><init>(Lh9/a;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method
