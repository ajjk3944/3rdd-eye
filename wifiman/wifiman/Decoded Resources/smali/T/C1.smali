.class final LT/C1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/n1;


# static fields
.field public static final a:LT/C1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/C1;

    invoke-direct {v0}, LT/C1;-><init>()V

    sput-object v0, LT/C1;->a:LT/C1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "StructuralEqualityPolicy"

    return-object v0
.end method
