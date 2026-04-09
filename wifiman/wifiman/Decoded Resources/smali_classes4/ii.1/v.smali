.class Lii/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lii/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lii/v;

    invoke-direct {v0}, Lii/v;-><init>()V

    sput-object v0, Lii/v;->a:Lii/v;

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

    check-cast p1, LBh/Y;

    invoke-static {p1}, Lii/x;->k(LBh/Y;)LBh/a;

    move-result-object p1

    return-object p1
.end method
