.class Lui/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lui/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lui/r;

    invoke-direct {v0}, Lui/r;-><init>()V

    sput-object v0, Lui/r;->a:Lui/r;

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

    check-cast p1, LBh/z;

    invoke-static {p1}, Lui/s;->e(LBh/z;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
