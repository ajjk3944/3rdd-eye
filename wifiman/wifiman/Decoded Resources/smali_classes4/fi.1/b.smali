.class Lfi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lfi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfi/b;

    invoke-direct {v0}, Lfi/b;-><init>()V

    sput-object v0, Lfi/b;->a:Lfi/b;

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

    invoke-static {p1}, Lfi/e;->c(LBh/m;)LBh/m;

    move-result-object p1

    return-object p1
.end method
