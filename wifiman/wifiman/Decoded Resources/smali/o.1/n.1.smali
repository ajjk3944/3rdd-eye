.class public abstract Lo/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/z;-><init>(I)V

    sput-object v0, Lo/n;->a:Lo/z;

    return-void
.end method

.method public static final a()Lo/m;
    .locals 2

    sget-object v0, Lo/n;->a:Lo/z;

    const-string v1, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b()Lo/z;
    .locals 4

    new-instance v0, Lo/z;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/z;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final c(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Lo/z;
    .locals 4

    new-instance v0, Lo/z;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/z;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p0, p1}, Lo/z;->t(ILjava/lang/Object;)V

    invoke-virtual {v0, p2, p3}, Lo/z;->t(ILjava/lang/Object;)V

    invoke-virtual {v0, p4, p5}, Lo/z;->t(ILjava/lang/Object;)V

    return-object v0
.end method
