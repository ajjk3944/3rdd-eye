.class abstract LK6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LK6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK6/e;

    invoke-direct {v0}, LK6/e;-><init>()V

    sput-object v0, LK6/e$a;->a:LK6/e;

    return-void
.end method

.method static synthetic a()LK6/e;
    .locals 1

    sget-object v0, LK6/e$a;->a:LK6/e;

    return-object v0
.end method
