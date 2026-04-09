.class public abstract LT/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:LT/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LT/t;->a:Ljava/lang/Object;

    new-instance v0, LT/t$a;

    invoke-direct {v0}, LT/t$a;-><init>()V

    sput-object v0, LT/t;->b:LT/B;

    return-void
.end method

.method public static final a(LT/f;LT/q;)LT/p;
    .locals 7

    new-instance v6, LT/s;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LT/s;-><init>(LT/q;LT/f;Ldh/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public static final b(LT/f;LT/q;)LT/U0;
    .locals 7

    new-instance v6, LT/s;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LT/s;-><init>(LT/q;LT/f;Ldh/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, LT/t;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static final synthetic d(Ljava/util/List;II)V
    .locals 0

    invoke-static {p0, p1, p2}, LT/t;->f(Ljava/util/List;II)V

    return-void
.end method

.method public static final synthetic e(Lo/y;II)V
    .locals 0

    invoke-static {p0, p1, p2}, LT/t;->g(Lo/y;II)V

    return-void
.end method

.method private static final f(Ljava/util/List;II)V
    .locals 2

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0, p2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final g(Lo/y;II)V
    .locals 2

    invoke-virtual {p0, p1}, Lo/k;->a(I)I

    move-result v0

    invoke-virtual {p0, p2}, Lo/k;->a(I)I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lo/y;->m(II)I

    invoke-virtual {p0, p2, v0}, Lo/y;->m(II)I

    return-void
.end method
