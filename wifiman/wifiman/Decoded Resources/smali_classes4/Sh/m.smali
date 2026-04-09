.class LSh/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# static fields
.field public static final a:LSh/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSh/m;

    invoke-direct {v0}, LSh/m;-><init>()V

    sput-object v0, LSh/m;->a:LSh/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LSh/n;->b()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
