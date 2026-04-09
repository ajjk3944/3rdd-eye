.class public abstract Lo/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/w;

.field private static final b:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/w;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/w;-><init>(I)V

    sput-object v0, Lo/g;->a:Lo/w;

    new-array v0, v1, [F

    sput-object v0, Lo/g;->b:[F

    return-void
.end method

.method public static final a()[F
    .locals 1

    sget-object v0, Lo/g;->b:[F

    return-object v0
.end method
