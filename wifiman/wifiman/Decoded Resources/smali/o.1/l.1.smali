.class public abstract Lo/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/y;-><init>(I)V

    sput-object v0, Lo/l;->a:Lo/k;

    return-void
.end method

.method public static final varargs a([I)Lo/k;
    .locals 2

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo/y;

    array-length v1, p0

    invoke-direct {v0, v1}, Lo/y;-><init>(I)V

    invoke-virtual {v0, p0}, Lo/y;->k([I)V

    return-object v0
.end method
