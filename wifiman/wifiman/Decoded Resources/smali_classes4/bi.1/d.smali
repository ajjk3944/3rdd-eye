.class Lbi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# static fields
.field public static final a:Lbi/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbi/d;

    invoke-direct {v0}, Lbi/d;-><init>()V

    sput-object v0, Lbi/d;->a:Lbi/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/m;

    check-cast p2, LBh/m;

    invoke-static {p1, p2}, Lbi/g;->b(LBh/m;LBh/m;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
