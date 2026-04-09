.class abstract Lk3/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lk3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk3/j;

    invoke-direct {v0}, Lk3/j;-><init>()V

    sput-object v0, Lk3/j$a;->a:Lk3/j;

    return-void
.end method

.method static synthetic a()Lk3/j;
    .locals 1

    sget-object v0, Lk3/j$a;->a:Lk3/j;

    return-object v0
.end method
