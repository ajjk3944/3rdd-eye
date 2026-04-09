.class abstract LG6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LG6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG6/c;

    invoke-direct {v0}, LG6/c;-><init>()V

    sput-object v0, LG6/c$a;->a:LG6/c;

    return-void
.end method

.method static synthetic a()LG6/c;
    .locals 1

    sget-object v0, LG6/c$a;->a:LG6/c;

    return-object v0
.end method
