.class public abstract LNb/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LNb/e;Ljava/util/List;)V
    .locals 1

    const-string/jumbo v0, "consoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LNb/e;->clear()V

    invoke-interface {p0, p1}, LNb/e;->b(Ljava/util/List;)V

    return-void
.end method
