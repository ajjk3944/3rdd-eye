.class public final Lej/E$a;
.super Lej/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lej/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lej/E;-><init>()V

    return-void
.end method


# virtual methods
.method public e(J)Lej/E;
    .locals 0

    return-object p0
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h(JLjava/util/concurrent/TimeUnit;)Lej/E;
    .locals 0

    const-string p1, "unit"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
