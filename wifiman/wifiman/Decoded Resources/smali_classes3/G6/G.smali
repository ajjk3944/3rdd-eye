.class public abstract LG6/G;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/G$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)LG6/G;
    .locals 1

    invoke-static {}, LG6/A;->a()LG6/a$a;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-interface {v0, p0}, LG6/a$a;->b(Landroid/content/Context;)LG6/a$a;

    move-result-object p0

    invoke-interface {p0}, LG6/a$a;->a()LG6/a;

    move-result-object p0

    invoke-interface {p0}, LG6/a;->a()LG6/G;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b(Ljava/lang/String;)LG6/O;
.end method

.method public abstract c()LG6/G$a;
.end method

.method public abstract d()Lgg/s;
.end method

.method public varargs abstract e(LQ6/g;[LQ6/d;)Lgg/s;
.end method
