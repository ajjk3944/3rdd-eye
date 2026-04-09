.class LBh/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LBh/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBh/n0;

    invoke-direct {v0}, LBh/n0;-><init>()V

    sput-object v0, LBh/n0;->a:LBh/n0;

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

    check-cast p1, LBh/m;

    invoke-static {p1}, LBh/p0;->b(LBh/m;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
