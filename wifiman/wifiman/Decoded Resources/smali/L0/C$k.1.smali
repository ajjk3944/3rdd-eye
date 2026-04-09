.class final LL0/C$k;
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
.field public static final a:LL0/C$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/C$k;

    invoke-direct {v0}, LL0/C$k;-><init>()V

    sput-object v0, LL0/C$k;->a:LL0/C$k;

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

    const-wide/16 v0, 0x10

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, Lm0/x0;->j(J)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lc0/m;

    check-cast p2, Lm0/v0;

    invoke-virtual {p2}, Lm0/v0;->u()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LL0/C$k;->a(Lc0/m;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
