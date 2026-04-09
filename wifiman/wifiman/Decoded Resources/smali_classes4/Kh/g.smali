.class LKh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# static fields
.field public static final a:LKh/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LKh/g;

    invoke-direct {v0}, LKh/g;-><init>()V

    sput-object v0, LKh/g;->a:LKh/g;

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

    invoke-static {}, LKh/h;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
