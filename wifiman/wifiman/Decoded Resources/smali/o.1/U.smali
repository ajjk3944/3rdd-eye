.class public abstract Lo/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/I;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/I;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/I;-><init>(I)V

    sput-object v0, Lo/U;->a:Lo/I;

    return-void
.end method

.method public static final a()Lo/I;
    .locals 4

    new-instance v0, Lo/I;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;Ljava/lang/Object;)Lo/I;
    .locals 2

    new-instance v0, Lo/I;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo/I;-><init>(I)V

    invoke-virtual {v0, p0}, Lo/I;->v(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lo/I;->v(Ljava/lang/Object;)V

    return-object v0
.end method
