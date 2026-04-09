.class abstract LG6/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LG6/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG6/j;

    invoke-direct {v0}, LG6/j;-><init>()V

    sput-object v0, LG6/j$a;->a:LG6/j;

    return-void
.end method

.method static synthetic a()LG6/j;
    .locals 1

    sget-object v0, LG6/j$a;->a:LG6/j;

    return-object v0
.end method
