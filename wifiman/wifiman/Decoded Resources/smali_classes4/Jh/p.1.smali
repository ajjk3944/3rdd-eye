.class LJh/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LJh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh/p;

    invoke-direct {v0}, LJh/p;-><init>()V

    sput-object v0, LJh/p;->a:LJh/p;

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

    check-cast p1, LBh/s0;

    invoke-static {p1}, LJh/q;->c(LBh/s0;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
