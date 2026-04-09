.class LBh/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LBh/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBh/o0;

    invoke-direct {v0}, LBh/o0;-><init>()V

    sput-object v0, LBh/o0;->a:LBh/o0;

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

    invoke-static {p1}, LBh/p0;->c(LBh/m;)Lzi/j;

    move-result-object p1

    return-object p1
.end method
