.class public final Lpi/u0$c$c;
.super Lpi/u0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/u0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lpi/u0$c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/u0$c$c;

    invoke-direct {v0}, Lpi/u0$c$c;-><init>()V

    sput-object v0, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lpi/u0$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lpi/u0;Lri/i;)Lri/j;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lpi/u0$c$c;->b(Lpi/u0;Lri/i;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Lri/j;

    return-object p1
.end method

.method public b(Lpi/u0;Lri/i;)Ljava/lang/Void;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Should not be called"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
