.class public final LEh/a;
.super LBh/w0;
.source "SourceFile"


# static fields
.field public static final c:LEh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LEh/a;

    invoke-direct {v0}, LEh/a;-><init>()V

    sput-object v0, LEh/a;->c:LEh/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "package"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LBh/w0;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public a(LBh/w0;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "visibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, LBh/v0;->a:LBh/v0;

    invoke-virtual {v0, p1}, LBh/v0;->b(LBh/w0;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "public/*package*/"

    return-object v0
.end method

.method public d()LBh/w0;
    .locals 1

    sget-object v0, LBh/v0$g;->c:LBh/v0$g;

    return-object v0
.end method
