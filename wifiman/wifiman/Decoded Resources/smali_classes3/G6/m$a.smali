.class abstract LG6/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LG6/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG6/m;

    invoke-direct {v0}, LG6/m;-><init>()V

    sput-object v0, LG6/m$a;->a:LG6/m;

    return-void
.end method

.method static synthetic a()LG6/m;
    .locals 1

    sget-object v0, LG6/m$a;->a:LG6/m;

    return-object v0
.end method
