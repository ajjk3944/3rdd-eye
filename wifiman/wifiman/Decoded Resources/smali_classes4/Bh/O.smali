.class LBh/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LBh/O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBh/O;

    invoke-direct {v0}, LBh/O;-><init>()V

    sput-object v0, LBh/O;->a:LBh/O;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/M;

    invoke-static {p1}, LBh/Q;->d(LBh/M;)LZh/c;

    move-result-object p1

    return-object p1
.end method
