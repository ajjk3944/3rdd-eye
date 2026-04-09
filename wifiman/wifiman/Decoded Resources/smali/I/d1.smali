.class public abstract LI/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Set;

.field private static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lt/a;->b:Lt/a$a;

    invoke-virtual {v0}, Lt/a$a;->b()Lt/a;

    move-result-object v1

    invoke-static {v1}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, LI/d1;->a:Ljava/util/Set;

    invoke-virtual {v0}, Lt/a$a;->a()Lt/a;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LI/d1;->b:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic a()Ljava/util/Set;
    .locals 1

    sget-object v0, LI/d1;->a:Ljava/util/Set;

    return-object v0
.end method
