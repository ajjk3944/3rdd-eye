.class public abstract Lcc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lcc/b;Lcc/a;)V
    .locals 0

    invoke-interface {p0}, Lcc/b;->d()V

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lcc/b;->c(Lcc/a;)J

    :cond_0
    return-void
.end method
