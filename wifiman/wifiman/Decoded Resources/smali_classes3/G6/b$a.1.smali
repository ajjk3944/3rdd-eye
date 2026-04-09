.class abstract LG6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LG6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG6/b;

    invoke-direct {v0}, LG6/b;-><init>()V

    sput-object v0, LG6/b$a;->a:LG6/b;

    return-void
.end method

.method static synthetic a()LG6/b;
    .locals 1

    sget-object v0, LG6/b$a;->a:LG6/b;

    return-object v0
.end method
