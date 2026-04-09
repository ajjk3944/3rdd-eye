.class public final synthetic Lcom/google/mlkit/vision/common/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# static fields
.field public static final synthetic a:Lcom/google/mlkit/vision/common/internal/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/common/internal/b;

    invoke-direct {v0}, Lcom/google/mlkit/vision/common/internal/b;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/common/internal/b;->a:Lcom/google/mlkit/vision/common/internal/b;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF4/d;)Ljava/lang/Object;
    .locals 1

    const-class v0, Lcom/google/mlkit/vision/common/internal/a$a;

    invoke-interface {p1, v0}, LF4/d;->g(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Lcom/google/mlkit/vision/common/internal/a;

    invoke-direct {v0, p1}, Lcom/google/mlkit/vision/common/internal/a;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
