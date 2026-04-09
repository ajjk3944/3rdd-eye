.class final LL0/C$D;
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
.field public static final a:LL0/C$D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$D;

    invoke-direct {v0}, LL0/C$D;-><init>()V

    sput-object v0, LL0/C$D;->a:LL0/C$D;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LW0/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p2}, LW0/k;->e()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LW0/k;

    invoke-virtual {p0, p1, p2}, LL0/C$D;->a(Lc0/m;LW0/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
