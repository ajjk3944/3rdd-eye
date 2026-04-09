.class abstract LG6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LG6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG6/g;

    invoke-direct {v0}, LG6/g;-><init>()V

    sput-object v0, LG6/g$a;->a:LG6/g;

    return-void
.end method

.method static synthetic a()LG6/g;
    .locals 1

    sget-object v0, LG6/g$a;->a:LG6/g;

    return-object v0
.end method
