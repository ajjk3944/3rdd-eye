.class public LF3/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF3/T;


# direct methods
.method protected constructor <init>(LF3/T;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF3/F;->a:LF3/T;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 2
    new-instance v0, LF3/T;

    new-instance v1, LA5/k;

    invoke-direct {v1, p1}, LA5/k;-><init>(Landroid/content/Context;)V

    new-instance v2, LF3/P;

    .line 3
    const-string v3, "shared-installation-id"

    invoke-static {v3}, LF3/O;->d(Ljava/lang/String;)LF3/N;

    move-result-object v4

    invoke-virtual {v4}, LF3/N;->c()LF3/O;

    move-result-object v4

    invoke-direct {v2, p1, v4}, LF3/P;-><init>(Landroid/content/Context;LF3/O;)V

    invoke-direct {v0, p1, v1, v2, v3}, LF3/T;-><init>(Landroid/content/Context;LA5/k;LF3/M;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LF3/F;->a:LF3/T;

    return-void
.end method
