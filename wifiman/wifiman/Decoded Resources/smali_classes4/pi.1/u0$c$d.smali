.class public final Lpi/u0$c$d;
.super Lpi/u0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/u0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Lpi/u0$c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/u0$c$d;

    invoke-direct {v0}, Lpi/u0$c$d;-><init>()V

    sput-object v0, Lpi/u0$c$d;->a:Lpi/u0$c$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lpi/u0$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(Lpi/u0;Lri/i;)Lri/j;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object p1

    invoke-interface {p1, p2}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object p1

    return-object p1
.end method
