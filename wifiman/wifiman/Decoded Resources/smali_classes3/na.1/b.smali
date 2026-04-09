.class public abstract Lna/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LN/F0;
    .locals 4

    new-instance v0, LN/F0;

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LE/h;->d(F)LE/g;

    move-result-object v1

    const/16 v2, 0xa

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v2}, LE/h;->d(F)LE/g;

    move-result-object v2

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v3}, LE/h;->d(F)LE/g;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, LN/F0;-><init>(LE/a;LE/a;LE/a;)V

    return-object v0
.end method
