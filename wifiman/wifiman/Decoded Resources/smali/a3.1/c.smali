.class public abstract La3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(Ljava/lang/Object;)La3/c;
    .locals 7

    new-instance v6, La3/a;

    sget-object v3, La3/e;->DEFAULT:La3/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, v6

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, La3/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;La3/e;La3/f;La3/d;)V

    return-object v6
.end method

.method public static g(Ljava/lang/Object;)La3/c;
    .locals 7

    new-instance v6, La3/a;

    sget-object v3, La3/e;->HIGHEST:La3/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, v6

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, La3/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;La3/e;La3/f;La3/d;)V

    return-object v6
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()La3/d;
.end method

.method public abstract c()Ljava/lang/Object;
.end method

.method public abstract d()La3/e;
.end method

.method public abstract e()La3/f;
.end method
