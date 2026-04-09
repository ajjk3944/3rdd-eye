.class abstract LP6/J$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP6/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LP6/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP6/J;

    invoke-direct {v0}, LP6/J;-><init>()V

    sput-object v0, LP6/J$a;->a:LP6/J;

    return-void
.end method

.method static synthetic a()LP6/J;
    .locals 1

    sget-object v0, LP6/J$a;->a:LP6/J;

    return-object v0
.end method
