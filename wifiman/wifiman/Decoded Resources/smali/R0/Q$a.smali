.class final LR0/Q$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR0/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LR0/Q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR0/Q$a;

    invoke-direct {v0}, LR0/Q$a;-><init>()V

    sput-object v0, LR0/Q$a;->a:LR0/Q$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LR0/Q;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p2}, LR0/Q;->f()LL0/d;

    move-result-object v0

    invoke-static {}, LL0/C;->h()Lc0/k;

    move-result-object v1

    invoke-static {v0, v1, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->b(J)LL0/S;

    move-result-object p2

    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-static {v1}, LL0/C;->j(LL0/S$a;)Lc0/k;

    move-result-object v1

    invoke-static {p2, v1, p1}, LL0/C;->y(Ljava/lang/Object;Lc0/k;Lc0/m;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LR0/Q;

    invoke-virtual {p0, p1, p2}, LR0/Q$a;->a(Lc0/m;LR0/Q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
