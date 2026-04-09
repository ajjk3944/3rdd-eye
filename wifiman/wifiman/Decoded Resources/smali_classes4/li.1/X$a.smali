.class final synthetic Lli/X$a;
.super Lkotlin/jvm/internal/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lli/X;->y(Lli/X;LUh/q;I)LBh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final b:Lli/X$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/X$a;

    invoke-direct {v0}, Lli/X$a;-><init>()V

    sput-object v0, Lli/X$a;->b:Lli/X$a;

    return-void
.end method

.method synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/jvm/internal/E;-><init>()V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZh/b;

    invoke-virtual {p1}, LZh/b;->e()LZh/b;

    move-result-object p1

    return-object p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "outerClassId"

    return-object v0
.end method

.method public getOwner()Lth/f;
    .locals 1

    const-class v0, LZh/b;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;"

    return-object v0
.end method
