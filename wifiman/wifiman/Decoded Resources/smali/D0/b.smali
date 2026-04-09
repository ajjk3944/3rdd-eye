.class public final LD0/b;
.super LD0/g;
.source "SourceFile"


# static fields
.field public static final a:LD0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD0/b;

    invoke-direct {v0}, LD0/b;-><init>()V

    sput-object v0, LD0/b;->a:LD0/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LD0/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LD0/c;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(LD0/c;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, ""

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
