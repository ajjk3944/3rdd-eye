.class Lsi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lsi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsi/b;

    invoke-direct {v0}, Lsi/b;-><init>()V

    sput-object v0, Lsi/b;->a:Lsi/b;

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

    check-cast p1, Lpi/M0;

    invoke-static {p1}, Lsi/d;->b(Lpi/M0;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
