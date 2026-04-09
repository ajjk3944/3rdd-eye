.class public final Lwh/k;
.super Lwh/d0;
.source "SourceFile"


# static fields
.field public static final d:Lwh/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/k;

    invoke-direct {v0}, Lwh/k;-><init>()V

    sput-object v0, Lwh/k;->d:Lwh/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lwh/d0;-><init>()V

    return-void
.end method

.method private final U()Ljava/lang/Void;
    .locals 2

    new-instance v0, Lwh/Y0;

    const-string v1, "Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection"

    invoke-direct {v0, v1}, Lwh/Y0;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public G()Ljava/util/Collection;
    .locals 1

    invoke-direct {p0}, Lwh/k;->U()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public H(LZh/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwh/k;->U()Ljava/lang/Void;

    const/4 p1, 0x0

    throw p1
.end method

.method public I(I)LBh/Y;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public M(LZh/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwh/k;->U()Ljava/lang/Void;

    const/4 p1, 0x0

    throw p1
.end method

.method public b()Ljava/lang/Class;
    .locals 1

    invoke-direct {p0}, Lwh/k;->U()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method
