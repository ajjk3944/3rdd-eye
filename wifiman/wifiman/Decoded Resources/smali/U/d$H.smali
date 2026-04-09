.class public final LU/d$H;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "H"
.end annotation


# static fields
.field public static final c:LU/d$H;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$H;

    invoke-direct {v0}, LU/d$H;-><init>()V

    sput-object v0, LU/d$H;->c:LU/d$H;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 0

    invoke-interface {p2}, LT/f;->b()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LT/k;

    invoke-interface {p1}, LT/k;->p()V

    return-void
.end method
