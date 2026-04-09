.class Lpi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lpi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/i;

    invoke-direct {v0}, Lpi/i;-><init>()V

    sput-object v0, Lpi/i;->a:Lpi/i;

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

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lpi/p;->j(Z)Lpi/p$b;

    move-result-object p1

    return-object p1
.end method
