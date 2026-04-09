.class final LL0/C$x;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LL0/C$x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$x;

    invoke-direct {v0}, LL0/C$x;-><init>()V

    sput-object v0, LL0/C$x;->a:LL0/C$x;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LL0/v;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p2}, LL0/v;->h()I

    move-result v0

    invoke-static {v0}, LW0/j;->h(I)LW0/j;

    move-result-object v0

    invoke-static {v0}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LL0/v;->i()I

    move-result v1

    invoke-static {v1}, LW0/l;->g(I)LW0/l;

    move-result-object v1

    invoke-static {v1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, LL0/v;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/v;->b(J)LY0/v;

    move-result-object v2

    sget-object v3, LY0/v;->b:LY0/v$a;

    invoke-static {v3}, LL0/C;->r(LY0/v$a;)Lc0/k;

    move-result-object v3

    invoke-static {v2, v3, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2}, LL0/v;->j()LW0/q;

    move-result-object p2

    sget-object v3, LW0/q;->c:LW0/q$a;

    invoke-static {v3}, LL0/C;->q(LW0/q$a;)Lc0/k;

    move-result-object v3

    invoke-static {p2, v3, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, v1, v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LL0/v;

    invoke-virtual {p0, p1, p2}, LL0/C$x;->a(Lc0/m;LL0/v;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
