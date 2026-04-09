.class public final LU/d$z;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "z"
.end annotation


# static fields
.field public static final c:LU/d$z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$z;

    invoke-direct {v0}, LU/d$z;-><init>()V

    sput-object v0, LU/d$z;->c:LU/d$z;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v0, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p2}, LU/d$t;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmh/a;

    invoke-interface {p4, p1}, LT/R0;->d(Lmh/a;)V

    return-void
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "effect"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LU/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
