.class public abstract Lb3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lb3/n;
    .locals 1

    new-instance v0, Lb3/d;

    invoke-direct {v0, p0}, Lb3/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()LZ4/a;
    .locals 2

    new-instance v0, Lb5/d;

    invoke-direct {v0}, Lb5/d;-><init>()V

    sget-object v1, Lb3/b;->a:La5/a;

    invoke-virtual {v0, v1}, Lb5/d;->j(La5/a;)Lb5/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lb5/d;->k(Z)Lb5/d;

    move-result-object v0

    invoke-virtual {v0}, Lb5/d;->i()LZ4/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
.end method
