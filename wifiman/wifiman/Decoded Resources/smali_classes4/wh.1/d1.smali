.class Lwh/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lwh/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/d1;

    invoke-direct {v0}, Lwh/d1;-><init>()V

    sput-object v0, Lwh/d1;->a:Lwh/d1;

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

    check-cast p1, LBh/s0;

    invoke-static {p1}, Lwh/e1;->b(LBh/s0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
