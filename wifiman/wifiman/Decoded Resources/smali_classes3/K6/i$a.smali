.class abstract LK6/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LK6/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK6/i;

    invoke-direct {v0}, LK6/i;-><init>()V

    sput-object v0, LK6/i$a;->a:LK6/i;

    return-void
.end method

.method static synthetic a()LK6/i;
    .locals 1

    sget-object v0, LK6/i$a;->a:LK6/i;

    return-object v0
.end method
