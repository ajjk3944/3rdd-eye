.class final LL0/C$N;
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
.field public static final a:LL0/C$N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$N;

    invoke-direct {v0}, LL0/C$N;-><init>()V

    sput-object v0, LL0/C$N;->a:LL0/C$N;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;J)Ljava/lang/Object;
    .locals 2

    sget-object p1, LY0/v;->b:LY0/v$a;

    invoke-virtual {p1}, LY0/v$a;->a()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/v;->e(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, LY0/v;->h(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3}, LY0/v;->g(J)J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/x;->d(J)LY0/x;

    move-result-object p2

    invoke-static {p2}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lc0/m;

    check-cast p2, LY0/v;

    invoke-virtual {p2}, LY0/v;->k()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LL0/C$N;->a(Lc0/m;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
