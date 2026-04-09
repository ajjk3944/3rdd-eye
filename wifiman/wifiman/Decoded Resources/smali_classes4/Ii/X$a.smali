.class public abstract LIi/X$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LIi/X;JLjava/lang/Runnable;Ldh/i;)LIi/e0;
    .locals 0

    invoke-static {}, LIi/U;->a()LIi/X;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, LIi/X;->p(JLjava/lang/Runnable;Ldh/i;)LIi/e0;

    move-result-object p0

    return-object p0
.end method
