.class abstract LP6/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP6/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LP6/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP6/z;

    invoke-direct {v0}, LP6/z;-><init>()V

    sput-object v0, LP6/z$a;->a:LP6/z;

    return-void
.end method

.method static synthetic a()LP6/z;
    .locals 1

    sget-object v0, LP6/z$a;->a:LP6/z;

    return-object v0
.end method
