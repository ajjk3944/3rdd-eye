.class Lwh/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lwh/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/b0;

    invoke-direct {v0}, Lwh/b0;-><init>()V

    sput-object v0, Lwh/b0;->a:Lwh/b0;

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

    invoke-static {p1}, Lwh/d0;->k(LBh/Y;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
