.class LRh/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LRh/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LRh/Z;

    invoke-direct {v0}, LRh/Z;-><init>()V

    sput-object v0, LRh/Z;->a:LRh/Z;

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

    check-cast p1, LBh/b;

    invoke-static {p1}, LRh/e0;->a(LBh/b;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
