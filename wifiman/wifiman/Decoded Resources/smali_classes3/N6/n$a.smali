.class abstract LN6/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN6/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LN6/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN6/n;

    invoke-direct {v0}, LN6/n;-><init>()V

    sput-object v0, LN6/n$a;->a:LN6/n;

    return-void
.end method

.method static synthetic a()LN6/n;
    .locals 1

    sget-object v0, LN6/n$a;->a:LN6/n;

    return-object v0
.end method
