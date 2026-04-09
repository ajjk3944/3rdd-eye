.class public abstract Lo7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lo7/n$a;->a:Lo7/n$a;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lo7/n;->a:LYg/m;

    return-void
.end method

.method public static final synthetic a()Lgg/y;
    .locals 1

    invoke-static {}, Lo7/n;->b()Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Lgg/y;
    .locals 1

    sget-object v0, Lo7/n;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/y;

    return-object v0
.end method
