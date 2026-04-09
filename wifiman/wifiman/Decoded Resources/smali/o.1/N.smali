.class public abstract Lo/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/Object;

.field private static final b:Lo/M;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    sput-object v1, Lo/N;->a:[Ljava/lang/Object;

    new-instance v1, Lo/F;

    invoke-direct {v1, v0}, Lo/F;-><init>(I)V

    sput-object v1, Lo/N;->b:Lo/M;

    return-void
.end method

.method public static final synthetic a()[Ljava/lang/Object;
    .locals 1

    sget-object v0, Lo/N;->a:[Ljava/lang/Object;

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;)Lo/F;
    .locals 2

    new-instance v0, Lo/F;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/F;-><init>(I)V

    invoke-virtual {v0, p0}, Lo/F;->g(Ljava/lang/Object;)Z

    return-object v0
.end method
