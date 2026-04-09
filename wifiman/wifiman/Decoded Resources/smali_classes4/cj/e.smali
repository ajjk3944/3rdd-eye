.class public abstract Lcj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcj/e;-><init>()V

    return-void
.end method

.method public static synthetic c(Lcj/e;Lth/d;Ljava/util/List;ILjava/lang/Object;)LVi/b;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcj/e;->b(Lth/d;Ljava/util/List;)LVi/b;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getContextual"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Lcj/i;)V
.end method

.method public abstract b(Lth/d;Ljava/util/List;)LVi/b;
.end method

.method public abstract d()Z
.end method

.method public abstract e(Lth/d;Ljava/lang/String;)LVi/a;
.end method

.method public abstract f(Lth/d;Ljava/lang/Object;)LVi/o;
.end method
