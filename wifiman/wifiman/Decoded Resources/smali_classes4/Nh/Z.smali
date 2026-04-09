.class LNh/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LNh/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNh/Z;

    invoke-direct {v0}, LNh/Z;-><init>()V

    sput-object v0, LNh/Z;->a:LNh/Z;

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

    check-cast p1, Lpi/S;

    invoke-static {p1}, LNh/a0;->k0(Lpi/S;)LBh/e;

    move-result-object p1

    return-object p1
.end method
