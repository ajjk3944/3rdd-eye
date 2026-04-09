.class public final Lr/T$b;
.super Lr/U;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lr/U;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;I)Lr/T$a;
    .locals 7

    new-instance v6, Lr/T$a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lr/T$a;-><init>(Ljava/lang/Object;Lr/E;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lr/U;->c()Lo/z;

    move-result-object p1

    invoke-virtual {p1, p2, v6}, Lo/z;->t(ILjava/lang/Object;)V

    return-object v6
.end method
