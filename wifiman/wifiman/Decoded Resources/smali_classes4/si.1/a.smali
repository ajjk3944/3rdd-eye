.class Lsi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lsi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsi/a;

    invoke-direct {v0}, Lsi/a;-><init>()V

    sput-object v0, Lsi/a;->a:Lsi/a;

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

    invoke-static {p1}, Lsi/d;->a(Lpi/M0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
