.class Lxh/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lxh/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxh/m;

    invoke-direct {v0}, Lxh/m;-><init>()V

    sput-object v0, Lxh/m;->a:Lxh/m;

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

    check-cast p1, LBh/e;

    invoke-static {p1}, Lxh/n;->c(LBh/e;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
