.class final Lbi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbi/u;


# static fields
.field public static final a:Lbi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbi/b;

    invoke-direct {v0}, Lbi/b;-><init>()V

    sput-object v0, Lbi/b;->a:Lbi/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBh/G;)LBh/e;
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LZh/i;->a:LZh/i;

    invoke-virtual {v0}, LZh/i;->i()LZh/b;

    move-result-object v0

    invoke-static {p1, v0}, LBh/y;->b(LBh/G;LZh/b;)LBh/e;

    move-result-object p1

    return-object p1
.end method
