.class LAh/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/b$c;


# static fields
.field public static final a:LAh/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAh/r;

    invoke-direct {v0}, LAh/r;-><init>()V

    sput-object v0, LAh/r;->a:LAh/r;

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

    check-cast p1, LBh/b;

    invoke-static {p1}, LAh/u;->l(LBh/b;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
