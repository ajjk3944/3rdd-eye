.class public abstract Lo/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/E;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/E;-><init>(I)V

    sput-object v0, Lo/L;->a:Lo/E;

    return-void
.end method

.method public static final a()Lo/K;
    .locals 2

    sget-object v0, Lo/L;->a:Lo/E;

    const-string v1, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b()Lo/E;
    .locals 4

    new-instance v0, Lo/E;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/E;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
