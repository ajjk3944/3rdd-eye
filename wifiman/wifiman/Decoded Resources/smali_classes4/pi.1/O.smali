.class Lpi/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lpi/O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/O;

    invoke-direct {v0}, Lpi/O;-><init>()V

    sput-object v0, Lpi/O;->a:Lpi/O;

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

    check-cast p1, Lpi/S;

    invoke-static {p1}, Lpi/Q;->g(Lpi/S;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
