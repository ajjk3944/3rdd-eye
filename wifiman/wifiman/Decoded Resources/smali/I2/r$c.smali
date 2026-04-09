.class LI2/r$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;LE1/e;)LI2/q;
    .locals 1

    new-instance v0, LI2/q;

    invoke-direct {v0, p1, p2}, LI2/q;-><init>(Ljava/util/List;LE1/e;)V

    return-object v0
.end method
