.class public final LHb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LHb/b;

.field private static final b:Laj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LHb/b;

    invoke-direct {v0}, LHb/b;-><init>()V

    sput-object v0, LHb/b;->a:LHb/b;

    new-instance v0, LHb/a;

    invoke-direct {v0}, LHb/a;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v0

    sput-object v0, LHb/b;->b:Laj/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Laj/e;)LYg/J;
    .locals 0

    invoke-static {p0}, LHb/b;->c(Laj/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Laj/e;)LYg/J;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Laj/e;->f(Z)V

    invoke-virtual {p0, v0}, Laj/e;->g(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b()Laj/b;
    .locals 1

    sget-object v0, LHb/b;->b:Laj/b;

    return-object v0
.end method
