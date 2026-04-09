.class abstract LK6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LK6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK6/b;

    invoke-direct {v0}, LK6/b;-><init>()V

    sput-object v0, LK6/b$a;->a:LK6/b;

    return-void
.end method

.method static synthetic a()LK6/b;
    .locals 1

    sget-object v0, LK6/b$a;->a:LK6/b;

    return-object v0
.end method
