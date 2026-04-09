.class final LL0/C$z;
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
.field public static final a:LL0/C$z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$z;

    invoke-direct {v0}, LL0/C$z;-><init>()V

    sput-object v0, LL0/C$z;->a:LL0/C$z;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;Lm0/g1;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p2}, Lm0/g1;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-static {v1}, LL0/C;->t(Lm0/v0$a;)Lc0/k;

    move-result-object v1

    invoke-static {v0, v1, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lm0/g1;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object v1

    sget-object v2, Ll0/g;->b:Ll0/g$a;

    invoke-static {v2}, LL0/C;->s(Ll0/g$a;)Lc0/k;

    move-result-object v2

    invoke-static {v1, v2, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Lm0/g1;->b()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p2}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, Lm0/g1;

    invoke-virtual {p0, p1, p2}, LL0/C$z;->a(Lc0/m;Lm0/g1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
