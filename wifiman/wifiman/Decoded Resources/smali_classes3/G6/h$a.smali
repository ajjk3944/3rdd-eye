.class abstract LG6/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LG6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG6/h;

    invoke-direct {v0}, LG6/h;-><init>()V

    sput-object v0, LG6/h$a;->a:LG6/h;

    return-void
.end method

.method static synthetic a()LG6/h;
    .locals 1

    sget-object v0, LG6/h$a;->a:LG6/h;

    return-object v0
.end method
