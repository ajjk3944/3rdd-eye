.class abstract LK6/U$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LK6/U;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK6/U;

    invoke-direct {v0}, LK6/U;-><init>()V

    sput-object v0, LK6/U$a;->a:LK6/U;

    return-void
.end method

.method static synthetic a()LK6/U;
    .locals 1

    sget-object v0, LK6/U$a;->a:LK6/U;

    return-object v0
.end method
