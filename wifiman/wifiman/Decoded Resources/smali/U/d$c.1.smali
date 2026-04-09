.class public final LU/d$c;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final c:LU/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$c;

    invoke-direct {v0}, LU/d$c;-><init>()V

    sput-object v0, LU/d$c;->c:LU/d$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {p0, v2, v3, v0, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-interface {p1, v0}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb0/d;->a()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v1}, LU/d$t;->a(I)I

    move-result v1

    invoke-interface {p1, v1}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LU/a;

    if-lez v0, :cond_1

    new-instance v1, LT/s0;

    invoke-direct {v1, p2, v0}, LT/s0;-><init>(LT/f;I)V

    move-object p2, v1

    :cond_1
    invoke-virtual {p1, p2, p3, p4}, LU/a;->b(LT/f;LT/e1;LT/R0;)V

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

    const-string p1, "changes"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "effectiveNodeIndex"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LU/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
