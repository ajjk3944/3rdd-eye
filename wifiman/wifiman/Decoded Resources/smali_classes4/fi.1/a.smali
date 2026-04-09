.class Lfi/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/b$c;


# static fields
.field public static final a:Lfi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfi/a;

    invoke-direct {v0}, Lfi/a;-><init>()V

    sput-object v0, Lfi/a;->a:Lfi/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, LBh/s0;

    invoke-static {p1}, Lfi/e;->b(LBh/s0;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
