.class public abstract LQ0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;)LQ0/k$b;
    .locals 9

    new-instance v8, LQ0/m;

    new-instance v1, LQ0/a;

    invoke-direct {v1, p0}, LQ0/a;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, LQ0/d;->a(Landroid/content/Context;)LQ0/c;

    move-result-object v2

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LQ0/m;-><init>(LQ0/G;LQ0/H;LQ0/T;LQ0/r;LQ0/F;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method
