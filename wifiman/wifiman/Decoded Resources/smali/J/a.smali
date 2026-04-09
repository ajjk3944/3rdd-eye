.class public abstract LJ/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI/o1;LJ/j;LI/l1;Z)LJ/f;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ls/K;->d(IILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LJ/g;

    invoke-direct {v0, p0, p1, p2, p3}, LJ/g;-><init>(LI/o1;LJ/j;LI/l1;Z)V

    goto :goto_0

    :cond_0
    new-instance v0, LJ/a$a;

    invoke-direct {v0}, LJ/a$a;-><init>()V

    :goto_0
    return-object v0
.end method
