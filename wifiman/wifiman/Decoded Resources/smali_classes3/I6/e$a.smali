.class abstract LI6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LI6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI6/e;

    invoke-direct {v0}, LI6/e;-><init>()V

    sput-object v0, LI6/e$a;->a:LI6/e;

    return-void
.end method

.method static synthetic a()LI6/e;
    .locals 1

    sget-object v0, LI6/e$a;->a:LI6/e;

    return-object v0
.end method
