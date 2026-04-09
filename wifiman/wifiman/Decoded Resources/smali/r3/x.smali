.class abstract Lr3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:[Lr3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lr3/u;

    sget-object v1, Lr3/y;->c:Lr3/w;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lr3/y;->d:Lr3/w;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lr3/x;->a:[Lr3/u;

    return-void
.end method
