.class final LL0/C$i;
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
.field public static final a:LL0/C$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$i;

    invoke-direct {v0}, LL0/C$i;-><init>()V

    sput-object v0, LL0/C$i;->a:LL0/C$i;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LL0/i$a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p2}, LL0/i$a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LL0/C;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LL0/i$a;->b()LL0/N;

    move-result-object p2

    invoke-static {}, LL0/C;->w()Lc0/k;

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

    check-cast p2, LL0/i$a;

    invoke-virtual {p0, p1, p2}, LL0/C$i;->a(Lc0/m;LL0/i$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
