.class LKh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LKh/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LKh/e;

    invoke-direct {v0}, LKh/e;-><init>()V

    sput-object v0, LKh/e;->a:LKh/e;

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

    check-cast p1, LBh/G;

    invoke-static {p1}, LKh/f;->a(LBh/G;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
