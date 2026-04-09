.class public abstract LSh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LBh/G;LBh/L;Loi/n;LSh/v;LYh/e;)LSh/h;
    .locals 1

    const-string v0, "module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSh/h;

    invoke-direct {v0, p0, p1, p2, p3}, LSh/h;-><init>(LBh/G;LBh/L;Loi/n;LSh/v;)V

    invoke-virtual {v0, p4}, LSh/h;->S(LYh/e;)V

    return-object v0
.end method
