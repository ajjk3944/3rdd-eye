.class public final LF3/g0;
.super LF3/F;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    new-instance v0, LF3/T;

    new-instance v1, LA5/k;

    invoke-direct {v1, p1}, LA5/k;-><init>(Landroid/content/Context;)V

    new-instance v2, LF3/P;

    const-string v3, "shared-remote-config"

    invoke-static {v3}, LF3/O;->d(Ljava/lang/String;)LF3/N;

    move-result-object v4

    invoke-virtual {v4}, LF3/N;->c()LF3/O;

    move-result-object v4

    invoke-direct {v2, p1, v4}, LF3/P;-><init>(Landroid/content/Context;LF3/O;)V

    invoke-direct {v0, p1, v1, v2, v3}, LF3/T;-><init>(Landroid/content/Context;LA5/k;LF3/M;Ljava/lang/String;)V

    invoke-direct {p0, v0}, LF3/F;-><init>(LF3/T;)V

    return-void
.end method
