.class public abstract Lo/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/G;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/G;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/G;-><init>(I)V

    sput-object v0, Lo/P;->a:Lo/G;

    return-void
.end method

.method public static final a()Lo/G;
    .locals 4

    new-instance v0, Lo/G;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/G;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
