.class public abstract Lcj/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcj/e;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lcj/c;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v2

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v3

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcj/c;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V

    sput-object v7, Lcj/j;->a:Lcj/e;

    return-void
.end method

.method public static final a()Lcj/e;
    .locals 1

    sget-object v0, Lcj/j;->a:Lcj/e;

    return-object v0
.end method
