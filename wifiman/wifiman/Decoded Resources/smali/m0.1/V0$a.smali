.class public final Lm0/V0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/V0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lm0/V0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/V0$a;

    invoke-direct {v0}, Lm0/V0$a;-><init>()V

    sput-object v0, Lm0/V0$a;->a:Lm0/V0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lm0/V0$a;[FFILjava/lang/Object;)Lm0/V0;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lm0/V0$a;->b([FF)Lm0/V0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(F)Lm0/V0;
    .locals 0

    invoke-static {p1}, Lm0/V;->a(F)Lm0/V0;

    move-result-object p1

    return-object p1
.end method

.method public final b([FF)Lm0/V0;
    .locals 0

    invoke-static {p1, p2}, Lm0/V;->b([FF)Lm0/V0;

    move-result-object p1

    return-object p1
.end method
