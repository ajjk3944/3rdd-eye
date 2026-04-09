.class Lli/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lli/W;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/W;

    invoke-direct {v0}, Lli/W;-><init>()V

    sput-object v0, Lli/W;->a:Lli/W;

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

    check-cast p1, LUh/q;

    invoke-static {p1}, Lli/X;->e(LUh/q;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
