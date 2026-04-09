.class public final LU/d$n;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation


# static fields
.field public static final c:LU/d$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$n;

    invoke-direct {v0}, LU/d$n;-><init>()V

    sput-object v0, LU/d$n;->c:LU/d$n;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LU/d;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 2

    const/4 p4, 0x0

    invoke-static {p4}, LU/d$t;->a(I)I

    move-result v0

    invoke-interface {p1, v0}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, LU/d$t;->a(I)I

    move-result v1

    invoke-interface {p1, v1}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/d;

    invoke-static {p4}, LU/d$q;->a(I)I

    move-result p4

    invoke-interface {p1, p4}, LU/e;->b(I)I

    move-result p1

    const-string p4, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, v1, v0}, LT/e1;->s1(LT/d;Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, LT/f;->h(ILjava/lang/Object;)V

    invoke-interface {p2, v0}, LT/f;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LU/d$q;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$q;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "insertIndex"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LU/d;->e(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "factory"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "groupAnchor"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LU/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
