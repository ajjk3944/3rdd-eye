.class public abstract LAh/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LZh/f;

.field private static final b:LZh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "getFirst"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LAh/v;->a:LZh/f;

    const-string v0, "getLast"

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LAh/v;->b:LZh/f;

    return-void
.end method

.method public static final synthetic a()LZh/f;
    .locals 1

    sget-object v0, LAh/v;->a:LZh/f;

    return-object v0
.end method

.method public static final synthetic b()LZh/f;
    .locals 1

    sget-object v0, LAh/v;->b:LZh/f;

    return-object v0
.end method
